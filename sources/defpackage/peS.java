package defpackage;

/* renamed from: peS  reason: default package */
/* loaded from: classes.dex */
public class peS extends nfJ {
    public final boolean R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public peS(pd2 pd2) {
        super(true);
        nfJ Y;
        boolean z = true;
        D(pd2);
        Hj p = p();
        T8 t8 = p instanceof T8 ? (T8) p : null;
        z = false;
        if (t8 != null && (Y = t8.Y()) != null) {
            while (!Y.s()) {
                Hj p2 = Y.p();
                T8 t82 = p2 instanceof T8 ? (T8) p2 : null;
                if (t82 != null) {
                    Y = t82.Y();
                    if (Y == null) {
                    }
                }
            }
            this.R = z;
        }
        this.R = z;
    }

    @Override // defpackage.nfJ
    public final boolean T() {
        return true;
    }

    @Override // defpackage.nfJ
    public final boolean s() {
        return this.R;
    }
}
