package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: hU3  reason: default package */
/* loaded from: classes.dex */
public abstract class hU3 {
    public static final long R;

    /* renamed from: R  reason: collision with other field name */
    public static final fPg f4277R;

    /* renamed from: R  reason: collision with other field name */
    public static final Class f4278R = Om.R;

    /* renamed from: R  reason: collision with other field name */
    public static final Unsafe f4279R;

    /* renamed from: R  reason: collision with other field name */
    public static final boolean f4280R;
    public static final boolean c;
    public static final boolean v;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            sun.misc.Unsafe r6 = j()
            defpackage.hU3.f4279R = r6
            java.lang.Class r7 = defpackage.Om.R
            defpackage.hU3.f4278R = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = O(r7)
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r8 = O(r8)
            r9 = 1
            r10 = 0
            if (r6 != 0) goto L_0x0027
            goto L_0x003d
        L_0x0027:
            boolean r11 = defpackage.Om.R()
            if (r11 == 0) goto L_0x003f
            if (r7 == 0) goto L_0x0035
            e_O r7 = new e_O
            r7.<init>(r6, r9)
            goto L_0x0044
        L_0x0035:
            if (r8 == 0) goto L_0x003d
            e_O r7 = new e_O
            r7.<init>(r6, r10)
            goto L_0x0044
        L_0x003d:
            r7 = 0
            goto L_0x0044
        L_0x003f:
            hEs r7 = new hEs
            r7.<init>(r6)
        L_0x0044:
            defpackage.hU3.f4277R = r7
            if (r7 != 0) goto L_0x004a
            r6 = r10
            goto L_0x004e
        L_0x004a:
            boolean r6 = r7.t()
        L_0x004e:
            defpackage.hU3.f4280R = r6
            if (r7 != 0) goto L_0x0054
            r6 = r10
            goto L_0x0058
        L_0x0054:
            boolean r6 = r7.y()
        L_0x0058:
            defpackage.hU3.v = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = c(r6)
            long r11 = (long) r6
            defpackage.hU3.R = r11
            c(r5)
            e(r5)
            c(r4)
            e(r4)
            c(r3)
            e(r3)
            c(r2)
            e(r2)
            c(r1)
            e(r1)
            c(r0)
            e(r0)
            java.lang.reflect.Field r0 = X()
            if (r0 == 0) goto L_0x0093
            if (r7 != 0) goto L_0x0090
            goto L_0x0093
        L_0x0090:
            r7.x(r0)
        L_0x0093:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r9 = r10
        L_0x009d:
            defpackage.hU3.c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hU3.<clinit>():void");
    }

    public static int C(long j, Object obj) {
        return f4277R.L(j, obj);
    }

    public static double H(long j, Object obj) {
        return f4277R.X(j, obj);
    }

    public static void J(Object obj, long j, long j2) {
        f4277R.j(obj, j, j2);
    }

    public static void K(int i, long j, Object obj) {
        f4277R.P(i, j, obj);
    }

    public static boolean L(long j, Object obj) {
        return f4277R.c(j, obj);
    }

    public static long N(long j, Object obj) {
        return f4277R.Z(j, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean O(Class cls) {
        if (!Om.R()) {
            return false;
        }
        try {
            Class cls2 = f4278R;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object P(long j, Object obj) {
        return f4277R.m(j, obj);
    }

    public static void R(Throwable th) {
        Logger logger = Logger.getLogger(hU3.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static float U(long j, Object obj) {
        return f4277R.O(j, obj);
    }

    public static void V(Object obj, long j, double d) {
        f4277R.C(obj, j, d);
    }

    public static Field X() {
        Field field;
        Field field2;
        if (Om.R()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static void Y(long j, Object obj, Object obj2) {
        f4277R.g(j, obj, obj2);
    }

    public static byte Z(long j, byte[] bArr) {
        return f4277R.e(R + j, bArr);
    }

    public static int c(Class cls) {
        if (v) {
            return f4277R.R(cls);
        }
        return -1;
    }

    public static void e(Class cls) {
        if (v) {
            f4277R.v(cls);
        }
    }

    public static void g(Object obj, long j, boolean z) {
        f4277R.H(obj, j, z);
    }

    public static void i(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        K(((255 & b) << i) | (C(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new m4v());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte m(long j, Object obj) {
        return (byte) ((C(-4 & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static void o(Object obj, long j, float f) {
        f4277R.N(obj, j, f);
    }

    public static void t(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int C = C(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        K(((255 & b) << i) | (C & (~(255 << i))), j2, obj);
    }

    public static Object v(Class cls) {
        try {
            return f4279R.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static byte x(long j, Object obj) {
        return (byte) ((C(-4 & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static void y(byte[] bArr, long j, byte b) {
        f4277R.U(bArr, R + j, b);
    }
}
