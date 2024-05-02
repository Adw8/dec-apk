package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements b1z, n9d, ScrollingView {
    public int L;
    public int O;

    /* renamed from: R  reason: collision with other field name */
    public final float f1294R;

    /* renamed from: R  reason: collision with other field name */
    public long f1295R;

    /* renamed from: R  reason: collision with other field name */
    public VelocityTracker f1297R;

    /* renamed from: R  reason: collision with other field name */
    public EdgeEffect f1299R;

    /* renamed from: R  reason: collision with other field name */
    public dI4 f1302R;

    /* renamed from: R  reason: collision with other field name */
    public g_h f1303R;
    public int X;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f1309e;
    public int m;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public EdgeEffect f1310v;
    public int x;
    public static final float c = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final pxk R = new pxk();

    /* renamed from: c  reason: collision with other field name */
    public static final int[] f1293c = {16843130};

    /* renamed from: R  reason: collision with other field name */
    public final Rect f1296R = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public boolean f1305R = true;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1311v = false;

    /* renamed from: R  reason: collision with other field name */
    public View f1298R = null;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1308c = false;

    /* renamed from: X  reason: collision with other field name */
    public boolean f1307X = true;
    public int Z = -1;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f1306R = new int[2];

    /* renamed from: v  reason: collision with other field name */
    public final int[] f1312v = new int[2];

    /* renamed from: R  reason: collision with other field name */
    public OverScroller f1300R = new OverScroller(getContext());

    /* renamed from: R  reason: collision with other field name */
    public final c_x f1301R = new c_x();

    /* renamed from: R  reason: collision with other field name */
    public final hHo f1304R = new hHo(this);

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        this.f1299R = jRf.R(context, attributeSet);
        this.f1310v = jRf.R(context, attributeSet);
        this.f1294R = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.X = viewConfiguration.getScaledTouchSlop();
        this.O = viewConfiguration.getScaledMinimumFlingVelocity();
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1293c, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        setNestedScrollingEnabled(true);
        of5.O(this, R);
    }

    public static boolean C(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && C((View) parent, view2);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.v == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.v = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.v;
    }

    public final void H(int i) {
        if (getChildCount() > 0) {
            this.f1300R.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1304R.L(2, 1);
            this.x = getScrollY();
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.H(this);
        }
    }

    public final boolean L(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !N(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1296R);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1296R);
            m(Z(this.f1296R));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!N(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final boolean N(View view, int i, int i2) {
        view.getDrawingRect(this.f1296R);
        offsetDescendantRectToMyCoords(view, this.f1296R);
        return this.f1296R.bottom + i >= getScrollY() && this.f1296R.top - i <= getScrollY() + i2;
    }

    @Override // defpackage.eRL
    public final boolean O(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final void P(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1304R.e(0, scrollY2, 0, i - scrollY2, i2, iArr);
    }

    @Override // defpackage.eRL
    public final void R(View view, int i, int i2, int i3, int i4, int i5) {
        P(i4, i5, null);
    }

    public final boolean U(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1296R;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1296R.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f1296R;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1296R;
        return y(i, rect3.top, rect3.bottom);
    }

    public final boolean V(MotionEvent motionEvent) {
        boolean z;
        if (jRf.v(this.f1299R) != 0.0f) {
            jRf.c(this.f1299R, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        if (jRf.v(this.f1310v) == 0.0f) {
            return z;
        }
        jRf.c(this.f1310v, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    @Override // defpackage.eRL
    public final void X(View view, View view2, int i, int i2) {
        c_x c_x = this.f1301R;
        if (i2 == 1) {
            c_x.X = i;
        } else {
            c_x.e = i;
        }
        this.f1304R.L(2, i2);
    }

    public final int Z(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // defpackage.eRL
    public final void c(View view, int i) {
        c_x c_x = this.f1301R;
        if (i == 1) {
            c_x.X = 0;
        } else {
            c_x.e = 0;
        }
        o(i);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0103  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.View, android.view.ViewGroup
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || x(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1304R.R(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1304R.v(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1304R.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1304R.X(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f1299R.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (hGJ.R(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (hGJ.R(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.f1299R.setSize(width, height);
            if (this.f1299R.draw(canvas)) {
                WeakHashMap weakHashMap = of5.f6887R;
                mHC.H(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f1310v.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (hGJ.R(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i2 = 0 + getPaddingLeft();
            }
            if (hGJ.R(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f1310v.setSize(width2, height2);
            if (this.f1310v.draw(canvas)) {
                WeakHashMap weakHashMap2 = of5.f6887R;
                mHC.H(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.b1z
    public final void e(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        P(i4, i5, iArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L_0x001a
        L_0x0017:
            r11 = r0
            r10 = r1
            goto L_0x001e
        L_0x001a:
            if (r11 >= 0) goto L_0x001d
            goto L_0x0017
        L_0x001d:
            r10 = r0
        L_0x001e:
            if (r12 <= r13) goto L_0x0023
            r12 = r13
        L_0x0021:
            r13 = r1
            goto L_0x0028
        L_0x0023:
            if (r12 >= 0) goto L_0x0027
            r12 = r0
            goto L_0x0021
        L_0x0027:
            r13 = r0
        L_0x0028:
            if (r13 == 0) goto L_0x0045
            hHo r2 = r9.f1304R
            android.view.ViewParent r2 = r2.O(r1)
            if (r2 == 0) goto L_0x0034
            r2 = r1
            goto L_0x0035
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 != 0) goto L_0x0045
            android.widget.OverScroller r2 = r9.f1300R
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L_0x0045:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L_0x004e
            if (r13 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = r0
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.g(int, int, int, int):boolean");
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c_x c_x = this.f1301R;
        return c_x.X | c_x.e;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1304R.O(0) != null;
    }

    public final void i(int i, int i2, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1295R > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1300R;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                if (z) {
                    this.f1304R.L(2, 1);
                } else {
                    o(1);
                }
                this.x = getScrollY();
                WeakHashMap weakHashMap = of5.f6887R;
                mHC.H(this);
            } else {
                if (!this.f1300R.isFinished()) {
                    this.f1300R.abortAnimation();
                    o(1);
                }
                scrollBy(i, i2);
            }
            this.f1295R = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1304R.f4201R;
    }

    public final void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Z) {
            int i = actionIndex == 0 ? 1 : 0;
            this.e = (int) motionEvent.getY(i);
            this.Z = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1297R;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void m(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1307X) {
            i(0, i, false);
        } else {
            scrollBy(0, i);
        }
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void o(int i) {
        this.f1304R.Z(i);
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1311v = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z = false;
        r1 = 0;
        int i = 0;
        if (motionEvent.getAction() == 8 && !this.f1308c) {
            float axisValue = dtx.V(motionEvent, 2) ? motionEvent.getAxisValue(9) : dtx.V(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    int overScrollMode = getOverScrollMode();
                    if (((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) == true && !dtx.V(motionEvent, 8194)) == true) {
                        jRf.c(this.f1299R, (-((float) verticalScrollFactorCompat)) / ((float) getHeight()), 0.5f);
                        this.f1299R.onRelease();
                        invalidate();
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (verticalScrollFactorCompat > scrollRange) {
                    int overScrollMode2 = getOverScrollMode();
                    if (((overScrollMode2 == 0 || (overScrollMode2 == 1 && getScrollRange() > 0)) == true && !dtx.V(motionEvent, 8194)) == true) {
                        jRf.c(this.f1310v, ((float) (verticalScrollFactorCompat - scrollRange)) / ((float) getHeight()), 0.5f);
                        this.f1310v.onRelease();
                        invalidate();
                        z = true;
                    }
                    i = scrollRange;
                } else {
                    z = false;
                    i = verticalScrollFactorCompat;
                }
                if (i == scrollY) {
                    return z;
                }
                super.scrollTo(getScrollX(), i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0107  */
    @Override // android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 321
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.f1305R = false;
        View view = this.f1298R;
        if (view != null && C(view, this)) {
            View view2 = this.f1298R;
            view2.getDrawingRect(this.f1296R);
            offsetDescendantRectToMyCoords(view2, this.f1296R);
            int Z = Z(this.f1296R);
            if (Z != 0) {
                scrollBy(0, Z);
            }
        }
        this.f1298R = null;
        if (!this.f1311v) {
            if (this.f1303R != null) {
                scrollTo(getScrollX(), this.f1303R.e);
                this.f1303R = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1311v = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1309e && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        H((int) f2);
        return true;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        v(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        P(i4, 0, null);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        X(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !(!N(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g_h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g_h g_h = (g_h) parcelable;
        super.onRestoreInstanceState(g_h.getSuperState());
        this.f1303R = g_h;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g_h g_h = new g_h(super.onSaveInstanceState());
        g_h.e = getScrollY();
        return g_h;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        dI4 di4 = this.f1302R;
        if (di4 != null) {
            CV cv = (CV) di4;
            Fj.c(this, (View) cv.f59R, (View) cv.v);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && N(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f1296R);
            offsetDescendantRectToMyCoords(findFocus, this.f1296R);
            m(Z(this.f1296R));
        }
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return O(view, view2, i, 0);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x024d  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
        // Method dump skipped, instructions count: 818
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public final void requestChildFocus(View view, View view2) {
        if (!this.f1305R) {
            view2.getDrawingRect(this.f1296R);
            offsetDescendantRectToMyCoords(view2, this.f1296R);
            int Z = Z(this.f1296R);
            if (Z != 0) {
                scrollBy(0, Z);
            }
        } else {
            this.f1298R = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int Z = Z(rect);
        boolean z2 = Z != 0;
        if (z2) {
            if (z) {
                scrollBy(0, Z);
            } else {
                i(0, Z, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f1297R) != null) {
            velocityTracker.recycle();
            this.f1297R = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewParent, android.view.View
    public final void requestLayout() {
        this.f1305R = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1309e) {
            this.f1309e = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        hHo hho = this.f1304R;
        if (hho.f4201R) {
            View view = hho.R;
            WeakHashMap weakHashMap = of5.f6887R;
            m18.h(view);
        }
        hho.f4201R = z;
    }

    public void setOnScrollChangeListener(dI4 di4) {
        this.f1302R = di4;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1307X = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f1304R.L(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        o(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float v = jRf.v(edgeEffect) * ((float) getHeight());
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / (this.f1294R * 0.015f)));
        double d = (double) c;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) (this.f1294R * 0.015f)))) < v;
    }

    @Override // defpackage.eRL
    public final void v(View view, int i, int i2, int[] iArr, int i3) {
        this.f1304R.c(i, i2, i3, iArr, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(android.view.KeyEvent r7) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.x(android.view.KeyEvent):boolean");
    }

    public final boolean y(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
