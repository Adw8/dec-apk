package defpackage;

/* renamed from: jx3  reason: default package */
/* loaded from: classes.dex */
public final class jx3 extends aFk implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f5158R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j__ f5159R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5160R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f5161R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5162R;
    public int X;
    public final /* synthetic */ dH9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jx3(boolean z, int i, h0T h0t, dH9 dh9, jy_ jy_, j__ j__, dH9 dh92, aOO aoo) {
        super(2, aoo);
        this.f5162R = z;
        this.O = i;
        this.f5158R = h0t;
        this.R = dh9;
        this.f5161R = jy_;
        this.f5159R = j__;
        this.v = dh92;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jx3) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ck3 ck3 = (ck3) this.f5160R;
            aek aek = new aek(this.f5162R, this.O, this.f5158R, this.R, null);
            ofd ofd = new ofd(this.f5161R, this.f5159R, this.v);
            this.X = 1;
            if (pjd.e(ck3, null, aek, ofd, this, 3) == bgr) {
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
        jx3 jx3 = new jx3(this.f5162R, this.O, this.f5158R, this.R, this.f5161R, this.f5159R, this.v, aoo);
        jx3.f5160R = obj;
        return jx3;
    }
}
