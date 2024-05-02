package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    public iMP R;

    /* renamed from: R  reason: collision with other field name */
    public k3P f1342R;

    public c(f5f f5f, iMP imp) {
        k3P k3p;
        HashMap hashMap = gsj.R;
        boolean z = f5f instanceof k3P;
        boolean z2 = f5f instanceof DefaultLifecycleObserver;
        if (z && z2) {
            k3p = new FullLifecycleObserverAdapter((DefaultLifecycleObserver) f5f, (k3P) f5f);
        } else if (z2) {
            k3p = new FullLifecycleObserverAdapter((DefaultLifecycleObserver) f5f, null);
        } else if (z) {
            k3p = (k3P) f5f;
        } else {
            Class<?> cls = f5f.getClass();
            if (gsj.c(cls) == 2) {
                List list = (List) gsj.v.get(cls);
                if (list.size() == 1) {
                    k3p = new SingleGeneratedAdapterObserver(gsj.R((Constructor) list.get(0), f5f));
                } else {
                    mag[] magArr = new mag[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        magArr[i] = gsj.R((Constructor) list.get(i), f5f);
                    }
                    k3p = new CompositeGeneratedAdaptersObserver(magArr);
                }
            } else {
                k3p = new ReflectiveGenericLifecycleObserver(f5f);
            }
        }
        this.f1342R = k3p;
        this.R = imp;
    }

    public final void R(nu_ nu_, alX alx) {
        iMP R = alx.R();
        iMP imp = this.R;
        if (R.compareTo(imp) < 0) {
            imp = R;
        }
        this.R = imp;
        this.f1342R.e(nu_, alx);
        this.R = R;
    }
}
