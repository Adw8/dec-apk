package defpackage;

import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: lLq  reason: default package */
/* loaded from: classes.dex */
public final class lLq implements d0J {
    public static final Logger R = Logger.getLogger(lLq.class.getName());

    /* renamed from: R  reason: collision with other field name */
    public static final byte[] f5656R = {0};

    @Override // defpackage.d0J
    public final Object R(b1t b1t) {
        for (List<npR> list : ((ConcurrentMap) b1t.R).values()) {
            for (npR npr : list) {
                dtx dtx = npr.f6605R;
                if (dtx instanceof TV) {
                    TV tv = (TV) dtx;
                    nE R2 = nE.R(npr.R());
                    if (!R2.equals(tv.u())) {
                        StringBuilder U = opT.U("Mac Key with parameters ");
                        U.append(tv.R);
                        U.append(" has wrong output prefix (");
                        U.append(tv.u());
                        U.append(") instead of (");
                        U.append(R2);
                        U.append(")");
                        throw new GeneralSecurityException(U.toString());
                    }
                }
            }
        }
        return new m_n(b1t);
    }

    @Override // defpackage.d0J
    public final Class c() {
        return gwO.class;
    }

    @Override // defpackage.d0J
    public final Class v() {
        return gwO.class;
    }
}
