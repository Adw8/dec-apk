package defpackage;

import android.content.Context;
import dev.kdrag0n.app.ui.drm.LicenseInvalidViewModel;
import dev.kdrag0n.app.ui.onboarding.adb.dev.AdbDevOptionsViewModel;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.ui.create.CreateViewModel;
import dev.kdrag0n.virtcontainer.ui.main.MainSharedViewModel;
import dev.kdrag0n.virtcontainer.ui.main.MainViewModel;
import dev.kdrag0n.virtcontainer.ui.onboarding.OnboardingSharedViewModel;
import dev.kdrag0n.virtcontainer.ui.onboarding.OnboardingViewModel;
import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairViewModel;
import dev.kdrag0n.virtcontainer.ui.onboarding.config.ConfigViewModel;
import dev.kdrag0n.virtcontainer.ui.onboarding.support.DeviceSupportViewModel;
import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.debug.DebugSettingsViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.forward.PortForwardViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.util.List;

/* renamed from: oQM  reason: default package */
/* loaded from: classes.dex */
public final class oQM implements lXY {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final fMX f6821R;
    public final int v;

    public /* synthetic */ oQM(fMX fmx, int i, int i2) {
        this.R = i2;
        this.f6821R = fmx;
        this.v = i;
    }

    @Override // defpackage.lXY
    public final Object get() {
        switch (this.R) {
            case 0:
                if (this.v == 0) {
                    Context R = mSI.R(this.f6821R.R);
                    Context applicationContext = R.getApplicationContext();
                    if (applicationContext != null) {
                        R = applicationContext;
                    }
                    return new j1V(new gWQ(R));
                }
                throw new AssertionError(this.v);
            default:
                switch (this.v) {
                    case 0:
                        return new AdbDevOptionsViewModel((oLT) this.f6821R.o.get());
                    case 1:
                        return new AdbPairViewModel((gh) this.f6821R.z.get(), new IO(), (oLT) this.f6821R.o.get(), (yd) this.f6821R.u.get());
                    case 2:
                        mSI.R(this.f6821R.R);
                        doT dot = (doT) this.f6821R.c.get();
                        return new ConfigViewModel();
                    case 3:
                        return new CreateViewModel((aME) this.f6821R.Q.get(), (j2f) this.f6821R.S.get());
                    case 4:
                        mSI.R(this.f6821R.R);
                        m5f m5f = (m5f) this.f6821R.N.get();
                        bf5 bf5 = (bf5) this.f6821R.I.get();
                        return new DebugSettingsViewModel((doT) this.f6821R.c.get(), (eD0) this.f6821R.W.get());
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                        String str = (String) Gz.f164R.get(0);
                        List list = Gz.f164R;
                        return new DeviceSupportViewModel();
                    case 6:
                        return new LicenseInvalidViewModel(nak.R(this.f6821R.r));
                    case 7:
                        return new MainSharedViewModel((kdp) this.f6821R.J.get());
                    case VmNativeCallback.$stable:
                        mSI.R(this.f6821R.R);
                        doT dot2 = (doT) this.f6821R.c.get();
                        return new MainViewModel((m5f) this.f6821R.N.get());
                    case 9:
                        return new OnboardingSharedViewModel();
                    case 10:
                        return new OnboardingViewModel(mSI.R(this.f6821R.R), (yd) this.f6821R.u.get(), (doT) this.f6821R.c.get());
                    case lVo.HKDF_SALT_FIELD_NUMBER:
                        return new OverviewViewModel((iHI) this.f6821R.A.get(), (aME) this.f6821R.Q.get(), (m_e) this.f6821R.k.get(), (kdp) this.f6821R.J.get(), (dkr) this.f6821R.p.get());
                    case 12:
                        return new PortForwardCreateViewModel((gkP) this.f6821R.d.get(), (aME) this.f6821R.Q.get());
                    case 13:
                        return new PortForwardViewModel((gkP) this.f6821R.d.get());
                    case 14:
                        return new RootSettingsViewModel(mSI.R(this.f6821R.R), (doT) this.f6821R.c.get(), (m5f) this.f6821R.N.get(), (f1X) this.f6821R.G.get(), nak.R(this.f6821R.r), (j2f) this.f6821R.S.get(), (iHI) this.f6821R.A.get());
                    case 15:
                        return new TerminalViewModel(mSI.R(this.f6821R.R), (aME) this.f6821R.Q.get(), (m_e) this.f6821R.k.get(), (doT) this.f6821R.c.get(), (m5f) this.f6821R.N.get());
                    case 16:
                        return new UsbViewModel((lP2) this.f6821R.B.get());
                    default:
                        throw new AssertionError(this.v);
                }
        }
    }
}
