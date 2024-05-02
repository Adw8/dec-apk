package defpackage;

/* renamed from: e9N  reason: default package */
/* loaded from: classes.dex */
public final class e9N extends k8G implements kg9 {
    public final /* synthetic */ hNI R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f2989R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f2990R;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public e9N(boolean z, boolean z2, boolean z3, hNI hni, jy_ jy_) {
        super(1);
        this.f2990R = z;
        this.v = z2;
        this.c = z3;
        this.R = hni;
        this.f2989R = jy_;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        bNL bnl = (bNL) obj;
        hNI hni = this.R;
        aD4 ad4 = new aD4(new ofz(hni, 0), new ofz(hni, 1), this.f2990R);
        if (this.v) {
            b_t b_t = onS.O;
            icv icv = onS.f6950R[6];
            b_t.R(bnl, ad4);
        } else {
            b_t b_t2 = onS.X;
            icv icv2 = onS.f6950R[5];
            b_t2.R(bnl, ad4);
        }
        if (this.c) {
            kEW kew = (kEW) bnl;
            kew.c(jGN.e, new Tp(null, new knn((jy_) this.f2989R, this.v, this.R)));
        }
        return o8s.R;
    }
}
