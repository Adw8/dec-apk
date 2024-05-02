package defpackage;

/* renamed from: hqI  reason: default package */
/* loaded from: classes.dex */
public final class hqI {
    public final int R;

    public /* synthetic */ hqI(int i) {
        this.R = i;
    }

    public static String R(int i) {
        boolean z = false;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "All";
        }
        if (i == 2) {
            return "Weight";
        }
        if (i == 3) {
            z = true;
        }
        return z ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hqI) && this.R == ((hqI) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return R(this.R);
    }
}
