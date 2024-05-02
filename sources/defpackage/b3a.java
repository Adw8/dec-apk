package defpackage;

/* renamed from: b3a  reason: default package */
/* loaded from: classes.dex */
public final class b3a {
    public static final /* synthetic */ int R = 0;
    public static final long v = aH9.y(0.5f, 0.5f);

    /* renamed from: R  reason: collision with other field name */
    public final long f1515R;

    public /* synthetic */ b3a(long j) {
        this.f1515R = j;
    }

    public static final float R(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b3a) && this.f1515R == ((b3a) obj).f1515R;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1515R);
    }

    public final String toString() {
        long j = this.f1515R;
        return "TransformOrigin(packedValue=" + j + ')';
    }
}
