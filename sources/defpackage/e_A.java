package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: e_A  reason: default package */
/* loaded from: classes.dex */
public final class e_A {

    /* renamed from: R  reason: collision with other field name */
    public final int f3140R;

    /* renamed from: R  reason: collision with other field name */
    public final TextPaint f3142R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f3144R;

    /* renamed from: v  reason: collision with other field name */
    public int f3146v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3147v;

    /* renamed from: R  reason: collision with other field name */
    public Layout.Alignment f3141R = Layout.Alignment.ALIGN_NORMAL;
    public int c = Integer.MAX_VALUE;
    public float R = 0.0f;
    public float v = 1.0f;
    public int e = 1;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3145R = true;

    /* renamed from: R  reason: collision with other field name */
    public TextUtils.TruncateAt f3143R = null;

    public e_A(int i, TextPaint textPaint, CharSequence charSequence) {
        this.f3144R = charSequence;
        this.f3142R = textPaint;
        this.f3140R = i;
        this.f3146v = charSequence.length();
    }

    public final StaticLayout R() {
        if (this.f3144R == null) {
            this.f3144R = "";
        }
        int max = Math.max(0, this.f3140R);
        CharSequence charSequence = this.f3144R;
        if (this.c == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f3142R, (float) max, this.f3143R);
        }
        int min = Math.min(charSequence.length(), this.f3146v);
        this.f3146v = min;
        if (this.f3147v && this.c == 1) {
            this.f3141R = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f3142R, max);
        obtain.setAlignment(this.f3141R);
        obtain.setIncludePad(this.f3145R);
        obtain.setTextDirection(this.f3147v ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f3143R;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.c);
        float f = this.R;
        if (!(f == 0.0f && this.v == 1.0f)) {
            obtain.setLineSpacing(f, this.v);
        }
        if (this.c > 1) {
            obtain.setHyphenationFrequency(this.e);
        }
        return obtain.build();
    }
}
