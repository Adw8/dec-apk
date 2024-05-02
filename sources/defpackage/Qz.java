package defpackage;

/* renamed from: Qz  reason: default package */
/* loaded from: classes.dex */
public final class Qz extends aFk implements iv7 {
    public final /* synthetic */ YX R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h2V f475R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f476R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Qz(aOO aoo, h2V h2v, YX yx) {
        super(2, aoo);
        this.f475R = h2v;
        this.R = yx;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((Qz) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            h2V h2v = this.f475R;
            hP3 m = this.R.m((jy_) this.f476R);
            this.X = 1;
            Object m2 = jjU.m(h2v, m, true, this);
            if (m2 != obj2) {
                m2 = o8s.R;
            }
            if (m2 == obj2) {
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
        Qz qz = new Qz(aoo, this.f475R, this.R);
        qz.f476R = obj;
        return qz;
    }
}
