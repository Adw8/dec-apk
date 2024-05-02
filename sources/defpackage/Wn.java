package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: Wn  reason: default package */
/* loaded from: classes.dex */
public final class Wn extends k8G implements kg9 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Wn(Object obj, int i, Object obj2) {
        super(1);
        this.X = i;
        this.R = obj;
        this.v = obj2;
    }

    public final void R(Throwable th) {
        switch (this.X) {
            case 2:
                ((f_c) this.R).g();
                return;
            case 3:
            case 4:
            default:
                ((hgO) this.R).c(this.v);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ((hBL) this.R).R.removeCallbacks((Runnable) this.v);
                return;
            case 6:
                ((hgO) this.R).c(((fGd) ((lAz) this.v)).f3367R);
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        boolean z;
        boolean z2 = false;
        switch (this.X) {
            case 0:
                dlc dlc = (dlc) obj;
                ((bkb) this.R).setPositionProvider((fDb) this.v);
                ((bkb) this.R).N();
                return new k7S(4);
            case 1:
                pwv pwv = (pwv) obj;
                i5D i5d = i5D.Y;
                VO vo = new VO();
                i5d.x(vo);
                lN9 ln9 = pwv.f7324R;
                ln9.R = vo.R;
                ln9.v = vo.v;
                ln9.c = -1;
                ln9.e = -1;
                e9E e9e = (e9E) this.R;
                if (e9e instanceof f25) {
                    int i = e9E.X;
                    pvc l = a6.l(e9e, i5D.z);
                    mpr mpr = (mpr) this.v;
                    Iterator it = l.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            e9E e9e2 = (e9E) it.next();
                            e9E O = mpr.O();
                            if (n3x.v(e9e2, O != null ? O.f2984R : null)) {
                                z = false;
                            }
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (z2) {
                    int i2 = f25.L;
                    int i3 = n2G.m(((mpr) this.v).Z()).e;
                    i5D i5d2 = i5D.h;
                    pwv.R = i3;
                    oRR orr = new oRR();
                    i5d2.x(orr);
                    pwv.v = orr.R;
                }
                return o8s.R;
            case 2:
                R((Throwable) obj);
                return o8s.R;
            case 3:
                List list = (List) this.R;
                ((mJR) obj).R(list.size(), null, new iCm(g5M.j, list, 0), aH9.u(new hI0((Context) this.v, list), true, -632812321));
                return o8s.R;
            case 4:
                String str = (String) obj;
                pby[] pbyArr = kxm.R;
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                R((Throwable) obj);
                return o8s.R;
            case 6:
                R((Throwable) obj);
                return o8s.R;
            default:
                R((Throwable) obj);
                return o8s.R;
        }
    }
}
