package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: iOY  reason: default package */
/* loaded from: classes.dex */
public abstract class iOY extends a6 {
    public static final ArrayList D(pvc pvc) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : pvc) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static String E(pvc pvc, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : pvc) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            n3x.R(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final Comparable F(k0v k0v) {
        Iterator it = k0v.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final k0v a(pvc pvc, kg9 kg9) {
        return new k0v(pvc, kg9, 2);
    }

    public static final Object f(pvc pvc) {
        Iterator it = pvc.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }
}
