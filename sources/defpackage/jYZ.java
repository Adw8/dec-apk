package defpackage;

/* renamed from: jYZ  reason: default package */
/* loaded from: classes.dex */
public final class jYZ extends aFk implements iv7 {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ gn f4961R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4962R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nLK f4963R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4964R;
    public int X;
    public final /* synthetic */ dH9 v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f4965v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jYZ(boolean z, dH9 dh9, dH9 dh92, nLK nlk, gn gnVar, boolean z2, aOO aoo) {
        super(2, aoo);
        this.f4964R = z;
        this.R = dh9;
        this.v = dh92;
        this.f4963R = nlk;
        this.f4961R = gnVar;
        this.f4965v = z2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jYZ) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ck3 ck3 = (ck3) this.f4962R;
            if (!this.f4964R) {
                return o8s.R;
            }
            fsl fsl = new fsl(ck3, this.R, this.v, this.f4963R, this.f4961R, this.f4965v, null);
            this.X = 1;
            if (jjU.L(fsl, this) == bgr) {
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
        jYZ jyz = new jYZ(this.f4964R, this.R, this.v, this.f4963R, this.f4961R, this.f4965v, aoo);
        jyz.f4962R = obj;
        return jyz;
    }
}
