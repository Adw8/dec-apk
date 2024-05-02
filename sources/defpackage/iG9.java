package defpackage;

/* renamed from: iG9  reason: default package */
/* loaded from: classes.dex */
public final class iG9 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f4519R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4520R;
    public final int v;

    public iG9(boolean z, int i, int i2, g5M g5m) {
        this.f4520R = z;
        this.R = i;
        this.v = i2;
        this.f4519R = g5m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iG9)) {
            return false;
        }
        iG9 ig9 = (iG9) obj;
        return this.f4520R == ig9.f4520R && this.R == ig9.R && this.v == ig9.v && n3x.v(this.f4519R, ig9.f4519R);
    }

    public final int hashCode() {
        boolean z = this.f4520R;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return this.f4519R.hashCode() + opT.e(-1, opT.e(this.v, opT.e(this.R, i * 31, 31), 31), 31);
    }

    public final String toString() {
        boolean z = this.f4520R;
        int i = this.R;
        int i2 = this.v;
        kg9 kg9 = this.f4519R;
        return "OnboardingProps(showLegal=" + z + ", graph=" + i + ", startDest=" + i2 + ", endDest=-1, getNextLabel=" + kg9 + ")";
    }
}
