package defpackage;

/* renamed from: fNw  reason: default package */
/* loaded from: classes.dex */
public final class fNw implements gl4 {
    public final ceM R;

    /* renamed from: R  reason: collision with other field name */
    public final f_c f3402R;

    /* renamed from: R  reason: collision with other field name */
    public final hh4 f3403R;
    public final int e;

    public fNw(ceM cem, int i, hh4 hh4, q4 q4Var) {
        this.R = cem;
        this.e = i;
        this.f3403R = hh4;
        this.f3402R = q4Var;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        l0f L = pc0.L(oys.R(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(L.X, oys.L(j));
        return mzf.f(L.e, min, iia.R, new fjh(mzf, this, L, min, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fNw)) {
            return false;
        }
        fNw fnw = (fNw) obj;
        return n3x.v(this.R, fnw.R) && this.e == fnw.e && n3x.v(this.f3403R, fnw.f3403R) && n3x.v(this.f3402R, fnw.f3402R);
    }

    public final int hashCode() {
        int e = opT.e(this.e, this.R.hashCode() * 31, 31);
        return this.f3402R.hashCode() + ((this.f3403R.hashCode() + e) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("VerticalScrollLayoutModifier(scrollerPosition=");
        U.append(this.R);
        U.append(", cursorOffset=");
        U.append(this.e);
        U.append(", transformedText=");
        U.append(this.f3403R);
        U.append(", textLayoutResultProvider=");
        U.append(this.f3402R);
        U.append(')');
        return U.toString();
    }
}
