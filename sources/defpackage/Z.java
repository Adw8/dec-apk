package defpackage;

/* renamed from: Z  reason: default package */
/* loaded from: classes.dex */
public abstract class Z extends O {
    public O R;

    /* renamed from: R  reason: collision with other field name */
    public X f655R;

    /* renamed from: R  reason: collision with other field name */
    public u f656R;
    public int e;
    public O v;

    public Z(u uVar, X x, O o, int i, O o2) {
        Y y;
        this.f656R = uVar;
        this.f655R = x;
        this.R = o;
        Q(i);
        this.e = i;
        if (i != 1) {
            y = i == 2 ? e.R : y;
            this.v = o2;
        }
        y = F.R;
        y.R(o2);
        this.v = o2;
    }

    public static O A(q qVar, int i) {
        if (qVar.size() > i) {
            return qVar.S(i).v();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    public static void Q(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(opT.Z("invalid encoding value: ", i));
        }
    }

    @Override // defpackage.O
    public final boolean J() {
        return true;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.i(40, z);
        n().K(zz, false);
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return n().Y(z);
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        u uVar = this.f656R;
        int i = 0;
        int hashCode = uVar == null ? 0 : uVar.hashCode();
        X x = this.f655R;
        int hashCode2 = hashCode ^ (x == null ? 0 : x.hashCode());
        O o = this.R;
        if (o != null) {
            i = o.hashCode();
        }
        return this.v.hashCode() ^ ((hashCode2 ^ i) ^ this.e);
    }

    public abstract q n();

    @Override // defpackage.O
    public final boolean o(O o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Z)) {
            return false;
        }
        Z z = (Z) o;
        return pdD.m(this.f656R, z.f656R) && pdD.m(this.f655R, z.f655R) && pdD.m(this.R, z.R) && this.e == z.e && this.v.h(z.v);
    }

    public Z(q qVar) {
        int i;
        O o;
        O A = A(qVar, 0);
        if (A instanceof u) {
            this.f656R = (u) A;
            A = A(qVar, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (A instanceof X) {
            this.f655R = (X) A;
            i++;
            A = A(qVar, i);
        }
        if (!(A instanceof Vz)) {
            this.R = A;
            i++;
            A = A(qVar, i);
        }
        if (qVar.size() != i + 1) {
            throw new IllegalArgumentException("input sequence too large");
        } else if (A instanceof Vz) {
            Vz vz = (Vz) A;
            int i2 = vz.O;
            Q(i2);
            this.e = i2;
            int i3 = vz.X;
            int i4 = vz.O;
            if (128 == i3) {
                if (i4 != 0) {
                    if (i4 == 1) {
                        o = (F) F.R.m(vz, false);
                    } else if (i4 == 2) {
                        o = (e) e.R.m(vz, false);
                    } else {
                        StringBuilder U = opT.U("invalid tag: ");
                        U.append(n3x.H(i3, i4));
                        throw new IllegalArgumentException(U.toString());
                    }
                } else if (vz.Q()) {
                    b bVar = vz.R;
                    o = (bVar instanceof t ? (t) bVar : bVar.v()).v();
                } else {
                    throw new IllegalStateException("object implicit - explicit expected.");
                }
                this.v = o;
                return;
            }
            StringBuilder U2 = opT.U("invalid tag: ");
            U2.append(n3x.H(i3, i4));
            throw new IllegalArgumentException(U2.toString());
        } else {
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
    }
}
