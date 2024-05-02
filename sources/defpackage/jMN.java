package defpackage;

/* renamed from: jMN  reason: default package */
/* loaded from: classes.dex */
public final class jMN extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f4909R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f4910R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l3X f4911R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f4912R;
    public int X;
    public final /* synthetic */ kg9 c;
    public final /* synthetic */ kg9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jMN(l3X l3x, lR3 lr3, jy_ jy_, kg9 kg9, kg9 kg92, kg9 kg93, aOO aoo) {
        super(2, aoo);
        this.f4911R = l3x;
        this.f4912R = lr3;
        this.f4909R = jy_;
        this.f4910R = kg9;
        this.v = kg92;
        this.c = kg93;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jMN) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            j2s j2s = new j2s(this.f4911R, this.f4912R, this.f4909R, this.f4910R, this.v, this.c, null);
            this.X = 1;
            if (((iTB) ((ck3) this.R)).g(j2s, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        jMN jmn = new jMN(this.f4911R, this.f4912R, this.f4909R, this.f4910R, this.v, this.c, aoo);
        jmn.R = obj;
        return jmn;
    }
}
