package defpackage;

/* renamed from: Bk  reason: default package */
/* loaded from: classes.dex */
public final class Bk extends t {
    public b R;

    /* renamed from: R  reason: collision with other field name */
    public u f43R;

    public Bk(q qVar) {
        this.f43R = (u) qVar.S(0);
        this.R = qVar.S(1);
    }

    public Bk(u uVar, b bVar) {
        this.f43R = uVar;
        this.R = bVar;
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        W w = new W(2);
        w.R(this.f43R);
        w.R(this.R);
        return new iuV(w);
    }
}
