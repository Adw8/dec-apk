package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: pqm  reason: default package */
/* loaded from: classes.dex */
public final class pqm implements Runnable {
    public Interpolator R;

    /* renamed from: R  reason: collision with other field name */
    public OverScroller f7291R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ RecyclerView f7292R;
    public int X;
    public int e;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7293R = false;
    public boolean v = false;

    public pqm(RecyclerView recyclerView) {
        this.f7292R = recyclerView;
        mWA mwa = RecyclerView.R;
        this.R = mwa;
        this.f7291R = new OverScroller(recyclerView.getContext(), mwa);
    }

    public final void R() {
        if (this.f7293R) {
            this.v = true;
            return;
        }
        this.f7292R.removeCallbacks(this);
        RecyclerView recyclerView = this.f7292R;
        WeakHashMap weakHashMap = of5.f6887R;
        mHC.C(recyclerView, this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        RecyclerView recyclerView = this.f7292R;
        if (recyclerView.f1400R == null) {
            recyclerView.removeCallbacks(this);
            this.f7291R.abortAnimation();
            return;
        }
        this.v = false;
        this.f7293R = true;
        recyclerView.C();
        OverScroller overScroller = this.f7291R;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i3 = currX - this.e;
            int i4 = currY - this.X;
            this.e = currX;
            this.X = currY;
            RecyclerView recyclerView2 = this.f7292R;
            int[] iArr = recyclerView2.f1418e;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView2.y(i3, i4, 1, iArr, null)) {
                int[] iArr2 = this.f7292R.f1418e;
                i3 -= iArr2[0];
                i4 -= iArr2[1];
            }
            if (this.f7292R.getOverScrollMode() != 2) {
                this.f7292R.U(i3, i4);
            }
            RecyclerView recyclerView3 = this.f7292R;
            if (recyclerView3.f1392R != null) {
                int[] iArr3 = recyclerView3.f1418e;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView3.q(i3, i4, iArr3);
                RecyclerView recyclerView4 = this.f7292R;
                int[] iArr4 = recyclerView4.f1418e;
                i = iArr4[0];
                i2 = iArr4[1];
                i3 -= i;
                i4 -= i2;
                nvs nvs = recyclerView4.f1400R.f5376R;
                if (nvs != null && !nvs.f6637R && nvs.f6639v) {
                    int v = recyclerView4.f1385R.v();
                    if (v == 0) {
                        nvs.L();
                    } else if (nvs.f6628R >= v) {
                        nvs.f6628R = v - 1;
                        nvs.X(i, i2);
                    } else {
                        nvs.X(i, i2);
                    }
                }
            } else {
                i2 = 0;
                i = 0;
            }
            if (!this.f7292R.f1423v.isEmpty()) {
                this.f7292R.invalidate();
            }
            RecyclerView recyclerView5 = this.f7292R;
            int[] iArr5 = recyclerView5.f1418e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView5.t(i, i2, i3, i4, null, 1, iArr5);
            RecyclerView recyclerView6 = this.f7292R;
            int[] iArr6 = recyclerView6.f1418e;
            int i5 = i3 - iArr6[0];
            int i6 = i4 - iArr6[1];
            if (!(i == 0 && i2 == 0)) {
                recyclerView6.i(i, i2);
            }
            if (!(this.f7292R.awakenScrollBars())) {
                this.f7292R.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
            RecyclerView recyclerView7 = this.f7292R;
            nvs nvs2 = recyclerView7.f1400R.f5376R;
            if ((nvs2 != null && nvs2.f6637R) || !z) {
                R();
                RecyclerView recyclerView8 = this.f7292R;
                h6v h6v = recyclerView8.f1394R;
                if (h6v != null) {
                    h6v.R(recyclerView8, i, i2);
                }
            } else {
                if (recyclerView7.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                    if (i6 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i6 <= 0) {
                        currVelocity = 0;
                    }
                    RecyclerView recyclerView9 = this.f7292R;
                    if (i7 < 0) {
                        recyclerView9.o();
                        if (recyclerView9.f1384R.isFinished()) {
                            recyclerView9.f1384R.onAbsorb(-i7);
                        }
                    } else if (i7 > 0) {
                        recyclerView9.K();
                        if (recyclerView9.c.isFinished()) {
                            recyclerView9.c.onAbsorb(i7);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView9.J();
                        if (recyclerView9.f1421v.isFinished()) {
                            recyclerView9.f1421v.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView9.V();
                        if (recyclerView9.f1415e.isFinished()) {
                            recyclerView9.f1415e.onAbsorb(currVelocity);
                        }
                    } else {
                        recyclerView9.getClass();
                    }
                    if (!(i7 == 0 && currVelocity == 0)) {
                        WeakHashMap weakHashMap = of5.f6887R;
                        mHC.H(recyclerView9);
                    }
                }
                ma7 ma7 = this.f7292R.f1403R;
                int[] iArr7 = (int[]) ma7.f6078R;
                if (iArr7 != null) {
                    Arrays.fill(iArr7, -1);
                }
                ma7.e = 0;
            }
        }
        nvs nvs3 = this.f7292R.f1400R.f5376R;
        if (nvs3 != null && nvs3.f6637R) {
            nvs3.X(0, 0);
        }
        this.f7293R = false;
        if (this.v) {
            this.f7292R.removeCallbacks(this);
            RecyclerView recyclerView10 = this.f7292R;
            WeakHashMap weakHashMap2 = of5.f6887R;
            mHC.C(recyclerView10, this);
            return;
        }
        this.f7292R.setScrollState(0);
        this.f7292R.vl(1);
    }

    public final void v(int i, int i2, int i3, Interpolator interpolator) {
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            RecyclerView recyclerView = this.f7292R;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }
        if (interpolator == null) {
            interpolator = RecyclerView.R;
        }
        if (this.R != interpolator) {
            this.R = interpolator;
            this.f7291R = new OverScroller(this.f7292R.getContext(), interpolator);
        }
        this.X = 0;
        this.e = 0;
        this.f7292R.setScrollState(2);
        this.f7291R.startScroll(0, 0, i, i2, i3);
        R();
    }
}
