package defpackage;

import android.view.View;

/* renamed from: ibz  reason: default package */
/* loaded from: classes.dex */
public class ibz {
    public static final gWM v = new h89(11).O().f3779R.R().f3779R.v().f3779R.c();
    public final gWM R;

    public ibz(gWM gwm) {
        this.R = gwm;
    }

    public boolean C(int i) {
        return true;
    }

    public boolean H() {
        return false;
    }

    public ojk L(int i) {
        if ((i & 8) == 0) {
            return ojk.R;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public void N(ojk[] ojkArr) {
    }

    public ojk O(int i) {
        return ojk.R;
    }

    public void P(gWM gwm) {
    }

    public gWM R() {
        return this.R;
    }

    public boolean U() {
        return false;
    }

    public dzX X() {
        return null;
    }

    public ojk Z() {
        return ojk.R;
    }

    public gWM c() {
        return this.R;
    }

    public void e(View view) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibz)) {
            return false;
        }
        ibz ibz = (ibz) obj;
        return U() == ibz.U() && H() == ibz.H() && cTo.R(m(), ibz.m()) && cTo.R(Z(), ibz.Z()) && cTo.R(X(), ibz.X());
    }

    public int hashCode() {
        return cTo.v(Boolean.valueOf(U()), Boolean.valueOf(H()), m(), Z(), X());
    }

    public ojk m() {
        return ojk.R;
    }

    public gWM v() {
        return this.R;
    }

    public gWM x(int i, int i2, int i3, int i4) {
        return v;
    }
}
