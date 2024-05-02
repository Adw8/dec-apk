package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends od5 {
    @Override // defpackage.od5
    public final g2m R(ArrayList arrayList) {
        pve pve = new pve(1);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((g2m) it.next()).f3659R));
        }
        pve.v(hashMap);
        g2m g2m = new g2m(pve.R);
        g2m.v(g2m);
        return g2m;
    }
}
