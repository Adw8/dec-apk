package defpackage;

/* renamed from: bP9  reason: default package */
/* loaded from: classes.dex */
public final class bP9 implements fGn {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public bd4 f1633R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dj8 f1634R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1635R;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1636v;

    /* renamed from: R  reason: collision with other field name */
    public final ME f1632R = new ME();
    public final ME v = new ME();

    public bP9(dj8 dj8, long j, boolean z) {
        this.f1634R = dj8;
        this.R = j;
        this.f1635R = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c1, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #3 {, blocks: (B:9:0x0012, B:11:0x0018, B:13:0x001e, B:19:0x0028, B:50:0x009a, B:20:0x002d, B:22:0x0030, B:24:0x0033, B:26:0x0037, B:28:0x003b, B:29:0x003d, B:31:0x0040, B:32:0x0041, B:33:0x0049, B:35:0x004d, B:37:0x0055, B:39:0x0069, B:41:0x0078, B:42:0x0084, B:45:0x008c, B:61:0x00ba, B:62:0x00c1, B:21:0x002e, B:30:0x003e), top: B:67:0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002e A[Catch: all -> 0x00c2, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:9:0x0012, B:11:0x0018, B:13:0x001e, B:19:0x0028, B:50:0x009a, B:20:0x002d, B:22:0x0030, B:24:0x0033, B:26:0x0037, B:28:0x003b, B:29:0x003d, B:31:0x0040, B:32:0x0041, B:33:0x0049, B:35:0x004d, B:37:0x0055, B:39:0x0069, B:41:0x0078, B:42:0x0084, B:45:0x008c, B:61:0x00ba, B:62:0x00c1, B:21:0x002e, B:30:0x003e), top: B:67:0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009a A[Catch: all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:9:0x0012, B:11:0x0018, B:13:0x001e, B:19:0x0028, B:50:0x009a, B:20:0x002d, B:22:0x0030, B:24:0x0033, B:26:0x0037, B:28:0x003b, B:29:0x003d, B:31:0x0040, B:32:0x0041, B:33:0x0049, B:35:0x004d, B:37:0x0055, B:39:0x0069, B:41:0x0078, B:42:0x0084, B:45:0x008c, B:61:0x00ba, B:62:0x00c1, B:21:0x002e, B:30:0x003e), top: B:67:0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a2 A[LOOP:0: B:7:0x000e->B:53:0x00a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00a6 A[SYNTHETIC] */
    @Override // defpackage.fGn
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long Y(defpackage.ME r16, long r17) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bP9.Y(ME, long):long");
    }

    @Override // defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        dj8 dj8 = this.f1634R;
        synchronized (dj8) {
            this.f1636v = true;
            ME me = this.v;
            j = me.R;
            me.X();
            dj8.notifyAll();
        }
        if (j > 0) {
            dj8 dj82 = this.f1634R;
            bd4 bd4 = khE.R;
            dj82.f2840R.H(j);
        }
        this.f1634R.R();
    }

    @Override // defpackage.fGn
    public final hqj e() {
        return this.f1634R.f2841R;
    }
}
