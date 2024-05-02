package defpackage;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: dCM  reason: default package */
/* loaded from: classes.dex */
public final class dCM {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final TextDirectionHeuristic f2528R;

    /* renamed from: R  reason: collision with other field name */
    public final TextPaint f2529R;
    public final int v;

    public dCM(PrecomputedText.Params params) {
        this.f2529R = params.getTextPaint();
        this.f2528R = params.getTextDirection();
        this.R = params.getBreakStrategy();
        this.v = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dCM)) {
            return false;
        }
        dCM dcm = (dCM) obj;
        return (this.R == dcm.R && this.v == dcm.v && (this.f2529R.getTextSize() > dcm.f2529R.getTextSize() ? 1 : (this.f2529R.getTextSize() == dcm.f2529R.getTextSize() ? 0 : -1)) == 0 && (this.f2529R.getTextScaleX() > dcm.f2529R.getTextScaleX() ? 1 : (this.f2529R.getTextScaleX() == dcm.f2529R.getTextScaleX() ? 0 : -1)) == 0 && (this.f2529R.getTextSkewX() > dcm.f2529R.getTextSkewX() ? 1 : (this.f2529R.getTextSkewX() == dcm.f2529R.getTextSkewX() ? 0 : -1)) == 0 && (this.f2529R.getLetterSpacing() > dcm.f2529R.getLetterSpacing() ? 1 : (this.f2529R.getLetterSpacing() == dcm.f2529R.getLetterSpacing() ? 0 : -1)) == 0 && TextUtils.equals(this.f2529R.getFontFeatureSettings(), dcm.f2529R.getFontFeatureSettings()) && this.f2529R.getFlags() == dcm.f2529R.getFlags() && this.f2529R.getTextLocales().equals(dcm.f2529R.getTextLocales()) && (this.f2529R.getTypeface() != null ? this.f2529R.getTypeface().equals(dcm.f2529R.getTypeface()) : dcm.f2529R.getTypeface() == null)) && this.f2528R == dcm.f2528R;
    }

    public final int hashCode() {
        return cTo.v(Float.valueOf(this.f2529R.getTextSize()), Float.valueOf(this.f2529R.getTextScaleX()), Float.valueOf(this.f2529R.getTextSkewX()), Float.valueOf(this.f2529R.getLetterSpacing()), Integer.valueOf(this.f2529R.getFlags()), this.f2529R.getTextLocales(), this.f2529R.getTypeface(), Boolean.valueOf(this.f2529R.isElegantTextHeight()), this.f2528R, Integer.valueOf(this.R), Integer.valueOf(this.v));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder U = opT.U("textSize=");
        U.append(this.f2529R.getTextSize());
        sb.append(U.toString());
        sb.append(", textScaleX=" + this.f2529R.getTextScaleX());
        sb.append(", textSkewX=" + this.f2529R.getTextSkewX());
        sb.append(", letterSpacing=" + this.f2529R.getLetterSpacing());
        sb.append(", elegantTextHeight=" + this.f2529R.isElegantTextHeight());
        sb.append(", textLocale=" + this.f2529R.getTextLocales());
        sb.append(", typeface=" + this.f2529R.getTypeface());
        sb.append(", variationSettings=" + this.f2529R.getFontVariationSettings());
        sb.append(", textDir=" + this.f2528R);
        sb.append(", breakStrategy=" + this.R);
        sb.append(", hyphenationFrequency=" + this.v);
        sb.append("}");
        return sb.toString();
    }
}
