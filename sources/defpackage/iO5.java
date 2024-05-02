package defpackage;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* renamed from: iO5  reason: default package */
/* loaded from: classes.dex */
public final class iO5 implements Spannable {
    public Spannable R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4551R = false;

    public iO5(Spannable spannable) {
        this.R = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.R.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.R.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.R.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.R.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.R.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.R.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.R.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.R.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.R.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.R;
        if (!this.f4551R && (spannable instanceof PrecomputedText)) {
            this.R = new SpannableString(spannable);
        }
        this.f4551R = true;
        this.R.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.R;
        if (!this.f4551R && (spannable instanceof PrecomputedText)) {
            this.R = new SpannableString(spannable);
        }
        this.f4551R = true;
        this.R.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.R.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence, java.lang.Object
    public final String toString() {
        return this.R.toString();
    }

    public iO5(CharSequence charSequence) {
        this.R = new SpannableString(charSequence);
    }
}
