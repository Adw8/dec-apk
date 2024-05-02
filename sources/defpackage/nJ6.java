package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: nJ6  reason: default package */
/* loaded from: classes.dex */
public final class nJ6 extends dVV implements ddq {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final cNN f6358R = new cNN();

    /* renamed from: R  reason: collision with other field name */
    public final dH9 f6359R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6360R;
    public final dH9 v;

    public nJ6(boolean z, float f, h0T h0t, h0T h0t2) {
        super(h0t2, z);
        this.f6360R = z;
        this.R = f;
        this.f6359R = h0t;
        this.v = h0t2;
    }

    @Override // defpackage.dVV
    public final void L(oDO odo) {
        aJj ajj = (aJj) this.f6358R.get(odo);
        if (ajj != null) {
            ajj.f837v.R(Boolean.TRUE);
            ajj.f831R.w(o8s.R);
        }
    }

    @Override // defpackage.kN5
    public final void O(ohT oht) {
        long j = ((n3) this.f6359R.getValue()).f6279R;
        jDh jdh = (jDh) oht;
        jdh.v();
        X(oht, this.R, j);
        Iterator it = this.f6358R.f2079R.iterator();
        while (((p30) it).hasNext()) {
            aJj ajj = (aJj) ((Map.Entry) ((pjN) it).next()).getValue();
            float f = ((ovi) this.v.getValue()).e;
            if (!(f == 0.0f)) {
                long v = n3.v(j, f);
                if (ajj.f832R == null) {
                    long c = jdh.c();
                    float f2 = nf0.R;
                    ajj.f832R = Float.valueOf(Math.max(nqW.e(c), nqW.v(c)) * 0.3f);
                }
                if (ajj.f836v == null) {
                    ajj.f836v = Float.isNaN(ajj.R) ? Float.valueOf(nf0.R(jdh, ajj.f834R, jdh.c())) : Float.valueOf(jdh.mZ(ajj.R));
                }
                if (ajj.f830R == null) {
                    ajj.f830R = new aWo(jdh.u());
                }
                if (ajj.f835v == null) {
                    ajj.f835v = new aWo(aH9.N(nqW.e(jdh.c()) / 2.0f, nqW.v(jdh.c()) / 2.0f));
                }
                float floatValue = (!((Boolean) ajj.f837v.getValue()).booleanValue() || ((Boolean) ajj.f833R.getValue()).booleanValue()) ? ((Number) ajj.f829R.c()).floatValue() : 1.0f;
                float z = hDC.z(ajj.f832R.floatValue(), ajj.f836v.floatValue(), ((Number) ajj.v.c()).floatValue());
                long N = aH9.N(hDC.z(aWo.e(ajj.f830R.f906R), aWo.e(ajj.f835v.f906R), ((Number) ajj.c.c()).floatValue()), hDC.z(aWo.X(ajj.f830R.f906R), aWo.X(ajj.f835v.f906R), ((Number) ajj.c.c()).floatValue()));
                long v2 = n3.v(v, n3.e(v) * floatValue);
                if (ajj.f834R) {
                    float e = nqW.e(jdh.c());
                    float v3 = nqW.v(jdh.c());
                    JF jf = jdh.R.R;
                    long v4 = jf.v();
                    jf.R().y();
                    j = j;
                    jf.f201R.R(0.0f, 0.0f, e, v3, 1);
                    fiv.X4(jdh, v2, z, N, 120);
                    jf.R().j();
                    jf.c(v4);
                } else {
                    j = j;
                    fiv.X4(oht, v2, z, N, 120);
                }
            } else {
                j = j;
            }
        }
    }

    @Override // defpackage.ddq
    public final void R() {
        this.f6358R.clear();
    }

    @Override // defpackage.ddq
    public final void c() {
        this.f6358R.clear();
    }

    @Override // defpackage.dVV
    public final void e(oDO odo, jy_ jy_) {
        Iterator it = this.f6358R.f2079R.iterator();
        while (it.hasNext()) {
            aJj ajj = (aJj) ((Map.Entry) it.next()).getValue();
            ajj.f837v.R(Boolean.TRUE);
            ajj.f831R.w(o8s.R);
        }
        aJj ajj2 = new aJj(this.f6360R ? new aWo(odo.R) : null, this.R, this.f6360R);
        this.f6358R.put(odo, ajj2);
        l6.z(jy_, null, 0, new lAu(ajj2, this, odo, null), 3);
    }

    @Override // defpackage.ddq
    public final void v() {
    }
}
