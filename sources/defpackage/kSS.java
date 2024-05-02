package defpackage;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.zzbn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: kSS  reason: default package */
/* loaded from: classes.dex */
public final class kSS extends jEL {
    public final /* synthetic */ int R;
    public final /* synthetic */ krG v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kSS(krG krg, cqI cqi, int i) {
        super(krg, cqi);
        this.R = i;
        this.v = krg;
    }

    @Override // defpackage.jEL, defpackage.nWA
    public final void R(Bundle bundle, Bundle bundle2) {
        switch (this.R) {
            case 1:
                super.R(bundle, bundle2);
                if (!this.v.f5451R.compareAndSet(true, false)) {
                    krG.f5447R.x("Expected keepingAlive to be true, but was false.", new Object[0]);
                }
                if (bundle.getBoolean("keep_alive")) {
                    this.v.c();
                    return;
                }
                return;
            default:
                super.R(bundle, bundle2);
                return;
        }
    }

    @Override // defpackage.jEL, defpackage.nWA
    public final void X(Bundle bundle) {
        switch (this.R) {
            case 1:
                this.v.v.c(((jEL) this).R);
                int i = bundle.getInt("error_code");
                krG.f5447R.L("onError(%d)", Integer.valueOf(i));
                ((jEL) this).R.R(new oZ(i, 0));
                return;
            default:
                super.X(bundle);
                return;
        }
    }

    @Override // defpackage.jEL, defpackage.nWA
    public final void v(ArrayList arrayList) {
        switch (this.R) {
            case 0:
                super.v(arrayList);
                krG krg = this.v;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Bundle bundle = (Bundle) it.next();
                    gMW gmw = krg.f5449R;
                    n2N n2n = krg.f5452R;
                    ArrayList arrayList3 = new ArrayList();
                    ppN ppn = ppN.N;
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
                    HashMap hashMap = new HashMap();
                    int size = stringArrayList.size();
                    boolean z = false;
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        hashMap.put(str, zzbn.v(bundle, str, gmw, n2n, ppn));
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        hashMap.put(str2, zzbn.R(str2, 4, 0, 0, 0, 0.0d, 1, "", ""));
                    }
                    bundle.getLong("total_bytes_to_download");
                    zzbn zzbn = (zzbn) hashMap.values().iterator().next();
                    if (zzbn == null) {
                        krG.f5447R.L("onGetSessionStates: Bundle contained no pack.", new Object[0]);
                    }
                    int i2 = zzbn.R;
                    if (i2 == 1 || i2 == 7 || i2 == 2 || i2 == 3) {
                        z = true;
                    }
                    if (z) {
                        arrayList2.add(zzbn.f2407R);
                    }
                }
                ((jEL) this).R.v(arrayList2);
                return;
            default:
                super.v(arrayList);
                return;
        }
    }
}
