package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: f6m  reason: default package */
/* loaded from: classes.dex */
public final class f6m extends gU1 implements aiI {
    public static final int[] c = {16842919};
    public static final int[] e = new int[0];
    public int L;
    public final int O;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f3309R;

    /* renamed from: R  reason: collision with other field name */
    public final ValueAnimator f3310R;

    /* renamed from: R  reason: collision with other field name */
    public final Drawable f3311R;

    /* renamed from: R  reason: collision with other field name */
    public final StateListDrawable f3312R;

    /* renamed from: R  reason: collision with other field name */
    public RecyclerView f3313R;

    /* renamed from: R  reason: collision with other field name */
    public final bA6 f3314R;
    public final int X;
    public int Z;

    /* renamed from: c  reason: collision with other field name */
    public final int f3317c;

    /* renamed from: e  reason: collision with other field name */
    public final int f3318e;
    public int m;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public final int f3319v;

    /* renamed from: v  reason: collision with other field name */
    public final Drawable f3320v;

    /* renamed from: v  reason: collision with other field name */
    public final StateListDrawable f3321v;
    public int x;
    public int H = 0;
    public int U = 0;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3315R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3322v = false;
    public int C = 0;
    public int N = 0;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f3316R = new int[2];

    /* renamed from: v  reason: collision with other field name */
    public final int[] f3323v = new int[2];
    public int P = 0;

    public f6m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        boolean z = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3310R = ofFloat;
        bA6 ba6 = new bA6(0, this);
        this.f3314R = ba6;
        gcA gca = new gcA(0, this);
        this.f3312R = stateListDrawable;
        this.f3311R = drawable;
        this.f3321v = stateListDrawable2;
        this.f3320v = drawable2;
        this.f3317c = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3318e = Math.max(i, drawable.getIntrinsicWidth());
        this.X = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.O = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3309R = i2;
        this.f3319v = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new ner(this));
        ofFloat.addUpdateListener(new oSC(this));
        RecyclerView recyclerView2 = this.f3313R;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                kds kds = recyclerView2.f1400R;
                if (kds != null) {
                    kds.c("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.f1423v.remove(this);
                if (recyclerView2.f1423v.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z);
                }
                recyclerView2.k();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f3313R;
                recyclerView3.f1412c.remove(this);
                if (recyclerView3.f1379R == this) {
                    recyclerView3.f1379R = null;
                }
                ArrayList arrayList = this.f3313R.f1416e;
                if (arrayList != null) {
                    arrayList.remove(gca);
                }
                this.f3313R.removeCallbacks(ba6);
            }
            this.f3313R = recyclerView;
            if (recyclerView != null) {
                recyclerView.L(this);
                this.f3313R.f1412c.add(this);
                this.f3313R.Z(gca);
            }
        }
    }

    public final void O() {
        int i = this.P;
        if (i != 0) {
            if (i == 3) {
                this.f3310R.cancel();
            } else {
                return;
            }
        }
        this.P = 1;
        ValueAnimator valueAnimator = this.f3310R;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3310R.setDuration(500L);
        this.f3310R.setStartDelay(0);
        this.f3310R.start();
    }

    public final void X(int i) {
        if (i == 2 && this.C != 2) {
            this.f3312R.setState(c);
            this.f3313R.removeCallbacks(this.f3314R);
        }
        if (i == 0) {
            this.f3313R.invalidate();
        } else {
            O();
        }
        if (this.C == 2 && i != 2) {
            this.f3312R.setState(e);
            this.f3313R.removeCallbacks(this.f3314R);
            this.f3313R.postDelayed(this.f3314R, (long) 1200);
        } else if (i == 1) {
            this.f3313R.removeCallbacks(this.f3314R);
            this.f3313R.postDelayed(this.f3314R, (long) 1500);
        }
        this.C = i;
    }

    public final boolean c(float f, float f2) {
        if (f2 >= ((float) (this.U - this.X))) {
            int i = this.x;
            int i2 = this.m;
            if (f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(float f, float f2) {
        RecyclerView recyclerView = this.f3313R;
        WeakHashMap weakHashMap = of5.f6887R;
        if (eHQ.e(recyclerView) == 1) {
            if (f > ((float) this.f3317c)) {
                return false;
            }
        } else if (f < ((float) (this.H - this.f3317c))) {
            return false;
        }
        int i = this.Z;
        int i2 = this.L / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i2 + i));
    }

    @Override // defpackage.gU1
    public final void v(Canvas canvas) {
        if (this.H != this.f3313R.getWidth() || this.U != this.f3313R.getHeight()) {
            this.H = this.f3313R.getWidth();
            this.U = this.f3313R.getHeight();
            X(0);
        } else if (this.P != 0) {
            if (this.f3315R) {
                int i = this.H;
                int i2 = this.f3317c;
                int i3 = i - i2;
                int i4 = this.Z;
                int i5 = this.L;
                int i6 = i4 - (i5 / 2);
                this.f3312R.setBounds(0, 0, i2, i5);
                this.f3311R.setBounds(0, 0, this.f3318e, this.U);
                RecyclerView recyclerView = this.f3313R;
                WeakHashMap weakHashMap = of5.f6887R;
                boolean z = true;
                if (eHQ.e(recyclerView) != 1) {
                    z = false;
                }
                if (z) {
                    this.f3311R.draw(canvas);
                    canvas.translate((float) this.f3317c, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f3312R.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.f3317c), (float) (-i6));
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.f3311R.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.f3312R.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.f3322v) {
                int i7 = this.U;
                int i8 = this.X;
                int i9 = i7 - i8;
                int i10 = this.x;
                int i11 = this.m;
                int i12 = i10 - (i11 / 2);
                this.f3321v.setBounds(0, 0, i11, i8);
                this.f3320v.setBounds(0, 0, this.H, this.O);
                canvas.translate(0.0f, (float) i9);
                this.f3320v.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.f3321v.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }
}
