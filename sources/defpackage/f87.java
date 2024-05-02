package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: f87  reason: default package */
/* loaded from: classes.dex */
public final class f87 {

    /* renamed from: R  reason: collision with other field name */
    public final oDA f3326R;
    public int c;
    public int e;
    public int R = 4096;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f3325R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public h8A[] f3327R = new h8A[8];
    public int v = 7;

    public f87(gJZ gjz) {
        this.f3326R = new oDA(gjz);
    }

    public final int R(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f3327R.length;
            while (true) {
                length--;
                i2 = this.v;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f3327R[length].R;
                i -= i4;
                this.e -= i4;
                this.c--;
                i3++;
            }
            h8A[] h8aArr = this.f3327R;
            System.arraycopy(h8aArr, i2 + 1, h8aArr, i2 + 1 + i3, this.c);
            this.v += i3;
        }
        return i3;
    }

    public final int X(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.f3326R.readByte();
            byte[] bArr = asb.f1481R;
            int i5 = readByte & 255;
            if ((i5 & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (i5 & 127) << i4;
            i4 += 7;
        }
    }

    public final void c(h8A h8a) {
        this.f3325R.add(h8a);
        int i = h8a.R;
        int i2 = this.R;
        if (i > i2) {
            P7.G(this.f3327R, null);
            this.v = this.f3327R.length - 1;
            this.c = 0;
            this.e = 0;
            return;
        }
        R((this.e + i) - i2);
        int i3 = this.c + 1;
        h8A[] h8aArr = this.f3327R;
        if (i3 > h8aArr.length) {
            h8A[] h8aArr2 = new h8A[h8aArr.length * 2];
            System.arraycopy(h8aArr, 0, h8aArr2, h8aArr.length, h8aArr.length);
            this.v = this.f3327R.length - 1;
            this.f3327R = h8aArr2;
        }
        int i4 = this.v;
        this.v = i4 - 1;
        this.f3327R[i4] = h8a;
        this.c++;
        this.e += i;
    }

    public final F6 e() {
        byte readByte = this.f3326R.readByte();
        byte[] bArr = asb.f1481R;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (i & 128) == 128;
        long X = (long) X(i, 127);
        if (!z) {
            return this.f3326R.S(X);
        }
        ME me = new ME();
        int[] iArr = jv5.f5114R;
        oDA oda = this.f3326R;
        nhs nhs = jv5.R;
        int i3 = 0;
        for (long j = 0; j < X; j++) {
            byte readByte2 = oda.readByte();
            byte[] bArr2 = asb.f1481R;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                int i4 = i3 - 8;
                nhs = ((nhs[]) nhs.f6515R)[(i2 >>> i4) & 255];
                if (((nhs[]) nhs.f6515R) == null) {
                    me.a(nhs.R);
                    i3 -= nhs.v;
                    nhs = jv5.R;
                } else {
                    i3 = i4;
                }
            }
        }
        while (i3 > 0) {
            nhs nhs2 = ((nhs[]) nhs.f6515R)[(i2 << (8 - i3)) & 255];
            if (((nhs[]) nhs2.f6515R) != null || nhs2.v > i3) {
                break;
            }
            me.a(nhs2.R);
            i3 -= nhs2.v;
            nhs = jv5.R;
        }
        return me.h();
    }

    public final F6 v(int i) {
        if (i >= 0 && i <= h13.f4021R.length - 1) {
            return h13.f4021R[i].f4088R;
        }
        int length = this.v + 1 + (i - h13.f4021R.length);
        if (length >= 0) {
            h8A[] h8aArr = this.f3327R;
            if (length < h8aArr.length) {
                return h8aArr[length].f4088R;
            }
        }
        StringBuilder U = opT.U("Header index too large ");
        U.append(i + 1);
        throw new IOException(U.toString());
    }
}
