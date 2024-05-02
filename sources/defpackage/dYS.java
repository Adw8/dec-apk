package defpackage;

import android.view.View;

/* renamed from: dYS  reason: default package */
/* loaded from: classes.dex */
public final class dYS extends pdD {
    public final /* synthetic */ pm2 R;

    public dYS(pm2 pm2) {
        this.R = pm2;
    }

    @Override // defpackage.pdD
    public final boolean n() {
        return this.R.f7228R != null;
    }

    @Override // defpackage.pdD
    public final View z(int i) {
        View view = this.R.f7228R;
        if (view != null) {
            return view.findViewById(i);
        }
        StringBuilder U = opT.U("Fragment ");
        U.append(this.R);
        U.append(" does not have a view");
        throw new IllegalStateException(U.toString());
    }
}
