package defpackage;

/* renamed from: ned  reason: default package */
/* loaded from: classes.dex */
public final class ned {
    public final int R;

    public /* synthetic */ ned(int i) {
        this.R = i;
    }

    public static String R(int i) {
        boolean z = false;
        if (i == 0) {
            return "Normal";
        }
        if (i == 1) {
            z = true;
        }
        return z ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ned) && this.R == ((ned) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return R(this.R);
    }
}
