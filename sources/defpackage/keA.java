package defpackage;

import java.io.IOException;

/* renamed from: keA  reason: default package */
/* loaded from: classes.dex */
public final class keA implements R4 {
    public final /* synthetic */ Xf R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ oEG f5383R;

    public keA(oEG oeg, Xf xf) {
        this.f5383R = oeg;
        this.R = xf;
    }

    @Override // defpackage.R4
    public final void R(dEt det) {
        try {
            try {
                this.R.R(this.f5383R, this.f5383R.X(det));
            } catch (Throwable th) {
                biy.Y(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            biy.Y(th2);
            try {
                this.R.v(th2);
            } catch (Throwable th3) {
                biy.Y(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // defpackage.R4
    public final void v(IOException iOException) {
        try {
            this.R.v(iOException);
        } catch (Throwable th) {
            biy.Y(th);
            th.printStackTrace();
        }
    }
}
