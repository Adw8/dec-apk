package defpackage;

/* renamed from: g8d  reason: default package */
/* loaded from: classes.dex */
public abstract class g8d {
    public static final j3H R;

    static {
        j3H j3h = null;
        try {
            j3h = (j3H) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (j3h == null) {
            j3h = new j3H();
        }
        R = j3h;
    }

    public static x_ R(Class cls) {
        R.getClass();
        return new x_(cls);
    }
}
