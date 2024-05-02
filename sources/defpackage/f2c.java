package defpackage;

import java.util.Arrays;

/* renamed from: f2c  reason: default package */
/* loaded from: classes.dex */
public final class f2c {
    public static final f2c R = new f2c(0, new int[0], new Object[0], false);

    /* renamed from: R  reason: collision with other field name */
    public int f3281R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3282R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f3283R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f3284R;
    public int v = -1;

    public f2c(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f3281R = i;
        this.f3283R = iArr;
        this.f3284R = objArr;
        this.f3282R = z;
    }

    public static f2c v() {
        return new f2c(0, new int[8], new Object[8], true);
    }

    public final int R() {
        int i;
        int i2 = this.v;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f3281R; i4++) {
            int i5 = this.f3283R[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = d3.o(((Long) this.f3284R[i4]).longValue(), i6);
            } else if (i7 == 1) {
                ((Long) this.f3284R[i4]).longValue();
                i = d3.L(i6);
            } else if (i7 == 2) {
                i = d3.c(i6, (b0) this.f3284R[i4]);
            } else if (i7 == 3) {
                i3 = ((f2c) this.f3284R[i4]).R() + (d3.t(i6) * 2) + i3;
            } else if (i7 == 5) {
                ((Integer) this.f3284R[i4]).intValue();
                i = d3.O(i6);
            } else {
                int i8 = b7b.e;
                throw new IllegalStateException(new p3X());
            }
            i3 = i + i3;
        }
        this.v = i3;
        return i3;
    }

    public final void c(int i, Object obj) {
        if (this.f3282R) {
            int i2 = this.f3281R;
            int[] iArr = this.f3283R;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f3283R = Arrays.copyOf(iArr, i3);
                this.f3284R = Arrays.copyOf(this.f3284R, i3);
            }
            int[] iArr2 = this.f3283R;
            int i4 = this.f3281R;
            iArr2[i4] = i;
            this.f3284R[i4] = obj;
            this.f3281R = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void e(gL6 gl6) {
        if (this.f3281R != 0) {
            gl6.getClass();
            for (int i = 0; i < this.f3281R; i++) {
                int i2 = this.f3283R[i];
                Object obj = this.f3284R[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    gl6.u(((Long) obj).longValue(), i3);
                } else if (i4 == 1) {
                    gl6.J(((Long) obj).longValue(), i3);
                } else if (i4 == 2) {
                    gl6.i(i3, (b0) obj);
                } else if (i4 == 3) {
                    ((d3) gl6.R).S(i3, 3);
                    ((f2c) obj).e(gl6);
                    ((d3) gl6.R).S(i3, 4);
                } else if (i4 == 5) {
                    gl6.K(i3, ((Integer) obj).intValue());
                } else {
                    int i5 = b7b.e;
                    throw new RuntimeException(new p3X());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f2c)) {
            return false;
        }
        f2c f2c = (f2c) obj;
        int i = this.f3281R;
        if (i == f2c.f3281R) {
            int[] iArr = this.f3283R;
            int[] iArr2 = f2c.f3283R;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f3284R;
                Object[] objArr2 = f2c.f3284R;
                int i3 = this.f3281R;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f3281R;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f3283R;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f3284R;
        int i7 = this.f3281R;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
