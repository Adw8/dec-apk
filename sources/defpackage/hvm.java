package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: hvm  reason: default package */
/* loaded from: classes.dex */
public final class hvm extends cho {
    public final /* synthetic */ int O;
    public final /* synthetic */ String R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ krG f4418R;
    public final /* synthetic */ int X;
    public final /* synthetic */ int e;
    public final /* synthetic */ cqI v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ String f4419v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hvm(krG krg, cqI cqi, int i, String str, String str2, int i2, cqI cqi2, int i3) {
        super(cqi);
        this.e = i3;
        this.f4418R = krg;
        this.X = i;
        this.R = str;
        this.f4419v = str2;
        this.O = i2;
        this.v = cqi2;
    }

    @Override // defpackage.cho
    public final void R() {
        switch (this.e) {
            case 0:
                try {
                    krG krg = this.f4418R;
                    String str = krg.f5450R;
                    int i = this.X;
                    String str2 = this.R;
                    String str3 = this.f4419v;
                    int i2 = this.O;
                    Bundle bundle = new Bundle();
                    bundle.putInt("session_id", i);
                    bundle.putString("module_name", str2);
                    bundle.putString("slice_id", str3);
                    bundle.putInt("chunk_number", i2);
                    Bundle Z = krG.Z();
                    jtj jtj = new jtj(this.f4418R, this.v, 2);
                    g_L g_l = (g_L) ((gs_) krg.f5448R.f2643R);
                    Parcel O = g_l.O();
                    O.writeString(str);
                    int i3 = okB.R;
                    O.writeInt(1);
                    bundle.writeToParcel(O, 0);
                    O.writeInt(1);
                    Z.writeToParcel(O, 0);
                    O.writeStrongBinder(jtj);
                    g_l.L(O, 6);
                    return;
                } catch (RemoteException e) {
                    krG.f5447R.Z(e, "notifyChunkTransferred", new Object[0]);
                    return;
                }
            default:
                try {
                    krG krg2 = this.f4418R;
                    String str4 = krg2.f5450R;
                    int i4 = this.X;
                    String str5 = this.R;
                    String str6 = this.f4419v;
                    int i5 = this.O;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("session_id", i4);
                    bundle2.putString("module_name", str5);
                    bundle2.putString("slice_id", str6);
                    bundle2.putInt("chunk_number", i5);
                    Bundle Z2 = krG.Z();
                    jtj jtj2 = new jtj(this.f4418R, this.v, 1);
                    g_L g_l2 = (g_L) ((gs_) krg2.f5448R.f2643R);
                    Parcel O2 = g_l2.O();
                    O2.writeString(str4);
                    int i6 = okB.R;
                    O2.writeInt(1);
                    bundle2.writeToParcel(O2, 0);
                    O2.writeInt(1);
                    Z2.writeToParcel(O2, 0);
                    O2.writeStrongBinder(jtj2);
                    g_l2.L(O2, 11);
                    return;
                } catch (RemoteException e2) {
                    krG.f5447R.L("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.R, this.f4419v, Integer.valueOf(this.O), Integer.valueOf(this.X));
                    this.v.R(new RuntimeException(e2));
                    return;
                }
        }
    }
}
