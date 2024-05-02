package defpackage;

/* renamed from: L0  reason: default package */
/* loaded from: classes.dex */
public final class L0 {
    public final float R;

    public /* synthetic */ L0(float f) {
        this.R = f;
    }

    public final boolean equals(Object obj) {
        float f = this.R;
        if (!(obj instanceof L0)) {
            return false;
        }
        return n3x.v(Float.valueOf(f), Float.valueOf(((L0) obj).R));
    }

    public final int hashCode() {
        return Float.hashCode(this.R);
    }

    public final String toString() {
        float f = this.R;
        return "BaselineShift(multiplier=" + f + ')';
    }
}
