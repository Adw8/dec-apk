package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: fSH  reason: default package */
/* loaded from: classes.dex */
public final class fSH extends InputConnectionWrapper {
    public final TextView R;

    /* renamed from: R  reason: collision with other field name */
    public final dq f3421R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fSH(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        dq dqVar = new dq((Object) null);
        boolean z = false;
        this.R = editText;
        this.f3421R = dqVar;
        if (dfg.R != null) {
            dfg R = dfg.R();
            if ((R.v() == 1 ? true : z) && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                R.f2808R.T(editorInfo);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        dq dqVar = this.f3421R;
        Editable editableText = this.R.getEditableText();
        dqVar.getClass();
        return dq.K(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        dq dqVar = this.f3421R;
        Editable editableText = this.R.getEditableText();
        dqVar.getClass();
        return dq.K(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
