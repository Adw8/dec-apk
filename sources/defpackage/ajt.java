package defpackage;

import java.io.IOException;

/* renamed from: ajt  reason: default package */
/* loaded from: classes.dex */
public final class ajt extends t {
    public F R;

    /* renamed from: R  reason: collision with other field name */
    public u f994R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f995R;
    public static final u v = jQ.O("2.5.29.9");
    public static final u c = new u("2.5.29.17").S();
    public static final u e = jQ.O("2.5.29.18");
    public static final u X = new u("2.5.29.29").S();

    static {
        new u("2.5.29.14").S();
        new u("2.5.29.15").S();
        new u("2.5.29.16").S();
        new u("2.5.29.19").S();
        new u("2.5.29.20").S();
        new u("2.5.29.21").S();
        new u("2.5.29.23").S();
        new u("2.5.29.24").S();
        new u("2.5.29.27").S();
        new u("2.5.29.28").S();
        new u("2.5.29.30").S();
        new u("2.5.29.31").S();
        new u("2.5.29.32").S();
        new u("2.5.29.33").S();
        new u("2.5.29.35").S();
        new u("2.5.29.36").S();
        new u("2.5.29.37").S();
        new u("2.5.29.46").S();
        new u("2.5.29.54").S();
        new u("1.3.6.1.5.5.7.1.1").S();
        new u("1.3.6.1.5.5.7.1.11").S();
        new u("1.3.6.1.5.5.7.1.12").S();
        new u("1.3.6.1.5.5.7.1.2").S();
        new u("1.3.6.1.5.5.7.1.3").S();
        new u("1.3.6.1.5.5.7.1.4").S();
        new u("2.5.29.56").S();
        new u("2.5.29.55").S();
        new u("2.5.29.60").S();
    }

    public ajt(q qVar) {
        b bVar;
        g gVar;
        if (qVar.size() == 2) {
            this.f994R = u.A(qVar.S(0));
            this.f995R = false;
            bVar = qVar.S(1);
        } else if (qVar.size() == 3) {
            this.f994R = u.A(qVar.S(0));
            b S = qVar.S(1);
            Y y = g.R;
            if (S == null || (S instanceof g)) {
                gVar = (g) S;
            } else if (S instanceof byte[]) {
                try {
                    gVar = (g) g.R.X((byte[]) S);
                } catch (IOException e2) {
                    StringBuilder U = opT.U("failed to construct boolean from byte[]: ");
                    U.append(e2.getMessage());
                    throw new IllegalArgumentException(U.toString());
                }
            } else {
                StringBuilder U2 = opT.U("illegal object in getInstance: ");
                U2.append(S.getClass().getName());
                throw new IllegalArgumentException(U2.toString());
            }
            this.f995R = gVar.Q();
            bVar = qVar.S(2);
        } else {
            StringBuilder U3 = opT.U("Bad sequence size: ");
            U3.append(qVar.size());
            throw new IllegalArgumentException(U3.toString());
        }
        this.R = F.n(bVar);
    }

    @Override // defpackage.t
    public final boolean equals(Object obj) {
        if (!(obj instanceof ajt)) {
            return false;
        }
        ajt ajt = (ajt) obj;
        return ajt.f994R.h(this.f994R) && ajt.R.h(this.R) && ajt.f995R == this.f995R;
    }

    @Override // defpackage.t
    public final int hashCode() {
        if (this.f995R) {
            return this.f994R.hashCode() ^ this.R.hashCode();
        }
        return ~(this.f994R.hashCode() ^ this.R.hashCode());
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        W w = new W(3);
        w.R(this.f994R);
        if (this.f995R) {
            w.R(g.v);
        }
        w.R(this.R);
        return new iuV(w);
    }
}
