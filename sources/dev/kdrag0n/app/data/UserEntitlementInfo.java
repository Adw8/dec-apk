package dev.kdrag0n.app.data;

@h8S(generateAdapter = true)
/* loaded from: classes.dex */
public final class UserEntitlementInfo {
    public final int R;

    public UserEntitlementInfo(int i) {
        this.R = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserEntitlementInfo) && this.R == ((UserEntitlementInfo) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return opT.m("UserEntitlementInfo(entitlementTier=", this.R, ")");
    }
}
