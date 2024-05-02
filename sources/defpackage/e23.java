package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.conscrypt.Conscrypt;

/* renamed from: e23  reason: default package */
/* loaded from: classes.dex */
public abstract class e23 {
    public static boolean R() {
        Conscrypt.Version version = Conscrypt.version();
        if (version == null) {
            return false;
        }
        return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
    }

    public static PackageInfo c(Context context, int i, g79 g79, jjU jju) {
        try {
            jju.getClass();
            return jjU.C() >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of((long) i)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (Throwable th) {
            g79.L(lXr.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    public static boolean e() {
        return lkW.R;
    }

    public static BoringLayout v(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, f, f2, metrics, z, truncateAt, i2, z2);
    }
}
