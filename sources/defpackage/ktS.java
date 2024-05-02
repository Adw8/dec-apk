package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: ktS  reason: default package */
/* loaded from: classes.dex */
public final class ktS implements haQ, lQB, gwr, dHp, gfw, kdF, fJm {
    public final dYv R;

    /* renamed from: R  reason: collision with other field name */
    public final fMX f5456R;

    /* renamed from: R  reason: collision with other field name */
    public final ktS f5457R = this;

    /* renamed from: R  reason: collision with other field name */
    public lXY f5458R;

    public ktS(fMX fmx, dYv dyv) {
        this.f5456R = fmx;
        this.R = dyv;
        this.f5458R = pbD.R(new oQM(fmx, 0, 0));
    }

    public final jsT R() {
        ArrayList arrayList = new ArrayList(17);
        arrayList.add("dev.kdrag0n.app.ui.onboarding.adb.dev.AdbDevOptionsViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.onboarding.config.ConfigViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.create.CreateViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.settings.debug.DebugSettingsViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.onboarding.support.DeviceSupportViewModel");
        arrayList.add("dev.kdrag0n.app.ui.drm.LicenseInvalidViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.main.MainSharedViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.main.MainViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.onboarding.OnboardingSharedViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.onboarding.OnboardingViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.settings.forward.PortForwardViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel");
        arrayList.add("dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel");
        return new jsT(arrayList.isEmpty() ? Collections.emptySet() : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList)), new piu(this.f5456R, this.R, 0));
    }
}
