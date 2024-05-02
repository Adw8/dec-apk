package defpackage;

/* renamed from: Yw  reason: default package */
/* loaded from: classes.dex */
public final class Yw extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ h4f R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f649R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f650R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kIU f651R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f652R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f653R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f654R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Yw(Object obj, boolean z, ncu ncu, kIU kiu, h4f h4f, String str, lR3 lr3, int i, int i2, int i3) {
        super(2);
        this.X = i3;
        this.f649R = obj;
        this.f654R = z;
        this.f653R = ncu;
        this.f651R = kiu;
        this.R = h4f;
        this.f650R = str;
        this.f652R = lr3;
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
                dTl.c((kM4) this.f649R, this.f654R, this.f653R, this.f651R, this.R, this.f650R, this.f652R, m88, this.O | 1, this.L);
                return;
            default:
                dTl.v((FI) this.f649R, this.f654R, this.f653R, this.f651R, this.R, this.f650R, this.f652R, m88, this.O | 1, this.L);
                return;
        }
    }
}
