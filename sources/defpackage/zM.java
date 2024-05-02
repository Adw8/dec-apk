package defpackage;

/* renamed from: zM  reason: default package */
/* loaded from: classes.dex */
public final class zM {
    public Object R = l6.e;

    /* renamed from: R  reason: collision with other field name */
    public final nJ f7499R;

    public zM(nJ nJVar) {
        this.f7499R = nJVar;
    }

    public final Object R(plU plu) {
        Object obj = this.R;
        lmI lmi = l6.e;
        boolean z = false;
        if (obj != lmi) {
            if (obj instanceof i5) {
                i5 i5Var = (i5) obj;
                if (i5Var.R != null) {
                    Throwable n = i5Var.n();
                    int i = jmy.R;
                    throw n;
                }
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        Object h = this.f7499R.h();
        this.R = h;
        if (h != lmi) {
            if (h instanceof i5) {
                i5 i5Var2 = (i5) h;
                if (i5Var2.R != null) {
                    Throwable n2 = i5Var2.n();
                    int i2 = jmy.R;
                    throw n2;
                }
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        xx x = n3x.x(n3x.U(plu));
        sY sYVar = new sY(this, x);
        while (true) {
            if (this.f7499R.i(sYVar)) {
                nJ nJVar = this.f7499R;
                nJVar.getClass();
                x.y(new fg(nJVar, sYVar));
                break;
            }
            Object h2 = this.f7499R.h();
            this.R = h2;
            if (h2 instanceof i5) {
                i5 i5Var3 = (i5) h2;
                if (i5Var3.R == null) {
                    x.Y(Boolean.FALSE);
                } else {
                    x.Y(new bvw(i5Var3.n()));
                }
            } else if (h2 != l6.e) {
                Boolean bool = Boolean.TRUE;
                kg9 kg9 = ((DW) this.f7499R).f76R;
                x.h(bool, x.e, kg9 != null ? new ofd(kg9, h2, x.f7480R, 21) : null);
            }
        }
        return x.P();
    }

    public final Object v() {
        Object obj = this.R;
        if (!(obj instanceof i5)) {
            lmI lmi = l6.e;
            if (obj != lmi) {
                this.R = lmi;
                return obj;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
        Throwable n = ((i5) obj).n();
        int i = jmy.R;
        throw n;
    }
}
