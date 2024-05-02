package defpackage;

/* renamed from: d95  reason: default package */
/* loaded from: classes.dex */
public final class d95 implements oCF {
    public final ot7 R;

    public d95(ot7 ot7) {
        this.R = ot7;
    }

    @Override // defpackage.oCF
    public final ot7 L() {
        return this.R;
    }

    @Override // defpackage.oCF
    public final oCF O() {
        throw new IllegalStateException("unexpected retry".toString());
    }

    @Override // defpackage.oCF
    public final cMR X() {
        throw new IllegalStateException("already connected".toString());
    }

    @Override // defpackage.oCF
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel".toString());
    }

    @Override // defpackage.oCF
    public final cMR e() {
        throw new IllegalStateException("already connected".toString());
    }

    @Override // defpackage.oCF
    public final boolean v() {
        return true;
    }
}
