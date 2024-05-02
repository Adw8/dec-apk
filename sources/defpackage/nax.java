package defpackage;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Debug;

/* renamed from: nax  reason: default package */
/* loaded from: classes.dex */
public final class nax {
    public final F4 R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f6476R;

    public nax(Context context, F4 f4) {
        this.f6476R = context;
        this.R = f4;
    }

    public final boolean R() {
        Signature[] signatureArr;
        boolean z;
        if (!n3x.v(this.f6476R.getPackageName(), this.R.R)) {
            return false;
        }
        PackageInfo packageInfo = this.f6476R.getPackageManager().getPackageInfo(this.R.R, 0);
        boolean z2 = Y5.c;
        long longVersionCode = z2 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode;
        this.R.getClass();
        if (longVersionCode != ((long) 999957)) {
            return false;
        }
        if (Y5.e) {
            InstallSourceInfo installSourceInfo = this.f6476R.getPackageManager().getInstallSourceInfo(this.R.R);
            if (n3x.v(installSourceInfo.getInitiatingPackageName(), afN.R(-34763492152204L)) || n3x.v(installSourceInfo.getInstallingPackageName(), afN.R(-34815031759756L))) {
                return false;
            }
        }
        if (Debug.waitingForDebugger() || (this.f6476R.getApplicationInfo().flags & 2) != 0) {
            return false;
        }
        try {
            PackageInfo packageInfo2 = this.f6476R.getPackageManager().getPackageInfo(this.R.R, z2 ? 134217728 : 64);
            signatureArr = z2 ? packageInfo2.signingInfo.hasMultipleSigners() ? packageInfo2.signingInfo.getApkContentsSigners() : packageInfo2.signingInfo.getSigningCertificateHistory() : packageInfo2.signatures;
        } catch (Exception unused) {
            signatureArr = new Signature[0];
        }
        int length = signatureArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (n3x.v(signatureArr[i].toCharsString(), afN.R(-35407737246604L))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        return z;
    }
}
