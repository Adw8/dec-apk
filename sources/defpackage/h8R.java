package defpackage;

/* renamed from: h8R  reason: default package */
/* loaded from: classes.dex */
public final class h8R extends nJP {
    public static final h8R R = new h8R();

    public h8R() {
        super(dMN.R, dMN.v, dMN.f2569v);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.kE9, java.lang.Object
    public final String toString() {
        return "Dispatchers.Default";
    }
}
