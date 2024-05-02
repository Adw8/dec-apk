package defpackage;

/* renamed from: aas  reason: default package */
/* loaded from: classes.dex */
public final class aas extends pp5 implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f926R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l3X f927R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWW f928R;
    public int X;
    public final /* synthetic */ kg9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aas(l3X l3x, kg9 kg9, kg9 kg92, nWW nww, aOO aoo) {
        super(aoo);
        this.f927R = l3x;
        this.f926R = kg9;
        this.v = kg92;
        this.f928R = nww;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((aas) X((lAs) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            this.X = 1;
            obj = pjd.X((lAs) this.R, this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        phU phu = (phU) obj;
        if (phu != null) {
            phu.R();
            l3X l3x = this.f927R;
            l3x.f5573R = true;
            l3x.R.c(null);
            this.f926R.x(new aWo(phu.c));
            return o8s.R;
        }
        l3X l3x2 = this.f927R;
        l3x2.v = true;
        l3x2.R.c(null);
        kg9 kg9 = this.v;
        if (kg9 == null) {
            return null;
        }
        kg9.x(new aWo(((phU) this.f928R.R).c));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        aas aas = new aas(this.f927R, this.f926R, this.v, this.f928R, aoo);
        aas.R = obj;
        return aas;
    }
}
