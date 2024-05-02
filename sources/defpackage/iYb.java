package defpackage;

import java.nio.ByteBuffer;

/* renamed from: iYb  reason: default package */
/* loaded from: classes.dex */
public final class iYb {
    public static final ThreadLocal R = new ThreadLocal();

    /* renamed from: R  reason: collision with other field name */
    public final int f4639R;

    /* renamed from: R  reason: collision with other field name */
    public final piu f4640R;
    public volatile int v = 0;

    public iYb(piu piu, int i) {
        this.f4640R = piu;
        this.f4639R = i;
    }

    public final int R(int i) {
        a8Z e = e();
        int R2 = e.R(16);
        if (R2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = ((kY7) e).f5345R;
        int i2 = R2 + ((kY7) e).R;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int c() {
        a8Z e = e();
        int R2 = e.R(4);
        if (R2 != 0) {
            return ((kY7) e).f5345R.getInt(R2 + ((kY7) e).R);
        }
        return 0;
    }

    public final a8Z e() {
        ThreadLocal threadLocal = R;
        a8Z a8z = (a8Z) threadLocal.get();
        if (a8z == null) {
            a8z = new a8Z();
            threadLocal.set(a8z);
        }
        lzo lzo = (lzo) this.f4640R.f7202R;
        int i = this.f4639R;
        int R2 = lzo.R(6);
        if (R2 != 0) {
            int i2 = R2 + ((kY7) lzo).R;
            int i3 = (i * 4) + ((kY7) lzo).f5345R.getInt(i2) + i2 + 4;
            a8z.v(((kY7) lzo).f5345R.getInt(i3) + i3, ((kY7) lzo).f5345R);
        }
        return a8z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(c()));
        sb.append(", codepoints:");
        int v = v();
        for (int i = 0; i < v; i++) {
            sb.append(Integer.toHexString(R(i)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public final int v() {
        a8Z e = e();
        int R2 = e.R(16);
        if (R2 == 0) {
            return 0;
        }
        int i = R2 + ((kY7) e).R;
        return ((kY7) e).f5345R.getInt(((kY7) e).f5345R.getInt(i) + i);
    }
}
