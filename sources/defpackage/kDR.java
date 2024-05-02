package defpackage;

import android.app.Dialog;
import android.view.View;

/* renamed from: kDR  reason: default package */
/* loaded from: classes.dex */
public final class kDR extends pdD {
    public final /* synthetic */ jcp R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pdD f5212R;

    public kDR(jcp jcp, dYS dys) {
        this.R = jcp;
        this.f5212R = dys;
    }

    @Override // defpackage.pdD
    public final boolean n() {
        return this.f5212R.n() || this.R.K;
    }

    @Override // defpackage.pdD
    public final View z(int i) {
        if (this.f5212R.n()) {
            return this.f5212R.z(i);
        }
        Dialog dialog = this.R.f4978R;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }
}
