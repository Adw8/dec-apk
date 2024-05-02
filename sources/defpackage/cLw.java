package defpackage;

/* renamed from: cLw  reason: default package */
/* loaded from: classes.dex */
public final class cLw extends aFk implements iv7 {
    public final /* synthetic */ hUt R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2076R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cLw(hUt hut, aOO aoo) {
        super(2, aoo);
        this.R = hut;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((cLw) X((h2V) obj, (aOO) obj2)).O(o8s.R);
        return bGR.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            oJx ojx = new oJx();
            hUt hut = this.R;
            aLH alh = new aLH(ojx, 10, (h2V) this.f2076R);
            this.X = 1;
            if (hut.v(alh, this) == bgr) {
                return bgr;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            jjU.o(obj);
        }
        throw new j8f((Object) null);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        cLw clw = new cLw(this.R, aoo);
        clw.f2076R = obj;
        return clw;
    }
}
