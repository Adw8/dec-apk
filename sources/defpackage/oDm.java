package defpackage;

/* renamed from: oDm  reason: default package */
/* loaded from: classes.dex */
public final class oDm extends dR6 {
    public final kg9 R;
    public int e = 1;

    public oDm(int i, nQA nqa, kg9 kg9) {
        super(i, nqa);
        this.R = kg9;
    }

    @Override // defpackage.dR6
    public final void C(nmZ nmz) {
        h5 h5Var = jwU.f5149R;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // defpackage.dR6
    public final void H() {
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            R();
        }
    }

    @Override // defpackage.dR6
    public final boolean L() {
        return true;
    }

    @Override // defpackage.dR6
    public final kg9 O() {
        return this.R;
    }

    @Override // defpackage.dR6
    public final void U() {
    }

    @Override // defpackage.dR6
    public final kg9 Z() {
        return null;
    }

    @Override // defpackage.dR6
    public final void c() {
        if (!((dR6) this).f2607R) {
            H();
            ((dR6) this).f2607R = true;
            synchronized (jwU.f5150R) {
                int i = this.v;
                if (i >= 0) {
                    jwU.N(i);
                    this.v = -1;
                }
            }
        }
    }

    @Override // defpackage.dR6
    public final void x() {
        this.e++;
    }

    @Override // defpackage.dR6
    public final dR6 y(kg9 kg9) {
        jwU.c(this);
        return new iLJ(((dR6) this).R, ((dR6) this).f2606R, kg9, this);
    }
}
