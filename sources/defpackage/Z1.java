package defpackage;

/* renamed from: Z1  reason: default package */
/* loaded from: classes.dex */
public final class Z1 extends mjG implements cNa {
    public mz R;

    public Z1(Y6 y6) {
        this.R = y6;
    }

    @Override // defpackage.cNa
    public final Object b(Object obj) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Z1 z1 = obj instanceof Z1 ? (Z1) obj : null;
        return z1 != null && n3x.v(this.R, z1.R);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("BoxChildData(alignment=");
        U.append(this.R);
        U.append(", matchParentSize=");
        U.append(false);
        U.append(')');
        return U.toString();
    }
}
