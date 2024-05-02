package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: eNe  reason: default package */
/* loaded from: classes.dex */
public abstract class eNe {
    public static File R(Context context) {
        return context.getCodeCacheDir();
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static Drawable v(Context context, int i) {
        return context.getDrawable(i);
    }
}
