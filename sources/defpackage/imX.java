package defpackage;

/* renamed from: imX  reason: default package */
/* loaded from: classes.dex */
public final class imX extends k8G implements lR3 {
    public final /* synthetic */ ceM R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f4721R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4722R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public imX(ceM cem, boolean z, p2E p2e) {
        super(3);
        this.R = cem;
        this.f4722R = z;
        this.f4721R = p2e;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        boolean z;
        ncu ncu = (ncu) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        jr_.w(805428266);
        boolean z2 = ((nLK) this.R.c.getValue()) == nLK.Vertical || !(jr_.x(lnF.H) == mdz.Rtl);
        ceM cem = this.R;
        jr_.w(1157296644);
        boolean O = jr_.O(cem);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            I = new _0(17, cem);
            jr_.ZW(I);
        }
        jr_.g(false);
        jr_.w(-180460798);
        h0T s = l6.s((kg9) I, jr_);
        jr_.w(-492369756);
        Object I2 = jr_.I();
        if (I2 == ppN.R) {
            n_I n_i = new n_I(new jb4(s, 3));
            jr_.ZW(n_i);
            I2 = n_i;
        }
        jr_.g(false);
        dmk dmk = (dmk) I2;
        jr_.g(false);
        aff aff = aff.R;
        nLK nlk = (nLK) this.R.c.getValue();
        if (this.f4722R) {
            if (!(((Number) this.R.v.getValue()).floatValue() == 0.0f)) {
                z = true;
                ncu v = jzg.v(aff, dmk, nlk, null, z, z2, null, this.f4721R);
                jr_.g(false);
                return v;
            }
        }
        z = false;
        ncu v = jzg.v(aff, dmk, nlk, null, z, z2, null, this.f4721R);
        jr_.g(false);
        return v;
    }
}
