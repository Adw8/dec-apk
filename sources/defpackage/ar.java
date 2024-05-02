package defpackage;

import android.os.Bundle;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: ar  reason: default package */
/* loaded from: classes.dex */
public final class ar extends k8G implements kg9 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ar(oJx ojx, mpr mpr, e9E e9e, Bundle bundle) {
        super(1);
        this.X = 5;
        this.e = ojx;
        this.c = mpr;
        this.R = e9e;
        this.v = bundle;
    }

    public final nRn R() {
        String str;
        switch (this.X) {
            case 2:
                if (((kef) this.c) != null && ((kY5) this.R).v()) {
                    kY5 ky5 = (kY5) this.R;
                    ky5.f5340R = f1A.X((kef) this.c, (d5M) this.v, ky5.f5336R, (djV) this.e, ky5.f5335R, ky5.v);
                }
                return new k7S(1);
            case 3:
                gv2 gv2 = (gv2) this.c;
                gv2.f3979R.addView(gv2, gv2.f3978R);
                ((gv2) this.c).m((f_c) this.R, (mdz) this.e);
                return new acE(4, (gv2) this.c);
            default:
                e9w e9w = (e9w) this.c;
                aIN ain = new aIN((dH9) this.v, (dH9) this.e, e9w);
                Object g = ain.g();
                if (g == null || e9w.v(g)) {
                    return new iGv(((e9w) this.c).R((String) this.R, ain));
                }
                if (g instanceof i4H) {
                    i4H i4h = (i4H) g;
                    dqr dqr = i4h.R;
                    if (dqr == d6b.R || dqr == bHa.R || dqr == bYG.R) {
                        StringBuilder U = opT.U("MutableState containing ");
                        U.append(i4h.getValue());
                        U.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().");
                        str = U.toString();
                    } else {
                        str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                    }
                } else {
                    str = g + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
                }
                throw new IllegalArgumentException(str);
        }
    }

    public final void v(long j) {
        switch (this.X) {
            case 6:
                l6.z((jy_) this.c, null, 0, new nyq((nhg) this.e, ago.Z((ck3) this.R, (mBH) this.v, j), null), 3);
                return;
            default:
                ((nWW) this.c).R = l6.z((jy_) this.R, null, 0, new erC((TerminalViewModel) this.v, (nhg) this.e, null), 3);
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                Hd hd = (Hd) obj;
                o02.i(hd, ((_6) this.c).f680R);
                Object v = ((_6) this.c).v(hd.v());
                if (!n3x.v(v, hd.v())) {
                    ((_6) this.c).f680R.f508R.R(v);
                    ((SE) this.R).f508R.R(v);
                    kg9 kg9 = (kg9) this.v;
                    if (kg9 != null) {
                        kg9.x((_6) this.c);
                    }
                    hd.R();
                    ((oJx) this.e).R = true;
                } else {
                    kg9 kg92 = (kg9) this.v;
                    if (kg92 != null) {
                        kg92.x((_6) this.c);
                    }
                }
                return o8s.R;
            case 1:
                o02.N((Hd) ((nWW) this.c).R, ((Number) obj).longValue(), (px) this.e, (SE) this.R, (kg9) this.v);
                return o8s.R;
            case 2:
                dlc dlc = (dlc) obj;
                return R();
            case 3:
                dlc dlc2 = (dlc) obj;
                return R();
            case 4:
                dlc dlc3 = (dlc) obj;
                return R();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ((oJx) this.e).R = true;
                ((mpr) this.c).R((e9E) this.R, (Bundle) this.v, (j5B) obj, fcD.R);
                return o8s.R;
            case 6:
                v(((aWo) obj).f906R);
                return o8s.R;
            default:
                v(((aWo) obj).f906R);
                return o8s.R;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ar(nWW nww, px pxVar, SE se, kg9 kg9) {
        super(1);
        this.X = 1;
        this.c = nww;
        this.e = pxVar;
        this.R = se;
        this.v = kg9;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.X = i;
        this.c = obj;
        this.R = obj2;
        this.v = obj3;
        this.e = obj4;
    }
}
