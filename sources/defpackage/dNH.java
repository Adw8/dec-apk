package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: dNH  reason: default package */
/* loaded from: classes.dex */
public final class dNH implements jUU {
    public dYh R;

    /* renamed from: R  reason: collision with other field name */
    public Object f2585R;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f2586R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2587R;
    public final int e;

    public dNH(int i, boolean z) {
        this.e = i;
        this.f2587R = z;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        jr_ jr_ = (jr_) ((m88) obj);
        jr_.q(this.e);
        X(jr_);
        int V = intValue | (jr_.O(this) ? aH9.V(2, 0) : aH9.V(1, 0));
        Object obj3 = this.f2585R;
        gvP.L(2, obj3);
        Object J = ((iv7) obj3).J(jr_, Integer.valueOf(V));
        dYh t = jr_.t();
        if (t != null) {
            gvP.L(2, this);
            t.f2666R = this;
        }
        return J;
    }

    public final void O(k8G k8g) {
        if (!n3x.v(this.f2585R, k8g)) {
            boolean z = this.f2585R == null;
            this.f2585R = k8g;
            if (!z && this.f2587R) {
                dYh dyh = this.R;
                if (dyh != null) {
                    hAe hae = dyh.f2665R;
                    if (hae != null) {
                        hae.g(dyh, null);
                    }
                    this.R = null;
                }
                ArrayList arrayList = this.f2586R;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        dYh dyh2 = (dYh) arrayList.get(i);
                        hAe hae2 = dyh2.f2665R;
                        if (hae2 != null) {
                            hae2.g(dyh2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
    }

    public final Object R(Object obj, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(this.e);
        X(jr_);
        int V = jr_.O(this) ? aH9.V(2, 1) : aH9.V(1, 1);
        Object obj2 = this.f2585R;
        gvP.L(3, obj2);
        Object y = ((lR3) obj2).y(obj, jr_, Integer.valueOf(V | i));
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(this, obj, i, 10);
        }
        return y;
    }

    public final void X(m88 m88) {
        dYh o;
        if (this.f2587R && (o = ((jr_) m88).o()) != null) {
            o.R();
            if (aH9.vl(this.R, o)) {
                this.R = o;
                return;
            }
            ArrayList arrayList = this.f2586R;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                this.f2586R = arrayList2;
                arrayList2.add(o);
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (aH9.vl((dYh) arrayList.get(i), o)) {
                    arrayList.set(i, o);
                    return;
                }
            }
            arrayList.add(o);
        }
    }

    @Override // defpackage.mT2
    public final /* bridge */ /* synthetic */ Object _(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Integer num) {
        return e(obj, obj2, obj3, obj4, (m88) obj5, num.intValue());
    }

    public final Object c(Object obj, Object obj2, Object obj3, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(this.e);
        X(jr_);
        int V = jr_.O(this) ? aH9.V(2, 3) : aH9.V(1, 3);
        Object obj4 = this.f2585R;
        gvP.L(5, obj4);
        Object iE = ((jkN) obj4).iE(obj, obj2, obj3, jr_, Integer.valueOf(V | i));
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new tJ(this, obj, obj2, obj3, i, 2);
        }
        return iE;
    }

    public final Object e(Object obj, Object obj2, Object obj3, Object obj4, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(this.e);
        X(jr_);
        int V = jr_.O(this) ? aH9.V(2, 4) : aH9.V(1, 4);
        Object obj5 = this.f2585R;
        gvP.L(6, obj5);
        Object _ = ((mT2) obj5)._(obj, obj2, obj3, obj4, jr_, Integer.valueOf(i | V));
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new bgV(this, obj, obj2, obj3, obj4, i, 1);
        }
        return _;
    }

    @Override // defpackage.jkN
    public final /* bridge */ /* synthetic */ Object iE(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        return c(obj, obj2, obj3, (m88) obj4, ((Number) serializable).intValue());
    }

    @Override // defpackage.bBk
    public final /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        return v(obj, obj2, (m88) obj3, ((Number) obj4).intValue());
    }

    public final Object v(Object obj, Object obj2, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(this.e);
        X(jr_);
        int V = jr_.O(this) ? aH9.V(2, 2) : aH9.V(1, 2);
        Object obj3 = this.f2585R;
        gvP.L(4, obj3);
        Object m = ((bBk) obj3).m(obj, obj2, jr_, Integer.valueOf(V | i));
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new dR(this, obj, obj2, i, 5);
        }
        return m;
    }

    @Override // defpackage.lR3
    public final /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3) {
        return R(obj, (m88) obj2, ((Number) obj3).intValue());
    }
}
