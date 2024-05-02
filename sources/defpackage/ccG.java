package defpackage;

/* renamed from: ccG  reason: default package */
/* loaded from: classes.dex */
public final class ccG implements gl4 {
    public final acA R;

    /* renamed from: R  reason: collision with other field name */
    public final hNI f2161R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2162R;
    public final boolean v;

    public ccG(hNI hni, boolean z, boolean z2, acA aca) {
        this.f2161R = hni;
        this.f2162R = z;
        this.v = z2;
        this.R = aca;
    }

    @Override // defpackage.gl4
    public final int L(mZf mzf, cxM cxm, int i) {
        return this.v ? cxm.Z(i) : cxm.Z(Integer.MAX_VALUE);
    }

    @Override // defpackage.gl4
    public final int R(mZf mzf, cxM cxm, int i) {
        return this.v ? cxm.k(Integer.MAX_VALUE) : cxm.k(i);
    }

    @Override // defpackage.gl4
    public final int X(mZf mzf, cxM cxm, int i) {
        return this.v ? cxm.zw(i) : cxm.zw(Integer.MAX_VALUE);
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        msU.o(j, this.v ? nLK.Vertical : nLK.Horizontal);
        int i = Integer.MAX_VALUE;
        int L = this.v ? Integer.MAX_VALUE : oys.L(j);
        if (this.v) {
            i = oys.Z(j);
        }
        l0f L2 = pc0.L(oys.R(j, 0, i, 0, L, 5));
        int i2 = L2.e;
        int Z = oys.Z(j);
        if (i2 > Z) {
            i2 = Z;
        }
        int i3 = L2.X;
        int L3 = oys.L(j);
        if (i3 > L3) {
            i3 = L3;
        }
        int i4 = L2.X - i3;
        i4 = L2.e - i2;
        if (!this.v) {
        }
        this.R.X(i4 != 0);
        hNI hni = this.f2161R;
        hni.v.R(Integer.valueOf(i4));
        if (hni.X() > i4) {
            hni.f4221R.R(Integer.valueOf(i4));
        }
        return mzf.f(i2, i3, iia.R, new cHs(this, i4, L2, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccG)) {
            return false;
        }
        ccG ccg = (ccG) obj;
        return n3x.v(this.f2161R, ccg.f2161R) && this.f2162R == ccg.f2162R && this.v == ccg.v && n3x.v(this.R, ccg.R);
    }

    public final int hashCode() {
        int hashCode = this.f2161R.hashCode() * 31;
        boolean z = this.f2162R;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.v;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return this.R.hashCode() + ((i5 + i) * 31);
    }

    @Override // defpackage.gl4
    public final int p(mZf mzf, cxM cxm, int i) {
        return this.v ? cxm.ZW(Integer.MAX_VALUE) : cxm.ZW(i);
    }

    public final String toString() {
        StringBuilder U = opT.U("ScrollingLayoutModifier(scrollerState=");
        U.append(this.f2161R);
        U.append(", isReversed=");
        U.append(this.f2162R);
        U.append(", isVertical=");
        U.append(this.v);
        U.append(", overscrollEffect=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
