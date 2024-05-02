package defpackage;

import java.util.Iterator;

/* renamed from: h4N  reason: default package */
/* loaded from: classes.dex */
public final class h4N extends liQ {

    /* renamed from: R  reason: collision with other field name */
    public final iv7 f4038R;

    /* renamed from: R  reason: collision with other field name */
    public final oey f4040R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f4039R = l6.n(0);
    public final gHm R = l6.V(new q4(28, this));

    public h4N(oey oey, iv7 iv7) {
        this.f4040R = oey;
        this.f4038R = iv7;
    }

    public final float O() {
        Object obj;
        int max;
        b9a L = this.f4040R.L();
        if (L.L().isEmpty()) {
            return -1.0f;
        }
        Iterator it = L.L().iterator();
        Object obj2 = null;
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int i = ((iFC) obj).R;
                do {
                    Object next = it.next();
                    int i2 = ((iFC) next).R;
                    if (i > i2) {
                        obj = next;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        }
        iFC ifc = (iFC) obj;
        if (ifc == null) {
            return -1.0f;
        }
        Iterator it2 = L.L().iterator();
        if (it2.hasNext()) {
            obj2 = it2.next();
            if (it2.hasNext()) {
                iFC ifc2 = (iFC) obj2;
                int i3 = ifc2.R + ifc2.c;
                do {
                    Object next2 = it2.next();
                    iFC ifc3 = (iFC) next2;
                    int i4 = ifc3.R + ifc3.c;
                    if (i3 < i4) {
                        obj2 = next2;
                        i3 = i4;
                    }
                } while (it2.hasNext());
            }
        }
        iFC ifc4 = (iFC) obj2;
        if (ifc4 == null || (max = Math.max(ifc.R + ifc.c, ifc4.R + ifc4.c) - Math.min(ifc.R, ifc4.R)) == 0) {
            return -1.0f;
        }
        b9a L2 = this.f4040R.L();
        int i5 = 0;
        if (L2.L().size() >= 2) {
            iFC ifc5 = (iFC) L2.L().get(0);
            i5 = ((iFC) L2.L().get(1)).R - (ifc5.c + ifc5.R);
        }
        return ((float) (max + i5)) / ((float) L.L().size());
    }

    @Override // defpackage.liQ
    public final boolean R() {
        iFC ifc = (iFC) dF.vl(this.f4040R.L().L());
        return ifc != null && (ifc.v < this.f4040R.L().O() - 1 || ifc.R + ifc.c > X());
    }

    @Override // defpackage.liQ
    public final int X() {
        return this.f4040R.L().X() - ((Number) this.f4039R.getValue()).intValue();
    }

    @Override // defpackage.liQ
    public final int c(int i) {
        Object obj;
        int i2;
        int i3;
        boolean z;
        Iterator it = iOY.a(dF.a(this.f4040R.L().L()), h6d.R).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jMO) obj).R.v == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        jMO jmo = (jMO) obj;
        if (jmo != null) {
            i2 = jmo.R.R;
            i3 = ((Number) this.f4038R.J(this, jmo)).intValue();
        } else {
            jMO e = e();
            if (e == null) {
                return 0;
            }
            i2 = mLz.t(O() * ((float) (i - e.R.v))) + e.R.R;
            i3 = ((Number) this.f4038R.J(this, e)).intValue();
        }
        return i2 - i3;
    }

    @Override // defpackage.liQ
    public final jMO e() {
        return (jMO) this.R.getValue();
    }

    @Override // defpackage.liQ
    public final boolean v() {
        iFC ifc = (iFC) dF.w(this.f4040R.L().L());
        if (ifc == null) {
            return false;
        }
        return ifc.v > 0 || ifc.R < 0;
    }
}
