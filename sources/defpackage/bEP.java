package defpackage;

import java.io.IOException;

/* renamed from: bEP  reason: default package */
/* loaded from: classes.dex */
public final class bEP implements R4, jeO {
    public final /* synthetic */ k0 R;

    public /* synthetic */ bEP(xx xxVar) {
        this.R = xxVar;
    }

    @Override // defpackage.R4
    public void R(dEt det) {
        ((xx) this.R).Y(det);
    }

    @Override // defpackage.jeO
    public void c(Exception exc) {
        this.R.Y(new bvw(exc));
    }

    @Override // defpackage.R4
    public void v(IOException iOException) {
        ((xx) this.R).Y(new bvw(iOException));
    }
}
