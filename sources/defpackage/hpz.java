package defpackage;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* renamed from: hpz  reason: default package */
/* loaded from: classes.dex */
public class hpz {
    public static final hpz R;

    /* renamed from: R  reason: collision with other field name */
    public final Constructor f4391R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4392R = true;

    static {
        R = "Dalvik".equals(System.getProperty("java.vm.name")) ? new kJV() : new hpz();
    }

    public hpz() {
        Constructor constructor;
        try {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            try {
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        } catch (NoClassDefFoundError | NoSuchMethodException unused2) {
            constructor = null;
        }
        this.f4391R = constructor;
    }

    public Executor R() {
        return null;
    }

    public Object v(Method method, Class cls, Object obj, Object... objArr) {
        Constructor constructor = this.f4391R;
        return (constructor != null ? (MethodHandles.Lookup) constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
