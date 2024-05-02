package defpackage;

import android.app.Application;
import android.app.Service;

/* renamed from: mk6  reason: default package */
/* loaded from: classes.dex */
public final class mk6 implements iLf {
    public final Service R;

    /* renamed from: R  reason: collision with other field name */
    public gV1 f6143R;

    public mk6(Service service) {
        this.R = service;
    }

    @Override // defpackage.iLf
    public final Object R() {
        if (this.f6143R == null) {
            Application application = this.R.getApplication();
            hDC.L(application instanceof iLf, "Hilt service must be attached to an @AndroidEntryPoint Application. Found: %s", application.getClass());
            jsT jst = new jsT(((fMX) ((dBp) hDC.C(dBp.class, application))).f3396R);
            Service service = this.R;
            service.getClass();
            jst.v = service;
            this.f6143R = new gV1((fMX) jst.R, service);
        }
        return this.f6143R;
    }
}
