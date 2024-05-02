package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: pd9  reason: default package */
/* loaded from: classes.dex */
public final class pd9 extends cho {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ krG f7134R;
    public final /* synthetic */ int e;
    public final /* synthetic */ cqI v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd9(krG krg, cqI cqi, Object obj, cqI cqi2, int i) {
        super(cqi);
        this.e = i;
        this.f7134R = krg;
        this.R = obj;
        this.v = cqi2;
    }

    @Override // defpackage.cho
    public final void R() {
        switch (this.e) {
            case 0:
                List<String> list = (List) this.R;
                ArrayList arrayList = new ArrayList(list.size());
                for (String str : list) {
                    Bundle bundle = new Bundle();
                    bundle.putString("module_name", str);
                    arrayList.add(bundle);
                }
                try {
                    krG krg = this.f7134R;
                    String str2 = krg.f5450R;
                    Bundle Z = krG.Z();
                    jtj jtj = new jtj(this.f7134R, this.v, 0);
                    g_L g_l = (g_L) ((gs_) krg.f5448R.f2643R);
                    Parcel O = g_l.O();
                    O.writeString(str2);
                    O.writeTypedList(arrayList);
                    int i = okB.R;
                    O.writeInt(1);
                    Z.writeToParcel(O, 0);
                    O.writeStrongBinder(jtj);
                    g_l.L(O, 14);
                    return;
                } catch (RemoteException e) {
                    krG.f5447R.Z(e, "cancelDownloads(%s)", (List) this.R);
                    return;
                }
            default:
                try {
                    krG krg2 = this.f7134R;
                    String str3 = krg2.f5450R;
                    Bundle H = krG.H((Map) this.R);
                    kSS kss = new kSS(this.f7134R, this.v, 0);
                    g_L g_l2 = (g_L) ((gs_) krg2.f5448R.f2643R);
                    Parcel O2 = g_l2.O();
                    O2.writeString(str3);
                    int i2 = okB.R;
                    O2.writeInt(1);
                    H.writeToParcel(O2, 0);
                    O2.writeStrongBinder(kss);
                    g_l2.L(O2, 5);
                    return;
                } catch (RemoteException e2) {
                    krG.f5447R.Z(e2, "syncPacks", new Object[0]);
                    this.v.R(new RuntimeException(e2));
                    return;
                }
        }
    }
}
