package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: oJF  reason: default package */
/* loaded from: classes.dex */
public abstract class oJF {
    public static Method R;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            R = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                R.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean R(View view) {
        WeakHashMap weakHashMap = of5.f6887R;
        return eHQ.e(view) == 1;
    }
}
