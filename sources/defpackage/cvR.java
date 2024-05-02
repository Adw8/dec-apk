package defpackage;

import java.util.ArrayList;

/* renamed from: cvR  reason: default package */
/* loaded from: classes.dex */
public final class cvR extends aFk implements iv7 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j4B f2455R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cvR(j4B j4b, h0T h0t, aOO aoo) {
        super(2, aoo);
        this.f2455R = j4b;
        this.R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((cvR) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ArrayList arrayList = new ArrayList();
            bLS bls = ((p2E) this.f2455R).R;
            l13 l13 = new l13(arrayList, this.R, 1);
            this.X = 1;
            bls.getClass();
            if (bLS.U(bls, l13, this) == bgr) {
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
        return new cvR(this.f2455R, this.R, aoo);
    }
}
