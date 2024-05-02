package defpackage;

/* renamed from: fm  reason: default package */
/* loaded from: classes.dex */
public final class fm extends k8G implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f3554R;
    public final /* synthetic */ int X;
    public final /* synthetic */ float v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fm(float f, float f2, iv7 iv7, int i) {
        super(2);
        this.R = f;
        this.v = f2;
        this.f3554R = iv7;
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ll.v(this.R, this.v, this.f3554R, (m88) obj, this.X | 1);
        return o8s.R;
    }
}
