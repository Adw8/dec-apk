package defpackage;

/* renamed from: jcX  reason: default package */
/* loaded from: classes.dex */
public final class jcX extends k8G implements kg9 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l0f f4977R;
    public final /* synthetic */ long v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jcX(l0f l0f, long j, long j2) {
        super(1);
        this.f4977R = l0f;
        this.R = j;
        this.v = j2;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        l0f l0f = this.f4977R;
        long j = this.R;
        int i = dU5.R;
        h57.v((h57) obj, l0f, ((int) (this.v >> 32)) + ((int) (j >> 32)), dU5.v(this.v) + dU5.v(j));
        return o8s.R;
    }
}
