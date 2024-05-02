package defpackage;

/* renamed from: pvy  reason: default package */
/* loaded from: classes.dex */
public final class pvy {
    public final int R;

    public /* synthetic */ pvy(int i) {
        this.R = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pvy) && this.R == ((pvy) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        int i = this.R;
        boolean z = false;
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            z = true;
        }
        return z ? "End" : "Invalid";
    }
}
