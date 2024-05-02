package defpackage;

import android.view.View;
import java.util.Iterator;

/* renamed from: h6g  reason: default package */
/* loaded from: classes.dex */
public final class h6g implements View.OnClickListener {
    public final /* synthetic */ ajY R;
    public final /* synthetic */ int e;

    public /* synthetic */ h6g(ajY ajy, int i) {
        this.e = i;
        this.R = ajy;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.e) {
            case 0:
                Iterator it = this.R.f990R.iterator();
                while (it.hasNext()) {
                    this.R.a().e();
                    ((aRF) it.next()).R();
                }
                this.R.M(false, false);
                return;
            case 1:
                Iterator it2 = this.R.f993v.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                this.R.M(false, false);
                return;
            default:
                ajY ajy = this.R;
                ajy.f984R.setEnabled(ajy.a().x());
                this.R.f987R.toggle();
                ajY ajy2 = this.R;
                ajy2._(ajy2.f987R);
                this.R.w();
                return;
        }
    }
}
