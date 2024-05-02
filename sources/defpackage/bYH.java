package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: bYH  reason: default package */
/* loaded from: classes.dex */
public final class bYH extends jbB {
    public final WeakReference R;
    public final WeakReference v;

    public bYH(TextView textView, e54 e54) {
        this.R = new WeakReference(textView);
        this.v = new WeakReference(e54);
    }

    @Override // defpackage.jbB
    public final void v() {
        boolean z;
        int i;
        InputFilter[] filters;
        TextView textView = (TextView) this.R.get();
        InputFilter inputFilter = (InputFilter) this.v.get();
        if (!(inputFilter == null || textView == null || (filters = textView.getFilters()) == null)) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z && textView.isAttachedToWindow()) {
            CharSequence text = textView.getText();
            dfg R = dfg.R();
            if (text == null) {
                i = 0;
            } else {
                R.getClass();
                i = text.length();
            }
            CharSequence O = R.O(0, i, text);
            if (text != O) {
                int selectionStart = Selection.getSelectionStart(O);
                int selectionEnd = Selection.getSelectionEnd(O);
                textView.setText(O);
                if (O instanceof Spannable) {
                    Spannable spannable = (Spannable) O;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }
}
