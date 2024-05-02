package defpackage;

/* renamed from: jXn  reason: default package */
/* loaded from: classes.dex */
public final class jXn implements Cloneable {
    public static final Object R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public boolean f4952R = false;

    /* renamed from: R  reason: collision with other field name */
    public long[] f4953R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f4954R;
    public int e;

    public jXn() {
        int i = 80;
        int i2 = 4;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f4953R = new long[i4];
        this.f4954R = new Object[i4];
    }

    public final void L(long j, Object obj) {
        int U = vd.U(this.f4953R, this.e, j);
        if (U >= 0) {
            this.f4954R[U] = obj;
            return;
        }
        int i = ~U;
        int i2 = this.e;
        if (i < i2) {
            Object[] objArr = this.f4954R;
            if (objArr[i] == R) {
                this.f4953R[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f4952R && i2 >= this.f4953R.length) {
            X();
            i = ~vd.U(this.f4953R, this.e, j);
        }
        int i3 = this.e;
        if (i3 >= this.f4953R.length) {
            int i4 = (i3 + 1) * 8;
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
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f4953R;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f4954R;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4953R = jArr;
            this.f4954R = objArr2;
        }
        int i8 = this.e - i;
        if (i8 != 0) {
            long[] jArr3 = this.f4953R;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f4954R;
            System.arraycopy(objArr4, i, objArr4, i9, this.e - i);
        }
        this.f4953R[i] = j;
        this.f4954R[i] = obj;
        this.e++;
    }

    public final Object O(long j, Long l) {
        Object obj;
        int U = vd.U(this.f4953R, this.e, j);
        return (U < 0 || (obj = this.f4954R[U]) == R) ? l : obj;
    }

    public final void X() {
        int i = this.e;
        long[] jArr = this.f4953R;
        Object[] objArr = this.f4954R;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != R) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f4952R = false;
        this.e = i2;
    }

    public final Object Z(int i) {
        if (this.f4952R) {
            X();
        }
        return this.f4954R[i];
    }

    /* renamed from: e */
    public final jXn clone() {
        try {
            jXn jxn = (jXn) super.clone();
            jxn.f4953R = (long[]) this.f4953R.clone();
            jxn.f4954R = (Object[]) this.f4954R.clone();
            return jxn;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.lang.Object
    public final String toString() {
        if (this.f4952R) {
            X();
        }
        int i = this.e;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f4952R) {
                X();
            }
            sb.append(this.f4953R[i2]);
            sb.append('=');
            Object Z = Z(i2);
            if (Z != this) {
                sb.append(Z);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void v() {
        int i = this.e;
        Object[] objArr = this.f4954R;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f4952R = false;
    }
}
