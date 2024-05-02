package defpackage;

/* renamed from: cVI  reason: default package */
/* loaded from: classes.dex */
public final class cVI extends k8G implements kg9 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cVI(Object obj, int i, Object obj2) {
        super(1);
        this.X = i;
        this.R = obj;
        this.v = obj2;
    }

    public final nRn R() {
        switch (this.X) {
            case 1:
                kVD kvd = (kVD) this.R;
                kvd.f5314R.v((ija) this.v);
                kvd.f5315R.R(Boolean.TRUE);
                return new fQb((kVD) this.R, 0, (ija) this.v);
            case 2:
                ((h5L) this.R).v.add((h5L) this.v);
                return new fQb((h5L) this.R, 1, (h5L) this.v);
            case 3:
                return new fQb((h5L) this.R, 2, (aGK) this.v);
            default:
                ((h5L) this.R).f4044R.add((c0y) this.v);
                return new fQb((h5L) this.R, 3, (c0y) this.v);
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                Hd hd = (Hd) obj;
                ((iv7) this.R).J(hd.v(), ((oHg) this.v).v.x(hd.f175R));
                return o8s.R;
            case 1:
                dlc dlc = (dlc) obj;
                return R();
            case 2:
                dlc dlc2 = (dlc) obj;
                return R();
            case 3:
                dlc dlc3 = (dlc) obj;
                return R();
            default:
                dlc dlc4 = (dlc) obj;
                return R();
        }
    }
}
