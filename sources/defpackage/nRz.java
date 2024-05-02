package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: nRz  reason: default package */
/* loaded from: classes.dex */
public final class nRz {
    public static void R(Object obj) {
        jQ.Y(obj);
        throw null;
    }

    public static bCh X() {
        bCh bch = bCh.R;
        return bch.isEmpty() ? new bCh() : new bCh(bch);
    }

    public static boolean c(Object obj) {
        return !((bCh) obj).f1566R;
    }

    public static bCh e(Object obj, Object obj2) {
        bCh bch = (bCh) obj;
        bCh bch2 = (bCh) obj2;
        if (!bch2.isEmpty()) {
            if (!bch.f1566R) {
                bch = bch.isEmpty() ? new bCh() : new bCh(bch);
            }
            bch.e();
            if (!bch2.isEmpty()) {
                bch.putAll(bch2);
            }
        }
        return bch;
    }

    public static void v(Object obj, Object obj2) {
        bCh bch = (bCh) obj;
        jQ.Y(obj2);
        if (!bch.isEmpty()) {
            Iterator it = bch.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }
}
