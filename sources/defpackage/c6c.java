package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: c6c  reason: default package */
/* loaded from: classes.dex */
public final class c6c implements bF9 {
    public static final c6c R = new c6c();

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((pc0) list.get(i)).L(j));
        }
        return mzf.f(oys.Z(j), oys.L(j), iia.R, new Cp(1, arrayList));
    }
}
