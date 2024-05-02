package defpackage;

import android.text.Editable;

/* renamed from: hHZ  reason: default package */
/* loaded from: classes.dex */
public final class hHZ extends gPo {
    public final /* synthetic */ iOp R;

    public hHZ(iOp iop) {
        this.R = iop;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.R.v().R();
    }

    @Override // defpackage.gPo, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.R.v().v();
    }
}
