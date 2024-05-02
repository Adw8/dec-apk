package defpackage;

import java.util.LinkedHashMap;

/* renamed from: n67  reason: default package */
/* loaded from: classes.dex */
public final class n67 {
    public final j5I R;

    /* renamed from: R  reason: collision with other field name */
    public lGT f6303R;

    /* renamed from: R  reason: collision with other field name */
    public final mf7 f6304R = new mf7(this, 2);
    public final mf7 v = new mf7(this, 0);
    public final mf7 c = new mf7(this, 1);

    public n67(j5I j5i) {
        this.R = j5i;
    }

    public final lGT R() {
        lGT lgt = this.f6303R;
        if (lgt != null) {
            return lgt;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final pcj v(Object obj, iv7 iv7) {
        lGT R = R();
        R.v();
        if (!R.f5643v.containsKey(obj)) {
            LinkedHashMap linkedHashMap = R.f5642c;
            Object obj2 = linkedHashMap.get(obj);
            if (obj2 == null) {
                obj2 = R.e(obj);
                if (obj2 != null) {
                    int indexOf = R.f5637R.U().indexOf(obj2);
                    int size = R.f5637R.U().size();
                    fue fue = R.f5637R;
                    fue.c = true;
                    fue.u(indexOf, size, 1);
                    fue.c = false;
                    R.c++;
                } else {
                    int size2 = R.f5637R.U().size();
                    fue fue2 = new fue(2, true, 0);
                    fue fue3 = R.f5637R;
                    fue3.c = true;
                    fue3.y(size2, fue2);
                    fue3.c = false;
                    R.c++;
                    obj2 = fue2;
                }
                linkedHashMap.put(obj, obj2);
            }
            R.c((fue) obj2, obj, iv7);
        }
        return new pcj(R, obj);
    }
}
