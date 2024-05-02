package defpackage;

/* renamed from: hwA  reason: default package */
/* loaded from: classes.dex */
public final class hwA implements hKX {
    public final hKX R;
    public final hKX c;
    public final /* synthetic */ int e;

    /* renamed from: e  reason: collision with other field name */
    public final hKX f4422e;
    public final hKX v;

    public /* synthetic */ hwA(hKX hkx, hKX hkx2, hKX hkx3, hKX hkx4, int i) {
        this.e = i;
        this.R = hkx;
        this.v = hkx2;
        this.c = hkx3;
        this.f4422e = hkx4;
    }

    @Override // defpackage.hKX
    public final /* bridge */ /* synthetic */ Object R() {
        switch (this.e) {
            case 0:
                return new bNW(((lNV) this.R).v(), (dRx) this.v.R(), (j5V) this.c.R(), (kX6) this.f4422e.R());
            case 1:
                Object R = this.R.R();
                imF v = kIP.v(this.v);
                Object R2 = this.c.R();
                kIP.v(this.f4422e);
                return new nt4((dRx) R, v, (gMW) R2);
            default:
                Object R3 = this.R.R();
                Object R4 = this.v.R();
                return new hFy((nt4) R3, (dRx) R4, (be2) this.c.R(), (bu3) this.f4422e.R());
        }
    }
}
