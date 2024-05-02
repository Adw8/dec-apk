package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: iqc  reason: default package */
/* loaded from: classes.dex */
public final class iqc extends CharacterStyle {
    public final boolean R;
    public final boolean v;

    public iqc(boolean z, boolean z2) {
        this.R = z;
        this.v = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.R);
        textPaint.setStrikeThruText(this.v);
    }
}
