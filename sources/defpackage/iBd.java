package defpackage;

import android.util.Log;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import sun.misc.Unsafe;

/* renamed from: iBd  reason: default package */
/* loaded from: classes.dex */
public abstract class iBd {
    public static final long R;

    /* renamed from: R  reason: collision with other field name */
    public static final HashSet f4485R = new HashSet();

    /* renamed from: R  reason: collision with other field name */
    public static final Unsafe f4486R;
    public static final long c;
    public static final long e;
    public static final long v;

    static {
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
            f4486R = unsafe;
            R = unsafe.objectFieldOffset(g7K.class.getDeclaredField("artMethod"));
            unsafe.objectFieldOffset(g7K.class.getDeclaredField("declaringClass"));
            long objectFieldOffset = unsafe.objectFieldOffset(jqc.class.getDeclaredField("artFieldOrMethod"));
            unsafe.objectFieldOffset(lf3.class.getDeclaredField("info"));
            long objectFieldOffset2 = unsafe.objectFieldOffset(fKc.class.getDeclaredField("methods"));
            v = objectFieldOffset2;
            long objectFieldOffset3 = unsafe.objectFieldOffset(fKc.class.getDeclaredField("iFields"));
            unsafe.objectFieldOffset(fKc.class.getDeclaredField("sFields"));
            unsafe.objectFieldOffset(m6P.class.getDeclaredField("member"));
            Method declaredMethod = gDT.class.getDeclaredMethod("a", new Class[0]);
            Method declaredMethod2 = gDT.class.getDeclaredMethod("b", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle unreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle unreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j = unsafe.getLong(unreflect, objectFieldOffset);
            long j2 = unsafe.getLong(unreflect2, objectFieldOffset);
            long j3 = unsafe.getLong(gDT.class, objectFieldOffset2);
            long j4 = j2 - j;
            c = j4;
            e = (j - j3) - j4;
            Field declaredField = gDT.class.getDeclaredField("i");
            Field declaredField2 = gDT.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle unreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            unsafe.getLong(unreflectGetter, objectFieldOffset);
            unsafe.getLong(unreflectGetter2, objectFieldOffset);
            unsafe.getLong(gDT.class, objectFieldOffset3);
        } catch (ReflectiveOperationException e2) {
            Log.e("HiddenApiBypass", "Initialize error", e2);
            throw new ExceptionInInitializerError(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object R(java.lang.Class r16, java.lang.Object r17, java.lang.String r18, java.lang.Object... r19) {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iBd.R(java.lang.Class, java.lang.Object, java.lang.String, java.lang.Object[]):java.lang.Object");
    }

    public static boolean v(String... strArr) {
        try {
            R(VMRuntime.class, R(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (Throwable th) {
            Log.w("HiddenApiBypass", "setHiddenApiExemptions", th);
            return false;
        }
    }
}
