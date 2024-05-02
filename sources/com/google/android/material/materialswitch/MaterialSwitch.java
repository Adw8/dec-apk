package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import dev.kdrag0n.virtcontainer.R;

/* loaded from: classes.dex */
public class MaterialSwitch extends SwitchCompat {
    public static final int[] e = {R.attr.state_with_icon};
    public ColorStateList L;

    /* renamed from: O  reason: collision with other field name */
    public Drawable f2332O;
    public ColorStateList X;
    public PorterDuff.Mode c;

    /* renamed from: c  reason: collision with other field name */
    public int[] f2335c;

    /* renamed from: e  reason: collision with other field name */
    public PorterDuff.Mode f2337e;

    /* renamed from: e  reason: collision with other field name */
    public Drawable f2338e;
    public int[] v;

    /* renamed from: c  reason: collision with other field name */
    public Drawable f2334c = super.getThumbDrawable();

    /* renamed from: e  reason: collision with other field name */
    public ColorStateList f2336e = super.getThumbTintList();

    /* renamed from: X  reason: collision with other field name */
    public Drawable f2333X = super.getTrackDrawable();
    public ColorStateList O = super.getTrackTintList();

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.materialSwitchStyle, 2132018042), attributeSet, R.attr.materialSwitchStyle);
        Context context2 = getContext();
        super.setThumbTintList(null);
        super.setTrackTintList(null);
        int[] iArr = hDC.u;
        aH9.J(context2, attributeSet, R.attr.materialSwitchStyle, 2132018042);
        aH9.Y(context2, attributeSet, iArr, R.attr.materialSwitchStyle, 2132018042, new int[0]);
        CV h = CV.h(context2, attributeSet, iArr, R.attr.materialSwitchStyle, 2132018042);
        this.f2338e = h.U(0);
        this.X = h.m(1);
        this.c = vd.u(h.P(2, -1), PorterDuff.Mode.SRC_IN);
        this.f2332O = h.U(3);
        this.L = h.m(4);
        this.f2337e = vd.u(h.P(5, -1), PorterDuff.Mode.SRC_IN);
        h.z();
        setEnforceSwitchWidth(false);
        O();
        L();
    }

    public static void Z(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable != null && colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, 0);
            int colorForState2 = colorStateList.getColorForState(iArr2, 0);
            ThreadLocal threadLocal = B7.R;
            float f2 = 1.0f - f;
            cAO.L(drawable, Color.argb((int) ((((float) Color.alpha(colorForState2)) * f) + (((float) Color.alpha(colorForState)) * f2)), (int) ((((float) Color.red(colorForState2)) * f) + (((float) Color.red(colorForState)) * f2)), (int) ((((float) Color.green(colorForState2)) * f) + (((float) Color.green(colorForState)) * f2)), (int) ((((float) Color.blue(colorForState2)) * f) + (((float) Color.blue(colorForState)) * f2))));
        }
    }

    public final void L() {
        this.f2333X = cpc.J(this.f2333X, this.O, getTrackTintMode());
        this.f2332O = cpc.J(this.f2332O, this.L, this.f2337e);
        m();
        Drawable drawable = this.f2333X;
        if (drawable != null && this.f2332O != null) {
            drawable = new LayerDrawable(new Drawable[]{this.f2333X, this.f2332O});
        } else if (drawable == null) {
            drawable = this.f2332O;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    public final void O() {
        this.f2334c = cpc.J(this.f2334c, this.f2336e, getThumbTintMode());
        this.f2338e = cpc.J(this.f2338e, this.X, this.c);
        m();
        super.setThumbDrawable(cpc.o(this.f2334c, this.f2338e));
        refreshDrawableState();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.f2334c;
    }

    public Drawable getThumbIconDrawable() {
        return this.f2338e;
    }

    public ColorStateList getThumbIconTintList() {
        return this.X;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.c;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f2336e;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f2332O;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.L;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f2337e;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.f2333X;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.O;
    }

    @Override // android.view.View
    public final void invalidate() {
        m();
        super.invalidate();
    }

    public final void m() {
        if (this.f2336e != null || this.X != null || this.O != null || this.L != null) {
            float thumbPosition = getThumbPosition();
            ColorStateList colorStateList = this.f2336e;
            if (colorStateList != null) {
                Z(this.f2334c, colorStateList, this.v, this.f2335c, thumbPosition);
            }
            ColorStateList colorStateList2 = this.X;
            if (colorStateList2 != null) {
                Z(this.f2338e, colorStateList2, this.v, this.f2335c, thumbPosition);
            }
            ColorStateList colorStateList3 = this.O;
            if (colorStateList3 != null) {
                Z(this.f2333X, colorStateList3, this.v, this.f2335c, thumbPosition);
            }
            ColorStateList colorStateList4 = this.L;
            if (colorStateList4 != null) {
                Z(this.f2332O, colorStateList4, this.v, this.f2335c, thumbPosition);
            }
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f2338e != null) {
            View.mergeDrawableStates(onCreateDrawableState, e);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : onCreateDrawableState) {
            if (i3 != 16842912) {
                i2++;
                iArr[i2] = i3;
            }
        }
        this.v = iArr;
        this.f2335c = cpc.n(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.f2334c = drawable;
        O();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f2338e = drawable;
        O();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(aH9.p(getContext(), i));
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.X = colorStateList;
        O();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        O();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2336e = colorStateList;
        O();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        O();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f2332O = drawable;
        L();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(aH9.p(getContext(), i));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.L = colorStateList;
        L();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f2337e = mode;
        L();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.f2333X = drawable;
        L();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.O = colorStateList;
        L();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        L();
    }
}
