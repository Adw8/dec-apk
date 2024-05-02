package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lMx  reason: default package */
/* loaded from: classes.dex */
public final class lMx implements r2, Cloneable {
    public volatile boolean O;
    public fPH R;

    /* renamed from: R  reason: collision with other field name */
    public final j0 f5666R;

    /* renamed from: R  reason: collision with other field name */
    public Object f5667R;

    /* renamed from: R  reason: collision with other field name */
    public final l_c f5670R;

    /* renamed from: R  reason: collision with other field name */
    public final nZz f5671R;

    /* renamed from: R  reason: collision with other field name */
    public oaB f5672R;

    /* renamed from: R  reason: collision with other field name */
    public ot7 f5673R;

    /* renamed from: R  reason: collision with other field name */
    public final pqF f5674R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5675R;
    public final ppN X;
    public boolean c;
    public boolean e;
    public volatile fPH v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f5677v;

    /* renamed from: R  reason: collision with other field name */
    public final AtomicBoolean f5669R = new AtomicBoolean();

    /* renamed from: X  reason: collision with other field name */
    public boolean f5676X = true;

    /* renamed from: R  reason: collision with other field name */
    public final CopyOnWriteArrayList f5668R = new CopyOnWriteArrayList();

    public lMx(nZz nzz, j0 j0Var, boolean z) {
        this.f5671R = nzz;
        this.f5666R = j0Var;
        this.f5675R = z;
        this.f5670R = (l_c) nzz.f6437R.R;
        bd4 bd4 = khE.R;
        this.X = (ppN) nzz.f6449R.R;
        pqF pqf = new pqF(0, this);
        pqf.L((long) nzz.R, TimeUnit.MILLISECONDS);
        this.f5674R = pqf;
    }

    public static final String v(lMx lmx) {
        StringBuilder sb = new StringBuilder();
        sb.append(lmx.O ? "canceled " : "");
        sb.append(lmx.f5675R ? "web socket" : "call");
        sb.append(" to ");
        sb.append(((a7_) lmx.f5666R.f4786R).L());
        return sb.toString();
    }

    public final void L(boolean z) {
        fPH fph;
        synchronized (this) {
            if (!this.f5676X) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (fph = this.v) != null) {
            fph.R.cancel();
            fph.f3410R.m(fph, true, true, null);
        }
        this.R = null;
    }

    public final void O(R4 r4) {
        n1g n1g;
        if (this.f5669R.compareAndSet(false, true)) {
            oMv omv = oMv.f6773R;
            this.f5667R = oMv.f6773R.L();
            this.X.getClass();
            lLp llp = this.f5671R.f6447R;
            n1g n1g2 = new n1g(this, r4);
            synchronized (llp) {
                llp.R.add(n1g2);
                if (!this.f5675R) {
                    String str = ((a7_) this.f5666R.f4786R).e;
                    Iterator it = llp.v.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = llp.R.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    n1g = null;
                                    break;
                                }
                                n1g = (n1g) it2.next();
                                if (n3x.v(((a7_) n1g.f6273R.f5666R.f4786R).e, str)) {
                                    break;
                                }
                            }
                        } else {
                            n1g = (n1g) it.next();
                            if (n3x.v(((a7_) n1g.f6273R.f5666R.f4786R).e, str)) {
                                break;
                            }
                        }
                    }
                    if (n1g != null) {
                        n1g2.f6272R = n1g.f6272R;
                    }
                }
            }
            llp.v();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final Socket U() {
        ot7 ot7 = this.f5673R;
        bd4 bd4 = khE.R;
        ArrayList arrayList = ot7.f7002R;
        Iterator it = arrayList.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (n3x.v(((Reference) it.next()).get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            arrayList.remove(i);
            this.f5673R = null;
            if (arrayList.isEmpty()) {
                ot7.f6996R = System.nanoTime();
                l_c l_c = this.f5670R;
                l_c.getClass();
                bd4 bd42 = khE.R;
                if (ot7.f7006R || l_c.R == 0) {
                    ot7.f7006R = true;
                    l_c.f5783R.remove(ot7);
                    if (l_c.f5783R.isEmpty()) {
                        l_c.f5782R.R();
                    }
                    z = true;
                } else {
                    l_c.f5782R.e(l_c.f5781R, 0);
                }
                if (z) {
                    return ot7.f7007v;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final IOException X(IOException iOException) {
        IOException iOException2;
        Socket U;
        bd4 bd4 = khE.R;
        ot7 ot7 = this.f5673R;
        if (ot7 != null) {
            synchronized (ot7) {
                U = U();
            }
            if (this.f5673R == null) {
                if (U != null) {
                    khE.v(U);
                }
                this.X.getClass();
            } else {
                if (!(U == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f5677v && this.f5674R.m()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            this.X.getClass();
        } else {
            this.X.getClass();
        }
        return iOException2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dEt Z() {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            nZz r0 = r12.f5671R
            java.util.List r0 = r0.f6442R
            defpackage.s3.E(r0, r2)
            k24 r0 = new k24
            nZz r1 = r12.f5671R
            r0.<init>(r1)
            r2.add(r0)
            xv r0 = new xv
            nZz r1 = r12.f5671R
            nvJ r1 = r1.f6448R
            r0.<init>(r1)
            r2.add(r0)
            Lx r0 = new Lx
            nZz r1 = r12.f5671R
            r1.getClass()
            r0.<init>()
            r2.add(r0)
            aFM r0 = defpackage.aFM.R
            r2.add(r0)
            boolean r0 = r12.f5675R
            if (r0 != 0) goto L_0x003f
            nZz r0 = r12.f5671R
            java.util.List r0 = r0.f6459v
            defpackage.s3.E(r0, r2)
        L_0x003f:
            QF r0 = new QF
            boolean r1 = r12.f5675R
            r0.<init>(r1)
            r2.add(r0)
            ety r9 = new ety
            r3 = 0
            r4 = 0
            j0 r10 = r12.f5666R
            nZz r0 = r12.f5671R
            int r6 = r0.v
            int r7 = r0.c
            int r8 = r0.e
            r0 = r9
            r1 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            dEt r2 = r9.v(r10)     // Catch: IOException -> 0x0078, all -> 0x0076
            boolean r3 = r12.O     // Catch: IOException -> 0x0078, all -> 0x0076
            if (r3 != 0) goto L_0x006b
            r12.x(r1)
            return r2
        L_0x006b:
            defpackage.asb.v(r2)     // Catch: IOException -> 0x0078, all -> 0x0076
            java.io.IOException r2 = new java.io.IOException     // Catch: IOException -> 0x0078, all -> 0x0076
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: IOException -> 0x0078, all -> 0x0076
            throw r2     // Catch: IOException -> 0x0078, all -> 0x0076
        L_0x0076:
            r2 = move-exception
            goto L_0x008d
        L_0x0078:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r12.x(r0)     // Catch: all -> 0x0089
            if (r0 != 0) goto L_0x0088
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x0089
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch: all -> 0x0089
            throw r0     // Catch: all -> 0x0089
        L_0x0088:
            throw r0     // Catch: all -> 0x0089
        L_0x0089:
            r0 = move-exception
            r11 = r2
            r2 = r0
            r0 = r11
        L_0x008d:
            if (r0 != 0) goto L_0x0092
            r12.x(r1)
        L_0x0092:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lMx.Z():dEt");
    }

    public final void cancel() {
        if (!this.O) {
            this.O = true;
            fPH fph = this.v;
            if (fph != null) {
                fph.R.cancel();
            }
            Iterator it = this.f5668R.iterator();
            while (it.hasNext()) {
                ((oCF) it.next()).cancel();
            }
            this.X.getClass();
        }
    }

    @Override // java.lang.Object
    public final Object clone() {
        return new lMx(this.f5671R, this.f5666R, this.f5675R);
    }

    public final void e(ot7 ot7) {
        bd4 bd4 = khE.R;
        if (this.f5673R == null) {
            this.f5673R = ot7;
            ot7.f7002R.add(new izQ(this, this.f5667R));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x001d A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:8:0x000e, B:14:0x0017, B:17:0x001d, B:19:0x0021, B:20:0x0023, B:22:0x0027, B:27:0x0030, B:29:0x0034), top: B:50:0x000e }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0021 A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:8:0x000e, B:14:0x0017, B:17:0x001d, B:19:0x0021, B:20:0x0023, B:22:0x0027, B:27:0x0030, B:29:0x0034), top: B:50:0x000e }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException m(defpackage.fPH r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            fPH r0 = r2.v
            boolean r3 = defpackage.n3x.v(r3, r0)
            if (r3 != 0) goto L_0x0009
            return r6
        L_0x0009:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L_0x0015
            boolean r1 = r2.c     // Catch: all -> 0x0013
            if (r1 != 0) goto L_0x001b
            goto L_0x0015
        L_0x0013:
            r3 = move-exception
            goto L_0x003c
        L_0x0015:
            if (r5 == 0) goto L_0x003e
            boolean r1 = r2.e     // Catch: all -> 0x0013
            if (r1 == 0) goto L_0x003e
        L_0x001b:
            if (r4 == 0) goto L_0x001f
            r2.c = r0     // Catch: all -> 0x0013
        L_0x001f:
            if (r5 == 0) goto L_0x0023
            r2.e = r0     // Catch: all -> 0x0013
        L_0x0023:
            boolean r4 = r2.c     // Catch: all -> 0x0013
            if (r4 != 0) goto L_0x002d
            boolean r5 = r2.e     // Catch: all -> 0x0013
            if (r5 != 0) goto L_0x002d
            r5 = r3
            goto L_0x002e
        L_0x002d:
            r5 = r0
        L_0x002e:
            if (r4 != 0) goto L_0x0039
            boolean r4 = r2.e     // Catch: all -> 0x0013
            if (r4 != 0) goto L_0x0039
            boolean r4 = r2.f5676X     // Catch: all -> 0x0013
            if (r4 != 0) goto L_0x0039
            r0 = r3
        L_0x0039:
            r4 = r0
            r0 = r5
            goto L_0x003f
        L_0x003c:
            monitor-exit(r2)
            throw r3
        L_0x003e:
            r4 = r0
        L_0x003f:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0054
            r5 = 0
            r2.v = r5
            ot7 r5 = r2.f5673R
            if (r5 == 0) goto L_0x0054
            monitor-enter(r5)
            int r0 = r5.c     // Catch: all -> 0x0051
            int r0 = r0 + r3
            r5.c = r0     // Catch: all -> 0x0051
            monitor-exit(r5)
            goto L_0x0054
        L_0x0051:
            r2 = move-exception
            monitor-exit(r5)
            throw r2
        L_0x0054:
            if (r4 == 0) goto L_0x005b
            java.io.IOException r2 = r2.X(r6)
            return r2
        L_0x005b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lMx.m(fPH, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException x(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f5676X) {
                this.f5676X = false;
                if (!this.c) {
                    if (!this.e) {
                        z = true;
                    }
                }
            }
        }
        return z ? X(iOException) : iOException;
    }
}
