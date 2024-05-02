package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements kP9, eRL, b1z {
    public static final int[] R = {R.attr.actionBarSize, 16842841};
    public int L;
    public int O;

    /* renamed from: R  reason: collision with other field name */
    public ZG f1066R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f1068R;

    /* renamed from: R  reason: collision with other field name */
    public ViewPropertyAnimator f1069R;

    /* renamed from: R  reason: collision with other field name */
    public OverScroller f1070R;

    /* renamed from: R  reason: collision with other field name */
    public ActionBarContainer f1071R;

    /* renamed from: R  reason: collision with other field name */
    public ContentFrameLayout f1072R;

    /* renamed from: R  reason: collision with other field name */
    public elR f1074R;

    /* renamed from: R  reason: collision with other field name */
    public gWM f1075R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1076R;

    /* renamed from: X  reason: collision with other field name */
    public boolean f1077X;

    /* renamed from: c  reason: collision with other field name */
    public gWM f1078c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1079c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public gWM f1080e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f1081e;

    /* renamed from: v  reason: collision with other field name */
    public gWM f1083v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1084v;
    public int X = 0;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f1067R = new Rect();

    /* renamed from: v  reason: collision with other field name */
    public final Rect f1082v = new Rect();
    public final Rect c = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public final XM f1065R = new XM(0, this);

    /* renamed from: R  reason: collision with other field name */
    public final Cf f1064R = new Cf(this, 0);
    public final Cf v = new Cf(this, 1);

    /* renamed from: R  reason: collision with other field name */
    public final c_x f1073R = new c_x();

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        gWM gwm = gWM.R;
        this.f1075R = gwm;
        this.f1083v = gwm;
        this.f1078c = gwm;
        this.f1080e = gwm;
        x(context);
    }

    public static boolean L(FrameLayout frameLayout, Rect rect, boolean z) {
        boolean z2;
        int i;
        Np np = (Np) frameLayout.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) np).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) np).leftMargin = i3;
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) np).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) np).topMargin = i5;
            z2 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) np).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) np).rightMargin = i7;
            z2 = true;
        }
        if (!z || ((ViewGroup.MarginLayoutParams) np).bottomMargin == (i = rect.bottom)) {
            return z2;
        }
        ((ViewGroup.MarginLayoutParams) np).bottomMargin = i;
        return true;
    }

    public final void C(lRG lrg, i6 i6Var) {
        U();
        muY muy = (muY) this.f1074R;
        if (muy.f6225R == null) {
            muy.f6225R = new RR(muy.f6229R.getContext());
        }
        RR rr = muy.f6225R;
        rr.f491R = i6Var;
        Toolbar toolbar = muy.f6229R;
        if (lrg != null || toolbar.f1163R != null) {
            toolbar.X();
            lRG lrg2 = toolbar.f1163R.f1088R;
            if (lrg2 != lrg) {
                if (lrg2 != null) {
                    lrg2.y(toolbar.f1157R);
                    lrg2.y(toolbar.f1167R);
                }
                if (toolbar.f1167R == null) {
                    toolbar.f1167R = new hLU(toolbar);
                }
                rr.f493e = true;
                if (lrg != null) {
                    lrg.v(rr, toolbar.f1159R);
                    lrg.v(toolbar.f1167R, toolbar.f1159R);
                } else {
                    rr.O(toolbar.f1159R, null);
                    toolbar.f1167R.O(toolbar.f1159R, null);
                    rr.m();
                    toolbar.f1167R.m();
                }
                toolbar.f1163R.setPopupTheme(toolbar.e);
                toolbar.f1163R.setPresenter(rr);
                toolbar.f1157R = rr;
            }
        }
    }

    public final void H(int i) {
        U();
        if (i == 2) {
            ((muY) this.f1074R).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((muY) this.f1074R).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    @Override // defpackage.eRL
    public final boolean O(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.eRL
    public final void R(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final void U() {
        elR elr;
        if (this.f1072R == null) {
            this.f1072R = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1071R = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof elR) {
                elr = (elR) findViewById;
            } else if (findViewById instanceof Toolbar) {
                elr = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder U = opT.U("Can't make a decor toolbar out of ");
                U.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(U.toString());
            }
            this.f1074R = elr;
        }
    }

    @Override // defpackage.eRL
    public final void X(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void Z() {
        removeCallbacks(this.f1064R);
        removeCallbacks(this.v);
        ViewPropertyAnimator viewPropertyAnimator = this.f1069R;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.eRL
    public final void c(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Np;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1068R != null && !this.f1076R) {
            if (this.f1071R.getVisibility() == 0) {
                i = (int) (this.f1071R.getTranslationY() + ((float) this.f1071R.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.f1068R.setBounds(0, i, getWidth(), this.f1068R.getIntrinsicHeight() + i);
            this.f1068R.draw(canvas);
        }
    }

    @Override // defpackage.b1z
    public final void e(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        R(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new Np();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new Np(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1071R;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c_x c_x = this.f1073R;
        return c_x.X | c_x.e;
    }

    public CharSequence getTitle() {
        U();
        return ((muY) this.f1074R).f6229R.getTitle();
    }

    public final boolean m() {
        U();
        ActionMenuView actionMenuView = ((muY) this.f1074R).f6229R.f1163R;
        if (actionMenuView != null) {
            RR rr = actionMenuView.R;
            if (rr != null && rr.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        U();
        gWM Z = gWM.Z(this, windowInsets);
        boolean L = L(this.f1071R, new Rect(Z.e(), Z.O(), Z.X(), Z.c()), false);
        Rect rect = this.f1067R;
        WeakHashMap weakHashMap = of5.f6887R;
        m18.v(this, Z, rect);
        Rect rect2 = this.f1067R;
        gWM x = Z.f3779R.x(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f1075R = x;
        L = true;
        if (!this.f1083v.equals(x)) {
            this.f1083v = this.f1075R;
            L = true;
        }
        if (!this.f1082v.equals(this.f1067R)) {
            this.f1082v.set(this.f1067R);
        }
        if (L) {
            requestLayout();
        }
        return Z.f3779R.R().f3779R.c().f3779R.v().L();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x(getContext());
        WeakHashMap weakHashMap = of5.f6887R;
        fv7.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                Np np = (Np) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) np).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) np).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        U();
        measureChildWithMargins(this.f1071R, i, 0, i2, 0);
        Np np = (Np) this.f1071R.getLayoutParams();
        int max = Math.max(0, this.f1071R.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) np).leftMargin + ((ViewGroup.MarginLayoutParams) np).rightMargin);
        int max2 = Math.max(0, this.f1071R.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) np).topMargin + ((ViewGroup.MarginLayoutParams) np).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1071R.getMeasuredState());
        WeakHashMap weakHashMap = of5.f6887R;
        boolean z = (mHC.L(this) & 256) != 0;
        if (z) {
            i3 = this.e;
            if (this.f1079c && this.f1071R.getTabContainer() != null) {
                i3 += this.e;
            }
        } else {
            i3 = this.f1071R.getVisibility() != 8 ? this.f1071R.getMeasuredHeight() : 0;
        }
        this.c.set(this.f1067R);
        gWM gwm = this.f1075R;
        this.f1078c = gwm;
        if (this.f1084v || z) {
            ojk v = ojk.v(gwm.e(), this.f1078c.O() + i3, this.f1078c.X(), this.f1078c.c() + 0);
            h89 h89 = new h89(this.f1078c);
            ((isJ) h89.R).O(v);
            this.f1078c = h89.O();
        } else {
            Rect rect = this.c;
            rect.top += i3;
            rect.bottom += 0;
            this.f1078c = gwm.f3779R.x(0, i3, 0, 0);
        }
        L(this.f1072R, this.c, true);
        if (!this.f1080e.equals(this.f1078c)) {
            gWM gwm2 = this.f1078c;
            this.f1080e = gwm2;
            ContentFrameLayout contentFrameLayout = this.f1072R;
            WindowInsets L = gwm2.L();
            if (L != null) {
                WindowInsets R2 = fv7.R(contentFrameLayout, L);
                if (!R2.equals(L)) {
                    gWM.Z(contentFrameLayout, R2);
                }
            }
        }
        measureChildWithMargins(this.f1072R, i, 0, i2, 0);
        Np np2 = (Np) this.f1072R.getLayoutParams();
        int max3 = Math.max(max, this.f1072R.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) np2).leftMargin + ((ViewGroup.MarginLayoutParams) np2).rightMargin);
        int max4 = Math.max(max2, this.f1072R.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) np2).topMargin + ((ViewGroup.MarginLayoutParams) np2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1072R.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.f1081e || !z) {
            return false;
        }
        this.f1070R.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1070R.getFinalY() > this.f1071R.getHeight()) {
            z2 = true;
        }
        if (z2) {
            Z();
            this.v.run();
        } else {
            Z();
            this.f1064R.run();
        }
        this.f1077X = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.O + i2;
        this.O = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        b_R b_r;
        hYl hyl;
        this.f1073R.e = i;
        this.O = getActionBarHideOffset();
        Z();
        ZG zg = this.f1066R;
        if (zg != null && (hyl = (b_r = (b_R) zg).f1740R) != null) {
            hyl.R();
            b_r.f1740R = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1071R.getVisibility() != 0) {
            return false;
        }
        return this.f1081e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f1081e && !this.f1077X) {
            if (this.O <= this.f1071R.getHeight()) {
                Z();
                postDelayed(this.f1064R, 600);
                return;
            }
            Z();
            postDelayed(this.v, 600);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        U();
        int i2 = this.L ^ i;
        this.L = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        ZG zg = this.f1066R;
        if (zg != null) {
            ((b_R) zg).c = !z2;
            if (z || !z2) {
                b_R b_r = (b_R) zg;
                if (b_r.e) {
                    b_r.e = false;
                    b_r.WD(true);
                }
            } else {
                b_R b_r2 = (b_R) zg;
                if (!b_r2.e) {
                    b_r2.e = true;
                    b_r2.WD(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.f1066R != null) {
            WeakHashMap weakHashMap = of5.f6887R;
            fv7.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.X = i;
        ZG zg = this.f1066R;
        if (zg != null) {
            ((b_R) zg).f1730R = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        Z();
        this.f1071R.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1071R.getHeight()))));
    }

    public void setActionBarVisibilityCallback(ZG zg) {
        this.f1066R = zg;
        if (getWindowToken() != null) {
            ((b_R) this.f1066R).f1730R = this.X;
            int i = this.L;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = of5.f6887R;
                fv7.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1079c = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1081e) {
            this.f1081e = z;
            if (!z) {
                Z();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        U();
        muY muy = (muY) this.f1074R;
        muy.f6226R = i != 0 ? aH9.p(muy.f6229R.getContext(), i) : null;
        muy.c();
    }

    public void setLogo(int i) {
        U();
        muY muy = (muY) this.f1074R;
        muy.f6233v = i != 0 ? aH9.p(muy.f6229R.getContext(), i) : null;
        muy.c();
    }

    public void setOverlayMode(boolean z) {
        this.f1084v = z;
        this.f1076R = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.kP9
    public void setWindowCallback(Window.Callback callback) {
        U();
        ((muY) this.f1074R).f6228R = callback;
    }

    @Override // defpackage.kP9
    public void setWindowTitle(CharSequence charSequence) {
        U();
        muY muy = (muY) this.f1074R;
        if (!muy.f6231R) {
            muy.f6230R = charSequence;
            if ((muy.R & 8) != 0) {
                muy.f6229R.setTitle(charSequence);
                if (muy.f6231R) {
                    of5.L(muy.f6229R.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.eRL
    public final void v(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public final void x(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(R);
        boolean z = false;
        this.e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1068R = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f1076R = z;
        this.f1070R = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new Np(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        U();
        muY muy = (muY) this.f1074R;
        muy.f6226R = drawable;
        muy.c();
    }
}
