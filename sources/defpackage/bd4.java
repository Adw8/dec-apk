package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: bd4  reason: default package */
/* loaded from: classes.dex */
public final class bd4 implements Iterable, dsi {
    public final String[] R;

    public bd4(String[] strArr) {
        this.R = strArr;
    }

    public final String H(int i) {
        String[] strArr = this.R;
        int i2 = (i * 2) + 1;
        String str = (i2 < 0 || i2 > strArr.length + -1) ? null : strArr[i2];
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final String R(String str) {
        String[] strArr = this.R;
        int length = strArr.length - 2;
        int V = pdD.V(length, 0, -2);
        if (V <= length) {
            while (!iH_.Q(str, strArr[length])) {
                if (length != V) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final iRl c() {
        iRl irl = new iRl();
        irl.R.addAll(Arrays.asList(this.R));
        return irl;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof bd4) && Arrays.equals(this.R, ((bd4) obj).R);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(this.R);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int length = this.R.length / 2;
        kSh[] kshArr = new kSh[length];
        for (int i = 0; i < length; i++) {
            kshArr[i] = new kSh(v(i), H(i));
        }
        return new o7s(kshArr);
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.R.length / 2;
        for (int i = 0; i < length; i++) {
            String v = v(i);
            String H = H(i);
            sb.append(v);
            sb.append(": ");
            if (asb.x(v)) {
                H = "██";
            }
            sb.append(H);
            sb.append("\n");
        }
        return sb.toString();
    }

    public final String v(int i) {
        String[] strArr = this.R;
        int i2 = i * 2;
        String str = (i2 < 0 || i2 > strArr.length + -1) ? null : strArr[i2];
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }
}
