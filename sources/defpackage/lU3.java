package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: lU3  reason: default package */
/* loaded from: classes.dex */
public final class lU3 {

    /* renamed from: R  reason: collision with other field name */
    public m_b f5751R;

    /* renamed from: v  reason: collision with other field name */
    public m_b f5753v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5752R = true;

    /* renamed from: v  reason: collision with other field name */
    public boolean f5754v = true;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f5749R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public kQB f5750R = null;
    public M_ R = new M_();
    public ArrayList v = new ArrayList();

    public lU3(m_b m_b) {
        new ArrayList();
        this.f5751R = m_b;
        this.f5753v = m_b;
    }

    public final void L() {
        cu cuVar;
        Iterator it = ((hqD) this.f5751R).v.iterator();
        while (it.hasNext()) {
            kwo kwo = (kwo) it.next();
            if (!kwo.f5497R) {
                int[] iArr = kwo.f5510c;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = kwo.f5485O;
                int i4 = kwo.f5482L;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                gUH guh = ((ora) kwo.f5496R).f6977R;
                boolean z3 = ((pgw) guh).f7167c;
                gUH guh2 = ((ora) kwo.f5490R).f6977R;
                boolean z4 = ((pgw) guh2).f7167c;
                if (z3 && z4) {
                    O(kwo, 1, ((pgw) guh).c, 1, ((pgw) guh2).c);
                    kwo.f5497R = true;
                } else if (z3 && z) {
                    O(kwo, 1, ((pgw) guh).c, 2, ((pgw) guh2).c);
                    if (i2 == 3) {
                        ((ora) kwo.f5490R).f6977R.X = kwo.m();
                    } else {
                        ((ora) kwo.f5490R).f6977R.e(kwo.m());
                        kwo.f5497R = true;
                    }
                } else if (z4 && z2) {
                    O(kwo, 2, ((pgw) guh).c, 1, ((pgw) guh2).c);
                    if (i == 3) {
                        ((ora) kwo.f5496R).f6977R.X = kwo.P();
                    } else {
                        ((ora) kwo.f5496R).f6977R.e(kwo.P());
                        kwo.f5497R = true;
                    }
                }
                if (kwo.f5497R && (cuVar = kwo.f5490R.R) != null) {
                    cuVar.e(kwo.i);
                }
            }
        }
    }

    public final void O(kwo kwo, int i, int i2, int i3, int i4) {
        M_ m_ = this.R;
        m_.R = i;
        m_.v = i3;
        m_.c = i2;
        m_.e = i4;
        this.f5750R.v(kwo, m_);
        kwo.T(this.R.X);
        kwo.d(this.R.O);
        M_ m_2 = this.R;
        kwo.f5484L = m_2.f292R;
        int i5 = m_2.L;
        kwo.i = i5;
        kwo.f5484L = i5 > 0;
    }

    public final void R(pgw pgw, int i, int i2, ArrayList arrayList, fZp fzp) {
        ora ora = pgw.f7169v;
        if (ora.f6976R == null) {
            m_b m_b = this.f5751R;
            if (ora != ((kwo) m_b).f5496R && ora != ((kwo) m_b).f5490R) {
                if (fzp == null) {
                    fzp = new fZp(ora);
                    arrayList.add(fzp);
                }
                ora.f6976R = fzp;
                fzp.R.add(ora);
                Iterator it = ora.f6979R.f7164R.iterator();
                while (it.hasNext()) {
                    ccT cct = (ccT) it.next();
                    if (cct instanceof pgw) {
                        R((pgw) cct, i, 0, arrayList, fzp);
                    }
                }
                Iterator it2 = ora.f6981v.f7164R.iterator();
                while (it2.hasNext()) {
                    ccT cct2 = (ccT) it2.next();
                    if (cct2 instanceof pgw) {
                        R((pgw) cct2, i, 1, arrayList, fzp);
                    }
                }
                if (i == 1 && (ora instanceof g2a)) {
                    Iterator it3 = ((g2a) ora).c.f7164R.iterator();
                    while (it3.hasNext()) {
                        ccT cct3 = (ccT) it3.next();
                        if (cct3 instanceof pgw) {
                            R((pgw) cct3, i, 2, arrayList, fzp);
                        }
                    }
                }
                Iterator it4 = ora.f6979R.f7168v.iterator();
                while (it4.hasNext()) {
                    R((pgw) it4.next(), i, 0, arrayList, fzp);
                }
                Iterator it5 = ora.f6981v.f7168v.iterator();
                while (it5.hasNext()) {
                    R((pgw) it5.next(), i, 1, arrayList, fzp);
                }
                if (i == 1 && (ora instanceof g2a)) {
                    Iterator it6 = ((g2a) ora).c.f7168v.iterator();
                    while (it6.hasNext()) {
                        R((pgw) it6.next(), i, 2, arrayList, fzp);
                    }
                }
            }
        }
    }

    public final void X(ora ora, int i, ArrayList arrayList) {
        Iterator it = ora.f6979R.f7164R.iterator();
        while (it.hasNext()) {
            ccT cct = (ccT) it.next();
            if (cct instanceof pgw) {
                R((pgw) cct, i, 0, arrayList, null);
            } else if (cct instanceof ora) {
                R(((ora) cct).f6979R, i, 0, arrayList, null);
            }
        }
        Iterator it2 = ora.f6981v.f7164R.iterator();
        while (it2.hasNext()) {
            ccT cct2 = (ccT) it2.next();
            if (cct2 instanceof pgw) {
                R((pgw) cct2, i, 1, arrayList, null);
            } else if (cct2 instanceof ora) {
                R(((ora) cct2).f6981v, i, 1, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((g2a) ora).c.f7164R.iterator();
            while (it3.hasNext()) {
                ccT cct3 = (ccT) it3.next();
                if (cct3 instanceof pgw) {
                    R((pgw) cct3, i, 2, arrayList, null);
                }
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f5749R;
        arrayList.clear();
        ((kwo) this.f5753v).f5496R.O();
        ((kwo) this.f5753v).f5490R.O();
        arrayList.add(((kwo) this.f5753v).f5496R);
        arrayList.add(((kwo) this.f5753v).f5490R);
        Iterator it = ((hqD) this.f5753v).v.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            kwo kwo = (kwo) it.next();
            if (kwo instanceof gOm) {
                arrayList.add(new jTC(kwo));
            } else {
                if (kwo.o()) {
                    if (kwo.f5489R == null) {
                        kwo.f5489R = new bG(0, kwo);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(kwo.f5489R);
                } else {
                    arrayList.add(kwo.f5496R);
                }
                if (kwo.K()) {
                    if (kwo.f5515v == null) {
                        kwo.f5515v = new bG(1, kwo);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(kwo.f5515v);
                } else {
                    arrayList.add(kwo.f5490R);
                }
                if (kwo instanceof lGG) {
                    arrayList.add(new kLl(kwo));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ora) it2.next()).O();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ora ora = (ora) it3.next();
            if (ora.f6978R != this.f5753v) {
                ora.e();
            }
        }
        this.v.clear();
        X(((kwo) this.f5751R).f5496R, 0, this.v);
        X(((kwo) this.f5751R).f5490R, 1, this.v);
        this.f5752R = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(defpackage.m_b r17, int r18) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lU3.e(m_b, int):int");
    }

    public final void v(m_b m_b) {
        int i;
        Iterator it = ((hqD) m_b).v.iterator();
        while (it.hasNext()) {
            kwo kwo = (kwo) it.next();
            int[] iArr = kwo.f5510c;
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (kwo.K == 8) {
                kwo.f5497R = true;
            } else {
                float f = kwo.R;
                if (f < 1.0f && i2 == 3) {
                    kwo.f5485O = 2;
                }
                float f2 = kwo.v;
                if (f2 < 1.0f && i3 == 3) {
                    kwo.f5482L = 2;
                }
                if (kwo.X > 0.0f) {
                    if (i2 == 3 && (i3 == 2 || i3 == 1)) {
                        kwo.f5485O = 3;
                    } else if (i3 == 3 && (i2 == 2 || i2 == 1)) {
                        kwo.f5482L = 3;
                    } else if (i2 == 3 && i3 == 3) {
                        if (kwo.f5485O == 0) {
                            kwo.f5485O = 3;
                        }
                        if (kwo.f5482L == 0) {
                            kwo.f5482L = 3;
                        }
                    }
                }
                if (i2 == 3 && kwo.f5485O == 1 && (kwo.f5491R.f4581R == null || kwo.f5508c.f4581R == null)) {
                    i2 = 2;
                }
                int i4 = (i3 == 3 && kwo.f5482L == 1 && (kwo.f5516v.f4581R == null || kwo.f5512e.f4581R == null)) ? 2 : i3;
                nLB nlb = kwo.f5496R;
                ((ora) nlb).v = i2;
                int i5 = kwo.f5485O;
                ((ora) nlb).R = i5;
                g2a g2a = kwo.f5490R;
                ((ora) g2a).v = i4;
                int i6 = kwo.f5482L;
                ((ora) g2a).R = i6;
                if ((i2 == 4 || i2 == 1 || i2 == 2) && (i4 == 4 || i4 == 1 || i4 == 2)) {
                    int i7 = kwo.P();
                    if (i2 == 4) {
                        i7 = (m_b.P() - kwo.f5491R.v) - kwo.f5508c.v;
                        i2 = 1;
                    }
                    int i8 = kwo.m();
                    if (i4 == 4) {
                        i8 = (m_b.m() - kwo.f5516v.v) - kwo.f5512e.v;
                        i = 1;
                    } else {
                        i = i4;
                    }
                    O(kwo, i2, i7, i, i8);
                    ((ora) kwo.f5496R).f6977R.e(kwo.P());
                    ((ora) kwo.f5490R).f6977R.e(kwo.m());
                    kwo.f5497R = true;
                } else {
                    if (i2 == 3 && (i4 == 2 || i4 == 1)) {
                        if (i5 == 3) {
                            if (i4 == 2) {
                                O(kwo, 2, 0, 2, 0);
                            }
                            int m = kwo.m();
                            O(kwo, 1, (int) ((((float) m) * kwo.X) + 0.5f), 1, m);
                            ((ora) kwo.f5496R).f6977R.e(kwo.P());
                            ((ora) kwo.f5490R).f6977R.e(kwo.m());
                            kwo.f5497R = true;
                        } else if (i5 == 1) {
                            O(kwo, 2, 0, i4, 0);
                            ((ora) kwo.f5496R).f6977R.X = kwo.P();
                        } else if (i5 == 2) {
                            int i9 = ((kwo) m_b).f5510c[0];
                            if (i9 == 1 || i9 == 4) {
                                O(kwo, 1, (int) ((f * ((float) m_b.P())) + 0.5f), i4, kwo.m());
                                ((ora) kwo.f5496R).f6977R.e(kwo.P());
                                ((ora) kwo.f5490R).f6977R.e(kwo.m());
                                kwo.f5497R = true;
                            }
                        } else {
                            iP5[] ip5Arr = kwo.f5500R;
                            if (ip5Arr[0].f4581R == null || ip5Arr[1].f4581R == null) {
                                O(kwo, 2, 0, i4, 0);
                                ((ora) kwo.f5496R).f6977R.e(kwo.P());
                                ((ora) kwo.f5490R).f6977R.e(kwo.m());
                                kwo.f5497R = true;
                            }
                        }
                    }
                    if (i4 == 3 && (i2 == 2 || i2 == 1)) {
                        if (i6 == 3) {
                            if (i2 == 2) {
                                O(kwo, 2, 0, 2, 0);
                            }
                            int P = kwo.P();
                            float f3 = kwo.X;
                            if (kwo.g == -1) {
                                f3 = 1.0f / f3;
                            }
                            O(kwo, 1, P, 1, (int) ((((float) P) * f3) + 0.5f));
                            ((ora) kwo.f5496R).f6977R.e(kwo.P());
                            ((ora) kwo.f5490R).f6977R.e(kwo.m());
                            kwo.f5497R = true;
                        } else if (i6 == 1) {
                            O(kwo, i2, 0, 2, 0);
                            ((ora) kwo.f5490R).f6977R.X = kwo.m();
                        } else if (i6 == 2) {
                            int i10 = ((kwo) m_b).f5510c[1];
                            if (i10 == 1 || i10 == 4) {
                                O(kwo, i2, kwo.P(), 1, (int) ((f2 * ((float) m_b.m())) + 0.5f));
                                ((ora) kwo.f5496R).f6977R.e(kwo.P());
                                ((ora) kwo.f5490R).f6977R.e(kwo.m());
                                kwo.f5497R = true;
                            }
                        } else {
                            iP5[] ip5Arr2 = kwo.f5500R;
                            if (ip5Arr2[2].f4581R == null || ip5Arr2[3].f4581R == null) {
                                O(kwo, 2, 0, i4, 0);
                                ((ora) kwo.f5496R).f6977R.e(kwo.P());
                                ((ora) kwo.f5490R).f6977R.e(kwo.m());
                                kwo.f5497R = true;
                            }
                        }
                    }
                    if (i2 == 3 && i4 == 3) {
                        if (i5 == 1 || i6 == 1) {
                            O(kwo, 2, 0, 2, 0);
                            ((ora) kwo.f5496R).f6977R.X = kwo.P();
                            ((ora) kwo.f5490R).f6977R.X = kwo.m();
                        } else if (i6 == 2 && i5 == 2) {
                            int[] iArr2 = ((kwo) m_b).f5510c;
                            if (iArr2[0] == 1 && iArr2[1] == 1) {
                                O(kwo, 1, (int) ((f * ((float) m_b.P())) + 0.5f), 1, (int) ((f2 * ((float) m_b.m())) + 0.5f));
                                ((ora) kwo.f5496R).f6977R.e(kwo.P());
                                ((ora) kwo.f5490R).f6977R.e(kwo.m());
                                kwo.f5497R = true;
                            }
                        }
                    }
                }
            }
        }
    }
}
