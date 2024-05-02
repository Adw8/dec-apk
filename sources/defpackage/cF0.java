package defpackage;

/* renamed from: cF0  reason: default package */
/* loaded from: classes.dex */
public final class cF0 {
    public final int R;

    public /* synthetic */ cF0(int i) {
        this.R = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cF0) && this.R == ((cF0) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        int i = this.R;
        boolean z = false;
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            z = true;
        }
        return z ? "ContentOrRtl" : "Invalid";
    }
}
