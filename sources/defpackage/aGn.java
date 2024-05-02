package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aGn  reason: default package */
/* loaded from: classes.dex */
public final class aGn {
    public final L2 R;

    /* renamed from: R  reason: collision with other field name */
    public final List f819R;

    public aGn(L2 l2, ArrayList arrayList) {
        this.R = l2;
        this.f819R = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aGn)) {
            return false;
        }
        aGn agn = (aGn) obj;
        return n3x.v(this.R, agn.R) && n3x.v(this.f819R, agn.f819R);
    }

    public final int hashCode() {
        int hashCode = this.R.hashCode() * 31;
        List list = this.f819R;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder U = opT.U("ProductDetailsResult(billingResult=");
        U.append(this.R);
        U.append(", productDetailsList=");
        U.append(this.f819R);
        U.append(')');
        return U.toString();
    }
}
