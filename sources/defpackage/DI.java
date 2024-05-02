package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: DI  reason: default package */
/* loaded from: classes.dex */
public final class DI extends MetricAffectingSpan {
    public final float R;

    public DI(float f) {
        this.R = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.R)));
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.R)));
    }
}
