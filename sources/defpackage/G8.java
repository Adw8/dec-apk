package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: G8  reason: default package */
/* loaded from: classes.dex */
public final class G8 extends G5 {
    public final /* synthetic */ AndroidComposeView R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fue f157R;
    public final /* synthetic */ AndroidComposeView v;

    public G8(fue fue, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.f157R = fue;
        this.R = androidComposeView;
        this.v = androidComposeView2;
    }

    @Override // defpackage.G5
    public final void e(View view, jG jGVar) {
        ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
        hUv l = aH9.l(this.f157R);
        fue vz = msU.vz(l);
        msU.h(l);
        int i = vz.e;
        fue t = aH9.t(vz, lBz.I);
        oIb oib = null;
        hUv l2 = t != null ? aH9.l(t) : null;
        if (l2 != null) {
            oib = new oIb(l2, false);
        }
        int i2 = oib.R;
        if (i2 == this.R.getSemanticsOwner().R().R) {
            i2 = -1;
        }
        AndroidComposeView androidComposeView = this.v;
        jGVar.R = i2;
        jGVar.f4895R.setParent(androidComposeView, i2);
    }
}
