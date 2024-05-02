package defpackage;

/* renamed from: lnF  reason: default package */
/* loaded from: classes.dex */
public abstract class lnF {
    public static final owM R = new owM(fme.N);
    public static final owM v = new owM(fme.P);
    public static final owM c = new owM(fme.j);
    public static final owM e = new owM(fme.g);
    public static final owM X = new owM(fme.y);
    public static final owM O = new owM(fme.t);
    public static final owM L = new owM(fme.V);
    public static final owM Z = new owM(fme.i);
    public static final owM m = new owM(fme.o);
    public static final owM x = new owM(fme.K);
    public static final owM H = new owM(fme.J);
    public static final owM U = new owM(fme.h);
    public static final owM C = new owM(fme.I);
    public static final owM N = new owM(fme.u);
    public static final owM P = new owM(fme.z);
    public static final owM j = new owM(mY_.R);
    public static final owM g = new owM(fme.Y);

    public static final void R(gzG gzg, l8m l8m, iv7 iv7, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(874662829);
        if ((i & 14) == 0) {
            i2 = (jr_.O(gzg) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= jr_.O(l8m) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= jr_.O(iv7) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !jr_.J()) {
            owM owm = L;
            agj fontLoader = gzg.getFontLoader();
            owm.getClass();
            owM owm2 = Z;
            gP7 fontFamilyResolver = gzg.getFontFamilyResolver();
            owm2.getClass();
            l6.R(new bkv[]{R.v(gzg.getAccessibilityManager()), v.v(gzg.getAutofill()), c.v(gzg.getAutofillTree()), e.v(gzg.getClipboardManager()), X.v(gzg.getDensity()), O.v(gzg.getFocusManager()), new bkv(owm, fontLoader, false), new bkv(owm2, fontFamilyResolver, false), m.v(gzg.getHapticFeedBack()), x.v(gzg.getInputModeManager()), H.v(gzg.getLayoutDirection()), U.v(gzg.getTextInputService()), C.v(gzg.getTextToolbar()), N.v(l8m), P.v(gzg.getViewConfiguration()), j.v(gzg.getWindowInfo()), g.v(gzg.getPointerIconService())}, iv7, jr_, ((i2 >> 3) & 112) | 8);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new dR(gzg, l8m, iv7, i, 8);
        }
    }

    public static final void v(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
