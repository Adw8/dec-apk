package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements eRL, b1z {
    public static final gvk R;

    /* renamed from: R  reason: collision with other field name */
    public static final String f1258R;

    /* renamed from: R  reason: collision with other field name */
    public static final ThreadLocal f1259R;

    /* renamed from: R  reason: collision with other field name */
    public static final ozT f1260R;

    /* renamed from: R  reason: collision with other field name */
    public static final Class[] f1261R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f1262R;

    /* renamed from: R  reason: collision with other field name */
    public View f1263R;

    /* renamed from: R  reason: collision with other field name */
    public ViewGroup.OnHierarchyChangeListener f1264R;

    /* renamed from: R  reason: collision with other field name */
    public ay4 f1265R;

    /* renamed from: R  reason: collision with other field name */
    public gWM f1267R;

    /* renamed from: R  reason: collision with other field name */
    public qy f1270R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1271R;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1273c;

    /* renamed from: c  reason: collision with other field name */
    public int[] f1274c;
    public boolean e;
    public View v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1276v;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f1268R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final piu f1269R = new piu(3);

    /* renamed from: v  reason: collision with other field name */
    public final ArrayList f1275v = new ArrayList();
    public final ArrayList c = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final int[] f1272R = new int[2];

    /* renamed from: v  reason: collision with other field name */
    public final int[] f1277v = new int[2];

    /* renamed from: R  reason: collision with other field name */
    public final c_x f1266R = new c_x();

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f1258R = r0 != null ? r0.getName() : null;
        R = new gvk(3);
        f1261R = new Class[]{Context.class, AttributeSet.class};
        f1259R = new ThreadLocal();
        f1260R = new ozT();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = lTs.X;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1274c = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1274c.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.f1274c;
                iArr2[i] = (int) (((float) iArr2[i]) * f);
            }
        }
        this.f1262R = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        J();
        super.setOnHierarchyChangeListener(new j9a(this));
        WeakHashMap weakHashMap = of5.f6887R;
        if (mHC.c(this) == 0) {
            mHC.t(this, 1);
        }
    }

    public static void K(View view, int i) {
        aRL arl = (aRL) view.getLayoutParams();
        int i2 = arl.Z;
        if (i2 != i) {
            WeakHashMap weakHashMap = of5.f6887R;
            view.offsetTopAndBottom(i - i2);
            arl.Z = i;
        }
    }

    public static Rect L() {
        Rect rect = (Rect) f1260R.R();
        return rect == null ? new Rect() : rect;
    }

    public static aRL N(View view) {
        aRL arl = (aRL) view.getLayoutParams();
        if (!arl.f881R) {
            if (view instanceof kkj) {
                knf behavior = ((kkj) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                knf knf = arl.f880R;
                if (knf != behavior) {
                    if (knf != null) {
                        knf.O();
                    }
                    arl.f880R = behavior;
                    arl.f881R = true;
                    if (behavior != null) {
                        behavior.c(arl);
                    }
                }
                arl.f881R = true;
            } else {
                nus nus = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    nus = (nus) cls.getAnnotation(nus.class);
                    if (nus != null) {
                        break;
                    }
                }
                if (nus != null) {
                    try {
                        knf knf2 = (knf) nus.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        knf knf3 = arl.f880R;
                        if (knf3 != knf2) {
                            if (knf3 != null) {
                                knf3.O();
                            }
                            arl.f880R = knf2;
                            arl.f881R = true;
                            if (knf2 != null) {
                                knf2.c(arl);
                            }
                        }
                    } catch (Exception e) {
                        StringBuilder U = opT.U("Default behavior class ");
                        U.append(nus.value().getName());
                        U.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", U.toString(), e);
                    }
                }
                arl.f881R = true;
            }
        }
        return arl;
    }

    public static void U(int i, Rect rect, Rect rect2, aRL arl, int i2, int i3) {
        int i4 = arl.R;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = arl.v;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public static void o(View view, int i) {
        aRL arl = (aRL) view.getLayoutParams();
        int i2 = arl.L;
        if (i2 != i) {
            WeakHashMap weakHashMap = of5.f6887R;
            view.offsetLeftAndRight(i - i2);
            arl.L = i;
        }
    }

    public final int C(int i) {
        int[] iArr = this.f1274c;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    public final void H(View view, Rect rect) {
        ThreadLocal threadLocal = k16.R;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = k16.R;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        k16.R(this, view, matrix);
        ThreadLocal threadLocal3 = k16.v;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void J() {
        WeakHashMap weakHashMap = of5.f6887R;
        if (mHC.v(this)) {
            if (this.f1270R == null) {
                this.f1270R = new qy(1, this);
            }
            m18.V(this, this.f1270R);
            setSystemUiVisibility(1280);
            return;
        }
        m18.V(this, null);
    }

    @Override // defpackage.eRL
    public final boolean O(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                aRL arl = (aRL) childAt.getLayoutParams();
                knf knf = arl.f880R;
                if (knf != null) {
                    boolean j = knf.j(this, childAt, view, i, i2);
                    z |= j;
                    if (i2 == 0) {
                        arl.f883c = j;
                    } else if (i2 == 1) {
                        arl.f884e = j;
                    }
                } else if (i2 == 0) {
                    arl.f883c = false;
                } else if (i2 == 1) {
                    arl.f884e = false;
                }
            }
        }
        return z;
    }

    public final boolean P(View view, int i, int i2) {
        Rect L = L();
        H(view, L);
        try {
            return L.contains(i, i2);
        } finally {
            L.setEmpty();
            f1260R.v(L);
        }
    }

    @Override // defpackage.eRL
    public final void R(View view, int i, int i2, int i3, int i4, int i5) {
        e(view, i, i2, i3, i4, 0, this.f1277v);
    }

    public final void V(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            knf knf = ((aRL) childAt.getLayoutParams()).f880R;
            if (knf != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    knf.L(this, childAt, obtain);
                } else {
                    knf.y(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((aRL) getChildAt(i2).getLayoutParams()).f886v = false;
        }
        this.f1263R = null;
        this.f1271R = false;
    }

    @Override // defpackage.eRL
    public final void X(View view, View view2, int i, int i2) {
        c_x c_x = this.f1266R;
        if (i2 == 1) {
            c_x.X = i;
        } else {
            c_x.e = i;
        }
        this.v = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((aRL) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    public final void Z(aRL arl, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) arl).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) arl).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) arl).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) arl).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    @Override // defpackage.eRL
    public final void c(View view, int i) {
        c_x c_x = this.f1266R;
        if (i == 1) {
            c_x.X = 0;
        } else {
            c_x.e = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            aRL arl = (aRL) childAt.getLayoutParams();
            if (arl.R(i)) {
                knf knf = arl.f880R;
                if (knf != null) {
                    knf.g(this, childAt, view, i);
                }
                if (i == 0) {
                    arl.f883c = false;
                } else if (i == 1) {
                    arl.f884e = false;
                }
                arl.f882X = false;
            }
        }
        this.v = null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof aRL) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        knf knf = ((aRL) view.getLayoutParams()).f880R;
        if (knf != null) {
            knf.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1262R;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // defpackage.b1z
    public final void e(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        knf knf;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                aRL arl = (aRL) childAt.getLayoutParams();
                if (arl.R(i5) && (knf = arl.f880R) != null) {
                    int[] iArr2 = this.f1272R;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    knf.U(this, childAt, i2, i3, i4, iArr2);
                    int[] iArr3 = this.f1272R;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, this.f1272R[1]) : Math.min(i7, this.f1272R[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            j(1);
        }
    }

    public final void g(View view, int i) {
        Rect L;
        Rect L2;
        ozT ozt;
        aRL arl = (aRL) view.getLayoutParams();
        View view2 = arl.f879R;
        int i2 = 0;
        if (view2 == null && arl.e != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            L = L();
            L2 = L();
            try {
                H(view2, L);
                aRL arl2 = (aRL) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                U(i, L, L2, arl2, measuredWidth, measuredHeight);
                Z(arl2, L2, measuredWidth, measuredHeight);
                view.layout(L2.left, L2.top, L2.right, L2.bottom);
            } finally {
                L.setEmpty();
                ozt = f1260R;
                ozt.v(L);
                L2.setEmpty();
                ozt.v(L2);
            }
        } else {
            int i3 = arl.c;
            if (i3 >= 0) {
                aRL arl3 = (aRL) view.getLayoutParams();
                int i4 = arl3.R;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
                int i5 = absoluteGravity & 7;
                int i6 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int C = C(i3) - measuredWidth2;
                if (i5 == 1) {
                    C += measuredWidth2 / 2;
                } else if (i5 == 5) {
                    C += measuredWidth2;
                }
                if (i6 == 16) {
                    i2 = 0 + (measuredHeight2 / 2);
                } else if (i6 == 80) {
                    i2 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) arl3).leftMargin, Math.min(C, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) arl3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) arl3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) arl3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            aRL arl4 = (aRL) view.getLayoutParams();
            L = L();
            L.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) arl4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) arl4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) arl4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) arl4).bottomMargin);
            if (this.f1267R != null) {
                WeakHashMap weakHashMap = of5.f6887R;
                if (mHC.v(this) && !mHC.v(view)) {
                    L.left = this.f1267R.e() + L.left;
                    L.top = this.f1267R.O() + L.top;
                    L.right -= this.f1267R.X();
                    L.bottom -= this.f1267R.c();
                }
            }
            L2 = L();
            int i7 = arl4.R;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            gGP.v(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), L, L2, i);
            view.layout(L2.left, L2.top, L2.right, L2.bottom);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aRL();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aRL(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        i();
        return Collections.unmodifiableList(this.f1268R);
    }

    public final gWM getLastWindowInsets() {
        return this.f1267R;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c_x c_x = this.f1266R;
        return c_x.X | c_x.e;
    }

    public Drawable getStatusBarBackground() {
        return this.f1262R;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        if (r5 != false) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x018c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
        // Method dump skipped, instructions count: 502
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.i():void");
    }

    public final void j(int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        int i9;
        knf knf;
        WeakHashMap weakHashMap = of5.f6887R;
        int e = eHQ.e(this);
        int size = this.f1268R.size();
        Rect L = L();
        Rect L2 = L();
        Rect L3 = L();
        int i10 = 0;
        int i11 = i;
        while (i10 < size) {
            View view = (View) this.f1268R.get(i10);
            aRL arl = (aRL) view.getLayoutParams();
            if (i11 == 0 && view.getVisibility() == 8) {
                size = size;
                L3 = L3;
                i2 = i10;
            } else {
                int i12 = 0;
                while (i12 < i10) {
                    if (arl.f885v == ((View) this.f1268R.get(i12))) {
                        aRL arl2 = (aRL) view.getLayoutParams();
                        if (arl2.f879R != null) {
                            Rect L4 = L();
                            Rect L5 = L();
                            Rect L6 = L();
                            H(arl2.f879R, L4);
                            m(view, L5, false);
                            int measuredWidth = view.getMeasuredWidth();
                            size = size;
                            int measuredHeight = view.getMeasuredHeight();
                            boolean z4 = true;
                            i10 = i10;
                            L3 = L3;
                            i9 = i12;
                            U(e, L4, L6, arl2, measuredWidth, measuredHeight);
                            if (L6.left == L5.left && L6.top == L5.top) {
                                z4 = false;
                            }
                            Z(arl2, L6, measuredWidth, measuredHeight);
                            int i13 = L6.left - L5.left;
                            int i14 = L6.top - L5.top;
                            if (i13 != 0) {
                                WeakHashMap weakHashMap2 = of5.f6887R;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap weakHashMap3 = of5.f6887R;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z4 && (knf = arl2.f880R) != null) {
                                knf.e(view, arl2.f879R);
                            }
                            L4.setEmpty();
                            ozT ozt = f1260R;
                            ozt.v(L4);
                            L5.setEmpty();
                            ozt.v(L5);
                            L6.setEmpty();
                            ozt.v(L6);
                            i12 = i9 + 1;
                        }
                    }
                    i9 = i12;
                    size = size;
                    L3 = L3;
                    i10 = i10;
                    i12 = i9 + 1;
                }
                i2 = i10;
                m(view, L2, true);
                if (arl.X != 0 && !L2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(arl.X, e);
                    int i15 = absoluteGravity & 112;
                    if (i15 == 48) {
                        L.top = Math.max(L.top, L2.bottom);
                    } else if (i15 == 80) {
                        L.bottom = Math.max(L.bottom, getHeight() - L2.top);
                    }
                    int i16 = absoluteGravity & 7;
                    if (i16 == 3) {
                        L.left = Math.max(L.left, L2.right);
                    } else if (i16 == 5) {
                        L.right = Math.max(L.right, getWidth() - L2.left);
                    }
                }
                if (arl.O != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = of5.f6887R;
                    if (d6y.c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        aRL arl3 = (aRL) view.getLayoutParams();
                        knf knf2 = arl3.f880R;
                        Rect L7 = L();
                        Rect L8 = L();
                        L8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (knf2 == null || !knf2.R(view)) {
                            L7.set(L8);
                        } else if (!L8.contains(L7)) {
                            StringBuilder U = opT.U("Rect should be within the child's bounds. Rect:");
                            U.append(L7.toShortString());
                            U.append(" | Bounds:");
                            U.append(L8.toShortString());
                            throw new IllegalArgumentException(U.toString());
                        }
                        L8.setEmpty();
                        ozT ozt2 = f1260R;
                        ozt2.v(L8);
                        if (L7.isEmpty()) {
                            L7.setEmpty();
                            ozt2.v(L7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(arl3.O, e);
                            if ((absoluteGravity2 & 48) != 48 || (i7 = (L7.top - ((ViewGroup.MarginLayoutParams) arl3).topMargin) - arl3.Z) >= (i8 = L.top)) {
                                z2 = false;
                            } else {
                                K(view, i8 - i7);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - L7.bottom) - ((ViewGroup.MarginLayoutParams) arl3).bottomMargin) + arl3.Z) < (i6 = L.bottom)) {
                                K(view, height - i6);
                                z2 = true;
                            }
                            if (!z2) {
                                K(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i4 = (L7.left - ((ViewGroup.MarginLayoutParams) arl3).leftMargin) - arl3.L) >= (i5 = L.left)) {
                                z3 = false;
                            } else {
                                o(view, i5 - i4);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - L7.right) - ((ViewGroup.MarginLayoutParams) arl3).rightMargin) + arl3.L) < (i3 = L.right)) {
                                o(view, width - i3);
                                z3 = true;
                            }
                            if (!z3) {
                                o(view, 0);
                            }
                            L7.setEmpty();
                            ozt2.v(L7);
                        }
                    }
                }
                if (i != 2) {
                    L3 = L3;
                    L3.set(((aRL) view.getLayoutParams()).f878R);
                    if (L3.equals(L2)) {
                        size = size;
                        i11 = i;
                    } else {
                        ((aRL) view.getLayoutParams()).f878R.set(L2);
                    }
                } else {
                    L3 = L3;
                }
                size = size;
                for (int i17 = i2 + 1; i17 < size; i17++) {
                    View view2 = (View) this.f1268R.get(i17);
                    aRL arl4 = (aRL) view2.getLayoutParams();
                    knf knf3 = arl4.f880R;
                    if (knf3 != null && knf3.v(view2, view)) {
                        if (i != 0 || !arl4.f882X) {
                            if (i != 2) {
                                z = knf3.e(view2, view);
                            } else {
                                knf3.X(this, view);
                                z = true;
                            }
                            if (i == 1) {
                                arl4.f882X = z;
                            }
                        } else {
                            arl4.f882X = false;
                        }
                    }
                }
                i11 = i;
            }
            i10 = i2 + 1;
        }
        L.setEmpty();
        ozT ozt3 = f1260R;
        ozt3.v(L);
        L2.setEmpty();
        ozt3.v(L2);
        L3.setEmpty();
        ozt3.v(L3);
    }

    public final void m(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            H(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        V(false);
        if (this.f1273c) {
            if (this.f1265R == null) {
                this.f1265R = new ay4(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1265R);
        }
        if (this.f1267R == null) {
            WeakHashMap weakHashMap = of5.f6887R;
            if (mHC.v(this)) {
                fv7.c(this);
            }
        }
        this.f1276v = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        V(false);
        if (this.f1273c && this.f1265R != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1265R);
        }
        View view = this.v;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1276v = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e && this.f1262R != null) {
            gWM gwm = this.f1267R;
            int O = gwm != null ? gwm.O() : 0;
            if (O > 0) {
                this.f1262R.setBounds(0, 0, getWidth(), O);
                this.f1262R.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            V(true);
        }
        boolean t = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            V(true);
        }
        return t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        knf knf;
        WeakHashMap weakHashMap = of5.f6887R;
        int e = eHQ.e(this);
        int size = this.f1268R.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f1268R.get(i5);
            if (view.getVisibility() != 8 && ((knf = ((aRL) view.getLayoutParams()).f880R) == null || !knf.Z(this, view, e))) {
                g(view, e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0190, code lost:
        if (r0.m(r30, r19, r24, r20, r25) == false) goto L_0x01a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0193  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 516
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                aRL arl = (aRL) childAt.getLayoutParams();
                if (arl.R(0)) {
                    knf knf = arl.f880R;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        knf knf;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                aRL arl = (aRL) childAt.getLayoutParams();
                if (arl.R(0) && (knf = arl.f880R) != null) {
                    z |= knf.x(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        v(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        R(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        X(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof jbh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        jbh jbh = (jbh) parcelable;
        super.onRestoreInstanceState(((OG) jbh).f327R);
        SparseArray sparseArray = jbh.R;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            knf knf = N(childAt).f880R;
            if (!(id == -1 || knf == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                knf.N(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable P;
        jbh jbh = new jbh(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            knf knf = ((aRL) childAt.getLayoutParams()).f880R;
            if (!(id == -1 || knf == null || (P = knf.P(childAt)) == null)) {
                sparseArray.append(id, P);
            }
        }
        jbh.R = sparseArray;
        return jbh;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return O(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1263R
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f1263R
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            aRL r6 = (defpackage.aRL) r6
            knf r6 = r6.f880R
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f1263R
            boolean r6 = r6.y(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.f1263R
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.V(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        knf knf = ((aRL) view.getLayoutParams()).f880R;
        if (knf == null || !knf.C(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1271R) {
            V(false);
            this.f1271R = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        J();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1264R = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1262R;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1262R = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1262R.setState(getDrawableState());
                }
                Drawable drawable4 = this.f1262R;
                WeakHashMap weakHashMap = of5.f6887R;
                f4J.v(drawable4, eHQ.e(this));
                this.f1262R.setVisible(getVisibility() == 0, false);
                this.f1262R.setCallback(this);
            }
            WeakHashMap weakHashMap2 = of5.f6887R;
            mHC.H(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            Object obj = C1.R;
            drawable = eNe.v(context, i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1262R;
        if (drawable != null && drawable.isVisible() != z) {
            this.f1262R.setVisible(z, false);
        }
    }

    public final boolean t(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1275v;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        gvk gvk = R;
        if (gvk != null) {
            Collections.sort(arrayList, gvk);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            aRL arl = (aRL) view.getLayoutParams();
            knf knf = arl.f880R;
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && knf != null) {
                    if (i == 0) {
                        z2 = knf.L(this, view, motionEvent);
                    } else if (i == 1) {
                        z2 = knf.y(this, view, motionEvent);
                    }
                    if (z2) {
                        this.f1263R = view;
                    }
                }
                if (arl.f880R == null) {
                    arl.f886v = false;
                }
                boolean z4 = arl.f886v;
                if (z4) {
                    z = true;
                } else {
                    z = z4 | false;
                    arl.f886v = z;
                }
                z3 = z && !z4;
                if (z && !z3) {
                    break;
                }
            } else if (knf != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    knf.L(this, view, motionEvent2);
                } else if (i == 1) {
                    knf.y(this, view, motionEvent2);
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // defpackage.eRL
    public final void v(View view, int i, int i2, int[] iArr, int i3) {
        knf knf;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                aRL arl = (aRL) childAt.getLayoutParams();
                if (arl.R(i3) && (knf = arl.f880R) != null) {
                    int[] iArr2 = this.f1272R;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    knf.H(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f1272R;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f1272R;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            j(1);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1262R;
    }

    public final ArrayList x(View view) {
        piu piu = this.f1269R;
        int i = ((cE0) piu.f7203v).e;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ((cE0) piu.f7203v).x(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((cE0) piu.f7203v).Z(i2));
            }
        }
        this.c.clear();
        if (arrayList != null) {
            this.c.addAll(arrayList);
        }
        return this.c;
    }

    public final void y(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof aRL) {
            return new aRL((aRL) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new aRL((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new aRL(layoutParams);
    }
}
