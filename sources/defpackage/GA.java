package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* renamed from: GA  reason: default package */
/* loaded from: classes.dex */
public final class GA extends bKZ {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f159R;

    public /* synthetic */ GA(int i, Object obj) {
        this.R = i;
        this.f159R = obj;
    }

    @Override // defpackage.eIH
    public final void R() {
        switch (this.R) {
            case 0:
                ((Fz) this.f159R).R.f408R.setAlpha(1.0f);
                ((Fz) this.f159R).R.f414R.e(null);
                ((Fz) this.f159R).R.f414R = null;
                return;
            case 1:
                ((Q8) this.f159R).f408R.setAlpha(1.0f);
                ((Q8) this.f159R).f414R.e(null);
                ((Q8) this.f159R).f414R = null;
                return;
            default:
                ((WE) this.f159R).R.f408R.setVisibility(8);
                Q8 q8 = ((WE) this.f159R).R;
                PopupWindow popupWindow = q8.f406R;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (q8.f408R.getParent() instanceof View) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    fv7.c((View) ((WE) this.f159R).R.f408R.getParent());
                }
                ((WE) this.f159R).R.f408R.X();
                ((WE) this.f159R).R.f414R.e(null);
                Q8 q82 = ((WE) this.f159R).R;
                q82.f414R = null;
                ViewGroup viewGroup = q82.f404R;
                WeakHashMap weakHashMap2 = of5.f6887R;
                fv7.c(viewGroup);
                return;
        }
    }

    @Override // defpackage.bKZ, defpackage.eIH
    public final void v() {
        switch (this.R) {
            case 0:
                ((Fz) this.f159R).R.f408R.setVisibility(0);
                return;
            case 1:
                ((Q8) this.f159R).f408R.setVisibility(0);
                if (((Q8) this.f159R).f408R.getParent() instanceof View) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    fv7.c((View) ((Q8) this.f159R).f408R.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
