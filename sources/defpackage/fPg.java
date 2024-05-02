package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: fPg  reason: default package */
/* loaded from: classes.dex */
public abstract class fPg {
    public Unsafe R;

    public fPg(Unsafe unsafe) {
        this.R = unsafe;
    }

    public abstract void C(Object obj, long j, double d);

    public abstract void H(Object obj, long j, boolean z);

    public final int L(long j, Object obj) {
        return this.R.getInt(obj, j);
    }

    public abstract void N(Object obj, long j, float f);

    public abstract float O(long j, Object obj);

    public final void P(int i, long j, Object obj) {
        this.R.putInt(obj, j, i);
    }

    public final int R(Class cls) {
        return this.R.arrayBaseOffset(cls);
    }

    public abstract void U(Object obj, long j, byte b);

    public abstract double X(long j, Object obj);

    public final long Z(long j, Object obj) {
        return this.R.getLong(obj, j);
    }

    public abstract boolean c(long j, Object obj);

    public abstract byte e(long j, Object obj);

    public final void g(long j, Object obj, Object obj2) {
        this.R.putObject(obj, j, obj2);
    }

    public final void j(Object obj, long j, long j2) {
        this.R.putLong(obj, j, j2);
    }

    public final Object m(long j, Object obj) {
        return this.R.getObject(obj, j);
    }

    public abstract boolean t();

    public final int v(Class cls) {
        return this.R.arrayIndexScale(cls);
    }

    public final long x(Field field) {
        return this.R.objectFieldOffset(field);
    }

    public boolean y() {
        Unsafe unsafe = this.R;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            hU3.R(th);
            return false;
        }
    }
}
