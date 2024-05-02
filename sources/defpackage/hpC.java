package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: hpC  reason: default package */
/* loaded from: classes.dex */
public final class hpC extends xZ implements pd2 {
    public static final hpC R = new hpC();

    public hpC() {
        super(hw1.O);
    }

    @Override // defpackage.pd2
    public final boolean B() {
        return false;
    }

    @Override // defpackage.pd2
    public final boolean X() {
        return true;
    }

    @Override // defpackage.pd2
    public final CancellationException Z() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.pd2, defpackage.aZq
    public final void c(CancellationException cancellationException) {
    }

    @Override // defpackage.pd2
    public final Object d(aOO aoo) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.pd2
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.pd2
    public final jZi l(kg9 kg9) {
        return orE.R;
    }

    @Override // defpackage.pd2
    public final jZi q(boolean z, boolean z2, kg9 kg9) {
        return orE.R;
    }

    @Override // defpackage.pd2
    public final Hj t(nfJ nfj) {
        return orE.R;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
