package defpackage;

/* renamed from: isV  reason: default package */
/* loaded from: classes.dex */
public final class isV extends t {
    public X R;

    /* renamed from: R  reason: collision with other field name */
    public f9y f4748R;

    /* renamed from: R  reason: collision with other field name */
    public fXV f4749R;

    /* renamed from: R  reason: collision with other field name */
    public hMN f4750R;

    /* renamed from: R  reason: collision with other field name */
    public iJ3 f4751R;

    /* renamed from: R  reason: collision with other field name */
    public plH f4752R;

    /* renamed from: R  reason: collision with other field name */
    public q f4753R;

    /* renamed from: R  reason: collision with other field name */
    public wa f4754R;
    public X v;

    /* renamed from: v  reason: collision with other field name */
    public f9y f4755v;

    /* renamed from: v  reason: collision with other field name */
    public fXV f4756v;

    /* renamed from: v  reason: collision with other field name */
    public plH f4757v;

    public isV(q qVar) {
        int i;
        boolean z;
        boolean z2;
        this.f4753R = qVar;
        if (qVar.S(0) instanceof Vz) {
            this.R = (X) X.R.m((Vz) qVar.S(0), true);
            i = 0;
        } else {
            this.R = new X(0);
            i = -1;
        }
        if (this.R.Q(0)) {
            z = false;
            z2 = true;
        } else if (this.R.Q(1)) {
            z2 = false;
            z = true;
        } else if (this.R.Q(2)) {
            z2 = false;
            z = false;
        } else {
            throw new IllegalArgumentException("version number not recognised");
        }
        this.v = X.n(qVar.S(i + 1));
        this.f4754R = wa.o(qVar.S(i + 2));
        b S = qVar.S(i + 3);
        UB ub = plH.R;
        this.f4752R = S instanceof plH ? (plH) S : S != null ? new plH(q.A(S)) : null;
        q qVar2 = (q) qVar.S(i + 4);
        this.f4749R = fXV.o(qVar2.S(0));
        this.f4756v = fXV.o(qVar2.S(1));
        b S2 = qVar.S(i + 5);
        this.f4757v = S2 instanceof plH ? (plH) S2 : S2 != null ? new plH(q.A(S2)) : null;
        int i2 = i + 6;
        b S3 = qVar.S(i2);
        this.f4750R = S3 instanceof hMN ? (hMN) S3 : S3 != null ? new hMN(q.A(S3)) : null;
        int size = (qVar.size() - i2) - 1;
        if (size == 0 || !z2) {
            while (size > 0) {
                Vz vz = (Vz) qVar.S(i2 + size);
                int i3 = vz.O;
                if (i3 == 1) {
                    this.f4748R = f9y.A(vz);
                } else if (i3 == 2) {
                    this.f4755v = f9y.A(vz);
                } else if (i3 != 3) {
                    StringBuilder U = opT.U("Unknown tag encountered in structure: ");
                    U.append(vz.O);
                    throw new IllegalArgumentException(U.toString());
                } else if (!z) {
                    q qVar3 = (q) q.R.m(vz, true);
                    this.f4751R = qVar3 instanceof iJ3 ? (iJ3) qVar3 : qVar3 != null ? new iJ3(q.A(qVar3)) : null;
                } else {
                    throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                }
                size--;
            }
            return;
        }
        throw new IllegalArgumentException("version 1 certificate contains extra data");
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        if (a8w.R("org.bouncycastle.x509.allow_non-der_tbscert") != null && !a8w.v("org.bouncycastle.x509.allow_non-der_tbscert")) {
            W w = new W();
            if (!this.R.Q(0)) {
                w.R(new oU(0, 1, this.R, true));
            }
            w.R(this.v);
            w.R(this.f4754R);
            w.R(this.f4752R);
            W w2 = new W(2);
            w2.R(this.f4749R);
            w2.R(this.f4756v);
            w.R(new iuV(w2));
            b bVar = this.f4757v;
            if (bVar == null) {
                bVar = new iuV();
            }
            w.R(bVar);
            w.R(this.f4750R);
            f9y f9y = this.f4748R;
            if (f9y != null) {
                w.R(new oU(1, 1, f9y, false));
            }
            f9y f9y2 = this.f4755v;
            if (f9y2 != null) {
                w.R(new oU(2, 1, f9y2, false));
            }
            iJ3 ij3 = this.f4751R;
            if (ij3 != null) {
                w.R(new oU(3, 1, ij3, true));
            }
            return new iuV(w);
        }
        return this.f4753R;
    }
}
