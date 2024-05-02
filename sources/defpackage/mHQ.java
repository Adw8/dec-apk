package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: mHQ  reason: default package */
/* loaded from: classes.dex */
public abstract class mHQ extends jjU {
    public static final Map J(kSh... kshArr) {
        if (kshArr.length <= 0) {
            return iia.R;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(jjU.y(kshArr.length));
        for (kSh ksh : kshArr) {
            linkedHashMap.put(ksh.R, ksh.v);
        }
        return linkedHashMap;
    }

    public static final Object K(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static final Map Y(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return iia.R;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(jjU.y(arrayList.size()));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                kSh ksh = (kSh) it.next();
                linkedHashMap.put(ksh.R, ksh.v);
            }
            return linkedHashMap;
        }
        kSh ksh2 = (kSh) arrayList.get(0);
        return Collections.singletonMap(ksh2.R, ksh2.v);
    }

    public static final Map h(Map map) {
        int size = map.size();
        if (size == 0) {
            return iia.R;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
