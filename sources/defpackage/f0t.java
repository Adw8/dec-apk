package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: f0t  reason: default package */
/* loaded from: classes.dex */
public class f0t extends oE_ {
    @Override // defpackage.oE_
    public final void C(View view, Object obj) {
        if (view != null) {
            oE_.L(view, new Rect());
            ((hFt) obj).Q(new oXK());
        }
    }

    @Override // defpackage.oE_
    public final void H(Object obj, View view, ArrayList arrayList) {
        ((hFt) obj).v(new gdy(view, arrayList));
    }

    @Override // defpackage.oE_
    public final void N(Object obj, Rect rect) {
        ((hFt) obj).Q(new oXK());
    }

    @Override // defpackage.oE_
    public final Object O(Object obj) {
        if (obj != null) {
            return ((hFt) obj).clone();
        }
        return null;
    }

    @Override // defpackage.oE_
    public final void P(Object obj, a3 a3Var, dX dXVar) {
        hFt hft = (hFt) obj;
        a3Var.R(new h5(this, hft, 16));
        hft.v(new oah(dXVar));
    }

    @Override // defpackage.oE_
    public final void R(View view, Object obj) {
        ((hFt) obj).e(view);
    }

    @Override // defpackage.oE_
    public final void U(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((hFt) obj).v(new kjs(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.oE_
    public final boolean X(Object obj) {
        return obj instanceof hFt;
    }

    @Override // defpackage.oE_
    public final void c(ViewGroup viewGroup, Object obj) {
        pnB.R(viewGroup, (hFt) obj);
    }

    @Override // defpackage.oE_
    public final void g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        ets ets = (ets) obj;
        if (ets != null) {
            ((hFt) ets).f4185v.clear();
            ((hFt) ets).f4185v.addAll(arrayList2);
            t(ets, arrayList, arrayList2);
        }
    }

    @Override // defpackage.oE_
    public final void j(Object obj, View view, ArrayList arrayList) {
        ets ets = (ets) obj;
        ArrayList arrayList2 = ((hFt) ets).f4185v;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oE_.e((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        v(ets, arrayList);
    }

    @Override // defpackage.oE_
    public final Object m(Object obj, Object obj2, Object obj3) {
        hFt hft = (hFt) obj;
        hFt hft2 = (hFt) obj2;
        hFt hft3 = (hFt) obj3;
        if (hft != null && hft2 != null) {
            ets ets = new ets();
            ets.r(hft);
            ets.r(hft2);
            ets.c = false;
            hft = ets;
        } else if (hft == null) {
            hft = hft2 != null ? hft2 : null;
        }
        if (hft3 == null) {
            return hft;
        }
        ets ets2 = new ets();
        if (hft != null) {
            ets2.r(hft);
        }
        ets2.r(hft3);
        return ets2;
    }

    public final void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        hFt hft = (hFt) obj;
        int i = 0;
        if (hft instanceof ets) {
            ets ets = (ets) hft;
            int size = ets.Z.size();
            while (i < size) {
                t((i < 0 || i >= ets.Z.size()) ? null : (hFt) ets.Z.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (!(!oE_.Z(hft.f4177R) || !oE_.Z(null) || !oE_.Z(null))) {
            ArrayList arrayList3 = hft.f4185v;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    hft.e((View) arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        hft.I((View) arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.oE_
    public final void v(Object obj, ArrayList arrayList) {
        hFt hft = (hFt) obj;
        if (hft != null) {
            int i = 0;
            if (hft instanceof ets) {
                ets ets = (ets) hft;
                int size = ets.Z.size();
                while (i < size) {
                    v((i < 0 || i >= ets.Z.size()) ? null : (hFt) ets.Z.get(i), arrayList);
                    i++;
                }
                return;
            }
            if (!(!oE_.Z(hft.f4177R) || !oE_.Z(null) || !oE_.Z(null)) && oE_.Z(hft.f4185v)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    hft.e((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // defpackage.oE_
    public final Object x(Object obj, Object obj2) {
        ets ets = new ets();
        if (obj != null) {
            ets.r((hFt) obj);
        }
        ets.r((hFt) obj2);
        return ets;
    }

    @Override // defpackage.oE_
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        ets ets = new ets();
        ets.r((hFt) obj);
        return ets;
    }
}
