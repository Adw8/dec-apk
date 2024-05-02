package defpackage;

/* renamed from: igS  reason: default package */
/* loaded from: classes.dex */
public final class igS extends k8G implements lR3 {
    public final /* synthetic */ fVb R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j4B f4690R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4691R;
    public final /* synthetic */ int X;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public igS(fVb fvb, boolean z, boolean z2, j4B j4b, int i) {
        super(3);
        this.R = fvb;
        this.f4691R = z;
        this.v = z2;
        this.f4690R = j4b;
        this.X = i;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        fB8 fb8 = (fB8) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        jr_.w(-379813807);
        fVb fvb = this.R;
        boolean z = this.f4691R;
        boolean z2 = this.v;
        j4B j4b = this.f4690R;
        int i = this.X;
        fvb.getClass();
        jr_.w(1167161306);
        h0T s = l6.s(new n3(!z ? fvb.i : z2 ? fvb.V : ((Boolean) msU.I(j4b, jr_, ((((i >> 3) & 7168) | (((i & 14) | (i & 112)) | (i & 896))) >> 6) & 14).getValue()).booleanValue() ? fvb.y : fvb.t), jr_);
        jr_.g(false);
        long j = ((n3) s.getValue()).f6279R;
        jr_.g(false);
        return new n3(j);
    }
}
