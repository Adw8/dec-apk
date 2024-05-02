package defpackage;

/* renamed from: eJ5  reason: default package */
/* loaded from: classes.dex */
public final class eJ5 {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f3050R = new Object[4];

    /* renamed from: R  reason: collision with other field name */
    public int[] f3049R = new int[4];

    public final int R(int i, Object obj) {
        int i2;
        int i3 = this.R;
        if (i3 > 0) {
            int i4 = i3 - 1;
            int identityHashCode = System.identityHashCode(obj);
            int i5 = 0;
            while (true) {
                if (i5 > i4) {
                    i2 = -(i5 + 1);
                    break;
                }
                i2 = (i5 + i4) >>> 1;
                Object obj2 = this.f3050R[i2];
                int identityHashCode2 = System.identityHashCode(obj2);
                if (identityHashCode2 < identityHashCode) {
                    i5 = i2 + 1;
                } else if (identityHashCode2 > identityHashCode) {
                    i4 = i2 - 1;
                } else if (obj2 != obj) {
                    i2--;
                    while (-1 < i2) {
                        Object obj3 = this.f3050R[i2];
                        if (obj3 == obj) {
                            break;
                        } else if (System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        } else {
                            i2--;
                        }
                    }
                    i2++;
                    int i6 = this.R;
                    while (true) {
                        if (i2 < i6) {
                            Object obj4 = this.f3050R[i2];
                            if (obj4 != obj) {
                                i2++;
                                if (System.identityHashCode(obj4) != identityHashCode) {
                                    i2 = -i2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            i2 = -(this.R + 1);
                            break;
                        }
                    }
                }
            }
            if (i2 >= 0) {
                int[] iArr = this.f3049R;
                int i7 = iArr[i2];
                iArr[i2] = i;
                return i7;
            }
        } else {
            i2 = -1;
        }
        int i8 = -(i2 + 1);
        int i9 = this.R;
        Object[] objArr = this.f3050R;
        if (i9 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i10 = i8 + 1;
            System.arraycopy(objArr, i8, objArr2, i10, i9 - i8);
            System.arraycopy(this.f3049R, i8, iArr2, i10, this.R - i8);
            P7.r(this.f3050R, objArr2, 0, 0, i8, 6);
            P7.T(this.f3049R, iArr2, i8, 6);
            this.f3050R = objArr2;
            this.f3049R = iArr2;
        } else {
            int i11 = i8 + 1;
            System.arraycopy(objArr, i8, objArr, i11, i9 - i8);
            int[] iArr3 = this.f3049R;
            System.arraycopy(iArr3, i8, iArr3, i11, this.R - i8);
        }
        this.f3050R[i8] = obj;
        this.f3049R[i8] = i;
        this.R++;
        return -1;
    }
}
