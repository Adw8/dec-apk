package defpackage;

import android.content.Context;

/* renamed from: mT  reason: default package */
/* loaded from: classes.dex */
public final class mT extends k8G implements f_c {
    public final /* synthetic */ pm2 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mT(int i, pm2 pm2) {
        super(0);
        this.X = i;
        this.R = pm2;
    }

    @Override // defpackage.f_c
    public final Object g() {
        switch (this.X) {
            case 0:
                return this.R.r().e();
            case 1:
                return this.R.r().L();
            default:
                Context H = ((Ms) this.R).H();
                Context applicationContext = H != null ? H.getApplicationContext() : null;
                if (applicationContext != null) {
                    return (m5f) ((fMX) ((jJE) cpc.u(applicationContext, jJE.class))).N.get();
                }
                throw new IllegalStateException();
        }
    }
}
