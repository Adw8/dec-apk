package defpackage;

import android.hardware.usb.UsbDevice;
import android.os.ParcelFileDescriptor;
import dev.kdrag0n.virt.NativeLib;

/* renamed from: ncI  reason: default package */
/* loaded from: classes.dex */
public final class ncI extends k8G implements lR3 {
    public final /* synthetic */ int O;
    public final /* synthetic */ UsbDevice R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dp f6484R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f6485R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lP2 f6486R;
    public final /* synthetic */ int X;
    public final /* synthetic */ String c;
    public final /* synthetic */ String e;
    public final /* synthetic */ String v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ncI(jy_ jy_, dp dpVar, int i, String str, lP2 lp2, UsbDevice usbDevice, String str2, String str3, String str4, int i2) {
        super(3);
        this.f6484R = dpVar;
        this.X = i;
        this.f6485R = str;
        this.f6486R = lp2;
        this.R = usbDevice;
        this.v = str2;
        this.c = str3;
        this.e = str4;
        this.O = i2;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        String str = (String) obj2;
        String str2 = (String) obj3;
        String str3 = this.v;
        String str4 = this.c;
        String str5 = this.e;
        int i = this.O;
        kxm.v("virtc/usbman", 4, "USB [" + str3 + ":" + str4 + ", " + str5 + ", " + i + "] client connected", null);
        int detachFd = ((ParcelFileDescriptor) obj).detachFd();
        this.f6484R.R = detachFd;
        int k = NativeLib.k(detachFd, this.X, this.f6485R);
        this.f6484R.R = -1;
        String str6 = this.v;
        String str7 = this.c;
        String str8 = this.e;
        int i2 = this.O;
        kxm.v("virtc/usbman", 4, "USB [" + str6 + ":" + str7 + ", " + str8 + ", " + i2 + "] connection closed: " + k, null);
        ivW ivw = this.f6486R.f5716R;
        ivw.H(dF.cr((Iterable) ivw.getValue(), this.R));
        return Boolean.FALSE;
    }
}
