package defpackage;

/* renamed from: eSi  reason: default package */
/* loaded from: classes.dex */
public final class eSi implements Cloneable {
    public static final Object R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public boolean f3102R = false;

    /* renamed from: R  reason: collision with other field name */
    public int[] f3103R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f3104R;
    public int e;

    public eSi() {
        int i = 40;
        int i2 = 4;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f3103R = new int[i4];
        this.f3104R = new Object[i4];
    }

    public final Object L(int i, Integer num) {
        Object obj;
        int H = vd.H(this.e, i, this.f3103R);
        return (H < 0 || (obj = this.f3104R[H]) == R) ? num : obj;
    }

    public final void O() {
        int i = this.e;
        int[] iArr = this.f3103R;
        Object[] objArr = this.f3104R;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != R) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3102R = false;
        this.e = i2;
    }

    public final boolean X(int i) {
        if (this.f3102R) {
            O();
        }
        return vd.H(this.e, i, this.f3103R) >= 0;
    }

    public final void Z(int i, Object obj) {
        int H = vd.H(this.e, i, this.f3103R);
        if (H >= 0) {
            this.f3104R[H] = obj;
            return;
        }
        int i2 = ~H;
        int i3 = this.e;
        if (i2 < i3) {
            Object[] objArr = this.f3104R;
            if (objArr[i2] == R) {
                this.f3103R[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f3102R && i3 >= this.f3103R.length) {
            O();
            i2 = ~vd.H(this.e, i, this.f3103R);
        }
        int i4 = this.e;
        if (i4 >= this.f3103R.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f3103R;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3104R;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3103R = iArr;
            this.f3104R = objArr2;
        }
        int i9 = this.e - i2;
        if (i9 != 0) {
            int[] iArr3 = this.f3103R;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.f3104R;
            System.arraycopy(objArr4, i2, objArr4, i10, this.e - i2);
        }
        this.f3103R[i2] = i;
        this.f3104R[i2] = obj;
        this.e++;
    }

    /* renamed from: e */
    public final eSi clone() {
        try {
            eSi esi = (eSi) super.clone();
            esi.f3103R = (int[]) this.f3103R.clone();
            esi.f3104R = (Object[]) this.f3104R.clone();
            return esi;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final int m() {
        if (this.f3102R) {
            O();
        }
        return this.e;
    }

    @Override // java.lang.Object
    public final String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f3102R) {
                O();
            }
            sb.append(this.f3103R[i]);
            sb.append('=');
            Object x = x(i);
            if (x != this) {
                sb.append(x);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void v(int i, Object obj) {
        int i2 = this.e;
        if (i2 == 0 || i > this.f3103R[i2 - 1]) {
            if (this.f3102R && i2 >= this.f3103R.length) {
                O();
            }
            int i3 = this.e;
            if (i3 >= this.f3103R.length) {
                int i4 = (i3 + 1) * 4;
                int i5 = 4;
                while (true) {
                    if (i5 >= 32) {
                        break;
                    }
                    int i6 = (1 << i5) - 12;
                    if (i4 <= i6) {
                        i4 = i6;
                        break;
                    }
                    i5++;
                }
                int i7 = i4 / 4;
                int[] iArr = new int[i7];
                Object[] objArr = new Object[i7];
                int[] iArr2 = this.f3103R;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f3104R;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3103R = iArr;
                this.f3104R = objArr;
            }
            this.f3103R[i3] = i;
            this.f3104R[i3] = obj;
            this.e = i3 + 1;
            return;
        }
        Z(i, obj);
    }

    public final Object x(int i) {
        if (this.f3102R) {
            O();
        }
        return this.f3104R[i];
    }
}
