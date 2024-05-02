package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: lta  reason: default package */
/* loaded from: classes.dex */
public final class lta implements hKX {
    public final hKX R;
    public final /* synthetic */ int e;

    public /* synthetic */ lta(hKX hkx, int i) {
        this.e = i;
        this.R = hkx;
    }

    @Override // defpackage.hKX
    public final Object R() {
        switch (this.e) {
            case 0:
                return new be2(kIP.v(this.R));
            case 1:
                return new kX6(((lNV) this.R).v());
            case 2:
                return new chm(((lNV) this.R).v());
            case 3:
                Context v = ((lNV) this.R).v();
                try {
                    Bundle bundle = v.getPackageManager().getApplicationInfo(v.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return null;
                    }
                    return bundle.getString("local_testing_dir");
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            default:
                return new bTK((Context) this.R.R());
        }
    }
}
