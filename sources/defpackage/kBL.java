package defpackage;

import com.android.billingclient.api.Purchase;

/* renamed from: kBL  reason: default package */
/* loaded from: classes.dex */
public final class kBL extends bYR {
    public final Purchase R;

    public kBL(Purchase purchase) {
        this.R = purchase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kBL) && n3x.v(this.R, ((kBL) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        Purchase purchase = this.R;
        return "Removed(purchase=" + purchase + ")";
    }
}
