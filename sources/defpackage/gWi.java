package defpackage;

/* renamed from: gWi  reason: default package */
/* loaded from: classes.dex */
public final class gWi extends aFk implements iv7 {
    public final /* synthetic */ m5f R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gWi(m5f m5f, aOO aoo) {
        super(2, aoo);
        this.R = m5f;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gWi) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            m5f m5f = this.R;
            this.X = 1;
            if (m5f.O(this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(afN.R(-2177575277452L));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new gWi(this.R, aoo);
    }
}