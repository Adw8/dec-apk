package defpackage;

/* renamed from: ek_  reason: default package */
/* loaded from: classes.dex */
public abstract class ek_ {
    public static final o3h R = new o3h(15, hiK.R, 2);

    public static final iWA R(boolean z, float f, m88 m88, int i, int i2) {
        jr_ jr_ = (jr_) m88;
        jr_.w(1635163520);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = Float.NaN;
        }
        h0T s = l6.s(new n3((i2 & 4) != 0 ? n3.O : 0), jr_);
        Boolean valueOf = Boolean.valueOf(z);
        hoI hoi = new hoI(f);
        jr_.w(-3686552);
        boolean O = jr_.O(valueOf) | jr_.O(hoi);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            I = new iWA(z, f, s);
            jr_.ZW(I);
        }
        jr_.g(false);
        iWA iwa = (iWA) I;
        jr_.g(false);
        return iwa;
    }
}
