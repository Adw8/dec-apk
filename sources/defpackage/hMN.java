package defpackage;

import java.util.Enumeration;

/* renamed from: hMN  reason: default package */
/* loaded from: classes.dex */
public final class hMN extends t {
    public f9y R;

    /* renamed from: R  reason: collision with other field name */
    public wa f4215R;

    public hMN(q qVar) {
        if (qVar.size() == 2) {
            Enumeration d = qVar.d();
            this.f4215R = wa.o(d.nextElement());
            this.R = f9y.S(d.nextElement());
            return;
        }
        StringBuilder U = opT.U("Bad sequence size: ");
        U.append(qVar.size());
        throw new IllegalArgumentException(U.toString());
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        W w = new W(2);
        w.R(this.f4215R);
        w.R(this.R);
        return new iuV(w);
    }
}
