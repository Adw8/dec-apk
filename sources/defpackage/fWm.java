package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: fWm  reason: default package */
/* loaded from: classes.dex */
public final class fWm extends ReplacementSpan {
    public Paint.FontMetricsInt R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3443R;
    public int X;
    public int e;

    public final Paint.FontMetricsInt R() {
        Paint.FontMetricsInt fontMetricsInt = this.R;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        return null;
    }

    public final int c() {
        if (this.f3443R) {
            return this.e;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        boolean z = true;
        this.f3443R = true;
        paint.getTextSize();
        this.R = paint.getFontMetricsInt();
        if (R().descent <= R().ascent) {
            z = false;
        }
        if (z) {
            this.e = (int) ((float) Math.ceil((double) 0.0f));
            this.X = (int) ((float) Math.ceil((double) 0.0f));
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = R().ascent;
                fontMetricsInt.descent = R().descent;
                fontMetricsInt.leading = R().leading;
                if (fontMetricsInt.ascent > (-v())) {
                    fontMetricsInt.ascent = -v();
                }
                fontMetricsInt.top = Math.min(R().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(R().bottom, fontMetricsInt.descent);
            }
            return c();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }

    public final int v() {
        if (this.f3443R) {
            return this.X;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }
}
