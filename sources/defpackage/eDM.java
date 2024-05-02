package defpackage;

/* renamed from: eDM  reason: default package */
/* loaded from: classes.dex */
public final class eDM extends aFk implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ o_d f3036R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eDM(o_d o_d, float f, aOO aoo) {
        super(2, aoo);
        this.f3036R = o_d;
        this.R = f;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((eDM) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            o_d o_d = this.f3036R;
            float f = this.R;
            this.X = 1;
            Object obj3 = gQc.C(o_d.f6850R, f, o02.y(0.0f, null, 7), this);
            if (obj3 != obj2) {
                obj3 = o8s.R;
            }
            if (obj3 == obj2) {
                return obj2;
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
        return new eDM(this.f3036R, this.R, aoo);
    }
}
