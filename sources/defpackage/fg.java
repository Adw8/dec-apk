package defpackage;

/* renamed from: fg  reason: default package */
/* loaded from: classes.dex */
public final class fg extends bA {
    public final cLA R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nJ f3497R;

    public fg(nJ nJVar, cLA cla) {
        this.f3497R = nJVar;
        this.R = cla;
    }

    @Override // defpackage.Tx
    public final void R(Throwable th) {
        if (this.R.V()) {
            this.f3497R.getClass();
        }
    }

    public final String toString() {
        StringBuilder U = opT.U("RemoveReceiveOnCancel[");
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
