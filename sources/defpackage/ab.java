package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ab  reason: default package */
/* loaded from: classes.dex */
public final class ab {
    public final Object R;

    public /* synthetic */ ab(c3E c3e) {
        this.R = c3e;
    }

    public final void R(L2 l2, ArrayList arrayList) {
        ((c3E) ((nNP) this.R)).w(new aGn(l2, arrayList));
    }

    public final void v(L2 l2, List list) {
        ((c3E) ((nNP) this.R)).w(new p0p(l2, list));
    }

    public /* synthetic */ ab(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new fGy(optJSONObject));
                }
            }
        }
        this.R = arrayList;
    }
}
