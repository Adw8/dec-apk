package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ets  reason: default package */
/* loaded from: classes.dex */
public class ets extends hFt {
    public int X;
    public ArrayList Z = new ArrayList();
    public boolean c = true;
    public boolean e = false;
    public int O = 0;

    @Override // defpackage.hFt
    public final void A(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList arrayList = this.Z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((hFt) this.Z.get(i)).A(timeInterpolator);
            }
        }
        ((hFt) this).f4174R = timeInterpolator;
    }

    @Override // defpackage.hFt
    public final void I(View view) {
        for (int i = 0; i < this.Z.size(); i++) {
            ((hFt) this.Z.get(i)).I(view);
        }
        ((hFt) this).f4185v.remove(view);
    }

    @Override // defpackage.hFt
    /* renamed from: N */
    public final hFt clone() {
        ets ets = (ets) super.clone();
        ets.Z = new ArrayList();
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            hFt N = ((hFt) this.Z.get(i)).clone();
            ets.Z.add(N);
            N.f4175R = ets;
        }
        return ets;
    }

    @Override // defpackage.hFt
    public final void O(oNy ony) {
        if (K(ony.R)) {
            Iterator it = this.Z.iterator();
            while (it.hasNext()) {
                hFt hft = (hFt) it.next();
                if (hft.K(ony.R)) {
                    hft.O(ony);
                    ony.f6811R.add(hft);
                }
            }
        }
    }

    @Override // defpackage.hFt
    public final void Q(n1P n1p) {
        ((hFt) this).f4178R = n1p;
        this.O |= 8;
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            ((hFt) this.Z.get(i)).Q(n1p);
        }
    }

    @Override // defpackage.hFt
    public final void S(n2G n2g) {
        super.S(n2g);
        this.O |= 4;
        if (this.Z != null) {
            for (int i = 0; i < this.Z.size(); i++) {
                ((hFt) this.Z.get(i)).S(n2g);
            }
        }
    }

    @Override // defpackage.hFt
    public final String T(String str) {
        String T = super.T(str);
        for (int i = 0; i < this.Z.size(); i++) {
            StringBuilder t = jQ.t(T, "\n");
            t.append(((hFt) this.Z.get(i)).T(str + "  "));
            T = t.toString();
        }
        return T;
    }

    @Override // defpackage.hFt
    public final void W(long j) {
        ((hFt) this).f4173R = j;
    }

    @Override // defpackage.hFt
    public final void Y(View view) {
        super.Y(view);
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            ((hFt) this.Z.get(i)).Y(view);
        }
    }

    @Override // defpackage.hFt
    public final void Z(oNy ony) {
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            ((hFt) this.Z.get(i)).Z(ony);
        }
    }

    @Override // defpackage.hFt
    public final void cancel() {
        super.cancel();
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            ((hFt) this.Z.get(i)).cancel();
        }
    }

    @Override // defpackage.hFt
    public final void d() {
        this.O |= 2;
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            ((hFt) this.Z.get(i)).d();
        }
    }

    @Override // defpackage.hFt
    public final void e(View view) {
        for (int i = 0; i < this.Z.size(); i++) {
            ((hFt) this.Z.get(i)).e(view);
        }
        ((hFt) this).f4185v.add(view);
    }

    @Override // defpackage.hFt
    public final void h(lpP lpp) {
        super.h(lpp);
    }

    @Override // defpackage.hFt
    public final void j(ViewGroup viewGroup, piu piu, piu piu2, ArrayList arrayList, ArrayList arrayList2) {
        long j = ((hFt) this).f4173R;
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            hFt hft = (hFt) this.Z.get(i);
            if (j > 0 && (this.c || i == 0)) {
                long j2 = hft.f4173R;
                if (j2 > 0) {
                    hft.W(j2 + j);
                } else {
                    hft.W(j);
                }
            }
            hft.j(viewGroup, piu, piu2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.hFt
    public final void m(oNy ony) {
        if (K(ony.R)) {
            Iterator it = this.Z.iterator();
            while (it.hasNext()) {
                hFt hft = (hFt) it.next();
                if (hft.K(ony.R)) {
                    hft.m(ony);
                    ony.f6811R.add(hft);
                }
            }
        }
    }

    @Override // defpackage.hFt
    public final void n(long j) {
        ArrayList arrayList;
        ((hFt) this).f4184v = j;
        if (j >= 0 && (arrayList = this.Z) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((hFt) this.Z.get(i)).n(j);
            }
        }
    }

    public final void r(hFt hft) {
        this.Z.add(hft);
        hft.f4175R = this;
        long j = ((hFt) this).f4184v;
        if (j >= 0) {
            hft.n(j);
        }
        if ((this.O & 1) != 0) {
            hft.A(((hFt) this).f4174R);
        }
        if ((this.O & 2) != 0) {
            hft.d();
        }
        if ((this.O & 4) != 0) {
            hft.S(((hFt) this).f4179R);
        }
        if ((this.O & 8) != 0) {
            hft.Q(((hFt) this).f4178R);
        }
    }

    @Override // defpackage.hFt
    public final void u(ViewGroup viewGroup) {
        super.u(viewGroup);
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            ((hFt) this.Z.get(i)).u(viewGroup);
        }
    }

    @Override // defpackage.hFt
    public final void v(lpP lpp) {
        super.v(lpp);
    }

    @Override // defpackage.hFt
    public final void z() {
        if (this.Z.isEmpty()) {
            s();
            g();
            return;
        }
        hhN hhn = new hhN(this);
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ((hFt) it.next()).v(hhn);
        }
        this.X = this.Z.size();
        if (!this.c) {
            for (int i = 1; i < this.Z.size(); i++) {
                ((hFt) this.Z.get(i - 1)).v(new jhx(this, 2, (hFt) this.Z.get(i)));
            }
            hFt hft = (hFt) this.Z.get(0);
            if (hft != null) {
                hft.z();
                return;
            }
            return;
        }
        Iterator it2 = this.Z.iterator();
        while (it2.hasNext()) {
            ((hFt) it2.next()).z();
        }
    }
}
