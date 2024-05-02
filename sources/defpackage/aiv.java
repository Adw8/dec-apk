package defpackage;

/* renamed from: aiv  reason: default package */
/* loaded from: classes.dex */
public final class aiv extends aFk implements iv7 {
    public final /* synthetic */ m5f R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(m5f m5f, aOO aoo) {
        super(2, aoo);
        this.R = m5f;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((aiv) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            m5f m5f = this.R;
            this.X = 1;
            obj = m5f.c(m5f, this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(afN.R(-45634054378380L));
        }
        return obj;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new aiv(this.R, aoo);
    }
}
