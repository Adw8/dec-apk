package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: mMV  reason: default package */
/* loaded from: classes.dex */
public final class mMV {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final bV5 f6014R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f6015R;

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f6016R;

    /* renamed from: R  reason: collision with other field name */
    public final List f6017R;
    public int v;

    public mMV(int i, ArrayList arrayList) {
        this.f6017R = arrayList;
        this.R = i;
        if (i >= 0) {
            this.f6015R = new ArrayList();
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                kFD kfd = (kFD) this.f6017R.get(i3);
                hashMap.put(Integer.valueOf(kfd.v), new hsu(i3, i2, kfd.c));
                i2 += kfd.c;
            }
            this.f6016R = hashMap;
            this.f6014R = new bV5(new fwW(0, this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int R(kFD kfd) {
        hsu hsu = (hsu) this.f6016R.get(Integer.valueOf(kfd.v));
        if (hsu != null) {
            return hsu.v;
        }
        return -1;
    }

    public final boolean v(int i, int i2) {
        int i3;
        hsu hsu = (hsu) this.f6016R.get(Integer.valueOf(i));
        if (hsu == null) {
            return false;
        }
        int i4 = hsu.v;
        int i5 = i2 - hsu.c;
        hsu.c = i2;
        if (i5 == 0) {
            return true;
        }
        for (hsu hsu2 : this.f6016R.values()) {
            if (hsu2.v >= i4 && !n3x.v(hsu2, hsu) && (i3 = hsu2.v + i5) >= 0) {
                hsu2.v = i3;
            }
        }
        return true;
    }
}
