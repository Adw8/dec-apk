package defpackage;

import android.hardware.usb.UsbDevice;
import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel;

/* renamed from: igu  reason: default package */
/* loaded from: classes.dex */
public final class igu extends k8G implements f_c {
    public final /* synthetic */ UsbDevice R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ UsbViewModel f4694R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f4695R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4696R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public igu(boolean z, UsbViewModel usbViewModel, UsbDevice usbDevice, kg9 kg9) {
        super(0);
        this.f4696R = z;
        this.f4694R = usbViewModel;
        this.R = usbDevice;
        this.f4695R = kg9;
    }

    @Override // defpackage.f_c
    public final Object g() {
        boolean z = this.f4696R;
        UsbViewModel usbViewModel = this.f4694R;
        UsbDevice usbDevice = this.R;
        kg9 kg9 = this.f4695R;
        if (z) {
            usbViewModel.getClass();
            l6.z(gvP.o(usbViewModel), iFn.f4518R, 0, new pu4(usbViewModel, usbDevice, null), 2);
        } else {
            kg9.x(usbDevice);
        }
        return o8s.R;
    }
}
