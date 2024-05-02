package defpackage;

/* renamed from: ho9  reason: default package */
/* loaded from: classes.dex */
public final class ho9 extends lZe {
    public ThreadLocal R;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ho9(defpackage.aOO r3, defpackage.nbD r4) {
        /*
            r2 = this;
            jXl r0 = defpackage.jXl.R
            hdJ r1 = r4.O(r0)
            if (r1 != 0) goto L_0x000d
            nbD r0 = r4.M(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r4
        L_0x000e:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.R = r0
            nbD r3 = r3.v()
            hw1 r0 = defpackage.hw1.c
            hdJ r3 = r3.O(r0)
            boolean r3 = r3 instanceof defpackage.kE9
            if (r3 != 0) goto L_0x0038
            r3 = 0
            java.lang.Object r3 = defpackage.cU5.i(r4, r3)
            defpackage.cU5.C(r4, r3)
            java.lang.ThreadLocal r2 = r2.R
            kSh r0 = new kSh
            r0.<init>(r4, r3)
            r2.set(r0)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho9.<init>(aOO, nbD):void");
    }

    public final boolean pG() {
        if (this.R.get() == null) {
            return false;
        }
        this.R.set(null);
        return true;
    }

    @Override // defpackage.lZe, defpackage.mO
    public final void vz(Object obj) {
        kSh ksh = (kSh) this.R.get();
        ho9 ho9 = null;
        if (ksh != null) {
            cU5.C((nbD) ksh.R, ksh.v);
            this.R.set(null);
        }
        Object P = mLz.P(obj);
        aOO aoo = ((lZe) this).R;
        nbD v = aoo.v();
        Object i = cU5.i(v, null);
        if (i != cU5.R) {
            ho9 = l6.f(aoo, v, i);
        }
        try {
            ((lZe) this).R.Y(P);
        } finally {
            if (ho9 == null || ho9.pG()) {
                cU5.C(v, i);
            }
        }
    }
}
