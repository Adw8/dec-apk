package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: oPF  reason: default package */
/* loaded from: classes.dex */
public abstract class oPF {
    public static File[] R(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] c(Context context) {
        return context.getObbDirs();
    }

    public static File[] v(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }
}
