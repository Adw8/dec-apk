package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: Lk  reason: default package */
/* loaded from: classes.dex */
public final class Lk extends n1P {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ WeakReference R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ wD f283R;

    public Lk(wD wDVar, int i, int i2, WeakReference weakReference) {
        this.f283R = wDVar;
        this.O = i;
        this.L = i2;
        this.R = weakReference;
    }

    @Override // defpackage.n1P
    public final void i(Typeface typeface) {
        int i = this.O;
        if (i != -1) {
            typeface = U3.R(typeface, i, (this.L & 2) != 0);
        }
        wD wDVar = this.f283R;
        WeakReference weakReference = this.R;
        if (wDVar.f7457R) {
            wDVar.f7453R = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = of5.f6887R;
                if (d6y.v(textView)) {
                    textView.post(new g_(wDVar, textView, typeface, wDVar.R));
                } else {
                    textView.setTypeface(typeface, wDVar.R);
                }
            }
        }
    }

    @Override // defpackage.n1P
    public final void t(int i) {
    }
}
