package defpackage;

/* renamed from: mbj  reason: default package */
/* loaded from: classes.dex */
public final class mbj extends mjG implements gl4, g4j {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final Iw f6081R;

    /* renamed from: R  reason: collision with other field name */
    public final cZB f6082R;

    /* renamed from: R  reason: collision with other field name */
    public final jww f6083R;

    /* renamed from: R  reason: collision with other field name */
    public final mz f6084R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6085R;

    public mbj(jww jww, boolean z, mz mzVar, cZB czb, float f, Iw iw) {
        this.f6083R = jww;
        this.f6085R = z;
        this.f6084R = mzVar;
        this.f6082R = czb;
        this.R = f;
        this.f6081R = iw;
    }

    public static boolean C(long j) {
        if (!nqW.R(j, nqW.c)) {
            float v = nqW.v(j);
            if (!Float.isInfinite(v) && !Float.isNaN(v)) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(long j) {
        if (!nqW.R(j, nqW.c)) {
            float e = nqW.e(j);
            if (!Float.isInfinite(e) && !Float.isNaN(e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f9  */
    @Override // defpackage.g4j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(defpackage.ohT r18) {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbj.A(ohT):void");
    }

    @Override // defpackage.gl4
    public final int L(mZf mzf, cxM cxm, int i) {
        if (!U()) {
            return cxm.Z(i);
        }
        long g = g(dtx.c(i, 0, 13));
        return Math.max(oys.m(g), cxm.Z(i));
    }

    @Override // defpackage.gl4
    public final int R(mZf mzf, cxM cxm, int i) {
        if (!U()) {
            return cxm.k(i);
        }
        long g = g(dtx.c(0, i, 7));
        return Math.max(oys.x(g), cxm.k(i));
    }

    public final boolean U() {
        if (this.f6085R) {
            long c = this.f6083R.c();
            int i = nqW.R;
            if (c != nqW.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gl4
    public final int X(mZf mzf, cxM cxm, int i) {
        if (!U()) {
            return cxm.zw(i);
        }
        long g = g(dtx.c(i, 0, 13));
        return Math.max(oys.m(g), cxm.zw(i));
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        l0f L = pc0.L(g(j));
        return mzf.f(L.e, L.X, iia.R, new kW9(L, 7));
    }

    public final boolean equals(Object obj) {
        mbj mbj = obj instanceof mbj ? (mbj) obj : null;
        if (mbj == null || !n3x.v(this.f6083R, mbj.f6083R) || this.f6085R != mbj.f6085R || !n3x.v(this.f6084R, mbj.f6084R) || !n3x.v(this.f6082R, mbj.f6082R)) {
            return false;
        }
        return ((this.R > mbj.R ? 1 : (this.R == mbj.R ? 0 : -1)) == 0) && n3x.v(this.f6081R, mbj.f6081R);
    }

    public final long g(long j) {
        boolean z = true;
        boolean z2 = oys.e(j) && oys.c(j);
        boolean z3 = oys.O(j) && oys.X(j);
        if ((!U() && z2) || z3) {
            return oys.R(j, oys.Z(j), 0, oys.L(j), 0, 10);
        }
        long c = this.f6083R.c();
        long e = n1P.e((float) dtx.x(j, N(c) ? mLz.t(nqW.e(c)) : oys.x(j)), (float) dtx.m(j, C(c) ? mLz.t(nqW.v(c)) : oys.m(j)));
        if (U()) {
            long e2 = n1P.e(!N(this.f6083R.c()) ? nqW.e(e) : nqW.e(this.f6083R.c()), !C(this.f6083R.c()) ? nqW.v(e) : nqW.v(this.f6083R.c()));
            if (!(nqW.e(e) == 0.0f)) {
                if (nqW.v(e) != 0.0f) {
                    z = false;
                }
                if (!z) {
                    e = gQc.E(e2, ((kfk) this.f6082R).m(e2, e));
                }
            }
            e = nqW.v;
        }
        return oys.R(j, dtx.x(j, mLz.t(nqW.e(e))), 0, dtx.m(j, mLz.t(nqW.v(e))), 0, 10);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f6085R);
        int hashCode2 = this.f6084R.hashCode();
        int c = jQ.c(this.R, (this.f6082R.hashCode() + ((hashCode2 + ((hashCode + (this.f6083R.hashCode() * 31)) * 31)) * 31)) * 31, 31);
        Iw iw = this.f6081R;
        return c + (iw != null ? iw.hashCode() : 0);
    }

    @Override // defpackage.gl4
    public final int p(mZf mzf, cxM cxm, int i) {
        if (!U()) {
            return cxm.ZW(i);
        }
        long g = g(dtx.c(0, i, 7));
        return Math.max(oys.x(g), cxm.ZW(i));
    }

    public final String toString() {
        StringBuilder U = opT.U("PainterModifier(painter=");
        U.append(this.f6083R);
        U.append(", sizeToIntrinsics=");
        U.append(this.f6085R);
        U.append(", alignment=");
        U.append(this.f6084R);
        U.append(", alpha=");
        U.append(this.R);
        U.append(", colorFilter=");
        U.append(this.f6081R);
        U.append(')');
        return U.toString();
    }
}
