package defpackage;

import android.view.View;

/* renamed from: ozH  reason: default package */
/* loaded from: classes.dex */
public final class ozH extends k8G implements lR3 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dkV f7047R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f7048R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mk9 f7049R;
    public final /* synthetic */ kg9 c;
    public final /* synthetic */ kg9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ozH(_0 _0, kg9 kg9, float f, kg9 kg92, mk9 mk9) {
        super(3);
        hw1 hw1 = hw1.H;
        this.f7048R = _0;
        this.v = kg9;
        this.R = f;
        this.c = kg92;
        this.f7047R = hw1;
        this.f7049R = mk9;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        ncu ncu = (ncu) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        jr_.w(-454877003);
        View view = (View) jr_.x(ur.X);
        jJj jjj = (jJj) jr_.x(lnF.X);
        jr_.w(-492369756);
        Object I = jr_.I();
        f1A f1a = ppN.R;
        if (I == f1a) {
            I = l6.n(new aWo(aWo.e));
            jr_.ZW(I);
        }
        jr_.g(false);
        h0T h0t = (h0T) I;
        h0T s = l6.s(this.f7048R, jr_);
        h0T s2 = l6.s(this.v, jr_);
        h0T s3 = l6.s(Float.valueOf(this.R), jr_);
        h0T s4 = l6.s(this.c, jr_);
        jr_.w(-492369756);
        Object I2 = jr_.I();
        if (I2 == f1a) {
            I2 = l6.V(new h31(jjj, s, h0t, 0));
            jr_.ZW(I2);
        }
        jr_.g(false);
        dH9 dh9 = (dH9) I2;
        jr_.w(-492369756);
        Object I3 = jr_.I();
        if (I3 == f1a) {
            I3 = l6.V(new fBj(dh9, 1));
            jr_.ZW(I3);
        }
        jr_.g(false);
        dH9 dh92 = (dH9) I3;
        jr_.w(-492369756);
        Object I4 = jr_.I();
        if (I4 == f1a) {
            I4 = pip.R(1, 0, h9.DROP_OLDEST, 2);
            jr_.ZW(I4);
        }
        jr_.g(false);
        nhg nhg = (nhg) I4;
        float f = this.f7047R.R() ? 0.0f : this.R;
        mk9 mk9 = this.f7049R;
        caw.O(new Object[]{view, jjj, Float.valueOf(f), mk9, Boolean.valueOf(n3x.v(mk9, mk9.v))}, new o89(this.f7047R, this.f7049R, view, jjj, this.R, nhg, s4, dh92, dh9, s2, h0t, s3, null), jr_);
        jr_.w(1157296644);
        boolean O = jr_.O(h0t);
        Object I5 = jr_.I();
        if (O || I5 == f1a) {
            I5 = new n2R(h0t, 1);
            jr_.ZW(I5);
        }
        jr_.g(false);
        ncu S = aH9.S(g4x.u(ncu, (kg9) I5), new _0(4, nhg));
        jr_.w(1157296644);
        boolean O2 = jr_.O(dh9);
        Object I6 = jr_.I();
        if (O2 || I6 == f1a) {
            I6 = new jb4(dh9, 1);
            jr_.ZW(I6);
        }
        jr_.g(false);
        ncu N = cU5.N(S, false, (kg9) I6);
        jr_.g(false);
        return N;
    }
}
