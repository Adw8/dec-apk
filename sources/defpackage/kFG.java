package defpackage;

/* renamed from: kFG  reason: default package */
/* loaded from: classes.dex */
public final class kFG {
    public final int R = 3;

    public static String R(int i) {
        boolean z = false;
        if (i == 1) {
            return "Strictness.None";
        }
        if (i == 2) {
            return "Strictness.Loose";
        }
        if (i == 3) {
            return "Strictness.Normal";
        }
        if (i == 4) {
            z = true;
        }
        return z ? "Strictness.Strict" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kFG) && this.R == ((kFG) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return R(this.R);
    }
}
