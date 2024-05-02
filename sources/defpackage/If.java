package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: If  reason: default package */
/* loaded from: classes.dex */
public final class If implements bF9 {
    public static final If R = new If();

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return mzf.f(0, 0, iia.R, i0.R);
        } else if (size != 1) {
            ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList.add(((pc0) list.get(i3)).L(j));
            }
            int i4 = pdD.i(arrayList);
            if (i4 >= 0) {
                int i5 = 0;
                i = 0;
                while (true) {
                    l0f l0f = (l0f) arrayList.get(i2);
                    i5 = Math.max(i5, l0f.e);
                    i = Math.max(i, l0f.X);
                    if (i2 == i4) {
                        break;
                    }
                    i2++;
                }
                i2 = i5;
            } else {
                i = 0;
            }
            return mzf.f(i2, i, iia.R, new Cp(8, arrayList));
        } else {
            l0f L = ((pc0) list.get(0)).L(j);
            return mzf.f(L.e, L.X, iia.R, new kW9(L, 9));
        }
    }
}
