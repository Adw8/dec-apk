package defpackage;

/* renamed from: l6E  reason: default package */
/* loaded from: classes.dex */
public final class l6E {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long[] f5586R;

    /* renamed from: R  reason: collision with other field name */
    public final Object[] f5587R;

    public l6E(int i, long[] jArr, Object[] objArr) {
        this.R = i;
        this.f5586R = jArr;
        this.f5587R = objArr;
    }

    public final int R(long j) {
        int i = this.R - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i != 0) {
            while (i2 <= i) {
                int i3 = (i2 + i) >>> 1;
                int i4 = ((this.f5586R[i3] - j) > 0 ? 1 : ((this.f5586R[i3] - j) == 0 ? 0 : -1));
                if (i4 < 0) {
                    i2 = i3 + 1;
                } else if (i4 <= 0) {
                    return i3;
                } else {
                    i = i3 - 1;
                }
            }
            return -(i2 + 1);
        }
        long j2 = this.f5586R[0];
        if (j2 == j) {
            return 0;
        }
        return j2 > j ? -2 : -1;
    }

    public final l6E v(long j, Object obj) {
        int i = this.R;
        Object[] objArr = this.f5587R;
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= length) {
                break;
            }
            if (objArr[i3] == null) {
                z = false;
            }
            if (z) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                if (i2 >= i5 || i6 >= i) {
                    break;
                }
                long j2 = this.f5586R[i6];
                Object obj2 = this.f5587R[i6];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j2;
                    objArr2[i2] = obj2;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                int i7 = i5 - 1;
                jArr[i7] = j;
                objArr2[i7] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = this.f5586R[i6];
                    Object obj3 = this.f5587R[i6];
                    if (obj3 != null) {
                        jArr[i2] = j3;
                        objArr2[i2] = obj3;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j;
            objArr2[0] = obj;
        }
        return new l6E(i5, jArr, objArr2);
    }
}
