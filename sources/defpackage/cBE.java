package defpackage;

/* renamed from: cBE  reason: default package */
/* loaded from: classes.dex */
public final class cBE extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ QX f2006R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f2007R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f2008R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j4B f2009R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kPA f2010R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n76 f2011R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f2012R;
    public final /* synthetic */ int X;
    public final /* synthetic */ float c;
    public final /* synthetic */ float v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f2013v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cBE(QX qx, boolean z, boolean z2, kPA kpa, dH9 dh9, iv7 iv7, j4B j4b, n76 n76, float f, float f2, float f3, int i, int i2) {
        super(2);
        this.f2006R = qx;
        this.f2012R = z;
        this.f2013v = z2;
        this.f2010R = kpa;
        this.f2007R = dh9;
        this.f2008R = iv7;
        this.f2009R = j4b;
        this.f2011R = n76;
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.X = i;
        this.O = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        nP4.v(this.f2006R, this.f2012R, this.f2013v, this.f2010R, this.f2007R, this.f2008R, this.f2009R, this.f2011R, this.R, this.v, this.c, (m88) obj, this.X | 1, this.O);
        return o8s.R;
    }
}
