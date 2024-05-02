package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: gsj  reason: default package */
/* loaded from: classes.dex */
public abstract class gsj {
    public static HashMap R = new HashMap();
    public static HashMap v = new HashMap();

    public static mag R(Constructor constructor, Object obj) {
        try {
            return (mag) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v14, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public static int c(Class cls) {
        Constructor constructor;
        boolean z;
        Integer num = (Integer) R.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String v2 = v(canonicalName);
                if (!name.isEmpty()) {
                    v2 = name + "." + v2;
                }
                constructor = Class.forName(v2).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            i = 2;
            if (constructor != null) {
                v.put(cls, Collections.singletonList(constructor));
            } else {
                Sl sl = Sl.R;
                Boolean bool = (Boolean) sl.v.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                sl.v.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            } else if (((j8z) declaredMethods[i2].getAnnotation(j8z.class)) != null) {
                                sl.R(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && f5f.class.isAssignableFrom(superclass)) {
                        if (c(superclass) != 1) {
                            arrayList = new ArrayList((Collection) v.get(superclass));
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && f5f.class.isAssignableFrom(cls2)) {
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) v.get(cls2));
                            }
                            i3++;
                        } else if (arrayList != null) {
                            v.put(cls, arrayList);
                        }
                    }
                }
            }
        }
        R.put(cls, Integer.valueOf(i));
        return i;
    }

    public static String v(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }
}
