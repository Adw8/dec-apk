package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: pzb  reason: default package */
/* loaded from: classes.dex */
public final class pzb extends View implements lYW {
    public static Field R;

    /* renamed from: R  reason: collision with other field name */
    public static Method f7334R;

    /* renamed from: R  reason: collision with other field name */
    public static final kX7 f7335R = new kX7(1);
    public static boolean X;
    public static boolean e;

    /* renamed from: R  reason: collision with other field name */
    public Rect f7337R;

    /* renamed from: R  reason: collision with other field name */
    public final AndroidComposeView f7338R;

    /* renamed from: R  reason: collision with other field name */
    public final e4H f7340R;

    /* renamed from: R  reason: collision with other field name */
    public f_c f7341R;

    /* renamed from: R  reason: collision with other field name */
    public final fi6 f7342R;

    /* renamed from: R  reason: collision with other field name */
    public kg9 f7344R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7345R;
    public boolean c;
    public boolean v;

    /* renamed from: R  reason: collision with other field name */
    public final h89 f7343R = new h89(4);

    /* renamed from: R  reason: collision with other field name */
    public final dAE f7339R = new dAE(ky1.u);

    /* renamed from: R  reason: collision with other field name */
    public long f7336R = b3a.v;

    public pzb(AndroidComposeView androidComposeView, fi6 fi6, kg9 kg9, q4 q4Var) {
        super(androidComposeView.getContext());
        this.f7338R = androidComposeView;
        this.f7342R = fi6;
        this.f7344R = kg9;
        this.f7341R = q4Var;
        this.f7340R = new e4H(androidComposeView.getDensity());
        setWillNotDraw(false);
        setId(View.generateViewId());
        fi6.addView(this);
    }

    private final cnO getManualClipPath() {
        if (getClipToOutline()) {
            e4H e4h = this.f7340R;
            if (!(!e4h.f2959c)) {
                e4h.X();
                return e4h.f2952R;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.v) {
            this.v = z;
            this.f7338R.C(this, z);
        }
    }

    @Override // defpackage.lYW
    public final void L() {
        if (this.v && !X) {
            setInvalidated(false);
            jy3.c(this);
        }
    }

    @Override // defpackage.lYW
    public final void O(q4 q4Var, kg9 kg9) {
        this.f7342R.addView(this);
        this.f7345R = false;
        this.c = false;
        this.f7336R = b3a.v;
        this.f7344R = kg9;
        this.f7341R = q4Var;
    }

    @Override // defpackage.lYW
    public final void R(aG9 ag9, boolean z) {
        if (z) {
            float[] R2 = this.f7339R.R(this);
            if (R2 != null) {
                l1r.c(R2, ag9);
                return;
            }
            ag9.R = 0.0f;
            ag9.v = 0.0f;
            ag9.c = 0.0f;
            ag9.e = 0.0f;
            return;
        }
        l1r.c(this.f7339R.v(this), ag9);
    }

    @Override // defpackage.lYW
    public final long X(long j, boolean z) {
        if (!z) {
            return l1r.v(this.f7339R.v(this), j);
        }
        float[] R2 = this.f7339R.R(this);
        if (R2 != null) {
            return l1r.v(R2, j);
        }
        int i = aWo.R;
        return aWo.c;
    }

    @Override // defpackage.lYW
    public final void Z(Gp gp) {
        boolean z = getElevation() > 0.0f;
        this.c = z;
        if (z) {
            gp.L();
        }
        this.f7342R.R(gp, this, getDrawingTime());
        if (this.c) {
            gp.i();
        }
    }

    @Override // defpackage.lYW
    public final void c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, n76 n76, boolean z, long j2, long j3, mdz mdz, jJj jjj) {
        f_c f_c;
        this.f7336R = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        long j4 = this.f7336R;
        int i = b3a.R;
        setPivotX(Float.intBitsToFloat((int) (j4 >> 32)) * ((float) getWidth()));
        setPivotY(b3a.R(this.f7336R) * ((float) getHeight()));
        setCameraDistancePx(f10);
        boolean z2 = true;
        this.f7345R = z && n76 == cUF.f2104R;
        x();
        boolean z3 = getManualClipPath() != null;
        setClipToOutline(z && n76 != cUF.f2104R);
        boolean e2 = this.f7340R.e(n76, getAlpha(), getClipToOutline(), getElevation(), mdz, jjj);
        setOutlineProvider(this.f7340R.v() != null ? f7335R : null);
        if (getManualClipPath() == null) {
            z2 = false;
        }
        if (z3 != z2 || (z2 && e2)) {
            invalidate();
        }
        if (!this.c && getElevation() > 0.0f && (f_c = this.f7341R) != null) {
            f_c.g();
        }
        this.f7339R.c();
        cTt ctt = cTt.R;
        ctt.R(this, aH9.vz(j2));
        ctt.v(this, aH9.vz(j3));
        kf2.R.R(this, null);
    }

    @Override // defpackage.lYW
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.f7338R;
        androidComposeView.f1233c = true;
        this.f7344R = null;
        this.f7341R = null;
        androidComposeView.y(this);
        this.f7342R.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z = false;
        setInvalidated(false);
        h89 h89 = this.f7343R;
        Object obj = h89.R;
        Canvas canvas2 = ((W3) obj).R;
        ((W3) obj).R = canvas;
        W3 w3 = (W3) obj;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            z = true;
            w3.y();
            this.f7340R.R(w3);
        }
        kg9 kg9 = this.f7344R;
        if (kg9 != null) {
            kg9.x(w3);
        }
        if (z) {
            w3.j();
        }
        ((W3) h89.R).R = canvas2;
    }

    @Override // defpackage.lYW
    public final boolean e(long j) {
        float e2 = aWo.e(j);
        float X2 = aWo.X(j);
        if (this.f7345R) {
            return 0.0f <= e2 && e2 < ((float) getWidth()) && 0.0f <= X2 && X2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f7340R.c(j);
        }
        return true;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final fi6 getContainer() {
        return this.f7342R;
    }

    public long getLayerId() {
        return (long) getId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.f7338R;
    }

    public long getOwnerViewId() {
        return kiG.R(this.f7338R);
    }

    @Override // android.view.View, defpackage.lYW
    public final void invalidate() {
        if (!this.v) {
            setInvalidated(true);
            super.invalidate();
            this.f7338R.invalidate();
        }
    }

    @Override // defpackage.lYW
    public final void m(long j) {
        int i = (int) (j >> 32);
        int v = ltH.v(j);
        if (i != getWidth() || v != getHeight()) {
            long j2 = this.f7336R;
            int i2 = b3a.R;
            float f = (float) i;
            setPivotX(Float.intBitsToFloat((int) (j2 >> 32)) * f);
            float f2 = (float) v;
            setPivotY(b3a.R(this.f7336R) * f2);
            e4H e4h = this.f7340R;
            long e2 = n1P.e(f, f2);
            if (!nqW.R(e4h.f2949R, e2)) {
                e4h.f2949R = e2;
                e4h.f2961v = true;
            }
            setOutlineProvider(this.f7340R.v() != null ? f7335R : null);
            layout(getLeft(), getTop(), getLeft() + i, getTop() + v);
            x();
            this.f7339R.c();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * ((float) getResources().getDisplayMetrics().densityDpi));
    }

    @Override // defpackage.lYW
    public final void v(long j) {
        int i = dU5.R;
        int i2 = (int) (j >> 32);
        if (i2 != getLeft()) {
            offsetLeftAndRight(i2 - getLeft());
            this.f7339R.c();
        }
        int v = dU5.v(j);
        if (v != getTop()) {
            offsetTopAndBottom(v - getTop());
            this.f7339R.c();
        }
    }

    public final void x() {
        Rect rect;
        if (this.f7345R) {
            Rect rect2 = this.f7337R;
            if (rect2 == null) {
                this.f7337R = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f7337R;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }
}
