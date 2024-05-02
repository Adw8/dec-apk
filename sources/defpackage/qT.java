package defpackage;

import java.util.ArrayList;

/* renamed from: qT  reason: default package */
/* loaded from: classes.dex */
public final class qT extends pbU {
    public final /* synthetic */ MN R;

    /* renamed from: R  reason: collision with other field name */
    public jZi f7355R;

    /* renamed from: R  reason: collision with other field name */
    public final k0 f7356R;
    private volatile /* synthetic */ Object _disposer = null;

    public qT(MN mn, xx xxVar) {
        this.R = mn;
        this.f7356R = xxVar;
    }

    public final void I(Ap ap) {
        this._disposer = ap;
    }

    @Override // defpackage.pbU
    public final void h(Throwable th) {
        if (th != null) {
            xx xxVar = (xx) this.f7356R;
            xxVar.getClass();
            if (xxVar.z(new pag(th, false), null, null) != null) {
                xx xxVar2 = (xx) this.f7356R;
                xxVar2.C(xxVar2.e);
                Ap ap = (Ap) this._disposer;
                if (ap != null) {
                    ap.v();
                    return;
                }
                return;
            }
            return;
        }
        if (MN.R.decrementAndGet(this.R) == 0) {
            k0 k0Var = this.f7356R;
            htf[] htfArr = this.R.f291R;
            ArrayList arrayList = new ArrayList(htfArr.length);
            for (htf htf : htfArr) {
                arrayList.add(htf.j());
            }
            ((xx) k0Var).Y(arrayList);
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        h((Throwable) obj);
        return o8s.R;
    }
}
