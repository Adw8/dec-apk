package defpackage;

import android.view.View;

/* renamed from: kVF  reason: default package */
/* loaded from: classes.dex */
public final class kVF extends k8G implements kg9 {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kVF(eLb elb, gAN gan, eLb elb2, dq7 dq7, int i) {
        super(1);
        this.R = elb;
        this.v = gan;
        this.c = elb2;
        this.e = dq7;
        this.O = i;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                hjM hjm = (hjM) obj;
                float f = jyF.R;
                ((h0T) this.c).R(Integer.valueOf((int) (hjm.pG() >> 32)));
                ((eGS) this.R).R = hjm;
                jyF.v(((View) this.v).getRootView(), (hjM) ((eGS) this.R).R, this.O, new n2R((h0T) this.e, 3));
                break;
            case 1:
                Hd hd = (Hd) obj;
                float floatValue = ((Number) hd.v()).floatValue() - ((eLb) this.R).R;
                float R = ((gAN) this.v).R(floatValue);
                ((eLb) this.R).R = ((Number) hd.v()).floatValue();
                ((eLb) this.c).R = ((Number) hd.c()).floatValue();
                jMO e = ((dq7) this.e).f2897R.e();
                if (e == null) {
                    hd.R();
                } else if (dq7.v((dq7) this.e, hd, e, this.O, new mCa(6, (gAN) this.v))) {
                    hd.R();
                } else if (Math.abs(floatValue - R) > 0.5f) {
                    hd.R();
                }
                return o8s.R;
            default:
                long j = ((aWo) obj).f906R;
                ((nWW) this.R).R = l6.z((jy_) this.c, null, 0, new lJ2((View) this.v, (nhg) this.e, this.O, null), 3);
                break;
        }
        return o8s.R;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kVF(nWW nww, jy_ jy_, View view, nhg nhg, int i) {
        super(1);
        this.R = nww;
        this.c = jy_;
        this.v = view;
        this.e = nhg;
        this.O = i;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kVF(eGS egs, View view, int i, h0T h0t, h0T h0t2) {
        super(1);
        this.R = egs;
        this.v = view;
        this.O = i;
        this.c = h0t;
        this.e = h0t2;
    }
}
