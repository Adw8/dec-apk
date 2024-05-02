package defpackage;

/* renamed from: osp  reason: default package */
/* loaded from: classes.dex */
public final class osp extends aFk implements iv7 {
    public final /* synthetic */ ck3 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ojR f6995R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public osp(ck3 ck3, ojR ojr, aOO aoo) {
        super(2, aoo);
        this.R = ck3;
        this.f6995R = ojr;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((osp) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ck3 ck3 = this.R;
            ojR ojr = this.f6995R;
            this.X = 1;
            Object y = ooA.y(ck3, new ohY(ojr, null), this);
            if (y != obj2) {
                y = o8s.R;
            }
            if (y == obj2) {
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
        return new osp(this.R, this.f6995R, aoo);
    }
}
