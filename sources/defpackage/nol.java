package defpackage;

import java.util.HashMap;

/* renamed from: nol  reason: default package */
/* loaded from: classes.dex */
public final class nol extends cWy {
    public HashMap R = new HashMap();

    @Override // defpackage.cWy
    public final lVU R(Object obj) {
        return (lVU) this.R.get(obj);
    }

    public final Object c(Object obj, Object obj2) {
        lVU R = R(obj);
        if (R != null) {
            return R.v;
        }
        HashMap hashMap = this.R;
        lVU lvu = new lVU(obj, obj2);
        this.e++;
        lVU lvu2 = this.v;
        if (lvu2 == null) {
            ((cWy) this).f2123R = lvu;
            this.v = lvu;
        } else {
            lvu2.f5763R = lvu;
            lvu.f5764v = lvu2;
            this.v = lvu;
        }
        hashMap.put(obj, lvu);
        return null;
    }

    @Override // defpackage.cWy
    public final Object v(Object obj) {
        Object v = super.v(obj);
        this.R.remove(obj);
        return v;
    }
}
