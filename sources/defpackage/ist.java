package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbFragment;
import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel;

/* renamed from: ist  reason: default package */
/* loaded from: classes.dex */
public final class ist extends aFk implements iv7 {
    public final /* synthetic */ UsbFragment R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ist(UsbFragment usbFragment, aOO aoo) {
        super(2, aoo);
        this.R = usbFragment;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((ist) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0 || i == 1) {
            jjU.o(obj);
            do {
                UsbFragment usbFragment = this.R;
                int i2 = UsbFragment.x;
                UsbViewModel D = usbFragment.D();
                D.getClass();
                l6.z(gvP.o(D), iFn.f4518R, 0, new oXc(D, null), 2);
                this.X = 1;
            } while (n3x.Z(1500, this) != bgr);
            return bgr;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new ist(this.R, aoo);
    }
}
