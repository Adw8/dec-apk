package defpackage;

import org.json.JSONObject;

/* renamed from: fGy  reason: default package */
/* loaded from: classes.dex */
public final class fGy {
    public final long R;

    public fGy(JSONObject jSONObject) {
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("formattedPrice");
        this.R = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
