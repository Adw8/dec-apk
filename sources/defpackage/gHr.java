package defpackage;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: gHr  reason: default package */
/* loaded from: classes.dex */
public abstract class gHr {
    public static Field R;

    /* renamed from: R  reason: collision with other field name */
    public static boolean f3718R;
    public static Field c;
    public static Field v;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            R = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            v = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            c = declaredField3;
            declaredField3.setAccessible(true);
            f3718R = true;
        } catch (ReflectiveOperationException e) {
            StringBuilder U = opT.U("Failed to get visible insets from AttachInfo ");
            U.append(e.getMessage());
            Log.w("WindowInsetsCompat", U.toString(), e);
        }
    }
}
