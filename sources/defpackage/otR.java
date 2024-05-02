package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: otR  reason: default package */
/* loaded from: classes.dex */
public final class otR extends lZe {
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(otR.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public otR(aOO aoo, nbD nbd) {
        super(aoo, nbd);
    }

    public final Object pG() {
        boolean z;
        while (true) {
            int i = this._decision;
            z = false;
            if (i == 0) {
                if (R.compareAndSet(this, 0, 1)) {
                    z = true;
                    break;
                }
            } else if (i != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            return bGR.COROUTINE_SUSPENDED;
        }
        Object G = dTl.G(E());
        if (!(G instanceof pag)) {
            return G;
        }
        throw ((pag) G).f7100R;
    }

    @Override // defpackage.lZe, defpackage.mO
    public final void vz(Object obj) {
        boolean z;
        while (true) {
            int i = this._decision;
            z = false;
            if (i == 0) {
                if (R.compareAndSet(this, 0, 2)) {
                    z = true;
                    break;
                }
            } else if (i != 1) {
                throw new IllegalStateException("Already resumed".toString());
            }
        }
        if (!z) {
            ooA.V(n3x.U(((lZe) this).R), mLz.P(obj), null);
        }
    }

    @Override // defpackage.lZe, defpackage.nfJ
    public final void y(Object obj) {
        vz(obj);
    }
}
