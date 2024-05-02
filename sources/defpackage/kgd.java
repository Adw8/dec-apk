package defpackage;

/* renamed from: kgd  reason: default package */
/* loaded from: classes.dex */
public final class kgd implements ddq {
    public final kg9 R;

    /* renamed from: R  reason: collision with other field name */
    public nRn f5393R;

    public kgd(kg9 kg9) {
        this.R = kg9;
    }

    @Override // defpackage.ddq
    public final void R() {
        nRn nrn = this.f5393R;
        if (nrn != null) {
            nrn.R();
        }
        this.f5393R = null;
    }

    @Override // defpackage.ddq
    public final void c() {
    }

    @Override // defpackage.ddq
    public final void v() {
        this.f5393R = (nRn) this.R.x(caw.R);
    }
}
