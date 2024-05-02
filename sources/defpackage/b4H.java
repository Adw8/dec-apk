package defpackage;

/* renamed from: b4H  reason: default package */
/* loaded from: classes.dex */
public final class b4H extends mjG implements gl4 {
    public final lR3 R;

    public b4H(lR3 lr3) {
        this.R = lr3;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        return (mET) this.R.y(mzf, pc0, new oys(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b4H b4h = obj instanceof b4H ? (b4H) obj : null;
        if (b4h == null) {
            return false;
        }
        return n3x.v(this.R, b4h.R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        StringBuilder U = opT.U("LayoutModifierImpl(measureBlock=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
