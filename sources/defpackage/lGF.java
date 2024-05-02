package defpackage;

import android.view.View;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: lGF  reason: default package */
/* loaded from: classes.dex */
public final class lGF extends G5 {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f5628R;

    public /* synthetic */ lGF(int i, Object obj) {
        this.R = i;
        this.f5628R = obj;
    }

    @Override // defpackage.G5
    public final void e(View view, jG jGVar) {
        switch (this.R) {
            case 0:
                ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
                jGVar.Z(null);
                return;
            case 1:
                ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
                jGVar.f4895R.setHintText(((hSy) this.f5628R).c.getVisibility() == 0 ? ((hSy) this.f5628R).k().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : ((hSy) this.f5628R).k().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                return;
            default:
                ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
                jGVar.Z(null);
                return;
        }
    }
}
