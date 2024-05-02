package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: afe  reason: default package */
/* loaded from: classes.dex */
public abstract class afe {
    public static File[] R(Context context) {
        return context.getExternalMediaDirs();
    }
}
