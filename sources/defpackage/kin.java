package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kin  reason: default package */
/* loaded from: classes.dex */
public final class kin {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final cXA f5396R;

    /* renamed from: R  reason: collision with other field name */
    public final kM3 f5397R;

    /* renamed from: R  reason: collision with other field name */
    public final m9D f5398R;

    public kin(long j, boolean z, m9D m9d, cXA cxa, kM3 km3) {
        this.f5398R = m9d;
        this.f5396R = cxa;
        this.f5397R = km3;
        this.R = dtx.c(z ? oys.Z(j) : Integer.MAX_VALUE, !z ? oys.L(j) : Integer.MAX_VALUE, 5);
    }

    public final iTT R(int i) {
        ArrayList arrayList;
        Object v = this.f5398R.v(i);
        cXA cxa = this.f5396R;
        long j = this.R;
        List list = (List) cxa.f2128R.get(Integer.valueOf(i));
        if (list != null) {
            arrayList = list;
        } else {
            Object v2 = ((cRR) cxa.f2127R.R.g()).v(i);
            List R = cxa.R.R(v2, cxa.f2127R.R(i, v2));
            int size = R.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(((pc0) R.get(i2)).L(j));
            }
            cxa.f2128R.put(Integer.valueOf(i), arrayList2);
            arrayList = arrayList2;
        }
        kM3 km3 = this.f5397R;
        return new iTT(i, arrayList, km3.f5273R, km3.f5272R, km3.f5270R, km3.f5269R.R.f1948R, km3.f5274v, km3.c, km3.e, km3.f5271R, i == km3.R + -1 ? 0 : km3.v, km3.f5268R, v);
    }
}
