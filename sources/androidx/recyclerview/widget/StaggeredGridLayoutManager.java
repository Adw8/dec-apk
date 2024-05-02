package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends kds implements hmf {
    public int L;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f1429O;

    /* renamed from: R  reason: collision with other field name */
    public g2N f1432R;

    /* renamed from: R  reason: collision with other field name */
    public BitSet f1433R;

    /* renamed from: R  reason: collision with other field name */
    public final mjH f1434R;

    /* renamed from: R  reason: collision with other field name */
    public peG f1435R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f1436R;

    /* renamed from: R  reason: collision with other field name */
    public a06[] f1437R;
    public int Z;

    /* renamed from: Z  reason: collision with other field name */
    public boolean f1438Z;

    /* renamed from: m  reason: collision with other field name */
    public boolean f1439m;
    public g2N v;

    /* renamed from: L  reason: collision with other field name */
    public boolean f1428L = false;
    public int m = -1;
    public int x = Integer.MIN_VALUE;
    public f67 c = new f67(1);
    public int H = 2;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f1430R = new Rect();
    public final aSX R = new aSX(this);

    /* renamed from: x  reason: collision with other field name */
    public boolean f1440x = true;

    /* renamed from: R  reason: collision with other field name */
    public final bA6 f1431R = new bA6(1, this);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.O = -1;
        this.f1429O = false;
        hbg Q = kds.Q(context, attributeSet, i, i2);
        int i3 = Q.R;
        if (i3 == 0 || i3 == 1) {
            c(null);
            if (i3 != this.L) {
                this.L = i3;
                g2N g2n = this.f1432R;
                this.f1432R = this.v;
                this.v = g2n;
                cE();
            }
            int i4 = Q.v;
            c(null);
            if (i4 != this.O) {
                this.c.O();
                cE();
                this.O = i4;
                this.f1433R = new BitSet(this.O);
                this.f1437R = new a06[this.O];
                for (int i5 = 0; i5 < this.O; i5++) {
                    this.f1437R[i5] = new a06(this, i5);
                }
                cE();
            }
            boolean z = Q.f4318R;
            c(null);
            peG peg = this.f1435R;
            if (!(peg == null || peg.f7150R == z)) {
                peg.f7150R = z;
            }
            this.f1429O = z;
            cE();
            this.f1434R = new mjH(0);
            this.f1432R = g2N.R(this, this.L);
            this.v = g2N.R(this, 1 - this.L);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static int A5(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.kds
    public final void B(AccessibilityEvent accessibilityEvent) {
        super.B(accessibilityEvent);
        if (o() > 0) {
            View Ry = Ry(false);
            View MG = MG(false);
            if (Ry != null && MG != null) {
                int n = kds.n(Ry);
                int n2 = kds.n(MG);
                if (n < n2) {
                    accessibilityEvent.setFromIndex(n);
                    accessibilityEvent.setToIndex(n2);
                    return;
                }
                accessibilityEvent.setFromIndex(n2);
                accessibilityEvent.setToIndex(n);
            }
        }
    }

    @Override // defpackage.kds
    public final int C(btj btj) {
        return Qg(btj);
    }

    @Override // defpackage.kds
    public final void D(int i, int i2) {
        S9(i, i2, 4);
    }

    @Override // defpackage.kds
    public final void E(int i, int i2) {
        S9(i, i2, 1);
    }

    @Override // defpackage.kds
    public final void F(int i, int i2) {
        S9(i, i2, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        if (r8.L == 1) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
        if (r8.L == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005d, code lost:
        if (ec() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0069, code lost:
        if (ec() == false) goto L_0x006d;
     */
    @Override // defpackage.kds
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View G(android.view.View r9, int r10, defpackage.fgh r11, defpackage.btj r12) {
        /*
        // Method dump skipped, instructions count: 349
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.G(android.view.View, int, fgh, btj):android.view.View");
    }

    @Override // defpackage.kds
    public final int H(btj btj) {
        return np(btj);
    }

    public final int KZ(int i) {
        if (o() == 0) {
            return this.f1428L ? 1 : -1;
        }
        return (i < iS()) != this.f1428L ? -1 : 1;
    }

    @Override // defpackage.kds
    public final void Kl(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int u = u() + I();
        int h = h() + z();
        if (this.L == 1) {
            int height = rect.height() + h;
            RecyclerView recyclerView = ((kds) this).f5374R;
            WeakHashMap weakHashMap = of5.f6887R;
            i4 = kds.L(i2, height, mHC.e(recyclerView));
            i3 = kds.L(i, (this.Z * this.O) + u, mHC.X(((kds) this).f5374R));
        } else {
            int width = rect.width() + u;
            RecyclerView recyclerView2 = ((kds) this).f5374R;
            WeakHashMap weakHashMap2 = of5.f6887R;
            i3 = kds.L(i, width, mHC.X(recyclerView2));
            i4 = kds.L(i2, (this.Z * this.O) + h, mHC.e(((kds) this).f5374R));
        }
        ((kds) this).f5374R.setMeasuredDimension(i3, i4);
    }

    public final View MG(boolean z) {
        int Z = this.f1432R.Z();
        int O = this.f1432R.O();
        View view = null;
        for (int o = o() - 1; o >= 0; o--) {
            View V = V(o);
            int e = this.f1432R.e(V);
            int v = this.f1432R.v(V);
            if (v > Z && e < O) {
                if (v <= O || !z) {
                    return V;
                }
                if (view == null) {
                    view = V;
                }
            }
        }
        return view;
    }

    @Override // defpackage.kds
    public final int N(btj btj) {
        return np(btj);
    }

    @Override // defpackage.kds
    public final boolean O(l88 l88) {
        return l88 instanceof o_h;
    }

    public final void Ou(int i, fgh fgh) {
        for (int o = o() - 1; o >= 0; o--) {
            View V = V(o);
            if (this.f1432R.e(V) >= i && this.f1432R.U(V) >= i) {
                o_h o_h = (o_h) V.getLayoutParams();
                o_h.getClass();
                if (o_h.R.f713R.size() != 1) {
                    a06 a06 = o_h.R;
                    int size = a06.f713R.size();
                    View view = (View) a06.f713R.remove(size - 1);
                    o_h Z = a06.Z(view);
                    Z.R = null;
                    if (Z.c() || Z.v()) {
                        a06.c -= a06.f712R.f1432R.c(view);
                    }
                    if (size == 1) {
                        a06.R = Integer.MIN_VALUE;
                    }
                    a06.v = Integer.MIN_VALUE;
                    vl(V, fgh);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.kds
    public final int P(btj btj) {
        return PN(btj);
    }

    public final int PN(btj btj) {
        if (o() == 0) {
            return 0;
        }
        return aH9.A(btj, this.f1432R, Ry(!this.f1440x), MG(!this.f1440x), this, this.f1440x);
    }

    public final int Qg(btj btj) {
        if (o() == 0) {
            return 0;
        }
        return aH9.n(btj, this.f1432R, Ry(!this.f1440x), MG(!this.f1440x), this, this.f1440x);
    }

    @Override // defpackage.hmf
    public final PointF R(int i) {
        int KZ = KZ(i);
        PointF pointF = new PointF();
        if (KZ == 0) {
            return null;
        }
        if (this.L == 0) {
            pointF.x = (float) KZ;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) KZ;
        }
        return pointF;
    }

    public final View Ry(boolean z) {
        int Z = this.f1432R.Z();
        int O = this.f1432R.O();
        int o = o();
        View view = null;
        for (int i = 0; i < o; i++) {
            View V = V(i);
            int e = this.f1432R.e(V);
            if (this.f1432R.v(V) > Z && e < O) {
                if (e >= Z || !z) {
                    return V;
                }
                if (view == null) {
                    view = V;
                }
            }
        }
        return view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S9(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f1428L
            if (r0 == 0) goto L_0x0009
            int r0 = r6.wW()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.iS()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            f67 r4 = r6.c
            r4.m(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            f67 r9 = r6.c
            r9.U(r7, r4)
            f67 r7 = r6.c
            r7.H(r8, r4)
            goto L_0x0041
        L_0x0036:
            f67 r9 = r6.c
            r9.U(r7, r8)
            goto L_0x0041
        L_0x003c:
            f67 r9 = r6.c
            r9.H(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f1428L
            if (r7 == 0) goto L_0x004d
            int r7 = r6.iS()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.wW()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.cE()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S9(int, int, int):void");
    }

    @Override // defpackage.kds
    public final void T(int i) {
        super.T(i);
        for (int i2 = 0; i2 < this.O; i2++) {
            a06 a06 = this.f1437R[i2];
            int i3 = a06.R;
            if (i3 != Integer.MIN_VALUE) {
                a06.R = i3 + i;
            }
            int i4 = a06.v;
            if (i4 != Integer.MIN_VALUE) {
                a06.v = i4 + i;
            }
        }
    }

    @Override // defpackage.kds
    public final int U(btj btj) {
        return PN(btj);
    }

    public final void WF(View view, int i, int i2, boolean z) {
        Rect rect = this.f1430R;
        RecyclerView recyclerView = ((kds) this).f5374R;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.s(view));
        }
        o_h o_h = (o_h) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) o_h).leftMargin;
        Rect rect2 = this.f1430R;
        int A5 = A5(i, i3 + rect2.left, ((ViewGroup.MarginLayoutParams) o_h).rightMargin + rect2.right);
        int i4 = ((ViewGroup.MarginLayoutParams) o_h).topMargin;
        Rect rect3 = this.f1430R;
        int A52 = A5(i2, i4 + rect3.top, ((ViewGroup.MarginLayoutParams) o_h).bottomMargin + rect3.bottom);
        if (yG(view, A5, A52, o_h)) {
            view.measure(A5, A52);
        }
    }

    @Override // defpackage.kds
    public final boolean X() {
        return this.L == 1;
    }

    @Override // defpackage.kds
    public final void Z(int i, int i2, btj btj, ma7 ma7) {
        int i3;
        int i4;
        if (this.L != 0) {
            i = i2;
        }
        if (!(o() == 0 || i == 0)) {
            tR(i, btj);
            int[] iArr = this.f1436R;
            if (iArr == null || iArr.length < this.O) {
                this.f1436R = new int[this.O];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.O; i6++) {
                mjH mjh = this.f1434R;
                if (mjh.e == -1) {
                    i4 = mjh.O;
                    i3 = this.f1437R[i6].m(i4);
                } else {
                    i4 = this.f1437R[i6].O(mjh.L);
                    i3 = this.f1434R.L;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f1436R[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f1436R, 0, i5);
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = this.f1434R.c;
                if (i9 >= 0 && i9 < btj.v()) {
                    ma7.p(this.f1434R.c, this.f1436R[i8]);
                    mjH mjh2 = this.f1434R;
                    mjh2.c += mjh2.e;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.kds
    public final int ZW(int i, fgh fgh, btj btj) {
        return ax(i, fgh, btj);
    }

    @Override // defpackage.kds
    public final Parcelable _() {
        int i;
        int i2;
        int[] iArr;
        peG peg = this.f1435R;
        if (peg != null) {
            return new peG(peg);
        }
        peG peg2 = new peG();
        peg2.f7150R = this.f1429O;
        peg2.v = this.f1438Z;
        peg2.c = this.f1439m;
        f67 f67 = this.c;
        if (f67 == null || (iArr = (int[]) f67.f3304R) == null) {
            peg2.L = 0;
        } else {
            peg2.f7152v = iArr;
            peg2.L = iArr.length;
            peg2.R = (List) f67.v;
        }
        int i3 = -1;
        if (o() > 0) {
            peg2.e = this.f1438Z ? wW() : iS();
            View MG = this.f1428L ? MG(true) : Ry(true);
            if (MG != null) {
                i3 = kds.n(MG);
            }
            peg2.X = i3;
            int i4 = this.O;
            peg2.O = i4;
            peg2.f7151R = new int[i4];
            for (int i5 = 0; i5 < this.O; i5++) {
                if (this.f1438Z) {
                    i = this.f1437R[i5].O(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f1432R.O();
                        i -= i2;
                        peg2.f7151R[i5] = i;
                    } else {
                        peg2.f7151R[i5] = i;
                    }
                } else {
                    i = this.f1437R[i5].m(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f1432R.Z();
                        i -= i2;
                        peg2.f7151R[i5] = i;
                    } else {
                        peg2.f7151R[i5] = i;
                    }
                }
            }
        } else {
            peg2.e = -1;
            peg2.X = -1;
            peg2.O = 0;
        }
        return peg2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:238:0x041f, code lost:
        if (ve() != false) goto L_0x0423;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void _5(defpackage.fgh r12, defpackage.btj r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 1089
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager._5(fgh, btj, boolean):void");
    }

    public final void _i(int i, btj btj) {
        int i2;
        int i3;
        int i4;
        mjH mjh = this.f1434R;
        boolean z = false;
        mjh.v = 0;
        mjh.c = i;
        nvs nvs = ((kds) this).f5376R;
        if (!(nvs != null && nvs.f6639v) || (i4 = btj.R) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            if (this.f1428L == (i4 < i)) {
                i3 = this.f1432R.m();
                i2 = 0;
            } else {
                i2 = this.f1432R.m();
                i3 = 0;
            }
        }
        RecyclerView recyclerView = ((kds) this).f5374R;
        if (recyclerView != null && recyclerView.f1405R) {
            this.f1434R.O = this.f1432R.Z() - i2;
            this.f1434R.L = this.f1432R.O() + i3;
        } else {
            this.f1434R.L = this.f1432R.X() + i3;
            this.f1434R.O = -i2;
        }
        mjH mjh2 = this.f1434R;
        mjh2.f6139v = false;
        mjh2.f6137R = true;
        if (this.f1432R.L() == 0 && this.f1432R.X() == 0) {
            z = true;
        }
        mjh2.f6138c = z;
    }

    public final void _m(fgh fgh, mjH mjh) {
        if (mjh.f6137R && !mjh.f6138c) {
            if (mjh.v != 0) {
                int i = 1;
                if (mjh.X == -1) {
                    int i2 = mjh.O;
                    int m = this.f1437R[0].m(i2);
                    while (i < this.O) {
                        int m2 = this.f1437R[i].m(i2);
                        if (m2 > m) {
                            m = m2;
                        }
                        i++;
                    }
                    int i3 = i2 - m;
                    Ou(i3 < 0 ? mjh.L : mjh.L - Math.min(i3, mjh.v), fgh);
                    return;
                }
                int i4 = mjh.L;
                int O = this.f1437R[0].O(i4);
                while (i < this.O) {
                    int O2 = this.f1437R[i].O(i4);
                    if (O2 < O) {
                        O = O2;
                    }
                    i++;
                }
                int i5 = O - mjh.L;
                jp(i5 < 0 ? mjh.O : Math.min(i5, mjh.v) + mjh.O, fgh);
            } else if (mjh.X == -1) {
                Ou(mjh.L, fgh);
            } else {
                jp(mjh.O, fgh);
            }
        }
    }

    @Override // defpackage.kds
    public final void a(int i, int i2) {
        S9(i, i2, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d1, code lost:
        if (r10 == r11) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e3, code lost:
        if (r10 == r11) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e5, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View aS() {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.aS():android.view.View");
    }

    public final int ax(int i, fgh fgh, btj btj) {
        if (o() == 0 || i == 0) {
            return 0;
        }
        tR(i, btj);
        int hi = hi(fgh, this.f1434R, btj);
        if (this.f1434R.v >= hi) {
            i = i < 0 ? -hi : hi;
        }
        this.f1432R.C(-i);
        this.f1438Z = this.f1428L;
        mjH mjh = this.f1434R;
        mjh.v = 0;
        _m(fgh, mjh);
        return i;
    }

    @Override // defpackage.kds
    public final void b(fgh fgh, btj btj) {
        _5(fgh, btj, true);
    }

    @Override // defpackage.kds
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.f1435R == null && (recyclerView = ((kds) this).f5374R) != null) {
            recyclerView.m(str);
        }
    }

    public final void c0(fgh fgh, btj btj, boolean z) {
        int Z;
        int k8 = k8(Integer.MAX_VALUE);
        if (k8 != Integer.MAX_VALUE && (Z = k8 - this.f1432R.Z()) > 0) {
            int ax = Z - ax(Z, fgh, btj);
            if (z && ax > 0) {
                this.f1432R.C(-ax);
            }
        }
    }

    public final int cR(int i) {
        int O = this.f1437R[0].O(i);
        for (int i2 = 1; i2 < this.O; i2++) {
            int O2 = this.f1437R[i2].O(i);
            if (O2 > O) {
                O = O2;
            }
        }
        return O;
    }

    @Override // defpackage.kds
    public final boolean d() {
        return this.H != 0;
    }

    @Override // defpackage.kds
    public final boolean e() {
        return this.L == 0;
    }

    public final boolean ec() {
        RecyclerView recyclerView = ((kds) this).f5374R;
        WeakHashMap weakHashMap = of5.f6887R;
        return eHQ.e(recyclerView) == 1;
    }

    @Override // defpackage.kds
    public final void f() {
        this.c.O();
        cE();
    }

    public final int hi(fgh fgh, mjH mjh, btj btj) {
        a06 a06;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        this.f1433R.set(0, this.O, true);
        int i9 = this.f1434R.f6138c ? mjh.X == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : mjh.X == 1 ? mjh.L + mjh.v : mjh.O - mjh.v;
        int i10 = mjh.X;
        for (int i11 = 0; i11 < this.O; i11++) {
            if (!this.f1437R[i11].f713R.isEmpty()) {
                s3(this.f1437R[i11], i10, i9);
            }
        }
        int O = this.f1428L ? this.f1432R.O() : this.f1432R.Z();
        Object[] objArr = null;
        while (true) {
            int i12 = mjh.c;
            if (((i12 < 0 || i12 >= btj.v()) ? i8 : 1) == 0 || (!this.f1434R.f6138c && this.f1433R.isEmpty())) {
                break;
            }
            View view = fgh.m(mjh.c, Long.MAX_VALUE).f4097R;
            mjh.c += mjh.e;
            o_h o_h = (o_h) view.getLayoutParams();
            int R = o_h.R();
            int[] iArr = (int[]) this.c.f3304R;
            int i13 = (iArr == null || R >= iArr.length) ? -1 : iArr[R];
            if ((i13 == -1 ? 1 : i8) != 0) {
                if (rz(mjh.X)) {
                    i6 = this.O - 1;
                    i5 = -1;
                    i7 = -1;
                } else {
                    i7 = this.O;
                    i6 = i8;
                    i5 = 1;
                }
                a06 = null;
                if (mjh.X == 1) {
                    int Z = this.f1432R.Z();
                    int i14 = Integer.MAX_VALUE;
                    while (i6 != i7) {
                        a06 a062 = this.f1437R[i6];
                        int O2 = a062.O(Z);
                        if (O2 < i14) {
                            a06 = a062;
                            i14 = O2;
                        }
                        i6 += i5;
                    }
                } else {
                    int O3 = this.f1432R.O();
                    int i15 = Integer.MIN_VALUE;
                    while (i6 != i7) {
                        a06 a063 = this.f1437R[i6];
                        int m = a063.m(O3);
                        if (m > i15) {
                            a06 = a063;
                            i15 = m;
                        }
                        i6 += i5;
                    }
                }
                f67 f67 = this.c;
                f67.L(R);
                ((int[]) f67.f3304R)[R] = a06.e;
            } else {
                a06 = this.f1437R[i13];
            }
            o_h.R = a06;
            if (mjh.X == 1) {
                z = false;
                v(view, -1, false);
            } else {
                z = false;
                v(view, 0, false);
            }
            if (this.L == 1) {
                int i16 = this.Z;
                int i17 = ((kds) this).v;
                int i18 = ((ViewGroup.MarginLayoutParams) o_h).width;
                int i19 = z ? 1 : 0;
                int i20 = z ? 1 : 0;
                int i21 = z ? 1 : 0;
                WF(view, kds.K(z, i16, i17, i19, i18), kds.K(true, ((kds) this).X, ((kds) this).c, h() + z(), ((ViewGroup.MarginLayoutParams) o_h).height), z);
            } else {
                WF(view, kds.K(true, ((kds) this).e, ((kds) this).v, u() + I(), ((ViewGroup.MarginLayoutParams) o_h).width), kds.K(false, this.Z, ((kds) this).c, 0, ((ViewGroup.MarginLayoutParams) o_h).height), false);
            }
            if (mjh.X == 1) {
                i2 = a06.O(O);
                i = this.f1432R.c(view) + i2;
            } else {
                i = a06.m(O);
                i2 = i - this.f1432R.c(view);
            }
            if (mjh.X == 1) {
                a06 a064 = o_h.R;
                a064.getClass();
                o_h o_h2 = (o_h) view.getLayoutParams();
                o_h2.R = a064;
                a064.f713R.add(view);
                a064.v = Integer.MIN_VALUE;
                if (a064.f713R.size() == 1) {
                    a064.R = Integer.MIN_VALUE;
                }
                if (o_h2.c() || o_h2.v()) {
                    a064.c = a064.f712R.f1432R.c(view) + a064.c;
                }
            } else {
                a06 a065 = o_h.R;
                a065.getClass();
                o_h o_h3 = (o_h) view.getLayoutParams();
                o_h3.R = a065;
                a065.f713R.add(0, view);
                a065.R = Integer.MIN_VALUE;
                if (a065.f713R.size() == 1) {
                    a065.v = Integer.MIN_VALUE;
                }
                if (o_h3.c() || o_h3.v()) {
                    a065.c = a065.f712R.f1432R.c(view) + a065.c;
                }
            }
            if (!ec() || this.L != 1) {
                i3 = this.v.Z() + (a06.e * this.Z);
                i4 = this.v.c(view) + i3;
            } else {
                i4 = this.v.O() - (((this.O - 1) - a06.e) * this.Z);
                i3 = i4 - this.v.c(view);
            }
            if (this.L == 1) {
                kds.s(view, i3, i2, i4, i);
            } else {
                kds.s(view, i2, i3, i, i4);
            }
            s3(a06, this.f1434R.X, i9);
            _m(fgh, this.f1434R);
            if (!this.f1434R.f6139v || !view.hasFocusable()) {
                i8 = 0;
            } else {
                i8 = 0;
                this.f1433R.set(a06.e, false);
            }
            objArr = 1;
        }
        if (objArr == null) {
            _m(fgh, this.f1434R);
        }
        int Z2 = this.f1434R.X == -1 ? this.f1432R.Z() - k8(this.f1432R.Z()) : cR(this.f1432R.O()) - this.f1432R.O();
        return Z2 > 0 ? Math.min(mjh.v, Z2) : i8;
    }

    @Override // defpackage.kds
    public final l88 i(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new o_h((ViewGroup.MarginLayoutParams) layoutParams) : new o_h(layoutParams);
    }

    @Override // defpackage.kds
    public final int iE(int i, fgh fgh, btj btj) {
        return ax(i, fgh, btj);
    }

    public final int iS() {
        if (o() == 0) {
            return 0;
        }
        return kds.n(V(0));
    }

    public final void jp(int i, fgh fgh) {
        while (o() > 0) {
            View V = V(0);
            if (this.f1432R.v(V) <= i && this.f1432R.H(V) <= i) {
                o_h o_h = (o_h) V.getLayoutParams();
                o_h.getClass();
                if (o_h.R.f713R.size() != 1) {
                    a06 a06 = o_h.R;
                    View view = (View) a06.f713R.remove(0);
                    o_h Z = a06.Z(view);
                    Z.R = null;
                    if (a06.f713R.size() == 0) {
                        a06.v = Integer.MIN_VALUE;
                    }
                    if (Z.c() || Z.v()) {
                        a06.c -= a06.f712R.f1432R.c(view);
                    }
                    a06.R = Integer.MIN_VALUE;
                    vl(V, fgh);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.kds
    public final void k() {
        this.c.O();
        for (int i = 0; i < this.O; i++) {
            this.f1437R[i].v();
        }
    }

    public final int k8(int i) {
        int m = this.f1437R[0].m(i);
        for (int i2 = 1; i2 < this.O; i2++) {
            int m2 = this.f1437R[i2].m(i);
            if (m2 < m) {
                m = m2;
            }
        }
        return m;
    }

    public final void ky(int i) {
        mjH mjh = this.f1434R;
        mjh.X = i;
        int i2 = 1;
        if (this.f1428L != (i == -1)) {
            i2 = -1;
        }
        mjh.e = i2;
    }

    public final void lU() {
        if (this.L == 1 || !ec()) {
            this.f1428L = this.f1429O;
        } else {
            this.f1428L = !this.f1429O;
        }
    }

    @Override // defpackage.kds
    public final void mL(int i) {
        if (i == 0) {
            ve();
        }
    }

    @Override // defpackage.kds
    public final boolean mh() {
        return this.f1435R == null;
    }

    public final int np(btj btj) {
        if (o() == 0) {
            return 0;
        }
        return aH9.Q(btj, this.f1432R, Ry(!this.f1440x), MG(!this.f1440x), this, this.f1440x, this.f1428L);
    }

    @Override // defpackage.kds
    public final void p(RecyclerView recyclerView) {
        bA6 ba6 = this.f1431R;
        RecyclerView recyclerView2 = ((kds) this).f5374R;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(ba6);
        }
        for (int i = 0; i < this.O; i++) {
            this.f1437R[i].v();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.kds
    public final void q(Parcelable parcelable) {
        if (parcelable instanceof peG) {
            peG peg = (peG) parcelable;
            this.f1435R = peg;
            if (this.m != -1) {
                peg.f7151R = null;
                peg.O = 0;
                peg.e = -1;
                peg.X = -1;
                peg.f7151R = null;
                peg.O = 0;
                peg.L = 0;
                peg.f7152v = null;
                peg.R = null;
            }
            cE();
        }
    }

    @Override // defpackage.kds
    public final void r(int i) {
        super.r(i);
        for (int i2 = 0; i2 < this.O; i2++) {
            a06 a06 = this.f1437R[i2];
            int i3 = a06.R;
            if (i3 != Integer.MIN_VALUE) {
                a06.R = i3 + i;
            }
            int i4 = a06.v;
            if (i4 != Integer.MIN_VALUE) {
                a06.v = i4 + i;
            }
        }
    }

    public final boolean rz(int i) {
        if (this.L == 0) {
            return (i == -1) != this.f1428L;
        }
        return ((i == -1) == this.f1428L) == ec();
    }

    public final void s3(a06 a06, int i, int i2) {
        int i3 = a06.c;
        if (i == -1) {
            int i4 = a06.R;
            if (i4 == Integer.MIN_VALUE) {
                View view = (View) a06.f713R.get(0);
                o_h Z = a06.Z(view);
                a06.R = a06.f712R.f1432R.e(view);
                Z.getClass();
                i4 = a06.R;
            }
            if (i4 + i3 <= i2) {
                this.f1433R.set(a06.e, false);
                return;
            }
            return;
        }
        int i5 = a06.v;
        if (i5 == Integer.MIN_VALUE) {
            a06.R();
            i5 = a06.v;
        }
        if (i5 - i3 >= i2) {
            this.f1433R.set(a06.e, false);
        }
    }

    @Override // defpackage.kds
    public final l88 t(Context context, AttributeSet attributeSet) {
        return new o_h(context, attributeSet);
    }

    public final void tR(int i, btj btj) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = wW();
            i2 = 1;
        } else {
            i2 = -1;
            i3 = iS();
        }
        this.f1434R.f6137R = true;
        _i(i3, btj);
        ky(i2);
        mjH mjh = this.f1434R;
        mjh.c = i3 + mjh.e;
        mjh.v = Math.abs(i);
    }

    public final boolean ve() {
        int i;
        if (!(o() == 0 || this.H == 0 || !((kds) this).f5382v)) {
            if (this.f1428L) {
                i = wW();
                iS();
            } else {
                i = iS();
                wW();
            }
            if (i == 0 && aS() != null) {
                this.c.O();
                ((kds) this).f5377R = true;
                cE();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kds
    public final void w(btj btj) {
        this.m = -1;
        this.x = Integer.MIN_VALUE;
        this.f1435R = null;
        this.R.R();
    }

    public final int wW() {
        int o = o();
        if (o == 0) {
            return 0;
        }
        return kds.n(V(o - 1));
    }

    @Override // defpackage.kds
    public final int x(btj btj) {
        return Qg(btj);
    }

    @Override // defpackage.kds
    public final void xN(int i) {
        peG peg = this.f1435R;
        if (!(peg == null || peg.e == i)) {
            peg.f7151R = null;
            peg.O = 0;
            peg.e = -1;
            peg.X = -1;
        }
        this.m = i;
        this.x = Integer.MIN_VALUE;
        cE();
    }

    @Override // defpackage.kds
    public final l88 y() {
        return this.L == 0 ? new o_h(-2, -1) : new o_h(-1, -2);
    }

    @Override // defpackage.kds
    public final void yf(RecyclerView recyclerView, int i) {
        nvs nvs = new nvs(recyclerView.getContext());
        nvs.f6628R = i;
        JD(nvs);
    }

    public final void zE(fgh fgh, btj btj, boolean z) {
        int O;
        int cR = cR(Integer.MIN_VALUE);
        if (cR != Integer.MIN_VALUE && (O = this.f1432R.O() - cR) > 0) {
            int i = O - (-ax(-O, fgh, btj));
            if (z && i > 0) {
                this.f1432R.C(i);
            }
        }
    }
}
