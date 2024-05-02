package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: nt4  reason: default package */
/* loaded from: classes.dex */
public final class nt4 {
    public static final zI R = new zI("ExtractorSessionStoreView", 0);

    /* renamed from: R  reason: collision with other field name */
    public final dRx f6617R;

    /* renamed from: R  reason: collision with other field name */
    public final gMW f6618R;

    /* renamed from: R  reason: collision with other field name */
    public final imF f6619R;

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f6620R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public final ReentrantLock f6621R = new ReentrantLock();

    public nt4(dRx drx, imF imf, gMW gmw) {
        this.f6617R = drx;
        this.f6619R = imf;
        this.f6618R = gmw;
    }

    public static String e(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new bRU("Session without pack received.");
    }

    public final void R() {
        this.f6621R.unlock();
    }

    public final Object c(b6E b6e) {
        try {
            this.f6621R.lock();
            return b6e.R();
        } finally {
            this.f6621R.unlock();
        }
    }

    public final aKF v(int i) {
        HashMap hashMap = this.f6620R;
        Integer valueOf = Integer.valueOf(i);
        aKF akf = (aKF) hashMap.get(valueOf);
        if (akf != null) {
            return akf;
        }
        throw new bRU(String.format("Could not find session %d while trying to get it", valueOf), i);
    }
}
