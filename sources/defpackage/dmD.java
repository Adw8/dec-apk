package defpackage;

import android.content.Context;

/* renamed from: dmD  reason: default package */
/* loaded from: classes.dex */
public abstract class dmD {
    public static int R(Context context, int i) {
        return context.getColor(i);
    }

    public static String c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }

    public static <T> T v(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }
}
