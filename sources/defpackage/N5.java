package defpackage;

import android.graphics.Typeface;

/* renamed from: N5  reason: default package */
/* loaded from: classes.dex */
public final class N5 extends n1P {
    public final Typeface R;

    /* renamed from: R  reason: collision with other field name */
    public final uE f308R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f309R;

    public N5(uE uEVar, Typeface typeface) {
        this.R = typeface;
        this.f308R = uEVar;
    }

    @Override // defpackage.n1P
    public final void V(Typeface typeface, boolean z) {
        if (!this.f309R) {
            this.f308R.v(typeface);
        }
    }

    @Override // defpackage.n1P
    public final void t(int i) {
        Typeface typeface = this.R;
        if (!this.f309R) {
            this.f308R.v(typeface);
        }
    }
}
