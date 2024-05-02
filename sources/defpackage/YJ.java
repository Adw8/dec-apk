package defpackage;

/* renamed from: YJ  reason: default package */
/* loaded from: classes.dex */
public final class YJ extends k8G implements lR3 {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public YJ(int i, kMk kmk) {
        super(3);
        this.X = 3;
        this.O = i;
        this.R = kmk;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                if ((i & 81) == 16) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                g1c.c((String) this.R, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) ((jr_) m88).x(dB8.R)).C, m88, (this.O >> 3) & 14, 0, 32766);
                return;
            case 1:
                if ((i & 81) == 16) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                g1c.c((String) this.R, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) ((jr_) m88).x(dB8.R)).C, m88, (this.O >> 3) & 14, 0, 32766);
                return;
            default:
                if ((i & 81) == 16) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                g1c.c((String) this.R, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) ((jr_) m88).x(dB8.R)).C, m88, (this.O >> 3) & 14, 0, 32766);
                return;
        }
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                kM4 km4 = (kM4) obj;
                R((m88) obj2, ((Number) obj3).intValue());
                break;
            case 1:
                kM4 km42 = (kM4) obj;
                R((m88) obj2, ((Number) obj3).intValue());
                break;
            case 2:
                kM4 km43 = (kM4) obj;
                R((m88) obj2, ((Number) obj3).intValue());
                break;
            default:
                ncu ncu = (ncu) obj;
                ((Number) obj3).intValue();
                jr_ jr_ = (jr_) ((m88) obj2);
                jr_.w(-1027014173);
                int i = this.O;
                if (!(i > 0)) {
                    throw new IllegalArgumentException("maxLines must be greater than 0".toString());
                } else if (i == Integer.MAX_VALUE) {
                    aff aff = aff.R;
                    jr_.g(false);
                    return aff;
                } else {
                    jJj jjj = (jJj) jr_.x(lnF.X);
                    gP7 gp7 = (gP7) jr_.x(lnF.Z);
                    mdz mdz = (mdz) jr_.x(lnF.H);
                    kMk kmk = (kMk) this.R;
                    jr_.w(511388516);
                    boolean O = jr_.O(kmk) | jr_.O(mdz);
                    Object I = jr_.I();
                    if (O || I == ppN.R) {
                        I = hDC.T(kmk, mdz);
                        jr_.ZW(I);
                    }
                    jr_.g(false);
                    kMk kmk2 = (kMk) I;
                    jr_.w(511388516);
                    boolean O2 = jr_.O(gp7) | jr_.O(kmk2);
                    Object I2 = jr_.I();
                    if (O2 || I2 == ppN.R) {
                        eBF ebf = kmk2.f5283R;
                        deI dei = ebf.f3012R;
                        lIe lie = ebf.f3017R;
                        if (lie == null) {
                            lie = lIe.e;
                        }
                        ned ned = ebf.f3018R;
                        int i2 = ned != null ? ned.R : 0;
                        hqI hqi = ebf.f3015R;
                        I2 = ((bYd) gp7).v(dei, lie, i2, hqi != null ? hqi.R : 1);
                        jr_.ZW(I2);
                    }
                    jr_.g(false);
                    dH9 dh9 = (dH9) I2;
                    Object[] objArr = {jjj, gp7, (kMk) this.R, mdz, dh9.getValue()};
                    jr_.w(-568225417);
                    boolean z = false;
                    for (int i3 = 0; i3 < 5; i3++) {
                        z |= jr_.O(objArr[i3]);
                    }
                    Object I3 = jr_.I();
                    if (z || I3 == ppN.R) {
                        I3 = Integer.valueOf(ltH.v(crU.R(kmk2, jjj, gp7, crU.R, 1)));
                        jr_.ZW(I3);
                    }
                    jr_.g(false);
                    int intValue = ((Number) I3).intValue();
                    Object[] objArr2 = {jjj, gp7, (kMk) this.R, mdz, dh9.getValue()};
                    jr_.w(-568225417);
                    boolean z2 = false;
                    for (int i4 = 0; i4 < 5; i4++) {
                        z2 |= jr_.O(objArr2[i4]);
                    }
                    Object I4 = jr_.I();
                    if (z2 || I4 == ppN.R) {
                        StringBuilder sb = new StringBuilder();
                        String str = crU.R;
                        sb.append(str);
                        sb.append('\n');
                        sb.append(str);
                        I4 = Integer.valueOf(ltH.v(crU.R(kmk2, jjj, gp7, sb.toString(), 2)));
                        jr_.ZW(I4);
                    }
                    jr_.g(false);
                    ncu L = adU.L(aff.R, 0.0f, jjj.l(((this.O - 1) * (((Number) I4).intValue() - intValue)) + intValue), 1);
                    jr_.g(false);
                    return L;
                }
        }
        return o8s.R;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ YJ(String str, int i, int i2) {
        super(3);
        this.X = i2;
        this.R = str;
        this.O = i;
    }
}
