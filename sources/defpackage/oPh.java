package defpackage;

/* renamed from: oPh  reason: default package */
/* loaded from: classes.dex */
public final class oPh extends k8G implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f6818R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oPh(long j, iv7 iv7, int i) {
        super(2);
        this.X = i;
        this.R = j;
        this.f6818R = iv7;
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
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                c5p.v(this.R, null, this.f6818R, m88, 0, 2);
                return;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                c5p.v(this.R, null, this.f6818R, m88, 0, 2);
                return;
        }
    }
}
