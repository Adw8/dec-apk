package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: h2U  reason: default package */
/* loaded from: classes.dex */
public final class h2U implements bF9 {
    public static final h2U R = new h2U();

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        for (int i = 0; i < size; i++) {
            arrayList.add(((pc0) list.get(i)).L(j));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i2 = 0; i2 < size2; i2++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((l0f) arrayList.get(i2)).e));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((l0f) arrayList.get(i3)).X));
        }
        return mzf.f(intValue, num.intValue(), iia.R, new Cp(3, arrayList));
    }
}
