package defpackage;

/* renamed from: ib1  reason: default package */
/* loaded from: classes.dex */
public final class ib1 implements axx {
    public final /* synthetic */ oIS R;

    /* renamed from: R  reason: collision with other field name */
    public final px6 f4661R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4662R;

    public ib1(oIS ois) {
        this.R = ois;
        this.f4661R = new px6(ois.f6730R.e());
    }

    @Override // defpackage.axx
    public final void K(ME me, long j) {
        if (!this.f4662R) {
            asb.R(me.R, 0, j);
            this.R.f6730R.K(me, j);
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.axx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f4662R) {
            this.f4662R = true;
            oIS ois = this.R;
            px6 px6 = this.f4661R;
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
        return this.f4661R;
    }

    @Override // defpackage.axx, java.io.Flushable
    public final void flush() {
        if (!this.f4662R) {
            this.R.f6730R.flush();
        }
    }
}
