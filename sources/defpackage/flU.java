package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: flU  reason: default package */
/* loaded from: classes.dex */
public final class flU implements View.OnTouchListener {
    public static final int O = ViewConfiguration.getTapTimeout();
    public final Pe R;

    /* renamed from: R  reason: collision with other field name */
    public final View f3542R;

    /* renamed from: R  reason: collision with other field name */
    public final ListView f3544R;

    /* renamed from: R  reason: collision with other field name */
    public k0f f3545R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3546R;

    /* renamed from: X  reason: collision with other field name */
    public boolean f3548X;
    public boolean c;

    /* renamed from: e  reason: collision with other field name */
    public boolean f3551e;
    public boolean v;

    /* renamed from: R  reason: collision with other field name */
    public final AccelerateInterpolator f3543R = new AccelerateInterpolator();

    /* renamed from: R  reason: collision with other field name */
    public float[] f3547R = {0.0f, 0.0f};

    /* renamed from: v  reason: collision with other field name */
    public float[] f3553v = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: c  reason: collision with other field name */
    public float[] f3550c = {0.0f, 0.0f};

    /* renamed from: e  reason: collision with other field name */
    public float[] f3552e = {0.0f, 0.0f};

    /* renamed from: X  reason: collision with other field name */
    public float[] f3549X = {Float.MAX_VALUE, Float.MAX_VALUE};
    public int e = 1;
    public int X = O;

    public flU(ListView listView) {
        Pe pe = new Pe();
        this.R = pe;
        this.f3542R = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f3549X;
        float f2 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.f3552e;
        float f3 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        float[] fArr3 = this.f3553v;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f3547R;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f3550c;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        pe.f386R = 500;
        pe.f390v = 500;
        this.f3544R = listView;
    }

    public static float v(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean O() {
        /*
            r7 = this;
            Pe r0 = r7.R
            float r1 = r0.v
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.R
            java.lang.Math.abs(r0)
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x004e
            android.widget.ListView r7 = r7.f3544R
            int r3 = r7.getCount()
            if (r3 != 0) goto L_0x001c
            goto L_0x004b
        L_0x001c:
            int r4 = r7.getChildCount()
            int r5 = r7.getFirstVisiblePosition()
            int r6 = r5 + r4
            if (r1 <= 0) goto L_0x003a
            if (r6 < r3) goto L_0x0049
            int r4 = r4 - r0
            android.view.View r1 = r7.getChildAt(r4)
            int r1 = r1.getBottom()
            int r7 = r7.getHeight()
            if (r1 > r7) goto L_0x0049
            goto L_0x004b
        L_0x003a:
            if (r1 >= 0) goto L_0x004b
            if (r5 > 0) goto L_0x0049
            android.view.View r7 = r7.getChildAt(r2)
            int r7 = r7.getTop()
            if (r7 < 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r7 = r0
            goto L_0x004c
        L_0x004b:
            r7 = r2
        L_0x004c:
            if (r7 != 0) goto L_0x004f
        L_0x004e:
            r0 = r2
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flU.O():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float R(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f3547R
            r0 = r0[r4]
            float[] r1 = r3.f3553v
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = v(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0025
            android.view.animation.AccelerateInterpolator r6 = r3.f3543R
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002f
        L_0x0025:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0038
            android.view.animation.AccelerateInterpolator r6 = r3.f3543R
            float r5 = r6.getInterpolation(r5)
        L_0x002f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = v(r5, r6, r0)
            goto L_0x0039
        L_0x0038:
            r5 = r2
        L_0x0039:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003e
            goto L_0x005a
        L_0x003e:
            float[] r0 = r3.f3550c
            r0 = r0[r4]
            float[] r1 = r3.f3552e
            r1 = r1[r4]
            float[] r3 = r3.f3549X
            r3 = r3[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0053
            float r5 = r5 * r0
            float r2 = v(r5, r1, r3)
            goto L_0x005a
        L_0x0053:
            float r4 = -r5
            float r4 = r4 * r0
            float r3 = v(r4, r1, r3)
            float r2 = -r3
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flU.R(int, float, float, float):float");
    }

    public final void X() {
        int i = 0;
        if (this.v) {
            this.f3551e = false;
            return;
        }
        Pe pe = this.R;
        pe.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - pe.f387R);
        int i3 = pe.f390v;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        pe.f388c = i;
        pe.c = pe.R(currentAnimationTimeMillis);
        pe.f389c = currentAnimationTimeMillis;
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.e;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f3551e || i != 1) ? 0.0f : 1.0f;
            }
            return 0.0f;
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        } else {
            return 0.0f;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3548X
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0080
        L_0x0016:
            r5.X()
            goto L_0x0080
        L_0x001a:
            r5.c = r2
            r5.f3546R = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3542R
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.R(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3542R
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.R(r2, r7, r6, r3)
            Pe r7 = r5.R
            r7.R = r0
            r7.v = r6
            boolean r6 = r5.f3551e
            if (r6 != 0) goto L_0x0080
            boolean r6 = r5.O()
            if (r6 == 0) goto L_0x0080
            k0f r6 = r5.f3545R
            if (r6 != 0) goto L_0x0062
            k0f r6 = new k0f
            r7 = 5
            r6.<init>(r7, r5)
            r5.f3545R = r6
        L_0x0062:
            r5.f3551e = r2
            r5.v = r2
            boolean r6 = r5.f3546R
            if (r6 != 0) goto L_0x0079
            int r6 = r5.X
            if (r6 <= 0) goto L_0x0079
            android.view.View r7 = r5.f3542R
            k0f r0 = r5.f3545R
            long r3 = (long) r6
            java.util.WeakHashMap r6 = defpackage.of5.f6887R
            defpackage.mHC.N(r7, r0, r3)
            goto L_0x007e
        L_0x0079:
            k0f r6 = r5.f3545R
            r6.run()
        L_0x007e:
            r5.f3546R = r2
        L_0x0080:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flU.e(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        e(view, motionEvent);
        return false;
    }
}
