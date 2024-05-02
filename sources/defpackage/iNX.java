package defpackage;

/* renamed from: iNX  reason: default package */
/* loaded from: classes.dex */
public interface iNX extends gl4 {
    @Override // defpackage.gl4
    default int L(mZf mzf, cxM cxm, int i) {
        return cxm.Z(i);
    }

    @Override // defpackage.gl4
    default int R(mZf mzf, cxM cxm, int i) {
        return cxm.k(i);
    }

    @Override // defpackage.gl4
    default int X(mZf mzf, cxM cxm, int i) {
        return cxm.zw(i);
    }

    long Z(pc0 pc0, long j);

    @Override // defpackage.gl4
    default mET e(mZf mzf, pc0 pc0, long j) {
        l0f L = pc0.L(dtx.Z(j, Z(pc0, j)));
        return mzf.f(L.e, L.X, iia.R, new kW9(L, 1));
    }
}
