package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: mGd  reason: default package */
/* loaded from: classes.dex */
public final class mGd implements jXh {
    public final hvS R;

    public mGd(hvS hvs) {
        this.R = hvs;
    }

    /* renamed from: L */
    public final cmU c(oHg ohg) {
        LinkedHashMap linkedHashMap = this.R.f4417R;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(jjU.y(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            bvP bvp = (bvP) entry.getValue();
            linkedHashMap2.put(key, new kSh(ohg.R.x(bvp.R), bvp.f1858R));
        }
        return new cmU(linkedHashMap2, this.R.R);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mGd) && n3x.v(this.R, ((mGd) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }
}
