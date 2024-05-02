package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: lsz  reason: default package */
/* loaded from: classes.dex */
public abstract class lsz extends hFt {
    public static final String[] R = {"android:visibility:visibility", "android:visibility:parent"};
    public int X = 3;

    public static nBJ k(oNy ony, oNy ony2) {
        nBJ nbj = new nBJ();
        nbj.f6339R = false;
        nbj.f6341v = false;
        if (ony == null || !ony.f6812R.containsKey("android:visibility:visibility")) {
            nbj.R = -1;
            nbj.f6338R = null;
        } else {
            nbj.R = ((Integer) ony.f6812R.get("android:visibility:visibility")).intValue();
            nbj.f6338R = (ViewGroup) ony.f6812R.get("android:visibility:parent");
        }
        if (ony2 == null || !ony2.f6812R.containsKey("android:visibility:visibility")) {
            nbj.v = -1;
            nbj.f6340v = null;
        } else {
            nbj.v = ((Integer) ony2.f6812R.get("android:visibility:visibility")).intValue();
            nbj.f6340v = (ViewGroup) ony2.f6812R.get("android:visibility:parent");
        }
        if (ony != null && ony2 != null) {
            int i = nbj.R;
            int i2 = nbj.v;
            if (i == i2 && nbj.f6338R == nbj.f6340v) {
                return nbj;
            }
            if (i != i2) {
                if (i == 0) {
                    nbj.f6341v = false;
                    nbj.f6339R = true;
                } else if (i2 == 0) {
                    nbj.f6341v = true;
                    nbj.f6339R = true;
                }
            } else if (nbj.f6340v == null) {
                nbj.f6341v = false;
                nbj.f6339R = true;
            } else if (nbj.f6338R == null) {
                nbj.f6341v = true;
                nbj.f6339R = true;
            }
        } else if (ony == null && nbj.v == 0) {
            nbj.f6341v = true;
            nbj.f6339R = true;
        } else if (ony2 == null && nbj.R == 0) {
            nbj.f6341v = false;
            nbj.f6339R = true;
        }
        return nbj;
    }

    public abstract Animator G(ViewGroup viewGroup, View view, oNy ony);

    @Override // defpackage.hFt
    public final void O(oNy ony) {
        r(ony);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (k(y(r4, false), V(r4, false)).f6339R != false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019b  */
    @Override // defpackage.hFt
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator P(android.view.ViewGroup r20, defpackage.oNy r21, defpackage.oNy r22) {
        /*
        // Method dump skipped, instructions count: 611
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lsz.P(android.view.ViewGroup, oNy, oNy):android.animation.Animator");
    }

    @Override // defpackage.hFt
    public final String[] i() {
        return R;
    }

    @Override // defpackage.hFt
    public void m(oNy ony) {
        r(ony);
    }

    @Override // defpackage.hFt
    public final boolean o(oNy ony, oNy ony2) {
        if (ony == null && ony2 == null) {
            return false;
        }
        if (ony != null && ony2 != null && ony2.f6812R.containsKey("android:visibility:visibility") != ony.f6812R.containsKey("android:visibility:visibility")) {
            return false;
        }
        nBJ k = k(ony, ony2);
        if (k.f6339R) {
            return k.R == 0 || k.v == 0;
        }
        return false;
    }

    public abstract Animator p(ViewGroup viewGroup, View view, oNy ony);

    public final void r(oNy ony) {
        ony.f6812R.put("android:visibility:visibility", Integer.valueOf(ony.R.getVisibility()));
        ony.f6812R.put("android:visibility:parent", ony.R.getParent());
        int[] iArr = new int[2];
        ony.R.getLocationOnScreen(iArr);
        ony.f6812R.put("android:visibility:screenLocation", iArr);
    }
}
