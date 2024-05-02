package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ActionMenuView extends lYU implements ikD, ehR {
    public int C = 0;
    public int N;
    public int P;
    public RR R;

    /* renamed from: R  reason: collision with other field name */
    public Sz f1085R;

    /* renamed from: R  reason: collision with other field name */
    public Context f1086R;

    /* renamed from: R  reason: collision with other field name */
    public foC f1087R;

    /* renamed from: R  reason: collision with other field name */
    public lRG f1088R;

    /* renamed from: R  reason: collision with other field name */
    public ovy f1089R;
    public boolean c;
    public boolean e;
    public int j;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.P = (int) (56.0f * f);
        this.j = (int) (f * 4.0f);
        this.f1086R = context;
    }

    public static UV x(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            UV uv = layoutParams instanceof UV ? new UV((UV) layoutParams) : new UV(layoutParams);
            if (((LinearLayout.LayoutParams) uv).gravity <= 0) {
                ((LinearLayout.LayoutParams) uv).gravity = 16;
            }
            return uv;
        }
        UV uv2 = new UV();
        ((LinearLayout.LayoutParams) uv2).gravity = 16;
        return uv2;
    }

    public final boolean H(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof vI)) {
            z = false | ((vI) childAt).v();
        }
        return (i <= 0 || !(childAt2 instanceof vI)) ? z : z | ((vI) childAt2).R();
    }

    @Override // defpackage.lYU
    public final eGR L(AttributeSet attributeSet) {
        return new UV(getContext(), attributeSet);
    }

    @Override // defpackage.lYU
    public final eGR O() {
        UV uv = new UV();
        ((LinearLayout.LayoutParams) uv).gravity = 16;
        return uv;
    }

    @Override // defpackage.ikD
    public final boolean R(pce pce) {
        return this.f1088R.g(pce, null, 0);
    }

    @Override // defpackage.lYU
    public final /* bridge */ /* synthetic */ eGR Z(ViewGroup.LayoutParams layoutParams) {
        return x(layoutParams);
    }

    @Override // defpackage.lYU, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof UV;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.lYU, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        UV uv = new UV();
        ((LinearLayout.LayoutParams) uv).gravity = 16;
        return uv;
    }

    @Override // defpackage.lYU, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return x(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1088R == null) {
            Context context = getContext();
            lRG lrg = new lRG(context);
            this.f1088R = lrg;
            lrg.f5731R = new gL6(3, this);
            RR rr = new RR(context);
            this.R = rr;
            rr.f495v = true;
            rr.c = true;
            ovy ovy = this.f1089R;
            if (ovy == null) {
                ovy = new ift(2);
            }
            rr.f491R = ovy;
            this.f1088R.v(rr, this.f1086R);
            RR rr2 = this.R;
            rr2.f487R = this;
            this.f1088R = rr2.f489R;
        }
        return this.f1088R;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        RR rr = this.R;
        JJ jj = rr.R;
        if (jj != null) {
            return jj.getDrawable();
        }
        if (rr.f492R) {
            return rr.f483R;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.C;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RR rr = this.R;
        if (rr != null) {
            rr.m();
            if (this.R.Z()) {
                this.R.e();
                this.R.U();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RR rr = this.R;
        if (rr != null) {
            rr.e();
            Ni ni = rr.v;
            if (ni != null && ni.v()) {
                ((h6s) ni).f4068R.dismiss();
            }
        }
    }

    @Override // defpackage.lYU, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.e) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean R = oJF.R(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                UV uv = (UV) childAt.getLayoutParams();
                if (uv.f563R) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (H(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (R) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) uv).leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) uv).rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) uv).leftMargin) + ((LinearLayout.LayoutParams) uv).rightMargin;
                    H(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (R) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                UV uv2 = (UV) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !uv2.f563R) {
                    int i17 = width - ((LinearLayout.LayoutParams) uv2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) uv2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            UV uv3 = (UV) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !uv3.f563R) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) uv3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) uv3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.lYU, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 780
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.R.f493e = z;
    }

    public void setOnMenuItemClickListener(Sz sz) {
        this.f1085R = sz;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        RR rr = this.R;
        JJ jj = rr.R;
        if (jj != null) {
            jj.setImageDrawable(drawable);
            return;
        }
        rr.f492R = true;
        rr.f483R = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.c = z;
    }

    public void setPopupTheme(int i) {
        if (this.C != i) {
            this.C = i;
            if (i == 0) {
                this.f1086R = getContext();
            } else {
                this.f1086R = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(RR rr) {
        this.R = rr;
        rr.f487R = this;
        this.f1088R = rr.f489R;
    }

    @Override // defpackage.ehR
    public final void v(lRG lrg) {
        this.f1088R = lrg;
    }

    @Override // defpackage.lYU, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new UV(getContext(), attributeSet);
    }
}
