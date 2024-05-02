package defpackage;

/* renamed from: Hh  reason: default package */
/* loaded from: classes.dex */
public final class Hh extends aFk implements iv7 {
    public final /* synthetic */ Zh R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Hh(Zh zh, aOO aoo) {
        super(2, aoo);
        this.R = zh;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((Hh) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            Zh zh = this.R;
            m5f m5f = zh.R;
            if (m5f == null) {
                m5f = null;
            }
            ivW ivw = m5f.e;
            OP op = new OP(zh, 0);
            this.X = 1;
            if (mxC.m(this, ivw, op) == bgr) {
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
        return new Hh(this.R, aoo);
    }
}
