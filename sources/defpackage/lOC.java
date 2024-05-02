package defpackage;

/* renamed from: lOC  reason: default package */
/* loaded from: classes.dex */
public final class lOC extends t {

    /* renamed from: c  reason: collision with other field name */
    public static final wa f5707c;

    /* renamed from: e  reason: collision with other field name */
    public static final wa f5708e;
    public X R;

    /* renamed from: R  reason: collision with other field name */
    public wa f5709R;
    public X v;

    /* renamed from: v  reason: collision with other field name */
    public wa f5710v;
    public static final X c = new X(20);
    public static final X e = new X(1);

    static {
        wa waVar = new wa(fQj.R, eVe.R);
        f5707c = waVar;
        f5708e = new wa(lpk.O, waVar);
    }

    public lOC(q qVar) {
        this.f5709R = f5707c;
        this.f5710v = f5708e;
        this.R = c;
        this.v = e;
        for (int i = 0; i != qVar.size(); i++) {
            Vz vz = (Vz) qVar.S(i);
            int i2 = vz.O;
            if (i2 == 0) {
                this.f5709R = wa.o((q) q.R.m(vz, true));
            } else if (i2 == 1) {
                this.f5710v = wa.o((q) q.R.m(vz, true));
            } else if (i2 == 2) {
                this.R = (X) X.R.m(vz, true);
            } else if (i2 == 3) {
                this.v = (X) X.R.m(vz, true);
            } else {
                throw new IllegalArgumentException("unknown tag");
            }
        }
    }

    public lOC(wa waVar, wa waVar2, X x, X x2) {
        this.f5709R = waVar;
        this.f5710v = waVar2;
        this.R = x;
        this.v = x2;
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        W w = new W(4);
        if (!this.f5709R.equals(f5707c)) {
            w.R(new oU(0, 1, this.f5709R, true));
        }
        if (!this.f5710v.equals(f5708e)) {
            w.R(new oU(1, 1, this.f5710v, true));
        }
        if (!this.R.h(c)) {
            w.R(new oU(2, 1, this.R, true));
        }
        if (!this.v.h(e)) {
            w.R(new oU(3, 1, this.v, true));
        }
        return new iuV(w);
    }
}
