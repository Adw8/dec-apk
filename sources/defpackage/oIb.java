package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: oIb  reason: default package */
/* loaded from: classes.dex */
public final class oIb {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final fue f6736R;

    /* renamed from: R  reason: collision with other field name */
    public final hUv f6737R;

    /* renamed from: R  reason: collision with other field name */
    public final kEW f6738R;

    /* renamed from: R  reason: collision with other field name */
    public oIb f6739R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6740R;
    public boolean v;

    public oIb(hUv huv, boolean z, fue fue) {
        this.f6737R = huv;
        this.f6740R = z;
        this.f6736R = fue;
        this.f6738R = msU.h(huv);
        this.R = fue.e;
    }

    public static List c(oIb oib, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        oib.getClass();
        List x = oib.x(z, false);
        int size = x.size();
        for (int i2 = 0; i2 < size; i2++) {
            oIb oib2 = (oIb) x.get(i2);
            if (oib2.Z()) {
                list.add(oib2);
            } else if (!oib2.f6738R.v) {
                c(oib2, list, false, 2);
            }
        }
        return list;
    }

    public final oIb L() {
        oIb oib = this.f6739R;
        if (oib != null) {
            return oib;
        }
        fue t = this.f6740R ? aH9.t(this.f6736R, lBz.h) : null;
        if (t == null) {
            t = aH9.t(this.f6736R, lBz.I);
        }
        hUv l = t != null ? aH9.l(t) : null;
        if (l == null) {
            return null;
        }
        return new oIb(l, this.f6740R);
    }

    public final kEW O() {
        if (!Z()) {
            return this.f6738R;
        }
        kEW kew = this.f6738R;
        kew.getClass();
        kEW kew2 = new kEW();
        kew2.f5221R = kew.f5221R;
        kew2.v = kew.v;
        kew2.R.putAll(kew.R);
        m(kew2);
        return kew2;
    }

    public final oIb R(fzf fzf, kg9 kg9) {
        int i;
        int i2;
        hKb hkb = new hKb(kg9);
        if (fzf != null) {
            i = this.R;
            i2 = 1000000000;
        } else {
            i = this.R;
            i2 = 2000000000;
        }
        oIb oib = new oIb(hkb, false, new fue(i + i2, true));
        oib.v = true;
        oib.f6739R = this;
        return oib;
    }

    public final List X(boolean z) {
        return this.f6738R.v ? fcD.R : Z() ? c(this, null, z, 1) : x(z, true);
    }

    public final boolean Z() {
        return this.f6740R && this.f6738R.f5221R;
    }

    public final gIA e() {
        if (this.f6736R.K()) {
            return ooA.U(v());
        }
        gIA gia = gIA.R;
        return gIA.R;
    }

    public final void m(kEW kew) {
        if (!this.f6738R.v) {
            List x = x(false, false);
            int size = x.size();
            for (int i = 0; i < size; i++) {
                oIb oib = (oIb) x.get(i);
                if (!oib.Z()) {
                    for (Map.Entry entry : oib.f6738R.R.entrySet()) {
                        b_t b_t = (b_t) entry.getKey();
                        Object value = entry.getValue();
                        Object J = b_t.R.J(kew.R.get(b_t), value);
                        if (J != null) {
                            kew.R.put(b_t, J);
                        }
                    }
                    oib.m(kew);
                }
            }
        }
    }

    public final poS v() {
        if (!this.f6738R.f5221R) {
            return msU.ZW(this.f6737R, 8);
        }
        hUv B = aH9.B(this.f6736R);
        if (B == null) {
            B = this.f6737R;
        }
        return msU.ZW(B, 8);
    }

    public final List x(boolean z, boolean z2) {
        ArrayList arrayList;
        if (this.v) {
            return fcD.R;
        }
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            fue fue = this.f6736R;
            arrayList = new ArrayList();
            iTI.x(fue, arrayList);
        } else {
            fue fue2 = this.f6736R;
            arrayList = new ArrayList();
            aH9.W(fue2, arrayList);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new oIb((hUv) arrayList.get(i), this.f6740R));
        }
        if (z2) {
            fzf fzf = (fzf) gvP.i(this.f6738R, dwC.g);
            if (fzf != null && this.f6738R.f5221R && (!arrayList2.isEmpty())) {
                arrayList2.add(R(fzf, new mox(7, fzf)));
            }
            kEW kew = this.f6738R;
            b_t b_t = dwC.R;
            if (kew.R(b_t) && (!arrayList2.isEmpty())) {
                kEW kew2 = this.f6738R;
                if (kew2.f5221R) {
                    List list = (List) gvP.i(kew2, b_t);
                    String str = list != null ? (String) dF.w(list) : null;
                    if (str != null) {
                        arrayList2.add(0, R(null, new oF_(str, 3)));
                    }
                }
            }
        }
        return arrayList2;
    }

    public /* synthetic */ oIb(hUv huv, boolean z) {
        this(huv, z, msU.vz(huv));
    }
}
