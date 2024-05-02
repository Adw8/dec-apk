package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Slider extends oN {
    public Slider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842788});
        if (obtainStyledAttributes.hasValue(0)) {
            setValue(obtainStyledAttributes.getFloat(0, 0.0f));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.oN, android.view.View
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    public int getActiveThumbIndex() {
        return this.j;
    }

    public int getFocusedThumbIndex() {
        return this.g;
    }

    public int getHaloRadius() {
        return this.N;
    }

    public ColorStateList getHaloTintList() {
        return ((oN) this).f6777R;
    }

    public int getLabelBehavior() {
        return this.x;
    }

    public float getStepSize() {
        return ((oN) this).e;
    }

    public float getThumbElevation() {
        return ((oN) this).f6782R.f1920R.X;
    }

    public int getThumbRadius() {
        return this.C;
    }

    public ColorStateList getThumbStrokeColor() {
        return ((oN) this).f6782R.f1920R.f6916v;
    }

    public float getThumbStrokeWidth() {
        return ((oN) this).f6782R.f1920R.c;
    }

    public ColorStateList getThumbTintList() {
        return ((oN) this).f6782R.f1920R.f6903R;
    }

    public ColorStateList getTickActiveTintList() {
        return ((oN) this).f6804v;
    }

    public ColorStateList getTickInactiveTintList() {
        return ((oN) this).f6794c;
    }

    public ColorStateList getTickTintList() {
        if (((oN) this).f6794c.equals(((oN) this).f6804v)) {
            return ((oN) this).f6804v;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return ((oN) this).f6799e;
    }

    public int getTrackHeight() {
        return this.H;
    }

    public ColorStateList getTrackInactiveTintList() {
        return ((oN) this).f6791X;
    }

    public int getTrackSidePadding() {
        return this.U;
    }

    public ColorStateList getTrackTintList() {
        if (((oN) this).f6791X.equals(((oN) this).f6799e)) {
            return ((oN) this).f6799e;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.y;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // defpackage.oN
    public float getValueFrom() {
        return ((oN) this).v;
    }

    @Override // defpackage.oN
    public float getValueTo() {
        return ((oN) this).c;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    @Override // defpackage.oN, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= ((oN) this).f6801e.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.g = i;
        ((oN) this).f6787R.K(i);
        postInvalidate();
    }

    @Override // defpackage.oN
    public void setHaloRadius(int i) {
        if (i != this.N) {
            this.N = i;
            Drawable background = getBackground();
            if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                ((RippleDrawable) background).setRadius(this.N);
            }
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // defpackage.oN
    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(((oN) this).f6777R)) {
            ((oN) this).f6777R = colorStateList;
            Drawable background = getBackground();
            if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
                ((oN) this).f6800e.setColor(Z(colorStateList));
                ((oN) this).f6800e.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // defpackage.oN
    public void setLabelBehavior(int i) {
        if (this.x != i) {
            this.x = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(go7 go7) {
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f), Float.valueOf(((oN) this).v), Float.valueOf(((oN) this).c)));
        } else if (((oN) this).e != f) {
            ((oN) this).e = f;
            ((oN) this).f6793X = true;
            postInvalidate();
        }
    }

    @Override // defpackage.oN
    public void setThumbElevation(float f) {
        ((oN) this).f6782R.U(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // defpackage.oN
    public void setThumbRadius(int i) {
        if (i != this.C) {
            this.C = i;
            c18 c18 = ((oN) this).f6782R;
            nBP nbp = new nBP();
            jy3 x = hDC.x(0);
            nbp.f6343R = x;
            nBP.v(x);
            nbp.f6349v = x;
            nBP.v(x);
            nbp.f6345c = x;
            nBP.v(x);
            nbp.f6347e = x;
            nBP.v(x);
            nbp.c((float) this.C);
            c18.setShapeAppearanceModel(new dOE(nbp));
            c18 c182 = ((oN) this).f6782R;
            int i2 = this.C * 2;
            c182.setBounds(0, 0, i2, i2);
            Drawable drawable = ((oN) this).f6779R;
            if (drawable != null) {
                R(drawable);
            }
            for (Drawable drawable2 : ((oN) this).f6785R) {
                R(drawable2);
            }
            K();
        }
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // defpackage.oN
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        ((oN) this).f6782R.g(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(C1.v(getContext(), i));
        }
    }

    @Override // defpackage.oN
    public void setThumbStrokeWidth(float f) {
        c18 c18 = ((oN) this).f6782R;
        c18.f1920R.c = f;
        c18.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(((oN) this).f6782R.f1920R.f6903R)) {
            ((oN) this).f6782R.C(colorStateList);
            invalidate();
        }
    }

    @Override // defpackage.oN
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(((oN) this).f6804v)) {
            ((oN) this).f6804v = colorStateList;
            ((oN) this).f6774O.setColor(Z(colorStateList));
            invalidate();
        }
    }

    @Override // defpackage.oN
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(((oN) this).f6794c)) {
            ((oN) this).f6794c = colorStateList;
            ((oN) this).f6792X.setColor(Z(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (((oN) this).f6797c != z) {
            ((oN) this).f6797c = z;
            postInvalidate();
        }
    }

    @Override // defpackage.oN
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(((oN) this).f6799e)) {
            ((oN) this).f6799e = colorStateList;
            ((oN) this).f6805v.setColor(Z(colorStateList));
            invalidate();
        }
    }

    @Override // defpackage.oN
    public void setTrackHeight(int i) {
        if (this.H != i) {
            this.H = i;
            ((oN) this).f6778R.setStrokeWidth((float) i);
            ((oN) this).f6805v.setStrokeWidth((float) this.H);
            ((oN) this).f6792X.setStrokeWidth(((float) this.H) / 2.0f);
            ((oN) this).f6774O.setStrokeWidth(((float) this.H) / 2.0f);
            K();
        }
    }

    @Override // defpackage.oN
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(((oN) this).f6791X)) {
            ((oN) this).f6791X = colorStateList;
            ((oN) this).f6778R.setColor(Z(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        ((oN) this).v = f;
        ((oN) this).f6793X = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        ((oN) this).c = f;
        ((oN) this).f6793X = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        R(newDrawable);
        ((oN) this).f6779R = newDrawable;
        ((oN) this).f6785R.clear();
        postInvalidate();
    }
}
