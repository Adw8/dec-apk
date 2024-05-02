package defpackage;

/* renamed from: lfH  reason: default package */
/* loaded from: classes.dex */
public final class lfH extends aFk implements kg9 {
    public final /* synthetic */ aME R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f5798R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String[] f5799R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lfH(aME ame, aOO aoo, kg9 kg9, String[] strArr) {
        super(1, aoo);
        this.R = ame;
        this.f5799R = strArr;
        this.f5798R = kg9;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            aME ame = this.R;
            btA bta = new btA(2);
            bta.R(this.R.f852R);
            bta.v(this.f5799R);
            kg9 kg9 = this.f5798R;
            this.X = 1;
            ame.getClass();
            obj = l6.a(iFn.f4518R, new ly7(ame, null, kg9, (String[]) bta.O(new String[bta.X()])), this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        return new lfH(this.R, (aOO) obj, this.f5798R, this.f5799R).O(o8s.R);
    }
}
