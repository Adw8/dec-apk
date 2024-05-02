package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: p3  reason: default package */
/* loaded from: classes.dex */
public final class p3 {
    public final LinkedHashSet R = new LinkedHashSet();

    /* renamed from: R  reason: collision with other field name */
    public final kEW f7059R;

    public p3(oIb oib, Map map) {
        this.f7059R = oib.f6738R;
        List X = oib.X(false);
        int size = X.size();
        for (int i = 0; i < size; i++) {
            oIb oib2 = (oIb) X.get(i);
            if (map.containsKey(Integer.valueOf(oib2.R))) {
                this.R.add(Integer.valueOf(oib2.R));
            }
        }
    }
}
