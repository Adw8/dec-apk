package defpackage;

/* renamed from: Hn  reason: default package */
/* loaded from: classes.dex */
public final class Hn extends mjG implements gl4 {
    public final kg9 R;

    public Hn(kg9 kg9) {
        this.R = kg9;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        l0f L = pc0.L(j);
        return mzf.f(L.e, L.X, iia.R, new V4(L, 18, this));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Hn)) {
            return false;
        }
        return n3x.v(this.R, ((Hn) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        StringBuilder U = opT.U("BlockGraphicsLayerModifier(block=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
