package defpackage;

/* renamed from: aIN  reason: default package */
/* loaded from: classes.dex */
public final class aIN extends k8G implements f_c {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ e9w f823R;
    public final /* synthetic */ dH9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aIN(dH9 dh9, dH9 dh92, e9w e9w) {
        super(0);
        this.R = dh9;
        this.v = dh92;
        this.f823R = e9w;
    }

    @Override // defpackage.f_c
    public final Object g() {
        Object value = this.R.getValue();
        dH9 dh9 = this.v;
        return ((k_s) value).R.J(new dWm(this.f823R), dh9.getValue());
    }
}
