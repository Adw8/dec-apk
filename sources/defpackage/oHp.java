package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* renamed from: oHp  reason: default package */
/* loaded from: classes.dex */
public final class oHp {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f6723R;

    /* renamed from: R  reason: collision with other field name */
    public final Paint f6724R;

    /* renamed from: R  reason: collision with other field name */
    public final Typeface f6725R;

    /* renamed from: R  reason: collision with other field name */
    public final float[] f6726R = new float[127];
    public final int c;
    public final int e;
    public final int v;

    public oHp(Typeface typeface, int i) {
        Paint paint = new Paint();
        this.f6724R = paint;
        this.f6723R = i;
        this.f6725R = typeface;
        paint.setTypeface(typeface);
        paint.setAntiAlias(true);
        paint.setTextSize((float) i);
        int ceil = (int) Math.ceil((double) paint.getFontSpacing());
        this.v = ceil;
        int ceil2 = (int) Math.ceil((double) paint.ascent());
        this.c = ceil2;
        this.e = ceil + ceil2;
        this.R = paint.measureText("X");
        StringBuilder sb = new StringBuilder(" ");
        for (int i2 = 0; i2 < this.f6726R.length; i2++) {
            sb.setCharAt(0, (char) i2);
            this.f6726R[i2] = this.f6724R.measureText(sb, 0, 1);
        }
    }

    public final void R(Canvas canvas, char[] cArr, int[] iArr, float f, int i, int i2, int i3, int i4, float f2, int i5, int i6, long j, boolean z, boolean z2) {
        int i7;
        boolean z3;
        float f3;
        float f4;
        float f5;
        boolean z4;
        int i8;
        float f6;
        int i9 = ffC.R;
        int i10 = (j & 512) == 0 ? (int) ((j >>> 40) & 511) : ((int) ((j >>> 40) & 16777215)) | -16777216;
        int i11 = (int) (j & 2047);
        int i12 = (j & 1024) == 0 ? (int) ((j >>> 16) & 511) : ((int) ((j >>> 16) & 16777215)) | -16777216;
        boolean z5 = (i11 & 9) != 0;
        boolean z6 = (i11 & 4) != 0;
        boolean z7 = (i11 & 2) != 0;
        boolean z8 = (i11 & 64) != 0;
        boolean z9 = (i11 & 256) != 0;
        if ((i10 & -16777216) != -16777216) {
            i10 = iArr[i10];
        }
        if ((i12 & -16777216) != -16777216) {
            i12 = iArr[i12];
        }
        if (z2) {
            i12 = iArr[259];
        }
        if (z ^ ((i11 & 16) != 0)) {
            i7 = i12;
        } else {
            i7 = i10;
            i10 = i12;
        }
        float f7 = this.R;
        float f8 = ((float) i) * f7;
        float f9 = (float) i2;
        float f10 = (f9 * f7) + f8;
        float f11 = f2 / f7;
        if (((double) Math.abs(f11 - f9)) > 0.01d) {
            canvas.save();
            canvas.scale(f9 / f11, 1.0f);
            float f12 = f11 / f9;
            f3 = f8 * f12;
            f4 = f10 * f12;
            z3 = true;
        } else {
            f3 = f8;
            f4 = f10;
            z3 = false;
        }
        if (i10 != iArr[257]) {
            this.f6724R.setColor(i10);
            f5 = f4;
            i8 = i7;
            z4 = z8;
            canvas.drawRect(f3, (f - ((float) this.e)) + ((float) this.c), f5, f, this.f6724R);
        } else {
            f5 = f4;
            i8 = i7;
            z4 = z8;
        }
        if (i5 != 0) {
            this.f6724R.setColor(i5);
            float f13 = (float) (this.e - this.c);
            if (i6 == 1) {
                f13 = (float) (((double) f13) / 4.0d);
                f6 = f5;
            } else {
                f6 = i6 == 2 ? (float) (((double) f5) - (((double) ((f5 - f3) * 3.0f)) / 4.0d)) : f5;
            }
            canvas.drawRect(f3, f - f13, f6, f, this.f6724R);
        }
        if ((i11 & 32) == 0) {
            int i13 = z9 ? ((((((i8 >> 16) & 255) * 2) / 3) << 16) - 16777216) + (((((i8 >> 8) & 255) * 2) / 3) << 8) + (((i8 & 255) * 2) / 3) : i8;
            this.f6724R.setFakeBoldText(z5);
            this.f6724R.setUnderlineText(z6);
            this.f6724R.setTextSkewX(z7 ? -0.35f : 0.0f);
            this.f6724R.setStrikeThruText(z4);
            this.f6724R.setColor(i13);
            canvas.drawText(cArr, i3, i4, f3, f - ((float) this.e), this.f6724R);
        }
        if (z3) {
            canvas.restore();
        }
    }
}
