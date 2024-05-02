package defpackage;

/* renamed from: cEC  reason: default package */
/* loaded from: classes.dex */
public final class cEC implements mKb {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final bz f2020R;

    public cEC(String str, int i) {
        this.f2020R = new bz(str, null, 6);
        this.R = i;
    }

    @Override // defpackage.mKb
    public final void R(p3R p3r) {
        int i = p3r.c;
        int i2 = -1;
        if (i != -1) {
            p3r.X(i, p3r.e, this.f2020R.R);
            if (this.f2020R.R.length() > 0) {
                p3r.O(i, this.f2020R.R.length() + i);
            }
        } else {
            int i3 = p3r.R;
            p3r.X(i3, p3r.v, this.f2020R.R);
            if (this.f2020R.R.length() > 0) {
                p3r.O(i3, this.f2020R.R.length() + i3);
            }
        }
        int i4 = p3r.R;
        int i5 = p3r.v;
        if (i4 == i5) {
            i2 = i5;
        }
        int i6 = this.R;
        int i7 = i2 + i6;
        int x = caw.x(i6 > 0 ? i7 - 1 : i7 - this.f2020R.R.length(), 0, p3r.e());
        p3r.L(x, x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cEC)) {
            return false;
        }
        cEC cec = (cEC) obj;
        return n3x.v(this.f2020R.R, cec.f2020R.R) && this.R == cec.R;
    }

    public final int hashCode() {
        return (this.f2020R.R.hashCode() * 31) + this.R;
    }

    public final String toString() {
        StringBuilder U = opT.U("SetComposingTextCommand(text='");
        U.append(this.f2020R.R);
        U.append("', newCursorPosition=");
        return jQ.P(U, this.R, ')');
    }
}
