package defpackage;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: O3  reason: default package */
/* loaded from: classes.dex */
public final class O3 extends fd {
    public static O3 R;

    /* renamed from: R  reason: collision with other field name */
    public BreakIterator f324R;

    public O3(Locale locale) {
        this.f324R = BreakIterator.getWordInstance(locale);
    }

    public final boolean L(int i) {
        if (i < 0 || i >= e().length()) {
            return false;
        }
        return Character.isLetterOrDigit(e().codePointAt(i));
    }

    public final boolean O(int i) {
        return i > 0 && L(i + -1) && (i == e().length() || !L(i));
    }

    @Override // defpackage.qe
    public final int[] R(int i) {
        int length = e().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !L(i - 1) && !O(i)) {
            BreakIterator breakIterator = this.f324R;
            if (breakIterator == null) {
                breakIterator = null;
            }
            i = breakIterator.preceding(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f324R;
        if (breakIterator2 == null) {
            breakIterator2 = null;
        }
        int preceding = breakIterator2.preceding(i);
        if (preceding != -1) {
            boolean z = true;
            if (!L(preceding) || (preceding != 0 && L(preceding - 1))) {
                z = false;
            }
            if (z) {
                return c(preceding, i);
            }
        }
        return null;
    }

    public final void X(String str) {
        ((fd) this).R = str;
        BreakIterator breakIterator = this.f324R;
        if (breakIterator == null) {
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    @Override // defpackage.qe
    public final int[] v(int i) {
        if (e().length() <= 0 || i >= e().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!L(i)) {
            boolean z = true;
            if (!L(i) || (i != 0 && L(i - 1))) {
                z = false;
            }
            if (z) {
                break;
            }
            BreakIterator breakIterator = this.f324R;
            if (breakIterator == null) {
                breakIterator = null;
            }
            i = breakIterator.following(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f324R;
        if (breakIterator2 == null) {
            breakIterator2 = null;
        }
        int following = breakIterator2.following(i);
        if (following == -1 || !O(following)) {
            return null;
        }
        return c(i, following);
    }
}
