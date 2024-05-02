package defpackage;

/* renamed from: sY  reason: default package */
/* loaded from: classes.dex */
public final class sY extends cLA {
    public final k0 R;

    /* renamed from: R  reason: collision with other field name */
    public final zM f7413R;

    public sY(zM zMVar, xx xxVar) {
        this.f7413R = zMVar;
        this.R = xxVar;
    }

    @Override // defpackage.cLA
    public final kg9 Y(Object obj) {
        kg9 kg9 = ((DW) this.f7413R.f7499R).f76R;
        if (kg9 != null) {
            return new ofd(kg9, obj, ((xx) this.R).f7480R, 21);
        }
        return null;
    }

    @Override // defpackage.obE
    public final void c(Object obj) {
        this.f7413R.R = obj;
        xx xxVar = (xx) this.R;
        xxVar.C(xxVar.e);
    }

    @Override // defpackage.obE
    public final lmI e(Object obj) {
        if (((xx) this.R).z(Boolean.TRUE, null, Y(obj)) == null) {
            return null;
        }
        return mxC.f6247R;
    }

    @Override // defpackage.cLA
    public final void h(i5 i5Var) {
        lmI lmi;
        if (i5Var.R == null) {
            lmi = ((xx) this.R).z(Boolean.FALSE, null, null);
        } else {
            k0 k0Var = this.R;
            Throwable n = i5Var.n();
            xx xxVar = (xx) k0Var;
            xxVar.getClass();
            lmi = xxVar.z(new pag(n, false), null, null);
        }
        if (lmi != null) {
            this.f7413R.R = i5Var;
            xx xxVar2 = (xx) this.R;
            xxVar2.C(xxVar2.e);
        }
    }

    @Override // defpackage.oLj
    public final String toString() {
        StringBuilder U = opT.U("ReceiveHasNext@");
        U.append(aH9.G(this));
        return U.toString();
    }
}
