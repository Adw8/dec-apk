package defpackage;

import dev.kdrag0n.virtcontainer.CustomApplication;
import java.util.Collections;

/* renamed from: lOp  reason: default package */
/* loaded from: classes.dex */
public abstract class lOp extends pF implements iLf {

    /* renamed from: R  reason: collision with other field name */
    public boolean f5712R = false;
    public final DJ R = new DJ(new Zz(this));

    @Override // defpackage.iLf
    public final Object R() {
        return this.R.R();
    }

    @Override // defpackage.pF, android.app.Application
    public void onCreate() {
        if (!this.f5712R) {
            this.f5712R = true;
            CustomApplication customApplication = (CustomApplication) this;
            fMX fmx = (fMX) ((co9) R());
            m5f m5f = (m5f) fmx.N.get();
            ((pF) customApplication).f7069R = new glK(Collections.singletonMap("dev.kdrag0n.app.data.SettingsUpdateWorker", fmx.i));
            ((pF) customApplication).f7070R = (hVj) fmx.V.get();
            ((pF) customApplication).R = (F4) fmx.f3397R.get();
            ((pF) customApplication).f7071R = new nax(mSI.R(fmx.R), (F4) fmx.f3397R.get());
        }
        super.onCreate();
    }
}
