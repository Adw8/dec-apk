package defpackage;

/* renamed from: pr9  reason: default package */
/* loaded from: classes.dex */
public final class pr9 implements cwX {
    public final fUt R;

    /* renamed from: R  reason: collision with other field name */
    public final f_c f7294R;

    /* renamed from: R  reason: collision with other field name */
    public kvj f7295R;
    public final f_c c;
    public final f_c v;

    public pr9(x_ x_Var, f_c f_c, f_c f_c2, f_c f_c3) {
        this.R = x_Var;
        this.f7294R = f_c;
        this.v = f_c2;
        this.c = f_c3;
    }

    @Override // defpackage.cwX
    public final Object getValue() {
        kvj kvj = this.f7295R;
        if (kvj != null) {
            return kvj;
        }
        kvj O = new CV((ns8) this.f7294R.g(), (hv5) this.v.g(), (f3V) this.c.g()).O(((f2) this.R).R());
        this.f7295R = O;
        return O;
    }
}
