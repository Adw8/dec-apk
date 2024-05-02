package defpackage;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: gFY  reason: default package */
/* loaded from: classes.dex */
public final class gFY {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final CharSequence f3697R;

    /* renamed from: R  reason: collision with other field name */
    public final BreakIterator f3698R;
    public final int v;

    public gFY(CharSequence charSequence, int i, Locale locale) {
        this.f3697R = charSequence;
        boolean z = true;
        if (charSequence.length() >= 0) {
            if ((i < 0 || i > charSequence.length()) ? false : z) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                this.f3698R = wordInstance;
                this.R = Math.max(0, -50);
                this.v = Math.min(charSequence.length(), i + 50);
                wordInstance.setText(new _Y(charSequence, i));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    public final void R(int i) {
        int i2 = this.R;
        boolean z = false;
        if (i <= this.v && i2 <= i) {
            z = true;
        }
        if (!z) {
            StringBuilder C = opT.C("Invalid offset: ", i, ". Valid range is [");
            C.append(this.R);
            C.append(" , ");
            throw new IllegalArgumentException(jQ.P(C, this.v, ']').toString());
        }
    }

    public final boolean X(int i) {
        if (i < this.v && this.R <= i) {
            return dq.Y(Character.codePointAt(this.f3697R, i));
        }
        return false;
    }

    public final boolean c(int i) {
        boolean z = true;
        int i2 = this.R + 1;
        if (i > this.v || i2 > i) {
            z = false;
        }
        if (z) {
            return dq.Y(Character.codePointBefore(this.f3697R, i));
        }
        return false;
    }

    public final boolean e(int i) {
        return (i < this.v && this.R <= i) && Character.isLetterOrDigit(Character.codePointAt(this.f3697R, i));
    }

    public final boolean v(int i) {
        return (i <= this.v && this.R + 1 <= i) && Character.isLetterOrDigit(Character.codePointBefore(this.f3697R, i));
    }
}
