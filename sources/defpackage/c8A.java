package defpackage;

import android.text.TextUtils;
import android.view.ActionMode;
import android.view.ViewTreeObserver;
import com.termux.view.TerminalView;

/* renamed from: c8A  reason: default package */
/* loaded from: classes.dex */
public final class c8A implements ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: R  reason: collision with other field name */
    public ActionMode f1972R;

    /* renamed from: R  reason: collision with other field name */
    public final TerminalView f1973R;

    /* renamed from: R  reason: collision with other field name */
    public String f1974R;

    /* renamed from: R  reason: collision with other field name */
    public final llS f1975R;
    public final int e;
    public final llS v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1976R = false;
    public long R = System.currentTimeMillis();
    public int X = -1;
    public int O = -1;
    public int L = -1;
    public int Z = -1;

    public c8A(TerminalView terminalView) {
        this.f1973R = terminalView;
        llS lls = new llS(terminalView, this, 0);
        this.f1975R = lls;
        llS lls2 = new llS(terminalView, this, 2);
        this.v = lls2;
        this.e = Math.max(lls.getHandleHeight(), lls2.getHandleHeight());
    }

    public static int v(idE ide, int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        String L = ide.L(0, i, i2, i);
        if (!TextUtils.isEmpty(L)) {
            int length = L.length();
            int i6 = 0;
            while (i5 < length) {
                char charAt = L.charAt(i5);
                if (charAt == 0) {
                    break;
                }
                if (!Character.isHighSurrogate(charAt) || (i3 = i5 + 1) >= length) {
                    i4 = lTs.z(charAt);
                    i3 = i5;
                } else {
                    i4 = lTs.z(Character.toCodePoint(charAt, L.charAt(i3)));
                }
                int i7 = i4 + i6;
                if (i2 > i6 && i2 < i7) {
                    return i7;
                }
                if (i7 == i6) {
                    return i6;
                }
                i5 = i3 + 1;
                i6 = i7;
            }
        }
        return i2;
    }

    public final String R() {
        gje gje = this.f1973R.f2428R;
        return gje.f3905c.L(this.X, this.L, this.O, this.Z);
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        if (!z) {
            this.f1973R.m();
        }
    }
}
