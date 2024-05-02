package defpackage;

/* renamed from: mm2  reason: default package */
/* loaded from: classes.dex */
public final class mm2 extends aFk implements kg9 {
    public final /* synthetic */ aME R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String[] f6154R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mm2(aME ame, String[] strArr, aOO aoo) {
        super(1, aoo);
        this.R = ame;
        this.f6154R = strArr;
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
            bta.v(this.f6154R);
            this.X = 1;
            ame.getClass();
            obj = l6.a(iFn.f4518R, new ly7(ame, null, null, (String[]) bta.O(new String[bta.X()])), this);
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
        return new mm2(this.R, this.f6154R, (aOO) obj).O(o8s.R);
    }
}
