package defpackage;

/* renamed from: iLJ  reason: default package */
/* loaded from: classes.dex */
public final class iLJ extends dR6 {
    public final dR6 R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f4542R;

    public iLJ(int i, nQA nqa, kg9 kg9, dR6 dr6) {
        super(i, nqa);
        this.R = dr6;
        dr6.x();
        if (kg9 != null) {
            kg9 O = dr6.O();
            if (O != null) {
                kg9 = new ecS(kg9, O, 1);
            }
        } else {
            kg9 = dr6.O();
        }
        this.f4542R = kg9;
    }

    @Override // defpackage.dR6
    public final void C(nmZ nmz) {
        h5 h5Var = jwU.f5149R;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // defpackage.dR6
    public final void H() {
        fk4.R();
        throw null;
    }

    @Override // defpackage.dR6
    public final boolean L() {
        return true;
    }

    @Override // defpackage.dR6
    public final kg9 O() {
        return this.f4542R;
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
            if (((dR6) this).R != this.R.e()) {
                R();
            }
            this.R.H();
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
        fk4.R();
        throw null;
    }

    @Override // defpackage.dR6
    public final dR6 y(kg9 kg9) {
        return new iLJ(((dR6) this).R, ((dR6) this).f2606R, kg9, this.R);
    }
}
