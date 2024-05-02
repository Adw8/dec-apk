package defpackage;

/* renamed from: kPU  reason: default package */
/* loaded from: classes.dex */
public final class kPU extends kxN {
    public final dqr R;

    public kPU(dqr dqr, f_c f_c) {
        super(f_c);
        this.R = dqr;
    }

    @Override // defpackage.kxN
    public final dH9 R(Object obj, m88 m88) {
        jr_ jr_ = (jr_) m88;
        Object x = jQ.x(jr_, -84026900, -492369756);
        if (x == ppN.R) {
            x = new oST(obj, this.R);
            jr_.ZW(x);
        }
        jr_.g(false);
        h0T h0t = (h0T) x;
        h0t.R(obj);
        jr_.g(false);
        return h0t;
    }
}
