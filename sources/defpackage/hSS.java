package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: hSS  reason: default package */
/* loaded from: classes.dex */
public final class hSS extends MetricAffectingSpan {
    public final Typeface R;

    public hSS(Typeface typeface) {
        this.R = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.R);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.R);
    }
}
