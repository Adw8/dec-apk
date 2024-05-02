package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: lyV  reason: default package */
/* loaded from: classes.dex */
public final class lyV implements bF9 {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final ngd f5870R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5871R;

    public lyV(boolean z, float f, ngd ngd) {
        this.f5871R = z;
        this.R = f;
        this.f5870R = ngd;
    }

    public static int L(List list, int i, ky1 ky1) {
        cxM cxm;
        Object obj;
        Object obj2;
        Object obj3;
        for (Object obj4 : list) {
            if (n3x.v(c5p.c((cxM) obj4), "TextField")) {
                int intValue = ((Number) ky1.J(obj4, Integer.valueOf(i))).intValue();
                Iterator it = list.iterator();
                while (true) {
                    cxm = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (n3x.v(c5p.c((cxM) obj), "Label")) {
                        break;
                    }
                }
                cxM cxm2 = (cxM) obj;
                int i2 = 0;
                int intValue2 = cxm2 != null ? ((Number) ky1.J(cxm2, Integer.valueOf(i))).intValue() : 0;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (n3x.v(c5p.c((cxM) obj2), "Trailing")) {
                        break;
                    }
                }
                cxM cxm3 = (cxM) obj2;
                int intValue3 = cxm3 != null ? ((Number) ky1.J(cxm3, Integer.valueOf(i))).intValue() : 0;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (n3x.v(c5p.c((cxM) obj3), "Leading")) {
                        break;
                    }
                }
                cxM cxm4 = (cxM) obj3;
                int intValue4 = cxm4 != null ? ((Number) ky1.J(cxm4, Integer.valueOf(i))).intValue() : 0;
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (n3x.v(c5p.c((cxM) next), "Hint")) {
                        cxm = next;
                        break;
                    }
                }
                cxM cxm5 = cxm;
                if (cxm5 != null) {
                    i2 = ((Number) ky1.J(cxm5, Integer.valueOf(i))).intValue();
                }
                long j = c5p.f1968R;
                float f = nZp.R;
                return Math.max(Math.max(intValue, Math.max(intValue2, i2)) + intValue4 + intValue3, oys.x(j));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int O(poS pos, List list, int i, ky1 ky1) {
        cxM cxm;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        for (Object obj5 : list) {
            if (n3x.v(c5p.c((cxM) obj5), "TextField")) {
                int intValue = ((Number) ky1.J(obj5, Integer.valueOf(i))).intValue();
                Iterator it = list.iterator();
                while (true) {
                    cxm = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (n3x.v(c5p.c((cxM) obj), "Label")) {
                        break;
                    }
                }
                cxM cxm2 = (cxM) obj;
                boolean z = false;
                int intValue2 = cxm2 != null ? ((Number) ky1.J(cxm2, Integer.valueOf(i))).intValue() : 0;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (n3x.v(c5p.c((cxM) obj2), "Trailing")) {
                        break;
                    }
                }
                cxM cxm3 = (cxM) obj2;
                int intValue3 = cxm3 != null ? ((Number) ky1.J(cxm3, Integer.valueOf(i))).intValue() : 0;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (n3x.v(c5p.c((cxM) obj3), "Leading")) {
                        break;
                    }
                }
                cxM cxm4 = (cxM) obj3;
                int intValue4 = cxm4 != null ? ((Number) ky1.J(cxm4, Integer.valueOf(i))).intValue() : 0;
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it4.next();
                    if (n3x.v(c5p.c((cxM) obj4), "Hint")) {
                        break;
                    }
                }
                cxM cxm5 = (cxM) obj4;
                int intValue5 = cxm5 != null ? ((Number) ky1.J(cxm5, Integer.valueOf(i))).intValue() : 0;
                Iterator it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next = it5.next();
                    if (n3x.v(c5p.c((cxM) next), "Supporting")) {
                        cxm = next;
                        break;
                    }
                }
                cxM cxm6 = cxm;
                int intValue6 = cxm6 != null ? ((Number) ky1.J(cxm6, Integer.valueOf(i))).intValue() : 0;
                if (intValue2 > 0) {
                    z = true;
                }
                return nZp.c(intValue, z, intValue2, intValue4, intValue3, intValue5, intValue6, c5p.f1968R, pos.D(), this.f5870R);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.bF9
    public final int R(poS pos, List list, int i) {
        return O(pos, list, i, ky1.x);
    }

    @Override // defpackage.bF9
    public final int X(poS pos, List list, int i) {
        return L(list, i, ky1.H);
    }

    @Override // defpackage.bF9
    public final int c(poS pos, List list, int i) {
        return L(list, i, ky1.m);
    }

    @Override // defpackage.bF9
    public final int e(poS pos, List list, int i) {
        return O(pos, list, i, ky1.Z);
    }

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        Object obj;
        Object obj2;
        int i;
        l0f l0f;
        Object obj3;
        int i2;
        Object obj4;
        Object obj5;
        int B = mzf.B(this.f5870R.v());
        int B2 = mzf.B(this.f5870R.R());
        int B3 = mzf.B(nZp.c);
        long R = oys.R(j, 0, 0, 0, 0, 10);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (n3x.v(gQc.n((pc0) obj), "Leading")) {
                break;
            }
        }
        pc0 pc0 = (pc0) obj;
        l0f L = pc0 != null ? pc0.L(R) : null;
        int X = c5p.X(L) + 0;
        int max = Math.max(0, c5p.e(L));
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (n3x.v(gQc.n((pc0) obj2), "Trailing")) {
                break;
            }
        }
        pc0 pc02 = (pc0) obj2;
        if (pc02 != null) {
            i = max;
            l0f = pc02.L(dtx.J(-X, 0, 2, R));
        } else {
            i = max;
            l0f = null;
        }
        int X2 = c5p.X(l0f) + X;
        int max2 = Math.max(i, c5p.e(l0f));
        int i3 = -X2;
        long K = dtx.K(i3, -B2, R);
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (n3x.v(gQc.n((pc0) obj3), "Label")) {
                break;
            }
        }
        pc0 pc03 = (pc0) obj3;
        l0f L2 = pc03 != null ? pc03.L(K) : null;
        if (L2 != null) {
            i2 = L2.P(Qv.v);
            if (i2 == Integer.MIN_VALUE) {
                i2 = L2.X;
            }
        } else {
            i2 = 0;
        }
        int max3 = Math.max(i2, B);
        int i4 = L2 != null ? max3 + B3 : B;
        long K2 = dtx.K(i3, (-i4) - B2, oys.R(j, 0, 0, 0, 0, 11));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            pc0 pc04 = (pc0) it4.next();
            if (n3x.v(gQc.n(pc04), "TextField")) {
                l0f L3 = pc04.L(K2);
                long R2 = oys.R(K2, 0, 0, 0, 0, 14);
                Iterator it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    Object next = it5.next();
                    if (n3x.v(gQc.n((pc0) next), "Hint")) {
                        obj4 = next;
                        break;
                    }
                    it5 = it5;
                }
                pc0 pc05 = (pc0) obj4;
                l0f L4 = pc05 != null ? pc05.L(R2) : null;
                int i5 = 0;
                long R3 = oys.R(dtx.J(0, -Math.max(max2, Math.max(c5p.e(L3), c5p.e(L4)) + i4 + B2), 1, R), 0, 0, 0, 0, 11);
                Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj5 = null;
                        break;
                    }
                    obj5 = it6.next();
                    if (n3x.v(gQc.n((pc0) obj5), "Supporting")) {
                        break;
                    }
                }
                pc0 pc06 = (pc0) obj5;
                l0f L5 = pc06 != null ? pc06.L(R3) : null;
                int e = c5p.e(L5);
                int max4 = Math.max(Math.max(L3.e, Math.max(c5p.X(L2), c5p.X(L4))) + c5p.X(L) + c5p.X(l0f), oys.x(j));
                int c = nZp.c(L3.X, L2 != null, max3, c5p.e(L), c5p.e(l0f), c5p.e(L4), c5p.e(L5), j, mzf.D(), this.f5870R);
                int i6 = c - e;
                Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    pc0 pc07 = (pc0) it7.next();
                    if (n3x.v(gQc.n(pc07), "Container")) {
                        int i7 = max4 != Integer.MAX_VALUE ? max4 : 0;
                        if (i6 != Integer.MAX_VALUE) {
                            i5 = i6;
                        }
                        return mzf.f(max4, c, iia.R, new ady(L2, B, i2, max4, c, L3, L4, L, l0f, pc07.L(dtx.R(i7, max4, i5, i6)), L5, this, max3, B3, mzf));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            it4 = it4;
            i2 = i2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
