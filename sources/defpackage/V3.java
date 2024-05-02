package defpackage;

import android.hardware.usb.UsbDevice;
import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel;

/* renamed from: V3  reason: default package */
/* loaded from: classes.dex */
public final class V3 extends k8G implements kg9 {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f572R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V3(boolean z, Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.X = i;
        this.f572R = z;
        this.R = obj;
        this.v = obj2;
        this.c = obj3;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 1:
                dlc dlc = (dlc) obj;
                if (!this.f572R) {
                    l6.z((jy_) this.R, null, 0, new gpj((p2E) this.c, (h0T) this.v, null), 3);
                }
                return new k7S(0);
            default:
                ((Boolean) obj).booleanValue();
                boolean z = this.f572R;
                UsbViewModel usbViewModel = (UsbViewModel) this.R;
                UsbDevice usbDevice = (UsbDevice) this.v;
                kg9 kg9 = (kg9) this.c;
                if (z) {
                    usbViewModel.getClass();
                    l6.z(gvP.o(usbViewModel), iFn.f4518R, 0, new pu4(usbViewModel, usbDevice, null), 2);
                } else {
                    kg9.x(usbDevice);
                }
                return o8s.R;
        }
    }
}
