package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;

/* renamed from: mQD  reason: default package */
/* loaded from: classes.dex */
public final class mQD {
    public final dCh R;

    /* renamed from: R  reason: collision with other field name */
    public final kef f6031R;

    public mQD(kef kef, dCh dch) {
        this.f6031R = kef;
        this.R = dch;
    }

    public final void R(d5M d5m, d5M d5m2) {
        if (n3x.v((mQD) this.f6031R.f5384R.get(), this)) {
            egg egg = (egg) this.R;
            boolean z = true;
            boolean z2 = !odN.R(egg.f3173R.R, d5m2.R) || !n3x.v(egg.f3173R.f2489R, d5m2.f2489R);
            egg.f3173R = d5m2;
            int size = egg.f3175R.size();
            for (int i = 0; i < size; i++) {
                cVP cvp = (cVP) ((WeakReference) egg.f3175R.get(i)).get();
                if (cvp != null) {
                    cvp.f2107R = d5m2;
                }
            }
            int i2 = -1;
            if (!n3x.v(d5m, d5m2)) {
                if (d5m == null || (n3x.v(d5m.f2488R.R, d5m2.f2488R.R) && (!odN.R(d5m.R, d5m2.R) || n3x.v(d5m.f2489R, d5m2.f2489R)))) {
                    z = false;
                }
                if (z) {
                    ((InputMethodManager) egg.f3177R.R.getValue()).restartInput(egg.R);
                    return;
                }
                int size2 = egg.f3175R.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    cVP cvp2 = (cVP) ((WeakReference) egg.f3175R.get(i3)).get();
                    if (cvp2 != null) {
                        d5M d5m3 = egg.f3173R;
                        ltr ltr = egg.f3177R;
                        View view = egg.R;
                        if (cvp2.c) {
                            cvp2.f2107R = d5m3;
                            if (cvp2.f2111v) {
                                ((InputMethodManager) ltr.R.getValue()).updateExtractedText(view, cvp2.v, gQc.F(d5m3));
                            }
                            odN odn = d5m3.f2489R;
                            int X = odn != null ? odN.X(odn.f6859R) : -1;
                            odN odn2 = d5m3.f2489R;
                            ((InputMethodManager) ltr.R.getValue()).updateSelection(view, odN.X(d5m3.R), odN.e(d5m3.R), X, odn2 != null ? odN.e(odn2.f6859R) : -1);
                        }
                    }
                }
            } else if (z2) {
                ltr ltr2 = egg.f3177R;
                View view2 = egg.R;
                int X2 = odN.X(d5m2.R);
                int e = odN.e(d5m2.R);
                odN odn3 = egg.f3173R.f2489R;
                int X3 = odn3 != null ? odN.X(odn3.f6859R) : -1;
                odN odn4 = egg.f3173R.f2489R;
                if (odn4 != null) {
                    i2 = odN.e(odn4.f6859R);
                }
                ((InputMethodManager) ltr2.R.getValue()).updateSelection(view2, X2, e, X3, i2);
            }
        }
    }
}
