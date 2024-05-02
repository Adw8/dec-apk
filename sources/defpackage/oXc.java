package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel;

/* renamed from: oXc  reason: default package */
/* loaded from: classes.dex */
public final class oXc extends aFk implements iv7 {
    public final /* synthetic */ UsbViewModel R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oXc(UsbViewModel usbViewModel, aOO aoo) {
        super(2, aoo);
        this.R = usbViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((oXc) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        UsbViewModel usbViewModel = this.R;
        usbViewModel.f2789R.H(dF.pG(usbViewModel.f2790R.f5713R.getDeviceList().values()));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new oXc(this.R, aoo);
    }
}
