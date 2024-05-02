package defpackage;

/* renamed from: dvh  reason: default package */
/* loaded from: classes.dex */
public final class dvh extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fVb f2916R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j4B f2917R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mIy f2918R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n76 f2919R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f2920R;
    public final /* synthetic */ int X;
    public final /* synthetic */ float v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f2921v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dvh(mIy miy, boolean z, boolean z2, j4B j4b, fVb fvb, n76 n76, float f, float f2, int i, int i2) {
        super(2);
        this.f2918R = miy;
        this.f2920R = z;
        this.f2921v = z2;
        this.f2917R = j4b;
        this.f2916R = fvb;
        this.f2919R = n76;
        this.R = f;
        this.v = f2;
        this.X = i;
        this.O = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f2918R.v(this.f2920R, this.f2921v, this.f2917R, this.f2916R, this.f2919R, this.R, this.v, (m88) obj, this.X | 1, this.O);
        return o8s.R;
    }
}
