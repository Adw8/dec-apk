package defpackage;

/* renamed from: lZe  reason: default package */
/* loaded from: classes.dex */
public class lZe extends mO implements k5j {
    public final aOO R;

    public lZe(aOO aoo, nbD nbd) {
        super(nbd, true);
        this.R = aoo;
    }

    @Override // defpackage.nfJ
    public final boolean b() {
        return true;
    }

    @Override // defpackage.k5j
    public final k5j i() {
        aOO aoo = this.R;
        if (aoo instanceof k5j) {
            return (k5j) aoo;
        }
        return null;
    }

    @Override // defpackage.mO
    public void vz(Object obj) {
        this.R.Y(mLz.P(obj));
    }

    @Override // defpackage.nfJ
    public void y(Object obj) {
        ooA.V(n3x.U(this.R), mLz.P(obj), null);
    }
}
