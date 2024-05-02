package defpackage;

import com.android.billingclient.api.Purchase;

/* renamed from: kjd  reason: default package */
/* loaded from: classes.dex */
public final class kjd extends bYR {
    public final Purchase R;

    public kjd(Purchase purchase) {
        this.R = purchase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjd) && n3x.v(this.R, ((kjd) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        Purchase purchase = this.R;
        return "Success(purchase=" + purchase + ")";
    }
}
