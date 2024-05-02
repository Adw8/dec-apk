package defpackage;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: k1  reason: default package */
/* loaded from: classes.dex */
public final class k1 extends fd {
    public static k1 R;

    /* renamed from: R  reason: collision with other field name */
    public BreakIterator f5181R;

    public k1(Locale locale) {
        this.f5181R = BreakIterator.getCharacterInstance(locale);
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
        do {
            BreakIterator breakIterator = this.f5181R;
            if (breakIterator == null) {
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f5181R;
                if (breakIterator2 == null) {
                    breakIterator2 = null;
                }
                i = breakIterator2.preceding(i);
            } else {
                BreakIterator breakIterator3 = this.f5181R;
                if (breakIterator3 == null) {
                    breakIterator3 = null;
                }
                int preceding = breakIterator3.preceding(i);
                if (preceding == -1) {
                    return null;
                }
                return c(preceding, i);
            }
        } while (i != -1);
        return null;
    }

    public final void X(String str) {
        ((fd) this).R = str;
        BreakIterator breakIterator = this.f5181R;
        if (breakIterator == null) {
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    @Override // defpackage.qe
    public final int[] v(int i) {
        int length = e().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.f5181R;
            if (breakIterator == null) {
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f5181R;
                if (breakIterator2 == null) {
                    breakIterator2 = null;
                }
                i = breakIterator2.following(i);
            } else {
                BreakIterator breakIterator3 = this.f5181R;
                if (breakIterator3 == null) {
                    breakIterator3 = null;
                }
                int following = breakIterator3.following(i);
                if (following == -1) {
                    return null;
                }
                return c(i, following);
            }
        } while (i != -1);
        return null;
    }
}
