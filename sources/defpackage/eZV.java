package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: eZV  reason: default package */
/* loaded from: classes.dex */
public abstract class eZV extends gmj {
    public int e;

    public eZV(int i) {
        super(0, dMN.f2568R);
        this.e = i;
    }

    public abstract Object L();

    public final void O(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                l6.U(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            pdD.o(c().v(), new bMv("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract void R(Object obj, CancellationException cancellationException);

    public Object X(Object obj) {
        return obj;
    }

    public abstract aOO c();

    public Throwable e(Object obj) {
        pag pag = obj instanceof pag ? (pag) obj : null;
        if (pag != null) {
            return pag.f7100R;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r6 = (defpackage.pd2) r6.O(defpackage.hw1.O);
     */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            ift r0 = r12.f3929R
            aOO r1 = r12.c()     // Catch: all -> 0x009b
            na6 r1 = (defpackage.na6) r1     // Catch: all -> 0x009b
            aOO r2 = r1.f6468R     // Catch: all -> 0x009b
            java.lang.Object r1 = r1.v     // Catch: all -> 0x009b
            nbD r3 = r2.v()     // Catch: all -> 0x009b
            java.lang.Object r1 = defpackage.cU5.i(r3, r1)     // Catch: all -> 0x009b
            lmI r4 = defpackage.cU5.R     // Catch: all -> 0x009b
            r5 = 0
            if (r1 == r4) goto L_0x001e
            ho9 r4 = defpackage.l6.f(r2, r3, r1)     // Catch: all -> 0x009b
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            nbD r6 = r2.v()     // Catch: all -> 0x005b
            java.lang.Object r7 = r12.L()     // Catch: all -> 0x005b
            java.lang.Throwable r8 = r12.e(r7)     // Catch: all -> 0x005b
            if (r8 != 0) goto L_0x0042
            int r9 = r12.e     // Catch: all -> 0x005b
            r10 = 1
            if (r9 == r10) goto L_0x0037
            r11 = 2
            if (r9 != r11) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 == 0) goto L_0x0042
            hw1 r9 = defpackage.hw1.O     // Catch: all -> 0x005b
            hdJ r6 = r6.O(r9)     // Catch: all -> 0x005b
            pd2 r6 = (defpackage.pd2) r6     // Catch: all -> 0x005b
            goto L_0x0043
        L_0x0042:
            r6 = r5
        L_0x0043:
            if (r6 == 0) goto L_0x005d
            boolean r9 = r6.X()     // Catch: all -> 0x005b
            if (r9 != 0) goto L_0x005d
            java.util.concurrent.CancellationException r6 = r6.Z()     // Catch: all -> 0x005b
            r12.R(r7, r6)     // Catch: all -> 0x005b
            bvw r7 = new bvw     // Catch: all -> 0x005b
            r7.<init>(r6)     // Catch: all -> 0x005b
            r2.Y(r7)     // Catch: all -> 0x005b
            goto L_0x006f
        L_0x005b:
            r2 = move-exception
            goto L_0x008f
        L_0x005d:
            if (r8 == 0) goto L_0x0068
            bvw r6 = new bvw     // Catch: all -> 0x005b
            r6.<init>(r8)     // Catch: all -> 0x005b
            r2.Y(r6)     // Catch: all -> 0x005b
            goto L_0x006f
        L_0x0068:
            java.lang.Object r6 = r12.X(r7)     // Catch: all -> 0x005b
            r2.Y(r6)     // Catch: all -> 0x005b
        L_0x006f:
            if (r4 == 0) goto L_0x0077
            boolean r2 = r4.pG()     // Catch: all -> 0x009b
            if (r2 == 0) goto L_0x007a
        L_0x0077:
            defpackage.cU5.C(r3, r1)     // Catch: all -> 0x009b
        L_0x007a:
            r0.getClass()     // Catch: all -> 0x0080
            o8s r0 = defpackage.o8s.R     // Catch: all -> 0x0080
            goto L_0x0087
        L_0x0080:
            r0 = move-exception
            bvw r1 = new bvw
            r1.<init>(r0)
            r0 = r1
        L_0x0087:
            java.lang.Throwable r0 = defpackage.mwl.R(r0)
            r12.O(r5, r0)
            goto L_0x00b0
        L_0x008f:
            if (r4 == 0) goto L_0x0097
            boolean r4 = r4.pG()     // Catch: all -> 0x009b
            if (r4 == 0) goto L_0x009a
        L_0x0097:
            defpackage.cU5.C(r3, r1)     // Catch: all -> 0x009b
        L_0x009a:
            throw r2     // Catch: all -> 0x009b
        L_0x009b:
            r1 = move-exception
            r0.getClass()     // Catch: all -> 0x00a2
            o8s r0 = defpackage.o8s.R     // Catch: all -> 0x00a2
            goto L_0x00a9
        L_0x00a2:
            r0 = move-exception
            bvw r2 = new bvw
            r2.<init>(r0)
            r0 = r2
        L_0x00a9:
            java.lang.Throwable r0 = defpackage.mwl.R(r0)
            r12.O(r1, r0)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eZV.run():void");
    }
}
