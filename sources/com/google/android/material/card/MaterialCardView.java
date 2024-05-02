package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import dev.kdrag0n.virtcontainer.R;

/* loaded from: classes.dex */
public class MaterialCardView extends l8 implements Checkable, kOI {
    public final cAu R;
    public static final int[] v = {16842911};
    public static final int[] c = {16842912};
    public static final int[] e = {R.attr.state_dragged};

    /* renamed from: e  reason: collision with other field name */
    public boolean f2304e = false;
    public boolean X = false;

    /* renamed from: c  reason: collision with other field name */
    public boolean f2303c = true;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.materialCardViewStyle, 2132018164), attributeSet);
        TypedArray w = aH9.w(getContext(), attributeSet, hDC.J, R.attr.materialCardViewStyle, 2132018164, new int[0]);
        cAu cau = new cAu(this, attributeSet);
        this.R = cau;
        cau.f1995R.C(super.getCardBackgroundColor());
        cau.f1991R.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cau.m();
        ColorStateList m = lTs.m(cau.f1996R.getContext(), w, 11);
        cau.f1999c = m;
        if (m == null) {
            cau.f1999c = ColorStateList.valueOf(-1);
        }
        cau.e = w.getDimensionPixelSize(12, 0);
        boolean z = w.getBoolean(0, false);
        cau.f2004v = z;
        cau.f1996R.setLongClickable(z);
        cau.f2001v = lTs.m(cau.f1996R.getContext(), w, 6);
        cau.O(lTs.x(cau.f1996R.getContext(), w, 2));
        cau.v = w.getDimensionPixelSize(5, 0);
        cau.f1989R = w.getDimensionPixelSize(4, 0);
        cau.c = w.getInteger(3, 8388661);
        ColorStateList m2 = lTs.m(cau.f1996R.getContext(), w, 7);
        cau.f1990R = m2;
        if (m2 == null) {
            cau.f1990R = ColorStateList.valueOf(vd.t(cau.f1996R, R.attr.colorControlHighlight));
        }
        ColorStateList m3 = lTs.m(cau.f1996R.getContext(), w, 1);
        cau.f2003v.C(m3 == null ? ColorStateList.valueOf(0) : m3);
        RippleDrawable rippleDrawable = cau.f1994R;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cau.f1990R);
        }
        cau.f1995R.U(cau.f1996R.getCardElevation());
        c18 c18 = cau.f2003v;
        ColorStateList colorStateList = cau.f1999c;
        c18.f1920R.c = (float) cau.e;
        c18.invalidateSelf();
        c18.g(colorStateList);
        cau.f1996R.setBackgroundInternal(cau.e(cau.f1995R));
        Drawable c2 = cau.f1996R.isClickable() ? cau.c() : cau.f2003v;
        cau.f1992R = c2;
        cau.f1996R.setForeground(cau.e(c2));
        w.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.R.f1995R.getBounds());
        return rectF;
    }

    @Override // defpackage.l8
    public ColorStateList getCardBackgroundColor() {
        return this.R.f1995R.f1920R.f6903R;
    }

    public ColorStateList getCardForegroundColor() {
        return this.R.f2003v.f1920R.f6903R;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.R.f2002v;
    }

    public int getCheckedIconGravity() {
        return this.R.c;
    }

    public int getCheckedIconMargin() {
        return this.R.f1989R;
    }

    public int getCheckedIconSize() {
        return this.R.v;
    }

    public ColorStateList getCheckedIconTint() {
        return this.R.f2001v;
    }

    @Override // defpackage.l8
    public int getContentPaddingBottom() {
        return this.R.f1991R.bottom;
    }

    @Override // defpackage.l8
    public int getContentPaddingLeft() {
        return this.R.f1991R.left;
    }

    @Override // defpackage.l8
    public int getContentPaddingRight() {
        return this.R.f1991R.right;
    }

    @Override // defpackage.l8
    public int getContentPaddingTop() {
        return this.R.f1991R.top;
    }

    public float getProgress() {
        return this.R.f1995R.f1920R.v;
    }

    @Override // defpackage.l8
    public float getRadius() {
        return this.R.f1995R.m();
    }

    public ColorStateList getRippleColor() {
        return this.R.f1990R;
    }

    public dOE getShapeAppearanceModel() {
        return this.R.f1997R;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.R.f1999c;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.R.f1999c;
    }

    public int getStrokeWidth() {
        return this.R.e;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2304e;
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hDC.k(this, this.R.f1995R);
    }

    @Override // android.view.View, android.view.ViewGroup
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        cAu cau = this.R;
        if (cau != null && cau.f2004v) {
            View.mergeDrawableStates(onCreateDrawableState, v);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, c);
        }
        if (this.X) {
            View.mergeDrawableStates(onCreateDrawableState, e);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        cAu cau = this.R;
        accessibilityNodeInfo.setCheckable(cau != null && cau.f2004v);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // defpackage.l8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.R.X(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f2303c) {
            if (!this.R.f1998R) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.R.f1998R = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.l8
    public void setCardBackgroundColor(int i) {
        cAu cau = this.R;
        cau.f1995R.C(ColorStateList.valueOf(i));
    }

    @Override // defpackage.l8
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        cAu cau = this.R;
        cau.f1995R.U(cau.f1996R.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        c18 c18 = this.R.f2003v;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c18.C(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.R.f2004v = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f2304e != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.R.O(drawable);
    }

    public void setCheckedIconGravity(int i) {
        cAu cau = this.R;
        if (cau.c != i) {
            cau.c = i;
            cau.X(cau.f1996R.getMeasuredWidth(), cau.f1996R.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.R.f1989R = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.R.f1989R = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.R.O(aH9.p(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.R.v = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.R.v = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        cAu cau = this.R;
        cau.f2001v = colorStateList;
        Drawable drawable = cau.f2002v;
        if (drawable != null) {
            cAO.Z(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        cAu cau = this.R;
        if (cau != null) {
            Drawable drawable = cau.f1992R;
            Drawable c2 = cau.f1996R.isClickable() ? cau.c() : cau.f2003v;
            cau.f1992R = c2;
            if (drawable == c2) {
                return;
            }
            if (cau.f1996R.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) cau.f1996R.getForeground()).setDrawable(c2);
            } else {
                cau.f1996R.setForeground(cau.e(c2));
            }
        }
    }

    public void setDragged(boolean z) {
        if (this.X != z) {
            this.X = z;
            refreshDrawableState();
            v();
            invalidate();
        }
    }

    @Override // defpackage.l8
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.R.x();
    }

    public void setOnCheckedChangeListener(feL fel) {
    }

    @Override // defpackage.l8
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.R.x();
        this.R.m();
    }

    public void setProgress(float f) {
        cAu cau = this.R;
        cau.f1995R.N(f);
        c18 c18 = cau.f2003v;
        if (c18 != null) {
            c18.N(f);
        }
        c18 c182 = cau.f2000c;
        if (c182 != null) {
            c182.N(f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if ((r1.f1996R.getPreventCornerOverlap() && !r1.f1995R.H()) != false) goto L_0x002e;
     */
    @Override // defpackage.l8
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRadius(float r2) {
        /*
            r1 = this;
            super.setRadius(r2)
            cAu r1 = r1.R
            dOE r0 = r1.f1997R
            dOE r2 = r0.X(r2)
            r1.L(r2)
            android.graphics.drawable.Drawable r2 = r1.f1992R
            r2.invalidateSelf()
            boolean r2 = r1.Z()
            if (r2 != 0) goto L_0x002e
            com.google.android.material.card.MaterialCardView r2 = r1.f1996R
            boolean r2 = r2.getPreventCornerOverlap()
            if (r2 == 0) goto L_0x002b
            c18 r2 = r1.f1995R
            boolean r2 = r2.H()
            if (r2 != 0) goto L_0x002b
            r2 = 1
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            if (r2 == 0) goto L_0x0031
        L_0x002e:
            r1.m()
        L_0x0031:
            boolean r2 = r1.Z()
            if (r2 == 0) goto L_0x003a
            r1.x()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.setRadius(float):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        cAu cau = this.R;
        cau.f1990R = colorStateList;
        RippleDrawable rippleDrawable = cau.f1994R;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        cAu cau = this.R;
        ColorStateList v2 = C1.v(getContext(), i);
        cau.f1990R = v2;
        RippleDrawable rippleDrawable = cau.f1994R;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(v2);
        }
    }

    @Override // defpackage.kOI
    public void setShapeAppearanceModel(dOE doe) {
        setClipToOutline(doe.e(getBoundsAsRectF()));
        this.R.L(doe);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        cAu cau = this.R;
        if (i != cau.e) {
            cau.e = i;
            c18 c18 = cau.f2003v;
            ColorStateList colorStateList = cau.f1999c;
            c18.f1920R.c = (float) i;
            c18.invalidateSelf();
            c18.g(colorStateList);
        }
        invalidate();
    }

    @Override // defpackage.l8
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.R.x();
        this.R.m();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        cAu cau = this.R;
        int i = 0;
        if ((cau != null && cau.f2004v) && isEnabled()) {
            this.f2304e = !this.f2304e;
            refreshDrawableState();
            v();
            cAu cau2 = this.R;
            boolean z = this.f2304e;
            Drawable drawable = cau2.f2002v;
            if (drawable != null) {
                if (z) {
                    i = 255;
                }
                drawable.setAlpha(i);
            }
        }
    }

    public final void v() {
        cAu cau = this.R;
        RippleDrawable rippleDrawable = cau.f1994R;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            cau.f1994R.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            cau.f1994R.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        cAu cau = this.R;
        if (cau.f1999c != colorStateList) {
            cau.f1999c = colorStateList;
            c18 c18 = cau.f2003v;
            c18.f1920R.c = (float) cau.e;
            c18.invalidateSelf();
            c18.g(colorStateList);
        }
        invalidate();
    }

    @Override // defpackage.l8
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.R.f1995R.C(colorStateList);
    }
}
