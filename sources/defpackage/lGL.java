package defpackage;

import java.util.List;

/* renamed from: lGL  reason: default package */
/* loaded from: classes.dex */
public final class lGL extends l0f implements pc0, oE {

    /* renamed from: R  reason: collision with other field name */
    public Object f5629R;

    /* renamed from: R  reason: collision with other field name */
    public oys f5631R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pso f5632R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5633R;
    public boolean e;
    public boolean v;
    public long c = dU5.v;

    /* renamed from: c  reason: collision with other field name */
    public boolean f5634c = true;

    /* renamed from: R  reason: collision with other field name */
    public final k5m f5630R = new k5m(this, 1);
    public final biT R = new biT(new pc0[16]);
    public boolean X = true;

    public lGL(pso pso) {
        this.f5632R = pso;
        this.f5629R = pso.f7296R.f2091R;
    }

    @Override // defpackage.oE
    public final void A(kg9 kg9) {
        List H = this.f5632R.f7297R.H();
        int size = H.size();
        for (int i = 0; i < size; i++) {
            kg9.x(((fue) H.get(i)).f3606R.f7298R);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    @Override // defpackage.oE
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F() {
        /*
            r9 = this;
            k5m r0 = r9.f5630R
            r0.L()
            pso r0 = r9.f5632R
            boolean r1 = r0.X
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x003d
            fue r1 = r0.f7297R
            biT r1 = r1.j()
            int r4 = r1.e
            if (r4 <= 0) goto L_0x003d
            java.lang.Object[] r1 = r1.f1772R
            r5 = r2
        L_0x001a:
            r6 = r1[r5]
            fue r6 = (defpackage.fue) r6
            pso r7 = r6.f3606R
            boolean r8 = r7.e
            if (r8 == 0) goto L_0x0039
            int r6 = r6.H
            if (r6 != r3) goto L_0x0039
            lGL r6 = r7.f7298R
            oys r7 = r9.f5631R
            long r7 = r7.f7046R
            boolean r6 = r6.Ry(r7)
            if (r6 == 0) goto L_0x0039
            fue r6 = r0.f7297R
            r6.s(r2)
        L_0x0039:
            int r5 = r5 + 1
            if (r5 < r4) goto L_0x001a
        L_0x003d:
            jP7 r0 = r9.i()
            otO r0 = r0.f7279R
            pso r1 = r9.f5632R
            boolean r4 = r1.O
            if (r4 != 0) goto L_0x0055
            boolean r4 = r9.f5633R
            if (r4 != 0) goto L_0x0094
            boolean r4 = r0.v
            if (r4 != 0) goto L_0x0094
            boolean r4 = r1.X
            if (r4 == 0) goto L_0x0094
        L_0x0055:
            r1.X = r2
            int r4 = r1.R
            r5 = 4
            r1.R = r5
            fue r1 = r1.f7297R
            gzG r1 = defpackage.msU.Kl(r1)
            pcP r1 = r1.getSnapshotObserver()
            pso r6 = r9.f5632R
            fue r7 = r6.f7297R
            h31 r8 = new h31
            r8.<init>(r9, r6, r0, r5)
            r1.getClass()
            h89 r5 = r7.f3597R
            if (r5 == 0) goto L_0x007c
            lBz r5 = r1.O
            r1.R(r7, r5, r8)
            goto L_0x0081
        L_0x007c:
            lBz r5 = r1.c
            r1.R(r7, r5, r8)
        L_0x0081:
            pso r1 = r9.f5632R
            r1.R = r4
            boolean r1 = r1.L
            if (r1 == 0) goto L_0x0090
            boolean r0 = r0.v
            if (r0 == 0) goto L_0x0090
            r9.requestLayout()
        L_0x0090:
            pso r0 = r9.f5632R
            r0.O = r2
        L_0x0094:
            k5m r0 = r9.f5630R
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x009c
            r0.e = r3
        L_0x009c:
            boolean r1 = r0.f5851R
            if (r1 == 0) goto L_0x00ab
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x00ab
            k5m r9 = r9.f5630R
            r9.O()
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lGL.F():void");
    }

    @Override // defpackage.oE
    public final oE I() {
        pso pso;
        fue N = this.f5632R.f7297R.N();
        if (N == null || (pso = N.f3606R) == null) {
            return null;
        }
        return pso.f7298R;
    }

    @Override // defpackage.l0f
    public final int JD() {
        return this.f5632R.R().f7279R.JD();
    }

    @Override // defpackage.l0f
    public final void KZ(long j, float f, kg9 kg9) {
        this.f5632R.R = 4;
        this.v = true;
        if (!dU5.R(j, this.c)) {
            hi();
        }
        this.f5630R.O = false;
        gzG Kl = msU.Kl(this.f5632R.f7297R);
        pso pso = this.f5632R;
        if (pso.L) {
            pso.L = false;
            pso.c(pso.v - 1);
        }
        pcP snapshotObserver = Kl.getSnapshotObserver();
        pso pso2 = this.f5632R;
        fue fue = pso2.f7297R;
        ejV ejv = new ejV(0, j, pso2);
        snapshotObserver.getClass();
        if (fue.f3597R != null) {
            snapshotObserver.R(fue, snapshotObserver.X, ejv);
        } else {
            snapshotObserver.R(fue, snapshotObserver.e, ejv);
        }
        this.c = j;
        this.f5632R.R = 5;
    }

    @Override // defpackage.pc0
    public final l0f L(long j) {
        fue fue = this.f5632R.f7297R;
        fue N = fue.N();
        if (N != null) {
            int i = 1;
            if (fue.H == 3 || fue.f3589O) {
                int I = jQ.I(N.f3606R.R);
                if (!(I == 0 || I == 1)) {
                    if (I == 2 || I == 3) {
                        i = 2;
                    } else {
                        StringBuilder U = opT.U("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                        U.append(opT.y(N.f3606R.R));
                        throw new IllegalStateException(U.toString());
                    }
                }
                fue.H = i;
            } else {
                StringBuilder U2 = opT.U("measure() may not be called multiple times on the same Measurable. Current state ");
                U2.append(opT.t(fue.H));
                U2.append(". Parent state ");
                U2.append(opT.y(N.f3606R.R));
                U2.append('.');
                throw new IllegalStateException(U2.toString().toString());
            }
        } else {
            fue.H = 3;
        }
        fue fue2 = this.f5632R.f7297R;
        if (fue2.U == 3) {
            fue2.e();
        }
        Ry(j);
        return this;
    }

    public final void MG() {
        this.f5632R.f7297R.s(false);
        fue N = this.f5632R.f7297R.N();
        if (N != null) {
            fue fue = this.f5632R.f7297R;
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

    @Override // defpackage.kgQ
    public final int P(XI xi) {
        fue N = this.f5632R.f7297R.N();
        if ((N != null ? N.f3606R.R : 0) == 2) {
            ((lt) this.f5630R).f5852v = true;
        } else {
            fue N2 = this.f5632R.f7297R.N();
            if ((N2 != null ? N2.f3606R.R : 0) == 4) {
                this.f5630R.c = true;
            }
        }
        this.f5633R = true;
        int P = this.f5632R.R().f7279R.P(xi);
        this.f5633R = false;
        return P;
    }

    public final void PN() {
        int i = 0;
        this.f5634c = false;
        biT j = this.f5632R.f7297R.j();
        int i2 = j.e;
        if (i2 > 0) {
            Object[] objArr = j.f1772R;
            do {
                ((fue) objArr[i]).f3606R.f7298R.PN();
                i++;
            } while (i < i2);
        }
    }

    @Override // defpackage.kgQ, defpackage.cxM
    public final Object R() {
        return this.f5629R;
    }

    public final boolean Ry(long j) {
        fue N = this.f5632R.f7297R.N();
        fue fue = this.f5632R.f7297R;
        fue.f3589O = fue.f3589O || (N != null && N.f3589O);
        if (!fue.f3606R.e) {
            oys oys = this.f5631R;
            if (oys == null ? false : oys.v(oys.f7046R, j)) {
                return false;
            }
        }
        this.f5631R = new oys(j);
        this.f5630R.X = false;
        A(lBz.v);
        otO oto = this.f5632R.R().f7279R;
        if (oto != null) {
            long R = iTI.R(oto.e, oto.X);
            pso pso = this.f5632R;
            pso.R = 2;
            pso.e = false;
            pcP snapshotObserver = msU.Kl(pso.f7297R).getSnapshotObserver();
            fue fue2 = pso.f7297R;
            ejV ejv = new ejV(1, j, pso);
            snapshotObserver.getClass();
            if (fue2.f3597R != null) {
                snapshotObserver.R(fue2, snapshotObserver.f7105R, ejv);
            } else {
                snapshotObserver.R(fue2, snapshotObserver.v, ejv);
            }
            pso.X = true;
            pso.O = true;
            if (pso.v(pso.f7297R)) {
                pso.f7300v = true;
                pso.c = true;
            } else {
                pso.f7299R = true;
            }
            pso.R = 5;
            Qg(iTI.R(oto.e, oto.X));
            return (((int) (R >> 32)) == oto.e && ltH.v(R) == oto.X) ? false : true;
        }
        throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
    }

    @Override // defpackage.cxM
    public final int Z(int i) {
        MG();
        return this.f5632R.R().f7279R.Z(i);
    }

    @Override // defpackage.cxM
    public final int ZW(int i) {
        MG();
        return this.f5632R.R().f7279R.ZW(i);
    }

    @Override // defpackage.oE
    public final k5m e() {
        return this.f5630R;
    }

    public final void hi() {
        pso pso = this.f5632R;
        if (pso.v > 0) {
            List H = pso.f7297R.H();
            int size = H.size();
            for (int i = 0; i < size; i++) {
                fue fue = (fue) H.get(i);
                pso pso2 = fue.f3606R;
                if (pso2.L && !pso2.f7300v) {
                    fue.W(false);
                }
                lGL lgl = pso2.f7298R;
                if (lgl != null) {
                    lgl.hi();
                }
            }
        }
    }

    @Override // defpackage.oE
    public final jP7 i() {
        return this.f5632R.f7297R.f3600R.f4974R;
    }

    @Override // defpackage.cxM
    public final int k(int i) {
        MG();
        return this.f5632R.R().f7279R.k(i);
    }

    @Override // defpackage.l0f
    public final int mh() {
        return this.f5632R.R().f7279R.mh();
    }

    @Override // defpackage.oE
    public final boolean n() {
        return this.f5634c;
    }

    @Override // defpackage.oE
    public final void r() {
        this.f5632R.f7297R.s(false);
    }

    @Override // defpackage.oE
    public final void requestLayout() {
        this.f5632R.f7297R.W(false);
    }

    public final void zE() {
        biT j = this.f5632R.f7297R.j();
        int i = j.e;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = j.f1772R;
            do {
                fue fue = (fue) objArr[i2];
                fue.getClass();
                fue.k(fue);
                fue.f3606R.f7298R.zE();
                i2++;
            } while (i2 < i);
        }
    }

    @Override // defpackage.cxM
    public final int zw(int i) {
        MG();
        return this.f5632R.R().f7279R.zw(i);
    }
}
