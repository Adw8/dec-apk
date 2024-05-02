package defpackage;

/* renamed from: iag  reason: default package */
/* loaded from: classes.dex */
public final class iag extends aFk implements iv7 {
    public final /* synthetic */ k2z R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iag(k2z k2z, aOO aoo) {
        super(2, aoo);
        this.R = k2z;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((iag) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            k2z k2z = this.R;
            this.X = 1;
            obj = k2z.R(k2z, this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(afN.R(-43164448183180L));
        }
        return obj;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new iag(this.R, aoo);
    }
}
