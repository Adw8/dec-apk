package defpackage;

/* renamed from: esE  reason: default package */
/* loaded from: classes.dex */
public final class esE {
    public static final /* synthetic */ int R = 0;
    public static final long c = gvP.R(Float.NaN, Float.NaN);
    public static final long v;

    /* renamed from: R  reason: collision with other field name */
    public final long f3230R;

    static {
        float f = (float) 0;
        v = gvP.R(f, f);
    }

    public /* synthetic */ esE(long j) {
        this.f3230R = j;
    }

    public static final float R(long j) {
        if (j != c) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static String c(long j) {
        if (!(j != c)) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) hoI.v(R(j))) + ", " + ((Object) hoI.v(v(j))) + ')';
    }

    public static final float v(long j) {
        if (j != c) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof esE) && this.f3230R == ((esE) obj).f3230R;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3230R);
    }

    public final String toString() {
        return c(this.f3230R);
    }
}
