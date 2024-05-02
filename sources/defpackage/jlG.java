package defpackage;

import android.view.Choreographer;

/* renamed from: jlG  reason: default package */
/* loaded from: classes.dex */
public final class jlG implements kJx {

    /* renamed from: R  reason: collision with other field name */
    public static final jlG f5013R = new jlG();
    public static final Choreographer R = (Choreographer) l6.T(((hBL) hJr.R).f4160R, new oby(null));

    static {
        h8R h8r = iFn.R;
    }

    @Override // defpackage.nbD
    public final nbD H(e86 e86) {
        return dTl.d(this, e86);
    }

    @Override // defpackage.nbD
    public final nbD M(nbD nbd) {
        return jjU.t(this, nbd);
    }

    @Override // defpackage.hdJ, defpackage.nbD
    public final hdJ O(e86 e86) {
        return dTl.J(this, e86);
    }

    @Override // defpackage.kJx
    public final Object W(kg9 kg9, aOO aoo) {
        xx xxVar = new xx(1, n3x.U(aoo));
        xxVar.j();
        cfr cfr = new cfr(xxVar, kg9);
        R.postFrameCallback(cfr);
        xxVar.y(new a7Q(0, cfr));
        return xxVar.P();
    }

    @Override // defpackage.nbD
    public final Object o(Object obj, iv7 iv7) {
        return iv7.J(obj, this);
    }
}
