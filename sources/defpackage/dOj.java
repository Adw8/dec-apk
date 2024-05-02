package defpackage;

/* renamed from: dOj  reason: default package */
/* loaded from: classes.dex */
public final class dOj {

    /* renamed from: R  reason: collision with other field name */
    public String f2599R;

    /* renamed from: R  reason: collision with other field name */
    public ma7 f2600R;
    public int R = -1;
    public int v = -1;

    public dOj(String str) {
        this.f2599R = str;
    }

    public final int R() {
        ma7 ma7 = this.f2600R;
        if (ma7 == null) {
            return this.f2599R.length();
        }
        return (ma7.v - (ma7.e - ma7.c)) + (this.f2599R.length() - (this.v - this.R));
    }

    public final String toString() {
        ma7 ma7 = this.f2600R;
        if (ma7 == null) {
            return this.f2599R;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f2599R, 0, this.R);
        sb.append((char[]) ma7.f6078R, 0, ma7.c);
        int i = ma7.e;
        sb.append((char[]) ma7.f6078R, i, ma7.v - i);
        String str = this.f2599R;
        sb.append((CharSequence) str, this.v, str.length());
        return sb.toString();
    }

    public final void v(int i, int i2, String str) {
        boolean z = true;
        if (i <= i2) {
            if (i < 0) {
                z = false;
            }
            if (z) {
                ma7 ma7 = this.f2600R;
                if (ma7 == null) {
                    int max = Math.max(255, str.length() + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i, 64);
                    int min2 = Math.min(this.f2599R.length() - i2, 64);
                    int i3 = i - min;
                    this.f2599R.getChars(i3, i, cArr, 0);
                    int i4 = max - min2;
                    int i5 = min2 + i2;
                    this.f2599R.getChars(i2, i5, cArr, i4);
                    str.getChars(0, str.length(), cArr, min);
                    this.f2600R = new ma7(cArr, str.length() + min, i4);
                    this.R = i3;
                    this.v = i5;
                    return;
                }
                int i6 = this.R;
                int i7 = i - i6;
                int i8 = i2 - i6;
                if (i7 < 0 || i8 > ma7.v - (ma7.e - ma7.c)) {
                    this.f2599R = toString();
                    this.f2600R = null;
                    this.R = -1;
                    this.v = -1;
                    v(i, i2, str);
                    return;
                }
                int length = str.length() - (i8 - i7);
                int i9 = ma7.e - ma7.c;
                if (length > i9) {
                    int i10 = length - i9;
                    int i11 = ma7.v;
                    do {
                        i11 *= 2;
                    } while (i11 - ma7.v < i10);
                    char[] cArr2 = new char[i11];
                    System.arraycopy((char[]) ma7.f6078R, 0, cArr2, 0, ma7.c - 0);
                    int i12 = ma7.v;
                    int i13 = ma7.e;
                    int i14 = i12 - i13;
                    int i15 = i11 - i14;
                    System.arraycopy((char[]) ma7.f6078R, i13, cArr2, i15, (i14 + i13) - i13);
                    ma7.f6078R = cArr2;
                    ma7.v = i11;
                    ma7.e = i15;
                }
                int i16 = ma7.c;
                if (i7 < i16 && i8 <= i16) {
                    int i17 = i16 - i8;
                    char[] cArr3 = (char[]) ma7.f6078R;
                    System.arraycopy(cArr3, i8, cArr3, ma7.e - i17, i17);
                    ma7.c = i7;
                    ma7.e -= i17;
                } else if (i7 >= i16 || i8 < i16) {
                    int i18 = ma7.e;
                    int i19 = i18 - i16;
                    int i20 = i7 + i19;
                    int i21 = i19 + i8;
                    int i22 = i20 - i18;
                    char[] cArr4 = (char[]) ma7.f6078R;
                    System.arraycopy(cArr4, i18, cArr4, i16, i22);
                    ma7.c += i22;
                    ma7.e = i21;
                } else {
                    ma7.e = (ma7.e - i16) + i8;
                    ma7.c = i7;
                }
                str.getChars(0, str.length(), (char[]) ma7.f6078R, ma7.c);
                ma7.c = str.length() + ma7.c;
                return;
            }
            throw new IllegalArgumentException(opT.Z("start must be non-negative, but was ", i).toString());
        }
        throw new IllegalArgumentException(jQ.U("start index must be less than or equal to end index: ", i, " > ", i2).toString());
    }
}
