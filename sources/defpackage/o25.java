package defpackage;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o25  reason: default package */
/* loaded from: classes.dex */
public abstract class o25 {
    public final FK R;
    public final FK c;
    public final FK v;

    public o25(FK fk, FK fk2, FK fk3) {
        this.R = fk;
        this.v = fk2;
        this.c = fk3;
    }

    public final g_3 L() {
        String readString = ((aFZ) this).f807R.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (g_3) c(readString).invoke(null, R());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final Parcelable O(Parcelable parcelable, int i) {
        return !X(i) ? parcelable : ((aFZ) this).f807R.readParcelable(aFZ.class.getClassLoader());
    }

    public abstract aFZ R();

    public abstract boolean X(int i);

    public abstract void Z(int i);

    public final Method c(String str) {
        Method method = (Method) this.R.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, o25.class.getClassLoader()).getDeclaredMethod("read", o25.class);
        this.R.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method e(Class cls) {
        Method method = (Method) this.v.getOrDefault(cls.getName(), null);
        if (method != null) {
            return method;
        }
        Class v = v(cls);
        System.currentTimeMillis();
        Method declaredMethod = v.getDeclaredMethod("write", cls, o25.class);
        this.v.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final void m(g_3 g_3) {
        if (g_3 == null) {
            ((aFZ) this).f807R.writeString(null);
            return;
        }
        try {
            ((aFZ) this).f807R.writeString(v(g_3.getClass()).getName());
            aFZ R = R();
            try {
                e(g_3.getClass()).invoke(null, g_3, R);
                R.x();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(g_3.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }

    public final Class v(Class cls) {
        Class cls2 = (Class) this.c.getOrDefault(cls.getName(), null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }
}
