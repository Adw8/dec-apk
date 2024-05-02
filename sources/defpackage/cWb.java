package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* renamed from: cWb  reason: default package */
/* loaded from: classes.dex */
public final class cWb extends View {
    public static final int[] R = {16842919, 16842910};
    public static final int[] v = new int[0];

    /* renamed from: R  reason: collision with other field name */
    public ek0 f2118R;

    /* renamed from: R  reason: collision with other field name */
    public f_c f2119R;

    /* renamed from: R  reason: collision with other field name */
    public Boolean f2120R;

    /* renamed from: R  reason: collision with other field name */
    public Long f2121R;

    /* renamed from: R  reason: collision with other field name */
    public mBn f2122R;

    public cWb(Context context) {
        super(context);
    }

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        mBn mbn = this.f2122R;
        if (mbn != null) {
            removeCallbacks(mbn);
            mbn.run();
        }
        Long l = this.f2121R;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0);
        if (z || longValue >= 5) {
            int[] iArr = z ? R : v;
            ek0 ek0 = this.f2118R;
            if (ek0 != null) {
                ek0.setState(iArr);
            }
        } else {
            mBn mbn2 = new mBn(4, this);
            this.f2122R = mbn2;
            postDelayed(mbn2, 50);
        }
        this.f2121R = Long.valueOf(currentAnimationTimeMillis);
    }

    /* access modifiers changed from: private */
    /* renamed from: setRippleState$lambda-2  reason: not valid java name */
    public static final void m11setRippleState$lambda2(cWb cwb) {
        ek0 ek0 = cwb.f2118R;
        if (ek0 != null) {
            ek0.setState(v);
        }
        cwb.f2122R = null;
    }

    public final void X(long j, int i, long j2, float f) {
        ek0 ek0 = this.f2118R;
        if (ek0 != null) {
            Integer num = ek0.R;
            if (num == null || num.intValue() != i) {
                ek0.R = Integer.valueOf(i);
                cw_.R.R(ek0, i);
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            long v2 = n3.v(j2, f);
            n3 n3Var = ek0.f3188R;
            if (!(n3Var == null ? false : n3.c(n3Var.f6279R, v2))) {
                ek0.f3188R = new n3(v2);
                ek0.setColor(ColorStateList.valueOf(aH9.vz(v2)));
            }
            Rect o = ooA.o(msU.e(aWo.v, j));
            setLeft(o.left);
            setTop(o.top);
            setRight(o.right);
            setBottom(o.bottom);
            ek0.setBounds(o);
        }
    }

    public final void c() {
        this.f2119R = null;
        mBn mbn = this.f2122R;
        if (mbn != null) {
            removeCallbacks(mbn);
            this.f2122R.run();
        } else {
            ek0 ek0 = this.f2118R;
            if (ek0 != null) {
                ek0.setState(v);
            }
        }
        ek0 ek02 = this.f2118R;
        if (ek02 != null) {
            ek02.setVisible(false, false);
            unscheduleDrawable(ek02);
        }
    }

    public final void e() {
        setRippleState(false);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        f_c f_c = this.f2119R;
        if (f_c != null) {
            f_c.g();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    public final void v(oDO odo, boolean z, long j, int i, long j2, float f, q4 q4Var) {
        if (this.f2118R == null || !n3x.v(Boolean.valueOf(z), this.f2120R)) {
            ek0 ek0 = new ek0(z);
            setBackground(ek0);
            this.f2118R = ek0;
            this.f2120R = Boolean.valueOf(z);
        }
        ek0 ek02 = this.f2118R;
        this.f2119R = q4Var;
        X(j, i, j2, f);
        if (z) {
            ek02.setHotspot(aWo.e(odo.R), aWo.X(odo.R));
        } else {
            ek02.setHotspot((float) ek02.getBounds().centerX(), (float) ek02.getBounds().centerY());
        }
        setRippleState(true);
    }
}
