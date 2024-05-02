package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;

/* renamed from: cLN  reason: default package */
/* loaded from: classes.dex */
public final class cLN extends ReplacementSpan {

    /* renamed from: R  reason: collision with other field name */
    public final iYb f2075R;

    /* renamed from: R  reason: collision with other field name */
    public final Paint.FontMetricsInt f2074R = new Paint.FontMetricsInt();
    public float R = 1.0f;

    public cLN(iYb iyb) {
        if (iyb != null) {
            this.f2075R = iyb;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    /* renamed from: R */
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2074R);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2074R;
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        a8Z e = this.f2075R.e();
        int R = e.R(14);
        short s = 0;
        this.R = abs / ((float) (R != 0 ? ((kY7) e).f5345R.getShort(R + ((kY7) e).R) : 0));
        a8Z e2 = this.f2075R.e();
        int R2 = e2.R(14);
        if (R2 != 0) {
            ((kY7) e2).f5345R.getShort(R2 + ((kY7) e2).R);
        }
        a8Z e3 = this.f2075R.e();
        int R3 = e3.R(12);
        if (R3 != 0) {
            s = ((kY7) e3).f5345R.getShort(R3 + ((kY7) e3).R);
        }
        short s2 = (short) ((int) (((float) s) * this.R));
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2074R;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        dfg.R().getClass();
        iYb iyb = this.f2075R;
        Typeface typeface = paint.getTypeface();
        paint.setTypeface((Typeface) iyb.f4640R.e);
        int i6 = iyb.f4639R * 2;
        canvas.drawText((char[]) iyb.f4640R.f7203v, i6, 2, f, (float) i4, paint);
        paint.setTypeface(typeface);
    }
}
