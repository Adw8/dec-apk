package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.view.KeyEvent;
import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbFragment;
import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel;
import java.util.Collections;

/* renamed from: mCa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mCa extends nZL implements kg9 {
    public final /* synthetic */ int O;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mCa(int i, Object obj) {
        super(obj, UsbFragment.class, "attach", "attach(Landroid/hardware/usb/UsbDevice;)V", 0);
        this.O = i;
        switch (i) {
            case 1:
                super(obj, gWD.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                return;
            case 2:
                super(obj, msU.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
                return;
            case 3:
                super(obj, iRR.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
                return;
            case 4:
                super(obj, kzs.class, "onFocusEvent", "onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V", 0);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                super(obj, gAN.class, "scrollBy", "scrollBy(F)F", 0);
                return;
            case 6:
                super(obj, gAN.class, "scrollBy", "scrollBy(F)F", 0);
                return;
            case 7:
                return;
            default:
                super(obj, kVD.class, "onFrame", "onFrame(J)V", 0);
                return;
        }
    }

    public final Float L(float f) {
        switch (this.O) {
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return Float.valueOf(((gAN) ((Z5) this).f660R).R(f));
            default:
                return Float.valueOf(((gAN) ((Z5) this).f660R).R(f));
        }
    }

    public final long Z(int i) {
        switch (this.O) {
            case 2:
                CharSequence charSequence = (CharSequence) ((Z5) this).f660R;
                int i2 = i - 1;
                while (true) {
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        if (charSequence.charAt(i3) != '\n') {
                            i2 = i3;
                        }
                    } else {
                        i2 = 0;
                    }
                }
                int i4 = i + 1;
                int length = charSequence.length();
                while (true) {
                    if (i4 >= length) {
                        i4 = charSequence.length();
                    } else if (charSequence.charAt(i4) != '\n') {
                        i4++;
                    }
                }
                return dtx.e(i2, i4);
            default:
                return ((iRR) ((Z5) this).f660R).N(i);
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        boolean z;
        boolean z2;
        aaz L;
        boolean z3 = true;
        switch (this.O) {
            case 0:
                long longValue = ((Number) obj).longValue();
                kVD kvd = (kVD) ((Z5) this).f660R;
                if (kvd.R == Long.MIN_VALUE) {
                    kvd.R = longValue;
                }
                long j = longValue - kvd.R;
                biT bit = kvd.f5314R;
                int i = bit.e;
                if (i > 0) {
                    Object[] objArr = bit.f1772R;
                    z2 = true;
                    int i2 = 0;
                    do {
                        ija ija = (ija) objArr[i2];
                        if (!ija.f4705R) {
                            ija.f4702R.f5315R.R(Boolean.FALSE);
                            if (ija.f4706v) {
                                ija.f4706v = false;
                                ija.R = j;
                            }
                            long j2 = j - ija.R;
                            ija.f4704R.R(ija.f4699R.X(j2));
                            hgI hgi = ija.f4699R;
                            hgi.getClass();
                            ija.f4705R = o02.g(hgi, j2);
                        }
                        if (!ija.f4705R) {
                            z2 = false;
                        }
                        i2++;
                    } while (i2 < i);
                } else {
                    z2 = true;
                }
                kvd.v.R(Boolean.valueOf(!z2));
                return o8s.R;
            case 1:
                KeyEvent keyEvent = ((pxb) obj).R;
                gWD gwd = (gWD) ((Z5) this).f660R;
                gwd.getClass();
                k77 k77 = keyEvent.getAction() == 0 && keyEvent.getUnicodeChar() != 0 ? new k77(new StringBuilder().appendCodePoint(keyEvent.getUnicodeChar()).toString(), 1) : null;
                if (k77 != null) {
                    if (gwd.f3778R) {
                        gwd.R(Collections.singletonList(k77));
                        gwd.f3777R.R = null;
                        return Boolean.valueOf(z3);
                    }
                    z3 = false;
                    return Boolean.valueOf(z3);
                }
                if ((dTl.z(keyEvent) == 2) && (L = ((qy) gwd.f3771R).L(keyEvent)) != null && (!L.f930R || gwd.f3778R)) {
                    oJx ojx = new oJx();
                    ojx.R = true;
                    ofd ofd = new ofd(L, gwd, ojx, 10);
                    d5M d5m = gwd.f3773R;
                    n4U n4u = new n4U(d5m, gwd.R, gwd.f3775R.c(), gwd.f3777R);
                    ofd.x(n4u);
                    if (!odN.R(n4u.v, gwd.f3773R.R) || !n3x.v(n4u.f6287v, gwd.f3773R.f2488R)) {
                        gwd.f3776R.x(d5M.R(d5m, n4u.f6287v, n4u.v, 4));
                    }
                    d5K d5k = gwd.f3772R;
                    if (d5k != null) {
                        d5k.f2486R = true;
                    }
                    z3 = ojx.R;
                    return Boolean.valueOf(z3);
                }
                z3 = false;
                return Boolean.valueOf(z3);
            case 2:
                return new odN(Z(((Number) obj).intValue()));
            case 3:
                return new odN(Z(((Number) obj).intValue()));
            case 4:
                okg okg = (okg) obj;
                ((kzs) ((Z5) this).f660R).n();
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return L(((Number) obj).floatValue());
            case 6:
                return L(((Number) obj).floatValue());
            default:
                UsbDevice usbDevice = (UsbDevice) obj;
                UsbFragment usbFragment = (UsbFragment) ((Z5) this).f660R;
                int i3 = UsbFragment.x;
                usbFragment.getClass();
                pby[] pbyArr = kxm.R;
                UsbViewModel D = usbFragment.D();
                if (D.R.hasPermission(usbDevice)) {
                    D.e(usbDevice);
                    z = true;
                } else {
                    kxm.v(cUF.v(D), 4, "Request USB attach permission", null);
                    z = false;
                }
                if (!z) {
                    PendingIntent broadcast = PendingIntent.getBroadcast(usbFragment.k(), 0, new Intent("dev.kdrag0n.virtcontainer.USB_PERMISSION_RESULT"), 33554432);
                    usbFragment.k().registerReceiver(usbFragment.R, new IntentFilter("dev.kdrag0n.virtcontainer.USB_PERMISSION_RESULT"));
                    usbFragment.t = true;
                    usbFragment.D().R.requestPermission(usbDevice, broadcast);
                }
                return o8s.R;
        }
    }
}
