package defpackage;

/* renamed from: UL  reason: default package */
/* loaded from: classes.dex */
public final class UL extends k8G implements kg9 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f558R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public UL(long j, boolean z) {
        super(1);
        this.f558R = z;
        this.R = j;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        ((kEW) ((bNL) obj)).c(nwJ.f6640R, new dro(this.f558R ? c_c.SelectionStart : c_c.SelectionEnd, this.R));
        return o8s.R;
    }
}
