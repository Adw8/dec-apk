package defpackage;

import android.graphics.drawable.Icon;
import android.net.Uri;

/* renamed from: jWG  reason: default package */
/* loaded from: classes.dex */
public abstract class jWG {
    public static int R(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int c(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri e(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static String v(Object obj) {
        return ((Icon) obj).getResPackage();
    }
}
