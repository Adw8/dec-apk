package defpackage;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: m_b  reason: default package */
/* loaded from: classes.dex */
public final class m_b extends hqD {
    public int n;
    public int u;
    public int z;
    public CV R = new CV(this);

    /* renamed from: R  reason: collision with other field name */
    public lU3 f6065R = new lU3(this);

    /* renamed from: R  reason: collision with other field name */
    public kQB f6064R = null;
    public boolean Z = false;

    /* renamed from: R  reason: collision with other field name */
    public fhh f6061R = new fhh();
    public int Q = 0;
    public int A = 0;

    /* renamed from: R  reason: collision with other field name */
    public K4[] f6066R = new K4[4];

    /* renamed from: v  reason: collision with other field name */
    public K4[] f6067v = new K4[4];
    public int S = 257;
    public boolean m = false;
    public boolean x = false;

    /* renamed from: R  reason: collision with other field name */
    public WeakReference f6062R = null;
    public WeakReference v = null;
    public WeakReference c = null;
    public WeakReference e = null;

    /* renamed from: R  reason: collision with other field name */
    public HashSet f6063R = new HashSet();

    /* renamed from: R  reason: collision with other field name */
    public M_ f6060R = new M_();

    public static void M(kwo kwo, kQB kqb, M_ m_) {
        int i;
        int i2;
        if (kqb != null) {
            if (kwo.K == 8 || (kwo instanceof gOm) || (kwo instanceof xP)) {
                m_.X = 0;
                m_.O = 0;
                return;
            }
            int[] iArr = kwo.f5510c;
            m_.R = iArr[0];
            boolean z = true;
            m_.v = iArr[1];
            m_.c = kwo.P();
            m_.e = kwo.m();
            m_.f293v = false;
            m_.Z = 0;
            boolean z2 = m_.R == 3;
            boolean z3 = m_.v == 3;
            boolean z4 = z2 && kwo.X > 0.0f;
            boolean z5 = z3 && kwo.X > 0.0f;
            if (z2 && kwo.y(0) && kwo.f5485O == 0 && !z4) {
                m_.R = 2;
                if (z3 && kwo.f5482L == 0) {
                    m_.R = 1;
                }
                z2 = false;
            }
            if (z3 && kwo.y(1) && kwo.f5482L == 0 && !z5) {
                m_.v = 2;
                if (z2 && kwo.f5485O == 0) {
                    m_.v = 1;
                }
                z3 = false;
            }
            if (kwo.Y()) {
                m_.R = 1;
                z2 = false;
            }
            if (kwo.h()) {
                m_.v = 1;
                z3 = false;
            }
            if (z4) {
                if (kwo.f5499R[0] == 4) {
                    m_.R = 1;
                } else if (!z3) {
                    if (m_.v == 1) {
                        i2 = m_.e;
                    } else {
                        m_.R = 2;
                        kqb.v(kwo, m_);
                        i2 = m_.O;
                    }
                    m_.R = 1;
                    m_.c = (int) (kwo.X * ((float) i2));
                }
            }
            if (z5) {
                if (kwo.f5499R[1] == 4) {
                    m_.v = 1;
                } else if (!z2) {
                    if (m_.R == 1) {
                        i = m_.c;
                    } else {
                        m_.v = 2;
                        kqb.v(kwo, m_);
                        i = m_.X;
                    }
                    m_.v = 1;
                    if (kwo.g == -1) {
                        m_.e = (int) (((float) i) / kwo.X);
                    } else {
                        m_.e = (int) (kwo.X * ((float) i));
                    }
                }
            }
            kqb.v(kwo, m_);
            kwo.T(m_.X);
            kwo.d(m_.O);
            kwo.f5484L = m_.f292R;
            int i3 = m_.L;
            kwo.i = i3;
            if (i3 <= 0) {
                z = false;
            }
            kwo.f5484L = z;
            m_.Z = 0;
        }
    }

    public final void B(fhh fhh) {
        boolean E = E(64);
        v(fhh, E);
        int size = ((hqD) this).v.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            kwo kwo = (kwo) ((hqD) this).v.get(i);
            boolean[] zArr = kwo.f5521v;
            zArr[0] = false;
            zArr[1] = false;
            if (kwo instanceof xP) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                kwo kwo2 = (kwo) ((hqD) this).v.get(i2);
                if (kwo2 instanceof xP) {
                    xP xPVar = (xP) kwo2;
                    for (int i3 = 0; i3 < xPVar.u; i3++) {
                        kwo kwo3 = ((lGG) xPVar).c[i3];
                        if (xPVar.Z || kwo3.c()) {
                            int i4 = xPVar.z;
                            if (i4 == 0 || i4 == 1) {
                                kwo3.f5521v[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                kwo3.f5521v[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.f6063R.clear();
        for (int i5 = 0; i5 < size; i5++) {
            kwo kwo4 = (kwo) ((hqD) this).v.get(i5);
            kwo4.getClass();
            if (kwo4 instanceof gOm) {
                kwo4.v(fhh, E);
            }
        }
        while (this.f6063R.size() > 0) {
            int size2 = this.f6063R.size();
            Iterator it = this.f6063R.iterator();
            if (it.hasNext()) {
                jQ.J((kwo) it.next());
                throw null;
            } else if (size2 == this.f6063R.size()) {
                Iterator it2 = this.f6063R.iterator();
                while (it2.hasNext()) {
                    ((kwo) it2.next()).v(fhh, E);
                }
                this.f6063R.clear();
            }
        }
        if (fhh.c) {
            HashSet hashSet = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                kwo kwo5 = (kwo) ((hqD) this).v.get(i6);
                kwo5.getClass();
                if (!(kwo5 instanceof gOm)) {
                    hashSet.add(kwo5);
                }
            }
            R(this, fhh, hashSet, ((kwo) this).f5510c[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                kwo kwo6 = (kwo) it3.next();
                g4x.P(this, fhh, kwo6);
                kwo6.v(fhh, E);
            }
        } else {
            for (int i7 = 0; i7 < size; i7++) {
                kwo kwo7 = (kwo) ((hqD) this).v.get(i7);
                if (kwo7 instanceof m_b) {
                    int[] iArr = kwo7.f5510c;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    if (i8 == 2) {
                        kwo7.W(1);
                    }
                    if (i9 == 2) {
                        kwo7.s(1);
                    }
                    kwo7.v(fhh, E);
                    if (i8 == 2) {
                        kwo7.W(i8);
                    }
                    if (i9 == 2) {
                        kwo7.s(i9);
                    }
                } else {
                    g4x.P(this, fhh, kwo7);
                    if (!(kwo7 instanceof gOm)) {
                        kwo7.v(fhh, E);
                    }
                }
            }
        }
        if (this.Q > 0) {
            iTI.v(this, fhh, null, 0);
        }
        if (this.A > 0) {
            iTI.v(this, fhh, null, 1);
        }
    }

    public final boolean E(int i) {
        return (this.S & i) == i;
    }

    public final void G(int i, kwo kwo) {
        if (i == 0) {
            int i2 = this.Q + 1;
            K4[] k4Arr = this.f6067v;
            if (i2 >= k4Arr.length) {
                this.f6067v = (K4[]) Arrays.copyOf(k4Arr, k4Arr.length * 2);
            }
            K4[] k4Arr2 = this.f6067v;
            int i3 = this.Q;
            k4Arr2[i3] = new K4(kwo, 0, this.Z);
            this.Q = i3 + 1;
        } else if (i == 1) {
            int i4 = this.A + 1;
            K4[] k4Arr3 = this.f6066R;
            if (i4 >= k4Arr3.length) {
                this.f6066R = (K4[]) Arrays.copyOf(k4Arr3, k4Arr3.length * 2);
            }
            K4[] k4Arr4 = this.f6066R;
            int i5 = this.A;
            k4Arr4[i5] = new K4(kwo, 1, this.Z);
            this.A = i5 + 1;
        }
    }

    @Override // defpackage.hqD, defpackage.kwo
    public final void I() {
        this.f6061R.i();
        this.z = 0;
        this.n = 0;
        super.I();
    }

    @Override // defpackage.kwo
    public final void U(StringBuilder sb) {
        sb.append(((kwo) this).f5493R + ":{\n");
        sb.append("  actualWidth:" + this.P);
        sb.append("\n");
        sb.append("  actualHeight:" + this.j);
        sb.append("\n");
        Iterator it = ((hqD) this).v.iterator();
        while (it.hasNext()) {
            ((kwo) it.next()).U(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public final boolean l(int i, boolean z) {
        boolean z2;
        lU3 lu3 = this.f6065R;
        boolean z3 = true;
        boolean z4 = z & true;
        int Z = lu3.f5751R.Z(0);
        int Z2 = lu3.f5751R.Z(1);
        int j = lu3.f5751R.j();
        int g = lu3.f5751R.g();
        if (z4 && (Z == 2 || Z2 == 2)) {
            Iterator it = lu3.f5749R.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ora ora = (ora) it.next();
                if (ora.c == i && !ora.H()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && Z == 2) {
                    lu3.f5751R.W(1);
                    m_b m_b = lu3.f5751R;
                    m_b.T(lu3.e(m_b, 0));
                    m_b m_b2 = lu3.f5751R;
                    ((ora) ((kwo) m_b2).f5496R).f6977R.e(m_b2.P());
                }
            } else if (z4 && Z2 == 2) {
                lu3.f5751R.s(1);
                m_b m_b3 = lu3.f5751R;
                m_b3.d(lu3.e(m_b3, 1));
                m_b m_b4 = lu3.f5751R;
                ((ora) ((kwo) m_b4).f5490R).f6977R.e(m_b4.m());
            }
        }
        if (i == 0) {
            m_b m_b5 = lu3.f5751R;
            int i2 = ((kwo) m_b5).f5510c[0];
            if (i2 == 1 || i2 == 4) {
                int P = m_b5.P() + j;
                ((ora) ((kwo) lu3.f5751R).f5496R).f6981v.e(P);
                ((ora) ((kwo) lu3.f5751R).f5496R).f6977R.e(P - j);
                z2 = true;
            }
            z2 = false;
        } else {
            m_b m_b6 = lu3.f5751R;
            int i3 = ((kwo) m_b6).f5510c[1];
            if (i3 == 1 || i3 == 4) {
                int m = m_b6.m() + g;
                ((ora) ((kwo) lu3.f5751R).f5490R).f6981v.e(m);
                ((ora) ((kwo) lu3.f5751R).f5490R).f6977R.e(m - g);
                z2 = true;
            }
            z2 = false;
        }
        lu3.L();
        Iterator it2 = lu3.f5749R.iterator();
        while (it2.hasNext()) {
            ora ora2 = (ora) it2.next();
            if (ora2.c == i && (ora2.f6978R != lu3.f5751R || ora2.f6980R)) {
                ora2.X();
            }
        }
        Iterator it3 = lu3.f5749R.iterator();
        while (it3.hasNext()) {
            ora ora3 = (ora) it3.next();
            if (ora3.c == i && (z2 || ora3.f6978R != lu3.f5751R)) {
                if (!ora3.f6979R.f7167c || !ora3.f6981v.f7167c || (!(ora3 instanceof bG) && !((pgw) ora3.f6977R).f7167c)) {
                    z3 = false;
                    break;
                }
            }
        }
        lu3.f5751R.W(Z);
        lu3.f5751R.s(Z2);
        return z3;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:520:0x00c5 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: int[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: int[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x05df A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0654 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0664  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0675  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x078d  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x07d4  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0801 A[LOOP:34: B:467:0x07ff->B:468:0x0801, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0869  */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0877  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x088a  */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0895  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0899  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x08d3  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x08d9  */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x08e6  */
    /* JADX WARNING: Removed duplicated region for block: B:608:0x08db A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.hqD
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
        // Method dump skipped, instructions count: 2294
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m_b.p():void");
    }

    @Override // defpackage.kwo
    public final void r(boolean z, boolean z2) {
        super.r(z, z2);
        int size = ((hqD) this).v.size();
        for (int i = 0; i < size; i++) {
            ((kwo) ((hqD) this).v.get(i)).r(z, z2);
        }
    }
}
