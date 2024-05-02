package defpackage;

import java.util.ArrayList;

/* renamed from: g4  reason: default package */
/* loaded from: classes.dex */
public final class g4 implements bF9 {
    public final /* synthetic */ float R;
    public final /* synthetic */ float v;

    public g4(float f, float f2) {
        this.R = f;
        this.v = f2;
    }

    public static final void O(ArrayList arrayList, blo blo, mZf mzf, float f, ArrayList arrayList2, ArrayList arrayList3, blo blo2, ArrayList arrayList4, blo blo3, blo blo4) {
        if (!arrayList.isEmpty()) {
            blo.e = mzf.B(f) + blo.e;
        }
        arrayList.add(dF.pG(arrayList2));
        arrayList3.add(Integer.valueOf(blo2.e));
        arrayList4.add(Integer.valueOf(blo.e));
        blo.e += blo2.e;
        blo3.e = Math.max(blo3.e, blo4.e);
        arrayList2.clear();
        blo4.e = 0;
        blo2.e = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2 A[SYNTHETIC] */
    @Override // defpackage.bF9
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.mET v(defpackage.mZf r23, java.util.List r24, long r25) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4.v(mZf, java.util.List, long):mET");
    }
}
