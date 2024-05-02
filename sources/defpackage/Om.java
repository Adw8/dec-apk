package defpackage;

/* renamed from: Om  reason: default package */
/* loaded from: classes.dex */
public abstract class Om {
    public static final Class R;

    /* renamed from: R  reason: collision with other field name */
    public static final boolean f381R;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        R = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f381R = cls2 != null;
    }

    public static boolean R() {
        return R != null && !f381R;
    }
}
