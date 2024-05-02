package defpackage;

/* renamed from: _F  reason: default package */
/* loaded from: classes.dex */
public abstract class _F extends YX {
    public final nWQ R;

    public _F(int i, nbD nbd, h9 h9Var, nWQ nwq) {
        super(nbd, i, h9Var);
        this.R = nwq;
    }

    @Override // defpackage.YX
    public final Object O(k6z k6z, aOO aoo) {
        Object x = x(new hsk(k6z), aoo);
        return x == bGR.COROUTINE_SUSPENDED ? x : o8s.R;
    }

    @Override // defpackage.YX
    public final String toString() {
        return this.R + " -> " + super.toString();
    }

    @Override // defpackage.YX, defpackage.nWQ
    public final Object v(h2V h2v, aOO aoo) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        if (this.e == -3) {
            nbD v = aoo.v();
            nbD M = v.M(((YX) this).f634R);
            if (n3x.v(M, v)) {
                Object x = x(h2v, aoo);
                return x == bgr ? x : o8s.R;
            }
            hw1 hw1 = hw1.c;
            if (n3x.v(M.O(hw1), v.O(hw1))) {
                nbD v2 = aoo.v();
                if (!(h2v instanceof hsk ? true : h2v instanceof oEJ)) {
                    h2v = new kI4(h2v, v2);
                }
                X4 x4 = new X4(this, null);
                Object i = cU5.i(M, cU5.g(M));
                try {
                    h6p h6p = new h6p(aoo, M);
                    gvP.L(2, x4);
                    Object J = x4.J(h2v, h6p);
                    Object obj = J == bgr ? J : o8s.R;
                    return obj == bgr ? obj : o8s.R;
                } finally {
                    cU5.C(M, i);
                }
            }
        }
        Object v3 = super.v(h2v, aoo);
        return v3 == bgr ? v3 : o8s.R;
    }

    public abstract Object x(h2V h2v, aOO aoo);
}
