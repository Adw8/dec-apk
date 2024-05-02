package defpackage;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: juL  reason: default package */
/* loaded from: classes.dex */
public final class juL {

    /* renamed from: R  reason: collision with other field name */
    public int f5098R;
    public int c;

    /* renamed from: c  reason: collision with other field name */
    public final Paint f5101c;
    public final Paint e;

    /* renamed from: v  reason: collision with other field name */
    public int f5102v;

    /* renamed from: v  reason: collision with other field name */
    public final Paint f5103v;

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f5096R = new int[3];
    public static final float[] R = {0.0f, 0.5f, 1.0f};

    /* renamed from: v  reason: collision with other field name */
    public static final int[] f5097v = new int[4];
    public static final float[] v = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: R  reason: collision with other field name */
    public final Path f5100R = new Path();

    /* renamed from: R  reason: collision with other field name */
    public final Paint f5099R = new Paint();

    public juL() {
        Paint paint = new Paint();
        this.e = paint;
        R(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f5103v = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f5101c = new Paint(paint2);
    }

    public final void R(int i) {
        this.f5098R = B7.c(i, 68);
        this.f5102v = B7.c(i, 20);
        this.c = B7.c(i, 0);
        this.f5099R.setColor(this.f5098R);
    }
}
