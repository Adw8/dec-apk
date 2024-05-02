package defpackage;

import java.lang.reflect.Method;

/* renamed from: coo  reason: default package */
/* loaded from: classes.dex */
public abstract class coo {
    public static final Method R;

    static {
        Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
        declaredMethod.setAccessible(true);
        R = declaredMethod;
    }
}
