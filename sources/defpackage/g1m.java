package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: g1m  reason: default package */
/* loaded from: classes.dex */
public final class g1m implements cRR {
    public final bBk R;

    /* renamed from: R  reason: collision with other field name */
    public final gHS f3651R;

    /* renamed from: R  reason: collision with other field name */
    public final Map f3652R;

    public g1m(gLn gln, dNH dnh, heu heu) {
        Map map;
        this.R = dnh;
        this.f3651R = gln;
        int i = heu.e;
        boolean z = false;
        if (i >= 0) {
            int min = Math.min(heu.X, gln.R - 1);
            if (min < i) {
                map = iia.R;
            } else {
                HashMap hashMap = new HashMap();
                aOi aoi = new aOi(i, min, hashMap);
                gln.R(i);
                gln.R(min);
                if (min >= i ? true : z) {
                    int x = msU.x(i, gln.f3730R);
                    int i2 = ((jt1) gln.f3730R.f1772R[x]).R;
                    while (i2 <= min) {
                        jt1 jt1 = (jt1) gln.f3730R.f1772R[x];
                        aoi.x(jt1);
                        i2 += jt1.v;
                        x++;
                    }
                    map = hashMap;
                } else {
                    throw new IllegalArgumentException(("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ')').toString());
                }
            }
            this.f3652R = map;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // defpackage.cRR
    public final int L() {
        return ((gLn) this.f3651R).R;
    }

    @Override // defpackage.cRR
    public final Map O() {
        return this.f3652R;
    }

    @Override // defpackage.cRR
    public final Object R(int i) {
        jt1 v = ((gLn) this.f3651R).v(i);
        return ((ipI) v.f5095R).v.x(Integer.valueOf(i - v.R));
    }

    @Override // defpackage.cRR
    public final void X(int i, m88 m88, int i2) {
        int i3;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1877726744);
        if ((i2 & 14) == 0) {
            i3 = (jr_.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= jr_.O(this) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !jr_.J()) {
            jt1 v = ((gLn) this.f3651R).v(i);
            this.R.m((ipI) v.f5095R, Integer.valueOf(i - v.R), jr_, 0);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new fbD(this, i, i2, 2);
        }
    }

    @Override // defpackage.cRR
    public final Object v(int i) {
        Object x;
        jt1 v = ((gLn) this.f3651R).v(i);
        int i2 = i - v.R;
        kg9 kg9 = ((ipI) v.f5095R).f4737R;
        return (kg9 == null || (x = kg9.x(Integer.valueOf(i2))) == null) ? new crL(i) : x;
    }
}
