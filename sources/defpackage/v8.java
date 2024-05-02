package defpackage;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: v8  reason: default package */
/* loaded from: classes.dex */
public abstract class v8 {
    public static void R(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
