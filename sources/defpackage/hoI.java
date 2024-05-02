package defpackage;

/* renamed from: hoI  reason: default package */
/* loaded from: classes.dex */
public final class hoI implements Comparable {
    public final float R;

    public /* synthetic */ hoI(float f) {
        this.R = f;
    }

    public static final boolean R(float f, float f2) {
        return n3x.v(Float.valueOf(f), Float.valueOf(f2));
    }

    public static String v(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.R, ((hoI) obj).R);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        float f = this.R;
        if (!(obj instanceof hoI)) {
            return false;
        }
        return n3x.v(Float.valueOf(f), Float.valueOf(((hoI) obj).R));
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Float.hashCode(this.R);
    }

    @Override // java.lang.Object
    public final String toString() {
        return v(this.R);
    }
}
