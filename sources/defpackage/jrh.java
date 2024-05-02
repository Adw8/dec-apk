package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* renamed from: jrh  reason: default package */
/* loaded from: classes.dex */
public final class jrh extends dq {
    public final hnT R;

    public jrh(TextView textView) {
        super((Object) null);
        this.R = new hnT(textView);
    }

    @Override // defpackage.dq
    public final void I(boolean z) {
        if (!(!(dfg.R != null))) {
            this.R.I(z);
        }
    }

    @Override // defpackage.dq
    public final boolean J() {
        return this.R.f4382R;
    }

    @Override // defpackage.dq
    public final InputFilter[] i(InputFilter[] inputFilterArr) {
        return (dfg.R != null) ^ true ? inputFilterArr : this.R.i(inputFilterArr);
    }

    @Override // defpackage.dq
    public final TransformationMethod n(TransformationMethod transformationMethod) {
        return (dfg.R != null) ^ true ? transformationMethod : this.R.n(transformationMethod);
    }

    @Override // defpackage.dq
    public final void u(boolean z) {
        if (!(dfg.R != null)) {
            this.R.f4382R = z;
        } else {
            this.R.u(z);
        }
    }
}
