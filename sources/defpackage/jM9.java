package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: jM9  reason: default package */
/* loaded from: classes.dex */
public final class jM9 implements TextWatcher {
    public final EditText R;

    /* renamed from: R  reason: collision with other field name */
    public lOo f4905R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4906R = false;
    public boolean v = true;

    public jM9(EditText editText) {
        this.R = editText;
    }

    public static void R(EditText editText, int i) {
        int i2;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            dfg R = dfg.R();
            if (editableText == null) {
                i2 = 0;
            } else {
                R.getClass();
                i2 = editableText.length();
            }
            R.O(0, i2, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if ((defpackage.dfg.R != null) == false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    @Override // android.text.TextWatcher
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            android.widget.EditText r0 = r3.R
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L_0x0056
            boolean r0 = r3.v
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001b
            boolean r0 = r3.f4906R
            if (r0 != 0) goto L_0x001c
            dfg r0 = defpackage.dfg.R
            if (r0 == 0) goto L_0x0018
            r0 = r2
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0056
        L_0x001f:
            if (r6 > r7) goto L_0x0056
            boolean r6 = r4 instanceof android.text.Spannable
            if (r6 == 0) goto L_0x0056
            dfg r6 = defpackage.dfg.R()
            int r6 = r6.v()
            if (r6 == 0) goto L_0x0040
            if (r6 == r2) goto L_0x0035
            r4 = 3
            if (r6 == r4) goto L_0x0040
            goto L_0x0056
        L_0x0035:
            android.text.Spannable r4 = (android.text.Spannable) r4
            dfg r3 = defpackage.dfg.R()
            int r7 = r7 + r5
            r3.O(r5, r7, r4)
            goto L_0x0056
        L_0x0040:
            dfg r4 = defpackage.dfg.R()
            lOo r5 = r3.f4905R
            if (r5 != 0) goto L_0x0051
            lOo r5 = new lOo
            android.widget.EditText r6 = r3.R
            r5.<init>(r6)
            r3.f4905R = r5
        L_0x0051:
            lOo r3 = r3.f4905R
            r4.L(r3)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jM9.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
