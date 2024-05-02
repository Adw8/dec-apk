package defpackage;

/* renamed from: k77  reason: default package */
/* loaded from: classes.dex */
public final class k77 implements mKb {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final bz f5200R;

    public k77(String str, int i) {
        this.f5200R = new bz(str, null, 6);
        this.R = i;
    }

    @Override // defpackage.mKb
    public final void R(p3R p3r) {
        int i = p3r.c;
        if (i != -1) {
            p3r.X(i, p3r.e, this.f5200R.R);
        } else {
            p3r.X(p3r.R, p3r.v, this.f5200R.R);
        }
        int i2 = p3r.R;
        int i3 = p3r.v;
        if (i2 != i3) {
            i3 = -1;
        }
        int i4 = this.R;
        int i5 = i3 + i4;
        int x = caw.x(i4 > 0 ? i5 - 1 : i5 - this.f5200R.R.length(), 0, p3r.e());
        p3r.L(x, x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k77)) {
            return false;
        }
        k77 k77 = (k77) obj;
        return n3x.v(this.f5200R.R, k77.f5200R.R) && this.R == k77.R;
    }

    public final int hashCode() {
        return (this.f5200R.R.hashCode() * 31) + this.R;
    }

    public final String toString() {
        StringBuilder U = opT.U("CommitTextCommand(text='");
        U.append(this.f5200R.R);
        U.append("', newCursorPosition=");
        return jQ.P(U, this.R, ')');
    }
}
