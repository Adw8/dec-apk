package defpackage;

/* renamed from: Ap  reason: default package */
/* loaded from: classes.dex */
public final class Ap extends Tx {
    public final qT[] R;

    public Ap(qT[] qTVarArr) {
        this.R = qTVarArr;
    }

    @Override // defpackage.Tx
    public final void R(Throwable th) {
        v();
    }

    public final String toString() {
        StringBuilder U = opT.U("DisposeHandlersOnCancel[");
        U.append(this.R);
        U.append(']');
        return U.toString();
    }

    public final void v() {
        for (qT qTVar : this.R) {
            jZi jzi = qTVar.f7355R;
            if (jzi == null) {
                jzi = null;
            }
            jzi.R();
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        Throwable th = (Throwable) obj;
        v();
        return o8s.R;
    }
}
