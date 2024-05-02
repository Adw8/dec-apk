package defpackage;

import java.io.IOException;

/* renamed from: hug  reason: default package */
/* loaded from: classes.dex */
public final class hug extends arx {
    public final arx R;

    /* renamed from: R  reason: collision with other field name */
    public IOException f4414R;

    /* renamed from: R  reason: collision with other field name */
    public final oDA f4415R;

    public hug(arx arx) {
        this.R = arx;
        this.f4415R = new oDA(new opQ(this, arx.O()));
    }

    @Override // defpackage.arx
    public final Jl O() {
        return this.f4415R;
    }

    @Override // defpackage.arx
    public final oFB X() {
        return this.R.X();
    }

    @Override // defpackage.arx
    public final long c() {
        return this.R.c();
    }

    @Override // defpackage.arx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.R.close();
    }
}
