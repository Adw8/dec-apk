package defpackage;

/* renamed from: emQ  reason: default package */
/* loaded from: classes.dex */
public abstract class emQ extends l0f implements mZf {
    public boolean R;
    public boolean v;

    public static void cR(poS pos) {
        k5m k5m;
        poS pos2 = pos.f7280R;
        if (!n3x.v(pos2 != null ? pos2.f7272R : null, pos.f7272R)) {
            pos.f7272R.f3606R.f7296R.f2092R.X();
            return;
        }
        oE I = pos.f7272R.f3606R.f7296R.I();
        if (I != null && (k5m = ((cRM) I).f2092R) != null) {
            k5m.X();
        }
    }

    public abstract hjM MG();

    @Override // defpackage.kgQ
    public final int P(XI xi) {
        int PN;
        if (Ry() && (PN = PN(xi)) != Integer.MIN_VALUE) {
            return dU5.v(yf()) + PN;
        }
        return Integer.MIN_VALUE;
    }

    public abstract int PN(XI xi);

    public abstract boolean Ry();

    public abstract mET c0();

    public abstract emQ hi();

    public abstract emQ iS();

    public abstract void k8();

    public abstract long wW();

    public abstract fue zE();
}
