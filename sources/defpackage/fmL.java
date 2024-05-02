package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: fmL  reason: default package */
/* loaded from: classes.dex */
public final class fmL {
    public a7_ R;

    /* renamed from: R  reason: collision with other field name */
    public h7U f3556R;

    /* renamed from: R  reason: collision with other field name */
    public iRl f3557R;

    /* renamed from: R  reason: collision with other field name */
    public String f3558R;

    /* renamed from: R  reason: collision with other field name */
    public Map f3559R;

    public fmL() {
        this.f3559R = iia.R;
        this.f3558R = "GET";
        this.f3557R = new iRl();
    }

    public final void R(String str, String str2) {
        this.f3557R.e(str, str2);
    }

    public final void c(String str) {
        this.f3557R.c(str);
    }

    public final void e(Class cls, Object obj) {
        Map map;
        x_ R = g8d.R(cls);
        if (obj != null) {
            if (this.f3559R.isEmpty()) {
                map = new LinkedHashMap();
                this.f3559R = map;
            } else {
                map = this.f3559R;
                gvP.O(map);
            }
            map.put(R, obj);
        } else if (!this.f3559R.isEmpty()) {
            Map map2 = this.f3559R;
            gvP.O(map2);
            map2.remove(R);
        }
    }

    public final void v(String str, h7U h7u) {
        boolean z = false;
        if (str.length() > 0) {
            if (h7u == null) {
                if (n3x.v(str, "POST") || n3x.v(str, "PUT") || n3x.v(str, "PATCH") || n3x.v(str, "PROPPATCH") || n3x.v(str, "REPORT")) {
                    z = true;
                }
                if (!(!z)) {
                    throw new IllegalArgumentException(jQ.C("method ", str, " must have a request body.").toString());
                }
            } else if (!l6.S(str)) {
                throw new IllegalArgumentException(jQ.C("method ", str, " must not have a request body.").toString());
            }
            this.f3558R = str;
            this.f3556R = h7u;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    public fmL(j0 j0Var) {
        Map map = iia.R;
        this.f3559R = map;
        this.R = (a7_) j0Var.f4786R;
        this.f3558R = (String) j0Var.v;
        this.f3556R = (h7U) j0Var.e;
        this.f3559R = !((Map) j0Var.X).isEmpty() ? new LinkedHashMap((Map) j0Var.X) : map;
        this.f3557R = ((bd4) j0Var.c).c();
    }
}
