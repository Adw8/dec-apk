package defpackage;

/* renamed from: cYD  reason: default package */
/* loaded from: classes.dex */
public final class cYD {
    public final int R;

    public /* synthetic */ cYD(int i) {
        this.R = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cYD) && this.R == ((cYD) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return opT.m("EntitlementType(value=", this.R, ")");
    }
}
