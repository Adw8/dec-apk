package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: aGH  reason: default package */
/* loaded from: classes.dex */
public abstract class aGH {
    public static final String R = kfk.P("PackageManagerHelper");

    public static void R(Context context, Class cls, boolean z) {
        String str = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            kfk U = kfk.U();
            String str2 = R;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? str : "disabled";
            U.x(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            kfk U2 = kfk.U();
            String str3 = R;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = "disabled";
            }
            objArr2[1] = str;
            U2.x(str3, String.format("%s could not be %s", objArr2), e);
        }
    }
}
