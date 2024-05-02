package defpackage;

/* renamed from: gl4  reason: default package */
/* loaded from: classes.dex */
public interface gl4 extends eo1 {
    default int L(mZf mzf, cxM cxm, int i) {
        return e(new jdO(mzf, mzf.getLayoutDirection()), new dls(cxm, ei4.Max, eKS.Height), dtx.c(i, 0, 13)).c();
    }

    default int R(mZf mzf, cxM cxm, int i) {
        return e(new jdO(mzf, mzf.getLayoutDirection()), new dls(cxm, ei4.Max, eKS.Width), dtx.c(0, i, 7)).e();
    }

    default int X(mZf mzf, cxM cxm, int i) {
        return e(new jdO(mzf, mzf.getLayoutDirection()), new dls(cxm, ei4.Min, eKS.Height), dtx.c(i, 0, 13)).c();
    }

    mET e(mZf mzf, pc0 pc0, long j);

    default int p(mZf mzf, cxM cxm, int i) {
        return e(new jdO(mzf, mzf.getLayoutDirection()), new dls(cxm, ei4.Min, eKS.Width), dtx.c(0, i, 7)).e();
    }
}
