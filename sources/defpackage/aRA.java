package defpackage;

/* renamed from: aRA  reason: default package */
/* loaded from: classes.dex */
public final class aRA extends k8G implements lR3 {
    public final /* synthetic */ acA R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dmk f870R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n4N f871R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nLK f872R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f873R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f874R;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aRA(acA aca, n4N n4n, nLK nlk, dmk dmk, p2E p2e, boolean z, boolean z2) {
        super(3);
        this.f872R = nlk;
        this.f870R = dmk;
        this.f874R = z;
        this.f873R = p2e;
        this.f871R = n4n;
        this.R = aca;
        this.v = z2;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        n4N n4n;
        ncu ncu = (ncu) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        jr_.w(-629830927);
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
        Object[] objArr = {jy_, this.f872R, this.f870R, Boolean.valueOf(this.f874R)};
        nLK nlk = this.f872R;
        dmk dmk = this.f870R;
        boolean z = this.f874R;
        jr_.w(-568225417);
        boolean z2 = false;
        for (int i = 0; i < 4; i++) {
            z2 |= jr_.O(objArr[i]);
        }
        Object I2 = jr_.I();
        if (z2 || I2 == ppN.R) {
            I2 = new h6T(jy_, nlk, dmk, z);
            jr_.ZW(I2);
        }
        jr_.g(false);
        ncu ncu2 = aff.R;
        cxL cxl = ppQ.R;
        ih ihVar = ih.v;
        bsy bsy = hcI.R;
        ncu I3 = cxl.I(new c4U(ihVar));
        bsy bsy2 = ofC.R;
        lBz lbz = lBz.Y;
        ncu I4 = g4x.g(I3, lbz, hIO.R).I(((h6T) I2).f4054R);
        p2E p2e = this.f873R;
        nLK nlk2 = this.f872R;
        boolean z3 = this.f874R;
        dmk dmk2 = this.f870R;
        n4N n4n2 = this.f871R;
        acA aca = this.R;
        boolean z4 = this.v;
        jr_.w(-2012025036);
        jr_.w(-1730186366);
        if (n4n2 == null) {
            jr_.w(1107739818);
            kbU R = mRe.R(jr_);
            jr_.w(1157296644);
            boolean O = jr_.O(R);
            Object I5 = jr_.I();
            if (O || I5 == ppN.R) {
                I5 = new cyZ(R);
                jr_.ZW(I5);
            }
            jr_.g(false);
            n4n = (cyZ) I5;
            jr_.g(false);
        } else {
            n4n = n4n2;
        }
        jr_.g(false);
        jr_.w(-492369756);
        Object I6 = jr_.I();
        f1A f1a = ppN.R;
        if (I6 == f1a) {
            I6 = l6.n(new lh8());
            jr_.ZW(I6);
        }
        jr_.g(false);
        h0T h0t = (h0T) I6;
        h0T s = l6.s(new bs4(nlk2, z3, h0t, dmk2, n4n, aca), jr_);
        Boolean valueOf = Boolean.valueOf(z4);
        jr_.w(1157296644);
        boolean O2 = jr_.O(valueOf);
        Object I7 = jr_.I();
        if (O2 || I7 == f1a) {
            I7 = new dOC(s, z4);
            jr_.ZW(I7);
        }
        jr_.g(false);
        i_c i_c = (i_c) I7;
        jr_.w(-492369756);
        Object I8 = jr_.I();
        if (I8 == f1a) {
            I8 = new mtG(s);
            jr_.ZW(I8);
        }
        jr_.g(false);
        mtG mtg = (mtG) I8;
        jr_.w(-1485272842);
        jr_.g(false);
        hw1 hw1 = hw1.R;
        nWX nwx = nWX.R;
        jr_.w(1157296644);
        boolean O3 = jr_.O(s);
        Object I9 = jr_.I();
        if (O3 || I9 == f1a) {
            I9 = new fBj(s, 2);
            jr_.ZW(I9);
        }
        jr_.g(false);
        f_c f_c = (f_c) I9;
        jr_.w(511388516);
        boolean O4 = jr_.O(h0t) | jr_.O(s);
        Object I10 = jr_.I();
        if (O4 || I10 == f1a) {
            I10 = new ovj(h0t, s, null);
            jr_.ZW(I10);
        }
        jr_.g(false);
        ncu V = g4x.V(I4, mtg, nwx, nlk2, z4, p2e, f_c, new b3f(2, null), (lR3) I10, false);
        j9i j9i = new j9i(hw1, s, null);
        pdm pdm = lCG.R;
        ncu g = g4x.g(g4x.g(V, lbz, new ezT(s, hw1, j9i, 1)), lbz, new fB0((lh8) h0t.getValue(), 7, i_c));
        jr_.g(false);
        if (this.v) {
            ncu2 = kVA.f5312R;
        }
        ncu I11 = g.I(ncu2);
        jr_.g(false);
        return I11;
    }
}
