package defpackage;

import java.util.Arrays;

/* renamed from: l2S  reason: default package */
/* loaded from: classes.dex */
public final class l2S {

    /* renamed from: R  reason: collision with other field name */
    public byte[] f5552R = new byte[4096];
    public int R = 0;
    public int v = -1;

    /* renamed from: R  reason: collision with other field name */
    public long f5549R = -1;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5551R = false;
    public int c = 30;

    /* renamed from: v  reason: collision with other field name */
    public long f5553v = -1;
    public int e = -1;

    /* renamed from: R  reason: collision with other field name */
    public String f5550R = null;

    public final int R(byte[] bArr, int i, int i2) {
        int c = c(30, i, i2, bArr);
        if (c == -1) {
            return -1;
        }
        if (this.f5549R == -1) {
            byte[] bArr2 = this.f5552R;
            long a = ((long) ((hDC.a(2, bArr2) << 16) | hDC.a(0, bArr2))) & 4294967295L;
            this.f5549R = a;
            if (a == 67324752) {
                this.f5551R = false;
                byte[] bArr3 = this.f5552R;
                this.f5553v = ((long) ((hDC.a(20, bArr3) << 16) | hDC.a(18, bArr3))) & 4294967295L;
                this.e = hDC.a(8, this.f5552R);
                this.v = hDC.a(26, this.f5552R);
                int a2 = this.v + 30 + hDC.a(28, this.f5552R);
                this.c = a2;
                int length = this.f5552R.length;
                if (length < a2) {
                    do {
                        length += length;
                    } while (length < a2);
                    this.f5552R = Arrays.copyOf(this.f5552R, length);
                }
            } else {
                this.f5551R = true;
            }
        }
        int c2 = c(this.c, i + c, i2 - c, bArr);
        if (c2 == -1) {
            return -1;
        }
        int i3 = c + c2;
        if (!this.f5551R && this.f5550R == null) {
            this.f5550R = new String(this.f5552R, 30, this.v);
        }
        return i3;
    }

    public final int c(int i, int i2, int i3, byte[] bArr) {
        int i4 = this.R;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f5552R, this.R, min);
        int i5 = this.R + min;
        this.R = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }

    public final e9S v() {
        int i = this.R;
        int i2 = this.c;
        if (i < i2) {
            return new e9S(this.f5550R, this.f5553v, this.e, true, this.f5551R, Arrays.copyOf(this.f5552R, i));
        }
        e9S e9s = new e9S(this.f5550R, this.f5553v, this.e, false, this.f5551R, Arrays.copyOf(this.f5552R, i2));
        this.R = 0;
        this.v = -1;
        this.f5549R = -1;
        this.f5551R = false;
        this.c = 30;
        this.f5553v = -1;
        this.e = -1;
        this.f5550R = null;
        return e9s;
    }
}
