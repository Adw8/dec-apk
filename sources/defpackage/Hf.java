package defpackage;

/* renamed from: Hf  reason: default package */
/* loaded from: classes.dex */
public final class Hf extends aFk implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ qc f181R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Hf(qc qcVar, long j, aOO aoo) {
        super(2, aoo);
        this.f181R = qcVar;
        this.R = j;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((Hf) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            lh8 lh8 = this.f181R.f7370R;
            long j = this.R;
            this.X = 1;
            if (lh8.c(j, this) == bgr) {
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
        return new Hf(this.f181R, this.R, aoo);
    }
}
