package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: cWy  reason: default package */
/* loaded from: classes.dex */
public class cWy implements Iterable {

    /* renamed from: R  reason: collision with other field name */
    public lVU f2123R;
    public lVU v;
    public WeakHashMap R = new WeakHashMap();
    public int e = 0;

    public lVU R(Object obj) {
        lVU lvu = this.f2123R;
        while (lvu != null && !lvu.R.equals(obj)) {
            lvu = lvu.f5763R;
        }
        return lvu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r1.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((defpackage.m9g) r6).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return true;
     */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof defpackage.cWy
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            cWy r6 = (defpackage.cWy) r6
            int r1 = r5.e
            int r3 = r6.e
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L_0x001b:
            r1 = r5
            m9g r1 = (defpackage.m9g) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0044
            r3 = r6
            m9g r3 = (defpackage.m9g) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L_0x003b
            if (r3 != 0) goto L_0x0043
        L_0x003b:
            if (r1 == 0) goto L_0x001b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L_0x0053
            m9g r6 = (defpackage.m9g) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cWy.equals(java.lang.Object):boolean");
    }

    @Override // java.lang.Object
    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            m9g m9g = (m9g) it;
            if (!m9g.hasNext()) {
                return i;
            }
            i += ((Map.Entry) m9g.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ayt ayt = new ayt(this.f2123R, this.v, 0);
        this.R.put(ayt, Boolean.FALSE);
        return ayt;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("[");
        Iterator it = iterator();
        while (true) {
            m9g m9g = (m9g) it;
            if (m9g.hasNext()) {
                U.append(((Map.Entry) m9g.next()).toString());
                if (m9g.hasNext()) {
                    U.append(", ");
                }
            } else {
                U.append("]");
                return U.toString();
            }
        }
    }

    public Object v(Object obj) {
        lVU R = R(obj);
        if (R == null) {
            return null;
        }
        this.e--;
        if (!this.R.isEmpty()) {
            for (l10 l10 : this.R.keySet()) {
                l10.R(R);
            }
        }
        lVU lvu = R.f5764v;
        if (lvu != null) {
            lvu.f5763R = R.f5763R;
        } else {
            this.f2123R = R.f5763R;
        }
        lVU lvu2 = R.f5763R;
        if (lvu2 != null) {
            lvu2.f5764v = lvu;
        } else {
            this.v = lvu;
        }
        R.f5763R = null;
        R.f5764v = null;
        return R.v;
    }
}
