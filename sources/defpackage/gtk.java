package defpackage;

import android.view.View;

/* renamed from: gtk  reason: default package */
/* loaded from: classes.dex */
public final class gtk extends aFk implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f3969R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3970R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f3971R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nhg f3972R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gtk(jy_ jy_, View view, nhg nhg, int i, h0T h0t, aOO aoo) {
        super(2, aoo);
        this.f3971R = jy_;
        this.R = view;
        this.f3972R = nhg;
        this.O = i;
        this.f3969R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gtk) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ck3 ck3 = (ck3) this.f3970R;
            nWW nww = new nWW();
            jy_ jy_ = this.f3971R;
            View view = this.R;
            kVF kvf = new kVF(nww, jy_, view, this.f3972R, this.O);
            iaW iaw = new iaW(view, nww, this.f3969R, null);
            cHs chs = new cHs(this.f3971R, this.f3972R, this.O, 3);
            this.X = 1;
            if (pjd.e(ck3, kvf, iaw, chs, this, 1) == bgr) {
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
        gtk gtk = new gtk(this.f3971R, this.R, this.f3972R, this.O, this.f3969R, aoo);
        gtk.f3970R = obj;
        return gtk;
    }
}
