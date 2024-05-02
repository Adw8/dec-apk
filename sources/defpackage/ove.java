package defpackage;

/* renamed from: ove  reason: default package */
/* loaded from: classes.dex */
public final class ove extends k8G implements kg9 {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nKg f7020R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ oVq f7021R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ove(oVq ovq, Object obj, nKg nkg) {
        super(1);
        this.f7021R = ovq;
        this.R = obj;
        this.f7020R = nkg;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        dlc dlc = (dlc) obj;
        boolean z = !this.f7021R.f6836R.containsKey(this.R);
        Object obj2 = this.R;
        if (z) {
            this.f7021R.f6837R.remove(obj2);
            this.f7021R.f6836R.put(this.R, this.f7020R);
            return new jc(this.f7020R, this.f7021R, this.R, 1);
        }
        throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
    }
}
