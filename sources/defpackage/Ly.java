package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: Ly  reason: default package */
/* loaded from: classes.dex */
public final class Ly extends CheckedTextView {
    public final Jd R;

    /* renamed from: R  reason: collision with other field name */
    public mM f285R;

    /* renamed from: R  reason: collision with other field name */
    public final pd f286R;

    /* renamed from: R  reason: collision with other field name */
    public final wD f287R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Ly(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        by3.R(context);
        lM2.R(this, getContext());
        wD wDVar = new wD(this);
        this.f287R = wDVar;
        wDVar.O(attributeSet, R.attr.checkedTextViewStyle);
        wDVar.v();
        Jd jd = new Jd(this);
        this.R = jd;
        jd.X(attributeSet, R.attr.checkedTextViewStyle);
        pd pdVar = new pd(this, 0);
        this.f286R = pdVar;
        pdVar.c(attributeSet, R.attr.checkedTextViewStyle);
        getEmojiTextViewHelper().v(attributeSet, R.attr.checkedTextViewStyle);
    }

    private mM getEmojiTextViewHelper() {
        if (this.f285R == null) {
            this.f285R = new mM(this);
        }
        return this.f285R;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        wD wDVar = this.f287R;
        if (wDVar != null) {
            wDVar.v();
        }
        Jd jd = this.R;
        if (jd != null) {
            jd.R();
        }
        pd pdVar = this.f286R;
        if (pdVar != null) {
            pdVar.v();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
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

    public ColorStateList getSupportCheckMarkTintList() {
        pd pdVar = this.f286R;
        if (pdVar != null) {
            return pdVar.f7128R;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        pd pdVar = this.f286R;
        if (pdVar != null) {
            return pdVar.f7129R;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f287R.e();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f287R.X();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        aH9.q(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        pd pdVar = this.f286R;
        if (pdVar == null) {
            return;
        }
        if (pdVar.c) {
            pdVar.c = false;
            return;
        }
        pdVar.c = true;
        pdVar.v();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wD wDVar = this.f287R;
        if (wDVar != null) {
            wDVar.v();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wD wDVar = this.f287R;
        if (wDVar != null) {
            wDVar.v();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        pd pdVar = this.f286R;
        if (pdVar != null) {
            pdVar.f7128R = colorStateList;
            pdVar.f7131R = true;
            pdVar.v();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        pd pdVar = this.f286R;
        if (pdVar != null) {
            pdVar.f7129R = mode;
            pdVar.v = true;
            pdVar.v();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f287R.Z(colorStateList);
        this.f287R.v();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f287R.m(mode);
        this.f287R.v();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        wD wDVar = this.f287R;
        if (wDVar != null) {
            wDVar.L(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(aH9.p(getContext(), i));
    }
}
