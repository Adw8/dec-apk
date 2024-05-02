package defpackage;

/* renamed from: mPB  reason: default package */
/* loaded from: classes.dex */
public final class mPB implements hKX {
    public final hKX R;
    public final hKX X;
    public final hKX c;
    public final /* synthetic */ int e;

    /* renamed from: e  reason: collision with other field name */
    public final hKX f6030e;
    public final hKX v;

    public /* synthetic */ mPB(hKX hkx, j58 j58, hKX hkx2, hKX hkx3, hKX hkx4, int i) {
        this.e = i;
        this.R = hkx;
        this.v = j58;
        this.c = hkx2;
        this.f6030e = hkx3;
        this.X = hkx4;
    }

    @Override // defpackage.hKX
    public final /* bridge */ /* synthetic */ Object R() {
        switch (this.e) {
            case 0:
                Object R = this.R.R();
                return new icN((dRx) R, kIP.v(this.v), kIP.v(this.c), (gMW) this.f6030e.R(), (n2N) this.X.R());
            default:
                Object R2 = this.R.R();
                return new i5a((dRx) R2, kIP.v(this.v), (nt4) this.c.R(), kIP.v(this.f6030e), (gMW) this.X.R());
        }
    }
}
