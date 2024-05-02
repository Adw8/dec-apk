package defpackage;

/* renamed from: bCi  reason: default package */
/* loaded from: classes.dex */
public final class bCi {
    public final int R = 1;

    public final boolean equals(Object obj) {
        return (obj instanceof bCi) && this.R == ((bCi) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        int i = this.R;
        boolean z = false;
        if (i == 1) {
            return "WordBreak.None";
        }
        if (i == 2) {
            z = true;
        }
        return z ? "WordBreak.Phrase" : "Invalid";
    }
}
