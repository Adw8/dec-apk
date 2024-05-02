package defpackage;

import android.view.View;

/* renamed from: iaW  reason: default package */
/* loaded from: classes.dex */
public final class iaW extends aFk implements lR3 {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f4657R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ l3X f4658R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWW f4659R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iaW(View view, nWW nww, h0T h0t, aOO aoo) {
        super(3, aoo);
        this.R = view;
        this.f4659R = nww;
        this.f4657R = h0t;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            l3X l3x = this.f4658R;
            this.R.performHapticFeedback(3);
            h0T h0t = this.f4657R;
            float f = iqx.R;
            h0t.R(Boolean.TRUE);
            this.X = 1;
            if (l3x.v(this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h0T h0t2 = this.f4657R;
        float f2 = iqx.R;
        h0t2.R(Boolean.FALSE);
        Object obj2 = this.f4659R.R;
        if (obj2 != null) {
            ((pd2) obj2).c(null);
            this.f4659R.R = null;
        }
        return o8s.R;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        long j = ((aWo) obj2).f906R;
        iaW iaw = new iaW(this.R, this.f4659R, this.f4657R, (aOO) obj3);
        iaw.f4658R = (l3X) obj;
        return iaw.O(o8s.R);
    }
}
