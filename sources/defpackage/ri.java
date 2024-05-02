package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: ri  reason: default package */
/* loaded from: classes.dex */
public class ri extends RadioButton implements m_K {
    public final Jd R;

    /* renamed from: R  reason: collision with other field name */
    public mM f7396R;

    /* renamed from: R  reason: collision with other field name */
    public final pd f7397R;

    /* renamed from: R  reason: collision with other field name */
    public final wD f7398R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ri(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        by3.R(context);
        lM2.R(this, getContext());
        pd pdVar = new pd(this, 1);
        this.f7397R = pdVar;
        pdVar.c(attributeSet, R.attr.radioButtonStyle);
        Jd jd = new Jd(this);
        this.R = jd;
        jd.X(attributeSet, R.attr.radioButtonStyle);
        wD wDVar = new wD(this);
        this.f7398R = wDVar;
        wDVar.O(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().v(attributeSet, R.attr.radioButtonStyle);
    }

    private mM getEmojiTextViewHelper() {
        if (this.f7396R == null) {
            this.f7396R = new mM(this);
        }
        return this.f7396R;
    }

    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Jd jd = this.R;
        if (jd != null) {
            jd.R();
        }
        wD wDVar = this.f7398R;
        if (wDVar != null) {
            wDVar.v();
        }
    }

    @Override // android.widget.TextView, android.widget.CompoundButton
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        pd pdVar = this.f7397R;
        if (pdVar != null) {
            pdVar.getClass();
        }
        return compoundPaddingLeft;
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

    @Override // defpackage.m_K
    public ColorStateList getSupportButtonTintList() {
        pd pdVar = this.f7397R;
        if (pdVar != null) {
            return pdVar.f7128R;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        pd pdVar = this.f7397R;
        if (pdVar != null) {
            return pdVar.f7129R;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7398R.e();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7398R.X();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        pd pdVar = this.f7397R;
        if (pdVar == null) {
            return;
        }
        if (pdVar.c) {
            pdVar.c = false;
            return;
        }
        pdVar.c = true;
        pdVar.R();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wD wDVar = this.f7398R;
        if (wDVar != null) {
            wDVar.v();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wD wDVar = this.f7398R;
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

    @Override // defpackage.m_K
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        pd pdVar = this.f7397R;
        if (pdVar != null) {
            pdVar.f7128R = colorStateList;
            pdVar.f7131R = true;
            pdVar.R();
        }
    }

    @Override // defpackage.m_K
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        pd pdVar = this.f7397R;
        if (pdVar != null) {
            pdVar.f7129R = mode;
            pdVar.v = true;
            pdVar.R();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7398R.Z(colorStateList);
        this.f7398R.v();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7398R.m(mode);
        this.f7398R.v();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(aH9.p(getContext(), i));
    }
}
