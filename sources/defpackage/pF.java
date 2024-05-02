package defpackage;

import android.app.Application;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

/* renamed from: pF  reason: default package */
/* loaded from: classes.dex */
public abstract class pF extends Application implements a0A {
    public F4 R;

    /* renamed from: R  reason: collision with other field name */
    public glK f7069R;

    /* renamed from: R  reason: collision with other field name */
    public hVj f7070R;

    /* renamed from: R  reason: collision with other field name */
    public nax f7071R;

    static {
        mY9 my9 = new mY9();
        pby[] pbyArr = kxm.R;
        int length = pbyArr.length;
        Object[] copyOf = Arrays.copyOf(pbyArr, length + 1);
        copyOf[length] = my9;
        kxm.R = (pby[]) copyOf;
    }

    @Override // android.app.Application
    public void onCreate() {
        k4H k4h;
        super.onCreate();
        pby[] pbyArr = kxm.R;
        hVj hvj = this.f7070R;
        if (hvj == null) {
            hvj = null;
        }
        pby[] pbyArr2 = kxm.R;
        int length = pbyArr2.length;
        Object[] copyOf = Arrays.copyOf(pbyArr2, length + 1);
        copyOf[length] = hvj;
        kxm.R = (pby[]) copyOf;
        F4 f4 = this.R;
        if (f4 == null) {
            f4 = null;
        }
        f4.getClass();
        mjG.e = 2;
        mjG.X = 5;
        if (Y5.c) {
            HashSet hashSet = iBd.f4485R;
            hashSet.addAll(Arrays.asList("L"));
            String[] strArr = new String[hashSet.size()];
            hashSet.toArray(strArr);
            iBd.v(strArr);
        }
        ExecutorService executorService = gQ7.R;
        atb atb = new atb();
        atb.R = 8;
        synchronized (biy.class) {
            if (!biy.f1775R) {
                k4H[] k4hArr = biy.f1777R;
                synchronized (k4hArr) {
                    k4h = k4hArr[0];
                    if (k4h != null && k4h.e < 0) {
                        k4hArr[0] = null;
                    }
                }
                if (k4h == null) {
                    biy.R = atb;
                }
            }
            throw new IllegalStateException("The main shell was already created");
        }
        LifecycleCoroutineScopeImpl N = mxC.N();
        h8R h8r = iFn.R;
        l6.z(N, h8r, 0, new C5(this, null), 2);
        l6.z(mxC.N(), h8r, 0, new n_(this, null), 2);
    }
}
