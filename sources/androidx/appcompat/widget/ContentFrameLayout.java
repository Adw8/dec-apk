package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue O;
    public final Rect R = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public TypedValue f1095R;

    /* renamed from: R  reason: collision with other field name */
    public kHr f1096R;
    public TypedValue X;
    public TypedValue c;
    public TypedValue e;
    public TypedValue v;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.X == null) {
            this.X = new TypedValue();
        }
        return this.X;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.O == null) {
            this.O = new TypedValue();
        }
        return this.O;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return this.c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1095R == null) {
            this.f1095R = new TypedValue();
        }
        return this.f1095R;
    }

    public TypedValue getMinWidthMinor() {
        if (this.v == null) {
            this.v = new TypedValue();
        }
        return this.v;
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kHr khr = this.f1096R;
        if (khr != null) {
            khr.getClass();
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void onDetachedFromWindow() {
        RR rr;
        super.onDetachedFromWindow();
        kHr khr = this.f1096R;
        if (khr != null) {
            Q8 q8 = ((uD) khr).R;
            kP9 kp9 = q8.f412R;
            if (kp9 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) kp9;
                actionBarOverlayLayout.U();
                ActionMenuView actionMenuView = ((muY) actionBarOverlayLayout.f1074R).f6229R.f1163R;
                if (!(actionMenuView == null || (rr = actionMenuView.R) == null)) {
                    rr.e();
                    Ni ni = rr.v;
                    if (ni != null && ni.v()) {
                        ((h6s) ni).f4068R.dismiss();
                    }
                }
            }
            if (q8.f406R != null) {
                q8.f405R.getDecorView().removeCallbacks(q8.f395R);
                if (q8.f406R.isShowing()) {
                    try {
                        q8.f406R.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                q8.f406R = null;
            }
            ozg ozg = q8.f414R;
            if (ozg != null) {
                ozg.v();
            }
            lRG lrg = q8.J(0).f7388R;
            if (lrg != null) {
                lrg.c(true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(kHr khr) {
        this.f1096R = khr;
    }
}
