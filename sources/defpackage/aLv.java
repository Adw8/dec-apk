package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* renamed from: aLv  reason: default package */
/* loaded from: classes.dex */
public final class aLv {
    public static final cE0 R = new cE0();

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hAW f847R;

    public aLv(hAW haw) {
        this.f847R = haw;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return v(classLoader, str);
        } catch (ClassCastException e) {
            throw new j8f(jQ.C("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new j8f(jQ.C("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public static Class v(ClassLoader classLoader, String str) {
        cE0 ce0 = R;
        cE0 ce02 = (cE0) ce0.getOrDefault(classLoader, null);
        if (ce02 == null) {
            ce02 = new cE0();
            ce0.put(classLoader, ce02);
        }
        Class cls = (Class) ce02.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        ce02.put(str, cls2);
        return cls2;
    }

    public final pm2 R(String str) {
        Context context = this.f847R.f4113R.f3004R;
        Object obj = pm2.R;
        try {
            return (pm2) c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new j8f(jQ.C("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new j8f(jQ.C("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new j8f(jQ.C("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new j8f(jQ.C("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
