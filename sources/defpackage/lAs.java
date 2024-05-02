package defpackage;

/* renamed from: lAs */
/* loaded from: classes.dex */
public final class lAs implements jJj, aOO {
    public final aOO R;

    /* renamed from: R */
    public gKj f5605R = gKj.Main;

    /* renamed from: R */
    public final /* synthetic */ iTB f5606R;

    /* renamed from: R */
    public k0 f5607R;
    public final /* synthetic */ iTB v;

    public lAs(iTB itb, xx xxVar) {
        this.v = itb;
        this.R = xxVar;
        this.f5606R = itb;
    }

    @Override // defpackage.jJj
    public final int B(float f) {
        return this.f5606R.B(f);
    }

    @Override // defpackage.jJj
    public final long C(long j) {
        return this.f5606R.C(j);
    }

    @Override // defpackage.jJj
    public final float D() {
        return this.f5606R.D();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L(long r5, defpackage.i2w r7, defpackage.aOO r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.eWa
            if (r0 == 0) goto L_0x0013
            r0 = r8
            eWa r0 = (defpackage.eWa) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            eWa r0 = new eWa
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.jjU.o(r8)     // Catch: dnC -> 0x003b
            goto L_0x003c
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            defpackage.jjU.o(r8)
            r0.e = r3     // Catch: dnC -> 0x003b
            java.lang.Object r8 = r4.O(r5, r7, r0)     // Catch: dnC -> 0x003b
            if (r8 != r1) goto L_0x003c
            return r1
        L_0x003b:
            r8 = 0
        L_0x003c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lAs.L(long, i2w, aOO):java.lang.Object");
    }

    @Override // defpackage.jJj
    public final long M(long j) {
        return this.f5606R.M(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(long r9, defpackage.iv7 r11, defpackage.aOO r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.lI7
            if (r0 == 0) goto L_0x0013
            r0 = r12
            lI7 r0 = (defpackage.lI7) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            lI7 r0 = new lI7
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            o7V r8 = r0.f5646R
            defpackage.jjU.o(r12)     // Catch: all -> 0x002a
            goto L_0x006b
        L_0x002a:
            r9 = move-exception
            goto L_0x0073
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            defpackage.jjU.o(r12)
            r5 = 0
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 > 0) goto L_0x0050
            k0 r12 = r8.f5607R
            if (r12 == 0) goto L_0x0050
            dnC r2 = new dnC
            r2.<init>(r9)
            bvw r5 = new bvw
            r5.<init>(r2)
            xx r12 = (defpackage.xx) r12
            r12.Y(r5)
        L_0x0050:
            iTB r12 = r8.v
            jy_ r12 = r12.f4597R
            cLM r2 = new cLM
            r2.<init>(r9, r8, r4)
            r9 = 3
            r10 = 0
            o7V r9 = defpackage.l6.z(r12, r4, r10, r2, r9)
            r0.f5646R = r9     // Catch: all -> 0x006f
            r0.e = r3     // Catch: all -> 0x006f
            java.lang.Object r12 = r11.J(r8, r0)     // Catch: all -> 0x006f
            if (r12 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r8 = r9
        L_0x006b:
            r8.c(r4)
            return r12
        L_0x006f:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x0073:
            r8.c(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lAs.O(long, iv7, aOO):java.lang.Object");
    }

    public final Object R(gKj gkj, C2 c2) {
        xx xxVar = new xx(1, n3x.U(c2));
        xxVar.j();
        this.f5605R = gkj;
        this.f5607R = xxVar;
        return xxVar.P();
    }

    public final long X() {
        iTB itb = this.v;
        long M = itb.M(itb.f4594R.X());
        hjM hjm = ((laR) itb).R;
        long pG = hjm != null ? hjm.pG() : 0;
        return n1P.e(Math.max(0.0f, nqW.e(M) - ((float) ((int) (pG >> 32)))) / 2.0f, Math.max(0.0f, nqW.v(M) - ((float) ltH.v(pG))) / 2.0f);
    }

    @Override // defpackage.aOO
    public final void Y(Object obj) {
        iTB itb = this.v;
        synchronized (itb.f4595R) {
            itb.f4595R.U(this);
        }
        this.R.Y(obj);
    }

    @Override // defpackage.jJj
    public final float l(int i) {
        return this.f5606R.l(i);
    }

    @Override // defpackage.jJj
    public final float mZ(float f) {
        return this.f5606R.mZ(f);
    }

    @Override // defpackage.jJj
    public final float q(float f) {
        return this.f5606R.q(f);
    }

    @Override // defpackage.aOO
    public final nbD v() {
        return aIH.R;
    }

    @Override // defpackage.jJj
    public final float vr() {
        return this.f5606R.vr();
    }

    @Override // defpackage.jJj
    public final float vz(long j) {
        return this.f5606R.vz(j);
    }
}
