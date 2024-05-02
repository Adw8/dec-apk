package defpackage;

/* renamed from: kvQ  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kvQ implements k3P {
    public final /* synthetic */ goZ R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pd2 f5479R;

    public /* synthetic */ kvQ(goZ goz, pd2 pd2) {
        this.R = goz;
        this.f5479R = pd2;
    }

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        goZ goz = this.R;
        pd2 pd2 = this.f5479R;
        if (nu_.O().f5900R == iMP.DESTROYED) {
            pd2.c(null);
            goz.R();
        } else if (nu_.O().f5900R.compareTo(goz.f3939R) < 0) {
            goz.f3938R.f4429R = true;
        } else {
            hyi hyi = goz.f3938R;
            if (hyi.f4429R) {
                if (true ^ hyi.v) {
                    hyi.f4429R = false;
                    hyi.R();
                    return;
                }
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
        }
    }
}
