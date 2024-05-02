package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: dTr  reason: default package */
/* loaded from: classes.dex */
public final class dTr {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f2625R;

    /* renamed from: R  reason: collision with other field name */
    public final JSONObject f2626R;
    public final String X;
    public final String c;
    public final String e;
    public final String v;

    public dTr(String str) {
        this.R = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f2626R = jSONObject;
        String optString = jSONObject.optString("productId");
        this.v = optString;
        String optString2 = jSONObject.optString("type");
        this.c = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        } else if (!TextUtils.isEmpty(optString2)) {
            this.e = jSONObject.optString("title");
            jSONObject.optString("name");
            jSONObject.optString("description");
            this.X = jSONObject.optString("skuDetailsToken");
            if (!optString2.equals("inapp")) {
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(new niE(optJSONArray.getJSONObject(i)));
                    }
                }
                this.f2625R = arrayList;
                return;
            }
            this.f2625R = null;
        } else {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dTr)) {
            return false;
        }
        return TextUtils.equals(this.R, ((dTr) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        String str = this.R;
        String obj = this.f2626R.toString();
        String str2 = this.v;
        String str3 = this.c;
        String str4 = this.e;
        String str5 = this.X;
        String valueOf = String.valueOf(this.f2625R);
        StringBuilder sb = new StringBuilder();
        sb.append("ProductDetails{jsonString='");
        sb.append(str);
        sb.append("', parsedJson=");
        sb.append(obj);
        sb.append(", productId='");
        sb.append(str2);
        sb.append("', productType='");
        sb.append(str3);
        sb.append("', title='");
        sb.append(str4);
        sb.append("', productDetailsToken='");
        sb.append(str5);
        sb.append("', subscriptionOfferDetails=");
        return jQ.g(sb, valueOf, "}");
    }
}
