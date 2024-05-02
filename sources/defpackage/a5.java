package defpackage;

/* renamed from: a5  reason: default package */
/* loaded from: classes.dex */
public final class a5 extends k8G implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ long f727R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f728R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public a5(long j, float f, iv7 iv7, int i) {
        super(2);
        this.f727R = j;
        this.R = f;
        this.f728R = iv7;
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        m88 m88 = (m88) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        l6.R(new bkv[]{kft.R.v(new n3(n3.v(this.f727R, this.R)))}, this.f728R, m88, ((this.X >> 12) & 112) | 8);
        return o8s.R;
    }
}
