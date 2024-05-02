package defpackage;

/* renamed from: lA  reason: default package */
/* loaded from: classes.dex */
public final class lA extends aFk implements iv7 {
    public final /* synthetic */ _6 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f5603R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f5604R;
    public int X;
    public final /* synthetic */ dH9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lA(Object obj, _6 _6, dH9 dh9, dH9 dh92, aOO aoo) {
        super(2, aoo);
        this.f5604R = obj;
        this.R = _6;
        this.f5603R = dh9;
        this.v = dh92;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((lA) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            if (!n3x.v(this.f5604R, this.R.f687v.getValue())) {
                _6 _6 = this.R;
                Object obj2 = this.f5604R;
                dH9 dh9 = this.f5603R;
                int i2 = GO.R;
                this.X = 1;
                if (_6.R(_6, obj2, (jM) dh9.getValue(), this) == bgr) {
                    return bgr;
                }
            }
            return o8s.R;
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dH9 dh92 = this.v;
        int i3 = GO.R;
        kg9 kg9 = (kg9) dh92.getValue();
        if (kg9 != null) {
            kg9.x(this.R.c());
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new lA(this.f5604R, this.R, this.f5603R, this.v, aoo);
    }
}
