package defpackage;

import sun.misc.Unsafe;

/* renamed from: hEs  reason: default package */
/* loaded from: classes.dex */
public final class hEs extends fPg {
    public hEs(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.fPg
    public final void C(Object obj, long j, double d) {
        this.R.putDouble(obj, j, d);
    }

    @Override // defpackage.fPg
    public final void H(Object obj, long j, boolean z) {
        this.R.putBoolean(obj, j, z);
    }

    @Override // defpackage.fPg
    public final void N(Object obj, long j, float f) {
        this.R.putFloat(obj, j, f);
    }

    @Override // defpackage.fPg
    public final float O(long j, Object obj) {
        return this.R.getFloat(obj, j);
    }

    @Override // defpackage.fPg
    public final void U(Object obj, long j, byte b) {
        this.R.putByte(obj, j, b);
    }

    @Override // defpackage.fPg
    public final double X(long j, Object obj) {
        return this.R.getDouble(obj, j);
    }

    @Override // defpackage.fPg
    public final boolean c(long j, Object obj) {
        return this.R.getBoolean(obj, j);
    }

    @Override // defpackage.fPg
    public final byte e(long j, Object obj) {
        return this.R.getByte(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.fPg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t() {
        /*
            r10 = this;
            java.lang.String r0 = "copyMemory"
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            sun.misc.Unsafe r2 = r10.R
            java.lang.String r3 = "getLong"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x000f
        L_0x000d:
            r2 = r6
            goto L_0x0037
        L_0x000f:
            java.lang.Class r2 = r2.getClass()     // Catch: all -> 0x0032
            java.lang.String r7 = "objectFieldOffset"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: all -> 0x0032
            java.lang.Class<java.lang.reflect.Field> r9 = java.lang.reflect.Field.class
            r8[r6] = r9     // Catch: all -> 0x0032
            r2.getMethod(r7, r8)     // Catch: all -> 0x0032
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: all -> 0x0032
            r7[r6] = r1     // Catch: all -> 0x0032
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch: all -> 0x0032
            r7[r5] = r8     // Catch: all -> 0x0032
            r2.getMethod(r3, r7)     // Catch: all -> 0x0032
            java.lang.reflect.Field r2 = defpackage.hU3.X()     // Catch: all -> 0x0032
            if (r2 != 0) goto L_0x0030
            goto L_0x000d
        L_0x0030:
            r2 = r5
            goto L_0x0037
        L_0x0032:
            r2 = move-exception
            defpackage.hU3.R(r2)
            goto L_0x000d
        L_0x0037:
            if (r2 != 0) goto L_0x003a
            return r6
        L_0x003a:
            sun.misc.Unsafe r10 = r10.R     // Catch: all -> 0x009e
            java.lang.Class r10 = r10.getClass()     // Catch: all -> 0x009e
            java.lang.String r2 = "getByte"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: all -> 0x009e
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch: all -> 0x009e
            r7[r6] = r8     // Catch: all -> 0x009e
            r10.getMethod(r2, r7)     // Catch: all -> 0x009e
            java.lang.String r2 = "putByte"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: all -> 0x009e
            r7[r6] = r8     // Catch: all -> 0x009e
            java.lang.Class r9 = java.lang.Byte.TYPE     // Catch: all -> 0x009e
            r7[r5] = r9     // Catch: all -> 0x009e
            r10.getMethod(r2, r7)     // Catch: all -> 0x009e
            java.lang.String r2 = "getInt"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: all -> 0x009e
            r7[r6] = r8     // Catch: all -> 0x009e
            r10.getMethod(r2, r7)     // Catch: all -> 0x009e
            java.lang.String r2 = "putInt"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: all -> 0x009e
            r7[r6] = r8     // Catch: all -> 0x009e
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: all -> 0x009e
            r7[r5] = r9     // Catch: all -> 0x009e
            r10.getMethod(r2, r7)     // Catch: all -> 0x009e
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch: all -> 0x009e
            r2[r6] = r8     // Catch: all -> 0x009e
            r10.getMethod(r3, r2)     // Catch: all -> 0x009e
            java.lang.String r2 = "putLong"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch: all -> 0x009e
            r3[r6] = r8     // Catch: all -> 0x009e
            r3[r5] = r8     // Catch: all -> 0x009e
            r10.getMethod(r2, r3)     // Catch: all -> 0x009e
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: all -> 0x009e
            r3[r6] = r8     // Catch: all -> 0x009e
            r3[r5] = r8     // Catch: all -> 0x009e
            r3[r4] = r8     // Catch: all -> 0x009e
            r10.getMethod(r0, r3)     // Catch: all -> 0x009e
            r3 = 5
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: all -> 0x009e
            r3[r6] = r1     // Catch: all -> 0x009e
            r3[r5] = r8     // Catch: all -> 0x009e
            r3[r4] = r1     // Catch: all -> 0x009e
            r3[r2] = r8     // Catch: all -> 0x009e
            r1 = 4
            r3[r1] = r8     // Catch: all -> 0x009e
            r10.getMethod(r0, r3)     // Catch: all -> 0x009e
            return r5
        L_0x009e:
            r10 = move-exception
            defpackage.hU3.R(r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hEs.t():boolean");
    }

    @Override // defpackage.fPg
    public final boolean y() {
        if (!super.y()) {
            return false;
        }
        try {
            Class<?> cls = this.R.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            hU3.R(th);
            return false;
        }
    }
}
