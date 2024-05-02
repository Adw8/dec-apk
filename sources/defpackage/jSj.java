package defpackage;

/* renamed from: jSj  reason: default package */
/* loaded from: classes.dex */
public final class jSj extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ojR f4936R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jSj(ojR ojr, aOO aoo) {
        super(2, aoo);
        this.f4936R = ojr;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jSj) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ojR ojr = this.f4936R;
            this.X = 1;
            if (g4x.i((ck3) this.R, ojr, this) == bgr) {
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
        jSj jsj = new jSj(this.f4936R, aoo);
        jsj.R = obj;
        return jsj;
    }
}
