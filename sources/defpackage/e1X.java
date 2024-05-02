package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel;

/* renamed from: e1X  reason: default package */
/* loaded from: classes.dex */
public abstract class e1X {
    public static final lG0 R = new lG0("[^\\d]");

    public static final void R(PortForwardCreateViewModel portForwardCreateViewModel, mpr mpr, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(1431040619);
        h0T m = biy.m(portForwardCreateViewModel.f2777R, jr_);
        h0T m2 = biy.m(portForwardCreateViewModel.f2776R, jr_);
        h0T m3 = biy.m(portForwardCreateViewModel.v, jr_);
        h0T m4 = biy.m(portForwardCreateViewModel.c, jr_);
        h0T m5 = biy.m(portForwardCreateViewModel.e, jr_);
        h0T m6 = biy.m(portForwardCreateViewModel.X, jr_);
        hDC.v("Add port forward", mpr, null, aH9.I(jr_, -1411117682, new ezT(biy.m(portForwardCreateViewModel.L, jr_), biy.m(portForwardCreateViewModel.O, jr_), portForwardCreateViewModel, 5)), null, aH9.I(jr_, 1462822079, new d_f(m3, m, portForwardCreateViewModel, m4, m5, m2, m6)), jr_, 199750, 20);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(portForwardCreateViewModel, mpr, i, 20);
        }
    }
}
