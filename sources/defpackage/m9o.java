package defpackage;

/* renamed from: m9o  reason: default package */
/* loaded from: classes.dex */
public final class m9o extends k8G implements lR3 {
    public final /* synthetic */ iEm R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5953R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public m9o(iEm iem, boolean z, int i) {
        super(3);
        this.R = iem;
        this.f5953R = z;
        this.X = i;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        cY9 cy9 = (cY9) obj;
        m88 m88 = (m88) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 14) == 0) {
            intValue |= ((jr_) m88).O(cy9) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        f3L f3l = vC.f7433R;
        hw1 hw1 = hw1.U;
        iEm iem = this.R;
        boolean z = this.f5953R;
        int i = this.X;
        hw1.x(cy9, null, iem, z, m88, (intValue & 14) | 24576 | ((i >> 15) & 896) | (i & 7168), 2);
        return o8s.R;
    }
}
