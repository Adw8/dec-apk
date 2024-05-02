package defpackage;

/* renamed from: l3L  reason: default package */
/* loaded from: classes.dex */
public final class l3L {
    public static final String e = kfk.P("WorkSpec");
    public long L;
    public long O;
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public long f5558R;

    /* renamed from: R  reason: collision with other field name */
    public csc f5559R;

    /* renamed from: R  reason: collision with other field name */
    public g2m f5560R;

    /* renamed from: R  reason: collision with other field name */
    public gDn f5561R;

    /* renamed from: R  reason: collision with other field name */
    public String f5562R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5563R;
    public long X;
    public int c;

    /* renamed from: c  reason: collision with other field name */
    public long f5564c;

    /* renamed from: c  reason: collision with other field name */
    public String f5565c;

    /* renamed from: e  reason: collision with other field name */
    public long f5566e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public long f5567v;

    /* renamed from: v  reason: collision with other field name */
    public g2m f5568v;

    /* renamed from: v  reason: collision with other field name */
    public String f5569v;

    public l3L(String str, String str2) {
        this.f5561R = gDn.ENQUEUED;
        g2m g2m = g2m.R;
        this.f5560R = g2m;
        this.f5568v = g2m;
        this.f5559R = csc.R;
        this.v = 1;
        this.f5566e = 30000;
        this.L = -1;
        this.c = 1;
        this.f5562R = str;
        this.f5569v = str2;
    }

    public final long R() {
        long j;
        long j2;
        boolean z = true;
        boolean z2 = false;
        if (this.f5561R == gDn.ENQUEUED && this.R > 0) {
            if (this.v == 2) {
                z2 = true;
            }
            long scalb = z2 ? this.f5566e * ((long) this.R) : (long) Math.scalb((float) this.f5566e, this.R - 1);
            j = this.X;
            j2 = Math.min(18000000L, scalb);
        } else {
            long j3 = 0;
            if (c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = this.X;
                int i = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
                if (i == 0) {
                    j4 = this.f5558R + currentTimeMillis;
                }
                long j5 = this.f5564c;
                long j6 = this.f5567v;
                if (j5 == j6) {
                    z = false;
                }
                if (z) {
                    if (i == 0) {
                        j3 = j5 * -1;
                    }
                    return j4 + j6 + j3;
                }
                if (i != 0) {
                    j3 = j6;
                }
                return j4 + j3;
            }
            j2 = this.X;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            j = this.f5558R;
        }
        return j2 + j;
    }

    public final boolean c() {
        return this.f5567v != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l3L.class != obj.getClass()) {
            return false;
        }
        l3L l3l = (l3L) obj;
        if (this.f5558R != l3l.f5558R || this.f5567v != l3l.f5567v || this.f5564c != l3l.f5564c || this.R != l3l.R || this.f5566e != l3l.f5566e || this.X != l3l.X || this.O != l3l.O || this.L != l3l.L || this.f5563R != l3l.f5563R || !this.f5562R.equals(l3l.f5562R) || this.f5561R != l3l.f5561R || !this.f5569v.equals(l3l.f5569v)) {
            return false;
        }
        String str = this.f5565c;
        if (str == null ? l3l.f5565c == null : str.equals(l3l.f5565c)) {
            return this.f5560R.equals(l3l.f5560R) && this.f5568v.equals(l3l.f5568v) && this.f5559R.equals(l3l.f5559R) && this.v == l3l.v && this.c == l3l.c;
        }
        return false;
    }

    public final int hashCode() {
        int O = opT.O(this.f5569v, (this.f5561R.hashCode() + (this.f5562R.hashCode() * 31)) * 31, 31);
        String str = this.f5565c;
        int hashCode = str != null ? str.hashCode() : 0;
        int hashCode2 = this.f5560R.hashCode();
        int hashCode3 = this.f5568v.hashCode();
        long j = this.f5558R;
        long j2 = this.f5567v;
        long j3 = this.f5564c;
        int hashCode4 = this.f5559R.hashCode();
        int I = jQ.I(this.v);
        long j4 = this.f5566e;
        long j5 = this.X;
        long j6 = this.O;
        long j7 = this.L;
        return jQ.I(this.c) + ((((((((((((I + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((O + hashCode) * 31)) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.R) * 31)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f5563R ? 1 : 0)) * 31);
    }

    public final String toString() {
        return jQ.g(opT.U("{WorkSpec: "), this.f5562R, "}");
    }

    public final boolean v() {
        return !csc.R.equals(this.f5559R);
    }

    public l3L(l3L l3l) {
        this.f5561R = gDn.ENQUEUED;
        g2m g2m = g2m.R;
        this.f5560R = g2m;
        this.f5568v = g2m;
        this.f5559R = csc.R;
        this.v = 1;
        this.f5566e = 30000;
        this.L = -1;
        this.c = 1;
        this.f5562R = l3l.f5562R;
        this.f5569v = l3l.f5569v;
        this.f5561R = l3l.f5561R;
        this.f5565c = l3l.f5565c;
        this.f5560R = new g2m(l3l.f5560R);
        this.f5568v = new g2m(l3l.f5568v);
        this.f5558R = l3l.f5558R;
        this.f5567v = l3l.f5567v;
        this.f5564c = l3l.f5564c;
        this.f5559R = new csc(l3l.f5559R);
        this.R = l3l.R;
        this.v = l3l.v;
        this.f5566e = l3l.f5566e;
        this.X = l3l.X;
        this.O = l3l.O;
        this.L = l3l.L;
        this.f5563R = l3l.f5563R;
        this.c = l3l.c;
    }
}
