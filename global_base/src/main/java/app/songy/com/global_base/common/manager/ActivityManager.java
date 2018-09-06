package app.songy.com.global_base.common.manager;

import android.app.Activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *Description: activity  堆栈管理
 *creator: song
 *Date: 2018/6/7 上午10:19
 */
public class ActivityManager {

    private static final String TAG = "Activity";
    private static final List<Activity> ACTIVITIES = Collections.synchronizedList(new ArrayList<Activity>());

    public static void create(Activity activity) {
        ACTIVITIES.add(activity);
    }

    public static void destroy(Activity activity) {
        ACTIVITIES.remove(activity);
    }

    public static void resume(Activity activity) {

    }

    public static void pause(Activity activity) {

    }

    public static void finishAll() {
        for (Activity activity : ACTIVITIES) {
            activity.finish();
        }
    }
    public static void finishOther(Activity currentActivity) {
        for (Activity activity : ACTIVITIES) {
            if (activity != currentActivity) {
                activity.finish();
            }
        }
    }

    public static Activity last() {
        int size = ACTIVITIES.size();
        if (size >= 1) {
            return ACTIVITIES.get(size - 1);
        }
        return null;
    }

    public static int size() {
        return ACTIVITIES.size();
    }

    public static List<Activity> getActivities(){
        return ACTIVITIES;
    }



}
