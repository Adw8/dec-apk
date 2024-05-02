package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: iOh  reason: default package */
/* loaded from: classes.dex */
public final class iOh {
    public final /* synthetic */ iOp R;

    public iOh(iOp iop) {
        this.R = iop;
    }

    public final void R(TextInputLayout textInputLayout) {
        if (this.R.f4566R != textInputLayout.getEditText()) {
            iOp iop = this.R;
            EditText editText = iop.f4566R;
            if (editText != null) {
                editText.removeTextChangedListener(iop.f4571R);
                if (this.R.f4566R.getOnFocusChangeListener() == this.R.v().X()) {
                    this.R.f4566R.setOnFocusChangeListener(null);
                }
            }
            this.R.f4566R = textInputLayout.getEditText();
            iOp iop2 = this.R;
            EditText editText2 = iop2.f4566R;
            if (editText2 != null) {
                editText2.addTextChangedListener(iop2.f4571R);
            }
            this.R.v().C(this.R.f4566R);
            iOp iop3 = this.R;
            iop3.m(iop3.v());
        }
    }
}
