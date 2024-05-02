package defpackage;

import android.graphics.Typeface;

/* renamed from: ekY  reason: default package */
/* loaded from: classes.dex */
public final class ekY extends n1P {
    public final /* synthetic */ cod R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n1P f3192R;

    public ekY(cod cod, n1P n1p) {
        this.R = cod;
        this.f3192R = n1p;
    }

    @Override // defpackage.n1P
    public final void i(Typeface typeface) {
        cod cod = this.R;
        cod.f2197R = Typeface.create(typeface, cod.f2195R);
        cod cod2 = this.R;
        cod2.f2203v = true;
        this.f3192R.V(cod2.f2197R, false);
    }

    @Override // defpackage.n1P
    public final void t(int i) {
        this.R.f2203v = true;
        this.f3192R.t(i);
    }
}
