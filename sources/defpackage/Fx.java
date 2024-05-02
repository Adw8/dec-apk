package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: Fx  reason: default package */
/* loaded from: classes.dex */
public class Fx extends EditText {
    public final Jd R;

    /* renamed from: R  reason: collision with other field name */
    public final h5 f150R;

    /* renamed from: R  reason: collision with other field name */
    public final wD f151R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Fx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.editTextStyle);
        by3.R(context);
        lM2.R(this, getContext());
        Jd jd = new Jd(this);
        this.R = jd;
        jd.X(attributeSet, R.attr.editTextStyle);
        wD wDVar = new wD(this);
        this.f151R = wDVar;
        wDVar.O(attributeSet, R.attr.editTextStyle);
        wDVar.v();
        new h5((TextView) this);
        h5 h5Var = new h5((EditText) this);
        this.f150R = h5Var;
        h5Var.P(attributeSet, R.attr.editTextStyle);
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
        Jd jd = this.R;
        if (jd != null) {
            jd.R();
        }
        wD wDVar = this.f151R;
        if (wDVar != null) {
            wDVar.v();
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f151R.e();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f151R.X();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f151R.getClass();
        aH9.q(this, editorInfo, onCreateInputConnection);
        return this.f150R.y(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        return super.onTextContextMenuItem(i);
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wD wDVar = this.f151R;
        if (wDVar != null) {
            wDVar.v();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wD wDVar = this.f151R;
        if (wDVar != null) {
            wDVar.v();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((hw1) ((nhs) this.f150R.v).f6515R).J(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f150R.U(keyListener));
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
        this.f151R.Z(colorStateList);
        this.f151R.v();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f151R.m(mode);
        this.f151R.v();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        wD wDVar = this.f151R;
        if (wDVar != null) {
            wDVar.L(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
