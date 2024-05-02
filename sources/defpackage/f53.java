package defpackage;

import java.util.LinkedHashMap;

/* renamed from: f53  reason: default package */
/* loaded from: classes.dex */
public final class f53 {
    public final f_c R;

    /* renamed from: R  reason: collision with other field name */
    public final hZi f3302R;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f3303R = new LinkedHashMap();

    public f53(hZi hzi, fBj fbj) {
        this.f3302R = hzi;
        this.R = fbj;
    }

    public final iv7 R(int i, Object obj) {
        nm1 nm1 = (nm1) this.f3303R.get(obj);
        Object R = ((cRR) this.R.g()).R(i);
        if (nm1 == null || ((Number) nm1.f6578R.getValue()).intValue() != i || !n3x.v(nm1.v, R)) {
            nm1 nm12 = new nm1(this, i, obj, R);
            this.f3303R.put(obj, nm12);
            iv7 iv7 = nm12.f6576R;
            if (iv7 != null) {
                return iv7;
            }
            dNH u = aH9.u(new azM(this, 2, nm12), true, 1403994769);
            nm12.f6576R = u;
            return u;
        }
        iv7 iv72 = nm1.f6576R;
        if (iv72 != null) {
            return iv72;
        }
        dNH u2 = aH9.u(new azM(nm1.R, 2, nm1), true, 1403994769);
        nm1.f6576R = u2;
        return u2;
    }

    public final Object v(Object obj) {
        nm1 nm1 = (nm1) this.f3303R.get(obj);
        if (nm1 != null) {
            return nm1.v;
        }
        cRR crr = (cRR) this.R.g();
        Integer num = (Integer) crr.O().get(obj);
        if (num != null) {
            return crr.R(num.intValue());
        }
        return null;
    }
}
