package defpackage;

/* renamed from: nBP  reason: default package */
/* loaded from: classes.dex */
public final class nBP {
    public ift R;

    /* renamed from: R  reason: collision with other field name */
    public jfq f6342R;

    /* renamed from: R  reason: collision with other field name */
    public jy3 f6343R;
    public ift c;

    /* renamed from: c  reason: collision with other field name */
    public jfq f6344c;

    /* renamed from: c  reason: collision with other field name */
    public jy3 f6345c;
    public ift e;

    /* renamed from: e  reason: collision with other field name */
    public jfq f6346e;

    /* renamed from: e  reason: collision with other field name */
    public jy3 f6347e;
    public ift v;

    /* renamed from: v  reason: collision with other field name */
    public jfq f6348v;

    /* renamed from: v  reason: collision with other field name */
    public jy3 f6349v;

    public nBP() {
        this.f6343R = new i0e();
        this.f6349v = new i0e();
        this.f6345c = new i0e();
        this.f6347e = new i0e();
        this.f6342R = new SO(0.0f);
        this.f6348v = new SO(0.0f);
        this.f6344c = new SO(0.0f);
        this.f6346e = new SO(0.0f);
        this.R = hDC.H();
        this.v = hDC.H();
        this.c = hDC.H();
        this.e = hDC.H();
    }

    public static void v(jy3 jy3) {
        if (jy3 instanceof i0e) {
            i0e i0e = (i0e) jy3;
        } else if (jy3 instanceof m7I) {
            m7I m7i = (m7I) jy3;
        }
    }

    public final dOE R() {
        return new dOE(this);
    }

    public final void c(float f) {
        this.f6342R = new SO(f);
        this.f6348v = new SO(f);
        this.f6344c = new SO(f);
        this.f6346e = new SO(f);
    }

    public nBP(dOE doe) {
        this.f6343R = new i0e();
        this.f6349v = new i0e();
        this.f6345c = new i0e();
        this.f6347e = new i0e();
        this.f6342R = new SO(0.0f);
        this.f6348v = new SO(0.0f);
        this.f6344c = new SO(0.0f);
        this.f6346e = new SO(0.0f);
        this.R = hDC.H();
        this.v = hDC.H();
        this.c = hDC.H();
        this.e = hDC.H();
        this.f6343R = doe.f2592R;
        this.f6349v = doe.f2598v;
        this.f6345c = doe.f2594c;
        this.f6347e = doe.f2596e;
        this.f6342R = doe.f2591R;
        this.f6348v = doe.f2597v;
        this.f6344c = doe.f2593c;
        this.f6346e = doe.f2595e;
        this.R = doe.R;
        this.v = doe.v;
        this.c = doe.c;
        this.e = doe.e;
    }
}
