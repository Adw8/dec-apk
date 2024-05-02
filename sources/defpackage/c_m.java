package defpackage;

/* renamed from: c_m  reason: default package */
/* loaded from: classes.dex */
public abstract class c_m extends tE {
    public final csA R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2145R = false;
    public csA v;

    public c_m(csA csa) {
        this.R = csa;
        this.v = (csA) csa.L(hZW.NEW_MUTABLE_INSTANCE);
    }

    public static void L(csA csa, csA csa2) {
        kV5 kv5 = kV5.R;
        kv5.getClass();
        kv5.R(csa.getClass()).v(csa, csa2);
    }

    public final void O(csA csa) {
        X();
        L(this.v, csa);
    }

    public final void X() {
        if (this.f2145R) {
            csA csa = (csA) this.v.L(hZW.NEW_MUTABLE_INSTANCE);
            L(csa, this.v);
            this.v = csa;
            this.f2145R = false;
        }
    }

    @Override // java.lang.Object
    public final Object clone() {
        c_m c_m = (c_m) this.R.L(hZW.NEW_BUILDER);
        c_m.O(e());
        return c_m;
    }

    public final csA e() {
        if (this.f2145R) {
            return this.v;
        }
        csA csa = this.v;
        csa.getClass();
        kV5 kv5 = kV5.R;
        kv5.getClass();
        kv5.R(csa.getClass()).m(csa);
        this.f2145R = true;
        return this.v;
    }

    public final csA v() {
        csA e = e();
        if (e.x()) {
            return e;
        }
        throw new iMS();
    }
}
