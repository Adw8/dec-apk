package defpackage;

/* renamed from: gGw  reason: default package */
/* loaded from: classes.dex */
public final class gGw extends aFk implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hNI f3702R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3703R;
    public int X;
    public final /* synthetic */ float v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gGw(boolean z, hNI hni, float f, float f2, aOO aoo) {
        super(2, aoo);
        this.f3703R = z;
        this.f3702R = hni;
        this.R = f;
        this.v = f2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gGw) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            if (this.f3703R) {
                hNI hni = this.f3702R;
                float f = this.R;
                this.X = 1;
                if (gQc.C(hni, f, o02.y(0.0f, null, 7), this) == bgr) {
                    return bgr;
                }
            } else {
                hNI hni2 = this.f3702R;
                float f2 = this.v;
                this.X = 2;
                if (gQc.C(hni2, f2, o02.y(0.0f, null, 7), this) == bgr) {
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
        return new gGw(this.f3703R, this.f3702R, this.R, this.v, aoo);
    }
}
