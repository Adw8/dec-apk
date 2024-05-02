package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bF9  reason: default package */
/* loaded from: classes.dex */
public interface bF9 {
    default int R(poS pos, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new dls((cxM) list.get(i2), or1.Min, nmM.Height));
        }
        return v(new jdO(pos, pos.f7272R.f3603R), arrayList, dtx.c(i, 0, 13)).c();
    }

    default int X(poS pos, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new dls((cxM) list.get(i2), or1.Min, nmM.Width));
        }
        return v(new jdO(pos, pos.f7272R.f3603R), arrayList, dtx.c(0, i, 7)).e();
    }

    default int c(poS pos, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new dls((cxM) list.get(i2), or1.Max, nmM.Width));
        }
        return v(new jdO(pos, pos.f7272R.f3603R), arrayList, dtx.c(0, i, 7)).e();
    }

    default int e(poS pos, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new dls((cxM) list.get(i2), or1.Max, nmM.Height));
        }
        return v(new jdO(pos, pos.f7272R.f3603R), arrayList, dtx.c(i, 0, 13)).c();
    }

    mET v(mZf mzf, List list, long j);
}
