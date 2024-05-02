package defpackage;

/* renamed from: j58  reason: default package */
/* loaded from: classes.dex */
public final class j58 implements hKX {
    public hKX R;

    public /* synthetic */ j58() {
    }

    public /* synthetic */ j58(n1w n1w) {
        lNV lnv = new lNV(n1w);
        hKX c = kIP.c(new lta(lnv, 2));
        hKX c2 = kIP.c(new clE(lnv, c, 0));
        hKX c3 = kIP.c(brQ.R);
        hKX c4 = kIP.c(caw.f2154R);
        hKX c5 = kIP.c(new dil(c2, c, c4, 1));
        hKX c6 = kIP.c(new dil(lnv, c3, c5, 0));
        hKX c7 = kIP.c(new lta(lnv, 3));
        j58 j58 = new j58();
        hKX c8 = kIP.c(mLz.R);
        hKX c9 = kIP.c(new hwA(c2, j58, c3, c8, 1));
        j58 j582 = new j58();
        hKX c10 = kIP.c(new i4w(c9, j58, kIP.c(new mPB(c2, j58, j582, c3, c5, 0)), kIP.c(new g5J(c2, 1)), kIP.c(new g5J(c2, 0)), kIP.c(new p3P(c2, j58, c9, c8, c3, c4, c5, 1)), kIP.c(new clE(c2, j58, 1)), kIP.c(new mPB(c2, j58, c9, c8, c3, 1)), kIP.c(new hwA(c9, c2, kIP.c(new lta(j58, 0)), c4, 2)), 1));
        hKX c11 = kIP.c(jjU.f5010R);
        hKX c12 = kIP.c(new i4w(lnv, c9, c10, j58, c3, c11, c8, kIP.c(msU.R), c5, 0));
        if (j582.R == null) {
            j582.R = c12;
            hKX c13 = kIP.c(new dil(lnv, c6, kIP.c(new p3P(c7, j582, c3, lnv, c, c8, c5, 0)), 2));
            if (j58.R == null) {
                j58.R = c13;
                hKX c14 = kIP.c(new ptn(c2, j58, j582, kIP.c(new lta(lnv, 4)), c9, c3, c11, c8, c4, c5));
                kIP.c(new clE(c14, lnv, 2));
                this.R = kIP.c(new hwA(lnv, c2, c14, kIP.c(new lta(lnv, 1)), 0));
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.hKX
    public Object R() {
        hKX hkx = this.R;
        if (hkx != null) {
            return hkx.R();
        }
        throw new IllegalStateException();
    }
}
