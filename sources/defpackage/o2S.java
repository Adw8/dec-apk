package defpackage;

/* renamed from: o2S  reason: default package */
/* loaded from: classes.dex */
public final class o2S {
    public static final /* synthetic */ int R = 0;
    public static final long c = gvP.v(Float.NaN, Float.NaN);
    public static final long v;

    /* renamed from: R  reason: collision with other field name */
    public final long f6655R;

    static {
        float f = (float) 0;
        v = gvP.v(f, f);
    }

    public /* synthetic */ o2S(long j) {
        this.f6655R = j;
    }

    public static final float R(long j) {
        if (j != c) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static String c(long j) {
        if (!(j != c)) {
            return "DpSize.Unspecified";
        }
        return ((Object) hoI.v(v(j))) + " x " + ((Object) hoI.v(R(j)));
    }

    public static final float v(long j) {
        if (j != c) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o2S) && this.f6655R == ((o2S) obj).f6655R;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6655R);
    }

    public final String toString() {
        return c(this.f6655R);
    }
}
