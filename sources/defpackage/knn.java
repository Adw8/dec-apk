package defpackage;

/* renamed from: knn  reason: default package */
/* loaded from: classes.dex */
public final class knn extends k8G implements iv7 {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f5430R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5431R;
    public final /* synthetic */ int X = 0;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public knn(jy_ jy_, boolean z, hNI hni) {
        super(2);
        this.f5430R = jy_;
        this.f5431R = z;
        this.R = hni;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return R(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            default:
                return R(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }
    }

    public final Boolean R(float f, float f2) {
        switch (this.X) {
            case 0:
                l6.z(this.f5430R, null, 0, new gGw(this.f5431R, (hNI) this.R, f2, f, null), 3);
                return Boolean.TRUE;
            default:
                if (this.f5431R) {
                    f = f2;
                }
                l6.z(this.f5430R, null, 0, new eDM((o_d) this.R, f, null), 3);
                return Boolean.TRUE;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public knn(boolean z, jy_ jy_, o_d o_d) {
        super(2);
        this.f5431R = z;
        this.f5430R = jy_;
        this.R = o_d;
    }
}
