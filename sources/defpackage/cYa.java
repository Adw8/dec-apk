package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: cYa  reason: default package */
/* loaded from: classes.dex */
public abstract class cYa extends dTl {
    public static final Set E(Set set, Set set2) {
        Collection<?> t = l6.t(set2, set);
        if (t.isEmpty()) {
            return dF.wm(set);
        }
        if (t instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!t.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(t);
        return linkedHashSet2;
    }

    public static final LinkedHashSet M(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(jjU.y(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && n3x.v(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }
}
