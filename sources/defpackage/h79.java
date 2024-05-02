package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: h79  reason: default package */
/* loaded from: classes.dex */
public abstract class h79 {
    public static final List R = pdD.Y(Application.class, nmx.class);
    public static final List v = Collections.singletonList(nmx.class);

    public static final Constructor R(Class cls, List list) {
        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            List E = P7.E(constructor.getParameterTypes());
            if (n3x.v(list, E)) {
                return constructor;
            }
            if (list.size() == E.size() && E.containsAll(list)) {
                StringBuilder U = opT.U("Class ");
                U.append(cls.getSimpleName());
                U.append(" must have parameters in the proper order: ");
                U.append(list);
                throw new UnsupportedOperationException(U.toString());
            }
        }
        return null;
    }

    public static final kvj v(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (kvj) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
