package defpackage;

/* renamed from: gBy  reason: default package */
/* loaded from: classes.dex */
public final class gBy {
    public int R = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gBy) && this.R == ((gBy) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return jQ.P(opT.U("DeltaCounter(count="), this.R, ')');
    }
}
