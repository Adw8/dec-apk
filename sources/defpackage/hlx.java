package defpackage;

/* renamed from: hlx  reason: default package */
/* loaded from: classes.dex */
public abstract class hlx extends KZ {
    public final oLj R;
    public oLj v;

    public hlx(oLj olj) {
        this.R = olj;
    }

    @Override // defpackage.KZ
    public final void v(Object obj, Object obj2) {
        oLj olj = (oLj) obj;
        boolean z = obj2 == null;
        oLj olj2 = z ? this.R : this.v;
        if (olj2 != null && oLj.R.compareAndSet(olj, this, olj2) && z) {
            this.R.C(this.v);
        }
    }
}
