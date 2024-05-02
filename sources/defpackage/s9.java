package defpackage;

/* renamed from: s9  reason: default package */
/* loaded from: classes.dex */
public final class s9 extends pdD {
    public s9() {
        super(0);
    }

    @Override // defpackage.pdD
    public final void A(w8 w8Var, w8 w8Var2) {
        w8Var.f7451R = w8Var2;
    }

    @Override // defpackage.pdD
    public final boolean N(az azVar, WQ wq, WQ wq2) {
        synchronized (azVar) {
            if (azVar.f1496R != wq) {
                return false;
            }
            azVar.f1496R = wq2;
            return true;
        }
    }

    @Override // defpackage.pdD
    public final boolean P(az azVar, Object obj, Object obj2) {
        synchronized (azVar) {
            if (azVar.f1497R != obj) {
                return false;
            }
            azVar.f1497R = obj2;
            return true;
        }
    }

    @Override // defpackage.pdD
    public final void S(w8 w8Var, Thread thread) {
        w8Var.R = thread;
    }

    @Override // defpackage.pdD
    public final boolean j(az azVar, w8 w8Var, w8 w8Var2) {
        synchronized (azVar) {
            if (azVar.f1498R != w8Var) {
                return false;
            }
            azVar.f1498R = w8Var2;
            return true;
        }
    }
}
