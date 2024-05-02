package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Process;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: C1  reason: default package */
/* loaded from: classes.dex */
public abstract class C1 {
    public static final Object R = new Object();

    public static int R(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static ColorStateList v(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        c47 c47;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        h_6 h_6 = new h_6(resources, theme);
        synchronized (cu3.R) {
            SparseArray sparseArray = (SparseArray) cu3.f2453R.get(h_6);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (c47 = (c47) sparseArray.get(i)) == null)) {
                if (!c47.f1957R.equals(resources.getConfiguration()) || (!(theme == null && c47.R == 0) && (theme == null || c47.R != theme.hashCode()))) {
                    sparseArray.remove(i);
                } else {
                    colorStateList2 = c47.f1956R;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = cu3.f2452R;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        if (!z) {
            try {
                colorStateList = p1.R(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return oDP.v(resources, i, theme);
        }
        synchronized (cu3.R) {
            WeakHashMap weakHashMap = cu3.f2453R;
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(h_6);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(h_6, sparseArray2);
            }
            sparseArray2.append(i, new c47(colorStateList, h_6.f4309R.getConfiguration(), theme));
        }
        return colorStateList;
    }
}
