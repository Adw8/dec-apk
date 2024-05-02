package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import java.util.HashSet;

/* renamed from: D8  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class D8 implements View.OnClickListener {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ D8(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.e) {
            case 0:
                UU uu = (UU) this.R;
                EditText editText = uu.f561R;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    uu.g();
                    return;
                }
                return;
            case 1:
                ((heD) this.R).V();
                return;
            case 2:
                oA2 oa2 = (oA2) this.R;
                EditText editText2 = oa2.f6697R;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = oa2.f6697R;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        oa2.f6697R.setTransformationMethod(null);
                    } else {
                        oa2.f6697R.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        oa2.f6697R.setSelection(selectionEnd);
                    }
                    oa2.g();
                    return;
                }
                return;
            default:
                mpr mpr = (mpr) this.R;
                f25 Z = mpr.Z();
                mY_ my_ = mY_.x;
                HashSet hashSet = new HashSet();
                int i = f25.L;
                hashSet.add(Integer.valueOf(n2G.m(Z).e));
                mpr.O();
                if (!mpr.C()) {
                    ((Boolean) my_.g()).booleanValue();
                    return;
                }
                return;
        }
    }
}
