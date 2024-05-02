package defpackage;

import androidx.work.OverwritingInputMerger;

/* renamed from: mxl  reason: default package */
/* loaded from: classes.dex */
public final class mxl extends oJN {
    public mxl(Class cls) {
        super(cls);
        ((oJN) this).f6742R.f5565c = OverwritingInputMerger.class.getName();
    }

    @Override // defpackage.oJN
    public final oJN c() {
        return this;
    }

    @Override // defpackage.oJN
    public final lyz v() {
        if (!((oJN) this).f6743R || !((oJN) this).f6742R.f5559R.f2443v) {
            return new i7a(this);
        }
        throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
    }
}
