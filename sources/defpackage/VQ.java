package defpackage;

import java.io.Closeable;

/* renamed from: VQ  reason: default package */
/* loaded from: classes.dex */
public final class VQ implements Closeable, jy_ {
    public final nbD R;

    public VQ(nbD nbd) {
        this.R = nbd;
    }

    @Override // defpackage.jy_
    public final nbD C() {
        return this.R;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dTl.j(this.R, null);
    }
}
