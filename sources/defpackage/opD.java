package defpackage;

/* renamed from: opD  reason: default package */
/* loaded from: classes.dex */
public final class opD extends arx implements fGn {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final oFB f6962R;

    public opD(oFB ofb, long j) {
        this.f6962R = ofb;
        this.R = j;
    }

    @Override // defpackage.arx
    public final Jl O() {
        return new oDA(this);
    }

    @Override // defpackage.arx
    public final oFB X() {
        return this.f6962R;
    }

    @Override // defpackage.fGn
    public final long Y(ME me, long j) {
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.arx
    public final long c() {
        return this.R;
    }

    @Override // defpackage.arx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.fGn
    public final hqj e() {
        return hqj.R;
    }
}
