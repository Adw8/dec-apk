package defpackage;

/* renamed from: h7H  reason: default package */
/* loaded from: classes.dex */
public final class h7H implements mKb {
    public final int R;
    public final int v;

    public h7H(int i, int i2) {
        this.R = i;
        this.v = i2;
        if (!(i >= 0 && i2 >= 0)) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
    }

    @Override // defpackage.mKb
    public final void R(p3R p3r) {
        int i = p3r.v;
        p3r.R(i, Math.min(this.v + i, p3r.e()));
        p3r.R(Math.max(0, p3r.R - this.R), p3r.R);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7H)) {
            return false;
        }
        h7H h7h = (h7H) obj;
        return this.R == h7h.R && this.v == h7h.v;
    }

    public final int hashCode() {
        return (this.R * 31) + this.v;
    }

    public final String toString() {
        StringBuilder U = opT.U("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        U.append(this.R);
        U.append(", lengthAfterCursor=");
        return jQ.P(U, this.v, ')');
    }
}
