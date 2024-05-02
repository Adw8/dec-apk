package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class LinearLayoutManager extends kds implements hmf {
    public int L;

    /* renamed from: L  reason: collision with other field name */
    public boolean f1361L;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f1362O;
    public a40 R;

    /* renamed from: R  reason: collision with other field name */
    public eIq f1363R;

    /* renamed from: R  reason: collision with other field name */
    public final gN7 f1364R;

    /* renamed from: R  reason: collision with other field name */
    public final gbl f1365R;

    /* renamed from: R  reason: collision with other field name */
    public m6N f1366R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f1367R;
    public int Z;

    /* renamed from: Z  reason: collision with other field name */
    public boolean f1368Z;
    public int m;

    /* renamed from: m  reason: collision with other field name */
    public boolean f1369m;
    public boolean x;

    public LinearLayoutManager(int i) {
        this.O = 1;
        this.f1361L = false;
        this.f1368Z = false;
        this.f1369m = false;
        this.x = true;
        this.L = -1;
        this.Z = Integer.MIN_VALUE;
        this.f1366R = null;
        this.f1365R = new gbl();
        this.f1364R = new gN7();
        this.m = 2;
        this.f1367R = new int[2];
        ky(i);
        c(null);
        if (this.f1361L) {
            this.f1361L = false;
            cE();
        }
    }

    public final void A5(int i, int i2) {
        this.f1363R.v = this.R.O() - i2;
        eIq eiq = this.f1363R;
        eiq.e = this.f1368Z ? -1 : 1;
        eiq.c = i;
        eiq.X = 1;
        eiq.R = i2;
        eiq.O = Integer.MIN_VALUE;
    }

    @Override // defpackage.kds
    public final void B(AccessibilityEvent accessibilityEvent) {
        super.B(accessibilityEvent);
        if (o() > 0) {
            accessibilityEvent.setFromIndex(iS());
            accessibilityEvent.setToIndex(wW());
        }
    }

    @Override // defpackage.kds
    public final int C(btj btj) {
        return Qg(btj);
    }

    public final void EZ(int i, int i2) {
        this.f1363R.v = i2 - this.R.Z();
        eIq eiq = this.f1363R;
        eiq.c = i;
        eiq.e = this.f1368Z ? 1 : -1;
        eiq.X = -1;
        eiq.R = i2;
        eiq.O = Integer.MIN_VALUE;
    }

    @Override // defpackage.kds
    public View G(View view, int i, fgh fgh, btj btj) {
        int hi;
        lU();
        if (o() == 0 || (hi = hi(i)) == Integer.MIN_VALUE) {
            return null;
        }
        MG();
        s3(hi, (int) (((float) this.R.m()) * 0.33333334f), false, btj);
        eIq eiq = this.f1363R;
        eiq.O = Integer.MIN_VALUE;
        eiq.f3046R = false;
        Ry(fgh, eiq, btj, true);
        View cR = hi == -1 ? this.f1368Z ? cR(o() - 1, -1) : cR(0, o()) : this.f1368Z ? cR(0, o()) : cR(o() - 1, -1);
        View _5 = hi == -1 ? _5() : WF();
        if (!_5.hasFocusable()) {
            return cR;
        }
        if (cR == null) {
            return null;
        }
        return _5;
    }

    @Override // defpackage.kds
    public int H(btj btj) {
        return np(btj);
    }

    public void KZ(btj btj, int[] iArr) {
        int i;
        int m = btj.R != -1 ? this.R.m() : 0;
        if (this.f1363R.X == -1) {
            i = 0;
        } else {
            i = m;
            m = 0;
        }
        iArr[0] = m;
        iArr[1] = i;
    }

    public final void MG() {
        if (this.f1363R == null) {
            this.f1363R = new eIq();
        }
    }

    @Override // defpackage.kds
    public int N(btj btj) {
        return np(btj);
    }

    public final void Ou(fgh fgh, eIq eiq) {
        if (eiq.f3046R && !eiq.f3047v) {
            int i = eiq.O;
            int i2 = eiq.Z;
            if (eiq.X == -1) {
                int o = o();
                if (i >= 0) {
                    int X = (this.R.X() - i) + i2;
                    if (this.f1368Z) {
                        for (int i3 = 0; i3 < o; i3++) {
                            View V = V(i3);
                            if (this.R.e(V) < X || this.R.U(V) < X) {
                                jp(fgh, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = o - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View V2 = V(i5);
                        if (this.R.e(V2) < X || this.R.U(V2) < X) {
                            jp(fgh, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int o2 = o();
                if (this.f1368Z) {
                    int i7 = o2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View V3 = V(i8);
                        if (this.R.v(V3) > i6 || this.R.H(V3) > i6) {
                            jp(fgh, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < o2; i9++) {
                    View V4 = V(i9);
                    if (this.R.v(V4) > i6 || this.R.H(V4) > i6) {
                        jp(fgh, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.kds
    public int P(btj btj) {
        return PN(btj);
    }

    public final int PN(btj btj) {
        if (o() == 0) {
            return 0;
        }
        MG();
        return aH9.A(btj, this.R, c0(!this.x), zE(!this.x), this, this.x);
    }

    public final int Qg(btj btj) {
        if (o() == 0) {
            return 0;
        }
        MG();
        return aH9.n(btj, this.R, c0(!this.x), zE(!this.x), this, this.x);
    }

    @Override // defpackage.hmf
    public final PointF R(int i) {
        if (o() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < kds.n(V(0))) {
            z = true;
        }
        if (z != this.f1368Z) {
            i2 = -1;
        }
        return this.O == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    public final int Ry(fgh fgh, eIq eiq, btj btj, boolean z) {
        int i = eiq.v;
        int i2 = eiq.O;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                eiq.O = i2 + i;
            }
            Ou(fgh, eiq);
        }
        int i3 = eiq.v + eiq.L;
        gN7 gn7 = this.f1364R;
        while (true) {
            if (!eiq.f3047v && i3 <= 0) {
                break;
            }
            int i4 = eiq.c;
            if (!(i4 >= 0 && i4 < btj.v())) {
                break;
            }
            gn7.R = 0;
            gn7.f3744R = false;
            gn7.v = false;
            gn7.c = false;
            tR(fgh, btj, eiq, gn7);
            if (!gn7.f3744R) {
                int i5 = eiq.R;
                int i6 = gn7.R;
                eiq.R = (eiq.X * i6) + i5;
                if (!gn7.v || eiq.f3045R != null || !btj.f1843v) {
                    eiq.v -= i6;
                    i3 -= i6;
                }
                int i7 = eiq.O;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    eiq.O = i8;
                    int i9 = eiq.v;
                    if (i9 < 0) {
                        eiq.O = i8 + i9;
                    }
                    Ou(fgh, eiq);
                }
                if (z && gn7.c) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - eiq.v;
    }

    public View S9(fgh fgh, btj btj, boolean z, boolean z2) {
        int i;
        int i2;
        MG();
        r2 = o();
        int i3 = -1;
        if (z2) {
            i2 = o() - 1;
            i = -1;
        } else {
            i2 = 0;
            i = 1;
        }
        int v = btj.v();
        int Z = this.R.Z();
        int O = this.R.O();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i3) {
            View V = V(i2);
            int n = kds.n(V);
            int e = this.R.e(V);
            int v2 = this.R.v(V);
            if (n >= 0 && n < v) {
                if (!((l88) V.getLayoutParams()).c()) {
                    boolean z3 = v2 <= Z && e < Z;
                    boolean z4 = e >= O && v2 > O;
                    if (!z3 && !z4) {
                        return V;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = V;
                        }
                        view2 = V;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = V;
                        }
                        view2 = V;
                    }
                } else if (view3 == null) {
                    view3 = V;
                }
            }
            i2 += i;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // defpackage.kds
    public int U(btj btj) {
        return PN(btj);
    }

    public final View WF() {
        return V(this.f1368Z ? 0 : o() - 1);
    }

    @Override // defpackage.kds
    public final boolean X() {
        return this.O == 1;
    }

    @Override // defpackage.kds
    public final void Z(int i, int i2, btj btj, ma7 ma7) {
        if (this.O != 0) {
            i = i2;
        }
        if (o() != 0 && i != 0) {
            MG();
            s3(i > 0 ? 1 : -1, Math.abs(i), true, btj);
            ve(btj, this.f1363R, ma7);
        }
    }

    @Override // defpackage.kds
    public int ZW(int i, fgh fgh, btj btj) {
        if (this.O == 0) {
            return 0;
        }
        return ax(i, fgh, btj);
    }

    @Override // defpackage.kds
    public final Parcelable _() {
        m6N m6n = this.f1366R;
        if (m6n != null) {
            return new m6N(m6n);
        }
        m6N m6n2 = new m6N();
        if (o() > 0) {
            MG();
            boolean z = this.f1362O ^ this.f1368Z;
            m6n2.R = z;
            if (z) {
                View WF = WF();
                m6n2.X = this.R.O() - this.R.v(WF);
                m6n2.e = kds.n(WF);
            } else {
                View _5 = _5();
                m6n2.e = kds.n(_5);
                m6n2.X = this.R.e(_5) - this.R.Z();
            }
        } else {
            m6n2.e = -1;
        }
        return m6n2;
    }

    public final View _5() {
        return V(this.f1368Z ? o() - 1 : 0);
    }

    public void _i(boolean z) {
        c(null);
        if (this.f1369m != z) {
            this.f1369m = z;
            cE();
        }
    }

    public void _m(fgh fgh, btj btj, gbl gbl, int i) {
    }

    public final int aS(int i, fgh fgh, btj btj, boolean z) {
        int O;
        int O2 = this.R.O() - i;
        if (O2 <= 0) {
            return 0;
        }
        int i2 = -ax(-O2, fgh, btj);
        int i3 = i + i2;
        if (!z || (O = this.R.O() - i3) <= 0) {
            return i2;
        }
        this.R.C(O);
        return O + i2;
    }

    public final int ax(int i, fgh fgh, btj btj) {
        if (o() == 0 || i == 0) {
            return 0;
        }
        MG();
        this.f1363R.f3046R = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        s3(i2, abs, true, btj);
        eIq eiq = this.f1363R;
        int Ry = Ry(fgh, eiq, btj, false) + eiq.O;
        if (Ry < 0) {
            return 0;
        }
        if (abs > Ry) {
            i = i2 * Ry;
        }
        this.R.C(-i);
        this.f1363R.m = i;
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018f  */
    @Override // defpackage.kds
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(defpackage.fgh r18, defpackage.btj r19) {
        /*
        // Method dump skipped, instructions count: 1132
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.b(fgh, btj):void");
    }

    @Override // defpackage.kds
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.f1366R == null && (recyclerView = ((kds) this).f5374R) != null) {
            recyclerView.m(str);
        }
    }

    public final View c0(boolean z) {
        return this.f1368Z ? k8(o() - 1, -1, z, true) : k8(0, o(), z, true);
    }

    public final View cR(int i, int i2) {
        int i3;
        int i4;
        MG();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return V(i);
        }
        if (this.R.e(V(i)) < this.R.Z()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return this.O == 0 ? ((kds) this).f5375R.Z(i, i2, i4, i3) : ((kds) this).f5381v.Z(i, i2, i4, i3);
    }

    @Override // defpackage.kds
    public final boolean d() {
        return true;
    }

    @Override // defpackage.kds
    public final boolean e() {
        return this.O == 0;
    }

    public final int ec(int i, fgh fgh, btj btj, boolean z) {
        int Z;
        int Z2 = i - this.R.Z();
        if (Z2 <= 0) {
            return 0;
        }
        int i2 = -ax(Z2, fgh, btj);
        int i3 = i + i2;
        if (!z || (Z = i3 - this.R.Z()) <= 0) {
            return i2;
        }
        this.R.C(-Z);
        return i2 - Z;
    }

    @Override // defpackage.kds
    public final View g(int i) {
        int o = o();
        if (o == 0) {
            return null;
        }
        int n = i - kds.n(V(0));
        if (n >= 0 && n < o) {
            View V = V(n);
            if (kds.n(V) == i) {
                return V;
            }
        }
        return super.g(i);
    }

    public final int hi(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.O == 1) ? 1 : Integer.MIN_VALUE : this.O == 0 ? 1 : Integer.MIN_VALUE : this.O == 1 ? -1 : Integer.MIN_VALUE : this.O == 0 ? -1 : Integer.MIN_VALUE : (this.O != 1 && rz()) ? -1 : 1 : (this.O != 1 && rz()) ? 1 : -1;
    }

    @Override // defpackage.kds
    public int iE(int i, fgh fgh, btj btj) {
        if (this.O == 1) {
            return 0;
        }
        return ax(i, fgh, btj);
    }

    public final int iS() {
        View k8 = k8(0, o(), false, true);
        if (k8 == null) {
            return -1;
        }
        return kds.n(k8);
    }

    public final void jp(fgh fgh, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                while (true) {
                    i2--;
                    if (i2 >= i) {
                        View V = V(i2);
                        vr(i2);
                        fgh.O(V);
                    } else {
                        return;
                    }
                }
            } else {
                while (i > i2) {
                    View V2 = V(i);
                    vr(i);
                    fgh.O(V2);
                    i--;
                }
            }
        }
    }

    public final View k8(int i, int i2, boolean z, boolean z2) {
        MG();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return this.O == 0 ? ((kds) this).f5375R.Z(i, i2, i4, i3) : ((kds) this).f5381v.Z(i, i2, i4, i3);
    }

    public final void ky(int i) {
        if (i == 0 || i == 1) {
            c(null);
            if (i != this.O || this.R == null) {
                a40 R = g2N.R(this, i);
                this.R = R;
                this.f1365R.f3796R = R;
                this.O = i;
                cE();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(opT.Z("invalid orientation:", i));
    }

    public final void lU() {
        if (this.O == 1 || !rz()) {
            this.f1368Z = this.f1361L;
        } else {
            this.f1368Z = !this.f1361L;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    @Override // defpackage.kds
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(int r7, defpackage.ma7 r8) {
        /*
            r6 = this;
            m6N r0 = r6.f1366R
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 == 0) goto L_0x0013
            int r4 = r0.e
            if (r4 < 0) goto L_0x000d
            r5 = r3
            goto L_0x000e
        L_0x000d:
            r5 = r1
        L_0x000e:
            if (r5 == 0) goto L_0x0013
            boolean r0 = r0.R
            goto L_0x0022
        L_0x0013:
            r6.lU()
            boolean r0 = r6.f1368Z
            int r4 = r6.L
            if (r4 != r2) goto L_0x0022
            if (r0 == 0) goto L_0x0021
            int r4 = r7 + -1
            goto L_0x0022
        L_0x0021:
            r4 = r1
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            r0 = r1
        L_0x0027:
            int r3 = r6.m
            if (r0 >= r3) goto L_0x0036
            if (r4 < 0) goto L_0x0036
            if (r4 >= r7) goto L_0x0036
            r8.p(r4, r1)
            int r4 = r4 + r2
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.m(int, ma7):void");
    }

    @Override // defpackage.kds
    public boolean mh() {
        return this.f1366R == null && this.f1362O == this.f1369m;
    }

    public final int np(btj btj) {
        if (o() == 0) {
            return 0;
        }
        MG();
        return aH9.Q(btj, this.R, c0(!this.x), zE(!this.x), this, this.x, this.f1368Z);
    }

    @Override // defpackage.kds
    public final void p(RecyclerView recyclerView) {
    }

    @Override // defpackage.kds
    public final void q(Parcelable parcelable) {
        if (parcelable instanceof m6N) {
            m6N m6n = (m6N) parcelable;
            this.f1366R = m6n;
            if (this.L != -1) {
                m6n.e = -1;
            }
            cE();
        }
    }

    public final boolean rz() {
        RecyclerView recyclerView = ((kds) this).f5374R;
        WeakHashMap weakHashMap = of5.f6887R;
        return eHQ.e(recyclerView) == 1;
    }

    public final void s3(int i, int i2, boolean z, btj btj) {
        int i3;
        int i4;
        int i5 = 1;
        boolean z2 = false;
        this.f1363R.f3047v = this.R.L() == 0 && this.R.X() == 0;
        this.f1363R.X = i;
        int[] iArr = this.f1367R;
        iArr[0] = 0;
        iArr[1] = 0;
        KZ(btj, iArr);
        int max = Math.max(0, this.f1367R[0]);
        int max2 = Math.max(0, this.f1367R[1]);
        if (i == 1) {
            z2 = true;
        }
        eIq eiq = this.f1363R;
        int i6 = z2 ? max2 : max;
        eiq.L = i6;
        if (!z2) {
            max = max2;
        }
        eiq.Z = max;
        if (z2) {
            a40 a40 = this.R;
            switch (a40.v) {
                case 0:
                    i4 = ((g2N) a40).f3657R.u();
                    break;
                default:
                    i4 = ((g2N) a40).f3657R.h();
                    break;
            }
            eiq.L = i4 + i6;
            View WF = WF();
            eIq eiq2 = this.f1363R;
            if (this.f1368Z) {
                i5 = -1;
            }
            eiq2.e = i5;
            int n = kds.n(WF);
            eIq eiq3 = this.f1363R;
            eiq2.c = n + eiq3.e;
            eiq3.R = this.R.v(WF);
            i3 = this.R.v(WF) - this.R.O();
        } else {
            View _5 = _5();
            eIq eiq4 = this.f1363R;
            eiq4.L = this.R.Z() + eiq4.L;
            eIq eiq5 = this.f1363R;
            if (!this.f1368Z) {
                i5 = -1;
            }
            eiq5.e = i5;
            int n2 = kds.n(_5);
            eIq eiq6 = this.f1363R;
            eiq5.c = n2 + eiq6.e;
            eiq6.R = this.R.e(_5);
            i3 = (-this.R.e(_5)) + this.R.Z();
        }
        eIq eiq7 = this.f1363R;
        eiq7.v = i2;
        if (z) {
            eiq7.v = i2 - i3;
        }
        eiq7.O = i3;
    }

    public void tR(fgh fgh, btj btj, eIq eiq, gN7 gn7) {
        int i;
        int i2;
        int i3;
        int i4;
        View v = eiq.v(fgh);
        if (v == null) {
            gn7.f3744R = true;
            return;
        }
        l88 l88 = (l88) v.getLayoutParams();
        if (eiq.f3045R == null) {
            if (this.f1368Z == (eiq.X == -1)) {
                v(v, -1, false);
            } else {
                v(v, 0, false);
            }
        } else {
            if (this.f1368Z == (eiq.X == -1)) {
                v(v, -1, true);
            } else {
                v(v, 0, true);
            }
        }
        l88 l882 = (l88) v.getLayoutParams();
        Rect s = ((kds) this).f5374R.s(v);
        int K = kds.K(e(), ((kds) this).e, ((kds) this).v, u() + I() + ((ViewGroup.MarginLayoutParams) l882).leftMargin + ((ViewGroup.MarginLayoutParams) l882).rightMargin + s.left + s.right + 0, ((ViewGroup.MarginLayoutParams) l882).width);
        int K2 = kds.K(X(), ((kds) this).X, ((kds) this).c, h() + z() + ((ViewGroup.MarginLayoutParams) l882).topMargin + ((ViewGroup.MarginLayoutParams) l882).bottomMargin + s.top + s.bottom + 0, ((ViewGroup.MarginLayoutParams) l882).height);
        if (yG(v, K, K2, l882)) {
            v.measure(K, K2);
        }
        gn7.R = this.R.c(v);
        if (this.O == 1) {
            if (rz()) {
                i4 = ((kds) this).e - u();
                i2 = i4 - this.R.N(v);
            } else {
                int I = I();
                i4 = this.R.N(v) + I;
                i2 = I;
            }
            if (eiq.X == -1) {
                i = eiq.R;
                i3 = i - gn7.R;
            } else {
                i3 = eiq.R;
                i = gn7.R + i3;
            }
        } else {
            i3 = z();
            i = this.R.N(v) + i3;
            if (eiq.X == -1) {
                i4 = eiq.R;
                i2 = i4 - gn7.R;
            } else {
                i2 = eiq.R;
                i4 = gn7.R + i2;
            }
        }
        kds.s(v, i2, i3, i4, i);
        if (l88.c() || l88.v()) {
            gn7.v = true;
        }
        gn7.c = v.hasFocusable();
    }

    public void ve(btj btj, eIq eiq, ma7 ma7) {
        int i = eiq.c;
        if (i >= 0 && i < btj.v()) {
            ma7.p(i, Math.max(0, eiq.O));
        }
    }

    @Override // defpackage.kds
    public void w(btj btj) {
        this.f1366R = null;
        this.L = -1;
        this.Z = Integer.MIN_VALUE;
        this.f1365R.e();
    }

    public final int wW() {
        View k8 = k8(o() - 1, -1, false, true);
        if (k8 == null) {
            return -1;
        }
        return kds.n(k8);
    }

    @Override // defpackage.kds
    public final boolean wm() {
        boolean z;
        if (!(((kds) this).c == 1073741824 || ((kds) this).v == 1073741824)) {
            int o = o();
            int i = 0;
            while (true) {
                if (i >= o) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = V(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kds
    public final int x(btj btj) {
        return Qg(btj);
    }

    @Override // defpackage.kds
    public final void xN(int i) {
        this.L = i;
        this.Z = Integer.MIN_VALUE;
        m6N m6n = this.f1366R;
        if (m6n != null) {
            m6n.e = -1;
        }
        cE();
    }

    @Override // defpackage.kds
    public l88 y() {
        return new l88(-2, -2);
    }

    @Override // defpackage.kds
    public void yf(RecyclerView recyclerView, int i) {
        nvs nvs = new nvs(recyclerView.getContext());
        nvs.f6628R = i;
        JD(nvs);
    }

    public final View zE(boolean z) {
        return this.f1368Z ? k8(0, o(), z, true) : k8(o() - 1, -1, z, true);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.O = 1;
        this.f1361L = false;
        this.f1368Z = false;
        this.f1369m = false;
        this.x = true;
        this.L = -1;
        this.Z = Integer.MIN_VALUE;
        this.f1366R = null;
        this.f1365R = new gbl();
        this.f1364R = new gN7();
        this.m = 2;
        this.f1367R = new int[2];
        hbg Q = kds.Q(context, attributeSet, i, i2);
        ky(Q.R);
        boolean z = Q.f4318R;
        c(null);
        if (z != this.f1361L) {
            this.f1361L = z;
            cE();
        }
        _i(Q.f4319v);
    }
}
