package defpackage;

/* renamed from: h11  reason: default package */
/* loaded from: classes.dex */
public final class h11 {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public h11 f4016R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4017R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f4018R;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public h11 f4019v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f4020v;

    public h11() {
        this.f4018R = new byte[8192];
        this.f4020v = true;
        this.f4017R = false;
    }

    public final h11 R() {
        h11 h11 = this.f4016R;
        h11 h112 = h11 != this ? h11 : null;
        h11 h113 = this.f4019v;
        h113.f4016R = h11;
        this.f4016R.f4019v = h113;
        this.f4016R = null;
        this.f4019v = null;
        return h112;
    }

    public final h11 c() {
        this.f4017R = true;
        return new h11(this.f4018R, this.R, this.v, true);
    }

    public final void e(h11 h11, int i) {
        if (h11.f4020v) {
            int i2 = h11.v;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!h11.f4017R) {
                    int i4 = h11.R;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = h11.f4018R;
                        P7.s(bArr, bArr, 0, i4, i2, 2);
                        h11.v -= h11.R;
                        h11.R = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f4018R;
            byte[] bArr3 = h11.f4018R;
            int i5 = h11.v;
            int i6 = this.R;
            System.arraycopy(bArr2, i6, bArr3, i5, (i6 + i) - i6);
            h11.v += i;
            this.R += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public final void v(h11 h11) {
        h11.f4019v = this;
        h11.f4016R = this.f4016R;
        this.f4016R.f4019v = h11;
        this.f4016R = h11;
    }

    public h11(byte[] bArr, int i, int i2, boolean z) {
        this.f4018R = bArr;
        this.R = i;
        this.v = i2;
        this.f4017R = z;
        this.f4020v = false;
    }
}
