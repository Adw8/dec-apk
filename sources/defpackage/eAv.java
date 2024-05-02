package defpackage;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: eAv  reason: default package */
/* loaded from: classes.dex */
public abstract class eAv {
    public static String[] R(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static void c(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static PrecomputedText.Params v(TextView textView) {
        return textView.getTextMetricsParams();
    }
}
