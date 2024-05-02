package defpackage;

/* renamed from: cXC  reason: default package */
/* loaded from: classes.dex */
public final class cXC extends mjG implements gl4 {
    public final int O;
    public final iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f2129R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2130R;

    public cXC(int i, boolean z, iv7 iv7, Object obj, UX ux) {
        this.O = i;
        this.f2130R = z;
        this.R = iv7;
        this.f2129R = obj;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        int i = 0;
        int x = this.O != 1 ? 0 : oys.x(j);
        if (this.O == 2) {
            i = oys.m(j);
        }
        int i2 = Integer.MAX_VALUE;
        int Z = (this.O == 1 || !this.f2130R) ? oys.Z(j) : Integer.MAX_VALUE;
        if (this.O == 2 || !this.f2130R) {
            i2 = oys.L(j);
        }
        l0f L = pc0.L(dtx.R(x, Z, i, i2));
        int x2 = caw.x(L.e, oys.x(j), oys.Z(j));
        int x3 = caw.x(L.X, oys.m(j), oys.L(j));
        return mzf.f(x2, x3, iia.R, new fBF(this, x2, L, x3, mzf));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cXC)) {
            return false;
        }
        cXC cxc = (cXC) obj;
        return this.O == cxc.O && this.f2130R == cxc.f2130R && n3x.v(this.f2129R, cxc.f2129R);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f2130R);
        return this.f2129R.hashCode() + ((hashCode + (jQ.I(this.O) * 31)) * 31);
    }
}
