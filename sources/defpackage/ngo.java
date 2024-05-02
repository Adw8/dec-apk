package defpackage;

/* renamed from: ngo  reason: default package */
/* loaded from: classes.dex */
public final class ngo implements jZi {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public final aOO f6509R;

    /* renamed from: R  reason: collision with other field name */
    public final bLS f6510R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f6511R;

    public ngo(bLS bls, long j, Object obj, xx xxVar) {
        this.f6510R = bls;
        this.R = j;
        this.f6511R = obj;
        this.f6509R = xxVar;
    }

    @Override // defpackage.jZi
    public final void R() {
        bLS bls = this.f6510R;
        synchronized (bls) {
            if (this.R >= bls.j()) {
                Object[] objArr = bls.f1608R;
                int i = (int) this.R;
                if (objArr[(objArr.length - 1) & i] == this) {
                    objArr[i & (objArr.length - 1)] = pip.R;
                    bls.H();
                }
            }
        }
    }
}
