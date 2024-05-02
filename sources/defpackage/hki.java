package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import dev.kdrag0n.app.ui.drm.LicenseInvalidActivity;
import dev.kdrag0n.app.ui.onboarding.adb.dev.AdbDevOptionsFragment;
import dev.kdrag0n.app.ui.onboarding.adb.dev.AdbDevOptionsViewModel;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.onboarding.support.DeviceSupportFragment;
import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardFragment;

/* renamed from: hki  reason: default package */
/* loaded from: classes.dex */
public final class hki implements h2V {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ hki(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    public final Object L(boolean z, aOO aoo) {
        Object x;
        int i = 0;
        switch (this.e) {
            case 2:
                if (z) {
                    i = 2;
                }
                vd.x(i, (pm2) this.R);
                break;
            case 3:
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            default:
                return (z || (x = ((kg9) this.R).x(aoo)) != bGR.COROUTINE_SUSPENDED) ? o8s.R : x;
            case 4:
                rt rtVar = ((rB) this.R).f7383R;
                if (rtVar == null) {
                    rtVar = null;
                }
                Button button = rtVar.v;
                if (!z) {
                    i = 4;
                }
                button.setVisibility(i);
                break;
            case 6:
                if (z) {
                    ((dkr) this.R).R.acquire();
                } else {
                    ((dkr) this.R).R.release();
                }
                return o8s.R;
        }
        return o8s.R;
    }

    public final Object O(aOO aoo) {
        switch (this.e) {
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                int i = AdbDevOptionsFragment.U;
                if (((AdbDevOptionsViewModel) ((AdbDevOptionsFragment) this.R).R.getValue()).R.R()) {
                    ((AdbDevOptionsFragment) this.R).b();
                } else {
                    Intent intent = new Intent("android.settings.DEVICE_INFO_SETTINGS");
                    intent.putExtra(":settings:fragment_args_key", "build_number");
                    Bundle bundle = new Bundle();
                    bundle.putString(":settings:fragment_args_key", "build_number");
                    intent.putExtra(":settings:show_fragment_args", bundle);
                    ((AdbDevOptionsFragment) this.R).l(intent);
                    Toast.makeText(((AdbDevOptionsFragment) this.R).H(), (int) R.string.onboarding_adb_dev_options_enable_toast, 1).show();
                }
                return o8s.R;
            case 10:
                Toast.makeText(((DeviceSupportFragment) this.R).k(), "Success. Restart device to continue.", 1).show();
                break;
            default:
                iTI.Z((PortForwardFragment) this.R).N();
                break;
        }
        return o8s.R;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        switch (this.e) {
            case 0:
                return v(((Number) obj).floatValue());
            case 1:
                Object N = ((hP3) ((k6z) this.R)).N(obj, aoo);
                return N == bGR.COROUTINE_SUSPENDED ? N : o8s.R;
            case 2:
                return L(((Boolean) obj).booleanValue(), aoo);
            case 3:
                LicenseInvalidActivity licenseInvalidActivity = (LicenseInvalidActivity) this.R;
                biy.J(licenseInvalidActivity, (Uri) obj, licenseInvalidActivity.findViewById(16908290));
                return o8s.R;
            case 4:
                return L(((Boolean) obj).booleanValue(), aoo);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                o8s o8s = (o8s) obj;
                return O(aoo);
            case 6:
                return L(((Boolean) obj).booleanValue(), aoo);
            case 7:
                return X((b1n) obj, aoo);
            case VmNativeCallback.$stable:
                return L(((Boolean) obj).booleanValue(), aoo);
            case 9:
                ((Number) obj).intValue();
                pby[] pbyArr = kxm.R;
                return o8s.R;
            case 10:
                o8s o8s2 = (o8s) obj;
                return O(aoo);
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                o8s o8s3 = (o8s) obj;
                return O(aoo);
            case 12:
                return v(((Number) obj).floatValue());
            default:
                nWW nww = (nWW) this.R;
                if (nww.R == aJV.f827R) {
                    nww.R = obj;
                    return o8s.R;
                }
                throw new IllegalArgumentException("Flow has more than one element".toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object X(defpackage.b1n r8, defpackage.aOO r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.glr
            if (r0 == 0) goto L_0x0013
            r0 = r9
            glr r0 = (defpackage.glr) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            glr r0 = new glr
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f3925R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.util.Iterator r7 = r0.f3926R
            gkP r8 = r0.R
            defpackage.jjU.o(r9)
            goto L_0x006f
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            defpackage.jjU.o(r9)
            java.lang.Object r9 = r7.R
            gkP r9 = (defpackage.gkP) r9
            i4m r9 = r9.f3917R
            java.lang.Object r9 = r9.getValue()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x004b:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0066
            java.lang.Object r4 = r9.next()
            r5 = r4
            dev.kdrag0n.virt.vm.ForwardedPort r5 = (dev.kdrag0n.virt.vm.ForwardedPort) r5
            java.lang.String r5 = r5.f2732R
            java.lang.String r6 = r8.R
            boolean r5 = defpackage.n3x.v(r5, r6)
            if (r5 == 0) goto L_0x004b
            r2.add(r4)
            goto L_0x004b
        L_0x0066:
            java.lang.Object r7 = r7.R
            r8 = r7
            gkP r8 = (defpackage.gkP) r8
            java.util.Iterator r7 = r2.iterator()
        L_0x006f:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0088
            java.lang.Object r9 = r7.next()
            dev.kdrag0n.virt.vm.ForwardedPort r9 = (dev.kdrag0n.virt.vm.ForwardedPort) r9
            r0.R = r8
            r0.f3926R = r7
            r0.e = r3
            java.lang.Object r9 = r8.v(r9, r0)
            if (r9 != r1) goto L_0x006f
            return r1
        L_0x0088:
            o8s r7 = defpackage.o8s.R
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hki.X(b1n, aOO):java.lang.Object");
    }

    public final Object v(float f) {
        switch (this.e) {
            case 0:
                ((fql) this.R).R.R(Float.valueOf(f));
                return o8s.R;
            default:
                ((gAN) this.R).R(f);
                return o8s.R;
        }
    }
}
