package defpackage;

/* renamed from: mNo  reason: default package */
/* loaded from: classes.dex */
public final class mNo extends aFk implements iv7 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public kz5 f6027R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ze f6028R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mNo(ze zeVar, h0T h0t, aOO aoo) {
        super(2, aoo);
        this.f6028R = zeVar;
        this.R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((mNo) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        kz5 kz5;
        Throwable th;
        kz5 kz52;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                ioS ios = (ioS) this.R.getValue();
                kz5 = ios != null ? ((aIZ) ios).c() : null;
                try {
                    ze zeVar = this.f6028R;
                    this.f6027R = kz5;
                    this.X = 1;
                    if (((M4) zeVar).R(null, this) == bgr) {
                        return bgr;
                    }
                    kz52 = kz5;
                } catch (Throwable th2) {
                    th = th2;
                    if (kz5 != null) {
                        kz5.v();
                    }
                    throw th;
                }
            } else if (i == 1) {
                kz52 = this.f6027R;
                jjU.o(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (kz52 != null) {
                kz52.v();
            }
            return o8s.R;
        } catch (Throwable th3) {
            th = th3;
            kz5 = null;
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new mNo(this.f6028R, this.R, aoo);
    }
}
