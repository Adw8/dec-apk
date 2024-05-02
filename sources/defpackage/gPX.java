package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: gPX  reason: default package */
/* loaded from: classes.dex */
public final class gPX extends bKZ {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ b_R f3758R;

    public /* synthetic */ gPX(b_R b_r, int i) {
        this.R = i;
        this.f3758R = b_r;
    }

    @Override // defpackage.eIH
    public final void R() {
        View view;
        switch (this.R) {
            case 0:
                b_R b_r = this.f3758R;
                if (b_r.c && (view = b_r.f1732R) != null) {
                    view.setTranslationY(0.0f);
                    this.f3758R.f1733R.setTranslationY(0.0f);
                }
                this.f3758R.f1733R.setVisibility(8);
                this.f3758R.f1733R.setTransitioning(false);
                b_R b_r2 = this.f3758R;
                b_r2.f1740R = null;
                kH kHVar = b_r2.f1742R;
                if (kHVar != null) {
                    kHVar.c(b_r2.f1744v);
                    b_r2.f1744v = null;
                    b_r2.f1742R = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3758R.f1735R;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    fv7.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b_R b_r3 = this.f3758R;
                b_r3.f1740R = null;
                b_r3.f1733R.requestLayout();
                return;
        }
    }
}
