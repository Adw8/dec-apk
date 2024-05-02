package defpackage;

/* renamed from: yn  reason: default package */
/* loaded from: classes.dex */
public final class yn implements AutoCloseable {
    public final oDA R;

    public yn(J8 j8) {
        this.R = new oDA(j8);
    }

    public final s0 R() {
        s0 s0Var;
        synchronized (this.R) {
            oDA oda = this.R;
            int g = oda.g();
            int g2 = oda.g();
            int g3 = oda.g();
            int g4 = oda.g();
            oda.g();
            oda.g();
            s0Var = new s0(g, g2, g3, g4, oda.N((long) g4));
        }
        return s0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.R.close();
    }
}
