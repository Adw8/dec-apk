package defpackage;

/* renamed from: fjX  reason: default package */
/* loaded from: classes.dex */
public final class fjX extends gMq {
    public static final fjX R = new fjX(0, null, new Object[0]);

    /* renamed from: R  reason: collision with other field name */
    public final transient Object f3533R;

    /* renamed from: R  reason: collision with other field name */
    public final transient Object[] f3534R;
    public final transient int e;

    public fjX(int i, Object obj, Object[] objArr) {
        this.f3533R = obj;
        this.f3534R = objArr;
        this.e = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009f A[RETURN] */
    @Override // defpackage.gMq, java.util.Map
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f3533R
            java.lang.Object[] r1 = r8.f3534R
            int r8 = r8.e
            r2 = 0
            if (r9 != 0) goto L_0x000c
        L_0x0009:
            r8 = r2
            goto L_0x009c
        L_0x000c:
            r3 = 1
            if (r8 != r3) goto L_0x0022
            r8 = 0
            r8 = r1[r8]
            r8.getClass()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0009
            r8 = r1[r3]
            r8.getClass()
            goto L_0x009c
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x0009
        L_0x0025:
            boolean r8 = r0 instanceof byte[]
            r4 = -1
            if (r8 == 0) goto L_0x0051
            r8 = r0
            byte[] r8 = (byte[]) r8
            int r0 = r8.length
            int r5 = r0 + -1
            int r0 = r9.hashCode()
            int r0 = defpackage.mxC.z(r0)
        L_0x0038:
            r0 = r0 & r5
            byte r4 = r8[r0]
            r6 = 255(0xff, float:3.57E-43)
            r4 = r4 & r6
            if (r4 != r6) goto L_0x0041
            goto L_0x0009
        L_0x0041:
            r6 = r1[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x004e
            r8 = r4 ^ 1
            r8 = r1[r8]
            goto L_0x009c
        L_0x004e:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x0051:
            boolean r8 = r0 instanceof short[]
            if (r8 == 0) goto L_0x007d
            r8 = r0
            short[] r8 = (short[]) r8
            int r0 = r8.length
            int r5 = r0 + -1
            int r0 = r9.hashCode()
            int r0 = defpackage.mxC.z(r0)
        L_0x0063:
            r0 = r0 & r5
            short r4 = r8[r0]
            char r4 = (char) r4
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r4 != r6) goto L_0x006d
            goto L_0x0009
        L_0x006d:
            r6 = r1[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x007a
            r8 = r4 ^ 1
            r8 = r1[r8]
            goto L_0x009c
        L_0x007a:
            int r0 = r0 + 1
            goto L_0x0063
        L_0x007d:
            int[] r0 = (int[]) r0
            int r8 = r0.length
            int r8 = r8 + r4
            int r5 = r9.hashCode()
            int r5 = defpackage.mxC.z(r5)
        L_0x0089:
            r5 = r5 & r8
            r6 = r0[r5]
            if (r6 != r4) goto L_0x0090
            goto L_0x0009
        L_0x0090:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x00a0
            r8 = r6 ^ 1
            r8 = r1[r8]
        L_0x009c:
            if (r8 != 0) goto L_0x009f
            return r2
        L_0x009f:
            return r8
        L_0x00a0:
            int r5 = r5 + 1
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjX.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.e;
    }
}
