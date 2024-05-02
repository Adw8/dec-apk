package defpackage;

/* renamed from: juh  reason: default package */
/* loaded from: classes.dex */
public final class juh extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Iw f5104R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ cZB f5105R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f5106R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jww f5107R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mz f5108R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f5109R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public juh(jww jww, String str, ncu ncu, mz mzVar, cZB czb, float f, Iw iw, int i, int i2) {
        super(2);
        this.f5107R = jww;
        this.f5106R = str;
        this.f5109R = ncu;
        this.f5108R = mzVar;
        this.f5105R = czb;
        this.R = f;
        this.f5104R = iw;
        this.X = i;
        this.O = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gQc.X(this.f5107R, this.f5106R, this.f5109R, this.f5108R, this.f5105R, this.R, this.f5104R, (m88) obj, this.X | 1, this.O);
        return o8s.R;
    }
}
