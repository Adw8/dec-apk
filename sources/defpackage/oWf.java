package defpackage;

/* renamed from: oWf  reason: default package */
/* loaded from: classes.dex */
public final class oWf extends aFk implements iv7 {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public bs4 f6841R;

    /* renamed from: R  reason: collision with other field name */
    public dRB f6842R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f6843R;
    public int X;
    public final /* synthetic */ long v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ bs4 f6844v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ dRB f6845v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oWf(bs4 bs4, dRB drb, long j, aOO aoo) {
        super(2, aoo);
        this.f6844v = bs4;
        this.f6845v = drb;
        this.v = j;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((oWf) X((gAN) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bs4 bs4;
        bs4 bs42;
        dRB drb;
        long j;
        nLK nlk = nLK.Horizontal;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        int i2 = 1;
        if (i == 0) {
            jjU.o(obj);
            bs42 = this.f6844v;
            jd2 jd2 = new jd2(bs42, new V4(bs42, 4, (gAN) this.f6843R));
            drb = this.f6845v;
            long j2 = this.v;
            n4N n4n = bs42.f1828R;
            long j3 = drb.R;
            float v = bs42.f1829R == nlk ? d_E.v(j2) : d_E.c(j2);
            if (bs42.f1831R) {
                v *= (float) -1;
            }
            this.f6843R = bs42;
            this.f6841R = bs42;
            this.f6842R = drb;
            this.R = j3;
            this.X = 1;
            obj = n4n.R(jd2, v, this);
            if (obj == bgr) {
                return bgr;
            }
            bs4 = bs42;
            j = j3;
        } else if (i == 1) {
            j = this.R;
            drb = this.f6842R;
            bs42 = this.f6841R;
            bs4 = (bs4) this.f6843R;
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float floatValue = ((Number) obj).floatValue();
        if (bs4.f1831R) {
            floatValue *= (float) -1;
        }
        float f = 0.0f;
        if (bs42.f1829R == nlk) {
            i2 = 2;
        } else {
            f = floatValue;
            floatValue = 0.0f;
        }
        drb.R = d_E.R(j, floatValue, f, i2);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        oWf owf = new oWf(this.f6844v, this.f6845v, this.v, aoo);
        owf.f6843R = obj;
        return owf;
    }
}
