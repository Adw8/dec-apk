package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: a7r  reason: default package */
/* loaded from: classes.dex */
public final class a7r implements LineHeightSpan {
    public final float R;

    public a7r(float f) {
        this.R = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i5 > 0) {
            int ceil = (int) ((float) Math.ceil((double) this.R));
            int ceil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((((float) ceil) * 1.0f) / ((float) i5))));
            fontMetricsInt.descent = ceil2;
            fontMetricsInt.ascent = ceil2 - ceil;
        }
    }
}
