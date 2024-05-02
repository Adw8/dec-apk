package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: jr5  reason: default package */
/* loaded from: classes.dex */
public final class jr5 implements Closeable {
    public static final oWQ c;
    public long L;
    public long O;
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public final bqM f5031R;

    /* renamed from: R  reason: collision with other field name */
    public final gtV f5032R;

    /* renamed from: R  reason: collision with other field name */
    public final hiT f5033R;

    /* renamed from: R  reason: collision with other field name */
    public final i97 f5034R;

    /* renamed from: R  reason: collision with other field name */
    public final String f5035R;

    /* renamed from: R  reason: collision with other field name */
    public final Socket f5036R;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f5038R;

    /* renamed from: R  reason: collision with other field name */
    public final oSI f5039R;

    /* renamed from: R  reason: collision with other field name */
    public final oWQ f5040R;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public long f5042X;
    public long Z;

    /* renamed from: c  reason: collision with other field name */
    public long f5043c;

    /* renamed from: c  reason: collision with other field name */
    public final hiT f5044c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public long f5045e;
    public long m;
    public long v;

    /* renamed from: v  reason: collision with other field name */
    public final dq f5046v;

    /* renamed from: v  reason: collision with other field name */
    public final hiT f5047v;

    /* renamed from: v  reason: collision with other field name */
    public oWQ f5048v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f5049v;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5041R = true;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f5037R = new LinkedHashMap();

    static {
        oWQ owq = new oWQ();
        owq.v(7, 65535);
        owq.v(5, 16384);
        c = owq;
    }

    public jr5(gMd gmd) {
        this.f5031R = gmd.f3738R;
        String str = gmd.f3740R;
        Jl jl = null;
        str = str == null ? null : str;
        this.f5035R = str;
        this.X = 3;
        i97 i97 = gmd.f3739R;
        this.f5034R = i97;
        hiT O = i97.O();
        this.f5033R = O;
        this.f5047v = i97.O();
        this.f5044c = i97.O();
        this.f5046v = e38.R;
        oWQ owq = new oWQ();
        owq.v(7, 16777216);
        this.f5040R = owq;
        oWQ owq2 = c;
        this.f5048v = owq2;
        this.m = (long) owq2.R();
        Socket socket = gmd.f3741R;
        this.f5036R = socket == null ? null : socket;
        NV nv = gmd.f3737R;
        this.f5032R = new gtV(nv == null ? null : nv, true);
        Jl jl2 = gmd.f3736R;
        this.f5039R = new oSI(this, new goc(jl2 != null ? jl2 : jl, true));
        this.f5038R = new LinkedHashSet();
        int i = gmd.R;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            O.e(new aHy(opT.H(str, " ping"), new ejV(3, nanos, this)), nanos);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f5032R.e);
        r6 = (long) r2;
        r8.Z += r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(int r9, boolean r10, defpackage.ME r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            gtV r8 = r8.f5032R
            r8.c(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.Z     // Catch: InterruptedException -> 0x0059, all -> 0x0057
            long r6 = r8.m     // Catch: InterruptedException -> 0x0059, all -> 0x0057
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.LinkedHashMap r2 = r8.f5037R     // Catch: InterruptedException -> 0x0059, all -> 0x0057
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: InterruptedException -> 0x0059, all -> 0x0057
            boolean r2 = r2.containsKey(r4)     // Catch: InterruptedException -> 0x0059, all -> 0x0057
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch: InterruptedException -> 0x0059, all -> 0x0057
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch: InterruptedException -> 0x0059, all -> 0x0057
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: InterruptedException -> 0x0059, all -> 0x0057
            throw r9     // Catch: InterruptedException -> 0x0059, all -> 0x0057
        L_0x0032:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: all -> 0x0057
            int r2 = (int) r4     // Catch: all -> 0x0057
            gtV r4 = r8.f5032R     // Catch: all -> 0x0057
            int r4 = r4.e     // Catch: all -> 0x0057
            int r2 = java.lang.Math.min(r2, r4)     // Catch: all -> 0x0057
            long r4 = r8.Z     // Catch: all -> 0x0057
            long r6 = (long) r2     // Catch: all -> 0x0057
            long r4 = r4 + r6
            r8.Z = r4     // Catch: all -> 0x0057
            monitor-exit(r8)
            long r12 = r12 - r6
            gtV r4 = r8.f5032R
            if (r10 == 0) goto L_0x0052
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = r3
        L_0x0053:
            r4.c(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0057:
            r9 = move-exception
            goto L_0x0066
        L_0x0059:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: all -> 0x0057
            r9.interrupt()     // Catch: all -> 0x0057
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: all -> 0x0057
            r9.<init>()     // Catch: all -> 0x0057
            throw r9     // Catch: all -> 0x0057
        L_0x0066:
            monitor-exit(r8)
            throw r9
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr5.C(int, boolean, ME, long):void");
    }

    public final synchronized void H(long j) {
        long j2 = this.O + j;
        this.O = j2;
        long j3 = j2 - this.L;
        if (j3 >= ((long) (this.f5040R.R() / 2))) {
            t(j3, 0);
            this.L += j3;
        }
    }

    public final synchronized dj8 O(int i) {
        dj8 dj8;
        dj8 = (dj8) this.f5037R.remove(Integer.valueOf(i));
        notifyAll();
        return dj8;
    }

    public final void R(gtp gtp, gtp gtp2, IOException iOException) {
        int i;
        bd4 bd4 = khE.R;
        try {
            Z(gtp);
        } catch (IOException unused) {
        }
        Object[] objArr = null;
        synchronized (this) {
            if (!this.f5037R.isEmpty()) {
                objArr = this.f5037R.values().toArray(new dj8[0]);
                if (objArr != null) {
                    this.f5037R.clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            }
        }
        dj8[] dj8Arr = (dj8[]) objArr;
        if (dj8Arr != null) {
            for (dj8 dj8 : dj8Arr) {
                try {
                    dj8.c(gtp2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f5032R.close();
        } catch (IOException unused3) {
        }
        try {
            this.f5036R.close();
        } catch (IOException unused4) {
        }
        this.f5033R.O();
        this.f5047v.O();
        this.f5044c.O();
    }

    public final synchronized dj8 X(int i) {
        return (dj8) this.f5037R.get(Integer.valueOf(i));
    }

    public final void Z(gtp gtp) {
        synchronized (this.f5032R) {
            synchronized (this) {
                if (!this.f5049v) {
                    this.f5049v = true;
                    this.f5032R.O(this.e, gtp, asb.f1481R);
                }
            }
        }
    }

    public final void c(IOException iOException) {
        gtp gtp = gtp.PROTOCOL_ERROR;
        R(gtp, gtp, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        R(gtp.NO_ERROR, gtp.CANCEL, null);
    }

    public final void j(int i, gtp gtp) {
        hiT hit = this.f5033R;
        hiT.c(hit, this.f5035R + '[' + i + "] writeSynReset", new n5W(this, i, gtp, 1));
    }

    public final void t(long j, int i) {
        hiT hit = this.f5033R;
        hiT.c(hit, this.f5035R + '[' + i + "] windowUpdate", new iqu(this, i, j));
    }
}
