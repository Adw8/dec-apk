package defpackage;

/* renamed from: mzD  reason: default package */
/* loaded from: classes.dex */
public final class mzD extends k8G implements lR3 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fVb f6255R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j4B f6256R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f6257R;
    public final /* synthetic */ float v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f6258v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mzD(boolean z, boolean z2, j4B j4b, fVb fvb, float f, float f2) {
        super(3);
        this.f6257R = z;
        this.f6258v = z2;
        this.f6256R = j4b;
        this.f6255R = fvb;
        this.R = f;
        this.v = f2;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        ncu ncu = (ncu) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        jr_.w(-891038934);
        lf lfVar = (lf) msU.m(this.f6257R, this.f6258v, this.f6256R, this.f6255R, this.R, this.v, jr_, 0).getValue();
        float f = nZp.R;
        nL3 nl3 = new nL3(new mP1(lfVar.R, 2, lfVar));
        jr_.g(false);
        return nl3;
    }
}
