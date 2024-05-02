package defpackage;

import android.view.View;

/* renamed from: bFf  reason: default package */
/* loaded from: classes.dex */
public final class bFf extends aFk implements iv7 {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f1582R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1583R;
    public int X;
    public final /* synthetic */ h0T v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bFf(View view, h0T h0t, h0T h0t2, aOO aoo) {
        super(2, aoo);
        this.R = view;
        this.f1582R = h0t;
        this.v = h0t2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((bFf) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ck3 ck3 = (ck3) this.f1583R;
            i1U i1u = new i1U(this.R, this.f1582R, (aOO) null);
            n2R n2r = new n2R(this.v, 8);
            this.X = 1;
            if (pjd.e(ck3, null, i1u, n2r, this, 3) == bgr) {
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
        bFf bff = new bFf(this.R, this.f1582R, this.v, aoo);
        bff.f1583R = obj;
        return bff;
    }
}
