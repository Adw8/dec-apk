package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* renamed from: cRM  reason: default package */
/* loaded from: classes.dex */
public final class cRM extends l0f implements pc0, oE {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public Object f2091R;

    /* renamed from: R  reason: collision with other field name */
    public kg9 f2093R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pso f2094R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2095R;

    /* renamed from: c  reason: collision with other field name */
    public boolean f2096c;
    public boolean v;
    public long c = dU5.v;

    /* renamed from: R  reason: collision with other field name */
    public final k5m f2092R = new k5m(this, 0);

    /* renamed from: R  reason: collision with other field name */
    public final biT f2090R = new biT(new pc0[16]);
    public boolean e = true;

    public cRM(pso pso) {
        this.f2094R = pso;
    }

    @Override // defpackage.oE
    public final void A(kg9 kg9) {
        List H = this.f2094R.f7297R.H();
        int size = H.size();
        for (int i = 0; i < size; i++) {
            kg9.x(((fue) H.get(i)).f3606R.f7296R);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    @Override // defpackage.oE
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F() {
        /*
            r10 = this;
            k5m r0 = r10.f2092R
            r0.L()
            pso r0 = r10.f2094R
            boolean r1 = r0.f7300v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0046
            fue r1 = r0.f7297R
            biT r1 = r1.j()
            int r4 = r1.e
            if (r4 <= 0) goto L_0x0046
            java.lang.Object[] r1 = r1.f1772R
            r5 = r2
        L_0x001a:
            r6 = r1[r5]
            fue r6 = (defpackage.fue) r6
            pso r7 = r6.f3606R
            boolean r8 = r7.f7299R
            if (r8 == 0) goto L_0x0042
            int r8 = r6.x
            if (r8 != r3) goto L_0x0042
            cRM r7 = r7.f7296R
            boolean r8 = r7.f2095R
            if (r8 == 0) goto L_0x0036
            long r7 = r7.v
            oys r9 = new oys
            r9.<init>(r7)
            goto L_0x0037
        L_0x0036:
            r9 = 0
        L_0x0037:
            boolean r6 = r6.Q(r9)
            if (r6 == 0) goto L_0x0042
            fue r6 = r0.f7297R
            r6.r(r2)
        L_0x0042:
            int r5 = r5 + 1
            if (r5 < r4) goto L_0x001a
        L_0x0046:
            pso r0 = r10.f2094R
            boolean r0 = r0.c
            if (r0 != 0) goto L_0x005e
            boolean r0 = r10.f2096c
            if (r0 != 0) goto L_0x0095
            jP7 r0 = r10.i()
            boolean r0 = r0.v
            if (r0 != 0) goto L_0x0095
            pso r0 = r10.f2094R
            boolean r0 = r0.f7300v
            if (r0 == 0) goto L_0x0095
        L_0x005e:
            pso r0 = r10.f2094R
            r0.f7300v = r2
            int r1 = r0.R
            r4 = 3
            r0.R = r4
            fue r4 = r0.f7297R
            gzG r5 = defpackage.msU.Kl(r4)
            pcP r5 = r5.getSnapshotObserver()
            h31 r6 = new h31
            r7 = 5
            r6.<init>(r0, r10, r4, r7)
            lBz r0 = r5.c
            r5.R(r4, r0, r6)
            pso r0 = r10.f2094R
            r0.R = r1
            jP7 r0 = r10.i()
            boolean r0 = r0.v
            if (r0 == 0) goto L_0x0091
            pso r0 = r10.f2094R
            boolean r0 = r0.L
            if (r0 == 0) goto L_0x0091
            r10.requestLayout()
        L_0x0091:
            pso r0 = r10.f2094R
            r0.c = r2
        L_0x0095:
            k5m r0 = r10.f2092R
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x009d
            r0.e = r3
        L_0x009d:
            boolean r1 = r0.f5851R
            if (r1 == 0) goto L_0x00ac
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x00ac
            k5m r10 = r10.f2092R
            r10.O()
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cRM.F():void");
    }

    @Override // defpackage.oE
    public final oE I() {
        pso pso;
        fue N = this.f2094R.f7297R.N();
        if (N == null || (pso = N.f3606R) == null) {
            return null;
        }
        return pso.f7296R;
    }

    @Override // defpackage.l0f
    public final int JD() {
        return this.f2094R.R().JD();
    }

    @Override // defpackage.l0f
    public final void KZ(long j, float f, kg9 kg9) {
        if (!dU5.R(j, this.c)) {
            PN();
        }
        if (pso.v(this.f2094R.f7297R)) {
            h57.v(h57.f4041R, this.f2094R.f7298R, (int) (j >> 32), dU5.v(j));
        }
        this.f2094R.R = 3;
        MG(j, f, kg9);
        this.f2094R.R = 5;
    }

    @Override // defpackage.pc0
    public final l0f L(long j) {
        fue fue = this.f2094R.f7297R;
        if (fue.U == 3) {
            fue.e();
        }
        int i = 1;
        if (pso.v(this.f2094R.f7297R)) {
            this.f2095R = true;
            np(j);
            pso pso = this.f2094R;
            pso.f7297R.H = 3;
            pso.f7298R.L(j);
        }
        fue fue2 = this.f2094R.f7297R;
        fue N = fue2.N();
        if (N != null) {
            if (fue2.x == 3 || fue2.f3589O) {
                int I = jQ.I(N.f3606R.R);
                if (I != 0) {
                    if (I == 2) {
                        i = 2;
                    } else {
                        StringBuilder U = opT.U("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                        U.append(opT.y(N.f3606R.R));
                        throw new IllegalStateException(U.toString());
                    }
                }
                fue2.x = i;
            } else {
                StringBuilder U2 = opT.U("measure() may not be called multiple times on the same Measurable. Current state ");
                U2.append(opT.t(fue2.x));
                U2.append(". Parent state ");
                U2.append(opT.y(N.f3606R.R));
                U2.append('.');
                throw new IllegalStateException(U2.toString().toString());
            }
        } else {
            fue2.x = 3;
        }
        Ry(j);
        return this;
    }

    public final void MG(long j, float f, kg9 kg9) {
        this.c = j;
        this.R = f;
        this.f2093R = kg9;
        this.v = true;
        this.f2092R.O = false;
        pso pso = this.f2094R;
        if (pso.L) {
            pso.L = false;
            pso.c(pso.v - 1);
        }
        pcP snapshotObserver = msU.Kl(this.f2094R.f7297R).getSnapshotObserver();
        pso pso2 = this.f2094R;
        snapshotObserver.R(pso2.f7297R, snapshotObserver.e, new o39(kg9, pso2, j, f));
    }

    @Override // defpackage.kgQ
    public final int P(XI xi) {
        fue N = this.f2094R.f7297R.N();
        if ((N != null ? N.f3606R.R : 0) == 1) {
            ((lt) this.f2092R).f5852v = true;
        } else {
            fue N2 = this.f2094R.f7297R.N();
            if ((N2 != null ? N2.f3606R.R : 0) == 3) {
                this.f2092R.c = true;
            }
        }
        this.f2096c = true;
        int P = this.f2094R.R().P(xi);
        this.f2096c = false;
        return P;
    }

    public final void PN() {
        pso pso = this.f2094R;
        if (pso.v > 0) {
            List H = pso.f7297R.H();
            int size = H.size();
            for (int i = 0; i < size; i++) {
                fue fue = (fue) H.get(i);
                pso pso2 = fue.f3606R;
                if (pso2.L && !pso2.f7300v) {
                    fue.T(false);
                }
                pso2.f7296R.PN();
            }
        }
    }

    @Override // defpackage.kgQ, defpackage.cxM
    public final Object R() {
        return this.f2091R;
    }

    public final boolean Ry(long j) {
        gzG Kl = msU.Kl(this.f2094R.f7297R);
        fue N = this.f2094R.f7297R.N();
        fue fue = this.f2094R.f7297R;
        boolean z = true;
        fue.f3589O = fue.f3589O || (N != null && N.f3589O);
        if (fue.f3606R.f7299R || !oys.v(super.v, j)) {
            this.f2092R.X = false;
            A(lBz.O);
            this.f2095R = true;
            long j2 = ((l0f) this.f2094R.R()).R;
            np(j);
            pso pso = this.f2094R;
            if (pso.R == 5) {
                pso.R = 1;
                pso.f7299R = false;
                pcP snapshotObserver = msU.Kl(pso.f7297R).getSnapshotObserver();
                snapshotObserver.R(pso.f7297R, snapshotObserver.v, new ejV(2, j, pso));
                if (pso.R == 1) {
                    pso.f7300v = true;
                    pso.c = true;
                    pso.R = 5;
                }
                if (ltH.R(((l0f) this.f2094R.R()).R, j2) && ((l0f) this.f2094R.R()).e == super.e && this.f2094R.R().X == this.X) {
                    z = false;
                }
                Qg(iTI.R(((l0f) this.f2094R.R()).e, this.f2094R.R().X));
                return z;
            }
            throw new IllegalStateException("layout state is not idle before measure starts".toString());
        }
        ((AndroidComposeView) Kl).f1209R.e(this.f2094R.f7297R);
        this.f2094R.f7297R.p();
        return false;
    }

    @Override // defpackage.cxM
    public final int Z(int i) {
        hi();
        return this.f2094R.R().Z(i);
    }

    @Override // defpackage.cxM
    public final int ZW(int i) {
        hi();
        return this.f2094R.R().ZW(i);
    }

    @Override // defpackage.oE
    public final k5m e() {
        return this.f2092R;
    }

    public final void hi() {
        this.f2094R.f7297R.r(false);
        fue N = this.f2094R.f7297R.N();
        if (N != null) {
            fue fue = this.f2094R.f7297R;
            if (fue.U == 3) {
                int I = jQ.I(N.f3606R.R);
                int i = 2;
                if (I == 0) {
                    i = 1;
                } else if (I != 2) {
                    i = N.U;
                }
                fue.U = i;
            }
        }
    }

    @Override // defpackage.oE
    public final jP7 i() {
        return this.f2094R.f7297R.f3600R.f4974R;
    }

    @Override // defpackage.cxM
    public final int k(int i) {
        hi();
        return this.f2094R.R().k(i);
    }

    @Override // defpackage.l0f
    public final int mh() {
        return this.f2094R.R().mh();
    }

    @Override // defpackage.oE
    public final boolean n() {
        return this.f2094R.f7297R.f3608X;
    }

    @Override // defpackage.oE
    public final void r() {
        this.f2094R.f7297R.r(false);
    }

    @Override // defpackage.oE
    public final void requestLayout() {
        this.f2094R.f7297R.T(false);
    }

    @Override // defpackage.cxM
    public final int zw(int i) {
        hi();
        return this.f2094R.R().zw(i);
    }
}
