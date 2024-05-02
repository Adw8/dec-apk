package defpackage;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupWindow;
import com.termux.view.TerminalView;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: llS  reason: default package */
/* loaded from: classes.dex */
public final class llS extends View {
    public final int H;
    public int L;
    public int O;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public long f5816R;

    /* renamed from: R  reason: collision with other field name */
    public Rect f5817R;

    /* renamed from: R  reason: collision with other field name */
    public PopupWindow f5819R;

    /* renamed from: R  reason: collision with other field name */
    public final c8A f5820R;

    /* renamed from: R  reason: collision with other field name */
    public final TerminalView f5821R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5822R;
    public int U;
    public int X;
    public int Z;
    public float c;

    /* renamed from: c  reason: collision with other field name */
    public Drawable f5824c;
    public float e;

    /* renamed from: e  reason: collision with other field name */
    public final int f5825e;
    public int m;
    public float v;
    public int x;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f5823R = new int[2];

    /* renamed from: R  reason: collision with other field name */
    public final Drawable f5818R = getContext().getDrawable(R.drawable.text_select_handle_left_material);

    /* renamed from: v  reason: collision with other field name */
    public final Drawable f5826v = getContext().getDrawable(R.drawable.text_select_handle_right_material);

    public llS(TerminalView terminalView, c8A c8a, int i) {
        super(terminalView.getContext());
        this.f5821R = terminalView;
        this.f5820R = c8a;
        this.H = i;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.colorPrimary});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        this.f5825e = color;
        setOrientation(i);
    }

    public final void R() {
        boolean z = false;
        this.f5822R = false;
        PopupWindow popupWindow = this.f5819R;
        if (popupWindow != null) {
            popupWindow.dismiss();
            if (getParent() == null) {
                z = true;
            }
            if (!z) {
                ((ViewGroup) getParent()).removeView(this);
            }
            this.f5819R = null;
        }
        invalidate();
    }

    public final void c(int i, int i2, boolean z) {
        TerminalView terminalView = this.f5821R;
        int i3 = terminalView.f2428R.e;
        if (i > i3) {
            i = i3;
        }
        int round = Math.round(((float) i) * terminalView.f2431R.R);
        TerminalView terminalView2 = this.f5821R;
        int round2 = Math.round((float) (((i2 + 1) - terminalView2.e) * terminalView2.f2431R.v));
        float f = this.c;
        int[] iArr = null;
        if (this.f5822R || z) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            if (currentThreadTimeMillis - this.f5816R >= 50 || z) {
                this.f5816R = currentThreadTimeMillis;
                View view = this.f5821R;
                int left = view.getLeft();
                int width = view.getWidth();
                int top = view.getTop();
                int height = view.getHeight();
                if (this.f5817R == null) {
                    this.f5817R = new Rect();
                }
                Rect rect = this.f5817R;
                rect.left = this.f5821R.getPaddingLeft() + left;
                rect.top = this.f5821R.getPaddingTop() + top;
                rect.right = width - this.f5821R.getPaddingRight();
                rect.bottom = height - this.f5821R.getPaddingBottom();
                ViewParent parent = view.getParent();
                if (parent != null && parent.getChildVisibleRect(view, rect, null)) {
                    int i4 = this.x;
                    if (round - i4 < rect.left) {
                        if (this.U != 2) {
                            setOrientation(2);
                        }
                    } else if (i4 + round <= rect.right) {
                        int i5 = this.H;
                        if (this.U != i5) {
                            setOrientation(i5);
                        }
                    } else if (this.U != 0) {
                        setOrientation(0);
                    }
                }
            }
        }
        float f2 = (float) round;
        PopupWindow popupWindow = this.f5819R;
        if (!(popupWindow != null ? popupWindow.isShowing() : false)) {
            f = this.c;
        }
        this.X = (int) (f2 - f);
        this.O = round2;
        if (v()) {
            PopupWindow popupWindow2 = this.f5819R;
            if (popupWindow2 != null ? popupWindow2.isShowing() : false) {
                iArr = this.f5823R;
                this.f5821R.getLocationInWindow(iArr);
                int i6 = iArr[0] + this.X;
                int i7 = iArr[1] + this.O;
                PopupWindow popupWindow3 = this.f5819R;
                if (popupWindow3 != null) {
                    popupWindow3.update(i6, i7, getWidth(), getHeight());
                }
            } else if (!v()) {
                R();
            } else {
                if (!(getParent() == null)) {
                    ((ViewGroup) getParent()).removeView(this);
                }
                PopupWindow popupWindow4 = new PopupWindow(this.f5821R.getContext(), (AttributeSet) null, 16843464);
                this.f5819R = popupWindow4;
                popupWindow4.setSplitTouchEnabled(true);
                this.f5819R.setClippingEnabled(false);
                this.f5819R.setWidth(-2);
                this.f5819R.setHeight(-2);
                this.f5819R.setBackgroundDrawable(null);
                this.f5819R.setAnimationStyle(0);
                this.f5819R.setWindowLayoutType(1002);
                this.f5819R.setEnterTransition(null);
                this.f5819R.setExitTransition(null);
                this.f5819R.setContentView(this);
                invalidate();
                int[] iArr2 = this.f5823R;
                this.f5821R.getLocationInWindow(iArr2);
                int i8 = iArr2[0] + this.X;
                iArr2[0] = i8;
                int i9 = iArr2[1] + this.O;
                iArr2[1] = i9;
                PopupWindow popupWindow5 = this.f5819R;
                if (popupWindow5 != null) {
                    popupWindow5.showAtLocation(this.f5821R, 0, i8, i9);
                }
            }
            if (this.f5822R) {
                if (iArr == null) {
                    iArr = this.f5823R;
                    this.f5821R.getLocationInWindow(iArr);
                }
                int i10 = iArr[0];
                int i11 = this.L;
                if (i10 != i11 || iArr[1] != this.Z) {
                    this.R += (float) (i10 - i11);
                    float f3 = this.v;
                    int i12 = iArr[1];
                    this.v = f3 + ((float) (i12 - this.Z));
                    this.L = i10;
                    this.Z = i12;
                    return;
                }
                return;
            }
            return;
        }
        R();
    }

    public int getHandleHeight() {
        return this.m;
    }

    public int getHandleWidth() {
        return this.x;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f5824c.setBounds(0, 0, this.f5824c.getIntrinsicWidth(), this.f5824c.getIntrinsicHeight());
        this.f5824c.setTint(this.f5825e);
        this.f5824c.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f5824c.getIntrinsicWidth(), this.f5824c.getIntrinsicHeight());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r1 != 3) goto L_0x0176;
     */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 375
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llS.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOrientation(int i) {
        int i2;
        this.U = i;
        if (i == 0) {
            Drawable drawable = this.f5818R;
            this.f5824c = drawable;
            i2 = drawable.getIntrinsicWidth();
            this.c = ((float) (i2 * 3)) / 4.0f;
        } else if (i != 2) {
            i2 = 0;
        } else {
            Drawable drawable2 = this.f5826v;
            this.f5824c = drawable2;
            i2 = drawable2.getIntrinsicWidth();
            this.c = ((float) i2) / 4.0f;
        }
        int intrinsicHeight = this.f5824c.getIntrinsicHeight();
        this.m = intrinsicHeight;
        this.x = i2;
        this.e = ((float) (-intrinsicHeight)) * 0.3f;
        invalidate();
    }

    public final boolean v() {
        if (this.f5822R) {
            return true;
        }
        View view = this.f5821R;
        int width = view.getWidth();
        int height = view.getHeight();
        if (this.f5817R == null) {
            this.f5817R = new Rect();
        }
        Rect rect = this.f5817R;
        rect.left = this.f5821R.getPaddingLeft() + 0;
        rect.top = this.f5821R.getPaddingTop() + 0;
        rect.right = width - this.f5821R.getPaddingRight();
        rect.bottom = height - this.f5821R.getPaddingBottom();
        ViewParent parent = view.getParent();
        if (parent == null || !parent.getChildVisibleRect(view, rect, null)) {
            return false;
        }
        int[] iArr = this.f5823R;
        view.getLocationInWindow(iArr);
        int i = iArr[0] + this.X + ((int) this.c);
        int i2 = iArr[1] + this.O + ((int) 0.0f);
        return i >= rect.left && i <= rect.right && i2 >= rect.top && i2 <= rect.bottom;
    }
}
