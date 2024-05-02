package defpackage;

/* renamed from: dR6  reason: default package */
/* loaded from: classes.dex */
public abstract class dR6 {
    public static final /* synthetic */ int c = 0;
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public nQA f2606R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2607R;
    public int v;

    public dR6(int i, nQA nqa) {
        int i2;
        int i3;
        int i4;
        this.f2606R = nqa;
        this.R = i;
        if (i != 0) {
            nQA X = X();
            h5 h5Var = jwU.f5149R;
            int[] iArr = X.f6388R;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = X.v;
                if (j != 0) {
                    i4 = X.e;
                    i3 = g4x.C(j);
                } else {
                    long j2 = X.f6387R;
                    if (j2 != 0) {
                        i4 = X.e + 64;
                        i3 = g4x.C(j2);
                    }
                }
                i = i4 + i3;
            }
            synchronized (jwU.f5150R) {
                i2 = jwU.f5147R.R(i);
            }
        } else {
            i2 = -1;
        }
        this.v = i2;
    }

    public static void P(dR6 dr6) {
        jwU.f5149R.o(dr6);
    }

    public abstract void C(nmZ nmz);

    public abstract void H();

    public abstract boolean L();

    public void N() {
        int i = this.v;
        if (i >= 0) {
            jwU.N(i);
            this.v = -1;
        }
    }

    public abstract kg9 O();

    public final void R() {
        synchronized (jwU.f5150R) {
            v();
            N();
        }
    }

    public abstract void U();

    public nQA X() {
        return this.f2606R;
    }

    public abstract kg9 Z();

    public abstract void c();

    public int e() {
        return this.R;
    }

    public void g(nQA nqa) {
        this.f2606R = nqa;
    }

    public void j(int i) {
        this.R = i;
    }

    public final dR6 m() {
        h5 h5Var = jwU.f5149R;
        dR6 dr6 = (dR6) h5Var.H();
        h5Var.o(this);
        return dr6;
    }

    public void v() {
        jwU.f5153R = jwU.f5153R.v(e());
    }

    public abstract void x();

    public abstract dR6 y(kg9 kg9);
}
