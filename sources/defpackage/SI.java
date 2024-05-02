package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: SI  reason: default package */
/* loaded from: classes.dex */
public final class SI extends ToggleButton {
    public final Jd R;

    /* renamed from: R  reason: collision with other field name */
    public mM f512R;

    /* renamed from: R  reason: collision with other field name */
    public final wD f513R;

    public SI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        lM2.R(this, getContext());
        Jd jd = new Jd(this);
        this.R = jd;
        jd.X(attributeSet, 16842827);
        wD wDVar = new wD(this);
        this.f513R = wDVar;
        wDVar.O(attributeSet, 16842827);
        getEmojiTextViewHelper().v(attributeSet, 16842827);
    }

    private mM getEmojiTextViewHelper() {
        if (this.f512R == null) {
            this.f512R = new mM(this);
        }
        return this.f512R;
    }

    @Override // android.widget.ToggleButton, android.widget.TextView, android.widget.CompoundButton, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Jd jd = this.R;
        if (jd != null) {
            jd.R();
        }
        wD wDVar = this.f513R;
        if (wDVar != null) {
            wDVar.v();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        Jd jd = this.R;
        if (jd != null) {
            return jd.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Jd jd = this.R;
        if (jd != null) {
            return jd.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f513R.e();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f513R.X();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Jd jd = this.R;
        if (jd != null) {
            jd.O();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        Jd jd = this.R;
        if (jd != null) {
            jd.L(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wD wDVar = this.f513R;
        if (wDVar != null) {
            wDVar.v();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wD wDVar = this.f513R;
        if (wDVar != null) {
            wDVar.v();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().R(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Jd jd = this.R;
        if (jd != null) {
            jd.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Jd jd = this.R;
        if (jd != null) {
            jd.x(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f513R.Z(colorStateList);
        this.f513R.v();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f513R.m(mode);
        this.f513R.v();
    }
}
