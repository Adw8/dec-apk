package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: nk9  reason: default package */
/* loaded from: classes.dex */
public final class nk9 {

    /* renamed from: R  reason: collision with other field name */
    public int[] f6536R = iWF.f4627R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f6537R = iWF.f4628R;
    public int R = 0;

    public final Object R(Object obj) {
        int c = obj == null ? c() : v(obj.hashCode(), obj);
        if (c >= 0) {
            return this.f6537R[(c << 1) + 1];
        }
        return null;
    }

    public final int c() {
        int i;
        int i2 = this.R;
        if (i2 == 0) {
            return -1;
        }
        int[] iArr = this.f6536R;
        int i3 = i2 - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= i3) {
                i = (i4 + i3) >>> 1;
                int i5 = iArr[i];
                if (i5 >= 0) {
                    if (i5 <= 0) {
                        break;
                    }
                    i3 = i - 1;
                } else {
                    i4 = i + 1;
                }
            } else {
                i = ~i4;
                break;
            }
        }
        if (i < 0 || this.f6537R[i << 1] == null) {
            return i;
        }
        int i6 = i + 1;
        while (i6 < i2 && this.f6536R[i6] == 0) {
            if (this.f6537R[i6 << 1] == null) {
                return i6;
            }
            i6++;
        }
        int i7 = i - 1;
        while (i7 >= 0 && this.f6536R[i7] == 0) {
            if (this.f6537R[i7 << 1] == null) {
                return i7;
            }
            i7--;
        }
        return ~i6;
    }

    public final Object e(Of of, OQ oq) {
        int i;
        int i2;
        int i3 = this.R;
        if (of == null) {
            i2 = 0;
            i = c();
        } else {
            i2 = of.hashCode();
            i = v(i2, of);
        }
        if (i >= 0) {
            int i4 = (i << 1) + 1;
            Object[] objArr = this.f6537R;
            Object obj = objArr[i4];
            objArr[i4] = oq;
            return obj;
        }
        int i5 = ~i;
        int[] iArr = this.f6536R;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            this.f6536R = Arrays.copyOf(iArr, i6);
            this.f6537R = Arrays.copyOf(this.f6537R, i6 << 1);
            if (i3 != this.R) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.f6536R;
            int i7 = i5 + 1;
            System.arraycopy(iArr2, i5, iArr2, i7, i3 - i5);
            Object[] objArr2 = this.f6537R;
            int i8 = i5 << 1;
            System.arraycopy(objArr2, i8, objArr2, i7 << 1, (this.R << 1) - i8);
        }
        int i9 = this.R;
        if (i3 == i9) {
            int[] iArr3 = this.f6536R;
            if (i5 < iArr3.length) {
                iArr3[i5] = i2;
                Object[] objArr3 = this.f6537R;
                int i10 = i5 << 1;
                objArr3[i10] = of;
                objArr3[i10 + 1] = oq;
                this.R = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof nk9) {
                nk9 nk9 = (nk9) obj;
                int i = this.R;
                if (i != nk9.R) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object[] objArr = this.f6537R;
                    int i3 = i2 << 1;
                    Object obj2 = objArr[i3];
                    Object obj3 = objArr[i3 + 1];
                    Object R = nk9.R(obj2);
                    if (obj3 == null) {
                        if (R == null) {
                            if (!((obj2 == null ? nk9.c() : nk9.v(obj2.hashCode(), obj2)) >= 0)) {
                            }
                        }
                        return false;
                    } else if (!n3x.v(obj3, R)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.R != ((Map) obj).size()) {
                return false;
            } else {
                int i4 = this.R;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object[] objArr2 = this.f6537R;
                    int i6 = i5 << 1;
                    Object obj4 = objArr2[i6];
                    Object obj5 = objArr2[i6 + 1];
                    Object obj6 = ((Map) obj).get(obj4);
                    if (obj5 == null) {
                        if (obj6 != null || !((Map) obj).containsKey(obj4)) {
                            return false;
                        }
                    } else if (!n3x.v(obj5, obj6)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f6536R;
        Object[] objArr = this.f6537R;
        int i = this.R;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final String toString() {
        int i = this.R;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.R;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            int i4 = i3 << 1;
            Object obj = this.f6537R[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f6537R[i4 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int v(int i, Object obj) {
        int i2;
        int i3 = this.R;
        if (i3 == 0) {
            return -1;
        }
        int[] iArr = this.f6536R;
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = ~i5;
                break;
            }
        }
        if (i2 < 0 || n3x.v(obj, this.f6537R[i2 << 1])) {
            return i2;
        }
        int i7 = i2 + 1;
        while (i7 < i3 && this.f6536R[i7] == i) {
            if (n3x.v(obj, this.f6537R[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        int i8 = i2 - 1;
        while (i8 >= 0 && this.f6536R[i8] == i) {
            if (n3x.v(obj, this.f6537R[i8 << 1])) {
                return i8;
            }
            i8--;
        }
        return ~i7;
    }
}
