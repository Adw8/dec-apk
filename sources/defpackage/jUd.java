package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: jUd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jUd implements b6E {
    public final /* synthetic */ Bundle R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nt4 f4944R;
    public final /* synthetic */ int e;

    public /* synthetic */ jUd(nt4 nt4, Bundle bundle, int i) {
        this.e = i;
        this.f4944R = nt4;
        this.R = bundle;
    }

    @Override // defpackage.b6E
    public final Object R() {
        ca_ ca_;
        boolean z = true;
        switch (this.e) {
            case 0:
                nt4 nt4 = this.f4944R;
                Bundle bundle = this.R;
                nt4.getClass();
                int i = bundle.getInt("session_id");
                if (i == 0) {
                    return Boolean.TRUE;
                }
                HashMap hashMap = nt4.f6620R;
                Integer valueOf = Integer.valueOf(i);
                if (!hashMap.containsKey(valueOf)) {
                    return Boolean.TRUE;
                }
                aKF akf = (aKF) nt4.f6620R.get(valueOf);
                return akf.f839R.R == 6 ? Boolean.FALSE : Boolean.valueOf(!cpc.l(akf.f839R.R, bundle.getInt(biy.I("status", nt4.e(bundle)))));
            default:
                nt4 nt42 = this.f4944R;
                Bundle bundle2 = this.R;
                nt42.getClass();
                int i2 = bundle2.getInt("session_id");
                if (i2 == 0) {
                    return Boolean.FALSE;
                }
                HashMap hashMap2 = nt42.f6620R;
                Integer valueOf2 = Integer.valueOf(i2);
                z = false;
                if (hashMap2.containsKey(valueOf2)) {
                    aKF v = nt42.v(i2);
                    int i3 = bundle2.getInt(biy.I("status", v.f839R.f6323R));
                    n9N n9n = v.f839R;
                    int i4 = n9n.R;
                    if (cpc.l(i4, i3)) {
                        nt4.R.X("Found stale update for session %s with status %d.", valueOf2, Integer.valueOf(i4));
                        n9N n9n2 = v.f839R;
                        String str = n9n2.f6323R;
                        int i5 = n9n2.R;
                        if (i5 == 4) {
                            ((aUC) ((kIP) nt42.f6619R).R()).R(i2, str);
                        } else if (i5 == 5) {
                            ((aUC) ((kIP) nt42.f6619R).R()).X(i2);
                        } else if (i5 == 6) {
                            ((aUC) ((kIP) nt42.f6619R).R()).v(Arrays.asList(str));
                        }
                    } else {
                        n9n.R = i3;
                        if (i3 == 5 || i3 == 6 || i3 == 4) {
                            nt42.c(new gBb(nt42, i2));
                            nt42.f6618R.R(v.f839R.f6323R);
                        } else {
                            for (ca_ ca_2 : n9n.f6324R) {
                                ArrayList parcelableArrayList = bundle2.getParcelableArrayList(biy.z("chunk_intents", v.f839R.f6323R, ca_2.f2149R));
                                if (parcelableArrayList != null) {
                                    for (int i6 = 0; i6 < parcelableArrayList.size(); i6++) {
                                        if (!(parcelableArrayList.get(i6) == null || ((Intent) parcelableArrayList.get(i6)).getData() == null)) {
                                            ((jMe) ca_2.f2150R.get(i6)).R = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    String e = nt4.e(bundle2);
                    long j = bundle2.getLong(biy.I("pack_version", e));
                    String string = bundle2.getString(biy.I("pack_version_tag", e), "");
                    int i7 = bundle2.getInt(biy.I("status", e));
                    long j2 = bundle2.getLong(biy.I("total_bytes_to_download", e));
                    List<String> stringArrayList = bundle2.getStringArrayList(biy.I("slice_ids", e));
                    ArrayList arrayList = new ArrayList();
                    if (stringArrayList == null) {
                        stringArrayList = Collections.emptyList();
                    }
                    for (String str2 : stringArrayList) {
                        List<Intent> parcelableArrayList2 = bundle2.getParcelableArrayList(biy.z("chunk_intents", e, str2));
                        ArrayList arrayList2 = new ArrayList();
                        if (parcelableArrayList2 == null) {
                            parcelableArrayList2 = Collections.emptyList();
                        }
                        for (Intent intent : parcelableArrayList2) {
                            if (intent != null) {
                            }
                            arrayList2.add(new jMe(z));
                            z = true;
                            z = false;
                        }
                        String string2 = bundle2.getString(biy.z("uncompressed_hash_sha256", e, str2));
                        long j3 = bundle2.getLong(biy.z("uncompressed_size", e, str2));
                        int i8 = bundle2.getInt(biy.z("patch_format", e, str2), 0);
                        if (i8 != 0) {
                            ca_ = new ca_(str2, string2, j3, arrayList2, 0, i8);
                            z = false;
                        } else {
                            z = false;
                            ca_ = new ca_(str2, string2, j3, arrayList2, bundle2.getInt(biy.z("compression_format", e, str2), 0), 0);
                        }
                        arrayList.add(ca_);
                        z = true;
                    }
                    nt42.f6620R.put(Integer.valueOf(i2), new aKF(i2, bundle2.getInt("app_version_code"), new n9N(e, j, i7, j2, arrayList, string)));
                }
                return Boolean.TRUE;
        }
    }
}
