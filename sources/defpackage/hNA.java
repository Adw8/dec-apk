package defpackage;

/* renamed from: hNA  reason: default package */
/* loaded from: classes.dex */
public final class hNA {
    public final int R;

    public /* synthetic */ hNA(int i) {
        this.R = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hNA) && this.R == ((hNA) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        int i = this.R;
        return "DataIndex(value=" + i + ')';
    }
}
