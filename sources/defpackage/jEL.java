package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: jEL  reason: default package */
/* loaded from: classes.dex */
public abstract class jEL extends p0F {
    public final cqI R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ krG f4882R;

    public jEL(krG krg, cqI cqi) {
        this.f4882R = krg;
        this.R = cqi;
    }

    @Override // defpackage.nWA
    public void R(Bundle bundle, Bundle bundle2) {
        this.f4882R.v.c(this.R);
        krG.f5447R.m("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // defpackage.nWA
    public void X(Bundle bundle) {
        this.f4882R.f5448R.c(this.R);
        int i = bundle.getInt("error_code");
        krG.f5447R.L("onError(%d)", Integer.valueOf(i));
        this.R.R(new oZ(i, 0));
    }

    @Override // defpackage.nWA
    public void e(Bundle bundle, Bundle bundle2) {
        this.f4882R.f5448R.c(this.R);
        krG.f5447R.m("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // defpackage.nWA
    public void v(ArrayList arrayList) {
        this.f4882R.f5448R.c(this.R);
        krG.f5447R.m("onGetSessionStates", new Object[0]);
    }
}
