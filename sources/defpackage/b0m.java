package defpackage;

import java.util.Enumeration;

/* renamed from: b0m  reason: default package */
/* loaded from: classes.dex */
public final class b0m extends t {
    public F R;

    /* renamed from: R  reason: collision with other field name */
    public X f1504R;

    /* renamed from: R  reason: collision with other field name */
    public _L f1505R;

    /* renamed from: R  reason: collision with other field name */
    public f9y f1506R;

    /* renamed from: R  reason: collision with other field name */
    public wa f1507R;

    public b0m(q qVar) {
        Enumeration d = qVar.d();
        X n = X.n(d.nextElement());
        this.f1504R = n;
        byte[] bArr = n.f614R;
        int length = bArr.length;
        int i = n.e;
        if (length - i <= 4) {
            int length2 = bArr.length;
            int max = Math.max(i, length2 - 4);
            int i2 = -1;
            int i3 = bArr[max] & -1;
            while (true) {
                max++;
                if (max >= length2) {
                    break;
                }
                i3 = (i3 << 8) | (bArr[max] & 255);
            }
            if (i3 < 0 || i3 > 1) {
                throw new IllegalArgumentException("invalid version for private key info");
            }
            this.f1507R = wa.o(d.nextElement());
            this.R = F.n(d.nextElement());
            while (d.hasMoreElements()) {
                Vz vz = (Vz) d.nextElement();
                int i4 = vz.O;
                if (i4 > i2) {
                    if (i4 == 0) {
                        this.f1505R = (_L) _L.R.m(vz, false);
                    } else if (i4 != 1) {
                        throw new IllegalArgumentException("unknown optional field in private key info");
                    } else if (i3 >= 1) {
                        this.f1506R = f9y.A(vz);
                    } else {
                        throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                    }
                    i2 = i4;
                } else {
                    throw new IllegalArgumentException("invalid optional field in private key info");
                }
            }
            return;
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        W w = new W(5);
        w.R(this.f1504R);
        w.R(this.f1507R);
        w.R(this.R);
        _L _l = this.f1505R;
        if (_l != null) {
            w.R(new oU(0, 1, _l, false));
        }
        f9y f9y = this.f1506R;
        if (f9y != null) {
            w.R(new oU(1, 1, f9y, false));
        }
        return new iuV(w);
    }
}
