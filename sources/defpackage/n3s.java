package defpackage;

/* renamed from: n3s  reason: default package */
/* loaded from: classes.dex */
public final class n3s extends kpt {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n3s(int r6, defpackage.nQA r7) {
        /*
            r5 = this;
            java.lang.Object r0 = defpackage.jwU.f5150R
            monitor-enter(r0)
            java.util.ArrayList r1 = defpackage.jwU.v     // Catch: all -> 0x0035
            boolean r2 = r1.isEmpty()     // Catch: all -> 0x0035
            r3 = 1
            r2 = r2 ^ r3
            r4 = 0
            if (r2 == 0) goto L_0x0014
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: all -> 0x0035
            r2.<init>(r1)     // Catch: all -> 0x0035
            goto L_0x0015
        L_0x0014:
            r2 = r4
        L_0x0015:
            if (r2 == 0) goto L_0x002f
            int r1 = r2.size()     // Catch: all -> 0x0035
            if (r1 != r3) goto L_0x0023
            r1 = 0
            java.lang.Object r1 = r2.get(r1)     // Catch: all -> 0x0035
            goto L_0x0024
        L_0x0023:
            r1 = r4
        L_0x0024:
            kg9 r1 = (defpackage.kg9) r1     // Catch: all -> 0x0035
            if (r1 != 0) goto L_0x0030
            Cp r1 = new Cp     // Catch: all -> 0x0035
            r3 = 5
            r1.<init>(r3, r2)     // Catch: all -> 0x0035
            goto L_0x0030
        L_0x002f:
            r1 = r4
        L_0x0030:
            monitor-exit(r0)
            r5.<init>(r6, r7, r4, r1)
            return
        L_0x0035:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n3s.<init>(int, nQA):void");
    }

    @Override // defpackage.kpt, defpackage.dR6
    public final void H() {
        fk4.R();
        throw null;
    }

    @Override // defpackage.kpt, defpackage.dR6
    public final void U() {
        jwU.e(nqF.Z);
    }

    @Override // defpackage.kpt
    public final kpt Y(kg9 kg9, kg9 kg92) {
        return (kpt) ((dR6) jwU.e(new kmL(9, new ecS(kg9, kg92, 0))));
    }

    @Override // defpackage.kpt, defpackage.dR6
    public final void c() {
        synchronized (jwU.f5150R) {
            int i = ((dR6) this).v;
            if (i >= 0) {
                jwU.N(i);
                ((dR6) this).v = -1;
            }
        }
    }

    @Override // defpackage.kpt
    public final aJV i() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // defpackage.kpt, defpackage.dR6
    public final void x() {
        fk4.R();
        throw null;
    }

    @Override // defpackage.kpt, defpackage.dR6
    public final dR6 y(kg9 kg9) {
        return (dR6) jwU.e(new kmL(9, new kmL(8, kg9)));
    }
}
