package defpackage;

/* renamed from: oIU  reason: default package */
/* loaded from: classes.dex */
public final class oIU extends aFk implements iv7 {
    public final /* synthetic */ f_c R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f6735R;
    public int X;
    public final /* synthetic */ f_c c;
    public final /* synthetic */ f_c v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oIU(f_c f_c, f_c f_c2, f_c f_c3, h0T h0t, aOO aoo) {
        super(2, aoo);
        this.R = f_c;
        this.v = f_c2;
        this.c = f_c3;
        this.f6735R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((oIU) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            i31 l = l6.l(new h31(this.R, this.v, this.c, 2));
            tD tDVar = new tD(this.f6735R, 1);
            this.X = 1;
            if (l.v(tDVar, this) == bgr) {
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
        return new oIU(this.R, this.v, this.c, this.f6735R, aoo);
    }
}
