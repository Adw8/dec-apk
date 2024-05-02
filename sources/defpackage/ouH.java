package defpackage;

import java.util.Arrays;

/* renamed from: ouH  reason: default package */
/* loaded from: classes.dex */
public final class ouH {

    /* renamed from: R  reason: collision with other field name */
    public final ME f7013R;
    public int X;
    public int e;

    /* renamed from: v  reason: collision with other field name */
    public boolean f7016v;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f7014R = true;
    public int R = Integer.MAX_VALUE;
    public int v = 4096;

    /* renamed from: R  reason: collision with other field name */
    public h8A[] f7015R = new h8A[8];
    public int c = 7;

    public ouH(ME me) {
        this.f7013R = me;
    }

    public final void R(int i) {
        int i2;
        if (i > 0) {
            int length = this.f7015R.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.c;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f7015R[length].R;
                i -= i4;
                this.X -= i4;
                this.e--;
                i3++;
                length--;
            }
            h8A[] h8aArr = this.f7015R;
            int i5 = i2 + 1;
            System.arraycopy(h8aArr, i5, h8aArr, i5 + i3, this.e);
            h8A[] h8aArr2 = this.f7015R;
            int i6 = this.c + 1;
            Arrays.fill(h8aArr2, i6, i6 + i3, (Object) null);
            this.c += i3;
        }
    }

    public final void X(int i, int i2, int i3) {
        if (i < i2) {
            this.f7013R.a(i | i3);
            return;
        }
        this.f7013R.a(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.f7013R.a(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.f7013R.a(i4);
    }

    public final void c(F6 f6) {
        int i = 0;
        if (this.f7014R) {
            int[] iArr = jv5.f5114R;
            int v = f6.v();
            long j = 0;
            for (int i2 = 0; i2 < v; i2++) {
                byte X = f6.X(i2);
                byte[] bArr = asb.f1481R;
                j += (long) jv5.f5113R[X & 255];
            }
            if (((int) ((j + ((long) 7)) >> 3)) < f6.v()) {
                ME me = new ME();
                int[] iArr2 = jv5.f5114R;
                int v2 = f6.v();
                long j2 = 0;
                byte b = 0;
                while (i < v2) {
                    byte X2 = f6.X(i);
                    byte[] bArr2 = asb.f1481R;
                    int i3 = X2 & 255;
                    int i4 = jv5.f5114R[i3];
                    byte b2 = jv5.f5113R[i3];
                    j2 = (j2 << b2) | ((long) i4);
                    int i5 = b + b2;
                    while (i5 >= 8) {
                        i5 = (i5 == 1 ? 1 : 0) - 8;
                        me.a((int) (j2 >> i5));
                    }
                    i++;
                    b = i5;
                }
                if (b > 0) {
                    me.a((int) ((255 >>> (b == 1 ? 1 : 0)) | (j2 << (8 - b))));
                }
                F6 h = me.h();
                X(h.v(), 127, 128);
                ME me2 = this.f7013R;
                me2.getClass();
                h.x(me2, h.v());
                return;
            }
        }
        X(f6.v(), 127, 0);
        ME me3 = this.f7013R;
        me3.getClass();
        f6.x(me3, f6.v());
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.util.ArrayList r13) {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouH.e(java.util.ArrayList):void");
    }

    public final void v(h8A h8a) {
        int i = h8a.R;
        int i2 = this.v;
        if (i > i2) {
            P7.G(this.f7015R, null);
            this.c = this.f7015R.length - 1;
            this.e = 0;
            this.X = 0;
            return;
        }
        R((this.X + i) - i2);
        int i3 = this.e + 1;
        h8A[] h8aArr = this.f7015R;
        if (i3 > h8aArr.length) {
            h8A[] h8aArr2 = new h8A[h8aArr.length * 2];
            System.arraycopy(h8aArr, 0, h8aArr2, h8aArr.length, h8aArr.length);
            this.c = this.f7015R.length - 1;
            this.f7015R = h8aArr2;
        }
        int i4 = this.c;
        this.c = i4 - 1;
        this.f7015R[i4] = h8a;
        this.e++;
        this.X += i;
    }
}
