package defpackage;

/* renamed from: h0m  reason: default package */
/* loaded from: classes.dex */
public final class h0m extends k8G implements kg9 {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4012R;
    public final /* synthetic */ int X = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public h0m(oJx ojx, oJx ojx2, mpr mpr, boolean z, il ilVar) {
        super(1);
        this.R = ojx;
        this.v = ojx2;
        this.c = mpr;
        this.f4012R = z;
        this.e = ilVar;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        boolean z = false;
        switch (this.X) {
            case 0:
                long j = ((aWo) obj).f906R;
                dTl.P((kY5) this.R, (jzQ) this.v, !this.f4012R);
                if (((kY5) this.R).v()) {
                    if (((kY5) this.R).R() != m3z.Selection) {
                        mjp c = ((kY5) this.R).c();
                        if (c != null) {
                            kY5 ky5 = (kY5) this.R;
                            gXZ gxz = ky5.f5336R;
                            deW dew = ky5.f5335R;
                            int L = ((c71) this.e).L(c.v(j, true));
                            dew.x(d5M.R(gxz.R, null, dtx.e(L, L), 5));
                            if (ky5.f5333R.f2508R.length() > 0) {
                                z = true;
                            }
                            if (z) {
                                ky5.e.R(m3z.Cursor);
                            }
                        }
                    } else {
                        ((fBS) this.c).L(new aWo(j));
                    }
                }
                return o8s.R;
            case 1:
                bNL bnl = (bNL) obj;
                Object obj2 = this.f4012R ? this.R : this.v;
                b_t b_t = onS.R;
                icv icv = onS.f6950R[0];
                b_t.R(bnl, (String) obj2);
                onS.R(bnl, (String) this.c);
                ((kEW) bnl).c(jGN.v, new Tp(null, new _d((f_c) this.e, 3)));
                return o8s.R;
            default:
                ((oJx) this.R).R = true;
                ((oJx) this.v).R = true;
                ((mpr) this.c).j((j5B) obj, this.f4012R, (il) this.e);
                return o8s.R;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public h0m(kY5 ky5, jzQ jzq, boolean z, fBS fbs, c71 c71) {
        super(1);
        this.R = ky5;
        this.v = jzq;
        this.f4012R = z;
        this.c = fbs;
        this.e = c71;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public h0m(boolean z, String str, String str2, String str3, f_c f_c) {
        super(1);
        this.f4012R = z;
        this.R = str;
        this.v = str2;
        this.c = str3;
        this.e = f_c;
    }
}
