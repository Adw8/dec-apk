package defpackage;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: jEG  reason: default package */
/* loaded from: classes.dex */
public final class jEG {
    public final String R;
    public final String v;

    public /* synthetic */ jEG(JSONObject jSONObject) {
        this.R = jSONObject.optString("productId");
        this.v = jSONObject.optString("productType");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jEG)) {
            return false;
        }
        jEG jeg = (jEG) obj;
        return this.R.equals(jeg.R) && this.v.equals(jeg.v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.R, this.v});
    }

    public final String toString() {
        return String.format("{id: %s, type: %s}", this.R, this.v);
    }
}
