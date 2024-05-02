package defpackage;

/* renamed from: IV  reason: default package */
/* loaded from: classes.dex */
public final class IV extends aFk implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ qc f184R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f185R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public IV(boolean z, qc qcVar, long j, aOO aoo) {
        super(2, aoo);
        this.f185R = z;
        this.f184R = qcVar;
        this.R = j;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((IV) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            if (!this.f185R) {
                lh8 lh8 = this.f184R.f7370R;
                int i2 = d_E.R;
                long j = d_E.v;
                long j2 = this.R;
                this.X = 1;
                if (lh8.R(j, j2, this) == bgr) {
                    return bgr;
                }
            } else {
                lh8 lh82 = this.f184R.f7370R;
                long j3 = this.R;
                int i3 = d_E.R;
                long j4 = d_E.v;
                this.X = 2;
                if (lh82.R(j3, j4, this) == bgr) {
                    return bgr;
                }
            }
        } else if (i == 1 || i == 2) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new IV(this.f185R, this.f184R, this.R, aoo);
    }
}
