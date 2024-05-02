package defpackage;

/* renamed from: d5M  reason: default package */
/* loaded from: classes.dex */
public final class d5M {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final bz f2488R;

    /* renamed from: R  reason: collision with other field name */
    public final odN f2489R;

    static {
        k_s k_s = e29.R;
    }

    public d5M(String str, long j, int i) {
        this(new bz((i & 1) != 0 ? "" : str, null, 6), (i & 2) != 0 ? odN.v : j, (odN) null);
    }

    public static d5M R(d5M d5m, bz bzVar, long j, int i) {
        if ((i & 1) != 0) {
            bzVar = d5m.f2488R;
        }
        if ((i & 2) != 0) {
            j = d5m.R;
        }
        odN odn = (i & 4) != 0 ? d5m.f2489R : null;
        d5m.getClass();
        return new d5M(bzVar, j, odn);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5M)) {
            return false;
        }
        d5M d5m = (d5M) obj;
        return odN.R(this.R, d5m.R) && n3x.v(this.f2489R, d5m.f2489R) && n3x.v(this.f2488R, d5m.f2488R);
    }

    public final int hashCode() {
        long j = this.R;
        int i = odN.R;
        int X = opT.X(j, this.f2488R.hashCode() * 31, 31);
        odN odn = this.f2489R;
        return X + (odn != null ? Long.hashCode(odn.f6859R) : 0);
    }

    public final String toString() {
        StringBuilder U = opT.U("TextFieldValue(text='");
        U.append((Object) this.f2488R);
        U.append("', selection=");
        U.append((Object) odN.L(this.R));
        U.append(", composition=");
        U.append(this.f2489R);
        U.append(')');
        return U.toString();
    }

    public d5M(bz bzVar, long j, odN odn) {
        odN odn2;
        this.f2488R = bzVar;
        this.R = dtx.L(bzVar.R.length(), j);
        if (odn != null) {
            odn2 = new odN(dtx.L(bzVar.R.length(), odn.f6859R));
        } else {
            odn2 = null;
        }
        this.f2489R = odn2;
    }
}
