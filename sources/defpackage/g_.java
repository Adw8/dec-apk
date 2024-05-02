package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: g_  reason: default package */
/* loaded from: classes.dex */
public final class g_ implements Runnable {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object v;

    public g_(wD wDVar, TextView textView, Typeface typeface, int i) {
        this.c = wDVar;
        this.R = textView;
        this.v = typeface;
        this.X = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ((TextView) this.R).setTypeface((Typeface) this.v, this.X);
                return;
            default:
                int i = nKO.R;
                ((ozN) this.c).getClass();
                throw null;
        }
    }
}
