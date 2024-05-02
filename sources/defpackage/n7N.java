package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;

/* renamed from: n7N  reason: default package */
/* loaded from: classes.dex */
public abstract class n7N extends ftS {
    public int c;
    public final Rect R = new Rect();

    /* renamed from: v  reason: collision with other field name */
    public final Rect f6312v = new Rect();
    public int v = 0;

    public n7N() {
    }

    public final int V(View view) {
        int i;
        if (this.c == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            knf knf = ((aRL) appBarLayout.getLayoutParams()).f880R;
            int V = knf instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) knf).V() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + V > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = 1.0f + (((float) V) / ((float) i));
            }
        }
        int i2 = this.c;
        return iTI.X((int) (f * ((float) i2)), 0, i2);
    }

    @Override // defpackage.ftS
    public final void i(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout o = AppBarLayout.ScrollingViewBehavior.o(coordinatorLayout.x(view));
        if (o != null) {
            aRL arl = (aRL) view.getLayoutParams();
            Rect rect = this.R;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) arl).leftMargin, o.getBottom() + ((ViewGroup.MarginLayoutParams) arl).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) arl).rightMargin, ((o.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) arl).bottomMargin);
            gWM lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap weakHashMap = of5.f6887R;
                if (mHC.v(coordinatorLayout) && !mHC.v(view)) {
                    rect.left = lastWindowInsets.e() + rect.left;
                    rect.right -= lastWindowInsets.X();
                }
            }
            Rect rect2 = this.f6312v;
            int i2 = arl.R;
            if (i2 == 0) {
                i2 = 8388659;
            }
            gGP.v(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int V = V(o);
            view.layout(rect2.left, rect2.top - V, rect2.right, rect2.bottom - V);
            this.v = rect2.top - o.getBottom();
            return;
        }
        coordinatorLayout.g(view, i);
        this.v = 0;
    }

    @Override // defpackage.knf
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout o;
        gWM lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (o = AppBarLayout.ScrollingViewBehavior.o(coordinatorLayout.x(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = of5.f6887R;
            if (mHC.v(o) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.c() + lastWindowInsets.O();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = o.getTotalScrollRange() + size;
        int measuredHeight = o.getMeasuredHeight();
        view.setTranslationY(0.0f);
        coordinatorLayout.y(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange - measuredHeight, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    public n7N(int i) {
        super(0);
    }
}
