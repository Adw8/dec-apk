package defpackage;

import java.util.concurrent.Executor;

/* renamed from: lxm  reason: default package */
/* loaded from: classes.dex */
public final class lxm implements fb {
    public final fb R;

    /* renamed from: R  reason: collision with other field name */
    public final Executor f5865R;

    public lxm(Executor executor, fb fbVar) {
        this.f5865R = executor;
        this.R = fbVar;
    }

    @Override // defpackage.fb
    public final j0 C() {
        return this.R.C();
    }

    @Override // defpackage.fb
    public final void H(Xf xf) {
        this.R.H(new f67(this, 2, xf));
    }

    @Override // defpackage.fb
    /* renamed from: R */
    public final fb clone() {
        return new lxm(this.f5865R, this.R.R());
    }

    @Override // defpackage.fb
    public final boolean c() {
        return this.R.c();
    }

    @Override // defpackage.fb
    public final void cancel() {
        this.R.cancel();
    }
}
