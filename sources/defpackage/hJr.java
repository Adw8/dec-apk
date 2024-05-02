package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: hJr  reason: default package */
/* loaded from: classes.dex */
public abstract class hJr {
    public static final fhC R;

    static {
        String str;
        Object obj;
        fhC v;
        int i = mrV.R;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        List Q = pdD.Q(iOY.D(a6.G(opT.N())));
        Iterator it = Q.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int c = ((lVM) obj).c();
                do {
                    Object next = it.next();
                    int c2 = ((lVM) next).c();
                    if (c < c2) {
                        obj = next;
                        c = c2;
                    }
                } while (it.hasNext());
            }
        }
        lVM lvm = (lVM) obj;
        if (lvm == null || (v = lvm.v(Q)) == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        R = v;
    }
}
