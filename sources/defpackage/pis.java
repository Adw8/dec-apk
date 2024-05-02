package defpackage;

/* renamed from: pis  reason: default package */
/* loaded from: classes.dex */
public final class pis extends k8G implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f7199R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kMk f7200R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pis(long j, kMk kmk, iv7 iv7) {
        super(2);
        this.R = j;
        this.f7200R = kmk;
        this.f7199R = iv7;
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
        f3L f3l = vC.f7433R;
        c5p.v(this.R, this.f7200R, this.f7199R, m88, 0, 0);
        return o8s.R;
    }
}
