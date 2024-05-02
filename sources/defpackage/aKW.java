package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aKW  reason: default package */
/* loaded from: classes.dex */
public final class aKW {
    public final ArrayList R;

    public aKW(b9g... b9gArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (b9g b9g : b9gArr) {
            String v = b9g.v();
            Object obj = linkedHashMap.get(v);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(v, obj);
            }
            ((List) obj).add(b9g);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1 ? false : true) {
                s3.E(list, arrayList);
            } else {
                throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + dF.X4(list, null, null, null, null, 63) + ']').toString());
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.R = arrayList2;
        int size = arrayList2.size();
        while (i < size && !((b9g) arrayList2.get(i)).c()) {
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aKW) && n3x.v(this.R, ((aKW) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }
}
