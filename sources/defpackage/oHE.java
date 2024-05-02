package defpackage;

/* renamed from: oHE  reason: default package */
/* loaded from: classes.dex */
public final class oHE {
    public final int R;

    public /* synthetic */ oHE(int i) {
        this.R = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oHE) && this.R == ((oHE) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return this.R == 0 ? "FabPosition.Center" : "FabPosition.End";
    }
}
