package defpackage;

/* renamed from: l23  reason: default package */
/* loaded from: classes.dex */
public final class l23 extends k8G implements kg9 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ f_c f5545R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f5546R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p6 f5547R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5548R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public l23(boolean z, p6 p6Var, int i, float f, kg9 kg9, f_c f_c) {
        super(1);
        this.f5548R = z;
        this.f5547R = p6Var;
        this.X = i;
        this.R = f;
        this.f5546R = kg9;
        this.f5545R = f_c;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        bNL bnl = (bNL) obj;
        if (!this.f5548R) {
            icv[] icvArr = onS.f6950R;
            ((kEW) bnl).c(dwC.m, o8s.R);
        }
        Ch ch = new Ch(this.f5547R, this.X, this.R, this.f5546R, this.f5545R);
        icv[] icvArr2 = onS.f6950R;
        ((kEW) bnl).c(jGN.O, new Tp(null, ch));
        return o8s.R;
    }
}
