package defpackage;

/* renamed from: nrU  reason: default package */
/* loaded from: classes.dex */
public final class nrU extends pp5 implements iv7 {
    public /* synthetic */ Object R;
    public int X;

    public nrU(aOO aoo) {
        super(aoo);
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((nrU) X((lAs) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            this.X = 1;
            obj = pjd.X((lAs) this.R, this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        nrU nru = new nrU(aoo);
        nru.R = obj;
        return nru;
    }
}
