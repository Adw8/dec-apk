package defpackage;

import android.view.View;

/* renamed from: fjh  reason: default package */
/* loaded from: classes.dex */
public final class fjh extends k8G implements kg9 {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fjh(mZf mzf, gl4 gl4, l0f l0f, int i, int i2) {
        super(1);
        this.X = i2;
        this.R = mzf;
        this.c = gl4;
        this.v = l0f;
        this.O = i;
    }

    public final void R(h57 h57) {
        iRR irr = null;
        switch (this.X) {
            case 0:
                mZf mzf = (mZf) this.R;
                jxP jxp = (jxP) this.c;
                int i = jxp.e;
                hh4 hh4 = jxp.f5164R;
                mjp mjp = (mjp) jxp.f5163R.g();
                if (mjp != null) {
                    irr = mjp.f6140R;
                }
                ((jxP) this.c).R.v(nLK.Horizontal, gQc.m(mzf, i, hh4, irr, ((mZf) this.R).getLayoutDirection() == mdz.Rtl, ((l0f) this.v).e), this.O, ((l0f) this.v).e);
                h57.X(h57, (l0f) this.v, mLz.t(-((jxP) this.c).R.R()), 0);
                return;
            default:
                mZf mzf2 = (mZf) this.R;
                fNw fnw = (fNw) this.c;
                int i2 = fnw.e;
                hh4 hh42 = fnw.f3403R;
                mjp mjp2 = (mjp) fnw.f3402R.g();
                if (mjp2 != null) {
                    irr = mjp2.f6140R;
                }
                ((fNw) this.c).R.v(nLK.Vertical, gQc.m(mzf2, i2, hh42, irr, false, ((l0f) this.v).e), this.O, ((l0f) this.v).X);
                h57.X(h57, (l0f) this.v, 0, mLz.t(-((fNw) this.c).R.R()));
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                R((h57) obj);
                return o8s.R;
            case 1:
                R((h57) obj);
                return o8s.R;
            default:
                dlc dlc = (dlc) obj;
                View view = (View) this.R;
                return new acE(3, new iP3(view, new e2z(view, (eGS) this.c, this.O, (h0T) this.v)));
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fjh(View view, eGS egs, int i, h0T h0t) {
        super(1);
        this.X = 2;
        this.R = view;
        this.c = egs;
        this.O = i;
        this.v = h0t;
    }
}
