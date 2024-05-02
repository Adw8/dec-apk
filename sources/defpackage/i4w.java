package defpackage;

import android.content.Context;

/* renamed from: i4w  reason: default package */
/* loaded from: classes.dex */
public final class i4w implements hKX {
    public final hKX L;
    public final hKX O;
    public final hKX R;
    public final hKX X;
    public final hKX Z;
    public final hKX c;
    public final /* synthetic */ int e;

    /* renamed from: e  reason: collision with other field name */
    public final hKX f4451e;
    public final hKX m;
    public final hKX v;

    public /* synthetic */ i4w(hKX hkx, hKX hkx2, hKX hkx3, hKX hkx4, hKX hkx5, hKX hkx6, hKX hkx7, hKX hkx8, hKX hkx9, int i) {
        this.e = i;
        this.R = hkx;
        this.v = hkx2;
        this.c = hkx3;
        this.f4451e = hkx4;
        this.X = hkx5;
        this.O = hkx6;
        this.L = hkx7;
        this.Z = hkx8;
        this.m = hkx9;
    }

    @Override // defpackage.hKX
    public final /* bridge */ /* synthetic */ Object R() {
        switch (this.e) {
            case 0:
                Context v = ((lNV) this.R).v();
                Object R = this.v.R();
                Object R2 = this.c.R();
                imF v2 = kIP.v(this.f4451e);
                Object R3 = this.X.R();
                Object R4 = this.O.R();
                return new e4X(v, (nt4) R, (bRH) R2, v2, (gMW) R3, (gkF) R4, kIP.v(this.L), kIP.v(this.Z), (n2N) this.m.R());
            default:
                Object R5 = this.R.R();
                return new bRH((nt4) R5, kIP.v(this.v), (icN) this.c.R(), (eRv) this.f4451e.R(), (dRj) this.X.R(), (cAd) this.O.R(), (ipk) this.L.R(), (i5a) this.Z.R(), (hFy) this.m.R());
        }
    }
}
