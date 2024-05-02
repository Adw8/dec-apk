package defpackage;

/* renamed from: h22  reason: default package */
/* loaded from: classes.dex */
public abstract class h22 {
    public static final dZc R = new dZc(0);

    /* renamed from: R  reason: collision with other field name */
    public static final h22 f4029R = bmo.R.v();

    public abstract int R(int i);

    public long X(long j) {
        long c;
        boolean z;
        long j2;
        long c2;
        long j3;
        int i;
        if (j > 0) {
            long j4 = j - 0;
            if (j4 > 0) {
                if (((-j4) & j4) == j4) {
                    int i2 = (int) j4;
                    int i3 = (int) (j4 >>> 32);
                    if (i2 != 0) {
                        i = R(31 - Integer.numberOfLeadingZeros(i2));
                    } else if (i3 == 1) {
                        i = v();
                    } else {
                        j2 = (((long) R(31 - Integer.numberOfLeadingZeros(i3))) << 32) + (((long) v()) & 4294967295L);
                    }
                    j2 = ((long) i) & 4294967295L;
                } else {
                    do {
                        c2 = c() >>> 1;
                        j3 = c2 % j4;
                    } while ((j4 - 1) + (c2 - j3) < 0);
                    j2 = j3;
                }
                return 0 + j2;
            }
            do {
                c = c();
                if (0 > c || c >= j) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
            } while (!z);
            return c;
        }
        throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0L) + ", " + Long.valueOf(j) + ").").toString());
    }

    public abstract long c();

    public long e(long j) {
        return X(j);
    }

    public abstract int v();
}
