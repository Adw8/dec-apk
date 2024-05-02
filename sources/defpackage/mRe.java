package defpackage;

import android.view.ViewConfiguration;

/* renamed from: mRe  reason: default package */
/* loaded from: classes.dex */
public abstract class mRe {
    public static final float R = ViewConfiguration.getScrollFriction();

    public static final kbU R(m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-903108490);
        jJj jjj = (jJj) jr_.x(lnF.X);
        Float valueOf = Float.valueOf(jjj.D());
        jr_.w(-3686930);
        boolean O = jr_.O(valueOf);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            I = new kbU(new o00(jjj));
            jr_.ZW(I);
        }
        jr_.g(false);
        kbU kbu = (kbU) I;
        jr_.g(false);
        return kbu;
    }
}
