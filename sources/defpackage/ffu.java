package defpackage;

/* renamed from: ffu  reason: default package */
/* loaded from: classes.dex */
public abstract class ffu implements fGn {
    public final fGn R;

    public ffu(fGn fgn) {
        this.R = fgn;
    }

    @Override // defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.R.close();
    }

    @Override // defpackage.fGn
    public final hqj e() {
        return this.R.e();
    }

    @Override // java.lang.Object
    public final String toString() {
        return getClass().getSimpleName() + '(' + this.R + ')';
    }
}
