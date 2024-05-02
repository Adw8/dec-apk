package defpackage;

/* renamed from: VA  reason: default package */
/* loaded from: classes.dex */
public abstract class VA {
    public static final hPJ R;

    static {
        cEt cet = cEt.Vertical;
        FW fw = nA.R;
        R = new hPJ((float) 0, new lpN(dq.f2881R), cet, jT.R);
    }

    public static final bF9 R(C0 c0, vV vVVar, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(1089876336);
        jr_.w(511388516);
        boolean O = jr_.O(c0) | jr_.O(vVVar);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            if (!n3x.v(c0, nA.f6330R) || !n3x.v(vVVar, dq.f2881R)) {
                I = new hPJ(c0.R(), new lpN(vVVar), cEt.Vertical, new f3(0, c0));
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
