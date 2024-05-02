package defpackage;

import android.content.res.Configuration;

/* renamed from: kWs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kWs implements geB {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hAW f5320R;

    public /* synthetic */ kWs(hAW haw, int i) {
        this.R = i;
        this.f5320R = haw;
    }

    @Override // defpackage.geB
    public final void accept(Object obj) {
        switch (this.R) {
            case 0:
                hAW haw = this.f5320R;
                Configuration configuration = (Configuration) obj;
                if (haw.T()) {
                    haw.Z(false, configuration);
                    return;
                }
                return;
            case 1:
                hAW haw2 = this.f5320R;
                Integer num = (Integer) obj;
                if (haw2.T() && num.intValue() == 80) {
                    haw2.U(false);
                    return;
                }
                return;
            case 2:
                hAW haw3 = this.f5320R;
                dud dud = (dud) obj;
                if (haw3.T()) {
                    haw3.C(dud.R, false);
                    return;
                }
                return;
            default:
                hAW haw4 = this.f5320R;
                ivh ivh = (ivh) obj;
                if (haw4.T()) {
                    haw4.y(ivh.R, false);
                    return;
                }
                return;
        }
    }
}
