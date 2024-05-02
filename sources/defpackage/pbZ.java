package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: pbZ  reason: default package */
/* loaded from: classes.dex */
public final class pbZ implements ddq {
    public final iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final m3D f7103R;

    /* renamed from: R  reason: collision with other field name */
    public o7V f7104R;

    public pbZ(nbD nbd, iv7 iv7) {
        this.R = iv7;
        this.f7103R = jjU.v(nbd);
    }

    @Override // defpackage.ddq
    public final void R() {
        o7V o7v = this.f7104R;
        if (o7v != null) {
            o7v.c(null);
        }
        this.f7104R = null;
    }

    @Override // defpackage.ddq
    public final void c() {
        o7V o7v = this.f7104R;
        if (o7v != null) {
            o7v.c(null);
        }
        this.f7104R = null;
    }

    @Override // defpackage.ddq
    public final void v() {
        o7V o7v = this.f7104R;
        if (o7v != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            o7v.c(cancellationException);
        }
        this.f7104R = l6.z(this.f7103R, null, 0, this.R, 3);
    }
}
