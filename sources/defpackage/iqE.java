package defpackage;

import java.io.Closeable;
import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: iqE  reason: default package */
/* loaded from: classes.dex */
public final class iqE extends f1 {
    public final /* synthetic */ pkd R;

    public iqE(pkd pkd) {
        this.R = pkd;
    }

    @Override // defpackage.f1
    public final kvj e(Class cls, nmx nmx) {
        cTl ctl = new cTl();
        piu piu = (piu) this.R;
        piu.getClass();
        nmx.getClass();
        piu.c = nmx;
        piu.e = ctl;
        gmN gmn = (gmN) ((jW4) hDC.C(jW4.class, new gmN((fMX) piu.f7202R, (dYv) piu.f7203v)));
        gmn.getClass();
        eyh eyh = new eyh(0);
        eyh.R.put("dev.kdrag0n.app.ui.onboarding.adb.dev.AdbDevOptionsViewModel", gmn.R);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairViewModel", gmn.v);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.onboarding.config.ConfigViewModel", gmn.c);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.create.CreateViewModel", gmn.e);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.settings.debug.DebugSettingsViewModel", gmn.X);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.onboarding.support.DeviceSupportViewModel", gmn.O);
        eyh.R.put("dev.kdrag0n.app.ui.drm.LicenseInvalidViewModel", gmn.L);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.main.MainSharedViewModel", gmn.Z);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.main.MainViewModel", gmn.m);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.onboarding.OnboardingSharedViewModel", gmn.x);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.onboarding.OnboardingViewModel", gmn.H);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel", gmn.U);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel", gmn.C);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.settings.forward.PortForwardViewModel", gmn.N);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel", gmn.P);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel", gmn.j);
        eyh.R.put("dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel", gmn.g);
        lXY lxy = (lXY) (eyh.R.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(eyh.R)).get(cls.getName());
        if (lxy != null) {
            kvj kvj = (kvj) lxy.get();
            hi_ hi_ = new Closeable() { // from class: hi_
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    cTl.this.R();
                }
            };
            LinkedHashSet linkedHashSet = kvj.f5480R;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    kvj.f5480R.add(hi_);
                }
            }
            return kvj;
        }
        StringBuilder U = opT.U("Expected the @HiltViewModel-annotated class '");
        U.append(cls.getName());
        U.append("' to be available in the multi-binding of @HiltViewModelMap but none was found.");
        throw new IllegalStateException(U.toString());
    }
}
