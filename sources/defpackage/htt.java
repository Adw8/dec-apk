package defpackage;

/* renamed from: htt  reason: default package */
/* loaded from: classes.dex */
public final class htt extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ long f4409R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f4410R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public htt(ncu ncu, long j, float f, int i, int i2) {
        super(2);
        this.f4410R = ncu;
        this.f4409R = j;
        this.R = f;
        this.X = i;
        this.O = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        oI9.R(this.f4410R, this.f4409R, this.R, (m88) obj, this.X | 1, this.O);
        return o8s.R;
    }
}
