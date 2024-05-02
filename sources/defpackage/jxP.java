package defpackage;

/* renamed from: jxP  reason: default package */
/* loaded from: classes.dex */
public final class jxP implements gl4 {
    public final ceM R;

    /* renamed from: R  reason: collision with other field name */
    public final f_c f5163R;

    /* renamed from: R  reason: collision with other field name */
    public final hh4 f5164R;
    public final int e;

    public jxP(ceM cem, int i, hh4 hh4, q4 q4Var) {
        this.R = cem;
        this.e = i;
        this.f5164R = hh4;
        this.f5163R = q4Var;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        l0f L = pc0.L(pc0.k(oys.L(j)) < oys.Z(j) ? j : oys.R(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        int min = Math.min(L.e, oys.Z(j));
        return mzf.f(min, L.X, iia.R, new fjh(mzf, this, L, min, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxP)) {
            return false;
        }
        jxP jxp = (jxP) obj;
        return n3x.v(this.R, jxp.R) && this.e == jxp.e && n3x.v(this.f5164R, jxp.f5164R) && n3x.v(this.f5163R, jxp.f5163R);
    }

    public final int hashCode() {
        int e = opT.e(this.e, this.R.hashCode() * 31, 31);
        return this.f5163R.hashCode() + ((this.f5164R.hashCode() + e) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("HorizontalScrollLayoutModifier(scrollerPosition=");
        U.append(this.R);
        U.append(", cursorOffset=");
        U.append(this.e);
        U.append(", transformedText=");
        U.append(this.f5164R);
        U.append(", textLayoutResultProvider=");
        U.append(this.f5163R);
        U.append(')');
        return U.toString();
    }
}
