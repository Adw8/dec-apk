package defpackage;

/* renamed from: m6i  reason: default package */
/* loaded from: classes.dex */
public final class m6i extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f5931R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5932R;
    public final /* synthetic */ int X = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public m6i(cKA cka, boolean z, f_c f_c, ncu ncu, lR3 lr3, int i, int i2) {
        super(2);
        this.R = cka;
        this.f5932R = z;
        this.v = f_c;
        this.f5931R = ncu;
        this.c = lr3;
        this.O = i;
        this.L = i2;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                ((cKA) this.R).R(this.f5932R, (f_c) this.v, this.f5931R, (lR3) this.c, m88, this.O | 1, this.L);
                return;
            default:
                ((hw1) this.R).x((cY9) this.v, this.f5931R, (iEm) this.c, this.f5932R, m88, this.O | 1, this.L);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public m6i(hw1 hw1, cY9 cy9, ncu ncu, iEm iem, boolean z, int i, int i2) {
        super(2);
        this.R = hw1;
        this.v = cy9;
        this.f5931R = ncu;
        this.c = iem;
        this.f5932R = z;
        this.O = i;
        this.L = i2;
    }
}
