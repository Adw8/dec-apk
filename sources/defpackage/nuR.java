package defpackage;

/* renamed from: nuR  reason: default package */
/* loaded from: classes.dex */
public final class nuR {
    public final int R;

    public /* synthetic */ nuR(int i) {
        this.R = i;
    }

    public static String R(int i) {
        boolean z = false;
        if (i == 0) {
            return "Butt";
        }
        if (i == 1) {
            return "Round";
        }
        if (i == 2) {
            z = true;
        }
        return z ? "Square" : "Unknown";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nuR) && this.R == ((nuR) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return R(this.R);
    }
}
