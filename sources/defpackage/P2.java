package defpackage;

/* renamed from: P2  reason: default package */
/* loaded from: classes.dex */
public class P2 extends cLA {
    public final k0 R;
    public final int e;

    public P2(xx xxVar, int i) {
        this.R = xxVar;
        this.e = i;
    }

    @Override // defpackage.obE
    public final void c(Object obj) {
        xx xxVar = (xx) this.R;
        xxVar.C(xxVar.e);
    }

    @Override // defpackage.obE
    public final lmI e(Object obj) {
        if (((xx) this.R).z(this.e == 1 ? new wC(obj) : obj, null, Y(obj)) == null) {
            return null;
        }
        return mxC.f6247R;
    }

    @Override // defpackage.cLA
    public final void h(i5 i5Var) {
        if (this.e == 1) {
            this.R.Y(new wC(new a4(i5Var.R)));
        } else {
            this.R.Y(new bvw(i5Var.n()));
        }
    }

    @Override // defpackage.oLj
    public final String toString() {
        StringBuilder U = opT.U("ReceiveElement@");
        U.append(aH9.G(this));
        U.append("[receiveMode=");
        return jQ.P(U, this.e, ']');
    }
}
