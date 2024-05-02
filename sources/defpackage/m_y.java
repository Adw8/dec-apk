package defpackage;

/* renamed from: m_y  reason: default package */
/* loaded from: classes.dex */
public final class m_y extends aFk implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ nhg R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public m_y(nhg nhg, int i, aOO aoo) {
        super(2, aoo);
        this.R = nhg;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((m_y) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nhg nhg = this.R;
            Integer num = new Integer(this.O);
            this.X = 1;
            if (nhg.R(num, this) == bgr) {
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
        return new m_y(this.R, this.O, aoo);
    }
}
