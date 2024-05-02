package defpackage;

/* renamed from: dsZ  reason: default package */
/* loaded from: classes.dex */
public final class dsZ extends k8G implements kg9 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dsZ(int i, kg9 kg9, m9m m9m, bBk bbk, mBF mbf, int i2, int i3) {
        super(1);
        this.X = i3;
        this.O = i;
        this.R = kg9;
        this.v = m9m;
        this.c = bbk;
        this.e = mbf;
        this.L = i2;
    }

    public final void R(mJR mjr) {
        switch (this.X) {
            case 0:
                mjr.R(this.O, (kg9) this.R, ih.H, aH9.u(new pd3((m9m) this.v, (bBk) this.c, (mBF) this.e, this.L, 0), true, 1889356237));
                return;
            default:
                mjr.R(this.O, (kg9) this.R, ih.H, aH9.u(new pd3((m9m) this.v, (bBk) this.c, (mBF) this.e, this.L, 1), true, -70560628));
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                R((mJR) obj);
                break;
            case 1:
                R((mJR) obj);
                break;
            default:
                PO.v((h57) obj, (l0f) this.R, (pc0) this.v, ((mZf) this.c).getLayoutDirection(), this.O, this.L, (mz) this.e);
                break;
        }
        return o8s.R;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dsZ(l0f l0f, pc0 pc0, mZf mzf, int i, int i2, mz mzVar) {
        super(1);
        this.X = 2;
        this.R = l0f;
        this.v = pc0;
        this.c = mzf;
        this.O = i;
        this.L = i2;
        this.e = mzVar;
    }
}
