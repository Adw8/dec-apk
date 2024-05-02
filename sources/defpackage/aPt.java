package defpackage;

/* renamed from: aPt  reason: default package */
/* loaded from: classes.dex */
public final class aPt {
    public static final aPt R;

    /* renamed from: R  reason: collision with other field name */
    public final float f867R;

    /* renamed from: R  reason: collision with other field name */
    public final long f868R;
    public final long c;
    public final long v;

    static {
        long j = aWo.v;
        R = new aPt(j, 1.0f, 0, j);
    }

    public aPt(long j, float f, long j2, long j3) {
        this.f868R = j;
        this.f867R = f;
        this.v = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aPt)) {
            return false;
        }
        aPt apt = (aPt) obj;
        return aWo.v(this.f868R, apt.f868R) && n3x.v(Float.valueOf(this.f867R), Float.valueOf(apt.f867R)) && this.v == apt.v && aWo.v(this.c, apt.c);
    }

    public final int hashCode() {
        long j = this.f868R;
        int i = aWo.R;
        return Long.hashCode(this.c) + opT.X(this.v, jQ.c(this.f867R, Long.hashCode(j) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("VelocityEstimate(pixelsPerSecond=");
        U.append((Object) aWo.m(this.f868R));
        U.append(", confidence=");
        U.append(this.f867R);
        U.append(", durationMillis=");
        U.append(this.v);
        U.append(", offset=");
        U.append((Object) aWo.m(this.c));
        U.append(')');
        return U.toString();
    }
}
