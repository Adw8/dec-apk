package defpackage;

/* renamed from: ixo  reason: default package */
/* loaded from: classes.dex */
public final class ixo extends aFk implements iv7 {
    public h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f4783R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4784R;
    public int X;
    public final /* synthetic */ h0T v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ixo(p2E p2e, h0T h0t, aOO aoo, boolean z) {
        super(2, aoo);
        this.v = h0t;
        this.f4784R = z;
        this.f4783R = p2e;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((ixo) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        h0T h0t;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            oDO odo = (oDO) this.v.getValue();
            if (odo != null) {
                boolean z = this.f4784R;
                p2E p2e = this.f4783R;
                h0t = this.v;
                nto osh = z ? new oSH(odo) : new hPn(odo);
                if (p2e != null) {
                    this.R = h0t;
                    this.X = 1;
                    if (p2e.R(osh, this) == bgr) {
                        return bgr;
                    }
                    h0t = h0t;
                }
                h0t.R(null);
            }
            return o8s.R;
        } else if (i == 1) {
            h0t = this.R;
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h0t.R(null);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new ixo(this.f4783R, this.v, aoo, this.f4784R);
    }
}
