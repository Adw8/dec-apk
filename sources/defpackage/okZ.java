package defpackage;

/* renamed from: okZ  reason: default package */
/* loaded from: classes.dex */
public final class okZ extends mjG implements cNa, b5N {
    public final Object R;

    public okZ(Object obj) {
        this.R = obj;
    }

    @Override // defpackage.cNa
    public final Object b(Object obj) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        okZ okz = obj instanceof okZ ? (okZ) obj : null;
        if (okz == null) {
            return false;
        }
        return n3x.v(this.R, okz.R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        StringBuilder U = opT.U("LayoutId(id=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
