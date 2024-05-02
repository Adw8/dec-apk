package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {
    public int O;
    public double R;

    /* renamed from: R  reason: collision with other field name */
    public final float f2397R;

    /* renamed from: R  reason: collision with other field name */
    public final Paint f2398R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2401R;
    public final int X;
    public final int e;
    public float v;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f2400R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final RectF f2399R = new RectF();

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f2398R = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hDC.C, R.attr.materialClockStyle, 2132018243);
        this.O = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.X = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f2397R = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        R(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = of5.f6887R;
        mHC.t(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final void R(float f) {
        v(f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.f2398R.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.O) * ((float) Math.cos(this.R))) + f, (((float) this.O) * ((float) Math.sin(this.R))) + f2, (float) this.e, this.f2398R);
        double sin = Math.sin(this.R);
        double cos = Math.cos(this.R);
        double d = (double) ((float) (this.O - this.e));
        this.f2398R.setStrokeWidth((float) this.X);
        canvas.drawLine(f, f2, (float) (width + ((int) (cos * d))), (float) (height + ((int) (d * sin))), this.f2398R);
        canvas.drawCircle(f, f2, this.f2397R, this.f2398R);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        R(this.v);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f2401R = false;
            z2 = false;
            z = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f2401R;
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f2401R;
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (y - ((float) (getHeight() / 2))), (double) (x - ((float) (getWidth() / 2)))))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f = (float) degrees;
        boolean z5 = this.v != f;
        if (!z || !z5) {
            if (z5 || z2) {
                R(f);
            }
            this.f2401R = z4 | z3;
            return true;
        }
        z3 = true;
        this.f2401R = z4 | z3;
        return true;
    }

    public final void v(float f) {
        float f2 = f % 360.0f;
        this.v = f2;
        this.R = Math.toRadians((double) (f2 - 90.0f));
        float cos = (((float) this.O) * ((float) Math.cos(this.R))) + ((float) (getWidth() / 2));
        float sin = (((float) this.O) * ((float) Math.sin(this.R))) + ((float) (getHeight() / 2));
        RectF rectF = this.f2399R;
        float f3 = (float) this.e;
        rectF.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.f2400R.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((_T) it.next());
            if (Math.abs(clockFaceView.R - f2) > 0.001f) {
                clockFaceView.R = f2;
                clockFaceView.N();
            }
        }
        invalidate();
    }
}
