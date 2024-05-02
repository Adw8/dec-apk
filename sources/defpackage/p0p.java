package defpackage;

import java.util.List;

/* renamed from: p0p  reason: default package */
/* loaded from: classes.dex */
public final class p0p {
    public final L2 R;

    /* renamed from: R  reason: collision with other field name */
    public final List f7051R;

    public p0p(L2 l2, List list) {
        this.R = l2;
        this.f7051R = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0p)) {
            return false;
        }
        p0p p0p = (p0p) obj;
        return n3x.v(this.R, p0p.R) && n3x.v(this.f7051R, p0p.f7051R);
    }

    public final int hashCode() {
        return this.f7051R.hashCode() + (this.R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("PurchasesResult(billingResult=");
        U.append(this.R);
        U.append(", purchasesList=");
        U.append(this.f7051R);
        U.append(')');
        return U.toString();
    }
}
