package defpackage;

/* renamed from: a2Y  reason: default package */
/* loaded from: classes.dex */
public final class a2Y {
    public final int R;

    public /* synthetic */ a2Y(int i) {
        this.R = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a2Y) && this.R == ((a2Y) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        int i = this.R;
        boolean z = false;
        if (i == 0) {
            return "NonZero";
        }
        if (i == 1) {
            z = true;
        }
        return z ? "EvenOdd" : "Unknown";
    }
}
