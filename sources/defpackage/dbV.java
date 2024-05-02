package defpackage;

/* renamed from: dbV  reason: default package */
/* loaded from: classes.dex */
public abstract class dbV {
    public static final ThreadLocal R = new ThreadLocal();

    public static mpq R() {
        ThreadLocal threadLocal = R;
        mpq mpq = (mpq) threadLocal.get();
        if (mpq != null) {
            return mpq;
        }
        Rk rk = new Rk(Thread.currentThread());
        threadLocal.set(rk);
        return rk;
    }
}
