package defpackage;

/* renamed from: L9  reason: default package */
/* loaded from: classes.dex */
public final class L9 extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f274R;
    public final /* synthetic */ int X = 0;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ Object f275X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public L9(f_c f_c, ncu ncu, boolean z, iTW itw, p2E p2e, iv7 iv7, int i, int i2) {
        super(2);
        this.R = f_c;
        this.v = ncu;
        this.f274R = z;
        this.e = itw;
        this.c = p2e;
        this.f275X = iv7;
        this.O = i;
        this.L = i2;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 1:
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
                l1.c((aJk) this.e, (f_c) this.R, (ncu) this.v, this.f274R, (FP) this.f275X, (p2E) this.c, m88, this.O | 1, this.L);
                return;
            case 1:
                g4x.e((f_c) this.R, (ncu) this.v, this.f274R, (iTW) this.e, (p2E) this.c, (iv7) this.f275X, m88, this.O | 1, this.L);
                return;
            default:
                biy.R((kun) this.e, (String) this.R, (String) this.v, (String) this.f275X, this.f274R, (kg9) this.c, m88, this.O | 1, this.L);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public L9(kun kun, String str, String str2, String str3, boolean z, kg9 kg9, int i, int i2) {
        super(2);
        this.e = kun;
        this.R = str;
        this.v = str2;
        this.f275X = str3;
        this.f274R = z;
        this.c = kg9;
        this.O = i;
        this.L = i2;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public L9(aJk ajk, f_c f_c, ncu ncu, boolean z, FP fp, p2E p2e, int i, int i2) {
        super(2);
        this.e = ajk;
        this.R = f_c;
        this.v = ncu;
        this.f274R = z;
        this.f275X = fp;
        this.c = p2e;
        this.O = i;
        this.L = i2;
    }
}
