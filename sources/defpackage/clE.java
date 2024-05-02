package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: clE  reason: default package */
/* loaded from: classes.dex */
public final class clE implements hKX {
    public final hKX R;
    public final /* synthetic */ int e;
    public final hKX v;

    public /* synthetic */ clE(hKX hkx, hKX hkx2, int i) {
        this.e = i;
        this.R = hkx;
        this.v = hkx2;
    }

    @Override // defpackage.hKX
    public final /* bridge */ /* synthetic */ Object R() {
        switch (this.e) {
            case 0:
                return new dRx(((lNV) this.R).v(), (chm) this.v.R());
            case 1:
                return new ipk((dRx) this.R.R(), kIP.v(this.v));
            default:
                Object R = this.R.R();
                Context v = ((lNV) this.v).v();
                j5V j5v = (j5V) R;
                biy.u(v.getPackageManager(), new ComponentName(v.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
                biy.u(v.getPackageManager(), new ComponentName(v.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"));
                vd.A(j5v);
                return j5v;
        }
    }
}
