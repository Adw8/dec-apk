package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: yp  reason: default package */
/* loaded from: classes.dex */
public class yp extends AutoCompleteTextView {
    public static final int[] R = {16843126};

    /* renamed from: R  reason: collision with other field name */
    public final Jd f7489R;

    /* renamed from: R  reason: collision with other field name */
    public final h5 f7490R;

    /* renamed from: R  reason: collision with other field name */
    public final wD f7491R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public yp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        by3.R(context);
        lM2.R(this, getContext());
        CV h = CV.h(getContext(), attributeSet, R, R.attr.autoCompleteTextViewStyle, 0);
        if (h.o(0)) {
            setDropDownBackgroundDrawable(h.U(0));
        }
        h.z();
        Jd jd = new Jd(this);
        this.f7489R = jd;
        jd.X(attributeSet, R.attr.autoCompleteTextViewStyle);
        wD wDVar = new wD(this);
        this.f7491R = wDVar;
        wDVar.O(attributeSet, R.attr.autoCompleteTextViewStyle);
        wDVar.v();
        h5 h5Var = new h5((EditText) this);
        this.f7490R = h5Var;
        h5Var.P(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener U = h5Var.U(keyListener);
            if (U != keyListener) {
                super.setKeyListener(U);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Jd jd = this.f7489R;
        if (jd != null) {
            jd.R();
        }
        wD wDVar = this.f7491R;
        if (wDVar != null) {
            wDVar.v();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        Jd jd = this.f7489R;
        if (jd != null) {
            return jd.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Jd jd = this.f7489R;
        if (jd != null) {
            return jd.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7491R.e();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7491R.X();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        aH9.q(this, editorInfo, onCreateInputConnection);
        return this.f7490R.y(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Jd jd = this.f7489R;
        if (jd != null) {
            jd.O();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        Jd jd = this.f7489R;
        if (jd != null) {
            jd.L(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wD wDVar = this.f7491R;
        if (wDVar != null) {
            wDVar.v();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wD wDVar = this.f7491R;
        if (wDVar != null) {
            wDVar.v();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(aH9.p(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((hw1) ((nhs) this.f7490R.v).f6515R).J(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f7490R.U(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Jd jd = this.f7489R;
        if (jd != null) {
            jd.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Jd jd = this.f7489R;
        if (jd != null) {
            jd.x(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7491R.Z(colorStateList);
        this.f7491R.v();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7491R.m(mode);
        this.f7491R.v();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        wD wDVar = this.f7491R;
        if (wDVar != null) {
            wDVar.L(context, i);
        }
    }
}
