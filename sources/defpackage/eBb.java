package defpackage;

/* renamed from: eBb  reason: default package */
/* loaded from: classes.dex */
public final class eBb implements axx {
    public final /* synthetic */ oIS R;

    /* renamed from: R  reason: collision with other field name */
    public final px6 f3025R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3026R;

    public eBb(oIS ois) {
        this.R = ois;
        this.f3025R = new px6(ois.f6730R.e());
    }

    @Override // defpackage.axx
    public final void K(ME me, long j) {
        if (!(!this.f3026R)) {
            throw new IllegalStateException("closed".toString());
        } else if (j != 0) {
            this.R.f6730R.A(j);
            this.R.f6730R.w("\r\n");
            this.R.f6730R.K(me, j);
            this.R.f6730R.w("\r\n");
        }
    }

    @Override // defpackage.axx, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f3026R) {
            this.f3026R = true;
            this.R.f6730R.w("0\r\n\r\n");
            oIS ois = this.R;
            px6 px6 = this.f3025R;
            ois.getClass();
            hqj hqj = px6.R;
            px6.R = hqj.R;
            hqj.R();
            hqj.v();
            this.R.R = 3;
        }
    }

    @Override // defpackage.axx
    public final hqj e() {
        return this.f3025R;
    }

    @Override // defpackage.axx, java.io.Flushable
    public final synchronized void flush() {
        if (!this.f3026R) {
            this.R.f6730R.flush();
        }
    }
}
