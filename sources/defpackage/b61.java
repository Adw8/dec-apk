package defpackage;

/* renamed from: b61  reason: default package */
/* loaded from: classes.dex */
public abstract class b61 {

    /* renamed from: R  reason: collision with other field name */
    public static final ThreadLocal f1531R = new ThreadLocal();
    public static volatile gS0 R = lEY.R;

    /* renamed from: R  reason: collision with other field name */
    public static volatile boolean f1532R = false;

    public static synchronized void R() {
        synchronized (b61.class) {
            gS0 v = v();
            R = lEY.R;
            f1531R.remove();
            v.close();
        }
    }

    public static gS0 v() {
        if (f1532R) {
            return R;
        }
        ThreadLocal threadLocal = f1531R;
        gS0 gs0 = (gS0) threadLocal.get();
        if (gs0 != null && !(gs0 instanceof lEY)) {
            return gs0;
        }
        gS0 v = R.v();
        threadLocal.set(v);
        return v;
    }
}
