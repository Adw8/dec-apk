package defpackage;

/* renamed from: n8j  reason: default package */
/* loaded from: classes.dex */
public final class n8j extends kE9 implements Runnable, mou {
    public final hSI R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f6315R;

    /* renamed from: R  reason: collision with other field name */
    public final kE9 f6316R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mou f6317R;
    public final int e;
    private volatile int runningWorkers;

    public n8j(int i) {
        flf flf = flf.R;
        this.f6316R = flf;
        this.e = i;
        mou mou = flf instanceof mou ? (mou) flf : null;
        this.f6317R = mou == null ? bEz.R : mou;
        this.R = new hSI();
        this.f6315R = new Object();
    }

    @Override // defpackage.mou
    public final void C(long j, xx xxVar) {
        this.f6317R.C(j, xxVar);
    }

    @Override // defpackage.kE9
    public final void X4(nbD nbd, Runnable runnable) {
        this.R.R(runnable);
        boolean z = true;
        if (!(this.runningWorkers >= this.e)) {
            synchronized (this.f6315R) {
                if (this.runningWorkers >= this.e) {
                    z = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z) {
                this.f6316R.X4(this, this);
            }
        }
    }

    @Override // defpackage.mou
    public final jZi f(long j, Runnable runnable, nbD nbd) {
        return this.f6317R.f(j, runnable, nbd);
    }

    @Override // defpackage.kE9
    public final void mL(nbD nbd, Runnable runnable) {
        this.R.R(runnable);
        boolean z = true;
        if (!(this.runningWorkers >= this.e)) {
            synchronized (this.f6315R) {
                if (this.runningWorkers >= this.e) {
                    z = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z) {
                this.f6316R.mL(this, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r1 = r4.f6315R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.R.c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        r4.runningWorkers++;
     */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            hSI r2 = r4.R
            java.lang.Object r2 = r2.e()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch: all -> 0x0010
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            aIH r3 = defpackage.aIH.R
            defpackage.pdD.o(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            kE9 r2 = r4.f6316R
            boolean r2 = r2.zw(r4)
            if (r2 == 0) goto L_0x0002
            kE9 r0 = r4.f6316R
            r0.mL(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f6315R
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: all -> 0x0045
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch: all -> 0x0045
            hSI r2 = r4.R     // Catch: all -> 0x0045
            int r2 = r2.c()     // Catch: all -> 0x0045
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch: all -> 0x0045
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: all -> 0x0045
            monitor-exit(r1)
            goto L_0x0001
        L_0x0045:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n8j.run():void");
    }
}
