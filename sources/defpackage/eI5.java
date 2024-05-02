package defpackage;

/* renamed from: eI5  reason: default package */
/* loaded from: classes.dex */
public final class eI5 implements mKb {
    public final int R;
    public final int v;

    public eI5(int i, int i2) {
        this.R = i;
        this.v = i2;
    }

    @Override // defpackage.mKb
    public final void R(p3R p3r) {
        if (p3r.c != -1) {
            p3r.c = -1;
            p3r.e = -1;
        }
        int x = caw.x(this.R, 0, p3r.e());
        int x2 = caw.x(this.v, 0, p3r.e());
        if (x == x2) {
            return;
        }
        if (x < x2) {
            p3r.O(x, x2);
        } else {
            p3r.O(x2, x);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eI5)) {
            return false;
        }
        eI5 ei5 = (eI5) obj;
        return this.R == ei5.R && this.v == ei5.v;
    }

    public final int hashCode() {
        return (this.R * 31) + this.v;
    }

    public final String toString() {
        StringBuilder U = opT.U("SetComposingRegionCommand(start=");
        U.append(this.R);
        U.append(", end=");
        return jQ.P(U, this.v, ')');
    }
}
