package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONException;

/* renamed from: fgm  reason: default package */
/* loaded from: classes.dex */
public abstract class fgm {
    public static final int R = Runtime.getRuntime().availableProcessors();

    public static void L(String str, String str2, Exception exc) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, exc);
        }
    }

    public static void O(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static int R(String str, Bundle bundle) {
        if (bundle == null) {
            O(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            X(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            O(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
            return 6;
        }
    }

    public static void X(String str, String str2) {
        if (!Log.isLoggable(str, 2)) {
            return;
        }
        if (!str2.isEmpty()) {
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i -= min;
            }
            return;
        }
        Log.v(str, str2);
    }

    public static Purchase Z(String str, String str2) {
        if (str == null || str2 == null) {
            X("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            O("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }

    public static L2 c(Intent intent, String str) {
        if (intent == null) {
            O("BillingHelper", "Got null intent!");
            L2 v = L2.v();
            v.v = 6;
            v.f269R = "An internal error occurred.";
            return v.R();
        }
        L2 v2 = L2.v();
        v2.v = R(str, intent.getExtras());
        v2.f269R = e(str, intent.getExtras());
        return v2.R();
    }

    public static String e(String str, Bundle bundle) {
        if (bundle == null) {
            O(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            X(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            O(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    public static Bundle v(String str, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            jpU jpu = (jpU) arrayList.get(i);
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        return bundle;
    }
}
