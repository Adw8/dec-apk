package defpackage;

/* renamed from: ktl  reason: default package */
/* loaded from: classes.dex */
public abstract class ktl {
    public static final hPJ R;

    static {
        cEt cet = cEt.Horizontal;
        FW fw = nA.R;
        R = new hPJ((float) 0, new lpN(dq.f2879R), cet, jT.v);
    }

    public static final bF9 R(h8 h8Var, ky kyVar, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-837807694);
        jr_.w(511388516);
        boolean O = jr_.O(h8Var) | jr_.O(kyVar);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            if (!n3x.v(h8Var, nA.R) || !n3x.v(kyVar, dq.f2879R)) {
                I = new hPJ(h8Var.R(), new lpN(kyVar), cEt.Horizontal, new f3(1, h8Var));
            } else {
                I = R;
            }
            jr_.ZW(I);
        }
        jr_.g(false);
        bF9 bf9 = (bF9) I;
        jr_.g(false);
        return bf9;
    }
}
