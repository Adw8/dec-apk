package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* renamed from: lYU  reason: default package */
/* loaded from: classes.dex */
public abstract class lYU extends ViewGroup {
    public int H;
    public int O;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f5767R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f5769R;
    public int U;
    public int Z;
    public int e;
    public int m;
    public boolean v;

    /* renamed from: v  reason: collision with other field name */
    public int[] f5770v;
    public int x;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5768R = true;
    public int X = 0;
    public int L = 8388659;

    public lYU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = -1;
        int[] iArr = iTI.N;
        CV h = CV.h(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = (TypedArray) h.v;
        WeakHashMap weakHashMap = of5.f6887R;
        hpL.c(this, context, iArr, attributeSet, typedArray, i, 0);
        int P = h.P(1, -1);
        if (P >= 0) {
            setOrientation(P);
        }
        int P2 = h.P(0, -1);
        if (P2 >= 0) {
            setGravity(P2);
        }
        boolean Z = h.Z(2, true);
        if (!Z) {
            setBaselineAligned(Z);
        }
        this.R = ((TypedArray) h.v).getFloat(4, -1.0f);
        this.e = h.P(3, -1);
        this.v = h.Z(7, false);
        setDividerDrawable(h.U(5));
        this.H = h.P(8, 0);
        this.U = h.H(6, 0);
        h.z();
    }

    /* renamed from: L */
    public eGR generateLayoutParams(AttributeSet attributeSet) {
        return new eGR(getContext(), attributeSet);
    }

    /* renamed from: O */
    public eGR generateDefaultLayoutParams() {
        int i = this.O;
        if (i == 0) {
            return new eGR(-2);
        }
        if (i == 1) {
            return new eGR(-1);
        }
        return null;
    }

    public final void X(Canvas canvas, int i) {
        this.f5767R.setBounds(i, getPaddingTop() + this.U, this.m + i, (getHeight() - getPaddingBottom()) - this.U);
        this.f5767R.draw(canvas);
    }

    /* renamed from: Z */
    public eGR generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new eGR(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof eGR;
    }

    public final void e(Canvas canvas, int i) {
        this.f5767R.setBounds(getPaddingLeft() + this.U, i, (getWidth() - getPaddingRight()) - this.U, this.x + i);
        this.f5767R.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.e;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.X;
                if (this.O == 1 && (i = this.L & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.Z) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.Z;
                    }
                }
                return i3 + ((LinearLayout.LayoutParams) ((eGR) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.e == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.e;
    }

    public Drawable getDividerDrawable() {
        return this.f5767R;
    }

    public int getDividerPadding() {
        return this.U;
    }

    public int getDividerWidth() {
        return this.m;
    }

    public int getGravity() {
        return this.L;
    }

    public int getOrientation() {
        return this.O;
    }

    public int getShowDividers() {
        return this.H;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.R;
    }

    public final boolean m(int i) {
        if (i == 0) {
            return (this.H & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.H & 4) != 0;
        }
        if ((this.H & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        if (this.f5767R != null) {
            int i4 = 0;
            if (this.O == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i4 < virtualChildCount) {
                    View childAt = getChildAt(i4);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !m(i4))) {
                        e(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((eGR) childAt.getLayoutParams())).topMargin) - this.x);
                    }
                    i4++;
                }
                if (m(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    e(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.x : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((eGR) childAt2.getLayoutParams())).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean R = oJF.R(this);
            while (i4 < virtualChildCount2) {
                View childAt3 = getChildAt(i4);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !m(i4))) {
                    eGR egr = (eGR) childAt3.getLayoutParams();
                    X(canvas, R ? childAt3.getRight() + ((LinearLayout.LayoutParams) egr).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) egr).leftMargin) - this.m);
                }
                i4++;
            }
            if (m(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    eGR egr2 = (eGR) childAt4.getLayoutParams();
                    if (R) {
                        i3 = childAt4.getLeft() - ((LinearLayout.LayoutParams) egr2).leftMargin;
                        i2 = this.m;
                        i = i3 - i2;
                        X(canvas, i);
                    }
                    i = childAt4.getRight() + ((LinearLayout.LayoutParams) egr2).rightMargin;
                    X(canvas, i);
                } else if (R) {
                    i = getPaddingLeft();
                    X(canvas, i);
                } else {
                    i3 = getWidth() - getPaddingRight();
                    i2 = this.m;
                    i = i3 - i2;
                    X(canvas, i);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ab  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
        // Method dump skipped, instructions count: 470
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lYU.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x06b1  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x06cf  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x085c  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:427:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r38, int r39) {
        /*
        // Method dump skipped, instructions count: 2241
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lYU.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f5768R = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder U = opT.U("base aligned child index out of range (0, ");
            U.append(getChildCount());
            U.append(")");
            throw new IllegalArgumentException(U.toString());
        }
        this.e = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f5767R) {
            this.f5767R = drawable;
            boolean z = false;
            if (drawable != null) {
                this.m = drawable.getIntrinsicWidth();
                this.x = drawable.getIntrinsicHeight();
            } else {
                this.m = 0;
                this.x = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.U = i;
    }

    public void setGravity(int i) {
        if (this.L != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.L = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.L;
        if ((8388615 & i3) != i2) {
            this.L = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.v = z;
    }

    public void setOrientation(int i) {
        if (this.O != i) {
            this.O = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.H) {
            requestLayout();
        }
        this.H = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.L;
        if ((i3 & 112) != i2) {
            this.L = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.R = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
