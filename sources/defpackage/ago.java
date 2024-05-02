package defpackage;

import android.view.View;

/* renamed from: ago  reason: default package */
/* loaded from: classes.dex */
public final class ago extends aFk implements iv7 {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f962R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f963R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f964R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mBH f965R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nhg f966R;
    public int X;
    public final /* synthetic */ h0T v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ago(jy_ jy_, h0T h0t, View view, nhg nhg, mBH mbh, h0T h0t2, aOO aoo) {
        super(2, aoo);
        this.f964R = jy_;
        this.f962R = h0t;
        this.R = view;
        this.f966R = nhg;
        this.f965R = mbh;
        this.v = h0t2;
    }

    public static final int Z(ck3 ck3, mBH mbh, long j) {
        laR lar = (laR) ck3;
        hjM hjm = lar.R;
        long j2 = 0;
        float f = (float) 2;
        float pG = ((float) ((int) ((hjm != null ? hjm.pG() : 0) >> 32))) / f;
        hjM hjm2 = lar.R;
        if (hjm2 != null) {
            j2 = hjm2.pG();
        }
        long N = aH9.N(pG, ((float) ltH.v(j2)) / f);
        float e = aWo.e(j) - aWo.e(N);
        float X = aWo.X(j) - aWo.X(N);
        return Math.abs(e) > Math.abs(X) ? e > 0.0f ? mbh.e : mbh.c : X > 0.0f ? mbh.f5974v : mbh.f5970R;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((ago) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ck3 ck3 = (ck3) this.f963R;
            nWW nww = new nWW();
            jy_ jy_ = this.f964R;
            h0T h0t = this.f962R;
            View view = this.R;
            hMh hmh = new hMh(nww, jy_, h0t, view, this.f966R, ck3, this.f965R);
            n5H n5h = new n5H(view, nww, this.v, h0t, null);
            ar arVar = new ar(this.f964R, ck3, this.f965R, this.f966R, 6);
            this.X = 1;
            if (pjd.e(ck3, hmh, n5h, arVar, this, 1) == bgr) {
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
        ago ago = new ago(this.f964R, this.f962R, this.R, this.f966R, this.f965R, this.v, aoo);
        ago.f963R = obj;
        return ago;
    }
}
