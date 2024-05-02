package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import dev.kdrag0n.virtcontainer.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends knf {
    public int C;

    /* renamed from: C  reason: collision with other field name */
    public boolean f2256C;
    public int H;

    /* renamed from: H  reason: collision with other field name */
    public boolean f2257H;
    public int L;

    /* renamed from: L  reason: collision with other field name */
    public boolean f2258L;
    public int N;

    /* renamed from: N  reason: collision with other field name */
    public boolean f2259N;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f2260O;
    public int P;

    /* renamed from: P  reason: collision with other field name */
    public boolean f2261P;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public int f2262R;

    /* renamed from: R  reason: collision with other field name */
    public final EJ f2263R;

    /* renamed from: R  reason: collision with other field name */
    public ValueAnimator f2264R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f2265R;

    /* renamed from: R  reason: collision with other field name */
    public VelocityTracker f2266R;

    /* renamed from: R  reason: collision with other field name */
    public c18 f2267R;

    /* renamed from: R  reason: collision with other field name */
    public dOE f2268R;

    /* renamed from: R  reason: collision with other field name */
    public fen f2269R;

    /* renamed from: R  reason: collision with other field name */
    public WeakReference f2270R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f2271R;

    /* renamed from: R  reason: collision with other field name */
    public HashMap f2272R;

    /* renamed from: R  reason: collision with other field name */
    public final u7 f2273R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2274R;
    public int U;

    /* renamed from: U  reason: collision with other field name */
    public boolean f2275U;
    public int V;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f2276X;
    public int Z;

    /* renamed from: Z  reason: collision with other field name */
    public boolean f2277Z;
    public float c;

    /* renamed from: c  reason: collision with other field name */
    public int f2278c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f2279c;
    public float e;

    /* renamed from: e  reason: collision with other field name */
    public int f2280e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f2281e;
    public int g;

    /* renamed from: g  reason: collision with other field name */
    public boolean f2282g;
    public int i;
    public int j;

    /* renamed from: j  reason: collision with other field name */
    public boolean f2283j;
    public int m;

    /* renamed from: m  reason: collision with other field name */
    public boolean f2284m;
    public int t;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public int f2285v;

    /* renamed from: v  reason: collision with other field name */
    public WeakReference f2286v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2287v;
    public int x;

    /* renamed from: x  reason: collision with other field name */
    public boolean f2288x;
    public int y;

    public BottomSheetBehavior() {
        this.f2262R = 0;
        this.f2274R = true;
        this.X = -1;
        this.O = -1;
        this.f2263R = new EJ(this);
        this.v = 0.5f;
        this.c = -1.0f;
        this.f2259N = true;
        this.N = 4;
        this.e = 0.1f;
        this.f2271R = new ArrayList();
        this.V = -1;
        this.f2273R = new u7(this);
    }

    public static int K(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static View o(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = of5.f6887R;
        if (m18.j(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View o = o(viewGroup.getChildAt(i));
                if (o != null) {
                    return o;
                }
            }
        }
        return null;
    }

    public final void A(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f2257H != z) {
                this.f2257H = z;
                if (this.f2267R != null && (valueAnimator = this.f2264R) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f2264R.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f2264R.setFloatValues(1.0f - f, f);
                    this.f2264R.start();
                }
            }
        }
    }

    @Override // defpackage.knf
    public final void H(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference weakReference = this.f2286v;
            if (view2 == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = view.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < J()) {
                        int J = top - J();
                        iArr[1] = J;
                        int i5 = -J;
                        WeakHashMap weakHashMap = of5.f6887R;
                        view.offsetTopAndBottom(i5);
                        u(3);
                    } else if (this.f2259N) {
                        iArr[1] = i2;
                        WeakHashMap weakHashMap2 = of5.f6887R;
                        view.offsetTopAndBottom(-i2);
                        u(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                    int i6 = this.C;
                    if (i4 > i6 && !this.f2275U) {
                        int i7 = top - i6;
                        iArr[1] = i7;
                        int i8 = -i7;
                        WeakHashMap weakHashMap3 = of5.f6887R;
                        view.offsetTopAndBottom(i8);
                        u(4);
                    } else if (this.f2259N) {
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = of5.f6887R;
                        view.offsetTopAndBottom(-i2);
                        u(1);
                    } else {
                        return;
                    }
                }
                V(view.getTop());
                this.P = i2;
                this.f2283j = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        if (defpackage.d6y.v(r5) != false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L_0x0075
            r1 = 2
            if (r5 != r1) goto L_0x0008
            goto L_0x0075
        L_0x0008:
            boolean r1 = r4.f2275U
            if (r1 != 0) goto L_0x0026
            r1 = 5
            if (r5 != r1) goto L_0x0026
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Cannot set state: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "BottomSheetBehavior"
            android.util.Log.w(r5, r4)
            return
        L_0x0026:
            r1 = 6
            if (r5 != r1) goto L_0x0037
            boolean r1 = r4.f2274R
            if (r1 == 0) goto L_0x0037
            int r1 = r4.Y(r5)
            int r2 = r4.H
            if (r1 > r2) goto L_0x0037
            r1 = 3
            goto L_0x0038
        L_0x0037:
            r1 = r5
        L_0x0038:
            java.lang.ref.WeakReference r2 = r4.f2270R
            if (r2 == 0) goto L_0x0071
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0043
            goto L_0x0071
        L_0x0043:
            java.lang.ref.WeakReference r5 = r4.f2270R
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            kBb r2 = new kBb
            r3 = 7
            r2.<init>(r4, r5, r1, r3)
            android.view.ViewParent r4 = r5.getParent()
            if (r4 == 0) goto L_0x0066
            boolean r4 = r4.isLayoutRequested()
            if (r4 == 0) goto L_0x0066
            java.util.WeakHashMap r4 = defpackage.of5.f6887R
            boolean r4 = defpackage.d6y.v(r5)
            if (r4 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            if (r0 == 0) goto L_0x006d
            r5.post(r2)
            goto L_0x0074
        L_0x006d:
            r2.run()
            goto L_0x0074
        L_0x0071:
            r4.u(r5)
        L_0x0074:
            return
        L_0x0075:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "STATE_"
            java.lang.StringBuilder r1 = defpackage.opT.U(r1)
            if (r5 != r0) goto L_0x0082
            java.lang.String r5 = "DRAGGING"
            goto L_0x0084
        L_0x0082:
            java.lang.String r5 = "SETTLING"
        L_0x0084:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r5 = defpackage.jQ.g(r1, r5, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.I(int):void");
    }

    public final int J() {
        if (this.f2274R) {
            return this.H;
        }
        return Math.max(this.x, this.f2258L ? 0 : this.m);
    }

    @Override // defpackage.knf
    public final boolean L(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        fen fen;
        if (!view.isShown() || !this.f2259N) {
            this.f2261P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.t = -1;
            VelocityTracker velocityTracker = this.f2266R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2266R = null;
            }
        }
        if (this.f2266R == null) {
            this.f2266R = VelocityTracker.obtain();
        }
        this.f2266R.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.i = (int) motionEvent.getY();
            if (this.N != 2) {
                WeakReference weakReference = this.f2286v;
                View view3 = weakReference != null ? (View) weakReference.get() : null;
                if (view3 != null && coordinatorLayout.P(view3, x, this.i)) {
                    this.t = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2282g = true;
                }
            }
            this.f2261P = this.t == -1 && !coordinatorLayout.P(view, x, this.i);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2282g = false;
            this.t = -1;
            if (this.f2261P) {
                this.f2261P = false;
                return false;
            }
        }
        if (!this.f2261P && (fen = this.f2269R) != null && fen.y(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f2286v;
        if (weakReference2 != null) {
            view2 = (View) weakReference2.get();
        }
        return actionMasked == 2 && view2 != null && !this.f2261P && this.N != 1 && !coordinatorLayout.P(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f2269R != null && Math.abs(((float) this.i) - motionEvent.getY()) > ((float) this.f2269R.f3491v);
    }

    @Override // defpackage.knf
    public final void N(View view, Parcelable parcelable) {
        TW tw = (TW) parcelable;
        int i = this.f2262R;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f2285v = tw.X;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f2274R = tw.R;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f2275U = tw.v;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f2256C = tw.c;
            }
        }
        int i2 = tw.e;
        if (i2 == 1 || i2 == 2) {
            this.N = 4;
        } else {
            this.N = i2;
        }
    }

    @Override // defpackage.knf
    public final void O() {
        this.f2270R = null;
        this.f2269R = null;
    }

    @Override // defpackage.knf
    public final Parcelable P(View view) {
        return new TW(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final void Q() {
        View view;
        int i;
        WeakReference weakReference = this.f2270R;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            of5.e(view, 524288);
            of5.c(view, 0);
            of5.e(view, 262144);
            of5.c(view, 0);
            of5.e(view, 1048576);
            of5.c(view, 0);
            int i2 = this.V;
            if (i2 != -1) {
                of5.e(view, i2);
                of5.c(view, 0);
            }
            int i3 = 6;
            if (!this.f2274R && this.N != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                c85 c85 = new c85(this, 6);
                ArrayList v = of5.v(view);
                int i4 = 0;
                while (true) {
                    if (i4 >= v.size()) {
                        int i5 = 0;
                        int i6 = -1;
                        while (true) {
                            int[] iArr = of5.f6888R;
                            if (i5 >= iArr.length || i6 != -1) {
                                break;
                            }
                            int i7 = iArr[i5];
                            boolean z = true;
                            for (int i8 = 0; i8 < v.size(); i8++) {
                                z &= ((Ex) v.get(i8)).R() != i7;
                            }
                            if (z) {
                                i6 = i7;
                            }
                            i5++;
                        }
                        i = i6;
                    } else if (TextUtils.equals(string, ((Ex) v.get(i4)).v())) {
                        i = ((Ex) v.get(i4)).R();
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i != -1) {
                    Ex ex = new Ex(null, i, string, c85, null);
                    View.AccessibilityDelegate R = hpL.R(view);
                    G5 g5 = R == null ? null : R instanceof ma ? ((ma) R).R : new G5(R);
                    if (g5 == null) {
                        g5 = new G5();
                    }
                    of5.O(view, g5);
                    of5.e(view, ex.R());
                    of5.v(view).add(ex);
                    of5.c(view, 0);
                }
                this.V = i;
            }
            if (this.f2275U && this.N != 5) {
                of5.X(view, Ex.Z, new c85(this, 5));
            }
            int i9 = this.N;
            if (i9 == 3) {
                if (this.f2274R) {
                    i3 = 4;
                }
                of5.X(view, Ex.L, new c85(this, i3));
            } else if (i9 == 4) {
                if (this.f2274R) {
                    i3 = 3;
                }
                of5.X(view, Ex.O, new c85(this, i3));
            } else if (i9 == 6) {
                of5.X(view, Ex.L, new c85(this, 4));
                of5.X(view, Ex.O, new c85(this, 3));
            }
        }
    }

    public final void S(boolean z) {
        WeakReference weakReference = this.f2270R;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.f2272R == null) {
                        this.f2272R = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f2270R.get() && z) {
                        this.f2272R.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.f2272R = null;
                }
            }
        }
    }

    @Override // defpackage.knf
    public final void U(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    public final void V(int i) {
        if (((View) this.f2270R.get()) != null && !this.f2271R.isEmpty()) {
            int i2 = this.C;
            if (i <= i2 && i2 != J()) {
                J();
            }
            if (this.f2271R.size() > 0) {
                jQ.Y(this.f2271R.get(0));
                throw null;
            }
        }
    }

    public final int Y(int i) {
        if (i == 3) {
            return J();
        }
        if (i == 4) {
            return this.C;
        }
        if (i == 5) {
            return this.y;
        }
        if (i == 6) {
            return this.U;
        }
        throw new IllegalArgumentException(opT.Z("Invalid state to get top offset: ", i));
    }

    @Override // defpackage.knf
    public final boolean Z(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = of5.f6887R;
        if (mHC.v(coordinatorLayout) && !mHC.v(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2270R == null) {
            this.f2278c = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = !this.f2279c && !this.f2287v;
            if (this.f2281e || this.f2276X || this.f2260O || this.f2277Z || this.f2284m || this.f2288x || z) {
                m18.V(view, new gd0(new lTo(this, z), new bzl(eHQ.O(view), view.getPaddingTop(), eHQ.X(view), view.getPaddingBottom())));
                if (d6y.v(view)) {
                    fv7.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new prF());
                }
            }
            this.f2270R = new WeakReference(view);
            c18 c18 = this.f2267R;
            if (c18 != null) {
                mHC.g(view, c18);
                c18 c182 = this.f2267R;
                float f = this.c;
                if (f == -1.0f) {
                    f = m18.m(view);
                }
                c182.U(f);
                boolean z2 = this.N == 3;
                this.f2257H = z2;
                this.f2267R.N(z2 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.f2265R;
                if (colorStateList != null) {
                    m18.g(view, colorStateList);
                }
            }
            Q();
            if (mHC.c(view) == 0) {
                mHC.t(view, 1);
            }
        }
        if (this.f2269R == null) {
            this.f2269R = new fen(coordinatorLayout.getContext(), coordinatorLayout, this.f2273R);
        }
        int top = view.getTop();
        coordinatorLayout.g(view, i);
        this.g = coordinatorLayout.getWidth();
        this.y = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.j = height;
        int i2 = this.y;
        int i3 = i2 - height;
        int i4 = this.m;
        if (i3 < i4) {
            if (this.f2258L) {
                this.j = i2;
            } else {
                this.j = i2 - i4;
            }
        }
        this.H = Math.max(0, i2 - this.j);
        this.U = (int) ((1.0f - this.v) * ((float) this.y));
        t();
        int i5 = this.N;
        if (i5 == 3) {
            view.offsetTopAndBottom(J());
        } else if (i5 == 6) {
            view.offsetTopAndBottom(this.U);
        } else if (this.f2275U && i5 == 5) {
            view.offsetTopAndBottom(this.y);
        } else if (i5 == 4) {
            view.offsetTopAndBottom(this.C);
        } else if (i5 == 1 || i5 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        this.f2286v = new WeakReference(o(view));
        if (this.f2271R.size() <= 0) {
            return true;
        }
        jQ.Y(this.f2271R.get(0));
        throw null;
    }

    @Override // defpackage.knf
    public final void c(aRL arl) {
        this.f2270R = null;
        this.f2269R = null;
    }

    public final void d() {
        View view;
        if (this.f2270R != null) {
            t();
            if (this.N == 4 && (view = (View) this.f2270R.get()) != null) {
                view.requestLayout();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r5.getTop() <= r3.U) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (java.lang.Math.abs(r4 - r3.H) < java.lang.Math.abs(r4 - r3.C)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0080, code lost:
        if (r4 < java.lang.Math.abs(r4 - r3.C)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.C)) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        if (java.lang.Math.abs(r4 - r3.U) < java.lang.Math.abs(r4 - r3.C)) goto L_0x00ad;
     */
    @Override // defpackage.knf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.J()
            r0 = 3
            if (r4 != r7) goto L_0x000f
            r3.u(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference r4 = r3.f2286v
            if (r4 == 0) goto L_0x00b6
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x00b6
            boolean r4 = r3.f2283j
            if (r4 != 0) goto L_0x001f
            goto L_0x00b6
        L_0x001f:
            int r4 = r3.P
            r6 = 4
            r7 = 6
            if (r4 <= 0) goto L_0x0035
            boolean r4 = r3.f2274R
            if (r4 == 0) goto L_0x002b
            goto L_0x00b0
        L_0x002b:
            int r4 = r5.getTop()
            int r6 = r3.U
            if (r4 <= r6) goto L_0x00b0
            goto L_0x00ad
        L_0x0035:
            boolean r4 = r3.f2275U
            if (r4 == 0) goto L_0x0056
            android.view.VelocityTracker r4 = r3.f2266R
            if (r4 != 0) goto L_0x003f
            r4 = 0
            goto L_0x004e
        L_0x003f:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.R
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.f2266R
            int r1 = r3.t
            float r4 = r4.getYVelocity(r1)
        L_0x004e:
            boolean r4 = r3.z(r5, r4)
            if (r4 == 0) goto L_0x0056
            r0 = 5
            goto L_0x00b0
        L_0x0056:
            int r4 = r3.P
            if (r4 != 0) goto L_0x0093
            int r4 = r5.getTop()
            boolean r1 = r3.f2274R
            if (r1 == 0) goto L_0x0074
            int r7 = r3.H
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            int r1 = r3.C
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r7 >= r4) goto L_0x00af
            goto L_0x00b0
        L_0x0074:
            int r1 = r3.U
            if (r4 >= r1) goto L_0x0083
            int r6 = r3.C
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto L_0x00ad
            goto L_0x00b0
        L_0x0083:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.C
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x00af
            goto L_0x00ad
        L_0x0093:
            boolean r4 = r3.f2274R
            if (r4 == 0) goto L_0x0098
            goto L_0x00af
        L_0x0098:
            int r4 = r5.getTop()
            int r0 = r3.U
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.C
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x00af
        L_0x00ad:
            r0 = r7
            goto L_0x00b0
        L_0x00af:
            r0 = r6
        L_0x00b0:
            r4 = 0
            r3.n(r5, r0, r4)
            r3.f2283j = r4
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final void h(int i) {
        boolean z = true;
        if (i == -1) {
            if (!this.f2287v) {
                this.f2287v = true;
            }
            z = false;
        } else {
            if (this.f2287v || this.f2285v != i) {
                this.f2287v = false;
                this.f2285v = Math.max(0, i);
            }
            z = false;
        }
        if (z) {
            d();
        }
    }

    public final int i() {
        int i;
        int i2;
        int i3;
        if (this.f2287v) {
            i = Math.min(Math.max(this.f2278c, this.y - ((this.g * 9) / 16)), this.j);
            i2 = this.Z;
        } else if (!this.f2279c && !this.f2281e && (i3 = this.L) > 0) {
            return Math.max(this.f2285v, i3 + this.f2280e);
        } else {
            i = this.f2285v;
            i2 = this.Z;
        }
        return i + i2;
    }

    @Override // defpackage.knf
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.P = 0;
        this.f2283j = false;
        return (i & 2) != 0;
    }

    @Override // defpackage.knf
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(K(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.X, marginLayoutParams.width), K(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.O, marginLayoutParams.height));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r4 != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r1.g(r4.getLeft(), r0) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            int r0 = r3.Y(r5)
            fen r1 = r3.f2269R
            r2 = 0
            if (r1 == 0) goto L_0x0033
            if (r6 == 0) goto L_0x0016
            int r4 = r4.getLeft()
            boolean r4 = r1.g(r4, r0)
            if (r4 == 0) goto L_0x0033
            goto L_0x0032
        L_0x0016:
            int r6 = r4.getLeft()
            r1.f3480R = r4
            r4 = -1
            r1.c = r4
            boolean r4 = r1.m(r6, r0, r2, r2)
            if (r4 != 0) goto L_0x0030
            int r6 = r1.f3478R
            if (r6 != 0) goto L_0x0030
            android.view.View r6 = r1.f3480R
            if (r6 == 0) goto L_0x0030
            r6 = 0
            r1.f3480R = r6
        L_0x0030:
            if (r4 == 0) goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            if (r2 == 0) goto L_0x0042
            r4 = 2
            r3.u(r4)
            r3.A(r5)
            EJ r3 = r3.f2263R
            r3.R(r5)
            goto L_0x0045
        L_0x0042:
            r3.u(r5)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.n(android.view.View, int, boolean):void");
    }

    public final void t() {
        int i = i();
        if (this.f2274R) {
            this.C = Math.max(this.y - i, this.H);
        } else {
            this.C = this.y - i;
        }
    }

    public final void u(int i) {
        if (this.N != i) {
            this.N = i;
            WeakReference weakReference = this.f2270R;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i == 3) {
                    S(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    S(false);
                }
                A(i);
                if (this.f2271R.size() <= 0) {
                    Q();
                } else {
                    jQ.Y(this.f2271R.get(0));
                    throw null;
                }
            }
        }
    }

    @Override // defpackage.knf
    public final boolean x(View view) {
        WeakReference weakReference = this.f2286v;
        return (weakReference == null || view != weakReference.get() || this.N == 3) ? false : true;
    }

    @Override // defpackage.knf
    public final boolean y(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.N;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        fen fen = this.f2269R;
        if (fen != null && (this.f2259N || i == 1)) {
            fen.H(motionEvent);
        }
        if (actionMasked == 0) {
            this.t = -1;
            VelocityTracker velocityTracker = this.f2266R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2266R = null;
            }
        }
        if (this.f2266R == null) {
            this.f2266R = VelocityTracker.obtain();
        }
        this.f2266R.addMovement(motionEvent);
        if (this.f2269R != null && (this.f2259N || this.N == 1)) {
            z = true;
        }
        if (z && actionMasked == 2 && !this.f2261P) {
            float abs = Math.abs(((float) this.i) - motionEvent.getY());
            fen fen2 = this.f2269R;
            if (abs > ((float) fen2.f3491v)) {
                fen2.v(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2261P;
    }

    public final boolean z(View view, float f) {
        if (this.f2256C) {
            return true;
        }
        if (view.getTop() < this.C) {
            return false;
        }
        return Math.abs(((f * this.e) + ((float) view.getTop())) - ((float) this.C)) / ((float) i()) > 0.5f;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        int i;
        this.f2262R = 0;
        this.f2274R = true;
        this.X = -1;
        this.O = -1;
        this.f2263R = new EJ(this);
        this.v = 0.5f;
        this.c = -1.0f;
        this.f2259N = true;
        this.N = 4;
        this.e = 0.1f;
        this.f2271R = new ArrayList();
        this.V = -1;
        this.f2273R = new u7(this);
        this.f2280e = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hDC.m);
        int i2 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2265R = lTs.m(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(20)) {
            this.f2268R = new dOE(dOE.v(context, attributeSet, R.attr.bottomSheetStyle, 2132017975));
        }
        if (this.f2268R != null) {
            c18 c18 = new c18(this.f2268R);
            this.f2267R = c18;
            c18.x(context);
            ColorStateList colorStateList = this.f2265R;
            if (colorStateList != null) {
                this.f2267R.C(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f2267R.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2264R = ofFloat;
        ofFloat.setDuration(500L);
        this.f2264R.addUpdateListener(new e4(1, this));
        this.c = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.X = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.O = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i = peekValue.data) != -1) {
            h(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            h(i);
        }
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        if (this.f2275U != z) {
            this.f2275U = z;
            if (!z && this.N == 5) {
                I(4);
            }
            Q();
        }
        this.f2279c = obtainStyledAttributes.getBoolean(12, false);
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2274R != z2) {
            this.f2274R = z2;
            if (this.f2270R != null) {
                t();
            }
            u((!this.f2274R || this.N != 6) ? this.N : i2);
            Q();
        }
        this.f2256C = obtainStyledAttributes.getBoolean(11, false);
        this.f2259N = obtainStyledAttributes.getBoolean(4, true);
        this.f2262R = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.v = f;
        if (this.f2270R != null) {
            this.U = (int) ((1.0f - f) * ((float) this.y));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset >= 0) {
                this.x = dimensionPixelOffset;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i3 = peekValue2.data;
            if (i3 >= 0) {
                this.x = i3;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f2281e = obtainStyledAttributes.getBoolean(16, false);
        this.f2276X = obtainStyledAttributes.getBoolean(17, false);
        this.f2260O = obtainStyledAttributes.getBoolean(18, false);
        this.f2258L = obtainStyledAttributes.getBoolean(19, true);
        this.f2277Z = obtainStyledAttributes.getBoolean(13, false);
        this.f2284m = obtainStyledAttributes.getBoolean(14, false);
        this.f2288x = obtainStyledAttributes.getBoolean(15, false);
        obtainStyledAttributes.recycle();
        this.R = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
