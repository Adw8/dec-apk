package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: fm8  reason: default package */
/* loaded from: classes.dex */
public final class fm8 extends CharacterStyle {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f3555R;
    public final float c;
    public final float v;

    public fm8(int i, float f, float f2, float f3) {
        this.f3555R = i;
        this.R = f;
        this.v = f2;
        this.c = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.c, this.R, this.v, this.f3555R);
    }
}
