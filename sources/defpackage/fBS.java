package defpackage;

import android.view.ActionMode;

/* renamed from: fBS  reason: default package */
/* loaded from: classes.dex */
public final class fBS {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public Z9 f3337R;

    /* renamed from: R  reason: collision with other field name */
    public final d5K f3339R;

    /* renamed from: R  reason: collision with other field name */
    public Integer f3342R;

    /* renamed from: R  reason: collision with other field name */
    public jlt f3343R;

    /* renamed from: R  reason: collision with other field name */
    public jzQ f3344R;

    /* renamed from: R  reason: collision with other field name */
    public kY5 f3345R;

    /* renamed from: R  reason: collision with other field name */
    public lI8 f3347R;
    public long v;

    /* renamed from: R  reason: collision with other field name */
    public c71 f3338R = dtx.f2905R;

    /* renamed from: R  reason: collision with other field name */
    public kg9 f3346R = nqF.e;

    /* renamed from: R  reason: collision with other field name */
    public final oST f3348R = l6.n(new d5M((String) null, 0, 7));

    /* renamed from: v  reason: collision with other field name */
    public final oST f3349v = l6.n(Boolean.TRUE);
    public final oST c = l6.n(null);
    public final oST e = l6.n(null);

    /* renamed from: R  reason: collision with other field name */
    public d5M f3340R = new d5M((String) null, 0, 7);

    /* renamed from: R  reason: collision with other field name */
    public final ghh f3341R = new ghh(this, 1);

    public fBS(d5K d5k) {
        this.f3339R = d5k;
        iuk.e.getClass();
        long j = aWo.v;
        this.R = j;
        this.v = j;
        new d92(this);
    }

    public static final void R(fBS fbs, aWo awo) {
        fbs.e.R(awo);
    }

    public static d5M X(bz bzVar, long j) {
        return new d5M(bzVar, j, (odN) null);
    }

    public static final void c(fBS fbs, d5M d5m, int i, int i2, boolean z, nKM nkm) {
        long j;
        mjp c;
        c71 c71 = fbs.f3338R;
        long j2 = d5m.R;
        int i3 = odN.R;
        long e = dtx.e(c71.Z((int) (j2 >> 32)), fbs.f3338R.Z(odN.c(d5m.R)));
        kY5 ky5 = fbs.f3345R;
        odN odn = null;
        iRR irr = (ky5 == null || (c = ky5.c()) == null) ? null : c.f6140R;
        if (!odN.v(e)) {
            odn = new odN(e);
        }
        if (irr != null) {
            j = dtx.e(i, i2);
            if (odn != null || !n3x.v(nkm, dq.f2884c)) {
                j = ((kfk) nkm).Z(irr, j, z, odn);
            }
        } else {
            j = dtx.e(0, 0);
        }
        long e2 = dtx.e(fbs.f3338R.L((int) (j >> 32)), fbs.f3338R.L(odN.c(j)));
        if (!odN.R(e2, d5m.R)) {
            jlt jlt = fbs.f3343R;
            if (jlt != null) {
                ((l_5) jlt).R();
            }
            fbs.f3346R.x(X(d5m.f2488R, e2));
            kY5 ky52 = fbs.f3345R;
            if (ky52 != null) {
                ky52.X.R(Boolean.valueOf(n1P.g(fbs, true)));
            }
            kY5 ky53 = fbs.f3345R;
            if (ky53 != null) {
                ky53.O.R(Boolean.valueOf(n1P.g(fbs, false)));
            }
        }
    }

    public static final void v(fBS fbs, c_c c_c) {
        fbs.c.R(c_c);
    }

    public final void C(m3z m3z) {
        kY5 ky5 = this.f3345R;
        if (ky5 != null) {
            ky5.e.R(m3z);
        }
    }

    public final void H() {
        lI8 li8 = this.f3347R;
        if ((li8 != null ? ((wK) li8).R : 0) == 1 && li8 != null) {
            wK wKVar = (wK) li8;
            wKVar.R = 2;
            ActionMode actionMode = wKVar.f7459R;
            if (actionMode != null) {
                actionMode.finish();
            }
            wKVar.f7459R = null;
        }
    }

    public final void L(aWo awo) {
        m3z m3z;
        boolean z = true;
        if (!odN.v(x().R)) {
            kY5 ky5 = this.f3345R;
            mjp c = ky5 != null ? ky5.c() : null;
            int e = (awo == null || c == null) ? odN.e(x().R) : this.f3338R.L(c.v(awo.f906R, true));
            this.f3346R.x(d5M.R(x(), null, dtx.e(e, e), 5));
        }
        if (awo != null) {
            if (x().f2488R.R.length() <= 0) {
                z = false;
            }
            if (z) {
                m3z = m3z.Cursor;
                C(m3z);
                H();
            }
        }
        m3z = m3z.None;
        C(m3z);
        H();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N() {
        /*
        // Method dump skipped, instructions count: 428
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fBS.N():void");
    }

    public final void O() {
        if (!odN.v(x().R)) {
            Z9 z9 = this.f3337R;
            if (z9 != null) {
                ((ci) z9).v(dtx.g(x()));
            }
            bz t = dtx.t(x(), x().f2488R.R.length());
            bz y = dtx.y(x(), x().f2488R.R.length());
            _w _wVar = new _w(t);
            _wVar.v(y);
            bz c = _wVar.c();
            int X = odN.X(x().R);
            this.f3346R.x(X(c, dtx.e(X, X)));
            C(m3z.None);
            d5K d5k = this.f3339R;
            if (d5k != null) {
                d5k.f2486R = true;
            }
        }
    }

    public final void U() {
        bz R;
        Z9 z9 = this.f3337R;
        if (z9 != null && (R = ((ci) z9).R()) != null) {
            _w _wVar = new _w(dtx.t(x(), x().f2488R.R.length()));
            _wVar.v(R);
            bz c = _wVar.c();
            bz y = dtx.y(x(), x().f2488R.R.length());
            _w _wVar2 = new _w(c);
            _wVar2.v(y);
            bz c2 = _wVar2.c();
            int length = R.length() + odN.X(x().R);
            this.f3346R.x(X(c2, dtx.e(length, length)));
            C(m3z.None);
            d5K d5k = this.f3339R;
            if (d5k != null) {
                d5k.f2486R = true;
            }
        }
    }

    public final void Z() {
        jzQ jzq;
        kY5 ky5 = this.f3345R;
        boolean z = false;
        if (ky5 != null && !ky5.v()) {
            z = true;
        }
        if (z && (jzq = this.f3344R) != null) {
            jzq.v();
        }
        this.f3340R = x();
        kY5 ky52 = this.f3345R;
        if (ky52 != null) {
            ky52.f5342R = true;
        }
        C(m3z.Selection);
    }

    public final void e(boolean z) {
        if (!odN.v(x().R)) {
            Z9 z9 = this.f3337R;
            if (z9 != null) {
                ((ci) z9).v(dtx.g(x()));
            }
            if (z) {
                int e = odN.e(x().R);
                this.f3346R.x(X(x().f2488R, dtx.e(e, e)));
                C(m3z.None);
            }
        }
    }

    public final long m(boolean z) {
        int i;
        d5M x = x();
        if (z) {
            long j = x.R;
            int i2 = odN.R;
            i = (int) (j >> 32);
        } else {
            i = odN.c(x.R);
        }
        kY5 ky5 = this.f3345R;
        iRR irr = (ky5 != null ? ky5.c() : null).f6140R;
        int Z = this.f3338R.Z(i);
        return aH9.N(ooA.t(irr, Z, z, odN.O(x().R)), irr.e(irr.O(Z)));
    }

    public final d5M x() {
        return (d5M) this.f3348R.getValue();
    }
}
