package defpackage;

/* renamed from: knS  reason: default package */
/* loaded from: classes.dex */
public final class knS extends k8G implements lR3 {
    public final /* synthetic */ hNI R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n4N f5421R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5422R = true;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public knS(hNI hni, n4N n4n, boolean z, boolean z2) {
        super(3);
        this.v = z;
        this.R = hni;
        this.c = z2;
        this.f5421R = n4n;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        nLK nlk = nLK.Vertical;
        ncu ncu = (ncu) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        jr_.w(1478351300);
        acA j = n3x.j(jr_);
        jr_.w(773894976);
        jr_.w(-492369756);
        Object I = jr_.I();
        if (I == ppN.R) {
            hyO hyo = new hyO(caw.N(jr_));
            jr_.ZW(hyo);
            I = hyo;
        }
        jr_.g(false);
        jy_ jy_ = ((hyO) I).R;
        jr_.g(false);
        aff aff = aff.R;
        ncu N = cU5.N(aff, false, new e9N(this.v, this.f5422R, this.c, this.R, jy_));
        nLK nlk2 = this.f5422R ? nlk : nLK.Horizontal;
        mdz mdz = (mdz) jr_.x(lnF.H);
        boolean z = true;
        boolean z2 = !this.v;
        if (mdz != mdz.Rtl) {
            z = false;
        }
        boolean z3 = (!z || nlk2 == nlk) ? z2 : !z2;
        hNI hni = this.R;
        ncu I2 = N.I(nlk2 == nlk ? r5.v : r5.f7379R).I(j.L()).I(jzg.v(aff, hni, nlk2, j, this.c, z3, this.f5421R, hni.f4222R)).I(new ccG(this.R, this.v, this.f5422R, j));
        jr_.g(false);
        return I2;
    }
}
