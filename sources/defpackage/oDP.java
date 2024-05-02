package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;

/* renamed from: oDP  reason: default package */
/* loaded from: classes.dex */
public abstract class oDP {
    public static int R(Resources resources, int i, Resources.Theme theme) {
        return resources.getColor(i, theme);
    }

    public static ColorStateList v(Resources resources, int i, Resources.Theme theme) {
        return resources.getColorStateList(i, theme);
    }
}
