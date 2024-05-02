package defpackage;

/* renamed from: jGU  reason: default package */
/* loaded from: classes.dex */
public final class jGU extends k8G implements kg9 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ geT f4896R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l0f f4897R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jGU(geT get, l0f l0f, long j) {
        super(1);
        this.f4896R = get;
        this.f4897R = l0f;
        this.R = j;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        geT get = this.f4896R;
        h57.m((h57) obj, this.f4897R, ((dU5) get.f3832R.R(get.R, new dU2(get, this.R)).getValue()).f2628R);
        return o8s.R;
    }
}
