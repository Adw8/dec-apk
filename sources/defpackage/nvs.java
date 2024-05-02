package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nvs  reason: default package */
/* loaded from: classes.dex */
public class nvs {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public PointF f6629R;

    /* renamed from: R  reason: collision with other field name */
    public final DisplayMetrics f6630R;

    /* renamed from: R  reason: collision with other field name */
    public View f6631R;

    /* renamed from: R  reason: collision with other field name */
    public RecyclerView f6634R;

    /* renamed from: R  reason: collision with other field name */
    public kds f6635R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6637R;

    /* renamed from: c  reason: collision with other field name */
    public boolean f6638c;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6639v;

    /* renamed from: R  reason: collision with other field name */
    public int f6628R = -1;

    /* renamed from: R  reason: collision with other field name */
    public final nLx f6636R = new nLx();

    /* renamed from: R  reason: collision with other field name */
    public final LinearInterpolator f6633R = new LinearInterpolator();

    /* renamed from: R  reason: collision with other field name */
    public final DecelerateInterpolator f6632R = new DecelerateInterpolator();
    public boolean e = false;
    public int v = 0;
    public int c = 0;

    public nvs(Context context) {
        this.f6630R = context.getResources().getDisplayMetrics();
    }

    public static int R(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public final void L() {
        if (this.f6639v) {
            this.f6639v = false;
            this.c = 0;
            this.v = 0;
            this.f6629R = null;
            this.f6634R.f1385R.R = -1;
            this.f6631R = null;
            this.f6628R = -1;
            this.f6637R = false;
            kds kds = this.f6635R;
            if (kds.f5376R == this) {
                kds.f5376R = null;
            }
            this.f6635R = null;
            this.f6634R = null;
        }
    }

    public void O(View view, btj btj, nLx nlx) {
        int i;
        int i2;
        int i3;
        PointF pointF = this.f6629R;
        int i4 = -1;
        int i5 = 0;
        int i6 = (pointF == null || pointF.x == 0.0f) ? 0 : i3 > 0 ? 1 : -1;
        kds kds = this.f6635R;
        if (kds == null || !kds.e()) {
            i = 0;
        } else {
            l88 l88 = (l88) view.getLayoutParams();
            i = R((view.getLeft() - ((l88) view.getLayoutParams()).R.left) - ((ViewGroup.MarginLayoutParams) l88).leftMargin, view.getRight() + ((l88) view.getLayoutParams()).R.right + ((ViewGroup.MarginLayoutParams) l88).rightMargin, kds.I(), kds.e - kds.u(), i6);
        }
        PointF pointF2 = this.f6629R;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i4 = 0;
        } else if (i2 > 0) {
            i4 = 1;
        }
        kds kds2 = this.f6635R;
        if (kds2 != null && kds2.X()) {
            l88 l882 = (l88) view.getLayoutParams();
            i5 = R((view.getTop() - ((l88) view.getLayoutParams()).R.top) - ((ViewGroup.MarginLayoutParams) l882).topMargin, view.getBottom() + ((l88) view.getLayoutParams()).R.bottom + ((ViewGroup.MarginLayoutParams) l882).bottomMargin, kds2.z(), kds2.X - kds2.h(), i4);
        }
        int ceil = (int) Math.ceil(((double) c((int) Math.sqrt((double) ((i5 * i5) + (i * i))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f6632R;
            nlx.R = -i;
            nlx.v = -i5;
            nlx.c = ceil;
            nlx.f6376R = decelerateInterpolator;
            nlx.f6377R = true;
        }
    }

    public final void X(int i, int i2) {
        PointF e;
        RecyclerView recyclerView = this.f6634R;
        int i3 = -1;
        if (this.f6628R == -1 || recyclerView == null) {
            L();
        }
        if (this.f6637R && this.f6631R == null && this.f6635R != null && (e = e(this.f6628R)) != null) {
            float f = e.x;
            if (!(f == 0.0f && e.y == 0.0f)) {
                recyclerView.q((int) Math.signum(f), (int) Math.signum(e.y), null);
            }
        }
        boolean z = false;
        this.f6637R = false;
        View view = this.f6631R;
        if (view != null) {
            this.f6634R.getClass();
            h9X W = RecyclerView.W(view);
            if (W != null) {
                i3 = W.c();
            }
            if (i3 == this.f6628R) {
                O(this.f6631R, recyclerView.f1385R, this.f6636R);
                this.f6636R.q(recyclerView);
                L();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f6631R = null;
            }
        }
        if (this.f6639v) {
            btj btj = recyclerView.f1385R;
            nLx nlx = this.f6636R;
            if (this.f6634R.f1400R.o() == 0) {
                L();
            } else {
                int i4 = this.v;
                int i5 = i4 - i;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.v = i5;
                int i6 = this.c;
                int i7 = i6 - i2;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.c = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF e2 = e(this.f6628R);
                    if (e2 != null) {
                        float f2 = e2.x;
                        if (!(f2 == 0.0f && e2.y == 0.0f)) {
                            float f3 = e2.y;
                            float sqrt = (float) Math.sqrt((double) ((f3 * f3) + (f2 * f2)));
                            float f4 = e2.x / sqrt;
                            e2.x = f4;
                            float f5 = e2.y / sqrt;
                            e2.y = f5;
                            this.f6629R = e2;
                            this.v = (int) (f4 * 10000.0f);
                            this.c = (int) (f5 * 10000.0f);
                            int c = c(10000);
                            LinearInterpolator linearInterpolator = this.f6633R;
                            nlx.R = (int) (((float) this.v) * 1.2f);
                            nlx.v = (int) (((float) this.c) * 1.2f);
                            nlx.c = (int) (((float) c) * 1.2f);
                            nlx.f6376R = linearInterpolator;
                            nlx.f6377R = true;
                        }
                    }
                    nlx.e = this.f6628R;
                    L();
                }
            }
            nLx nlx2 = this.f6636R;
            if (nlx2.e >= 0) {
                z = true;
            }
            nlx2.q(recyclerView);
            if (z && this.f6639v) {
                this.f6637R = true;
                recyclerView.f1404R.R();
            }
        }
    }

    public int c(int i) {
        float abs = (float) Math.abs(i);
        if (!this.e) {
            this.R = v(this.f6630R);
            this.e = true;
        }
        return (int) Math.ceil((double) (abs * this.R));
    }

    public final PointF e(int i) {
        kds kds = this.f6635R;
        if (kds instanceof hmf) {
            return ((hmf) kds).R(i);
        }
        StringBuilder U = opT.U("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
        U.append(hmf.class.getCanonicalName());
        Log.w("RecyclerView", U.toString());
        return null;
    }

    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }
}
