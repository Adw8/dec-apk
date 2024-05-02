package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ml0  reason: default package */
/* loaded from: classes.dex */
public final class ml0 extends jy6 {
    public static final ml0 R = new ml0();

    public ml0() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        if (list.isEmpty()) {
            return mzf.f(oys.x(j), oys.m(j), iia.R, nqF.o);
        }
        if (list.size() == 1) {
            l0f L = ((pc0) list.get(0)).L(j);
            return mzf.f(dtx.x(j, L.e), dtx.m(j, L.X), iia.R, new kW9(L, 8));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((pc0) list.get(i)).L(j));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            l0f l0f = (l0f) arrayList.get(i4);
            i2 = Math.max(l0f.e, i2);
            i3 = Math.max(l0f.X, i3);
        }
        return mzf.f(dtx.x(j, i2), dtx.m(j, i3), iia.R, new Cp(6, arrayList));
    }
}
