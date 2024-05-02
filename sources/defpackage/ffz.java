package defpackage;

/* renamed from: ffz  reason: default package */
/* loaded from: classes.dex */
public final class ffz extends rS {
    public long R = -1;

    /* renamed from: R  reason: collision with other field name */
    public xx f3496R;

    @Override // defpackage.rS
    public final boolean R(lo loVar) {
        bLS bls = (bLS) loVar;
        if (this.R >= 0) {
            return false;
        }
        long j = bls.R;
        if (j < bls.v) {
            bls.v = j;
        }
        this.R = j;
        return true;
    }

    @Override // defpackage.rS
    public final aOO[] v(lo loVar) {
        long j = this.R;
        this.R = -1;
        this.f3496R = null;
        return ((bLS) loVar).o(j);
    }
}
