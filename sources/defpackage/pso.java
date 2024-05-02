package defpackage;

/* renamed from: pso  reason: default package */
/* loaded from: classes.dex */
public final class pso {
    public boolean L;
    public boolean O;
    public int R = 5;

    /* renamed from: R  reason: collision with other field name */
    public final cRM f7296R = new cRM(this);

    /* renamed from: R  reason: collision with other field name */
    public final fue f7297R;

    /* renamed from: R  reason: collision with other field name */
    public lGL f7298R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7299R;
    public boolean X;
    public boolean c;
    public boolean e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f7300v;

    public pso(fue fue) {
        this.f7297R = fue;
    }

    public static boolean v(fue fue) {
        h89 h89 = fue.f3597R;
        return n3x.v(h89 != null ? (fue) h89.R : null, fue);
    }

    public final poS R() {
        return (poS) this.f7297R.f3600R.v;
    }

    public final void c(int i) {
        int i2 = this.v;
        this.v = i;
        boolean z = false;
        boolean z2 = i2 == 0;
        if (i == 0) {
            z = true;
        }
        if (z2 != z) {
            fue N = this.f7297R.N();
            pso pso = N != null ? N.f3606R : null;
            if (pso == null) {
                return;
            }
            if (i == 0) {
                pso.c(pso.v - 1);
            } else {
                pso.c(pso.v + 1);
            }
        }
    }
}
