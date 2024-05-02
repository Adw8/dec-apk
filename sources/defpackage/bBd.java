package defpackage;

import android.media.MediaDrm;
import dev.kdrag0n.app.ui.drm.LicenseInvalidViewModel;
import dev.kdrag0n.virt.vm.ForwardedPort;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.service.VirtService;
import dev.kdrag0n.virtcontainer.ui.onboarding.support.DeviceSupportViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.debug.DebugSettingsViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.net.ssl.SSLContext;

/* renamed from: bBd  reason: default package */
/* loaded from: classes.dex */
public final class bBd extends k8G implements f_c {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bBd(int i, Object obj) {
        super(0);
        this.X = i;
        this.R = obj;
    }

    public final void R() {
        switch (this.X) {
            case 1:
                LicenseInvalidViewModel licenseInvalidViewModel = (LicenseInvalidViewModel) this.R;
                licenseInvalidViewModel.getClass();
                l6.z(gvP.o(licenseInvalidViewModel), null, 0, new m5m(licenseInvalidViewModel, null), 3);
                return;
            case 2:
                try {
                    Object unused = l6.T(aIH.R, new hdy((VirtService) this.R, null));
                    return;
                } catch (Exception e) {
                    kxm.v(cUF.v((VirtService) this.R), 6, "Failed to run emergency shutdown", e);
                    return;
                }
            case 3:
                DeviceSupportViewModel deviceSupportViewModel = (DeviceSupportViewModel) this.R;
                deviceSupportViewModel.getClass();
                l6.z(gvP.o(deviceSupportViewModel), iFn.f4518R, 0, new a15(deviceSupportViewModel, null), 2);
                return;
            case 4:
            default:
                jr5 jr5 = (jr5) this.R;
                jr5.getClass();
                try {
                    jr5.f5032R.Z(2, 0, false);
                    return;
                } catch (IOException e2) {
                    jr5.c(e2);
                    return;
                }
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                PortForwardCreateViewModel portForwardCreateViewModel = (PortForwardCreateViewModel) this.R;
                ForwardedPort X = portForwardCreateViewModel.X();
                if (X != null) {
                    l6.z(gvP.o(portForwardCreateViewModel), null, 0, new cp5(portForwardCreateViewModel, X, null), 3);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.f_c
    public final Object g() {
        int i = this.X;
        boolean z = true;
        switch (i) {
            case 0:
                byte[] propertyByteArray = new MediaDrm((UUID) this.R).getPropertyByteArray(afN.R(-42726361518988L));
                int length = propertyByteArray.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (!(propertyByteArray[i2] == 0)) {
                            z = false;
                        } else {
                            i2++;
                        }
                    }
                }
                if (z) {
                    return null;
                }
                return propertyByteArray;
            case 1:
                R();
                return o8s.R;
            case 2:
                R();
                return o8s.R;
            case 3:
                R();
                return o8s.R;
            case 4:
                eD0 ed0 = ((DebugSettingsViewModel) this.R).f2772R;
                ed0.getClass();
                pby[] pbyArr = kxm.R;
                Tq tq = ed0.f3029R;
                hGS hgs = tq.v;
                icv[] icvArr = Tq.R;
                Integer num = (Integer) ((n1) hgs).c(tq, icvArr[2]);
                if (num != null) {
                    int intValue = num.intValue();
                    Tq tq2 = ed0.f3029R;
                    String str = (String) ((n1) tq2.c).c(tq2, icvArr[3]);
                    if (str != null) {
                        c1p c1p = new c1p(intValue, str);
                        if (intValue != ed0.R) {
                            List w = iH_.w((String) coo.R.invoke(ed0.f3030R.getClassLoader(), "shell"), new String[]{"!/"});
                            String str2 = ed0.f3031R;
                            StringBuilder sb = new StringBuilder();
                            sb.append("rm -f '");
                            sb.append(str2);
                            sb.append("';unzip -pq '");
                            sb.append((String) w.get(0));
                            sb.append("' ");
                            sb.append((String) w.get(1));
                            sb.append(" > '");
                            sb.append(str2);
                            sb.append("';chmod 755 '");
                            String g = jQ.g(sb, str2, "';");
                            synchronized (c1p) {
                                c1p.X(1, g);
                            }
                            String str3 = ed0.f3031R;
                            synchronized (c1p) {
                                c1p.X(3, str3);
                            }
                            Thread.sleep(50);
                            c1p.close();
                            c1p.c();
                        }
                        return c1p;
                    }
                    throw new iYd();
                }
                throw new iYd();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                R();
                return o8s.R;
            case 6:
                return Integer.valueOf(((TerminalViewModel) this.R).f2791R.Z());
            case 7:
                return this.R;
            case VmNativeCallback.$stable /* 8 */:
                SSLContext instance = SSLContext.getInstance("TLSv1.3");
                jY jYVar = (jY) this.R;
                jYVar.getClass();
                zN[] zNVarArr = {new zN(jYVar)};
                ((jY) this.R).getClass();
                instance.init(zNVarArr, new fe[]{new fe()}, new SecureRandom());
                return instance;
            case 9:
                switch (i) {
                    case 9:
                        return (List) this.R;
                    default:
                        List<Certificate> R = ((mxv) this.R).R();
                        ArrayList arrayList = new ArrayList(a6.B(R, 10));
                        for (Certificate certificate : R) {
                            arrayList.add((X509Certificate) certificate);
                        }
                        return arrayList;
                }
            case 10:
                return ((fPH) this.R).R.v();
            default:
                R();
                return o8s.R;
        }
    }
}
