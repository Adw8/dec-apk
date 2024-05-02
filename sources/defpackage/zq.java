package defpackage;

import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: zq  reason: default package */
/* loaded from: classes.dex */
public final class zq extends dVV implements ddq {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final cuR f7507R;

    /* renamed from: R  reason: collision with other field name */
    public final dH9 f7508R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f7511R;
    public final dH9 v;

    /* renamed from: R  reason: collision with other field name */
    public final oST f7509R = l6.n(null);

    /* renamed from: v  reason: collision with other field name */
    public final oST f7512v = l6.n(Boolean.TRUE);

    /* renamed from: R  reason: collision with other field name */
    public long f7506R = nqW.v;
    public int e = -1;

    /* renamed from: R  reason: collision with other field name */
    public final q4 f7510R = new q4(4, this);

    public zq(boolean z, float f, h0T h0t, h0T h0t2, cuR cur) {
        super(h0t2, z);
        this.f7511R = z;
        this.R = f;
        this.f7508R = h0t;
        this.v = h0t2;
        this.f7507R = cur;
    }

    @Override // defpackage.dVV
    public final void L(oDO odo) {
        cWb cwb = (cWb) this.f7509R.getValue();
        if (cwb != null) {
            cwb.e();
        }
    }

    @Override // defpackage.kN5
    public final void O(ohT oht) {
        jDh jdh = (jDh) oht;
        this.f7506R = jdh.c();
        this.e = Float.isNaN(this.R) ? mLz.t(nf0.R(oht, this.f7511R, jdh.c())) : jdh.B(this.R);
        long j = ((n3) this.f7508R.getValue()).f6279R;
        float f = ((ovi) this.v.getValue()).e;
        jdh.v();
        X(oht, this.R, j);
        Gp R = jdh.R.R.R();
        ((Boolean) this.f7512v.getValue()).booleanValue();
        cWb cwb = (cWb) this.f7509R.getValue();
        if (cwb != null) {
            cwb.X(jdh.c(), this.e, j, f);
            Canvas canvas = dO.R;
            cwb.draw(((W3) R).R);
        }
    }

    @Override // defpackage.ddq
    public final void R() {
        Z();
    }

    public final void Z() {
        cuR cur = this.f7507R;
        cur.getClass();
        this.f7509R.R(null);
        cWb cwb = (cWb) ((Map) cur.R.R).get(this);
        if (cwb != null) {
            cwb.c();
            cur.R.V(this);
            cur.v.add(cwb);
        }
    }

    @Override // defpackage.ddq
    public final void c() {
        Z();
    }

    @Override // defpackage.dVV
    public final void e(oDO odo, jy_ jy_) {
        cuR cur = this.f7507R;
        cWb cwb = (cWb) ((Map) cur.R.R).get(this);
        if (cwb == null) {
            ArrayList arrayList = cur.v;
            cwb = (cWb) (arrayList.isEmpty() ? null : arrayList.remove(0));
            if (cwb == null) {
                if (cur.X > pdD.i(cur.f2454R)) {
                    cwb = new cWb(cur.getContext());
                    cur.addView(cwb);
                    cur.f2454R.add(cwb);
                } else {
                    cwb = (cWb) cur.f2454R.get(cur.X);
                    zq zqVar = (zq) ((Map) cur.R.v).get(cwb);
                    if (zqVar != null) {
                        zqVar.f7509R.R(null);
                        cur.R.V(zqVar);
                        cwb.c();
                    }
                }
                int i = cur.X;
                if (i < cur.e - 1) {
                    cur.X = i + 1;
                } else {
                    cur.X = 0;
                }
            }
            h5 h5Var = cur.R;
            ((Map) h5Var.R).put(this, cwb);
            ((Map) h5Var.v).put(cwb, this);
        }
        cwb.v(odo, this.f7511R, this.f7506R, this.e, ((n3) this.f7508R.getValue()).f6279R, ((ovi) this.v.getValue()).e, this.f7510R);
        this.f7509R.R(cwb);
    }

    @Override // defpackage.ddq
    public final void v() {
    }
}
