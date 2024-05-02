package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: e54  reason: default package */
/* loaded from: classes.dex */
public final class e54 implements InputFilter {
    public final TextView R;

    /* renamed from: R  reason: collision with other field name */
    public bYH f2970R;

    public e54(TextView textView) {
        this.R = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.R.isInEditMode()) {
            return charSequence;
        }
        int v = dfg.R().v();
        if (v != 0) {
            boolean z = true;
            if (v == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.R.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return dfg.R().O(0, charSequence.length(), charSequence);
            } else if (v != 3) {
                return charSequence;
            }
        }
        dfg R = dfg.R();
        if (this.f2970R == null) {
            this.f2970R = new bYH(this.R, this);
        }
        R.L(this.f2970R);
        return charSequence;
    }
}
