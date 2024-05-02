package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* renamed from: kaR  reason: default package */
/* loaded from: classes.dex */
public abstract class kaR {
    public static final Method R;
    public static final Method v;

    static {
        Class<?> cls = Class.forName("android.widget.RemoteViews$ColorResources");
        R = cls.getDeclaredMethod("create", Context.class, SparseIntArray.class);
        v = cls.getDeclaredMethod("apply", Context.class);
    }
}
