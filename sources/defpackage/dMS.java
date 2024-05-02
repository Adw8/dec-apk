package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: dMS  reason: default package */
/* loaded from: classes.dex */
public abstract class dMS extends G5 {

    /* renamed from: R  reason: collision with other field name */
    public final View f2574R;

    /* renamed from: R  reason: collision with other field name */
    public final AccessibilityManager f2575R;

    /* renamed from: R  reason: collision with other field name */
    public f6P f2576R;
    public static final Rect e = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final dq R = new dq((Object) null);

    /* renamed from: R  reason: collision with other field name */
    public static final hw1 f2571R = new hw1();

    /* renamed from: R  reason: collision with other field name */
    public final Rect f2573R = new Rect();

    /* renamed from: v  reason: collision with other field name */
    public final Rect f2579v = new Rect();

    /* renamed from: c  reason: collision with other field name */
    public final Rect f2578c = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public final int[] f2577R = new int[2];

    /* renamed from: R  reason: collision with other field name */
    public int f2572R = Integer.MIN_VALUE;
    public int v = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;

    public dMS(View view) {
        if (view != null) {
            this.f2574R = view;
            this.f2575R = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap weakHashMap = of5.f6887R;
            if (mHC.c(view) == 0) {
                mHC.t(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final boolean C(MotionEvent motionEvent) {
        int i;
        if (!this.f2575R.isEnabled() || !this.f2575R.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int N = N(motionEvent.getX(), motionEvent.getY());
            int i2 = this.c;
            if (i2 != N) {
                this.c = N;
                J(N, 128);
                J(i2, 256);
            }
            return N != Integer.MIN_VALUE;
        } else if (action != 10 || (i = this.c) == Integer.MIN_VALUE) {
            return false;
        } else {
            if (i != Integer.MIN_VALUE) {
                this.c = Integer.MIN_VALUE;
                J(Integer.MIN_VALUE, 128);
                J(i, 256);
            }
            return true;
        }
    }

    public final AccessibilityEvent H(int i, int i2) {
        if (i != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            jG y = y(i);
            obtain.getText().add(y.O());
            obtain.setContentDescription(y.f4895R.getContentDescription());
            obtain.setScrollable(y.f4895R.isScrollable());
            obtain.setPassword(y.f4895R.isPassword());
            obtain.setEnabled(y.f4895R.isEnabled());
            obtain.setChecked(y.f4895R.isChecked());
            if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                obtain.setClassName(y.f4895R.getClassName());
                Ox.R(obtain, this.f2574R, i);
                obtain.setPackageName(this.f2574R.getContext().getPackageName());
                return obtain;
            }
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        this.f2574R.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    public final void J(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f2575R.isEnabled() && (parent = this.f2574R.getParent()) != null) {
            parent.requestSendAccessibilityEvent(this.f2574R, H(i, i2));
        }
    }

    public final boolean K(int i) {
        int i2;
        if ((!this.f2574R.isFocused() && !this.f2574R.requestFocus()) || (i2 = this.v) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            x(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.v = i;
        o(i, true);
        J(i, 8);
        return true;
    }

    public abstract int N(float f, float f2);

    public abstract void P(ArrayList arrayList);

    public final jG U(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        jG jGVar = new jG(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        jGVar.L("android.view.View");
        Rect rect = e;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f2574R;
        jGVar.R = -1;
        obtain.setParent(view);
        V(i, jGVar);
        if (jGVar.O() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        jGVar.e(this.f2579v);
        if (!this.f2579v.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(this.f2574R.getContext().getPackageName());
                View view2 = this.f2574R;
                jGVar.v = i;
                obtain.setSource(view2, i);
                boolean z = false;
                if (this.f2572R == i) {
                    obtain.setAccessibilityFocused(true);
                    jGVar.R(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    jGVar.R(64);
                }
                boolean z2 = this.v == i;
                if (z2) {
                    jGVar.R(2);
                } else if (obtain.isFocusable()) {
                    jGVar.R(1);
                }
                obtain.setFocused(z2);
                this.f2574R.getLocationOnScreen(this.f2577R);
                obtain.getBoundsInScreen(this.f2573R);
                if (this.f2573R.equals(rect)) {
                    jGVar.e(this.f2573R);
                    if (jGVar.R != -1) {
                        jG jGVar2 = new jG(AccessibilityNodeInfo.obtain());
                        for (int i2 = jGVar.R; i2 != -1; i2 = jGVar2.R) {
                            View view3 = this.f2574R;
                            jGVar2.R = -1;
                            jGVar2.f4895R.setParent(view3, -1);
                            jGVar2.f4895R.setBoundsInParent(e);
                            V(i2, jGVar2);
                            jGVar2.e(this.f2579v);
                            Rect rect2 = this.f2573R;
                            Rect rect3 = this.f2579v;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        jGVar2.f4895R.recycle();
                    }
                    this.f2573R.offset(this.f2577R[0] - this.f2574R.getScrollX(), this.f2577R[1] - this.f2574R.getScrollY());
                }
                if (this.f2574R.getLocalVisibleRect(this.f2578c)) {
                    this.f2578c.offset(this.f2577R[0] - this.f2574R.getScrollX(), this.f2577R[1] - this.f2574R.getScrollY());
                    if (this.f2573R.intersect(this.f2578c)) {
                        jGVar.f4895R.setBoundsInScreen(this.f2573R);
                        Rect rect4 = this.f2573R;
                        if (rect4 != null && !rect4.isEmpty() && this.f2574R.getWindowVisibility() == 0) {
                            ViewParent parent = this.f2574R.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view4 = (View) parent;
                                    if (view4.getAlpha() <= 0.0f || view4.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view4.getParent();
                                } else if (parent != null) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            jGVar.f4895R.setVisibleToUser(true);
                        }
                    }
                }
                return jGVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void V(int i, jG jGVar);

    @Override // defpackage.G5
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // defpackage.G5
    public final void e(View view, jG jGVar) {
        ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
        i(jGVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013f, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x0141;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x014b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(int r20, android.graphics.Rect r21) {
        /*
        // Method dump skipped, instructions count: 490
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dMS.g(int, android.graphics.Rect):boolean");
    }

    public void i(jG jGVar) {
    }

    public final void j(int i) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f2575R.isEnabled() && (parent = this.f2574R.getParent()) != null) {
            AccessibilityEvent H = H(i, 2048);
            Nr.v(H, 0);
            parent.requestSendAccessibilityEvent(this.f2574R, H);
        }
    }

    public void o(int i, boolean z) {
    }

    public abstract boolean t(int i, int i2, Bundle bundle);

    @Override // defpackage.G5
    public final Zz v(View view) {
        if (this.f2576R == null) {
            this.f2576R = new f6P(this);
        }
        return this.f2576R;
    }

    public final boolean x(int i) {
        if (this.v != i) {
            return false;
        }
        this.v = Integer.MIN_VALUE;
        o(i, false);
        J(i, 8);
        return true;
    }

    public final jG y(int i) {
        if (i != -1) {
            return U(i);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f2574R);
        jG jGVar = new jG(obtain);
        View view = this.f2574R;
        WeakHashMap weakHashMap = of5.f6887R;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        P(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                jGVar.f4895R.addChild(this.f2574R, ((Integer) arrayList.get(i2)).intValue());
            }
            return jGVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }
}
