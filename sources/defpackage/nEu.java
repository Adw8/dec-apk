package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: nEu  reason: default package */
/* loaded from: classes.dex */
public final class nEu extends CharacterStyle implements UpdateAppearance {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public nqW f6353R;

    /* renamed from: R  reason: collision with other field name */
    public final qD f6354R;

    public nEu(qD qDVar, float f) {
        this.f6354R = qDVar;
        this.R = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            if (this.f6353R != null) {
                textPaint.setShader(this.f6354R.v);
            }
            float f = this.R;
            if (!Float.isNaN(f)) {
                textPaint.setAlpha(mLz.t(caw.m(f, 0.0f, 1.0f) * ((float) 255)));
            }
        }
    }
}
