package defpackage;

/* renamed from: wa  reason: default package */
/* loaded from: classes.dex */
public final class wa extends t {
    public b R;

    /* renamed from: R  reason: collision with other field name */
    public u f7466R;

    public wa(q qVar) {
        if (qVar.size() < 1 || qVar.size() > 2) {
            StringBuilder U = opT.U("Bad sequence size: ");
            U.append(qVar.size());
            throw new IllegalArgumentException(U.toString());
        }
        this.f7466R = u.A(qVar.S(0));
        this.R = qVar.size() == 2 ? qVar.S(1) : null;
    }

    public wa(u uVar) {
        this.f7466R = uVar;
    }

    public wa(u uVar, b bVar) {
        this.f7466R = uVar;
        this.R = bVar;
    }

    public static wa o(Object obj) {
        if (obj instanceof wa) {
            return (wa) obj;
        }
        if (obj != null) {
            return new wa(q.A(obj));
        }
        return null;
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        W w = new W(2);
        w.R(this.f7466R);
        b bVar = this.R;
        if (bVar != null) {
            w.R(bVar);
        }
        return new iuV(w);
    }
}
