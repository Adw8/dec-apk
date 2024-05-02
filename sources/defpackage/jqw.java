package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: jqw  reason: default package */
/* loaded from: classes.dex */
public final class jqw extends MetricAffectingSpan {
    public final float R;

    public jqw(float f) {
        this.R = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.R);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.R);
    }
}
