package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: dil  reason: default package */
/* loaded from: classes.dex */
public final class dil implements hKX {
    public final hKX R;
    public final hKX c;
    public final /* synthetic */ int e;
    public final hKX v;

    public /* synthetic */ dil(hKX hkx, hKX hkx2, hKX hkx3, int i) {
        this.e = i;
        this.R = hkx;
        this.v = hkx2;
        this.c = hkx3;
    }

    @Override // defpackage.hKX
    public final Object R() {
        switch (this.e) {
            case 0:
                return new krG(((lNV) this.R).v(), (gMW) this.v.R(), (n2N) this.c.R());
            case 1:
                return new n2N((dRx) this.R.R(), (chm) this.v.R(), (bu3) this.c.R());
            default:
                Context v = ((lNV) this.R).v();
                imF v2 = kIP.v(this.v);
                imF v3 = kIP.v(this.c);
                String str = null;
                try {
                    Bundle bundle = v.getPackageManager().getApplicationInfo(v.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        str = bundle.getString("local_testing_dir");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                aUC auc = str == null ? (aUC) ((kIP) v2).R() : (aUC) ((kIP) v3).R();
                vd.A(auc);
                return auc;
        }
    }
}
