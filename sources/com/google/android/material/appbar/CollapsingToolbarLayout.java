package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public int H;
    public int L;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f2225O;
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public final QL f2226R;

    /* renamed from: R  reason: collision with other field name */
    public ValueAnimator f2227R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f2229R;

    /* renamed from: R  reason: collision with other field name */
    public View f2230R;

    /* renamed from: R  reason: collision with other field name */
    public ViewGroup f2231R;

    /* renamed from: R  reason: collision with other field name */
    public final fBr f2232R;

    /* renamed from: R  reason: collision with other field name */
    public gWM f2233R;

    /* renamed from: R  reason: collision with other field name */
    public y_ f2234R;
    public int U;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f2236X;
    public int Z;
    public boolean c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f2237e;
    public int m;
    public Drawable v;

    /* renamed from: v  reason: collision with other field name */
    public View f2238v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2239v;
    public int x;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2235R = true;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f2228R = new Rect();
    public int C = 0;
    public int N = 0;

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.collapsingToolbarLayoutStyle, 2132017976), attributeSet, R.attr.collapsingToolbarLayoutStyle);
        int i;
        ColorStateList m;
        this.x = -1;
        Context context2 = getContext();
        QL ql = new QL(this);
        this.f2226R = ql;
        ql.f460v = My.f297R;
        ql.m(false);
        ql.f453c = false;
        this.f2232R = new fBr(context2);
        TypedArray w = aH9.w(context2, attributeSet, hDC.N, R.attr.collapsingToolbarLayoutStyle, 2132017976, new int[0]);
        int i2 = w.getInt(4, 8388691);
        if (ql.f458v != i2) {
            ql.f458v = i2;
            ql.m(false);
        }
        ql.U(w.getInt(0, 8388627));
        int dimensionPixelSize = w.getDimensionPixelSize(5, 0);
        this.Z = dimensionPixelSize;
        this.L = dimensionPixelSize;
        this.O = dimensionPixelSize;
        this.X = dimensionPixelSize;
        if (w.hasValue(8)) {
            this.X = w.getDimensionPixelSize(8, 0);
        }
        if (w.hasValue(7)) {
            this.L = w.getDimensionPixelSize(7, 0);
        }
        if (w.hasValue(9)) {
            this.O = w.getDimensionPixelSize(9, 0);
        }
        if (w.hasValue(6)) {
            this.Z = w.getDimensionPixelSize(6, 0);
        }
        this.f2239v = w.getBoolean(20, true);
        setTitle(w.getText(18));
        ql.N(2132017625);
        ql.x(2132017604);
        if (w.hasValue(10)) {
            ql.N(w.getResourceId(10, 0));
        }
        if (w.hasValue(1)) {
            ql.x(w.getResourceId(1, 0));
        }
        if (w.hasValue(22)) {
            int i3 = w.getInt(22, -1);
            setTitleEllipsize(i3 != 0 ? i3 != 1 ? i3 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (w.hasValue(11) && ql.f435R != (m = lTs.m(context2, w, 11))) {
            ql.f435R = m;
            ql.m(false);
        }
        if (w.hasValue(2)) {
            ql.H(lTs.m(context2, w, 2));
        }
        this.x = w.getDimensionPixelSize(16, -1);
        if (w.hasValue(14) && (i = w.getInt(14, 1)) != ql.f430O) {
            ql.f430O = i;
            Bitmap bitmap = ql.f436R;
            if (bitmap != null) {
                bitmap.recycle();
                ql.f436R = null;
            }
            ql.m(false);
        }
        if (w.hasValue(21)) {
            ql.f434R = AnimationUtils.loadInterpolator(context2, w.getResourceId(21, 0));
            ql.m(false);
        }
        this.R = (long) w.getInt(15, 600);
        setContentScrim(w.getDrawable(3));
        setStatusBarScrim(w.getDrawable(17));
        setTitleCollapseMode(w.getInt(19, 0));
        this.e = w.getResourceId(23, -1);
        this.f2236X = w.getBoolean(13, false);
        this.f2225O = w.getBoolean(12, false);
        w.recycle();
        setWillNotDraw(false);
        qy qyVar = new qy(3, this);
        WeakHashMap weakHashMap = of5.f6887R;
        m18.V(this, qyVar);
    }

    public static hJL v(View view) {
        hJL hjl = (hJL) view.getTag(R.id.view_offset_helper);
        if (hjl != null) {
            return hjl;
        }
        hJL hjl2 = new hJL(view);
        view.setTag(R.id.view_offset_helper, hjl2);
        return hjl2;
    }

    public final void O() {
        if (this.f2231R != null && this.f2239v && TextUtils.isEmpty(this.f2226R.f444R)) {
            ViewGroup viewGroup = this.f2231R;
            setTitle(viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0028 */
    public final void R() {
        if (this.f2235R) {
            ViewGroup viewGroup = null;
            this.f2231R = null;
            this.f2230R = null;
            int i = this.e;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f2231R = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.f2230R = view;
                }
            }
            if (this.f2231R == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i2++;
                }
                this.f2231R = viewGroup;
            }
            c();
            this.f2235R = false;
        }
    }

    public final void X(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.f2239v && (view = this.f2238v) != null) {
            WeakHashMap weakHashMap = of5.f6887R;
            boolean z2 = false;
            boolean z3 = d6y.v(view) && this.f2238v.getVisibility() == 0;
            this.c = z3;
            if (z3 || z) {
                boolean z4 = eHQ.e(this) == 1;
                View view2 = this.f2230R;
                if (view2 == null) {
                    view2 = this.f2231R;
                }
                int height = ((getHeight() - v(view2).R) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((F0) view2.getLayoutParams())).bottomMargin;
                View view3 = this.f2238v;
                Rect rect = this.f2228R;
                ThreadLocal threadLocal = ljV.R;
                rect.set(0, 0, view3.getWidth(), view3.getHeight());
                ljV.v(this, view3, rect);
                ViewGroup viewGroup = this.f2231R;
                if (viewGroup instanceof Toolbar) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    i7 = toolbar.getTitleMarginStart();
                    i6 = toolbar.getTitleMarginEnd();
                    i5 = toolbar.getTitleMarginTop();
                    i8 = toolbar.getTitleMarginBottom();
                } else if (viewGroup instanceof android.widget.Toolbar) {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                    i7 = toolbar2.getTitleMarginStart();
                    i6 = toolbar2.getTitleMarginEnd();
                    i5 = toolbar2.getTitleMarginTop();
                    i8 = toolbar2.getTitleMarginBottom();
                } else {
                    i8 = 0;
                    i7 = 0;
                    i6 = 0;
                    i5 = 0;
                }
                QL ql = this.f2226R;
                Rect rect2 = this.f2228R;
                int i9 = rect2.left + (z4 ? i6 : i7);
                int i10 = rect2.top + height + i5;
                int i11 = rect2.right;
                if (!z4) {
                    i7 = i6;
                }
                int i12 = i11 - i7;
                int i13 = (rect2.bottom + height) - i8;
                Rect rect3 = ql.f462v;
                if (!(rect3.left == i9 && rect3.top == i10 && rect3.right == i12 && rect3.bottom == i13)) {
                    rect3.set(i9, i10, i12, i13);
                    ql.f457e = true;
                }
                QL ql2 = this.f2226R;
                int i14 = z4 ? this.L : this.X;
                int i15 = this.f2228R.top + this.O;
                int i16 = (i3 - i) - (z4 ? this.X : this.L);
                int i17 = (i4 - i2) - this.Z;
                Rect rect4 = ql2.f437R;
                if (rect4.left == i14 && rect4.top == i15 && rect4.right == i16 && rect4.bottom == i17) {
                    z2 = true;
                }
                if (!z2) {
                    rect4.set(i14, i15, i16, i17);
                    ql2.f457e = true;
                }
                this.f2226R.m(z);
            }
        }
    }

    public final void c() {
        View view;
        if (!this.f2239v && (view = this.f2238v) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2238v);
            }
        }
        if (this.f2239v && this.f2231R != null) {
            if (this.f2238v == null) {
                this.f2238v = new View(getContext());
            }
            if (this.f2238v.getParent() == null) {
                this.f2231R.addView(this.f2238v, -1, -1);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof F0;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        R();
        if (this.f2231R == null && (drawable = this.f2229R) != null && this.m > 0) {
            drawable.mutate().setAlpha(this.m);
            this.f2229R.draw(canvas);
        }
        if (this.f2239v && this.c) {
            if (!(this.f2231R == null || this.f2229R == null || this.m <= 0)) {
                boolean z = true;
                if (this.U != 1) {
                    z = false;
                }
                if (z) {
                    QL ql = this.f2226R;
                    if (ql.R < ql.c) {
                        int save = canvas.save();
                        canvas.clipRect(this.f2229R.getBounds(), Region.Op.DIFFERENCE);
                        this.f2226R.e(canvas);
                        canvas.restoreToCount(save);
                    }
                }
            }
            this.f2226R.e(canvas);
        }
        if (this.v != null && this.m > 0) {
            gWM gwm = this.f2233R;
            int O = gwm != null ? gwm.O() : 0;
            if (O > 0) {
                this.v.setBounds(0, -this.H, getWidth(), O - this.H);
                this.v.mutate().setAlpha(this.m);
                this.v.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r3 = true;
     */
    @Override // android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean drawChild(android.graphics.Canvas r7, android.view.View r8, long r9) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f2229R
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004d
            int r3 = r6.m
            if (r3 <= 0) goto L_0x004d
            android.view.View r3 = r6.f2230R
            if (r3 == 0) goto L_0x0014
            if (r3 != r6) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            if (r8 != r3) goto L_0x001a
            goto L_0x0018
        L_0x0014:
            android.view.ViewGroup r3 = r6.f2231R
            if (r8 != r3) goto L_0x001a
        L_0x0018:
            r3 = r2
            goto L_0x001b
        L_0x001a:
            r3 = r1
        L_0x001b:
            if (r3 == 0) goto L_0x004d
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            int r5 = r6.U
            if (r5 != r2) goto L_0x002b
            r5 = r2
            goto L_0x002c
        L_0x002b:
            r5 = r1
        L_0x002c:
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0038
            boolean r5 = r6.f2239v
            if (r5 == 0) goto L_0x0038
            int r4 = r8.getBottom()
        L_0x0038:
            r0.setBounds(r1, r1, r3, r4)
            android.graphics.drawable.Drawable r0 = r6.f2229R
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r6.m
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r6.f2229R
            r0.draw(r7)
            r0 = r2
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            boolean r6 = super.drawChild(r7, r8, r9)
            if (r6 != 0) goto L_0x0056
            if (r0 == 0) goto L_0x0057
        L_0x0056:
            r1 = r2
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f2229R;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        QL ql = this.f2226R;
        if (ql != null) {
            z |= ql.y(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        if (this.f2229R != null || this.v != null) {
            setScrimsShown(getHeight() + this.H < getScrimVisibleHeightTrigger());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new F0();
    }

    public int getCollapsedTitleGravity() {
        return this.f2226R.f449c;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f2226R.f439R;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.f2229R;
    }

    public int getExpandedTitleGravity() {
        return this.f2226R.f458v;
    }

    public int getExpandedTitleMarginBottom() {
        return this.Z;
    }

    public int getExpandedTitleMarginEnd() {
        return this.L;
    }

    public int getExpandedTitleMarginStart() {
        return this.X;
    }

    public int getExpandedTitleMarginTop() {
        return this.O;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f2226R.f456e;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.f2226R.f428L;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f2226R.f440R;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.f2226R.f440R.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.f2226R.f440R.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f2226R.f430O;
    }

    public int getScrimAlpha() {
        return this.m;
    }

    public long getScrimAnimationDuration() {
        return this.R;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.x;
        if (i >= 0) {
            return i + this.C + this.N;
        }
        gWM gwm = this.f2233R;
        int O = gwm != null ? gwm.O() : 0;
        WeakHashMap weakHashMap = of5.f6887R;
        int e = mHC.e(this);
        return e > 0 ? Math.min((e * 2) + O, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.v;
    }

    public CharSequence getTitle() {
        if (this.f2239v) {
            return this.f2226R.f444R;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.U;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f2226R.f434R;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f2226R.f442R;
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            boolean z = true;
            if (this.U != 1) {
                z = false;
            }
            if (z) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = of5.f6887R;
            setFitsSystemWindows(mHC.v(appBarLayout));
            if (this.f2234R == null) {
                this.f2234R = new y_(this);
            }
            y_ y_Var = this.f2234R;
            if (appBarLayout.f2217R == null) {
                appBarLayout.f2217R = new ArrayList();
            }
            if (y_Var != null && !appBarLayout.f2217R.contains(y_Var)) {
                appBarLayout.f2217R.add(y_Var);
            }
            fv7.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2226R.Z(configuration);
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        y_ y_Var = this.f2234R;
        if (!(y_Var == null || !(parent instanceof AppBarLayout) || (arrayList = ((AppBarLayout) parent).f2217R) == null)) {
            arrayList.remove(y_Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        gWM gwm = this.f2233R;
        if (gwm != null) {
            int O = gwm.O();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap weakHashMap = of5.f6887R;
                if (!mHC.v(childAt) && childAt.getTop() < O) {
                    childAt.offsetTopAndBottom(O);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            hJL v = v(getChildAt(i6));
            v.R = v.f4207R.getTop();
            v.v = v.f4207R.getLeft();
        }
        X(false, i, i2, i3, i4);
        O();
        e();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            v(getChildAt(i7)).R();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        R();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        gWM gwm = this.f2233R;
        int O = gwm != null ? gwm.O() : 0;
        if ((mode == 0 || this.f2236X) && O > 0) {
            this.C = O;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + O, 1073741824));
        }
        if (this.f2225O && this.f2226R.f430O > 1) {
            O();
            X(true, 0, 0, getMeasuredWidth(), getMeasuredHeight());
            QL ql = this.f2226R;
            int i5 = ql.f454e;
            if (i5 > 1) {
                TextPaint textPaint = ql.f464v;
                textPaint.setTextSize(ql.e);
                textPaint.setTypeface(ql.f456e);
                textPaint.setLetterSpacing(ql.J);
                this.N = (i5 - 1) * Math.round(ql.f464v.descent() + (-ql.f464v.ascent()));
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.N, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f2231R;
        if (viewGroup != null) {
            View view = this.f2230R;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    i3 = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(i3);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                i4 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                i4 = view.getMeasuredHeight();
            }
            setMinimumHeight(i4);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f2229R;
        if (drawable != null) {
            ViewGroup viewGroup = this.f2231R;
            boolean z = true;
            if (this.U != 1) {
                z = false;
            }
            if (z && viewGroup != null && this.f2239v) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f2226R.U(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f2226R.x(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        QL ql = this.f2226R;
        if (ql.C(typeface)) {
            ql.m(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f2229R;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2229R = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f2231R;
                boolean z = true;
                if (this.U != 1) {
                    z = false;
                }
                if (z && viewGroup != null && this.f2239v) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.f2229R.setCallback(this);
                this.f2229R.setAlpha(this.m);
            }
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.H(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        Context context = getContext();
        Object obj = C1.R;
        setContentScrim(eNe.v(context, i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        QL ql = this.f2226R;
        if (ql.f458v != i) {
            ql.f458v = i;
            ql.m(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.Z = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.L = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.X = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.O = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f2226R.N(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        QL ql = this.f2226R;
        if (ql.f435R != colorStateList) {
            ql.f435R = colorStateList;
            ql.m(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        QL ql = this.f2226R;
        if (ql.P(typeface)) {
            ql.m(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f2225O = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f2236X = z;
    }

    public void setHyphenationFrequency(int i) {
        this.f2226R.f428L = i;
    }

    public void setLineSpacingAdd(float f) {
        this.f2226R.z = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.f2226R.n = f;
    }

    public void setMaxLines(int i) {
        QL ql = this.f2226R;
        if (i != ql.f430O) {
            ql.f430O = i;
            Bitmap bitmap = ql.f436R;
            if (bitmap != null) {
                bitmap.recycle();
                ql.f436R = null;
            }
            ql.m(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f2226R.f453c = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.m) {
            if (!(this.f2229R == null || (viewGroup = this.f2231R) == null)) {
                WeakHashMap weakHashMap = of5.f6887R;
                mHC.H(viewGroup);
            }
            this.m = i;
            WeakHashMap weakHashMap2 = of5.f6887R;
            mHC.H(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.R = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.x != i) {
            this.x = i;
            e();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap weakHashMap = of5.f6887R;
        int i = 0;
        boolean z2 = d6y.c(this) && !isInEditMode();
        if (this.f2237e != z) {
            int i2 = 255;
            if (z2) {
                if (!z) {
                    i2 = 0;
                }
                R();
                ValueAnimator valueAnimator = this.f2227R;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f2227R = valueAnimator2;
                    valueAnimator2.setInterpolator(i2 > this.m ? My.R : My.f299R);
                    this.f2227R.addUpdateListener(new e4(0, this));
                } else if (valueAnimator.isRunning()) {
                    this.f2227R.cancel();
                }
                this.f2227R.setDuration(this.R);
                this.f2227R.setIntValues(this.m, i2);
                this.f2227R.start();
            } else {
                if (z) {
                    i = 255;
                }
                setScrimAlpha(i);
            }
            this.f2237e = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(tu tuVar) {
        QL ql = this.f2226R;
        ql.getClass();
        if (tuVar != null) {
            ql.getClass();
            ql.m(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.v = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                Drawable drawable4 = this.v;
                WeakHashMap weakHashMap = of5.f6887R;
                f4J.v(drawable4, eHQ.e(this));
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
                this.v.setAlpha(this.m);
            }
            WeakHashMap weakHashMap2 = of5.f6887R;
            mHC.H(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        Context context = getContext();
        Object obj = C1.R;
        setStatusBarScrim(eNe.v(context, i));
    }

    public void setTitle(CharSequence charSequence) {
        QL ql = this.f2226R;
        if (charSequence == null || !TextUtils.equals(ql.f444R, charSequence)) {
            ql.f444R = charSequence;
            ql.f465v = null;
            Bitmap bitmap = ql.f436R;
            if (bitmap != null) {
                bitmap.recycle();
                ql.f436R = null;
            }
            ql.m(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.U = i;
        boolean z = true;
        boolean z2 = i == 1;
        this.f2226R.f445R = z2;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.U != 1) {
                z = false;
            }
            if (z) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z2 && this.f2229R == null) {
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            fBr fbr = this.f2232R;
            setContentScrimColor(fbr.R(fbr.c, dimension));
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        QL ql = this.f2226R;
        ql.f442R = truncateAt;
        ql.m(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f2239v) {
            this.f2239v = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        QL ql = this.f2226R;
        ql.f434R = timeInterpolator;
        ql.m(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.v;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.v.setVisible(z, false);
        }
        Drawable drawable2 = this.f2229R;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f2229R.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2229R || drawable == this.v;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final FrameLayout.LayoutParams mo14generateDefaultLayoutParams() {
        return new F0();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new F0(getContext(), attributeSet);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f2226R.H(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new F0(layoutParams);
    }
}
