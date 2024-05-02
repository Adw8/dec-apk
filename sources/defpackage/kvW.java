package defpackage;

/* renamed from: kvW  reason: default package */
/* loaded from: classes.dex */
public final class kvW implements Runnable {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ kvW(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                akd akd = (akd) this.R;
                akd.f998R.endViewTransition(akd.R);
                ((akd) this.R).f1000R.c();
                return;
            case 1:
                jcp jcp = (jcp) this.R;
                jcp.f4981R.onDismiss(jcp.f4978R);
                return;
            default:
                ((hAW) this.R).J(true);
                return;
        }
    }
}
