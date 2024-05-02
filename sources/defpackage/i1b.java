package defpackage;

/* renamed from: i1b  reason: default package */
/* loaded from: classes.dex */
public final class i1b extends mjG implements gl4 {
    public final kg9 R;

    public i1b(kg9 kg9) {
        this.R = kg9;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        l0f L = pc0.L(j);
        return mzf.f(L.e, L.X, iia.R, new ofd(this, mzf, L, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i1b i1b = obj instanceof i1b ? (i1b) obj : null;
        return i1b != null && n3x.v(this.R, i1b.R);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("OffsetPxModifier(offset=");
        U.append(this.R);
        U.append(", rtlAware=");
        U.append(true);
        U.append(')');
        return U.toString();
    }
}
