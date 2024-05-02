package defpackage;

import java.util.List;

/* renamed from: cF5  reason: default package */
/* loaded from: classes.dex */
public final class cF5 extends i2h {
    public float L;

    /* renamed from: R  reason: collision with other field name */
    public a1 f2023R;

    /* renamed from: R  reason: collision with other field name */
    public gug f2026R;
    public float X;
    public float c;

    /* renamed from: v  reason: collision with other field name */
    public a1 f2032v;
    public float R = 1.0f;

    /* renamed from: R  reason: collision with other field name */
    public List f2027R = fcD.R;
    public float v = 1.0f;

    /* renamed from: R  reason: collision with other field name */
    public int f2022R = 0;

    /* renamed from: v  reason: collision with other field name */
    public int f2031v = 0;
    public float e = 4.0f;
    public float O = 1.0f;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2029R = true;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2034v = true;

    /* renamed from: c  reason: collision with other field name */
    public boolean f2030c = true;

    /* renamed from: R  reason: collision with other field name */
    public final dm f2025R = g4x.L();

    /* renamed from: v  reason: collision with other field name */
    public final dm f2033v = g4x.L();

    /* renamed from: R  reason: collision with other field name */
    public final cwX f2024R = pdD.J(fzi.u);

    /* renamed from: R  reason: collision with other field name */
    public final k7I f2028R = new k7I();

    public cF5() {
        int i = jnb.R;
    }

    @Override // defpackage.i2h
    public final void R(fiv fiv) {
        if (this.f2029R) {
            ((List) this.f2028R.R).clear();
            this.f2025R.e();
            k7I k7i = this.f2028R;
            ((List) k7i.R).addAll(this.f2027R);
            k7i.X(this.f2025R);
            X();
        } else if (this.f2030c) {
            X();
        }
        this.f2029R = false;
        this.f2030c = false;
        a1 a1Var = this.f2023R;
        if (a1Var != null) {
            fiv.S(fiv, this.f2033v, a1Var, this.R, null, 56);
        }
        a1 a1Var2 = this.f2032v;
        if (a1Var2 != null) {
            gug gug = this.f2026R;
            if (this.f2034v || gug == null) {
                gug = new gug(this.c, this.e, this.f2022R, this.f2031v, 16);
                this.f2026R = gug;
                this.f2034v = false;
            }
            fiv.S(fiv, this.f2033v, a1Var2, this.v, gug, 48);
        }
    }

    public final void X() {
        this.f2033v.e();
        boolean z = true;
        if (this.X == 0.0f) {
            if (this.O != 1.0f) {
                z = false;
            }
            if (z) {
                cnO.R(this.f2033v, this.f2025R);
                return;
            }
        }
        dm dmVar = this.f2025R;
        ((zX) this.f2024R.getValue()).R.setPath(dmVar != null ? dmVar.f2856R : null, false);
        float length = ((zX) this.f2024R.getValue()).R.getLength();
        float f = this.X;
        float f2 = this.L;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.O + f2) % 1.0f) * length;
        if (f3 > f4) {
            ((zX) this.f2024R.getValue()).R(f3, length, this.f2033v);
            ((zX) this.f2024R.getValue()).R(0.0f, f4, this.f2033v);
            return;
        }
        ((zX) this.f2024R.getValue()).R(f3, f4, this.f2033v);
    }

    public final String toString() {
        return this.f2025R.toString();
    }
}
