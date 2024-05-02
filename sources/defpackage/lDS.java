package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: lDS  reason: default package */
/* loaded from: classes.dex */
public final class lDS implements bF9 {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f5614R;

    /* renamed from: R  reason: collision with other field name */
    public final ngd f5615R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5616R;

    public lDS(kg9 kg9, boolean z, float f, ngd ngd) {
        this.f5614R = kg9;
        this.f5616R = z;
        this.R = f;
        this.f5615R = ngd;
    }

    public final int L(poS pos, List list, int i, ky1 ky1) {
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
                return brj.e(intValue4, intValue3, intValue, intValue2, cxm5 != null ? ((Number) ky1.J(cxm5, Integer.valueOf(i))).intValue() : 0, this.R < 1.0f, c5p.f1968R, pos.D(), this.f5615R);
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
                return brj.c(intValue4, intValue3, intValue, intValue2, intValue5, cxm6 != null ? ((Number) ky1.J(cxm6, Integer.valueOf(i))).intValue() : 0, c5p.f1968R, pos.D(), this.f5615R);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.bF9
    public final int R(poS pos, List list, int i) {
        return O(pos, list, i, ky1.O);
    }

    @Override // defpackage.bF9
    public final int X(poS pos, List list, int i) {
        return L(pos, list, i, ky1.L);
    }

    @Override // defpackage.bF9
    public final int c(poS pos, List list, int i) {
        return L(pos, list, i, ky1.X);
    }

    @Override // defpackage.bF9
    public final int e(poS pos, List list, int i) {
        return O(pos, list, i, ky1.e);
    }

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        l0f l0f;
        Object obj4;
        Object obj5;
        int B = mzf.B(this.f5615R.R());
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
        l0f L2 = pc02 != null ? pc02.L(dtx.J(-X, 0, 2, R)) : null;
        int X2 = c5p.X(L2) + X;
        int max2 = Math.max(max, c5p.e(L2));
        boolean z = this.R < 1.0f;
        int B2 = mzf.B(this.f5615R.c(mzf.getLayoutDirection())) + mzf.B(this.f5615R.e(mzf.getLayoutDirection()));
        int i = z ? (-X2) - B2 : -B2;
        int i2 = -B;
        long K = dtx.K(i, i2, R);
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
        l0f L3 = pc03 != null ? pc03.L(K) : null;
        if (L3 != null) {
            l0f = L2;
            this.f5614R.x(new nqW(n1P.e((float) L3.e, (float) L3.X)));
        } else {
            l0f = L2;
        }
        int max3 = Math.max(c5p.e(L3) / 2, mzf.B(this.f5615R.v()));
        long R2 = oys.R(dtx.K(-X2, i2 - max3, j), 0, 0, 0, 0, 11);
        for (Iterator it4 = list.iterator(); it4.hasNext(); it4 = it4) {
            pc0 pc04 = (pc0) it4.next();
            if (n3x.v(gQc.n(pc04), "TextField")) {
                l0f L4 = pc04.L(R2);
                long R3 = oys.R(R2, 0, 0, 0, 0, 14);
                Iterator it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it5.next();
                    if (n3x.v(gQc.n((pc0) obj4), "Hint")) {
                        break;
                    }
                    it5 = it5;
                }
                pc0 pc05 = (pc0) obj4;
                l0f L5 = pc05 != null ? pc05.L(R3) : null;
                int i3 = 0;
                long R4 = oys.R(dtx.J(0, -Math.max(max2, Math.max(c5p.e(L4), c5p.e(L5)) + max3 + B), 1, R), 0, 0, 0, 0, 11);
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
                l0f L6 = pc06 != null ? pc06.L(R4) : null;
                int e = c5p.e(L6);
                int e2 = brj.e(c5p.X(L), c5p.X(l0f), L4.e, c5p.X(L3), c5p.X(L5), z, j, mzf.D(), this.f5615R);
                int c = brj.c(c5p.e(L), c5p.e(l0f), L4.X, c5p.e(L3), c5p.e(L5), c5p.e(L6), j, mzf.D(), this.f5615R);
                int i4 = c - e;
                Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    pc0 pc07 = (pc0) it7.next();
                    if (n3x.v(gQc.n(pc07), "Container")) {
                        int i5 = e2 != Integer.MAX_VALUE ? e2 : 0;
                        if (i4 != Integer.MAX_VALUE) {
                            i3 = i4;
                        }
                        return mzf.f(e2, c, iia.R, new bQ7(c, e2, L, l0f, L4, L3, L5, pc07.L(dtx.R(i5, e2, i3, i4)), L6, this, mzf));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
