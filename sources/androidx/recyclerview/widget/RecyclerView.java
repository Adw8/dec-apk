package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import dev.kdrag0n.virtcontainer.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, n9d {

    /* renamed from: R  reason: collision with other field name */
    public static final Class[] f1370R;
    public int C;

    /* renamed from: C  reason: collision with other field name */
    public boolean f1371C;
    public int H;

    /* renamed from: H  reason: collision with other field name */
    public boolean f1372H;
    public int L;

    /* renamed from: L  reason: collision with other field name */
    public boolean f1373L;
    public int N;

    /* renamed from: N  reason: collision with other field name */
    public boolean f1374N;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f1375O;
    public final int P;

    /* renamed from: P  reason: collision with other field name */
    public boolean f1376P;

    /* renamed from: R  reason: collision with other field name */
    public float f1377R;

    /* renamed from: R  reason: collision with other field name */
    public Mk f1378R;

    /* renamed from: R  reason: collision with other field name */
    public aiI f1379R;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f1380R;

    /* renamed from: R  reason: collision with other field name */
    public final RectF f1381R;

    /* renamed from: R  reason: collision with other field name */
    public VelocityTracker f1382R;

    /* renamed from: R  reason: collision with other field name */
    public final AccessibilityManager f1383R;

    /* renamed from: R  reason: collision with other field name */
    public EdgeEffect f1384R;

    /* renamed from: R  reason: collision with other field name */
    public final btj f1385R;

    /* renamed from: R  reason: collision with other field name */
    public final cWJ f1386R;

    /* renamed from: R  reason: collision with other field name */
    public cp2 f1387R;

    /* renamed from: R  reason: collision with other field name */
    public eEi f1388R;

    /* renamed from: R  reason: collision with other field name */
    public final f67 f1389R;

    /* renamed from: R  reason: collision with other field name */
    public fP0 f1390R;

    /* renamed from: R  reason: collision with other field name */
    public final fgh f1391R;

    /* renamed from: R  reason: collision with other field name */
    public gEY f1392R;

    /* renamed from: R  reason: collision with other field name */
    public gxa f1393R;

    /* renamed from: R  reason: collision with other field name */
    public h6v f1394R;

    /* renamed from: R  reason: collision with other field name */
    public h9q f1395R;

    /* renamed from: R  reason: collision with other field name */
    public hHo f1396R;

    /* renamed from: R  reason: collision with other field name */
    public iJ4 f1397R;

    /* renamed from: R  reason: collision with other field name */
    public jP f1398R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f1399R;

    /* renamed from: R  reason: collision with other field name */
    public kds f1400R;

    /* renamed from: R  reason: collision with other field name */
    public kuM f1401R;

    /* renamed from: R  reason: collision with other field name */
    public final lkl f1402R;

    /* renamed from: R  reason: collision with other field name */
    public ma7 f1403R;

    /* renamed from: R  reason: collision with other field name */
    public final pqm f1404R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1405R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f1406R;
    public int U;

    /* renamed from: U  reason: collision with other field name */
    public boolean f1407U;

    /* renamed from: X  reason: collision with other field name */
    public int f1408X;

    /* renamed from: X  reason: collision with other field name */
    public final ArrayList f1409X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f1410X;
    public int Z;

    /* renamed from: Z  reason: collision with other field name */
    public boolean f1411Z;
    public EdgeEffect c;

    /* renamed from: c  reason: collision with other field name */
    public final ArrayList f1412c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1413c;

    /* renamed from: c  reason: collision with other field name */
    public final int[] f1414c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public EdgeEffect f1415e;

    /* renamed from: e  reason: collision with other field name */
    public ArrayList f1416e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f1417e;

    /* renamed from: e  reason: collision with other field name */
    public final int[] f1418e;
    public int g;
    public final int j;
    public int m;

    /* renamed from: m  reason: collision with other field name */
    public boolean f1419m;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public final Rect f1420v;

    /* renamed from: v  reason: collision with other field name */
    public EdgeEffect f1421v;

    /* renamed from: v  reason: collision with other field name */
    public final h9q f1422v;

    /* renamed from: v  reason: collision with other field name */
    public final ArrayList f1423v;

    /* renamed from: v  reason: collision with other field name */
    public lkl f1424v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1425v;

    /* renamed from: v  reason: collision with other field name */
    public final int[] f1426v;
    public int x;

    /* renamed from: x  reason: collision with other field name */
    public boolean f1427x;
    public int y;
    public static final int[] X = {16843830};
    public static final mWA R = new mWA(1);

    static {
        Class cls = Integer.TYPE;
        f1370R = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static h9X W(View view) {
        if (view == null) {
            return null;
        }
        return ((l88) view.getLayoutParams()).f5601R;
    }

    private hHo getScrollingChildHelper() {
        if (this.f1396R == null) {
            this.f1396R = new hHo(this);
        }
        return this.f1396R;
    }

    public static RecyclerView n(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView n = n(viewGroup.getChildAt(i));
            if (n != null) {
                return n;
            }
        }
        return null;
    }

    public static void x(h9X h9x) {
        WeakReference weakReference = h9x.f4102R;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != h9x.f4097R) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            h9x.f4102R = null;
        }
    }

    public final int A(h9X h9x) {
        if (!((h9x.X & 524) != 0) && h9x.O()) {
            jP jPVar = this.f1398R;
            int i = h9x.R;
            int size = jPVar.f4920R.size();
            for (int i2 = 0; i2 < size; i2++) {
                uz uzVar = (uz) jPVar.f4920R.get(i2);
                int i3 = uzVar.R;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = uzVar.v;
                        if (i4 <= i) {
                            int i5 = uzVar.c;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = uzVar.v;
                        if (i6 == i) {
                            i = uzVar.c;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (uzVar.c <= i) {
                                i++;
                            }
                        }
                    }
                } else if (uzVar.v <= i) {
                    i += uzVar.c;
                }
            }
            return i;
        }
        return -1;
    }

    public final void B(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = this.O - 1;
        this.O = i2;
        if (i2 < 1) {
            this.O = 0;
            if (z) {
                int i3 = this.f1408X;
                this.f1408X = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f1383R;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z2 = false;
                    }
                    if (z2) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        Nr.v(obtain, i3);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.f1409X.size() - 1; size >= 0; size--) {
                    h9X h9x = (h9X) this.f1409X.get(size);
                    if (h9x.f4097R.getParent() == this && !h9x.P() && (i = h9x.Z) != -1) {
                        View view = h9x.f4097R;
                        WeakHashMap weakHashMap = of5.f6887R;
                        mHC.t(view, i);
                        h9x.Z = -1;
                    }
                }
                this.f1409X.clear();
            }
        }
    }

    public final void C() {
        if (!this.f1417e || this.f1419m) {
            eug.R("RV FullInvalidate");
            P();
            eug.v();
        } else if (this.f1398R.L()) {
            jP jPVar = this.f1398R;
            int i = jPVar.R;
            boolean z = false;
            if ((i & 4) != 0) {
                if (!((i & 11) != 0)) {
                    eug.R("RV PartialInvalidate");
                    X4();
                    G();
                    this.f1398R.x();
                    if (!this.f1410X) {
                        int X2 = this.f1378R.X();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= X2) {
                                break;
                            }
                            h9X W = W(this.f1378R.e(i2));
                            if (W != null && !W.P()) {
                                if ((W.X & 2) != 0) {
                                    z = true;
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (z) {
                            P();
                        } else {
                            this.f1398R.v();
                        }
                    }
                    zw(true);
                    B(true);
                    eug.v();
                    return;
                }
            }
            if (jPVar.L()) {
                eug.R("RV FullInvalidate");
                P();
                eug.v();
            }
        }
    }

    public final void D(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f1380R.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof l88) {
            l88 l88 = (l88) layoutParams;
            if (!l88.f5602R) {
                Rect rect = l88.R;
                Rect rect2 = this.f1380R;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f1380R);
            offsetRectIntoDescendantCoords(view, this.f1380R);
        }
        kds kds = this.f1400R;
        Rect rect3 = this.f1380R;
        boolean z = true;
        boolean z2 = !this.f1417e;
        if (view2 != null) {
            z = false;
        }
        kds.cr(this, view, rect3, z2, z);
    }

    public final void E() {
        boolean z;
        boolean z2 = false;
        if (this.f1419m) {
            jP jPVar = this.f1398R;
            jPVar.U(jPVar.f4920R);
            jPVar.U(jPVar.v);
            jPVar.R = 0;
            if (this.f1427x) {
                this.f1400R.f();
            }
        }
        if (this.f1393R != null && this.f1400R.mh()) {
            this.f1398R.x();
        } else {
            this.f1398R.c();
        }
        boolean z3 = this.f1407U || this.f1371C;
        btj btj = this.f1385R;
        boolean z4 = this.f1417e && this.f1393R != null && ((z = this.f1419m) || z3 || this.f1400R.f5377R) && (!z || this.f1392R.f3695R);
        btj.f1840X = z4;
        if (z4 && z3 && !this.f1419m) {
            if (this.f1393R != null && this.f1400R.mh()) {
                z2 = true;
            }
        }
        btj.f1837O = z2;
    }

    public final void F() {
        gxa gxa = this.f1393R;
        if (gxa != null) {
            gxa.O();
        }
        kds kds = this.f1400R;
        if (kds != null) {
            kds.X4(this.f1391R);
            this.f1400R.zw(this.f1391R);
        }
        fgh fgh = this.f1391R;
        fgh.f3499R.clear();
        fgh.e();
    }

    public final void G() {
        this.O++;
    }

    public final void H() {
        int Z = this.f1378R.Z();
        for (int i = 0; i < Z; i++) {
            h9X W = W(this.f1378R.L(i));
            if (!W.P()) {
                W.f4106v = -1;
                W.e = -1;
            }
        }
        fgh fgh = this.f1391R;
        int size = fgh.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            h9X h9x = (h9X) fgh.c.get(i2);
            h9x.f4106v = -1;
            h9x.e = -1;
        }
        int size2 = fgh.f3499R.size();
        for (int i3 = 0; i3 < size2; i3++) {
            h9X h9x2 = (h9X) fgh.f3499R.get(i3);
            h9x2.f4106v = -1;
            h9x2.e = -1;
        }
        ArrayList arrayList = fgh.f3502v;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                h9X h9x3 = (h9X) fgh.f3502v.get(i4);
                h9x3.f4106v = -1;
                h9x3.e = -1;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View I(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L_0x0004:
            if (r0 == 0) goto L_0x0014
            if (r0 == r2) goto L_0x0014
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0014
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L_0x0004
        L_0x0014:
            if (r0 != r2) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.I(android.view.View):android.view.View");
    }

    public final void J() {
        if (this.f1421v == null) {
            this.f1390R.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1421v = edgeEffect;
            if (this.f1405R) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void K() {
        if (this.c == null) {
            this.f1390R.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.c = edgeEffect;
            if (this.f1405R) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void L(gU1 gu1) {
        kds kds = this.f1400R;
        if (kds != null) {
            kds.c("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f1423v.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f1423v.add(gu1);
        k();
        requestLayout();
    }

    public final void M() {
        if (!this.f1374N && this.f1425v) {
            lkl lkl = this.f1424v;
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.C(this, lkl);
            this.f1374N = true;
        }
    }

    public final void N(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = of5.f6887R;
        setMeasuredDimension(kds.L(i, paddingRight, mHC.X(this)), kds.L(i2, getPaddingBottom() + getPaddingTop(), mHC.e(this)));
    }

    public final void O(h9X h9x) {
        View view = h9x.f4097R;
        boolean z = view.getParent() == this;
        this.f1391R.x(d(view));
        if (h9x.H()) {
            this.f1378R.v(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f1378R.R(view, -1, true);
        } else {
            Mk mk = this.f1378R;
            int indexOfChild = mk.R.R.indexOfChild(view);
            if (indexOfChild >= 0) {
                mk.f296R.Z(indexOfChild);
                mk.m(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0350, code lost:
        if (r15.f1378R.x(getFocusedChild()) == false) goto L_0x0413;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P() {
        /*
        // Method dump skipped, instructions count: 1053
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.P():void");
    }

    public final h9X Q(int i) {
        h9X h9x = null;
        if (this.f1419m) {
            return null;
        }
        int Z = this.f1378R.Z();
        for (int i2 = 0; i2 < Z; i2++) {
            h9X W = W(this.f1378R.L(i2));
            if (W != null && !W.m() && A(W) == i) {
                if (!this.f1378R.x(W.f4097R)) {
                    return W;
                }
                h9x = W;
            }
        }
        return h9x;
    }

    public final long S(h9X h9x) {
        return this.f1392R.f3695R ? h9x.f4096R : (long) h9x.R;
    }

    public final boolean T() {
        return this.O > 0;
    }

    public final void U(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f1384R;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f1384R.onRelease();
            z = this.f1384R.isFinished();
        }
        EdgeEffect edgeEffect2 = this.c;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.c.onRelease();
            z |= this.c.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1421v;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1421v.onRelease();
            z |= this.f1421v.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1415e;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1415e.onRelease();
            z |= this.f1415e.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.H(this);
        }
    }

    public final void V() {
        if (this.f1415e == null) {
            this.f1390R.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1415e = edgeEffect;
            if (this.f1405R) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void X4() {
        int i = this.e + 1;
        this.e = i;
        if (i == 1 && !this.f1375O) {
            this.f1410X = false;
        }
    }

    public final String Y() {
        StringBuilder U = opT.U(" ");
        U.append(super.toString());
        U.append(", adapter:");
        U.append(this.f1392R);
        U.append(", layout:");
        U.append(this.f1400R);
        U.append(", context:");
        U.append(getContext());
        return U.toString();
    }

    public final void Z(cp2 cp2) {
        if (this.f1416e == null) {
            this.f1416e = new ArrayList();
        }
        this.f1416e.add(cp2);
    }

    public final void _(int i) {
        nvs nvs;
        if (!this.f1375O) {
            setScrollState(0);
            pqm pqm = this.f1404R;
            pqm.f7292R.removeCallbacks(pqm);
            pqm.f7291R.abortAnimation();
            kds kds = this.f1400R;
            if (!(kds == null || (nvs = kds.f5376R) == null)) {
                nvs.L();
            }
            kds kds2 = this.f1400R;
            if (kds2 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            kds2.xN(i);
            awakenScrollBars();
        }
    }

    public final void a(h9X h9x, bzl bzl) {
        boolean z = false;
        int i = (h9x.X & -8193) | 0;
        h9x.X = i;
        if (this.f1385R.f1841c) {
            if ((i & 2) != 0) {
                z = true;
            }
            if (z && !h9x.m() && !h9x.P()) {
                ((jXn) this.f1389R.v).L(S(h9x), h9x);
            }
        }
        this.f1389R.X(h9x, bzl);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        kds kds = this.f1400R;
        if (kds != null) {
            kds.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b() {
        VelocityTracker velocityTracker = this.f1382R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        vl(0);
        EdgeEffect edgeEffect = this.f1384R;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f1384R.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1421v;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f1421v.isFinished();
        }
        EdgeEffect edgeEffect3 = this.c;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.c.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1415e;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f1415e.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.H(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof l88) && this.f1400R.O((l88) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        kds kds = this.f1400R;
        if (kds != null && kds.e()) {
            return this.f1400R.x(this.f1385R);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        kds kds = this.f1400R;
        if (kds != null && kds.e()) {
            return this.f1400R.H(this.f1385R);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        kds kds = this.f1400R;
        if (kds != null && kds.e()) {
            return this.f1400R.U(this.f1385R);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        kds kds = this.f1400R;
        if (kds != null && kds.X()) {
            return this.f1400R.C(this.f1385R);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        kds kds = this.f1400R;
        if (kds != null && kds.X()) {
            return this.f1400R.N(this.f1385R);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        kds kds = this.f1400R;
        if (kds != null && kds.X()) {
            return this.f1400R.P(this.f1385R);
        }
        return 0;
    }

    public final h9X d(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return W(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().R(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().v(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().X(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.f1423v.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((gU1) this.f1423v.get(i)).v(canvas);
        }
        EdgeEffect edgeEffect = this.f1384R;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1405R ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f1384R;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1421v;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1405R) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1421v;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.c;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1405R ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.c;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1415e;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1405R) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f1415e;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f1393R == null || this.f1423v.size() <= 0 || !this.f1393R.L()) {
            z3 = z;
        }
        if (z3) {
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.H(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void f(boolean z) {
        this.f1427x = z | this.f1427x;
        this.f1419m = true;
        int Z = this.f1378R.Z();
        for (int i = 0; i < Z; i++) {
            h9X W = W(this.f1378R.L(i));
            if (W != null && !W.P()) {
                W.v(6);
            }
        }
        k();
        fgh fgh = this.f1391R;
        int size = fgh.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            h9X h9x = (h9X) fgh.c.get(i2);
            if (h9x != null) {
                h9x.v(6);
                h9x.R(null);
            }
        }
        gEY gey = fgh.f3498R.f1392R;
        if (gey == null || !gey.f3695R) {
            fgh.e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x016d, code lost:
        if (r3 > 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0187, code lost:
        if (r6 > 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x018a, code lost:
        if (r3 < 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x018d, code lost:
        if (r6 < 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0195, code lost:
        if ((r6 * r1) <= 0) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x019d, code lost:
        if ((r6 * r1) >= 0) goto L_0x01a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0073  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
        // Method dump skipped, instructions count: 426
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g() {
        X4();
        G();
        this.f1385R.R(6);
        this.f1398R.c();
        this.f1385R.X = this.f1392R.R();
        this.f1385R.c = 0;
        if (this.f1397R != null) {
            gEY gey = this.f1392R;
            int I = jQ.I(gey.e);
            if (I == 1 ? gey.R() > 0 : I != 2) {
                Parcelable parcelable = this.f1397R.v;
                if (parcelable != null) {
                    this.f1400R.q(parcelable);
                }
                this.f1397R = null;
            }
        }
        btj btj = this.f1385R;
        btj.f1843v = false;
        this.f1400R.b(this.f1391R, btj);
        btj btj2 = this.f1385R;
        btj2.f1839R = false;
        btj2.f1840X = btj2.f1840X && this.f1393R != null;
        btj2.e = 4;
        B(true);
        zw(false);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        kds kds = this.f1400R;
        if (kds != null) {
            return kds.y();
        }
        throw new IllegalStateException(jQ.H(this, opT.U("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        kds kds = this.f1400R;
        if (kds != null) {
            return kds.t(getContext(), attributeSet);
        }
        throw new IllegalStateException(jQ.H(this, opT.U("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public gEY getAdapter() {
        return this.f1392R;
    }

    @Override // android.view.View
    public int getBaseline() {
        kds kds = this.f1400R;
        if (kds == null) {
            return super.getBaseline();
        }
        kds.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1405R;
    }

    public kuM getCompatAccessibilityDelegate() {
        return this.f1401R;
    }

    public fP0 getEdgeEffectFactory() {
        return this.f1390R;
    }

    public gxa getItemAnimator() {
        return this.f1393R;
    }

    public int getItemDecorationCount() {
        return this.f1423v.size();
    }

    public kds getLayoutManager() {
        return this.f1400R;
    }

    public int getMaxFlingVelocity() {
        return this.j;
    }

    public int getMinFlingVelocity() {
        return this.P;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public eEi getOnFlingListener() {
        return this.f1388R;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1372H;
    }

    public lxt getRecycledViewPool() {
        return this.f1391R.c();
    }

    public int getScrollState() {
        return this.Z;
    }

    public final void h(btj btj) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f1404R.f7291R;
            overScroller.getFinalX();
            overScroller.getCurrX();
            btj.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        btj.getClass();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().O(0) != null;
    }

    public final void i(int i, int i2) {
        this.L++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        cp2 cp2 = this.f1387R;
        if (cp2 != null) {
            cp2.v(this, i, i2);
        }
        ArrayList arrayList = this.f1416e;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((cp2) this.f1416e.get(size)).v(this, i, i2);
            }
        }
        this.L--;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1425v;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1375O;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f4201R;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x009a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x007e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
        // Method dump skipped, instructions count: 513
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.j():void");
    }

    public final void k() {
        int Z = this.f1378R.Z();
        for (int i = 0; i < Z; i++) {
            ((l88) this.f1378R.L(i).getLayoutParams()).f5602R = true;
        }
        fgh fgh = this.f1391R;
        int size = fgh.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            l88 l88 = (l88) ((h9X) fgh.c.get(i2)).f4097R.getLayoutParams();
            if (l88 != null) {
                l88.f5602R = true;
            }
        }
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.m) {
            int i = actionIndex == 0 ? 1 : 0;
            this.m = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.U = x;
            this.x = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.C = y;
            this.H = y;
        }
    }

    public final void m(String str) {
        if (T()) {
            if (str == null) {
                throw new IllegalStateException(jQ.H(this, opT.U("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.L > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(jQ.H(this, opT.U(""))));
        }
    }

    public final void mL(int i, int i2, boolean z) {
        kds kds = this.f1400R;
        if (kds == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1375O) {
            int i3 = 0;
            if (!kds.e()) {
                i = 0;
            }
            if (!this.f1400R.X()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (z) {
                    if (i != 0) {
                        i3 = 1;
                    }
                    if (i2 != 0) {
                        i3 |= 2;
                    }
                    getScrollingChildHelper().L(i3, 1);
                }
                this.f1404R.v(i, i2, Integer.MIN_VALUE, null);
            }
        }
    }

    public final void o() {
        if (this.f1384R == null) {
            this.f1390R.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1384R = edgeEffect;
            if (this.f1405R) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = 0;
        this.f1425v = true;
        this.f1417e = this.f1417e && !isLayoutRequested();
        kds kds = this.f1400R;
        if (kds != null) {
            kds.f5382v = true;
        }
        this.f1374N = false;
        ThreadLocal threadLocal = h6v.f4074R;
        h6v h6v = (h6v) threadLocal.get();
        this.f1394R = h6v;
        if (h6v == null) {
            this.f1394R = new h6v();
            WeakHashMap weakHashMap = of5.f6887R;
            Display v = eHQ.v(this);
            float f = 60.0f;
            if (!isInEditMode() && v != null) {
                float refreshRate = v.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            h6v h6v2 = this.f1394R;
            h6v2.v = (long) (1.0E9f / f);
            threadLocal.set(h6v2);
        }
        this.f1394R.f4076R.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        nvs nvs;
        super.onDetachedFromWindow();
        gxa gxa = this.f1393R;
        if (gxa != null) {
            gxa.O();
        }
        setScrollState(0);
        pqm pqm = this.f1404R;
        pqm.f7292R.removeCallbacks(pqm);
        pqm.f7291R.abortAnimation();
        kds kds = this.f1400R;
        if (!(kds == null || (nvs = kds.f5376R) == null)) {
            nvs.L();
        }
        this.f1425v = false;
        kds kds2 = this.f1400R;
        if (kds2 != null) {
            kds2.f5382v = false;
            kds2.p(this);
        }
        this.f1409X.clear();
        removeCallbacks(this.f1424v);
        this.f1389R.getClass();
        do {
        } while (bVN.R.R() != null);
        h6v h6v = this.f1394R;
        if (h6v != null) {
            h6v.f4076R.remove(this);
            this.f1394R = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f1423v.size();
        for (int i = 0; i < size; i++) {
            ((gU1) this.f1423v.get(i)).R(canvas, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x00c3 */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        if (this.f1375O) {
            return false;
        }
        this.f1379R = null;
        if (u(motionEvent)) {
            b();
            setScrollState(0);
            return true;
        }
        kds kds = this.f1400R;
        if (kds == null) {
            return false;
        }
        boolean e = kds.e();
        boolean X2 = this.f1400R.X();
        if (this.f1382R == null) {
            this.f1382R = VelocityTracker.obtain();
        }
        this.f1382R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1373L) {
                this.f1373L = false;
            }
            this.m = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.U = x;
            this.x = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.C = y;
            this.H = y;
            if (this.Z == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                vl(1);
            }
            int[] iArr = this.f1414c;
            iArr[1] = 0;
            iArr[0] = 0;
            if (X2) {
                boolean z = e ? 1 : 0;
                char c = e ? 1 : 0;
                e = z | true;
            }
            hHo scrollingChildHelper = getScrollingChildHelper();
            int i = e ? 1 : 0;
            int i2 = e ? 1 : 0;
            int i3 = e ? 1 : 0;
            scrollingChildHelper.L(i, 0);
        } else if (actionMasked == 1) {
            this.f1382R.clear();
            vl(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.m);
            if (findPointerIndex < 0) {
                StringBuilder U = opT.U("Error processing scroll; pointer index for id ");
                U.append(this.m);
                U.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", U.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.Z != 1) {
                int i4 = x2 - this.x;
                int i5 = y2 - this.H;
                if (!e || Math.abs(i4) <= this.N) {
                    objArr = null;
                } else {
                    this.U = x2;
                    objArr = 1;
                }
                if (X2 && Math.abs(i5) > this.N) {
                    this.C = y2;
                    objArr = 1;
                }
                if (objArr != null) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            b();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.m = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.U = x3;
            this.x = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.C = y3;
            this.H = y3;
        } else if (actionMasked == 6) {
            l(motionEvent);
        }
        return this.Z == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        eug.R("RV OnLayout");
        P();
        eug.v();
        this.f1417e = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        kds kds = this.f1400R;
        if (kds == null) {
            N(i, i2);
            return;
        }
        boolean z = false;
        if (kds.d()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f1400R.f5374R.N(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f1376P = z;
            if (!z && this.f1392R != null) {
                if (this.f1385R.e == 1) {
                    j();
                }
                this.f1400R.BF(i, i2);
                this.f1385R.f1842e = true;
                g();
                this.f1400R.mZ(i, i2);
                if (this.f1400R.wm()) {
                    this.f1400R.BF(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f1385R.f1842e = true;
                    g();
                    this.f1400R.mZ(i, i2);
                }
                this.g = getMeasuredWidth();
                this.y = getMeasuredHeight();
            }
        } else if (this.f1413c) {
            this.f1400R.f5374R.N(i, i2);
        } else {
            if (this.f1411Z) {
                X4();
                G();
                E();
                B(true);
                btj btj = this.f1385R;
                if (btj.f1837O) {
                    btj.f1843v = true;
                } else {
                    this.f1398R.c();
                    this.f1385R.f1843v = false;
                }
                this.f1411Z = false;
                zw(false);
            } else if (this.f1385R.f1837O) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            gEY gey = this.f1392R;
            if (gey != null) {
                this.f1385R.X = gey.R();
            } else {
                this.f1385R.X = 0;
            }
            X4();
            this.f1400R.f5374R.N(i, i2);
            zw(false);
            this.f1385R.f1843v = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (T()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof iJ4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        iJ4 ij4 = (iJ4) parcelable;
        this.f1397R = ij4;
        super.onRestoreInstanceState(ij4.f327R);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        iJ4 ij4 = new iJ4(super.onSaveInstanceState());
        iJ4 ij42 = this.f1397R;
        if (ij42 != null) {
            ij4.v = ij42.v;
        } else {
            kds kds = this.f1400R;
            if (kds != null) {
                ij4.v = kds._();
            } else {
                ij4.v = null;
            }
        }
        return ij4;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.f1415e = null;
            this.f1421v = null;
            this.c = null;
            this.f1384R = null;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:102:0x021f */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0448, code lost:
        if (r5 < r8) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x045b, code lost:
        if (r8 != 0) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        if (r14 >= 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013b, code lost:
        if (r13 >= 0) goto L_0x013f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04fd  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
        // Method dump skipped, instructions count: 1285
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i, int i2, boolean z) {
        int i3 = i + i2;
        int Z = this.f1378R.Z();
        for (int i4 = 0; i4 < Z; i4++) {
            h9X W = W(this.f1378R.L(i4));
            if (W != null && !W.P()) {
                int i5 = W.R;
                if (i5 >= i3) {
                    W.U(-i2, z);
                    this.f1385R.f1839R = true;
                } else if (i5 >= i) {
                    W.v(8);
                    W.U(-i2, z);
                    W.R = i - 1;
                    this.f1385R.f1839R = true;
                }
            }
        }
        fgh fgh = this.f1391R;
        int size = fgh.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                h9X h9x = (h9X) fgh.c.get(size);
                if (h9x != null) {
                    int i6 = h9x.R;
                    if (i6 >= i3) {
                        h9x.U(-i2, z);
                    } else if (i6 >= i) {
                        h9x.v(8);
                        fgh.X(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void q(int i, int i2, int[] iArr) {
        h9X h9x;
        X4();
        G();
        eug.R("RV Scroll");
        h(this.f1385R);
        int iE = i != 0 ? this.f1400R.iE(i, this.f1391R, this.f1385R) : 0;
        int ZW = i2 != 0 ? this.f1400R.ZW(i2, this.f1391R, this.f1385R) : 0;
        eug.v();
        int X2 = this.f1378R.X();
        for (int i3 = 0; i3 < X2; i3++) {
            View e = this.f1378R.e(i3);
            h9X d = d(e);
            if (!(d == null || (h9x = d.f4107v) == null)) {
                View view = h9x.f4097R;
                int left = e.getLeft();
                int top = e.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        B(true);
        zw(false);
        if (iArr != null) {
            iArr[0] = iE;
            iArr[1] = ZW;
        }
    }

    public final void r(int i) {
        if (this.f1400R != null) {
            setScrollState(2);
            this.f1400R.xN(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        h9X W = W(view);
        if (W != null) {
            if (W.H()) {
                W.X &= -257;
            } else if (!W.P()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(W);
                throw new IllegalArgumentException(jQ.H(this, sb));
            }
        }
        view.clearAnimation();
        W(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        nvs nvs = this.f1400R.f5376R;
        boolean z = true;
        if (!(nvs != null && nvs.f6639v) && !T()) {
            z = false;
        }
        if (!z && view2 != null) {
            D(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f1400R.cr(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f1412c.size();
        for (int i = 0; i < size; i++) {
            ((aiI) this.f1412c.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewParent, android.view.View
    public final void requestLayout() {
        if (this.e != 0 || this.f1375O) {
            this.f1410X = true;
        } else {
            super.requestLayout();
        }
    }

    public final Rect s(View view) {
        l88 l88 = (l88) view.getLayoutParams();
        if (!l88.f5602R) {
            return l88.R;
        }
        if (this.f1385R.f1843v && (l88.v() || l88.f5601R.L())) {
            return l88.R;
        }
        Rect rect = l88.R;
        rect.set(0, 0, 0, 0);
        int size = this.f1423v.size();
        for (int i = 0; i < size; i++) {
            this.f1380R.set(0, 0, 0, 0);
            Rect rect2 = this.f1380R;
            ((gU1) this.f1423v.get(i)).getClass();
            ((l88) view.getLayoutParams()).R();
            rect2.set(0, 0, 0, 0);
            int i2 = rect.left;
            Rect rect3 = this.f1380R;
            rect.left = i2 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        l88.f5602R = false;
        return rect;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        kds kds = this.f1400R;
        if (kds == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1375O) {
            boolean e = kds.e();
            boolean X2 = this.f1400R.X();
            if (e || X2) {
                if (!e) {
                    i = 0;
                }
                if (!X2) {
                    i2 = 0;
                }
                w(i, i2, null, 0);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (T()) {
            int R2 = accessibilityEvent != null ? Nr.R(accessibilityEvent) : 0;
            if (R2 != 0) {
                i = R2;
            }
            this.f1408X |= i;
            i = 1;
        }
        if (i == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(kuM kum) {
        this.f1401R = kum;
        of5.O(this, kum);
    }

    public void setAdapter(gEY gey) {
        setLayoutFrozen(false);
        gEY gey2 = this.f1392R;
        if (gey2 != null) {
            gey2.R.unregisterObserver(this.f1386R);
            this.f1392R.getClass();
        }
        F();
        jP jPVar = this.f1398R;
        jPVar.U(jPVar.f4920R);
        jPVar.U(jPVar.v);
        jPVar.R = 0;
        gEY gey3 = this.f1392R;
        this.f1392R = gey;
        if (gey != null) {
            gey.R.registerObserver(this.f1386R);
            gey.X(this);
        }
        kds kds = this.f1400R;
        if (kds != null) {
            kds.k();
        }
        fgh fgh = this.f1391R;
        gEY gey4 = this.f1392R;
        fgh.f3499R.clear();
        fgh.e();
        lxt c = fgh.c();
        if (gey3 != null) {
            c.R--;
        }
        if (c.R == 0) {
            for (int i = 0; i < c.f5866R.size(); i++) {
                ((fSp) c.f5866R.valueAt(i)).f3424R.clear();
            }
        }
        if (gey4 != null) {
            c.R++;
        }
        this.f1385R.f1839R = true;
        f(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(jsu jsu) {
        if (jsu != null) {
            setChildrenDrawingOrderEnabled(jsu != null);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f1405R) {
            this.f1415e = null;
            this.f1421v = null;
            this.c = null;
            this.f1384R = null;
        }
        this.f1405R = z;
        super.setClipToPadding(z);
        if (this.f1417e) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(fP0 fp0) {
        fp0.getClass();
        this.f1390R = fp0;
        this.f1415e = null;
        this.f1421v = null;
        this.c = null;
        this.f1384R = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f1413c = z;
    }

    public void setItemAnimator(gxa gxa) {
        gxa gxa2 = this.f1393R;
        if (gxa2 != null) {
            gxa2.O();
            this.f1393R.f3999R = null;
        }
        this.f1393R = gxa;
        if (gxa != null) {
            gxa.f3999R = this.f1395R;
        }
    }

    public void setItemViewCacheSize(int i) {
        fgh fgh = this.f1391R;
        fgh.R = i;
        fgh.H();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(kds kds) {
        nvs nvs;
        if (kds != this.f1400R) {
            setScrollState(0);
            pqm pqm = this.f1404R;
            pqm.f7292R.removeCallbacks(pqm);
            pqm.f7291R.abortAnimation();
            kds kds2 = this.f1400R;
            if (!(kds2 == null || (nvs = kds2.f5376R) == null)) {
                nvs.L();
            }
            if (this.f1400R != null) {
                gxa gxa = this.f1393R;
                if (gxa != null) {
                    gxa.O();
                }
                this.f1400R.X4(this.f1391R);
                this.f1400R.zw(this.f1391R);
                fgh fgh = this.f1391R;
                fgh.f3499R.clear();
                fgh.e();
                if (this.f1425v) {
                    kds kds3 = this.f1400R;
                    kds3.f5382v = false;
                    kds3.p(this);
                }
                this.f1400R.pG(null);
                this.f1400R = null;
            } else {
                fgh fgh2 = this.f1391R;
                fgh2.f3499R.clear();
                fgh2.e();
            }
            Mk mk = this.f1378R;
            mk.f296R.L();
            int size = mk.f295R.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                h9q h9q = mk.R;
                h9q.getClass();
                h9X W = W((View) mk.f295R.get(size));
                if (W != null) {
                    RecyclerView recyclerView = h9q.R;
                    int i = W.L;
                    if (recyclerView.T()) {
                        W.Z = i;
                        recyclerView.f1409X.add(W);
                    } else {
                        View view = W.f4097R;
                        WeakHashMap weakHashMap = of5.f6887R;
                        mHC.t(view, i);
                    }
                    W.L = 0;
                }
                mk.f295R.remove(size);
            }
            h9q h9q2 = mk.R;
            int c = h9q2.c();
            for (int i2 = 0; i2 < c; i2++) {
                View childAt = h9q2.R.getChildAt(i2);
                RecyclerView recyclerView2 = h9q2.R;
                recyclerView2.getClass();
                W(childAt);
                gEY gey = recyclerView2.f1392R;
                childAt.clearAnimation();
            }
            h9q2.R.removeAllViews();
            this.f1400R = kds;
            if (kds != null) {
                if (kds.f5374R == null) {
                    kds.pG(this);
                    if (this.f1425v) {
                        this.f1400R.f5382v = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(kds);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(jQ.H(kds.f5374R, sb));
                }
            }
            this.f1391R.H();
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        hHo scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f4201R) {
            View view = scrollingChildHelper.R;
            WeakHashMap weakHashMap = of5.f6887R;
            m18.h(view);
        }
        scrollingChildHelper.f4201R = z;
    }

    public void setOnFlingListener(eEi eei) {
        this.f1388R = eei;
    }

    @Deprecated
    public void setOnScrollListener(cp2 cp2) {
        this.f1387R = cp2;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f1372H = z;
    }

    public void setRecycledViewPool(lxt lxt) {
        fgh fgh = this.f1391R;
        lxt lxt2 = fgh.f3501R;
        if (lxt2 != null) {
            lxt2.R--;
        }
        fgh.f3501R = lxt;
        if (lxt != null && fgh.f3498R.getAdapter() != null) {
            fgh.f3501R.R++;
        }
    }

    @Deprecated
    public void setRecyclerListener(oq_ oq_) {
    }

    public void setScrollState(int i) {
        nvs nvs;
        if (i != this.Z) {
            this.Z = i;
            if (i != 2) {
                pqm pqm = this.f1404R;
                pqm.f7292R.removeCallbacks(pqm);
                pqm.f7291R.abortAnimation();
                kds kds = this.f1400R;
                if (!(kds == null || (nvs = kds.f5376R) == null)) {
                    nvs.L();
                }
            }
            kds kds2 = this.f1400R;
            if (kds2 != null) {
                kds2.mL(i);
            }
            cp2 cp2 = this.f1387R;
            if (cp2 != null) {
                cp2.R(this, i);
            }
            ArrayList arrayList = this.f1416e;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((cp2) this.f1416e.get(size)).R(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.N = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.N = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(cWO cwo) {
        this.f1391R.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().L(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().Z(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        nvs nvs;
        if (z != this.f1375O) {
            m("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f1375O = false;
                if (!(!this.f1410X || this.f1400R == null || this.f1392R == null)) {
                    requestLayout();
                }
                this.f1410X = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1375O = true;
            this.f1373L = true;
            setScrollState(0);
            pqm pqm = this.f1404R;
            pqm.f7292R.removeCallbacks(pqm);
            pqm.f7291R.abortAnimation();
            kds kds = this.f1400R;
            if (kds != null && (nvs = kds.f5376R) != null) {
                nvs.L();
            }
        }
    }

    public final void t(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().X(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r6 == 2) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f1412c
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L_0x000c:
            if (r3 >= r1) goto L_0x006e
            java.util.ArrayList r4 = r11.f1412c
            java.lang.Object r4 = r4.get(r3)
            aiI r4 = (defpackage.aiI) r4
            r5 = r4
            f6m r5 = (defpackage.f6m) r5
            int r6 = r5.C
            r7 = 2
            r8 = 1
            if (r6 != r8) goto L_0x005e
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.e(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L_0x0062
            if (r6 != 0) goto L_0x0041
            if (r9 == 0) goto L_0x0062
        L_0x0041:
            if (r9 == 0) goto L_0x004e
            r5.N = r8
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.v = r6
            goto L_0x005a
        L_0x004e:
            if (r6 == 0) goto L_0x005a
            r5.N = r7
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.R = r6
        L_0x005a:
            r5.X(r7)
            goto L_0x0060
        L_0x005e:
            if (r6 != r7) goto L_0x0062
        L_0x0060:
            r5 = r8
            goto L_0x0063
        L_0x0062:
            r5 = r2
        L_0x0063:
            if (r5 == 0) goto L_0x006b
            r5 = 3
            if (r0 == r5) goto L_0x006b
            r11.f1379R = r4
            return r8
        L_0x006b:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x006e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u(android.view.MotionEvent):boolean");
    }

    public final void vl(int i) {
        getScrollingChildHelper().Z(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w(int, int, android.view.MotionEvent, int):boolean");
    }

    public final boolean y(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void z(int[] iArr) {
        int X2 = this.f1378R.X();
        if (X2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < X2; i3++) {
            h9X W = W(this.f1378R.e(i3));
            if (!W.P()) {
                int c = W.c();
                if (c < i) {
                    i = c;
                }
                if (c > i2) {
                    i2 = c;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final void zw(boolean z) {
        if (this.e < 1) {
            this.e = 1;
        }
        if (!z && !this.f1375O) {
            this.f1410X = false;
        }
        if (this.e == 1) {
            if (z && this.f1410X && !this.f1375O && this.f1400R != null && this.f1392R != null) {
                P();
            }
            if (!this.f1375O) {
                this.f1410X = false;
            }
        }
        this.e--;
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ClassLoader classLoader;
        Constructor constructor;
        this.f1386R = new cWJ(this);
        this.f1391R = new fgh(this);
        this.f1389R = new f67(0);
        this.f1402R = new lkl(this, 0);
        this.f1380R = new Rect();
        this.f1420v = new Rect();
        this.f1381R = new RectF();
        this.f1399R = new ArrayList();
        this.f1423v = new ArrayList();
        this.f1412c = new ArrayList();
        this.e = 0;
        this.f1419m = false;
        this.f1427x = false;
        this.O = 0;
        this.L = 0;
        this.f1390R = new fP0();
        this.f1393R = new bbj();
        this.Z = 0;
        this.m = -1;
        this.f1377R = Float.MIN_VALUE;
        this.v = Float.MIN_VALUE;
        this.f1372H = true;
        this.f1404R = new pqm(this);
        this.f1403R = new ma7(1);
        this.f1385R = new btj();
        this.f1407U = false;
        this.f1371C = false;
        this.f1395R = new h9q(this);
        this.f1374N = false;
        char c = 2;
        this.f1406R = new int[2];
        this.f1426v = new int[2];
        this.f1414c = new int[2];
        this.f1418e = new int[2];
        this.f1409X = new ArrayList();
        this.f1424v = new lkl(this, 1);
        this.g = 0;
        this.y = 0;
        this.f1422v = new h9q(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.N = viewConfiguration.getScaledTouchSlop();
        this.f1377R = nW_.R(viewConfiguration);
        this.v = nW_.v(viewConfiguration);
        this.P = viewConfiguration.getScaledMinimumFlingVelocity();
        this.j = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1393R.f3999R = this.f1395R;
        this.f1398R = new jP(new h9q(this));
        this.f1378R = new Mk(new h9q(this));
        WeakHashMap weakHashMap = of5.f6887R;
        if (k56.v(this) == 0) {
            k56.U(this, 8);
        }
        if (mHC.c(this) == 0) {
            mHC.t(this, 1);
        }
        this.f1383R = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new kuM(this));
        int[] iArr = dtx.f2907R;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        hpL.c(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1405R = obtainStyledAttributes.getBoolean(1, true);
        int i2 = 4;
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(jQ.H(this, opT.U("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            c = 2;
            new f6m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(kds.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f1370R);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((kds) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e7);
                }
            }
        }
        int[] iArr2 = X;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        hpL.c(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        kds kds = this.f1400R;
        if (kds != null) {
            return kds.i(layoutParams);
        }
        throw new IllegalStateException(jQ.H(this, opT.U("RecyclerView has no LayoutManager")));
    }
}
