package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: hB  reason: default package */
/* loaded from: classes.dex */
public final class hB implements bF9 {
    public static final hB R = new hB();

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((pc0) list.get(i)).L(j));
        }
        Object obj2 = null;
        int i2 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i3 = ((l0f) obj).e;
            int i4 = pdD.i(arrayList);
            if (1 <= i4) {
                int i5 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i5);
                    int i6 = ((l0f) obj3).e;
                    if (i3 < i6) {
                        obj = obj3;
                        i3 = i6;
                    }
                    if (i5 == i4) {
                        break;
                    }
                    i5++;
                }
            }
        }
        l0f l0f = (l0f) obj;
        int x = l0f != null ? l0f.e : oys.x(j);
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i7 = ((l0f) obj2).X;
            int i8 = pdD.i(arrayList);
            if (1 <= i8) {
                while (true) {
                    Object obj4 = arrayList.get(i2);
                    int i9 = ((l0f) obj4).X;
                    if (i7 < i9) {
                        obj2 = obj4;
                        i7 = i9;
                    }
                    if (i2 == i8) {
                        break;
                    }
                    i2++;
                }
            }
        }
        l0f l0f2 = (l0f) obj2;
        return mzf.f(x, l0f2 != null ? l0f2.X : oys.m(j), iia.R, new Cp(7, arrayList));
    }
}
