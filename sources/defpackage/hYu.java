package defpackage;

import android.os.Bundle;

/* renamed from: hYu  reason: default package */
/* loaded from: classes.dex */
public final class hYu extends jEL {
    public final int R;
    public final String e;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ krG f4302v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hYu(krG krg, cqI cqi, int i, String str, int i2) {
        super(krg, cqi);
        this.f4302v = krg;
        this.R = i;
        this.e = str;
        this.v = i2;
    }

    @Override // defpackage.jEL, defpackage.nWA
    public final void X(Bundle bundle) {
        this.f4302v.f5448R.c(((jEL) this).R);
        krG.f5447R.L("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i = this.v;
        if (i > 0) {
            this.f4302v.x(this.R, i - 1, this.e);
        }
    }
}
