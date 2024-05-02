package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public Drawable R;

    /* renamed from: R  reason: collision with other field name */
    public View f1046R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1047R;
    public Drawable c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1048c;
    public int e;
    public Drawable v;

    /* renamed from: v  reason: collision with other field name */
    public View f1049v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1050v;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mC mCVar = new mC(this);
        WeakHashMap weakHashMap = of5.f6887R;
        mHC.g(this, mCVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iTI.f4603R);
        boolean z = false;
        this.R = obtainStyledAttributes.getDrawable(0);
        this.v = obtainStyledAttributes.getDrawable(2);
        this.e = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1050v = true;
            this.c = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1050v ? this.R == null && this.v == null : this.c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.R;
        if (drawable != null && drawable.isStateful()) {
            this.R.setState(getDrawableState());
        }
        Drawable drawable2 = this.v;
        if (drawable2 != null && drawable2.isStateful()) {
            this.v.setState(getDrawableState());
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null && drawable3.isStateful()) {
            this.c.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.R;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.v;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1046R = findViewById(R.id.action_bar);
        this.f1049v = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1047R || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            boolean r3 = r2.f1050v
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0019
            android.graphics.drawable.Drawable r3 = r2.c
            if (r3 == 0) goto L_0x0075
            int r6 = r2.getMeasuredWidth()
            int r7 = r2.getMeasuredHeight()
            r3.setBounds(r4, r4, r6, r7)
            goto L_0x0076
        L_0x0019:
            android.graphics.drawable.Drawable r3 = r2.R
            if (r3 == 0) goto L_0x0071
            android.view.View r3 = r2.f1046R
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0043
            android.graphics.drawable.Drawable r3 = r2.R
            android.view.View r6 = r2.f1046R
            int r6 = r6.getLeft()
            android.view.View r7 = r2.f1046R
            int r7 = r7.getTop()
            android.view.View r0 = r2.f1046R
            int r0 = r0.getRight()
            android.view.View r1 = r2.f1046R
            int r1 = r1.getBottom()
            r3.setBounds(r6, r7, r0, r1)
            goto L_0x0072
        L_0x0043:
            android.view.View r3 = r2.f1049v
            if (r3 == 0) goto L_0x006b
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x006b
            android.graphics.drawable.Drawable r3 = r2.R
            android.view.View r6 = r2.f1049v
            int r6 = r6.getLeft()
            android.view.View r7 = r2.f1049v
            int r7 = r7.getTop()
            android.view.View r0 = r2.f1049v
            int r0 = r0.getRight()
            android.view.View r1 = r2.f1049v
            int r1 = r1.getBottom()
            r3.setBounds(r6, r7, r0, r1)
            goto L_0x0072
        L_0x006b:
            android.graphics.drawable.Drawable r3 = r2.R
            r3.setBounds(r4, r4, r4, r4)
            goto L_0x0072
        L_0x0071:
            r5 = r4
        L_0x0072:
            r2.f1048c = r4
            r4 = r5
        L_0x0075:
            r5 = r4
        L_0x0076:
            if (r5 == 0) goto L_0x007b
            r2.invalidate()
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f1046R == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.e) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1046R != null) {
            View.MeasureSpec.getMode(i2);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.R;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.R);
        }
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1046R;
            if (view != null) {
                this.R.setBounds(view.getLeft(), this.f1046R.getTop(), this.f1046R.getRight(), this.f1046R.getBottom());
            }
        }
        boolean z = true;
        z = false;
        if (!this.f1050v ? !(this.R == null && this.v == null) : this.c != null) {
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.c);
        }
        this.c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1050v && (drawable2 = this.c) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        z = true;
        if (!this.f1050v ? this.R == null && this.v == null : this.c == null) {
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.v);
        }
        this.v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1048c && this.v != null) {
                throw null;
            }
        }
        boolean z = true;
        z = false;
        if (!this.f1050v ? !(this.R == null && this.v == null) : this.c != null) {
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(cGP cgp) {
    }

    public void setTransitioning(boolean z) {
        this.f1047R = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.R;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.v;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.R && !this.f1050v) || (drawable == this.v && this.f1048c) || ((drawable == this.c && this.f1050v) || super.verifyDrawable(drawable));
    }
}
