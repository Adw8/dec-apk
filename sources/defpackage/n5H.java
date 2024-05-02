package defpackage;

import android.view.View;

/* renamed from: n5H  reason: default package */
/* loaded from: classes.dex */
public final class n5H extends aFk implements lR3 {
    public /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ View f6293R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f6294R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ l3X f6295R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWW f6296R;
    public int X;
    public final /* synthetic */ h0T v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public n5H(View view, nWW nww, h0T h0t, h0T h0t2, aOO aoo) {
        super(3, aoo);
        this.f6293R = view;
        this.f6296R = nww;
        this.f6294R = h0t;
        this.v = h0t2;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            l3X l3x = this.f6295R;
            long j = this.R;
            this.f6293R.performHapticFeedback(3);
            h0T h0t = this.f6294R;
            float f = iqx.R;
            h0t.R(Boolean.TRUE);
            this.v.R(new aWo(j));
            this.X = 1;
            if (l3x.v(this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h0T h0t2 = this.f6294R;
        float f2 = iqx.R;
        h0t2.R(Boolean.FALSE);
        Object obj2 = this.f6296R.R;
        if (obj2 != null) {
            ((pd2) obj2).c(null);
            this.f6296R.R = null;
        }
        return o8s.R;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        long j = ((aWo) obj2).f906R;
        n5H n5h = new n5H(this.f6293R, this.f6296R, this.f6294R, this.v, (aOO) obj3);
        n5h.f6295R = (l3X) obj;
        n5h.R = j;
        return n5h.O(o8s.R);
    }
}
