package defpackage;

import java.util.ArrayList;

/* renamed from: cXX  reason: default package */
/* loaded from: classes.dex */
public final class cXX {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public long f2131R;

    /* renamed from: R  reason: collision with other field name */
    public final Cfor[] f2132R;

    public cXX() {
        Cfor[] forArr = new Cfor[20];
        for (int i = 0; i < 20; i++) {
            forArr[i] = null;
        }
        this.f2132R = forArr;
        int i2 = aWo.R;
        this.f2131R = aWo.v;
    }

    public final long R() {
        aPt apt;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = this.R;
        Cfor r4 = this.f2132R[i];
        if (r4 == null) {
            apt = aPt.R;
        } else {
            int i2 = 0;
            Cfor r6 = r4;
            while (true) {
                Cfor r7 = this.f2132R[i];
                if (r7 != null) {
                    long j = r4.v;
                    long j2 = r7.v;
                    float f = (float) (j - j2);
                    float abs = (float) Math.abs(j2 - r6.v);
                    if (f > 100.0f || abs > 40.0f) {
                        break;
                    }
                    long j3 = r7.R;
                    arrayList.add(Float.valueOf(aWo.e(j3)));
                    arrayList2.add(Float.valueOf(aWo.X(j3)));
                    arrayList3.add(Float.valueOf(-f));
                    if (i == 0) {
                        i = 20;
                    }
                    i--;
                    i2++;
                    if (i2 >= 20) {
                        r6 = r7;
                        break;
                    }
                    r6 = r7;
                } else {
                    break;
                }
            }
            if (i2 >= 3) {
                try {
                    laH o = n1P.o(arrayList3, arrayList);
                    laH o2 = n1P.o(arrayList3, arrayList2);
                    float f2 = (float) 1000;
                    apt = new aPt(aH9.N(((Number) o.f5789R.get(1)).floatValue() * f2, ((Number) o2.f5789R.get(1)).floatValue() * f2), o.R * o2.R, r4.v - r6.v, aWo.O(r4.R, r6.R));
                } catch (IllegalArgumentException unused) {
                    apt = aPt.R;
                }
            } else {
                apt = new aPt(aWo.v, 1.0f, r4.v - r6.v, aWo.O(r4.R, r6.R));
            }
        }
        long j4 = apt.f868R;
        return dtx.X(aWo.e(j4), aWo.X(j4));
    }
}
