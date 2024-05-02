package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    public boolean R;
    public int e = -1;
    public boolean v;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = iTI.H;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        WeakHashMap weakHashMap = of5.f6887R;
        hpL.c(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.R = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.R);
        }
    }

    private void setStacked(boolean z) {
        if (this.v == z) {
            return;
        }
        if (!z || this.R) {
            this.v = z;
            setOrientation(z ? 1 : 0);
            setGravity(z ? 8388613 : 80);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int i6 = 0;
        if (this.R) {
            if (size > this.e && this.v) {
                setStacked(false);
            }
            this.e = size;
        }
        if (this.v || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.R && !this.v) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            i4 = -1;
            if (i7 >= childCount) {
                i7 = -1;
                break;
            } else if (getChildAt(i7).getVisibility() == 0) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            View childAt = getChildAt(i7);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i6 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.v) {
                int i8 = i7 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i8 >= childCount2) {
                        break;
                    } else if (getChildAt(i8).getVisibility() == 0) {
                        i4 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i4 >= 0) {
                    i5 = getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                i5 = getPaddingBottom();
            }
            i6 += i5;
        }
        WeakHashMap weakHashMap = of5.f6887R;
        if (mHC.e(this) != i6) {
            setMinimumHeight(i6);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.R != z) {
            this.R = z;
            if (!z && this.v) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
