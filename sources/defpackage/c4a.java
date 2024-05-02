package defpackage;

/* renamed from: c4a  reason: default package */
/* loaded from: classes.dex */
public final class c4a implements f8n {
    public static final c4a R = new c4a();

    @Override // defpackage.f8n
    public final kN5 R(j4B j4b, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(1683566979);
        h0T j = g4x.j(j4b, jr_, 0);
        jr_.w(1206586544);
        jr_.w(-492369756);
        Object I = jr_.I();
        f1A f1a = ppN.R;
        if (I == f1a) {
            I = l6.n(Boolean.FALSE);
            jr_.ZW(I);
        }
        jr_.g(false);
        h0T h0t = (h0T) I;
        jr_.w(511388516);
        boolean O = jr_.O(j4b) | jr_.O(h0t);
        Object I2 = jr_.I();
        if (O || I2 == f1a) {
            I2 = new cvR(j4b, h0t, null);
            jr_.ZW(I2);
        }
        jr_.g(false);
        caw.e(j4b, (iv7) I2, jr_);
        jr_.g(false);
        h0T I3 = msU.I(j4b, jr_, 0);
        jr_.w(1157296644);
        boolean O2 = jr_.O(j4b);
        Object I4 = jr_.I();
        if (O2 || I4 == f1a) {
            I4 = new iUt(j, h0t, I3);
            jr_.ZW(I4);
        }
        jr_.g(false);
        iUt iut = (iUt) I4;
        jr_.g(false);
        return iut;
    }
}
