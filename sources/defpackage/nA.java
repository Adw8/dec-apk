package defpackage;

/* renamed from: nA  reason: default package */
/* loaded from: classes.dex */
public abstract class nA {
    public static final FW R = new FW(1);
    public static final FW v = new FW(0);

    /* renamed from: R  reason: collision with other field name */
    public static final zW f6330R = new zW(1);

    /* renamed from: v  reason: collision with other field name */
    public static final zW f6332v = new zW(0);

    /* renamed from: R  reason: collision with other field name */
    public static final oy f6329R = new oy(0);

    /* renamed from: v  reason: collision with other field name */
    public static final oy f6331v = new oy(2);

    static {
        new oy(3);
        new oy(1);
    }

    public static xt L(float f) {
        return new xt(f, true, iJF.v);
    }

    public static void O(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        float length = ((float) (i - i2)) / ((float) (iArr.length + 1));
        if (!z) {
            float f = length;
            int i4 = 0;
            for (int i5 : iArr) {
                i4++;
                iArr2[i4] = mLz.t(f);
                f += ((float) i5) + length;
            }
            return;
        }
        float f2 = length;
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i6 = iArr[length2];
            iArr2[length2] = mLz.t(f2);
            f2 += ((float) i6) + length;
        }
    }

    public static void R(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        float f = ((float) (i - i2)) / ((float) 2);
        if (!z) {
            int i4 = 0;
            for (int i5 : iArr) {
                i4++;
                iArr2[i4] = mLz.t(f);
                f += (float) i5;
            }
            return;
        }
        for (int length = iArr.length - 1; -1 < length; length--) {
            int i6 = iArr[length];
            iArr2[length] = mLz.t(f);
            f += (float) i6;
        }
    }

    public static void X(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        float f = 0.0f;
        float length = iArr.length > 1 ? ((float) (i - i2)) / ((float) (iArr.length - 1)) : 0.0f;
        if (!z) {
            int i4 = 0;
            for (int i5 : iArr) {
                i4++;
                iArr2[i4] = mLz.t(f);
                f += ((float) i5) + length;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i6 = iArr[length2];
            iArr2[length2] = mLz.t(f);
            f += ((float) i6) + length;
        }
    }

    public static void c(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        int i4 = i - i2;
        if (!z) {
            int i5 = 0;
            for (int i6 : iArr) {
                i5++;
                iArr2[i5] = i4;
                i4 += i6;
            }
            return;
        }
        for (int length = iArr.length - 1; -1 < length; length--) {
            int i7 = iArr[length];
            iArr2[length] = i4;
            i4 += i7;
        }
    }

    public static void e(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        float length = (iArr.length == 0) ^ true ? ((float) (i - i2)) / ((float) iArr.length) : 0.0f;
        float f = length / ((float) 2);
        if (!z) {
            int i4 = 0;
            for (int i5 : iArr) {
                i4++;
                iArr2[i4] = mLz.t(f);
                f += ((float) i5) + length;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i6 = iArr[length2];
            iArr2[length2] = mLz.t(f);
            f += ((float) i6) + length;
        }
    }

    public static void v(int[] iArr, int[] iArr2, boolean z) {
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                i2++;
                iArr2[i2] = i3;
                i3 += i4;
                i++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i5 = iArr[length2];
            iArr2[length2] = i;
            i += i5;
        }
    }
}
