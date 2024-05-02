package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Purchase {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final JSONObject f2212R;
    public final String v;

    public Purchase(String str, String str2) {
        this.R = str;
        this.v = str2;
        this.f2212R = new JSONObject(str);
    }

    public final String R() {
        JSONObject jSONObject = this.f2212R;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.R, purchase.R) && TextUtils.equals(this.v, purchase.v);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.R));
    }
}
