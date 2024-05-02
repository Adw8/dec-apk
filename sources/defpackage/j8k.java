package defpackage;

/* renamed from: j8k  reason: default package */
/* loaded from: classes.dex */
public final class j8k {
    public final int R;

    public /* synthetic */ j8k(int i) {
        this.R = i;
    }

    public static String R(int i) {
        boolean z = false;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Default";
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        if (i == 7) {
            z = true;
        }
        return z ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j8k) && this.R == ((j8k) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return R(this.R);
    }
}
