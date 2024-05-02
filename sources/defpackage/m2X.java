package defpackage;

import android.graphics.Canvas;

/* renamed from: m2X  reason: default package */
/* loaded from: classes.dex */
public final class m2X extends i2h {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public final jnu f5893R;
    public float v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5895R = true;

    /* renamed from: R  reason: collision with other field name */
    public final bp2 f5892R = new bp2();

    /* renamed from: v  reason: collision with other field name */
    public f_c f5896v = fzi.z;

    /* renamed from: R  reason: collision with other field name */
    public final oST f5894R = l6.n(null);

    /* renamed from: R  reason: collision with other field name */
    public long f5890R = nqW.c;

    /* renamed from: R  reason: collision with other field name */
    public final _0 f5891R = new _0(26, this);

    public m2X() {
        jnu jnu = new jnu();
        jnu.v = 0.0f;
        jnu.f5026v = true;
        jnu.c();
        jnu.c = 0.0f;
        jnu.f5026v = true;
        jnu.c();
        jnu.e(new q4(7, this));
        this.f5893R = jnu;
    }

    @Override // defpackage.i2h
    public final void R(fiv fiv) {
        X(fiv, 1.0f, null);
    }

    public final void X(fiv fiv, float f, Iw iw) {
        boolean z;
        Iw iw2 = iw != null ? iw : (Iw) this.f5894R.getValue();
        if (this.f5895R || !nqW.R(this.f5890R, fiv.c())) {
            jnu jnu = this.f5893R;
            jnu.e = nqW.e(fiv.c()) / this.R;
            jnu.f5026v = true;
            jnu.c();
            jnu jnu2 = this.f5893R;
            jnu2.X = nqW.v(fiv.c()) / this.v;
            jnu2.f5026v = true;
            jnu2.c();
            bp2 bp2 = this.f5892R;
            long R = iTI.R((int) ((float) Math.ceil((double) nqW.e(fiv.c()))), (int) ((float) Math.ceil((double) nqW.v(fiv.c()))));
            mdz layoutDirection = fiv.getLayoutDirection();
            _0 _0 = this.f5891R;
            lC lCVar = bp2.f1816R;
            W3 w3 = bp2.f1815R;
            if (lCVar == null || w3 == null || ((int) (R >> 32)) > lCVar.v() || ltH.v(R) > lCVar.R()) {
                lCVar = dTl.L((int) (R >> 32), ltH.v(R), 0, 28);
                Canvas canvas = dO.R;
                w3 = new W3();
                w3.R = new Canvas(gQc.P(lCVar));
                bp2.f1816R = lCVar;
                bp2.f1815R = w3;
            }
            bp2.R = R;
            FC fc = bp2.f1814R;
            long J = iTI.J(R);
            lE lEVar = fc.f118R;
            jJj jjj = lEVar.f5619R;
            mdz mdz = lEVar.f5620R;
            Gp gp = lEVar.f5618R;
            long j = lEVar.R;
            lEVar.f5619R = fiv;
            lEVar.f5620R = layoutDirection;
            lEVar.f5618R = w3;
            lEVar.R = J;
            w3.y();
            fiv.H(fc, n3.v, 0, 0, 62);
            _0.x(fc);
            w3.j();
            lE lEVar2 = fc.f118R;
            lEVar2.f5619R = jjj;
            lEVar2.f5620R = mdz;
            lEVar2.f5618R = gp;
            lEVar2.R = j;
            lCVar.R.prepareToDraw();
            z = false;
            this.f5895R = false;
            this.f5890R = fiv.c();
        } else {
            z = false;
        }
        bp2 bp22 = this.f5892R;
        lC lCVar2 = bp22.f1816R;
        if (lCVar2 != null) {
            z = true;
        }
        if (z) {
            fiv.cE(fiv, lCVar2, 0, bp22.R, 0, f, iw2, 0, 858);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }

    public final String toString() {
        StringBuilder t = jQ.t("Params: ", "\tname: ");
        t.append(this.f5893R.f5019R);
        t.append("\n");
        t.append("\tviewportWidth: ");
        t.append(this.R);
        t.append("\n");
        t.append("\tviewportHeight: ");
        t.append(this.v);
        t.append("\n");
        return t.toString();
    }
}
