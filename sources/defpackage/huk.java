package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: huk  reason: default package */
/* loaded from: classes.dex */
public final class huk extends MetricAffectingSpan {
    public final float R;

    public huk(float f) {
        this.R = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (!(textScaleX == 0.0f)) {
            textPaint.setLetterSpacing(this.R / textScaleX);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (!(textScaleX == 0.0f)) {
            textPaint.setLetterSpacing(this.R / textScaleX);
        }
    }
}
