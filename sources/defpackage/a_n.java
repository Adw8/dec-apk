package defpackage;

/* renamed from: a_n  reason: default package */
/* loaded from: classes.dex */
public final class a_n {
    public final int R;

    public /* synthetic */ a_n(int i) {
        this.R = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a_n) && this.R == ((a_n) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        int i = this.R;
        boolean z = false;
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            z = true;
        }
        return z ? "Keyboard" : "Error";
    }
}
