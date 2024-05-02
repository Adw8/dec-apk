package defpackage;

import android.content.Context;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: fQb  reason: default package */
/* loaded from: classes.dex */
public final class fQb implements nRn {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f3419R;
    public final /* synthetic */ Object v;

    public /* synthetic */ fQb(Object obj, int i, Object obj2) {
        this.R = i;
        this.f3419R = obj;
        this.v = obj2;
    }

    @Override // defpackage.nRn
    public final void R() {
        c0y c0y;
        switch (this.R) {
            case 0:
                ((kVD) this.f3419R).f5314R.U((ija) this.v);
                return;
            case 1:
                ((h5L) this.f3419R).v.remove((h5L) this.v);
                return;
            case 2:
                h5L h5l = (h5L) this.f3419R;
                h5l.getClass();
                eDo edo = ((aGK) this.v).R;
                if (edo != null && (c0y = edo.f3037R) != null) {
                    h5l.f4044R.remove(c0y);
                    return;
                }
                return;
            case 3:
                ((h5L) this.f3419R).f4044R.remove((c0y) this.v);
                return;
            case 4:
                kHc khc = (kHc) this.f3419R;
                View view = (View) this.v;
                int i = khc.f5235R - 1;
                khc.f5235R = i;
                if (i == 0) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    m18.V(view, null);
                    view.setWindowInsetsAnimationCallback(null);
                    view.removeOnAttachStateChangeListener(khc.f5237R);
                    return;
                }
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ((gx6) this.f3419R).f3997R.add(this.v);
                return;
            case 6:
                ((M4) ((ze) this.f3419R)).R.U((sR) this.v);
                return;
            default:
                ((Context) this.f3419R).getApplicationContext().unregisterComponentCallbacks((k9) this.v);
                return;
        }
    }
}
