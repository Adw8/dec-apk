package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* renamed from: en5  reason: default package */
/* loaded from: classes.dex */
public abstract class en5 extends ftS {
    public VelocityTracker R;

    /* renamed from: R  reason: collision with other field name */
    public OverScroller f3198R;

    /* renamed from: R  reason: collision with other field name */
    public dX f3199R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3200R;
    public int c;
    public int v = -1;
    public int e = -1;

    public en5() {
    }

    public final void K(CoordinatorLayout coordinatorLayout, View view, int i) {
        o(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // defpackage.knf
    public final boolean L(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int findPointerIndex;
        if (this.e < 0) {
            this.e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f3200R) {
            int i = this.v;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.c) > this.e) {
                this.c = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.v = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f2224R;
            boolean z = (weakReference == null || ((view2 = (View) weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1))) && coordinatorLayout.P(view, x, y2);
            this.f3200R = z;
            if (z) {
                this.c = y2;
                this.v = motionEvent.getPointerId(0);
                if (this.R == null) {
                    this.R = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f3198R;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f3198R.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public abstract int V();

    public abstract int o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // defpackage.knf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean y(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en5.y(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public en5(int i) {
        super(0);
    }
}
