package defpackage;

/* renamed from: oGA  reason: default package */
/* loaded from: classes.dex */
public final class oGA {
    public final int R;

    public /* synthetic */ oGA(int i) {
        this.R = i;
    }

    public static String R(int i) {
        boolean z = false;
        if (i == 0) {
            return "Miter";
        }
        if (i == 1) {
            return "Round";
        }
        if (i == 2) {
            z = true;
        }
        return z ? "Bevel" : "Unknown";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oGA) && this.R == ((oGA) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return R(this.R);
    }
}
