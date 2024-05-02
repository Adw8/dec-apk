package defpackage;

/* renamed from: Rh  reason: default package */
/* loaded from: classes.dex */
public final class Rh extends t {
    public isV R;

    /* renamed from: R  reason: collision with other field name */
    public q f498R;

    public Rh(q qVar) {
        this.f498R = qVar;
        if (qVar.size() == 3) {
            b S = qVar.S(0);
            this.R = S instanceof isV ? (isV) S : S != null ? new isV(q.A(S)) : null;
            wa.o(qVar.S(1));
            e.Q(qVar.S(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for a certificate");
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        return this.f498R;
    }
}
