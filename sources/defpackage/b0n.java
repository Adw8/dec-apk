package defpackage;

/* renamed from: b0n  reason: default package */
/* loaded from: classes.dex */
public final class b0n implements Runnable {
    public final /* synthetic */ kuA R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ owe f1508R;
    public final /* synthetic */ int e;

    public /* synthetic */ b0n(owe owe, kuA kua, int i) {
        this.e = i;
        this.f1508R = owe;
        this.R = kua;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                if (this.f1508R.f7035R.contains(this.R)) {
                    kuA kua = this.R;
                    opT.R(kua.R, kua.f5473R.f7228R);
                    return;
                }
                return;
            default:
                this.f1508R.f7035R.remove(this.R);
                this.f1508R.v.remove(this.R);
                return;
        }
    }
}
