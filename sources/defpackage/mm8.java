package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: mm8  reason: default package */
/* loaded from: classes.dex */
public final class mm8 extends cho {
    public final /* synthetic */ krG R;
    public final /* synthetic */ int e;
    public final /* synthetic */ cqI v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mm8(krG krg, cqI cqi, int i, cqI cqi2) {
        super(cqi);
        this.R = krg;
        this.e = i;
        this.v = cqi2;
    }

    @Override // defpackage.cho
    public final void R() {
        try {
            krG krg = this.R;
            String str = krg.f5450R;
            int i = this.e;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            Bundle Z = krG.Z();
            jtj jtj = new jtj(this.R, this.v, 3);
            g_L g_l = (g_L) ((gs_) krg.f5448R.f2643R);
            Parcel O = g_l.O();
            O.writeString(str);
            int i2 = okB.R;
            O.writeInt(1);
            bundle.writeToParcel(O, 0);
            O.writeInt(1);
            Z.writeToParcel(O, 0);
            O.writeStrongBinder(jtj);
            g_l.L(O, 9);
        } catch (RemoteException e) {
            krG.f5447R.Z(e, "notifySessionFailed", new Object[0]);
        }
    }
}
