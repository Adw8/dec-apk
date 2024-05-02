package defpackage;

/* renamed from: ST  reason: default package */
/* loaded from: classes.dex */
public final class ST extends fd {
    public static ST R;

    /* renamed from: R  reason: collision with other field name */
    public iRR f515R;

    @Override // defpackage.qe
    public final int[] R(int i) {
        int i2;
        bSG bsg = bSG.Ltr;
        if (e().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > e().length()) {
            iRR irr = this.f515R;
            if (irr == null) {
                irr = null;
            }
            i2 = irr.O(e().length());
        } else {
            iRR irr2 = this.f515R;
            if (irr2 == null) {
                irr2 = null;
            }
            int O = irr2.O(i);
            i2 = X(O, bsg) + 1 == i ? O : O - 1;
        }
        if (i2 < 0) {
            return null;
        }
        return c(X(i2, bSG.Rtl), X(i2, bsg) + 1);
    }

    public final int X(int i, bSG bsg) {
        iRR irr = this.f515R;
        iRR irr2 = null;
        if (irr == null) {
            irr = null;
        }
        int x = irr.x(i);
        iRR irr3 = this.f515R;
        if (irr3 == null) {
            irr3 = null;
        }
        if (bsg != irr3.C(x)) {
            iRR irr4 = this.f515R;
            if (irr4 != null) {
                irr2 = irr4;
            }
            return irr2.x(i);
        }
        iRR irr5 = this.f515R;
        if (irr5 != null) {
            irr2 = irr5;
        }
        return irr2.X(i, false) - 1;
    }

    @Override // defpackage.qe
    public final int[] v(int i) {
        int i2;
        bSG bsg = bSG.Rtl;
        if (e().length() <= 0 || i >= e().length()) {
            return null;
        }
        if (i < 0) {
            iRR irr = this.f515R;
            if (irr == null) {
                irr = null;
            }
            i2 = irr.O(0);
        } else {
            iRR irr2 = this.f515R;
            if (irr2 == null) {
                irr2 = null;
            }
            int O = irr2.O(i);
            i2 = X(O, bsg) == i ? O : O + 1;
        }
        iRR irr3 = this.f515R;
        if (irr3 == null) {
            irr3 = null;
        }
        if (i2 >= irr3.f4592R.f7260v) {
            return null;
        }
        return c(X(i2, bsg), X(i2, bSG.Ltr) + 1);
    }
}
