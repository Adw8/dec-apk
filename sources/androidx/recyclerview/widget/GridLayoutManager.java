package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: R  reason: collision with other field name */
    public View[] f1359R;

    /* renamed from: v  reason: collision with other field name */
    public int[] f1360v;
    public boolean H = false;
    public int x = -1;

    /* renamed from: R  reason: collision with other field name */
    public final SparseIntArray f1357R = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();

    /* renamed from: R  reason: collision with other field name */
    public epC f1358R = new epC();
    public final Rect R = new Rect();

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        R2(kds.Q(context, attributeSet, i, i2).v);
    }

    @Override // defpackage.kds
    public final int A(fgh fgh, btj btj) {
        if (((LinearLayoutManager) this).O == 0) {
            return this.x;
        }
        if (btj.v() < 1) {
            return 0;
        }
        return uv(btj.v() - 1, fgh, btj) + 1;
    }

    public final void CD() {
        int i;
        int i2;
        if (((LinearLayoutManager) this).O == 1) {
            i2 = ((kds) this).e - u();
            i = I();
        } else {
            i2 = ((kds) this).X - h();
            i = z();
        }
        FP(i2 - i);
    }

    @Override // defpackage.kds
    public final void D(int i, int i2) {
        this.f1358R.e();
        ((SparseIntArray) this.f1358R.v).clear();
    }

    @Override // defpackage.kds
    public final void E(int i, int i2) {
        this.f1358R.e();
        ((SparseIntArray) this.f1358R.v).clear();
    }

    @Override // defpackage.kds
    public final void F(int i, int i2) {
        this.f1358R.e();
        ((SparseIntArray) this.f1358R.v).clear();
    }

    public final void FP(int i) {
        int i2;
        int[] iArr = this.f1360v;
        int i3 = this.x;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f1360v = iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e1, code lost:
        if (r13 == (r2 > r15)) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0111, code lost:
        if (r13 == (r2 > r9)) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (((defpackage.kds) r22).f5373R.x(r3) != false) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x011d  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.kds
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View G(android.view.View r23, int r24, defpackage.fgh r25, defpackage.btj r26) {
        /*
        // Method dump skipped, instructions count: 349
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.G(android.view.View, int, fgh, btj):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.kds
    public final int H(btj btj) {
        return np(btj);
    }

    public final int HK(int i, int i2) {
        if (((LinearLayoutManager) this).O != 1 || !rz()) {
            int[] iArr = this.f1360v;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1360v;
        int i3 = this.x;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // defpackage.kds
    public final int J(fgh fgh, btj btj) {
        if (((LinearLayoutManager) this).O == 1) {
            return this.x;
        }
        if (btj.v() < 1) {
            return 0;
        }
        return uv(btj.v() - 1, fgh, btj) + 1;
    }

    @Override // defpackage.kds
    public final void Kl(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f1360v == null) {
            super.Kl(rect, i, i2);
        }
        int u = u() + I();
        int h = h() + z();
        if (((LinearLayoutManager) this).O == 1) {
            int height = rect.height() + h;
            RecyclerView recyclerView = ((kds) this).f5374R;
            WeakHashMap weakHashMap = of5.f6887R;
            i4 = kds.L(i2, height, mHC.e(recyclerView));
            int[] iArr = this.f1360v;
            i3 = kds.L(i, iArr[iArr.length - 1] + u, mHC.X(((kds) this).f5374R));
        } else {
            int width = rect.width() + u;
            RecyclerView recyclerView2 = ((kds) this).f5374R;
            WeakHashMap weakHashMap2 = of5.f6887R;
            i3 = kds.L(i, width, mHC.X(recyclerView2));
            int[] iArr2 = this.f1360v;
            i4 = kds.L(i2, iArr2[iArr2.length - 1] + h, mHC.e(((kds) this).f5374R));
        }
        ((kds) this).f5374R.setMeasuredDimension(i3, i4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.kds
    public final int N(btj btj) {
        return np(btj);
    }

    @Override // defpackage.kds
    public final boolean O(l88 l88) {
        return l88 instanceof mgF;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.kds
    public final int P(btj btj) {
        return PN(btj);
    }

    public final void R2(int i) {
        if (i != this.x) {
            this.H = true;
            if (i >= 1) {
                this.x = i;
                this.f1358R.e();
                cE();
                return;
            }
            throw new IllegalArgumentException(opT.Z("Span count should be at least 1. Provided ", i));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View S9(fgh fgh, btj btj, boolean z, boolean z2) {
        int i;
        int o = o();
        int i2 = -1;
        if (z2) {
            i = o() - 1;
            o = -1;
        } else {
            i = 0;
            i2 = 1;
        }
        int v = btj.v();
        MG();
        int Z = ((LinearLayoutManager) this).R.Z();
        int O = ((LinearLayoutManager) this).R.O();
        View view = null;
        View view2 = null;
        while (i != o) {
            View V = V(i);
            int n = kds.n(V);
            if (n >= 0 && n < v && q_(n, fgh, btj) == 0) {
                if (((l88) V.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = V;
                    }
                } else if (((LinearLayoutManager) this).R.e(V) < O && ((LinearLayoutManager) this).R.v(V) >= Z) {
                    return V;
                } else {
                    if (view == null) {
                        view = V;
                    }
                }
            }
            i += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.kds
    public final int U(btj btj) {
        return PN(btj);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.kds
    public final int ZW(int i, fgh fgh, btj btj) {
        CD();
        View[] viewArr = this.f1359R;
        if (viewArr == null || viewArr.length != this.x) {
            this.f1359R = new View[this.x];
        }
        return super.ZW(i, fgh, btj);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void _i(boolean z) {
        if (!z) {
            super._i(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void _m(fgh fgh, btj btj, gbl gbl, int i) {
        CD();
        if (btj.v() > 0 && !btj.f1843v) {
            boolean z = i == 1;
            int q_ = q_(gbl.R, fgh, btj);
            if (z) {
                while (q_ > 0) {
                    int i2 = gbl.R;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    gbl.R = i3;
                    q_ = q_(i3, fgh, btj);
                }
            } else {
                int v = btj.v() - 1;
                int i4 = gbl.R;
                while (i4 < v) {
                    int i5 = i4 + 1;
                    int q_2 = q_(i5, fgh, btj);
                    if (q_2 <= q_) {
                        break;
                    }
                    i4 = i5;
                    q_ = q_2;
                }
                gbl.R = i4;
            }
        }
        View[] viewArr = this.f1359R;
        if (viewArr == null || viewArr.length != this.x) {
            this.f1359R = new View[this.x];
        }
    }

    @Override // defpackage.kds
    public final void a(int i, int i2) {
        this.f1358R.e();
        ((SparseIntArray) this.f1358R.v).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.kds
    public final void b(fgh fgh, btj btj) {
        if (btj.f1843v) {
            int o = o();
            for (int i = 0; i < o; i++) {
                mgF mgf = (mgF) V(i).getLayoutParams();
                int R = mgf.R();
                this.f1357R.put(R, mgf.v);
                this.v.put(R, mgf.R);
            }
        }
        super.b(fgh, btj);
        this.f1357R.clear();
        this.v.clear();
    }

    @Override // defpackage.kds
    public final void f() {
        this.f1358R.e();
        ((SparseIntArray) this.f1358R.v).clear();
    }

    @Override // defpackage.kds
    public final l88 i(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new mgF((ViewGroup.MarginLayoutParams) layoutParams) : new mgF(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.kds
    public final int iE(int i, fgh fgh, btj btj) {
        CD();
        View[] viewArr = this.f1359R;
        if (viewArr == null || viewArr.length != this.x) {
            this.f1359R = new View[this.x];
        }
        return super.iE(i, fgh, btj);
    }

    @Override // defpackage.kds
    public final void l(fgh fgh, btj btj, View view, jG jGVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof mgF)) {
            M(view, jGVar);
            return;
        }
        mgF mgf = (mgF) layoutParams;
        int uv = uv(mgf.R(), fgh, btj);
        if (((LinearLayoutManager) this).O == 0) {
            jGVar.f4895R.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(mgf.R, mgf.v, uv, 1, false, false));
            return;
        }
        jGVar.f4895R.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(uv, 1, mgf.R, mgf.v, false, false));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.kds
    public final boolean mh() {
        return ((LinearLayoutManager) this).f1366R == null && !this.H;
    }

    public final int q_(int i, fgh fgh, btj btj) {
        if (!btj.f1843v) {
            return this.f1358R.v(i, this.x);
        }
        int i2 = this.v.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int v = fgh.v(i);
        if (v != -1) {
            return this.f1358R.v(v, this.x);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final void sS(View view, int i, boolean z) {
        int i2;
        int i3;
        mgF mgf = (mgF) view.getLayoutParams();
        Rect rect = ((l88) mgf).R;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) mgf).topMargin + ((ViewGroup.MarginLayoutParams) mgf).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) mgf).leftMargin + ((ViewGroup.MarginLayoutParams) mgf).rightMargin;
        int HK = HK(mgf.R, mgf.v);
        if (((LinearLayoutManager) this).O == 1) {
            i2 = kds.K(false, HK, i, i5, ((ViewGroup.MarginLayoutParams) mgf).width);
            i3 = kds.K(true, ((LinearLayoutManager) this).R.m(), ((kds) this).c, i4, ((ViewGroup.MarginLayoutParams) mgf).height);
        } else {
            i3 = kds.K(false, HK, i, i4, ((ViewGroup.MarginLayoutParams) mgf).height);
            i2 = kds.K(true, ((LinearLayoutManager) this).R.m(), ((kds) this).v, i5, ((ViewGroup.MarginLayoutParams) mgf).width);
        }
        l88 l88 = (l88) view.getLayoutParams();
        if (z ? WD(view, i2, i3, l88) : yG(view, i2, i3, l88)) {
            view.measure(i2, i3);
        }
    }

    @Override // defpackage.kds
    public final l88 t(Context context, AttributeSet attributeSet) {
        return new mgF(context, attributeSet);
    }

    public final int tP(int i, fgh fgh, btj btj) {
        if (!btj.f1843v) {
            this.f1358R.getClass();
            return 1;
        }
        int i2 = this.f1357R.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (fgh.v(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        this.f1358R.getClass();
        return 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: androidx.recyclerview.widget.GridLayoutManager */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: android.graphics.Rect */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void tR(defpackage.fgh r19, defpackage.btj r20, defpackage.eIq r21, defpackage.gN7 r22) {
        /*
        // Method dump skipped, instructions count: 620
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.tR(fgh, btj, eIq, gN7):void");
    }

    public final int uv(int i, fgh fgh, btj btj) {
        if (!btj.f1843v) {
            return this.f1358R.R(i, this.x);
        }
        int v = fgh.v(i);
        if (v != -1) {
            return this.f1358R.R(v, this.x);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void ve(btj btj, eIq eiq, ma7 ma7) {
        int i = this.x;
        for (int i2 = 0; i2 < this.x; i2++) {
            int i3 = eiq.c;
            if ((i3 >= 0 && i3 < btj.v()) && i > 0) {
                ma7.p(eiq.c, Math.max(0, eiq.O));
                this.f1358R.getClass();
                i--;
                eiq.c += eiq.e;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.kds
    public final void w(btj btj) {
        super.w(btj);
        this.H = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.kds
    public final l88 y() {
        return ((LinearLayoutManager) this).O == 0 ? new mgF(-2, -1) : new mgF(-1, -2);
    }

    public GridLayoutManager(int i) {
        super(1);
        R2(i);
    }
}
