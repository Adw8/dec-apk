package defpackage;

import androidx.lifecycle.e;

/* renamed from: iLl  reason: default package */
/* loaded from: classes.dex */
public final class iLl extends aFk implements iv7 {
    public final /* synthetic */ aLd R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iMP f4543R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f4544R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4545R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iLl(aLd ald, iMP imp, iv7 iv7, aOO aoo) {
        super(2, aoo);
        this.R = ald;
        this.f4543R = imp;
        this.f4544R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((iLl) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            jy_ jy_ = (jy_) this.f4545R;
            h8R h8r = iFn.R;
            hBL hbl = ((hBL) hJr.R).f4160R;
            e eVar = new e(this.R, this.f4543R, jy_, this.f4544R, null);
            this.X = 1;
            if (l6.a(hbl, eVar, this) == bgr) {
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
        iLl ill = new iLl(this.R, this.f4543R, this.f4544R, aoo);
        ill.f4545R = obj;
        return ill;
    }
}
