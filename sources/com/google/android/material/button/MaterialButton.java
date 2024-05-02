package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import dev.kdrag0n.virtcontainer.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MaterialButton extends GV implements Checkable, kOI {
    public static final int[] R = {16842911};
    public static final int[] v = {16842912};
    public int L;
    public int O;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f2289R;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f2290R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f2291R;

    /* renamed from: R  reason: collision with other field name */
    public etI f2292R;

    /* renamed from: R  reason: collision with other field name */
    public final nl4 f2294R;
    public int X;
    public int Z;
    public int e;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f2293R = new LinkedHashSet();

    /* renamed from: R  reason: collision with other field name */
    public boolean f2295R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2296v = false;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.materialButtonStyle, 2132018152), attributeSet, R.attr.materialButtonStyle);
        boolean z = false;
        Context context2 = getContext();
        TypedArray w = aH9.w(context2, attributeSet, hDC.i, R.attr.materialButtonStyle, 2132018152, new int[0]);
        this.L = w.getDimensionPixelSize(12, 0);
        this.f2290R = vd.u(w.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f2289R = lTs.m(getContext(), w, 14);
        this.f2291R = lTs.x(getContext(), w, 10);
        this.Z = w.getInteger(11, 1);
        this.e = w.getDimensionPixelSize(13, 0);
        nl4 nl4 = new nl4(this, new dOE(dOE.v(context2, attributeSet, R.attr.materialButtonStyle, 2132018152)));
        this.f2294R = nl4;
        nl4.R = w.getDimensionPixelOffset(1, 0);
        nl4.v = w.getDimensionPixelOffset(2, 0);
        nl4.c = w.getDimensionPixelOffset(3, 0);
        nl4.e = w.getDimensionPixelOffset(4, 0);
        if (w.hasValue(8)) {
            int dimensionPixelSize = w.getDimensionPixelSize(8, -1);
            nl4.X = dimensionPixelSize;
            nl4.c(nl4.f6564R.X((float) dimensionPixelSize));
            nl4.f6568c = true;
        }
        nl4.O = w.getDimensionPixelSize(20, 0);
        nl4.f6560R = vd.u(w.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        nl4.f6559R = lTs.m(getContext(), w, 6);
        nl4.f6570v = lTs.m(getContext(), w, 19);
        nl4.f6567c = lTs.m(getContext(), w, 16);
        nl4.f6569e = w.getBoolean(5, false);
        nl4.L = w.getDimensionPixelSize(9, 0);
        nl4.f6566X = w.getBoolean(21, true);
        WeakHashMap weakHashMap = of5.f6887R;
        int O = eHQ.O(this);
        int paddingTop = getPaddingTop();
        int X = eHQ.X(this);
        int paddingBottom = getPaddingBottom();
        if (w.hasValue(0)) {
            nl4.f6571v = true;
            setSupportBackgroundTintList(nl4.f6559R);
            setSupportBackgroundTintMode(nl4.f6560R);
        } else {
            nl4.X();
        }
        eHQ.H(this, O + nl4.R, paddingTop + nl4.c, X + nl4.v, paddingBottom + nl4.e);
        w.recycle();
        setCompoundDrawablePadding(this.L);
        c(this.f2291R != null ? true : z);
    }

    private String getA11yClassName() {
        nl4 nl4 = this.f2294R;
        return (nl4 != null && nl4.f6569e ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        int i = 0;
        for (int i2 = 0; i2 < lineCount; i2++) {
            CharSequence subSequence = getText().subSequence(getLayout().getLineStart(i2), getLayout().getLineEnd(i2));
            TextPaint paint = getPaint();
            String charSequence = subSequence.toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            i = Math.max(i, Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth()));
        }
        return i;
    }

    public final boolean R() {
        nl4 nl4 = this.f2294R;
        return nl4 != null && !nl4.f6571v;
    }

    public final void c(boolean z) {
        Drawable drawable = this.f2291R;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f2291R = mutate;
            cAO.Z(mutate, this.f2289R);
            PorterDuff.Mode mode = this.f2290R;
            if (mode != null) {
                cAO.m(this.f2291R, mode);
            }
            int i = this.e;
            if (i == 0) {
                i = this.f2291R.getIntrinsicWidth();
            }
            int i2 = this.e;
            if (i2 == 0) {
                i2 = this.f2291R.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2291R;
            int i3 = this.X;
            int i4 = this.O;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f2291R.setVisible(true, z);
        }
        if (z) {
            v();
            return;
        }
        Drawable[] R2 = nDi.R(this);
        Drawable drawable3 = R2[0];
        Drawable drawable4 = R2[1];
        Drawable drawable5 = R2[2];
        int i5 = this.Z;
        if (!(i5 == 1 || i5 == 2) || drawable3 == this.f2291R) {
            if (!(i5 == 3 || i5 == 4) || drawable5 == this.f2291R) {
                if (!(i5 == 16 || i5 == 32) || drawable4 == this.f2291R) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            v();
        }
    }

    public final void e(int i, int i2) {
        if (this.f2291R != null && getLayout() != null) {
            int i3 = this.Z;
            boolean z = true;
            if (!(i3 == 1 || i3 == 2)) {
                if (!(i3 == 3 || i3 == 4)) {
                    if (!(i3 == 16 || i3 == 32)) {
                        z = false;
                    }
                    if (z) {
                        this.X = 0;
                        if (i3 == 16) {
                            this.O = 0;
                            c(false);
                            return;
                        }
                        int i4 = this.e;
                        if (i4 == 0) {
                            i4 = this.f2291R.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.L) - getPaddingBottom()) / 2);
                        if (this.O != max) {
                            this.O = max;
                            c(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.O = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i5 = this.Z;
            if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                this.X = 0;
                c(false);
                return;
            }
            int i6 = this.e;
            if (i6 == 0) {
                i6 = this.f2291R.getIntrinsicWidth();
            }
            int textLayoutWidth = i - getTextLayoutWidth();
            WeakHashMap weakHashMap = of5.f6887R;
            int X = (((textLayoutWidth - eHQ.X(this)) - i6) - this.L) - eHQ.O(this);
            if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                X /= 2;
            }
            boolean z2 = eHQ.e(this) == 1;
            if (this.Z != 4) {
                z = false;
            }
            if (z2 != z) {
                X = -X;
            }
            if (this.X != X) {
                this.X = X;
                c(false);
            }
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (R()) {
            return this.f2294R.X;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2291R;
    }

    public int getIconGravity() {
        return this.Z;
    }

    public int getIconPadding() {
        return this.L;
    }

    public int getIconSize() {
        return this.e;
    }

    public ColorStateList getIconTint() {
        return this.f2289R;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2290R;
    }

    public int getInsetBottom() {
        return this.f2294R.e;
    }

    public int getInsetTop() {
        return this.f2294R.c;
    }

    public ColorStateList getRippleColor() {
        if (R()) {
            return this.f2294R.f6567c;
        }
        return null;
    }

    public dOE getShapeAppearanceModel() {
        if (R()) {
            return this.f2294R.f6564R;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (R()) {
            return this.f2294R.f6570v;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (R()) {
            return this.f2294R.O;
        }
        return 0;
    }

    @Override // defpackage.GV
    public ColorStateList getSupportBackgroundTintList() {
        return R() ? this.f2294R.f6559R : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.GV
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return R() ? this.f2294R.f6560R : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2295R;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (R()) {
            hDC.k(this, this.f2294R.v(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        nl4 nl4 = this.f2294R;
        if (nl4 != null && nl4.f6569e) {
            View.mergeDrawableStates(onCreateDrawableState, R);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, v);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.GV, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // defpackage.GV, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        nl4 nl4 = this.f2294R;
        accessibilityNodeInfo.setCheckable(nl4 != null && nl4.f6569e);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.GV, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k_4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k_4 k_4 = (k_4) parcelable;
        super.onRestoreInstanceState(((OG) k_4).f327R);
        setChecked(k_4.R);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        k_4 k_4 = new k_4(super.onSaveInstanceState());
        k_4.R = this.f2295R;
        return k_4;
    }

    @Override // defpackage.GV, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f2294R.f6566X) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2291R != null) {
            if (this.f2291R.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (R()) {
            nl4 nl4 = this.f2294R;
            if (nl4.v(false) != null) {
                nl4.v(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // defpackage.GV, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!R()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            nl4 nl4 = this.f2294R;
            nl4.f6571v = true;
            nl4.f6563R.setSupportBackgroundTintList(nl4.f6559R);
            nl4.f6563R.setSupportBackgroundTintMode(nl4.f6560R);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    @Override // defpackage.GV, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? aH9.p(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (R()) {
            this.f2294R.f6569e = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        nl4 nl4 = this.f2294R;
        if ((nl4 != null && nl4.f6569e) && isEnabled() && this.f2295R != z) {
            this.f2295R = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.f2295R;
                if (!materialButtonToggleGroup.f2301R) {
                    materialButtonToggleGroup.v(getId(), z2);
                }
            }
            if (!this.f2296v) {
                this.f2296v = true;
                Iterator it = this.f2293R.iterator();
                while (it.hasNext()) {
                    ((me2) it.next()).R();
                }
                this.f2296v = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (R()) {
            nl4 nl4 = this.f2294R;
            if (!nl4.f6568c || nl4.X != i) {
                nl4.X = i;
                nl4.f6568c = true;
                nl4.c(nl4.f6564R.X((float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (R()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (R()) {
            this.f2294R.v(false).U(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2291R != drawable) {
            this.f2291R = drawable;
            c(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.Z != i) {
            this.Z = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.L != i) {
            this.L = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? aH9.p(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.e != i) {
            this.e = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2289R != colorStateList) {
            this.f2289R = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2290R != mode) {
            this.f2290R = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C1.v(getContext(), i));
    }

    public void setInsetBottom(int i) {
        nl4 nl4 = this.f2294R;
        nl4.e(nl4.c, i);
    }

    public void setInsetTop(int i) {
        nl4 nl4 = this.f2294R;
        nl4.e(i, nl4.e);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(etI eti) {
        this.f2292R = eti;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        etI eti = this.f2292R;
        if (eti != null) {
            ((MaterialButtonToggleGroup) ((gL6) eti).R).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (R()) {
            nl4 nl4 = this.f2294R;
            if (nl4.f6567c != colorStateList) {
                nl4.f6567c = colorStateList;
                if (nl4.f6563R.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) nl4.f6563R.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (R()) {
            setRippleColor(C1.v(getContext(), i));
        }
    }

    @Override // defpackage.kOI
    public void setShapeAppearanceModel(dOE doe) {
        if (R()) {
            this.f2294R.c(doe);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (R()) {
            nl4 nl4 = this.f2294R;
            nl4.f6565R = z;
            nl4.O();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (R()) {
            nl4 nl4 = this.f2294R;
            if (nl4.f6570v != colorStateList) {
                nl4.f6570v = colorStateList;
                nl4.O();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (R()) {
            setStrokeColor(C1.v(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (R()) {
            nl4 nl4 = this.f2294R;
            if (nl4.O != i) {
                nl4.O = i;
                nl4.O();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (R()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.GV
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (R()) {
            nl4 nl4 = this.f2294R;
            if (nl4.f6559R != colorStateList) {
                nl4.f6559R = colorStateList;
                if (nl4.v(false) != null) {
                    cAO.Z(nl4.v(false), nl4.f6559R);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // defpackage.GV
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (R()) {
            nl4 nl4 = this.f2294R;
            if (nl4.f6560R != mode) {
                nl4.f6560R = mode;
                if (nl4.v(false) != null && nl4.f6560R != null) {
                    cAO.m(nl4.v(false), nl4.f6560R);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f2294R.f6566X = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2295R);
    }

    public final void v() {
        int i = this.Z;
        boolean z = false;
        if (i == 1 || i == 2) {
            nDi.X(this, this.f2291R, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            nDi.X(this, null, null, this.f2291R, null);
            return;
        }
        if (i == 16 || i == 32) {
            z = true;
        }
        if (z) {
            nDi.X(this, null, this.f2291R, null, null);
        }
    }
}
