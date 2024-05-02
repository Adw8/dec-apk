package defpackage;

import android.widget.TextView;

/* renamed from: mW  reason: default package */
/* loaded from: classes.dex */
public abstract class mW {
    public static int R(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static boolean e(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }

    public static void v(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }
}
