package defpackage;

/* renamed from: Vx  reason: default package */
/* loaded from: classes.dex */
public final class Vx extends aFk implements lR3 {
    public final /* synthetic */ blo R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ gh f583R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ivW f584R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f585R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Vx(blo blo, ivW ivw, boolean z, gh ghVar, aOO aoo) {
        super(3, aoo);
        this.R = blo;
        this.f584R = ivw;
        this.f585R = z;
        this.f583R = ghVar;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            pby[] pbyArr = kxm.R;
            blo blo = this.R;
            int i2 = blo.e + 1;
            blo.e = i2;
            if (((long) i2) <= 60) {
                this.X = 1;
                if (n3x.Z(5000, this) == bgr) {
                    return bgr;
                }
            }
            return o8s.R;
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ivW ivw = this.f584R;
        ivw.H(gh.c(this.f583R, this.f585R, this.R, ivw));
        return o8s.R;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        h2V h2v = (h2V) obj;
        Throwable th = (Throwable) obj2;
        return new Vx(this.R, this.f584R, this.f585R, this.f583R, (aOO) obj3).O(o8s.R);
    }
}
