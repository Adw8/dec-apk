package defpackage;

/* renamed from: gbI  reason: default package */
/* loaded from: classes.dex */
public final class gbI implements mKb {
    public final int R;
    public final int v;

    public gbI(int i, int i2) {
        this.R = i;
        this.v = i2;
    }

    @Override // defpackage.mKb
    public final void R(p3R p3r) {
        int x = caw.x(this.R, 0, p3r.e());
        int x2 = caw.x(this.v, 0, p3r.e());
        if (x < x2) {
            p3r.L(x, x2);
        } else {
            p3r.L(x2, x);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbI)) {
            return false;
        }
        gbI gbi = (gbI) obj;
        return this.R == gbi.R && this.v == gbi.v;
    }

    public final int hashCode() {
        return (this.R * 31) + this.v;
    }

    public final String toString() {
        StringBuilder U = opT.U("SetSelectionCommand(start=");
        U.append(this.R);
        U.append(", end=");
        return jQ.P(U, this.v, ')');
    }
}
