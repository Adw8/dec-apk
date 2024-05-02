package defpackage;

import java.util.Map;

/* renamed from: GO  reason: default package */
/* loaded from: classes.dex */
public abstract class GO {
    public static final /* synthetic */ int R = 0;

    static {
        Map map = lVA.R;
        int i = nqW.R;
        n1P.e(0.5f, 0.5f);
        int i2 = aWo.R;
        aH9.N(0.5f, 0.5f);
        int i3 = dU5.R;
        cU5.v(1, 1);
    }

    public static final SE R(Object obj, oHg ohg, jM jMVar, kg9 kg9, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        Object x = jQ.x(jr_, 1824613323, -3687241);
        f1A f1a = ppN.R;
        if (x == f1a) {
            x = new _6(obj, ohg, null);
            jr_.ZW(x);
        }
        jr_.g(false);
        _6 _6 = (_6) x;
        h0T s = l6.s(kg9, jr_);
        h0T s2 = l6.s(jMVar, jr_);
        jr_.w(-3687241);
        Object I = jr_.I();
        if (I == f1a) {
            I = jjU.R(-1, null, 6);
            jr_.ZW(I);
        }
        jr_.g(false);
        gn gnVar = (gn) I;
        caw.L(new gI(gnVar, obj), jr_);
        caw.e(gnVar, new pH(gnVar, _6, s2, s, null), jr_);
        SE se = _6.f680R;
        jr_.g(false);
        return se;
    }
}
