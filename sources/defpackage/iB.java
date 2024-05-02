package defpackage;

import android.graphics.Rect;

/* renamed from: iB  reason: default package */
/* loaded from: classes.dex */
public final class iB extends fd {
    public static iB R;

    /* renamed from: R  reason: collision with other field name */
    public iRR f4481R;

    /* renamed from: R  reason: collision with other field name */
    public oIb f4482R;

    public iB() {
        new Rect();
    }

    @Override // defpackage.qe
    public final int[] R(int i) {
        int i2;
        iRR irr = null;
        if (e().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            oIb oib = this.f4482R;
            if (oib == null) {
                oib = null;
            }
            gIA e = oib.e();
            int t = mLz.t(e.e - e.v);
            int length = e().length();
            if (length <= i) {
                i = length;
            }
            iRR irr2 = this.f4481R;
            if (irr2 == null) {
                irr2 = null;
            }
            int O = irr2.O(i);
            iRR irr3 = this.f4481R;
            if (irr3 == null) {
                irr3 = null;
            }
            float H = irr3.H(O) - ((float) t);
            if (H > 0.0f) {
                iRR irr4 = this.f4481R;
                if (irr4 != null) {
                    irr = irr4;
                }
                i2 = irr.L(H);
            } else {
                i2 = 0;
            }
            if (i == e().length() && i2 < O) {
                i2++;
            }
            return c(X(i2, bSG.Rtl), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int X(int i, bSG bsg) {
        iRR irr = this.f4481R;
        iRR irr2 = null;
        if (irr == null) {
            irr = null;
        }
        int x = irr.x(i);
        iRR irr3 = this.f4481R;
        if (irr3 == null) {
            irr3 = null;
        }
        if (bsg != irr3.C(x)) {
            iRR irr4 = this.f4481R;
            if (irr4 != null) {
                irr2 = irr4;
            }
            return irr2.x(i);
        }
        iRR irr5 = this.f4481R;
        if (irr5 != null) {
            irr2 = irr5;
        }
        return irr2.X(i, false) - 1;
    }

    @Override // defpackage.qe
    public final int[] v(int i) {
        int i2;
        iRR irr = null;
        if (e().length() <= 0 || i >= e().length()) {
            return null;
        }
        try {
            oIb oib = this.f4482R;
            if (oib == null) {
                oib = null;
            }
            gIA e = oib.e();
            int t = mLz.t(e.e - e.v);
            i = 0;
            if (i <= 0) {
            }
            iRR irr2 = this.f4481R;
            if (irr2 == null) {
                irr2 = null;
            }
            int O = irr2.O(i);
            iRR irr3 = this.f4481R;
            if (irr3 == null) {
                irr3 = null;
            }
            float H = irr3.H(O) + ((float) t);
            iRR irr4 = this.f4481R;
            iRR irr5 = irr4 == null ? null : irr4;
            if (irr4 == null) {
                irr4 = null;
            }
            if (H < irr5.H(irr4.f4592R.f7260v - 1)) {
                iRR irr6 = this.f4481R;
                if (irr6 != null) {
                    irr = irr6;
                }
                i2 = irr.L(H);
            } else {
                iRR irr7 = this.f4481R;
                if (irr7 != null) {
                    irr = irr7;
                }
                i2 = irr.f4592R.f7260v;
            }
            return c(i, X(i2 - 1, bSG.Ltr) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
