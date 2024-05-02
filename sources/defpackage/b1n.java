package defpackage;

/* renamed from: b1n  reason: default package */
/* loaded from: classes.dex */
public final class b1n {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f1510R;
    public final String v;

    public b1n(String str, String str2, boolean z) {
        this.R = str;
        this.v = str2;
        this.f1510R = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1n)) {
            return false;
        }
        b1n b1n = (b1n) obj;
        return n3x.v(this.R, b1n.R) && n3x.v(this.v, b1n.v) && this.f1510R == b1n.f1510R;
    }

    public final int hashCode() {
        int O = opT.O(this.v, this.R.hashCode() * 31, 31);
        boolean z = this.f1510R;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return O + i;
    }

    public final String toString() {
        String str = this.R;
        String str2 = this.v;
        boolean z = this.f1510R;
        return "Container(id=" + str + ", label=" + str2 + ", isRunning=" + z + ")";
    }
}
