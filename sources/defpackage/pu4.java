package defpackage;

import android.hardware.usb.UsbDevice;
import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel;

/* renamed from: pu4  reason: default package */
/* loaded from: classes.dex */
public final class pu4 extends aFk implements iv7 {
    public final /* synthetic */ UsbDevice R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ UsbViewModel f7301R;

    /* renamed from: R  reason: collision with other field name */
    public hgO f7302R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pu4(UsbViewModel usbViewModel, UsbDevice usbDevice, aOO aoo) {
        super(2, aoo);
        this.f7301R = usbViewModel;
        this.R = usbDevice;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((pu4) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Throwable th;
        hgO hgo;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            UsbViewModel usbViewModel = this.f7301R;
            hgO hgo2 = usbViewModel.f2790R.f5714R;
            UsbDevice usbDevice = this.R;
            if (hgo2.v(null)) {
                try {
                    lP2 lp2 = usbViewModel.f2790R;
                    this.f7302R = hgo2;
                    this.X = 1;
                    if (lp2.v(usbDevice) == bgr) {
                        return bgr;
                    }
                    hgo = hgo2;
                } catch (Throwable th2) {
                    th = th2;
                    hgo = hgo2;
                    hgo.c(null);
                    throw th;
                }
            }
            return o8s.R;
        } else if (i == 1) {
            hgo = this.f7302R;
            try {
                jjU.o(obj);
            } catch (Throwable th3) {
                th = th3;
                hgo.c(null);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hgo.c(null);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new pu4(this.f7301R, this.R, aoo);
    }
}
