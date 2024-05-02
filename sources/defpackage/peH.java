package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: peH  reason: default package */
/* loaded from: classes.dex */
public final class peH extends n1P {
    public final /* synthetic */ Context R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ TextPaint f7153R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ cod f7154R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n1P f7155R;

    public peH(cod cod, Context context, TextPaint textPaint, n1P n1p) {
        this.f7154R = cod;
        this.R = context;
        this.f7153R = textPaint;
        this.f7155R = n1p;
    }

    @Override // defpackage.n1P
    public final void V(Typeface typeface, boolean z) {
        this.f7154R.L(this.R, this.f7153R, typeface);
        this.f7155R.V(typeface, z);
    }

    @Override // defpackage.n1P
    public final void t(int i) {
        this.f7155R.t(i);
    }
}
