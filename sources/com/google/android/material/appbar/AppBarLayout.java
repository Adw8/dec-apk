package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import dev.kdrag0n.virtcontainer.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements kkj {
    public ValueAnimator R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f2213R;

    /* renamed from: R  reason: collision with other field name */
    public Behavior f2214R;

    /* renamed from: R  reason: collision with other field name */
    public gWM f2215R;

    /* renamed from: R  reason: collision with other field name */
    public WeakReference f2216R;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f2217R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2218R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f2219R;

    /* renamed from: X  reason: collision with other field name */
    public boolean f2220X;
    public boolean c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f2221e;
    public int m;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2222v;
    public int X = -1;
    public int O = -1;
    public int L = -1;
    public int Z = 0;
    public final ArrayList v = new ArrayList();

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends en5 {
        public int O;
        public ValueAnimator R;

        /* renamed from: R  reason: collision with other field name */
        public g f2223R;

        /* renamed from: R  reason: collision with other field name */
        public WeakReference f2224R;
        public int X;
        public boolean v;

        public BaseBehavior() {
        }

        public static View Y(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof n9d) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void n(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            L_0x000a:
                r4 = 0
                if (r3 >= r1) goto L_0x0021
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L_0x001e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L_0x001e
                goto L_0x0022
            L_0x001e:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0021:
                r5 = r4
            L_0x0022:
                r0 = 1
                if (r5 == 0) goto L_0x005e
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                Rn r1 = (defpackage.Rn) r1
                int r1 = r1.R
                r3 = r1 & 1
                if (r3 == 0) goto L_0x005e
                java.util.WeakHashMap r3 = defpackage.of5.f6887R
                int r3 = defpackage.mHC.e(r5)
                if (r10 <= 0) goto L_0x004b
                r10 = r1 & 12
                if (r10 == 0) goto L_0x004b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005e
                goto L_0x005c
            L_0x004b:
                r10 = r1 & 2
                if (r10 == 0) goto L_0x005e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005e
            L_0x005c:
                r9 = r0
                goto L_0x005f
            L_0x005e:
                r9 = r2
            L_0x005f:
                boolean r10 = r8.f2220X
                if (r10 == 0) goto L_0x006b
                android.view.View r9 = Y(r7)
                boolean r9 = r8.O(r9)
            L_0x006b:
                boolean r9 = r8.X(r9)
                if (r11 != 0) goto L_0x00b3
                if (r9 == 0) goto L_0x00b6
                piu r9 = r7.f1269R
                java.lang.Object r9 = r9.f7203v
                cE0 r9 = (defpackage.cE0) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r10 = r7.c
                r10.clear()
                if (r9 == 0) goto L_0x008b
                java.util.ArrayList r10 = r7.c
                r10.addAll(r9)
            L_0x008b:
                java.util.ArrayList r7 = r7.c
                int r9 = r7.size()
                r10 = r2
            L_0x0092:
                if (r10 >= r9) goto L_0x00b1
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                aRL r11 = (defpackage.aRL) r11
                knf r11 = r11.f880R
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L_0x00ae
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.c
                if (r7 == 0) goto L_0x00b1
                r2 = r0
                goto L_0x00b1
            L_0x00ae:
                int r10 = r10 + 1
                goto L_0x0092
            L_0x00b1:
                if (r2 == 0) goto L_0x00b6
            L_0x00b3:
                r8.jumpDrawablesToCurrentState()
            L_0x00b6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.n(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // defpackage.knf
        public final /* bridge */ /* synthetic */ void H(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            h(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        public final g I(Parcelable parcelable, AppBarLayout appBarLayout) {
            int t = t();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + t;
                if (childAt.getTop() + t <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = OG.R;
                    }
                    g gVar = new g(parcelable);
                    boolean z2 = t == 0;
                    gVar.v = z2;
                    gVar.f2249R = !z2 && (-t) >= appBarLayout.getTotalScrollRange();
                    gVar.e = i;
                    WeakHashMap weakHashMap = of5.f6887R;
                    if (bottom == appBarLayout.getTopInset() + mHC.e(childAt)) {
                        z = true;
                    }
                    gVar.c = z;
                    gVar.R = ((float) bottom) / ((float) childAt.getHeight());
                    return gVar;
                }
            }
            return null;
        }

        public final void J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(V() - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            int V = V();
            if (V == i) {
                ValueAnimator valueAnimator = this.R;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.R.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.R;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.R = valueAnimator3;
                valueAnimator3.setInterpolator(My.f297R);
                this.R.addUpdateListener(new d(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.R.setDuration((long) Math.min(round, 600));
            this.R.setIntValues(V, i);
            this.R.start();
        }

        @Override // defpackage.knf
        public final void N(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof g) {
                g gVar = this.f2223R;
                this.f2223R = (g) parcelable;
                return;
            }
            this.f2223R = null;
        }

        @Override // defpackage.knf
        public final Parcelable P(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            g I = I(absSavedState, (AppBarLayout) view);
            return I == null ? absSavedState : I;
        }

        @Override // defpackage.knf
        public final void U(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = o(coordinatorLayout, appBarLayout, V() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i3 == 0) {
                z(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.en5
        public final int V() {
            return t() + this.X;
        }

        @Override // defpackage.ftS, defpackage.knf
        public final boolean Z(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.Z(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            g gVar = this.f2223R;
            if (gVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i3 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            J(coordinatorLayout, appBarLayout, i3);
                        } else {
                            K(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            J(coordinatorLayout, appBarLayout, 0);
                        } else {
                            K(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (gVar.f2249R) {
                K(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (gVar.v) {
                K(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(gVar.e);
                int i4 = -childAt.getBottom();
                if (this.f2223R.c) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    i2 = appBarLayout.getTopInset() + mHC.e(childAt) + i4;
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f2223R.R) + i4;
                }
                K(coordinatorLayout, appBarLayout, i2);
            }
            appBarLayout.Z = 0;
            this.f2223R = null;
            int X = iTI.X(t(), -appBarLayout.getTotalScrollRange(), 0);
            hJL hjl = ((ftS) this).f3575R;
            if (hjl != null) {
                hjl.v(X);
            } else {
                ((ftS) this).R = X;
            }
            n(coordinatorLayout, appBarLayout, t(), 0, true);
            appBarLayout.c(t());
            z(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.knf
        public final void g(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.O == 0 || i == 1) {
                u(coordinatorLayout, appBarLayout);
                if (appBarLayout.f2220X) {
                    appBarLayout.X(appBarLayout.O(view2));
                }
            }
            this.f2224R = new WeakReference(view2);
        }

        public final void h(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i3 = -appBarLayout.getTotalScrollRange();
                    i2 = appBarLayout.getDownNestedPreScrollRange() + i3;
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    i2 = 0;
                }
                if (i3 != i2) {
                    iArr[1] = o(coordinatorLayout, appBarLayout, V() - i, i3, i2);
                }
            }
            if (appBarLayout.f2220X) {
                appBarLayout.X(appBarLayout.O(view));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            if (((r4.getTotalScrollRange() != 0) && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L_0x002d;
         */
        @Override // defpackage.knf
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                r6 = r6 & 2
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L_0x002c
                boolean r6 = r4.f2220X
                if (r6 != 0) goto L_0x002d
                int r6 = r4.getTotalScrollRange()
                if (r6 == 0) goto L_0x0014
                r6 = r0
                goto L_0x0015
            L_0x0014:
                r6 = r1
            L_0x0015:
                if (r6 == 0) goto L_0x0028
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L_0x0028
                r3 = r0
                goto L_0x0029
            L_0x0028:
                r3 = r1
            L_0x0029:
                if (r3 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r0 = r1
            L_0x002d:
                if (r0 == 0) goto L_0x0036
                android.animation.ValueAnimator r3 = r2.R
                if (r3 == 0) goto L_0x0036
                r3.cancel()
            L_0x0036:
                r3 = 0
                r2.f2224R = r3
                r2.O = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.j(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int):boolean");
        }

        @Override // defpackage.knf
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((aRL) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.y(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.en5
        public final int o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            boolean z;
            List list;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int V = V();
            int i6 = 0;
            if (i2 == 0 || V < i2 || V > i3) {
                this.X = 0;
            } else {
                int X = iTI.X(i, i2, i3);
                if (V != X) {
                    if (appBarLayout.f2218R) {
                        int abs = Math.abs(X);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            Rn rn = (Rn) childAt.getLayoutParams();
                            Interpolator interpolator = rn.f499R;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = rn.R;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) rn).topMargin + ((LinearLayout.LayoutParams) rn).bottomMargin + 0;
                                    if ((i8 & 2) != 0) {
                                        WeakHashMap weakHashMap = of5.f6887R;
                                        i5 -= mHC.e(childAt);
                                    }
                                } else {
                                    i5 = 0;
                                }
                                WeakHashMap weakHashMap2 = of5.f6887R;
                                if (mHC.v(childAt)) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f = (float) i5;
                                    i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f) * f)) * Integer.signum(X);
                                }
                            }
                        }
                    }
                    i4 = X;
                    hJL hjl = ((ftS) this).f3575R;
                    if (hjl != null) {
                        z = hjl.v(i4);
                    } else {
                        ((ftS) this).R = i4;
                        z = false;
                    }
                    i6 = V - X;
                    this.X = X - i4;
                    int i9 = 1;
                    if (z) {
                        for (int i10 = 0; i10 < appBarLayout.getChildCount(); i10++) {
                            Rn rn2 = (Rn) appBarLayout.getChildAt(i10).getLayoutParams();
                            h5 h5Var = rn2.f500R;
                            if (!(h5Var == null || (rn2.R & 1) == 0)) {
                                View childAt2 = appBarLayout.getChildAt(i10);
                                Rect rect = (Rect) h5Var.R;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = ((float) ((Rect) h5Var.R).top) - Math.abs((float) t());
                                float f2 = 0.0f;
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / ((float) ((Rect) h5Var.R).height()));
                                    if (abs3 >= 0.0f) {
                                        f2 = abs3 > 1.0f ? 1.0f : abs3;
                                    }
                                    float f3 = 1.0f - f2;
                                    float height = (-abs2) - ((((float) ((Rect) h5Var.R).height()) * 0.3f) * (1.0f - (f3 * f3)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect((Rect) h5Var.v);
                                    ((Rect) h5Var.v).offset(0, (int) (-height));
                                    WeakHashMap weakHashMap3 = of5.f6887R;
                                    pco.c(childAt2, (Rect) h5Var.v);
                                } else {
                                    WeakHashMap weakHashMap4 = of5.f6887R;
                                    pco.c(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!z && appBarLayout.f2218R && (list = (List) ((cE0) coordinatorLayout.f1269R.f7203v).getOrDefault(appBarLayout, null)) != null && !list.isEmpty()) {
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            View view2 = (View) list.get(i11);
                            knf knf = ((aRL) view2.getLayoutParams()).f880R;
                            if (knf != null) {
                                knf.e(view2, appBarLayout);
                            }
                        }
                    }
                    appBarLayout.c(t());
                    if (X < V) {
                        i9 = -1;
                    }
                    n(coordinatorLayout, appBarLayout, X, i9, false);
                }
            }
            z(coordinatorLayout, appBarLayout);
            return i6;
        }

        public final void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            boolean z;
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int V = V() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                z = true;
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                Rn rn = (Rn) childAt.getLayoutParams();
                if ((rn.R & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) rn).topMargin;
                    bottom += ((LinearLayout.LayoutParams) rn).bottomMargin;
                }
                int i2 = -V;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                Rn rn2 = (Rn) childAt2.getLayoutParams();
                int i3 = rn2.R;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap weakHashMap = of5.f6887R;
                        if (mHC.v(appBarLayout) && mHC.v(childAt2)) {
                            i4 -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap weakHashMap2 = of5.f6887R;
                        i5 += mHC.e(childAt2);
                    } else {
                        if ((i3 & 5) == 5) {
                            WeakHashMap weakHashMap3 = of5.f6887R;
                            int e = mHC.e(childAt2) + i5;
                            if (V < e) {
                                i4 = e;
                            } else {
                                i5 = e;
                            }
                        }
                    }
                    if ((i3 & 32) != 32) {
                        z = false;
                    }
                    if (z) {
                        i4 += ((LinearLayout.LayoutParams) rn2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) rn2).bottomMargin;
                    }
                    if (V < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    J(coordinatorLayout, appBarLayout, iTI.X(i4 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        public final void z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View view;
            boolean z;
            of5.e(coordinatorLayout, Ex.e.R());
            boolean z2 = false;
            of5.c(coordinatorLayout, 0);
            of5.e(coordinatorLayout, Ex.X.R());
            of5.c(coordinatorLayout, 0);
            if (appBarLayout.getTotalScrollRange() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                int i = 0;
                while (true) {
                    view = null;
                    if (i >= childCount) {
                        break;
                    }
                    view = coordinatorLayout.getChildAt(i);
                    if (((aRL) view.getLayoutParams()).f880R instanceof ScrollingViewBehavior) {
                        break;
                    }
                    i++;
                }
                if (view != null) {
                    int childCount2 = appBarLayout.getChildCount();
                    int i2 = 0;
                    while (true) {
                        z2 = true;
                        if (i2 >= childCount2) {
                            z = false;
                            break;
                        } else if (((Rn) appBarLayout.getChildAt(i2).getLayoutParams()).R != 0) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (z) {
                        if (!(hpL.R(coordinatorLayout) != null)) {
                            of5.O(coordinatorLayout, new c(this));
                        }
                        if (V() != (-appBarLayout.getTotalScrollRange())) {
                            of5.X(coordinatorLayout, Ex.e, new e(appBarLayout, false));
                            z2 = true;
                        }
                        if (V() != 0) {
                            if (view.canScrollVertically(-1)) {
                                int i3 = -appBarLayout.getDownNestedPreScrollRange();
                                if (i3 != 0) {
                                    of5.X(coordinatorLayout, Ex.X, new Y(this, coordinatorLayout, appBarLayout, view, i3));
                                }
                            } else {
                                of5.X(coordinatorLayout, Ex.X, new e(appBarLayout, true));
                            }
                            this.v = z2;
                        }
                        this.v = z2;
                    }
                }
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends n7N {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout o(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.knf
        public final boolean C(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout o = o(coordinatorLayout.x(view));
            if (o != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = ((n7N) this).R;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    o.e(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.knf
        public final void X(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                of5.e(coordinatorLayout, Ex.e.R());
                of5.c(coordinatorLayout, 0);
                of5.e(coordinatorLayout, Ex.X.R());
                of5.c(coordinatorLayout, 0);
                of5.O(coordinatorLayout, null);
            }
        }

        @Override // defpackage.knf
        public final boolean e(View view, View view2) {
            knf knf = ((aRL) view2.getLayoutParams()).f880R;
            if (knf instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) knf).X) + ((n7N) this).v) - V(view2);
                WeakHashMap weakHashMap = of5.f6887R;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f2220X) {
                return false;
            }
            appBarLayout.X(appBarLayout.O(view));
            return false;
        }

        @Override // defpackage.knf
        public final boolean v(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hDC.S);
            this.c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.appBarLayoutStyle, 2132017973), attributeSet, R.attr.appBarLayoutStyle);
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray w = aH9.w(context3, attributeSet, gvP.H, R.attr.appBarLayoutStyle, 2132017973, new int[0]);
        try {
            if (w.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, w.getResourceId(0, 0)));
            }
            w.recycle();
            TypedArray w2 = aH9.w(context2, attributeSet, hDC.L, R.attr.appBarLayoutStyle, 2132017973, new int[0]);
            Drawable drawable = w2.getDrawable(0);
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.g(this, drawable);
            if (getBackground() instanceof ColorDrawable) {
                c18 c18 = new c18();
                c18.C(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
                c18.x(context2);
                mHC.g(this, c18);
            }
            if (w2.hasValue(4)) {
                e(w2.getBoolean(4, false), false, false);
            }
            if (w2.hasValue(3)) {
                gvP.A(this, (float) w2.getDimensionPixelSize(3, 0));
            }
            if (w2.hasValue(2)) {
                setKeyboardNavigationCluster(w2.getBoolean(2, false));
            }
            if (w2.hasValue(1)) {
                setTouchscreenBlocksFocus(w2.getBoolean(1, false));
            }
            this.f2220X = w2.getBoolean(5, false);
            this.m = w2.getResourceId(6, -1);
            setStatusBarForeground(w2.getDrawable(7));
            w2.recycle();
            m18.V(this, new qy(2, this));
        } catch (Throwable th) {
            w.recycle();
            throw th;
        }
    }

    public static Rn R(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new Rn((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new Rn((ViewGroup.MarginLayoutParams) layoutParams) : new Rn(layoutParams);
    }

    public final boolean L() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap weakHashMap = of5.f6887R;
        return !mHC.v(childAt);
    }

    public final boolean O(View view) {
        int i;
        View view2 = null;
        if (this.f2216R == null && (i = this.m) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.m);
            }
            if (findViewById != null) {
                this.f2216R = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.f2216R;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean X(boolean z) {
        if (!(!this.f2222v) || this.f2221e == z) {
            return false;
        }
        this.f2221e = z;
        refreshDrawableState();
        if (!this.f2220X || !(getBackground() instanceof c18)) {
            return true;
        }
        c18 c18 = (c18) getBackground();
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.R = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.R.setInterpolator(My.f298R);
        this.R.addUpdateListener(new y7(this, c18));
        this.R.start();
        return true;
    }

    public final void c(int i) {
        this.e = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.H(this);
        }
        ArrayList arrayList = this.f2217R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                x3 x3Var = (x3) this.f2217R.get(i2);
                if (x3Var != null) {
                    y_ y_Var = (y_) x3Var;
                    CollapsingToolbarLayout collapsingToolbarLayout = y_Var.R;
                    collapsingToolbarLayout.H = i;
                    gWM gwm = collapsingToolbarLayout.f2233R;
                    int O = gwm != null ? gwm.O() : 0;
                    int childCount = y_Var.R.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = y_Var.R.getChildAt(i3);
                        F0 f0 = (F0) childAt.getLayoutParams();
                        hJL v = CollapsingToolbarLayout.v(childAt);
                        int i4 = f0.f113R;
                        if (i4 == 1) {
                            CollapsingToolbarLayout collapsingToolbarLayout2 = y_Var.R;
                            collapsingToolbarLayout2.getClass();
                            v.v(iTI.X(-i, 0, ((collapsingToolbarLayout2.getHeight() - CollapsingToolbarLayout.v(childAt).R) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((F0) childAt.getLayoutParams())).bottomMargin));
                        } else if (i4 == 2) {
                            v.v(Math.round(((float) (-i)) * f0.R));
                        }
                    }
                    y_Var.R.e();
                    CollapsingToolbarLayout collapsingToolbarLayout3 = y_Var.R;
                    if (collapsingToolbarLayout3.v != null && O > 0) {
                        WeakHashMap weakHashMap2 = of5.f6887R;
                        mHC.H(collapsingToolbarLayout3);
                    }
                    int height = y_Var.R.getHeight();
                    CollapsingToolbarLayout collapsingToolbarLayout4 = y_Var.R;
                    WeakHashMap weakHashMap3 = of5.f6887R;
                    int e = (height - mHC.e(collapsingToolbarLayout4)) - O;
                    int scrimVisibleHeightTrigger = height - y_Var.R.getScrimVisibleHeightTrigger();
                    QL ql = y_Var.R.f2226R;
                    float f = (float) e;
                    float min = Math.min(1.0f, ((float) scrimVisibleHeightTrigger) / f);
                    ql.v = min;
                    ql.c = jQ.v(1.0f, min, 0.5f, min);
                    CollapsingToolbarLayout collapsingToolbarLayout5 = y_Var.R;
                    QL ql2 = collapsingToolbarLayout5.f2226R;
                    ql2.f432R = collapsingToolbarLayout5.H + e;
                    ql2.j(((float) Math.abs(i)) / f);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Rn;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2213R != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.e));
            this.f2213R.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2213R;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.Z = i2 | i;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new Rn();
    }

    @Override // defpackage.kkj
    public knf getBehavior() {
        Behavior behavior = new Behavior();
        this.f2214R = behavior;
        return behavior;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.O
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            int r0 = r0 + -1
            r1 = 0
            r2 = r1
        L_0x000e:
            if (r0 < 0) goto L_0x0069
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x001d
            goto L_0x0066
        L_0x001d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            Rn r4 = (defpackage.Rn) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.R
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L_0x0063
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L_0x003f
            java.util.WeakHashMap r4 = defpackage.of5.f6887R
            int r4 = defpackage.mHC.e(r3)
        L_0x003d:
            int r4 = r4 + r7
            goto L_0x004e
        L_0x003f:
            r4 = r6 & 2
            if (r4 == 0) goto L_0x004c
            java.util.WeakHashMap r4 = defpackage.of5.f6887R
            int r4 = defpackage.mHC.e(r3)
            int r4 = r5 - r4
            goto L_0x003d
        L_0x004c:
            int r4 = r7 + r5
        L_0x004e:
            if (r0 != 0) goto L_0x0061
            java.util.WeakHashMap r6 = defpackage.of5.f6887R
            boolean r3 = defpackage.mHC.v(r3)
            if (r3 == 0) goto L_0x0061
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L_0x0061:
            int r2 = r2 + r4
            goto L_0x0066
        L_0x0063:
            if (r2 <= 0) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0069:
            int r0 = java.lang.Math.max(r1, r2)
            r9.O = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.L;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                Rn rn = (Rn) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) rn).topMargin + ((LinearLayout.LayoutParams) rn).bottomMargin + childAt.getMeasuredHeight();
                int i4 = rn.R;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    i3 -= mHC.e(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.L = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = of5.f6887R;
        int e = mHC.e(this);
        if (e == 0) {
            int childCount = getChildCount();
            e = childCount >= 1 ? mHC.e(getChildAt(childCount - 1)) : 0;
            if (e == 0) {
                return getHeight() / 3;
            }
        }
        return (e * 2) + topInset;
    }

    public int getPendingAction() {
        return this.Z;
    }

    public Drawable getStatusBarForeground() {
        return this.f2213R;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        gWM gwm = this.f2215R;
        if (gwm != null) {
            return gwm.O();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.X;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                Rn rn = (Rn) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = rn.R;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 = measuredHeight + ((LinearLayout.LayoutParams) rn).topMargin + ((LinearLayout.LayoutParams) rn).bottomMargin + i3;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    if (mHC.v(childAt)) {
                        i3 -= getTopInset();
                    }
                }
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap2 = of5.f6887R;
                    i3 -= mHC.e(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.X = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof c18) {
            hDC.k(this, (c18) background);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public final int[] onCreateDrawableState(int i) {
        if (this.f2219R == null) {
            this.f2219R = new int[4];
        }
        int[] iArr = this.f2219R;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.c;
        iArr[0] = z ? R.attr.state_liftable : -2130904058;
        iArr[1] = (!z || !this.f2221e) ? -2130904059 : R.attr.state_lifted;
        iArr[2] = z ? R.attr.state_collapsible : -2130904054;
        iArr[3] = (!z || !this.f2221e) ? -2130904053 : R.attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f2216R;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2216R = null;
    }

    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = of5.f6887R;
        boolean z3 = true;
        if (mHC.v(this) && L()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        v();
        this.f2218R = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((Rn) getChildAt(i5).getLayoutParams()).f499R != null) {
                this.f2218R = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f2213R;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f2222v) {
            if (!this.f2220X) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount3) {
                        z2 = false;
                        break;
                    }
                    int i7 = ((Rn) getChildAt(i6).getLayoutParams()).R;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        z2 = true;
                        break;
                    }
                    i6++;
                }
                if (!z2) {
                    z3 = false;
                }
            }
            if (this.c != z3) {
                this.c = z3;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = of5.f6887R;
            if (mHC.v(this) && L()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = iTI.X(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        v();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof c18) {
            ((c18) background).U(f);
        }
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = of5.f6887R;
        e(z, d6y.c(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f2220X = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.m = -1;
        if (view == null) {
            WeakReference weakReference = this.f2216R;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2216R = null;
            return;
        }
        this.f2216R = new WeakReference(view);
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.m = i;
        WeakReference weakReference = this.f2216R;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2216R = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f2222v = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f2213R;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2213R = drawable3;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2213R.setState(getDrawableState());
                }
                Drawable drawable4 = this.f2213R;
                WeakHashMap weakHashMap = of5.f6887R;
                f4J.v(drawable4, eHQ.e(this));
                this.f2213R.setVisible(getVisibility() == 0, false);
                this.f2213R.setCallback(this);
            }
            if (this.f2213R != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap weakHashMap2 = of5.f6887R;
            mHC.H(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(aH9.p(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        gvP.A(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2213R;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public final void v() {
        Behavior behavior = this.f2214R;
        g I = (behavior == null || this.X == -1 || this.Z != 0) ? null : behavior.I(OG.R, this);
        this.X = -1;
        this.O = -1;
        this.L = -1;
        if (I != null) {
            Behavior behavior2 = this.f2214R;
            if (((BaseBehavior) behavior2).f2223R == null) {
                ((BaseBehavior) behavior2).f2223R = I;
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2213R;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams mo12generateDefaultLayoutParams() {
        return new Rn();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new Rn(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams mo13generateLayoutParams(AttributeSet attributeSet) {
        return new Rn(getContext(), attributeSet);
    }
}
