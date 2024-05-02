package defpackage;

/* renamed from: pbU  reason: default package */
/* loaded from: classes.dex */
public abstract class pbU extends oLj implements jZi, cav, kg9 {
    public nfJ R;

    @Override // defpackage.jZi
    public final void R() {
        Object E;
        nfJ Y = Y();
        do {
            E = Y.E();
            if (E instanceof pbU) {
                if (E != this) {
                    return;
                }
            } else if ((E instanceof cav) && ((cav) E).Z() != null) {
                V();
                return;
            } else {
                return;
            }
        } while (!nfJ.R.compareAndSet(Y, E, dTl.v));
    }

    @Override // defpackage.cav
    public final boolean X() {
        return true;
    }

    public final nfJ Y() {
        nfJ nfj = this.R;
        if (nfj != null) {
            return nfj;
        }
        return null;
    }

    @Override // defpackage.cav
    public final npH Z() {
        return null;
    }

    public abstract void h(Throwable th);

    @Override // defpackage.oLj
    public final String toString() {
        return getClass().getSimpleName() + '@' + aH9.G(this) + "[job@" + aH9.G(Y()) + ']';
    }
}
