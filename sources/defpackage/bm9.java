package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bm9  reason: default package */
/* loaded from: classes.dex */
public abstract class bm9 {
    public static final CopyOnWriteArrayList R = new CopyOnWriteArrayList();

    public static l6X R(String str) {
        boolean z;
        Iterator it = R.iterator();
        while (it.hasNext()) {
            l6X l6x = (l6X) it.next();
            Uc uc = (Uc) l6x;
            synchronized (uc) {
                String str2 = uc.f570R;
                z = true;
                if (str2 == null || !str2.equals(str)) {
                    if (uc.f570R != null || !str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                        z = false;
                    }
                    continue;
                } else {
                    continue;
                }
            }
            if (z) {
                return l6x;
            }
        }
        throw new GeneralSecurityException(opT.H("No KMS client does support: ", str));
    }
}
