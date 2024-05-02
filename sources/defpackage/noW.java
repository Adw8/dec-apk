package defpackage;

import android.graphics.Typeface;
import java.util.List;

/* renamed from: noW  reason: default package */
/* loaded from: classes.dex */
public final class noW extends k8G implements bBk {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ noW(int i, Object obj) {
        super(4);
        this.X = i;
        this.R = obj;
    }

    @Override // defpackage.bBk
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = 32;
        int i4 = 4;
        switch (this.X) {
            case 0:
                ipI ipi = (ipI) obj;
                int intValue = ((Number) obj2).intValue();
                m88 m88 = (m88) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 14) == 0) {
                    if (!((jr_) m88).O(ipi)) {
                        i4 = 2;
                    }
                    i2 = i4 | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 112) == 0) {
                    if (!((jr_) m88).e(intValue)) {
                        i3 = 16;
                    }
                    i2 |= i3;
                }
                if ((i2 & 731) == 146) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return o8s.R;
                    }
                }
                ipi.R.m((bmu) this.R, Integer.valueOf(intValue), m88, Integer.valueOf(i2 & 112));
                return o8s.R;
            case 1:
                ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                m88 m882 = (m88) obj3;
                if ((((Number) obj4).intValue() & 11) == 2) {
                    jr_ jr_2 = (jr_) m882;
                    if (jr_2.J()) {
                        jr_2.E();
                        return o8s.R;
                    }
                }
                gQc.L(((nUO) this.R).f6414R, null, m882, 0, 2);
                return o8s.R;
            case 2:
                bJ8 bj8 = new bJ8(((bYd) ((aA) this.R).f769R).v((deI) obj, (lIe) obj2, ((ned) obj3).R, ((hqI) obj4).R));
                ((aA) this.R).f771R.add(bj8);
                return (Typeface) bj8.f1588R;
            default:
                bmu bmu = (bmu) obj;
                int intValue3 = ((Number) obj2).intValue();
                m88 m883 = (m88) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 14) == 0) {
                    if (!((jr_) m883).O(bmu)) {
                        i4 = 2;
                    }
                    i = i4 | intValue4;
                } else {
                    i = intValue4;
                }
                if ((intValue4 & 112) == 0) {
                    i |= ((jr_) m883).e(intValue3) ? 32 : 16;
                }
                if ((i & 731) == 146) {
                    jr_ jr_3 = (jr_) m883;
                    if (jr_3.J()) {
                        jr_3.E();
                        return o8s.R;
                    }
                }
                int i5 = i & 14;
                String str = (String) ((List) this.R).get(intValue3);
                if ((i5 & 112) == 0) {
                    if (!((jr_) m883).O(str)) {
                        i3 = 16;
                    }
                    i5 |= i3;
                }
                if ((i5 & 721) == 144) {
                    jr_ jr_4 = (jr_) m883;
                    if (jr_4.J()) {
                        jr_4.E();
                        return o8s.R;
                    }
                }
                g1c.c(str, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m883, (i5 >> 3) & 14, 0, 65534);
                return o8s.R;
        }
    }
}
