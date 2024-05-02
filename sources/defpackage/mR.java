package defpackage;

/* renamed from: mR  reason: default package */
/* loaded from: classes.dex */
public final class mR extends caw {
    public bpk R;

    public mR(bpk bpk) {
        this.R = bpk;
    }

    @Override // defpackage.caw
    public final boolean C(bsy bsy) {
        return bsy == this.R.r();
    }

    @Override // defpackage.caw
    public final Object t(bsy bsy) {
        if (bsy == this.R.r()) {
            return this.R.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
