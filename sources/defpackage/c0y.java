package defpackage;

import java.util.ListIterator;

/* renamed from: c0y  reason: default package */
/* loaded from: classes.dex */
public final class c0y implements dH9 {
    public final oST L;
    public Pc R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h5L f1905R;

    /* renamed from: R  reason: collision with other field name */
    public final ipq f1906R;

    /* renamed from: R  reason: collision with other field name */
    public final oHg f1907R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f1908R;
    public final oST c;
    public final oST v;
    public final oST e = l6.n(Boolean.TRUE);
    public final oST X = l6.n(0L);
    public final oST O = l6.n(Boolean.FALSE);

    public c0y(h5L h5l, Object obj, Pc pc, oHg ohg) {
        this.f1905R = h5l;
        this.f1907R = ohg;
        oST n = l6.n(obj);
        this.f1908R = n;
        Object obj2 = null;
        oST n2 = l6.n(o02.y(0.0f, null, 7));
        this.v = n2;
        this.c = l6.n(new hgI((nKE) n2.getValue(), ohg, obj, n.getValue(), pc));
        this.L = l6.n(obj);
        this.R = pc;
        Float f = (Float) lVA.R.get(ohg);
        if (f != null) {
            float floatValue = f.floatValue();
            Pc pc2 = (Pc) ohg.R.x(obj);
            int i = 0;
            int v = pc2.v();
            while (i < v) {
                i++;
                pc2.X(i, floatValue);
            }
            obj2 = this.f1907R.v.x(pc2);
        }
        this.f1906R = o02.y(0.0f, obj2, 3);
    }

    public static void c(c0y c0y, Object obj, boolean z, int i) {
        if ((i & 1) != 0) {
            obj = c0y.getValue();
        }
        z = false;
        if ((i & 2) != 0) {
        }
        c0y.c.R(new hgI(z ? ((nKE) c0y.v.getValue()) instanceof ipq ? (nKE) c0y.v.getValue() : c0y.f1906R : (nKE) c0y.v.getValue(), c0y.f1907R, obj, c0y.f1908R.getValue(), c0y.R));
        h5L h5l = c0y.f1905R;
        h5l.X.R(Boolean.TRUE);
        if (h5l.X()) {
            long j = 0;
            ListIterator listIterator = h5l.f4044R.listIterator();
            while (true) {
                aJE aje = (aJE) listIterator;
                if (aje.hasNext()) {
                    c0y c0y2 = (c0y) aje.next();
                    j = Math.max(j, c0y2.v().R);
                    long j2 = h5l.R;
                    c0y2.L.R(c0y2.v().X(j2));
                    c0y2.R = c0y2.v().v(j2);
                } else {
                    h5l.X.R(Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public final void X(Object obj, nKE nke) {
        if (!n3x.v(this.f1908R.getValue(), obj) || ((Boolean) this.O.getValue()).booleanValue()) {
            this.f1908R.R(obj);
            this.v.R(nke);
            c(this, null, !((Boolean) this.e.getValue()).booleanValue(), 1);
            oST ost = this.e;
            Boolean bool = Boolean.FALSE;
            ost.R(bool);
            this.X.R(Long.valueOf(((Number) this.f1905R.c.getValue()).longValue()));
            this.O.R(bool);
        }
    }

    public final void e(Object obj, Object obj2, nKE nke) {
        this.f1908R.R(obj2);
        this.v.R(nke);
        if (!n3x.v(v().f4345R, obj) || !n3x.v(v().f4347v, obj2)) {
            c(this, obj, false, 2);
        }
    }

    @Override // defpackage.dH9
    public final Object getValue() {
        return this.L.getValue();
    }

    public final hgI v() {
        return (hgI) this.c.getValue();
    }
}
