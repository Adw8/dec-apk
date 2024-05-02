package defpackage;

/* renamed from: fzf  reason: default package */
/* loaded from: classes.dex */
public final class fzf {
    public final int R;

    public /* synthetic */ fzf(int i) {
        this.R = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fzf) && this.R == ((fzf) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        int i = this.R;
        boolean z = false;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        if (i == 5) {
            z = true;
        }
        return z ? "Image" : "Unknown";
    }
}
