package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: hP3  reason: default package */
/* loaded from: classes.dex */
public final class hP3 extends mO implements k6z, gn {
    public final gn R;

    public hP3(nbD nbd, nJ nJVar) {
        super(nbd, true);
        this.R = nJVar;
    }

    @Override // defpackage.mO
    public final void BF(Throwable th, boolean z) {
        if (!this.R.m(th) && !z) {
            pdD.o(super.R, th);
        }
    }

    @Override // defpackage.nfJ
    public final void J(CancellationException cancellationException) {
        this.R.c(cancellationException);
        K(cancellationException);
    }

    @Override // defpackage.mO
    public final void Kl(Object obj) {
        o8s o8s = (o8s) obj;
        this.R.m(null);
    }

    @Override // defpackage.aZq
    public final Object L(aOO aoo) {
        return this.R.L(aoo);
    }

    @Override // defpackage.nDS
    public final Object N(Object obj, aOO aoo) {
        return this.R.N(obj, aoo);
    }

    @Override // defpackage.aZq
    public final Object P(aFk afk) {
        return this.R.P(afk);
    }

    @Override // defpackage.nDS
    public final boolean U() {
        return this.R.U();
    }

    @Override // defpackage.mO, defpackage.nfJ, defpackage.pd2
    public final boolean X() {
        return super.X();
    }

    @Override // defpackage.nfJ, defpackage.pd2, defpackage.aZq
    public final void c(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new h53(I(), null, this);
            }
            J(cancellationException);
        }
    }

    @Override // defpackage.nDS
    public final Object e(Object obj) {
        return this.R.e(obj);
    }

    @Override // defpackage.aZq
    public final Object g() {
        return this.R.g();
    }

    @Override // defpackage.nDS
    public final boolean m(Throwable th) {
        return this.R.m(th);
    }

    @Override // defpackage.aZq
    public final zM x() {
        return this.R.x();
    }
}
