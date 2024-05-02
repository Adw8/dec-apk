package defpackage;

/* renamed from: aYe  reason: default package */
/* loaded from: classes.dex */
public final class aYe extends bA {
    public final oLj R;

    public aYe(oLj olj) {
        this.R = olj;
    }

    @Override // defpackage.Tx
    public final void R(Throwable th) {
        this.R.V();
    }

    public final String toString() {
        StringBuilder U = opT.U("RemoveOnCancel[");
        U.append(this.R);
        U.append(']');
        return U.toString();
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        R((Throwable) obj);
        return o8s.R;
    }
}
