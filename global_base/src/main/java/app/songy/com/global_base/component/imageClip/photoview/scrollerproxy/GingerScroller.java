package app.songy.com.global_base.component.imageClip.photoview.scrollerproxy;



import android.annotation.TargetApi;
import android.content.Context;
import android.widget.OverScroller;
/**
 * Description:
 * Created by song on 2018/6/12.
 * email：bjay20080613@qq.com
 */
@TargetApi(9)
public class GingerScroller extends ScrollerProxy {
    protected OverScroller mScroller;
    private boolean mFirstScroll = false;

    public GingerScroller(Context context) {
        this.mScroller = new OverScroller(context);
    }

    public boolean computeScrollOffset() {
        if(this.mFirstScroll) {
            this.mScroller.computeScrollOffset();
            this.mFirstScroll = false;
        }

        return this.mScroller.computeScrollOffset();
    }

    public void fling(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY, int overX, int overY) {
        this.mScroller.fling(startX, startY, velocityX, velocityY, minX, maxX, minY, maxY, overX, overY);
    }

    public void forceFinished(boolean finished) {
        this.mScroller.forceFinished(finished);
    }

    public boolean isFinished() {
        return this.mScroller.isFinished();
    }

    public int getCurrX() {
        return this.mScroller.getCurrX();
    }

    public int getCurrY() {
        return this.mScroller.getCurrY();
    }
}
