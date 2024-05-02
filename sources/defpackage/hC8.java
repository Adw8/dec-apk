package defpackage;

/* renamed from: hC8  reason: default package */
/* loaded from: classes.dex */
public final class hC8 extends fpB {
    public final /* synthetic */ gwK R;

    /* renamed from: R  reason: collision with other field name */
    public final k0 f4163R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hC8(gwK gwk, long j, xx xxVar) {
        super(j);
        this.R = gwk;
        this.f4163R = xxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((xx) this.f4163R).I(this.R);
    }

    @Override // defpackage.fpB, java.lang.Object
    public final String toString() {
        return super.toString() + this.f4163R;
    }
}
