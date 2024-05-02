package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: kds  reason: default package */
/* loaded from: classes.dex */
public abstract class kds {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public Mk f5373R;

    /* renamed from: R  reason: collision with other field name */
    public RecyclerView f5374R;

    /* renamed from: R  reason: collision with other field name */
    public f67 f5375R;

    /* renamed from: R  reason: collision with other field name */
    public nvs f5376R;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f5378X;
    public int c;
    public int e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public f67 f5381v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5377R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f5382v = false;

    /* renamed from: c  reason: collision with other field name */
    public boolean f5379c = true;

    /* renamed from: e  reason: collision with other field name */
    public boolean f5380e = true;

    public kds() {
        qy qyVar = new qy(0, this);
        qy qyVar2 = new qy(1, this);
        this.f5375R = new f67(qyVar);
        this.f5381v = new f67(qyVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r6 == 1073741824) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int K(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x001a
            if (r8 < 0) goto L_0x0011
            goto L_0x001c
        L_0x0011:
            if (r8 != r1) goto L_0x002f
            if (r6 == r2) goto L_0x0020
            if (r6 == 0) goto L_0x002f
            if (r6 == r3) goto L_0x0020
            goto L_0x002f
        L_0x001a:
            if (r8 < 0) goto L_0x001e
        L_0x001c:
            r6 = r3
            goto L_0x0031
        L_0x001e:
            if (r8 != r1) goto L_0x0022
        L_0x0020:
            r8 = r5
            goto L_0x0031
        L_0x0022:
            if (r8 != r0) goto L_0x002f
            if (r6 == r2) goto L_0x002c
            if (r6 != r3) goto L_0x0029
            goto L_0x002c
        L_0x0029:
            r8 = r5
            r6 = r7
            goto L_0x0031
        L_0x002c:
            r8 = r5
            r6 = r2
            goto L_0x0031
        L_0x002f:
            r6 = r7
            r8 = r6
        L_0x0031:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kds.K(boolean, int, int, int, int):int");
    }

    public static int L(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    public static hbg Q(Context context, AttributeSet attributeSet, int i, int i2) {
        hbg hbg = new hbg();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dtx.f2907R, i, i2);
        hbg.R = obtainStyledAttributes.getInt(0, 1);
        hbg.v = obtainStyledAttributes.getInt(10, 1);
        hbg.f4318R = obtainStyledAttributes.getBoolean(9, false);
        hbg.f4319v = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return hbg;
    }

    public static boolean W(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void Y(View view, Rect rect) {
        int[] iArr = RecyclerView.X;
        l88 l88 = (l88) view.getLayoutParams();
        Rect rect2 = l88.R;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) l88).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) l88).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) l88).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) l88).bottomMargin);
    }

    public static int n(View view) {
        return ((l88) view.getLayoutParams()).R();
    }

    public static void s(View view, int i, int i2, int i3, int i4) {
        l88 l88 = (l88) view.getLayoutParams();
        Rect rect = l88.R;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) l88).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) l88).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) l88).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) l88).bottomMargin);
    }

    public int A(fgh fgh, btj btj) {
        return -1;
    }

    public void B(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f5374R;
        fgh fgh = recyclerView.f1391R;
        btj btj = recyclerView.f1385R;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f5374R.canScrollVertically(-1) && !this.f5374R.canScrollHorizontally(-1) && !this.f5374R.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            gEY gey = this.f5374R.f1392R;
            if (gey != null) {
                accessibilityEvent.setItemCount(gey.R());
            }
        }
    }

    public final void BF(int i, int i2) {
        this.e = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.v = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.X;
        }
        this.X = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.c = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.X;
        }
    }

    public abstract int C(btj btj);

    public void D(int i, int i2) {
    }

    public void E(int i, int i2) {
    }

    public void F(int i, int i2) {
    }

    public abstract View G(View view, int i, fgh fgh, btj btj);

    public abstract int H(btj btj);

    public final int I() {
        RecyclerView recyclerView = this.f5374R;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int J(fgh fgh, btj btj) {
        return -1;
    }

    public final void JD(nvs nvs) {
        nvs nvs2 = this.f5376R;
        if (!(nvs2 == null || nvs == nvs2 || !nvs2.f6639v)) {
            nvs2.L();
        }
        this.f5376R = nvs;
        RecyclerView recyclerView = this.f5374R;
        pqm pqm = recyclerView.f1404R;
        pqm.f7292R.removeCallbacks(pqm);
        pqm.f7291R.abortAnimation();
        if (nvs.f6638c) {
            StringBuilder U = opT.U("An instance of ");
            U.append(nvs.getClass().getSimpleName());
            U.append(" was started more than once. Each instance of");
            U.append(nvs.getClass().getSimpleName());
            U.append(" is intended to only be used once. You should create a new instance for each use.");
            Log.w("RecyclerView", U.toString());
        }
        nvs.f6634R = recyclerView;
        nvs.f6635R = this;
        int i = nvs.f6628R;
        if (i != -1) {
            recyclerView.f1385R.R = i;
            nvs.f6639v = true;
            nvs.f6637R = true;
            nvs.f6631R = recyclerView.f1400R.g(i);
            nvs.f6634R.f1404R.R();
            nvs.f6638c = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public void Kl(Rect rect, int i, int i2) {
        int u = u() + I() + rect.width();
        int h = h() + z() + rect.height();
        RecyclerView recyclerView = this.f5374R;
        WeakHashMap weakHashMap = of5.f6887R;
        this.f5374R.setMeasuredDimension(L(i, u, mHC.X(recyclerView)), L(i2, h, mHC.e(this.f5374R)));
    }

    public final void M(View view, jG jGVar) {
        h9X W = RecyclerView.W(view);
        if (W != null && !W.m() && !this.f5373R.x(W.f4097R)) {
            RecyclerView recyclerView = this.f5374R;
            l(recyclerView.f1391R, recyclerView.f1385R, view, jGVar);
        }
    }

    public abstract int N(btj btj);

    public boolean O(l88 l88) {
        return l88 != null;
    }

    public abstract int P(btj btj);

    public final void S(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((l88) view.getLayoutParams()).R;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.f5374R == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.f5374R.f1381R;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void T(int i) {
        RecyclerView recyclerView = this.f5374R;
        if (recyclerView != null) {
            int X = recyclerView.f1378R.X();
            for (int i2 = 0; i2 < X; i2++) {
                recyclerView.f1378R.e(i2).offsetLeftAndRight(i);
            }
        }
    }

    public abstract int U(btj btj);

    public final View V(int i) {
        Mk mk = this.f5373R;
        if (mk != null) {
            return mk.e(i);
        }
        return null;
    }

    public final boolean WD(View view, int i, int i2, l88 l88) {
        return !this.f5379c || !W(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) l88).width) || !W(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) l88).height);
    }

    public abstract boolean X();

    public final void X4(fgh fgh) {
        int o = o();
        while (true) {
            o--;
            if (o < 0) {
                return;
            }
            if (!RecyclerView.W(V(o)).P()) {
                View V = V(o);
                vr(o);
                fgh.O(V);
            }
        }
    }

    public abstract void Z(int i, int i2, btj btj, ma7 ma7);

    public abstract int ZW(int i, fgh fgh, btj btj);

    public abstract Parcelable _();

    public void a(int i, int i2) {
    }

    public abstract void b(fgh fgh, btj btj);

    public abstract void c(String str);

    public final void cE() {
        RecyclerView recyclerView = this.f5374R;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ad, code lost:
        if (r8 == false) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cr(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.I()
            int r1 = r8.z()
            int r2 = r8.e
            int r3 = r8.u()
            int r2 = r2 - r3
            int r3 = r8.X
            int r4 = r8.h()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f5374R
            java.util.WeakHashMap r7 = defpackage.of5.f6887R
            int r3 = defpackage.eHQ.e(r3)
            r7 = 1
            if (r3 != r7) goto L_0x0060
            if (r2 == 0) goto L_0x005b
            goto L_0x0068
        L_0x005b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L_0x0068
        L_0x0060:
            if (r6 == 0) goto L_0x0063
            goto L_0x0067
        L_0x0063:
            int r6 = java.lang.Math.min(r4, r2)
        L_0x0067:
            r2 = r6
        L_0x0068:
            if (r1 == 0) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            int r1 = java.lang.Math.min(r5, r11)
        L_0x006f:
            if (r13 == 0) goto L_0x00af
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L_0x0078
            goto L_0x00ac
        L_0x0078:
            int r11 = r8.I()
            int r13 = r8.z()
            int r3 = r8.e
            int r4 = r8.u()
            int r3 = r3 - r4
            int r4 = r8.X
            int r5 = r8.h()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r8 = r8.f5374R
            android.graphics.Rect r8 = r8.f1380R
            Y(r10, r8)
            int r10 = r8.left
            int r10 = r10 - r2
            if (r10 >= r3) goto L_0x00ac
            int r10 = r8.right
            int r10 = r10 - r2
            if (r10 <= r11) goto L_0x00ac
            int r10 = r8.top
            int r10 = r10 - r1
            if (r10 >= r4) goto L_0x00ac
            int r8 = r8.bottom
            int r8 = r8 - r1
            if (r8 > r13) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r8 = r7
            goto L_0x00ad
        L_0x00ac:
            r8 = r0
        L_0x00ad:
            if (r8 == 0) goto L_0x00b4
        L_0x00af:
            if (r2 != 0) goto L_0x00b5
            if (r1 == 0) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            return r0
        L_0x00b5:
            if (r12 == 0) goto L_0x00bb
            r9.scrollBy(r2, r1)
            goto L_0x00be
        L_0x00bb:
            r9.mL(r2, r1, r0)
        L_0x00be:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kds.cr(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract boolean d();

    public abstract boolean e();

    public void f() {
    }

    public View g(int i) {
        int o = o();
        for (int i2 = 0; i2 < o; i2++) {
            View V = V(i2);
            h9X W = RecyclerView.W(V);
            if (W != null && W.c() == i && !W.P() && (this.f5374R.f1385R.f1843v || !W.m())) {
                return V;
            }
        }
        return null;
    }

    public final int h() {
        RecyclerView recyclerView = this.f5374R;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public l88 i(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l88 ? new l88((l88) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new l88((ViewGroup.MarginLayoutParams) layoutParams) : new l88(layoutParams);
    }

    public abstract int iE(int i, fgh fgh, btj btj);

    public final void j(fgh fgh) {
        int o = o();
        while (true) {
            o--;
            if (o >= 0) {
                View V = V(o);
                h9X W = RecyclerView.W(V);
                if (!W.P()) {
                    if (!W.L() || W.m() || this.f5374R.f1392R.f3695R) {
                        V(o);
                        this.f5373R.c(o);
                        fgh.Z(V);
                        this.f5374R.f1389R.N(W);
                    } else {
                        vr(o);
                        fgh.L(W);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void k() {
    }

    public void l(fgh fgh, btj btj, View view, jG jGVar) {
    }

    public void m(int i, ma7 ma7) {
    }

    public void mL(int i) {
    }

    public final void mZ(int i, int i2) {
        int o = o();
        if (o == 0) {
            this.f5374R.N(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < o; i7++) {
            View V = V(i7);
            Rect rect = this.f5374R.f1380R;
            Y(V, rect);
            int i8 = rect.left;
            if (i8 < i4) {
                i4 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i5) {
                i5 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i6) {
                i6 = i11;
            }
        }
        this.f5374R.f1380R.set(i4, i5, i3, i6);
        Kl(this.f5374R.f1380R, i, i2);
    }

    public abstract boolean mh();

    public final int o() {
        Mk mk = this.f5373R;
        if (mk != null) {
            return mk.X();
        }
        return 0;
    }

    public abstract void p(RecyclerView recyclerView);

    public final void pG(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f5374R = null;
            this.f5373R = null;
            this.e = 0;
            this.X = 0;
        } else {
            this.f5374R = recyclerView;
            this.f5373R = recyclerView.f1378R;
            this.e = recyclerView.getWidth();
            this.X = recyclerView.getHeight();
        }
        this.v = 1073741824;
        this.c = 1073741824;
    }

    public abstract void q(Parcelable parcelable);

    public void r(int i) {
        RecyclerView recyclerView = this.f5374R;
        if (recyclerView != null) {
            int X = recyclerView.f1378R.X();
            for (int i2 = 0; i2 < X; i2++) {
                recyclerView.f1378R.e(i2).offsetTopAndBottom(i);
            }
        }
    }

    public l88 t(Context context, AttributeSet attributeSet) {
        return new l88(context, attributeSet);
    }

    public final int u() {
        RecyclerView recyclerView = this.f5374R;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final void v(View view, int i, boolean z) {
        h9X W = RecyclerView.W(view);
        if (z || W.m()) {
            this.f5374R.f1389R.c(W);
        } else {
            this.f5374R.f1389R.N(W);
        }
        l88 l88 = (l88) view.getLayoutParams();
        if (W.j() || W.x()) {
            if (W.x()) {
                W.f4099R.x(W);
            } else {
                W.X &= -33;
            }
            this.f5373R.v(view, i, view.getLayoutParams(), false);
        } else {
            int i2 = -1;
            if (view.getParent() == this.f5374R) {
                Mk mk = this.f5373R;
                int indexOfChild = mk.R.R.indexOfChild(view);
                int v = (indexOfChild != -1 && !mk.f296R.e(indexOfChild)) ? indexOfChild - mk.f296R.v(indexOfChild) : -1;
                if (i == -1) {
                    i = this.f5373R.X();
                }
                if (v == -1) {
                    StringBuilder U = opT.U("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    U.append(this.f5374R.indexOfChild(view));
                    throw new IllegalStateException(jQ.H(this.f5374R, U));
                } else if (v != i) {
                    kds kds = this.f5374R.f1400R;
                    View V = kds.V(v);
                    if (V != null) {
                        kds.V(v);
                        kds.f5373R.c(v);
                        l88 l882 = (l88) V.getLayoutParams();
                        h9X W2 = RecyclerView.W(V);
                        if (W2.m()) {
                            kds.f5374R.f1389R.c(W2);
                        } else {
                            kds.f5374R.f1389R.N(W2);
                        }
                        kds.f5373R.v(V, i, l882, W2.m());
                    } else {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + v + kds.f5374R.toString());
                    }
                }
            } else {
                this.f5373R.R(view, i, false);
                l88.f5602R = true;
                nvs nvs = this.f5376R;
                if (nvs != null && nvs.f6639v) {
                    nvs.f6634R.getClass();
                    h9X W3 = RecyclerView.W(view);
                    if (W3 != null) {
                        i2 = W3.c();
                    }
                    if (i2 == nvs.f6628R) {
                        nvs.f6631R = view;
                    }
                }
            }
        }
        if (l88.v) {
            W.f4097R.invalidate();
            l88.v = false;
        }
    }

    public final void vl(View view, fgh fgh) {
        Mk mk = this.f5373R;
        int indexOfChild = mk.R.R.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (mk.f296R.O(indexOfChild)) {
                mk.H(view);
            }
            mk.R.m(indexOfChild);
        }
        fgh.O(view);
    }

    public final void vr(int i) {
        Mk mk;
        int O;
        View childAt;
        if (V(i) != null && (childAt = mk.R.R.getChildAt((O = (mk = this.f5373R).O(i)))) != null) {
            if (mk.f296R.O(O)) {
                mk.H(childAt);
            }
            mk.R.m(O);
        }
    }

    public final void vz(RecyclerView recyclerView) {
        BF(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract void w(btj btj);

    public boolean wm() {
        return false;
    }

    public abstract int x(btj btj);

    public abstract void xN(int i);

    public abstract l88 y();

    public final boolean yG(View view, int i, int i2, l88 l88) {
        return view.isLayoutRequested() || !this.f5379c || !W(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) l88).width) || !W(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) l88).height);
    }

    public abstract void yf(RecyclerView recyclerView, int i);

    public final int z() {
        RecyclerView recyclerView = this.f5374R;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final void zw(fgh fgh) {
        int size = fgh.f3499R.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((h9X) fgh.f3499R.get(i)).f4097R;
            h9X W = RecyclerView.W(view);
            if (!W.P()) {
                W.N(false);
                if (W.H()) {
                    this.f5374R.removeDetachedView(view, false);
                }
                gxa gxa = this.f5374R.f1393R;
                if (gxa != null) {
                    gxa.X(W);
                }
                W.N(true);
                h9X W2 = RecyclerView.W(view);
                W2.f4099R = null;
                W2.f4105R = false;
                W2.X &= -33;
                fgh.L(W2);
            }
        }
        fgh.f3499R.clear();
        ArrayList arrayList = fgh.f3502v;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f5374R.invalidate();
        }
    }
}
