package defpackage;

/* renamed from: kRD  reason: default package */
/* loaded from: classes.dex */
public final class kRD implements oCF {
    public final cMR R;

    public kRD(Throwable th) {
        this.R = new cMR(this, th, 2);
    }

    @Override // defpackage.oCF
    public final ot7 L() {
        throw new IllegalStateException("unexpected call".toString());
    }

    @Override // defpackage.oCF
    public final oCF O() {
        throw new IllegalStateException("unexpected retry".toString());
    }

    @Override // defpackage.oCF
    public final cMR X() {
        return this.R;
    }

    @Override // defpackage.oCF
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel".toString());
    }

    @Override // defpackage.oCF
    public final cMR e() {
        return this.R;
    }

    @Override // defpackage.oCF
    public final boolean v() {
        return false;
    }
}
