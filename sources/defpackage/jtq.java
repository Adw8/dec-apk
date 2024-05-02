package defpackage;

/* renamed from: jtq  reason: default package */
/* loaded from: classes.dex */
public final class jtq implements h2V {
    public final /* synthetic */ m5f R;
    public final /* synthetic */ int e;

    public /* synthetic */ jtq(m5f m5f, int i) {
        this.e = i;
        this.R = m5f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    @Override // defpackage.h2V
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(java.lang.Object r21, defpackage.aOO r22) {
        /*
        // Method dump skipped, instructions count: 430
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtq.R(java.lang.Object, aOO):java.lang.Object");
    }

    public final Object v(String str) {
        String str2;
        switch (this.e) {
            case 0:
                gcd gcd = this.R.f5912R;
                Tq tq = gcd.R;
                if (str == null) {
                    str2 = null;
                } else {
                    byte[] v = ((Ea) gcd.f3806R.getValue()).v(iH_.z(str));
                    int length = v.length;
                    byte[] bArr = caw.f2155R;
                    int i = ((length + 2) / 3) * 4;
                    int i2 = (i / Integer.MAX_VALUE) + i;
                    byte[] bArr2 = new byte[i2];
                    int i3 = length - 2;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (i4 < i3) {
                        int i7 = ((v[i4 + 0] << 24) >>> 8) | ((v[(i4 + 1) + 0] << 24) >>> 16) | ((v[(i4 + 2) + 0] << 24) >>> 24);
                        bArr2[i5] = bArr[i7 >>> 18];
                        int i8 = i5 + 1;
                        bArr2[i8] = bArr[(i7 >>> 12) & 63];
                        bArr2[i5 + 2] = bArr[(i7 >>> 6) & 63];
                        bArr2[i5 + 3] = bArr[i7 & 63];
                        i6 += 4;
                        if (i6 == Integer.MAX_VALUE) {
                            bArr2[i5 + 4] = 10;
                            i6 = 0;
                            i5 = i8;
                        }
                        i4 += 3;
                        i5 += 4;
                    }
                    if (i4 < length) {
                        int i9 = i4 + 0;
                        int i10 = length - i4;
                        int i11 = (i10 > 2 ? (v[i9 + 2] << 24) >>> 24 : 0) | (i10 > 0 ? (v[i9] << 24) >>> 8 : 0) | (i10 > 1 ? (v[i9 + 1] << 24) >>> 16 : 0);
                        if (i10 == 1) {
                            bArr2[i5] = bArr[i11 >>> 18];
                            bArr2[i5 + 1] = bArr[(i11 >>> 12) & 63];
                            bArr2[i5 + 2] = 61;
                            bArr2[i5 + 3] = 61;
                        } else if (i10 == 2) {
                            bArr2[i5] = bArr[i11 >>> 18];
                            bArr2[i5 + 1] = bArr[(i11 >>> 12) & 63];
                            bArr2[i5 + 2] = bArr[(i11 >>> 6) & 63];
                            bArr2[i5 + 3] = 61;
                        } else if (i10 == 3) {
                            bArr2[i5] = bArr[i11 >>> 18];
                            bArr2[i5 + 1] = bArr[(i11 >>> 12) & 63];
                            bArr2[i5 + 2] = bArr[(i11 >>> 6) & 63];
                            bArr2[i5 + 3] = bArr[i11 & 63];
                        }
                        if (i6 + 4 == Integer.MAX_VALUE) {
                            bArr2[i5 + 4] = 10;
                        }
                    }
                    while (i2 > 0) {
                        int i12 = i2 - 1;
                        if (bArr2[i12] != 61) {
                            str2 = new String(bArr2, 0, i2);
                        } else {
                            i2 = i12;
                        }
                    }
                    str2 = new String(bArr2, 0, i2);
                }
                ((n1) tq.e).R(tq, Tq.R[4], str2);
                return o8s.R;
            default:
                if (n3x.v(str, afN.R(-66975746872204L))) {
                    this.R.L();
                }
                return o8s.R;
        }
    }
}
