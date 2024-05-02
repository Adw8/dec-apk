package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: dq6  reason: default package */
/* loaded from: classes.dex */
public final class dq6 extends G5 {
    public final TextInputLayout R;

    public dq6(TextInputLayout textInputLayout) {
        this.R = textInputLayout;
    }

    @Override // defpackage.G5
    public final void X(View view, AccessibilityEvent accessibilityEvent) {
        super.X(view, accessibilityEvent);
        this.R.f2362R.v().P(accessibilityEvent);
    }

    @Override // defpackage.G5
    public final void e(View view, jG jGVar) {
        ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
        EditText editText = this.R.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = this.R.getHint();
        CharSequence error = this.R.getError();
        CharSequence placeholderText = this.R.getPlaceholderText();
        int counterMaxLength = this.R.getCounterMaxLength();
        CharSequence counterOverflowDescription = this.R.getCounterOverflowDescription();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        boolean z3 = !this.R.f2371Z;
        boolean z4 = !TextUtils.isEmpty(error);
        boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
        String charSequence = z2 ? hint.toString() : "";
        doZ doz = this.R.f2360R;
        if (doz.R.getVisibility() == 0) {
            jGVar.f4895R.setLabelFor(doz.R);
            jGVar.f4895R.setTraversalAfter(doz.R);
        } else {
            jGVar.f4895R.setTraversalAfter(doz.f2870R);
        }
        if (z) {
            jGVar.H(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            jGVar.H(charSequence);
            if (z3 && placeholderText != null) {
                jGVar.H(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            jGVar.H(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            jGVar.f4895R.setHintText(charSequence);
            jGVar.f4895R.setShowingHintText(!z);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        jGVar.f4895R.setMaxTextLength(counterMaxLength);
        if (z5) {
            if (!z4) {
                error = counterOverflowDescription;
            }
            jGVar.f4895R.setError(error);
        }
        TC tc = this.R.f2365R.f6530v;
        if (tc != null) {
            jGVar.f4895R.setLabelFor(tc);
        }
        this.R.f2362R.v().N(jGVar);
    }
}
