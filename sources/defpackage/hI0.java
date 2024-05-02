package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: hI0  reason: default package */
/* loaded from: classes.dex */
public final class hI0 extends k8G implements bBk {
    public final /* synthetic */ Context R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ List f4206R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hI0(Context context, List list) {
        super(4);
        this.f4206R = list;
        this.R = context;
    }

    @Override // defpackage.bBk
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        bmu bmu = (bmu) obj;
        int intValue = ((Number) obj2).intValue();
        m88 m88 = (m88) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 14) == 0) {
            i = (((jr_) m88).O(bmu) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        int i2 = 32;
        if ((intValue2 & 112) == 0) {
            i |= ((jr_) m88).e(intValue) ? 32 : 16;
        }
        if ((i & 731) == 146) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        int i3 = i & 14;
        lzd lzd = (lzd) this.f4206R.get(intValue);
        if ((i3 & 112) == 0) {
            if (!((jr_) m88).O(lzd)) {
                i2 = 16;
            }
            i3 |= i2;
        }
        if ((i3 & 721) == 144) {
            jr_ jr_2 = (jr_) m88;
            if (jr_2.J()) {
                jr_2.E();
                return o8s.R;
            }
        }
        ncu mL = aH9.mL(dTl.i(adU.f942R, false, new _c(this.R, 17, lzd), 7), (float) 20);
        jr_ jr_3 = (jr_) m88;
        jr_3.w(733328855);
        bF9 e = PO.e(dq.R, false, m88);
        jr_3.w(-1323940314);
        jJj jjj = (jJj) jr_3.x(lnF.X);
        mdz mdz = (mdz) jr_3.x(lnF.H);
        bUo buo = (bUo) jr_3.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(mL);
        if (jr_3.f5052R instanceof Su) {
            jr_3.mL();
            if (jr_3.f5050L) {
                jr_3.H(fme);
            } else {
                jr_3.BF();
            }
            jr_3.f5078e = false;
            l6.p(m88, e, igT.c);
            l6.p(m88, jjj, igT.v);
            l6.p(m88, mdz, igT.e);
            l6.p(m88, buo, igT.X);
            jr_3.j();
            b.y(new k7Q(m88), m88, 0);
            jr_3.w(2058660585);
            jr_3.w(-2137368960);
            g1c.c(lzd.R, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 0, 0, 65534);
            jQ.K(jr_3, false, false, true, false);
            jr_3.g(false);
            return o8s.R;
        }
        l6.u();
        throw null;
    }
}
