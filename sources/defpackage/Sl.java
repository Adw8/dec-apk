package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Sl  reason: default package */
/* loaded from: classes.dex */
public final class Sl {
    public static Sl R = new Sl();

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f521R = new HashMap();
    public final HashMap v = new HashMap();

    public static void c(HashMap hashMap, P5 p5, alX alx, Class cls) {
        alX alx2 = (alX) hashMap.get(p5);
        if (alx2 != null && alx != alx2) {
            Method method = p5.f382R;
            StringBuilder U = opT.U("Method ");
            U.append(method.getName());
            U.append(" in ");
            U.append(cls.getName());
            U.append(" already declared with different @OnLifecycleEvent value: previous value ");
            U.append(alx2);
            U.append(", new value ");
            U.append(alx);
            throw new IllegalArgumentException(U.toString());
        } else if (alx2 == null) {
            hashMap.put(p5, alx);
        }
    }

    public final y4 R(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(v(superclass).f7483R);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : v(cls2).f7483R.entrySet()) {
                c(hashMap, (P5) entry.getKey(), (alX) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            j8z j8z = (j8z) method.getAnnotation(j8z.class);
            if (j8z != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(nu_.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                alX value = j8z.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(alX.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == alX.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new P5(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        y4 y4Var = new y4(hashMap);
        this.f521R.put(cls, y4Var);
        this.v.put(cls, Boolean.valueOf(z));
        return y4Var;
    }

    public final y4 v(Class cls) {
        y4 y4Var = (y4) this.f521R.get(cls);
        return y4Var != null ? y4Var : R(cls, null);
    }
}
