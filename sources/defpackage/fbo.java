package defpackage;

import android.hardware.usb.UsbDevice;

/* renamed from: fbo  reason: default package */
/* loaded from: classes.dex */
public final class fbo extends aFk implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ UsbDevice R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dp f3465R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3466R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f3467R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lP2 f3468R;
    public int X;
    public final /* synthetic */ String c;
    public final /* synthetic */ String e;
    public final /* synthetic */ String v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fbo(lP2 lp2, int i, dp dpVar, int i2, String str, UsbDevice usbDevice, String str2, String str3, String str4, aOO aoo) {
        super(2, aoo);
        this.f3468R = lp2;
        this.O = i;
        this.f3465R = dpVar;
        this.L = i2;
        this.f3467R = str;
        this.R = usbDevice;
        this.v = str2;
        this.c = str3;
        this.e = str4;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fbo) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            jy_ jy_ = (jy_) this.f3466R;
            lP2 lp2 = this.f3468R;
            iHI ihi = lp2.f5715R;
            int i2 = this.O;
            ncI nci = new ncI(jy_, this.f3465R, this.L, this.f3467R, lp2, this.R, this.v, this.c, this.e, i2);
            this.X = 1;
            if (ihi.L(i2, nci, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        fbo fbo = new fbo(this.f3468R, this.O, this.f3465R, this.L, this.f3467R, this.R, this.v, this.c, this.e, aoo);
        fbo.f3466R = obj;
        return fbo;
    }
}
