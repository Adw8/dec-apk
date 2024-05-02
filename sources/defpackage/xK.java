package defpackage;

/* renamed from: xK  reason: default package */
/* loaded from: classes.dex */
public final class xK extends aFk implements iv7 {
    public final /* synthetic */ bP R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ gIA f7470R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public xK(bP bPVar, gIA gia, aOO aoo) {
        super(2, aoo);
        this.R = bPVar;
        this.f7470R = gia;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((xK) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            Zs zs = this.R.R;
            if (zs == null) {
                zs = null;
            }
            gIA gia = this.f7470R;
            this.X = 1;
            h6T h6t = (h6T) zs;
            h6t.getClass();
            if (gia == null) {
                obj2 = o8s.R;
            } else {
                ltH lth = h6t.f4052R;
                if (lth != null) {
                    obj2 = h6t.m(gia, h6t.c(lth.R, gia), this);
                    if (obj2 != bgr) {
                        obj2 = o8s.R;
                    }
                } else {
                    throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
                }
            }
            if (obj2 == bgr) {
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
        return new xK(this.R, this.f7470R, aoo);
    }
}
