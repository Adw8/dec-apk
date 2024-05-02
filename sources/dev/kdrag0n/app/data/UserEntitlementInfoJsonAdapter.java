package dev.kdrag0n.app.data;

/* loaded from: classes.dex */
public final class UserEntitlementInfoJsonAdapter extends k49 {
    public final jsT R = jsT.v("entitlementTier");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f2696R;

    public UserEntitlementInfoJsonAdapter(k_Z k_z) {
        this.f2696R = k_z.c(Integer.TYPE, lsA.R, "entitlementTier");
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        UserEntitlementInfo userEntitlementInfo = (UserEntitlementInfo) obj;
        if (userEntitlementInfo != null) {
            mot.c();
            mot.Z("entitlementTier");
            this.f2696R.O(mot, Integer.valueOf(userEntitlementInfo.R));
            mot.X();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        csz.c();
        Integer num = null;
        while (csz.H()) {
            int G = csz.G(this.R);
            if (G == -1) {
                csz.B();
                csz.l();
            } else if (G == 0 && (num = (Integer) this.f2696R.R(csz)) == null) {
                throw mzK.H("entitlementTier", "entitlementTier", csz);
            }
        }
        csz.O();
        if (num != null) {
            return new UserEntitlementInfo(num.intValue());
        }
        throw mzK.X("entitlementTier", "entitlementTier", csz);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UserEntitlementInfo)";
    }
}
