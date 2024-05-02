package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: mMG  reason: default package */
/* loaded from: classes.dex */
public final class mMG implements e9w {
    public final LinkedHashMap R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f6013R;
    public final LinkedHashMap v;

    public mMG(Map map, kg9 kg9) {
        this.f6013R = kg9;
        this.R = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
        this.v = new LinkedHashMap();
    }

    @Override // defpackage.e9w
    public final dVs R(String str, f_c f_c) {
        if (!iH_.r(str)) {
            LinkedHashMap linkedHashMap = this.v;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(f_c);
            return new dVs(this, str, f_c);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }

    @Override // defpackage.e9w
    public final Object X(String str) {
        List list = (List) this.R.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            this.R.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // defpackage.e9w
    public final Map c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.R);
        for (Map.Entry entry : this.v.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object g = ((f_c) list.get(0)).g();
                if (g == null) {
                    continue;
                } else if (v(g)) {
                    linkedHashMap.put(str, pdD.U(g));
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object g2 = ((f_c) list.get(i)).g();
                    if (g2 == null || v(g2)) {
                        arrayList.add(g2);
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                linkedHashMap.put(str, arrayList);
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.e9w
    public final boolean v(Object obj) {
        return ((Boolean) this.f6013R.x(obj)).booleanValue();
    }
}
