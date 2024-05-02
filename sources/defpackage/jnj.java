package defpackage;

/* renamed from: jnj  reason: default package */
/* loaded from: classes.dex */
public final class jnj {
    public final int R;

    public /* synthetic */ jnj(int i) {
        this.R = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jnj) && this.R == ((jnj) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        int i = this.R;
        boolean z = false;
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "Enter";
        }
        if (i == 8) {
            z = true;
        }
        return z ? "Exit" : "Invalid FocusDirection";
    }
}
