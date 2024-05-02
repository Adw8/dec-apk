package defpackage;

/* renamed from: cg1  reason: default package */
/* loaded from: classes.dex */
public final class cg1 extends dR6 {
    public final dR6 R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f2175R;
    public final boolean c;
    public final boolean v = false;

    public cg1(dR6 dr6, kg9 kg9, boolean z) {
        super(0, nQA.R);
        kg9 kg92;
        this.R = dr6;
        this.c = z;
        this.f2175R = jwU.Z(kg9, (dr6 == null || (kg92 = dr6.O()) == null) ? ((kpt) ((n3s) jwU.f5152R.get())).f5441R : kg92, false);
    }

    @Override // defpackage.dR6
    public final void C(nmZ nmz) {
        t().C(nmz);
    }

    @Override // defpackage.dR6
    public final void H() {
        fk4.R();
        throw null;
    }

    @Override // defpackage.dR6
    public final boolean L() {
        return t().L();
    }

    @Override // defpackage.dR6
    public final kg9 O() {
        return this.f2175R;
    }

    @Override // defpackage.dR6
    public final void U() {
        t().U();
    }

    @Override // defpackage.dR6
    public final nQA X() {
        return t().X();
    }

    @Override // defpackage.dR6
    public final kg9 Z() {
        return null;
    }

    @Override // defpackage.dR6
    public final void c() {
        dR6 dr6;
        ((dR6) this).f2607R = true;
        if (this.c && (dr6 = this.R) != null) {
            dr6.c();
        }
    }

    @Override // defpackage.dR6
    public final int e() {
        return t().e();
    }

    public final dR6 t() {
        dR6 dr6 = this.R;
        return dr6 == null ? (dR6) jwU.f5152R.get() : dr6;
    }

    @Override // defpackage.dR6
    public final void x() {
        fk4.R();
        throw null;
    }

    @Override // defpackage.dR6
    public final dR6 y(kg9 kg9) {
        kg9 Z = jwU.Z(kg9, this.f2175R, true);
        return !this.v ? jwU.X(t().y(null), Z, true) : t().y(Z);
    }
}
