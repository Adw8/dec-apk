package defpackage;

/* renamed from: be9  reason: default package */
/* loaded from: classes.dex */
public final class be9 implements kJx {
    public final hP9 R = new hP9();

    /* renamed from: R  reason: collision with other field name */
    public final kJx f1761R;

    public be9(kJx kjx) {
        this.f1761R = kjx;
    }

    @Override // defpackage.nbD
    public final nbD H(e86 e86) {
        return dTl.d(this, e86);
    }

    @Override // defpackage.nbD
    public final nbD M(nbD nbd) {
        return jjU.t(this, nbd);
    }

    @Override // defpackage.hdJ, defpackage.nbD
    public final hdJ O(e86 e86) {
        return dTl.J(this, e86);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v4 java.lang.Object), (r8v1 java.lang.Object) binds: [B:32:0x008a, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // defpackage.kJx
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object W(defpackage.kg9 r7, defpackage.aOO r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bjb
            if (r0 == 0) goto L_0x0013
            r0 = r8
            bjb r0 = (defpackage.bjb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            bjb r0 = new bjb
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f1779R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            defpackage.jjU.o(r8)
            goto L_0x008d
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            kg9 r7 = r0.f1780R
            be9 r6 = r0.R
            defpackage.jjU.o(r8)
            goto L_0x007d
        L_0x003a:
            defpackage.jjU.o(r8)
            hP9 r8 = r6.R
            r0.R = r6
            r0.f1780R = r7
            r0.e = r4
            java.lang.Object r2 = r8.f4226R
            monitor-enter(r2)
            boolean r5 = r8.f4228R     // Catch: all -> 0x0091
            monitor-exit(r2)
            if (r5 == 0) goto L_0x0050
            o8s r8 = defpackage.o8s.R
            goto L_0x007a
        L_0x0050:
            xx r2 = new xx
            aOO r5 = defpackage.n3x.U(r0)
            r2.<init>(r4, r5)
            r2.j()
            java.lang.Object r4 = r8.f4226R
            monitor-enter(r4)
            java.lang.Object r5 = r8.v     // Catch: all -> 0x008e
            java.util.List r5 = (java.util.List) r5     // Catch: all -> 0x008e
            r5.add(r2)     // Catch: all -> 0x008e
            monitor-exit(r4)
            V4 r4 = new V4
            r5 = 14
            r4.<init>(r8, r5, r2)
            r2.y(r4)
            java.lang.Object r8 = r2.P()
            if (r8 != r1) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            o8s r8 = defpackage.o8s.R
        L_0x007a:
            if (r8 != r1) goto L_0x007d
            return r1
        L_0x007d:
            kJx r6 = r6.f1761R
            r8 = 0
            r0.R = r8
            r0.f1780R = r8
            r0.e = r3
            java.lang.Object r8 = r6.W(r7, r0)
            if (r8 != r1) goto L_0x008d
            return r1
        L_0x008d:
            return r8
        L_0x008e:
            r6 = move-exception
            monitor-exit(r4)
            throw r6
        L_0x0091:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.W(kg9, aOO):java.lang.Object");
    }

    @Override // defpackage.nbD
    public final Object o(Object obj, iv7 iv7) {
        return iv7.J(obj, this);
    }
}
