package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: c2J  reason: default package */
/* loaded from: classes.dex */
public final class c2J implements mZf {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lGT f1947R;

    /* renamed from: R  reason: collision with other field name */
    public mdz f1948R = mdz.Rtl;
    public float v;

    public c2J(lGT lgt) {
        this.f1947R = lgt;
    }

    @Override // defpackage.jJj
    public final float D() {
        return this.R;
    }

    public final List R(Object obj, iv7 iv7) {
        lGT lgt = this.f1947R;
        lgt.v();
        int i = lgt.f5637R.f3606R.R;
        if (i == 1 || i == 3) {
            LinkedHashMap linkedHashMap = lgt.f5643v;
            Object obj2 = linkedHashMap.get(obj);
            if (obj2 == null) {
                obj2 = (fue) lgt.f5642c.remove(obj);
                if (obj2 != null) {
                    int i2 = lgt.c;
                    if (i2 > 0) {
                        lgt.c = i2 - 1;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    obj2 = lgt.e(obj);
                    if (obj2 == null) {
                        int i3 = lgt.R;
                        fue fue = new fue(2, true, 0);
                        fue fue2 = lgt.f5637R;
                        fue2.c = true;
                        fue2.y(i3, fue);
                        fue2.c = false;
                        obj2 = fue;
                    }
                }
                linkedHashMap.put(obj, obj2);
            }
            fue fue3 = (fue) obj2;
            int indexOf = lgt.f5637R.U().indexOf(fue3);
            int i4 = lgt.R;
            if (indexOf >= i4) {
                if (i4 != indexOf) {
                    fue fue4 = lgt.f5637R;
                    fue4.c = true;
                    fue4.u(indexOf, i4, 1);
                    fue4.c = false;
                }
                lgt.R++;
                lgt.c(fue3, obj, iv7);
                return fue3.x();
            }
            throw new IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        }
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
    }

    @Override // defpackage.mZf
    public final mdz getLayoutDirection() {
        return this.f1948R;
    }

    @Override // defpackage.jJj
    public final float vr() {
        return this.v;
    }
}
