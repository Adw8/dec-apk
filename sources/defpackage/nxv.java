package defpackage;

/* renamed from: nxv  reason: default package */
/* loaded from: classes.dex */
public final class nxv {
    public final int R = 1;

    public static String R(int i) {
        boolean z = false;
        if (i == 1) {
            return "Strategy.Simple";
        }
        if (i == 2) {
            return "Strategy.HighQuality";
        }
        if (i == 3) {
            z = true;
        }
        return z ? "Strategy.Balanced" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nxv) && this.R == ((nxv) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return R(this.R);
    }
}
