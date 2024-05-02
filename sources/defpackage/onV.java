package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: onV  reason: default package */
/* loaded from: classes.dex */
public final class onV extends cho {
    public final /* synthetic */ String R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ krG f6951R;
    public final /* synthetic */ int X;
    public final /* synthetic */ int e;
    public final /* synthetic */ cqI v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public onV(krG krg, cqI cqi, int i, String str, cqI cqi2, int i2) {
        super(cqi);
        this.f6951R = krg;
        this.e = i;
        this.R = str;
        this.v = cqi2;
        this.X = i2;
    }

    @Override // defpackage.cho
    public final void R() {
        try {
            krG krg = this.f6951R;
            String str = krg.f5450R;
            int i = this.e;
            String str2 = this.R;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString("module_name", str2);
            Bundle Z = krG.Z();
            hYu hyu = new hYu(this.f6951R, this.v, this.e, this.R, this.X);
            g_L g_l = (g_L) ((gs_) krg.f5448R.f2643R);
            Parcel O = g_l.O();
            O.writeString(str);
            int i2 = okB.R;
            O.writeInt(1);
            bundle.writeToParcel(O, 0);
            O.writeInt(1);
            Z.writeToParcel(O, 0);
            O.writeStrongBinder(hyu);
            g_l.L(O, 7);
        } catch (RemoteException e) {
            krG.f5447R.Z(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
