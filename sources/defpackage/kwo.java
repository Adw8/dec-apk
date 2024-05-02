package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: kwo  reason: default package */
/* loaded from: classes.dex */
public class kwo {

    /* renamed from: R  reason: collision with other field name */
    public bG f5489R;

    /* renamed from: R  reason: collision with other field name */
    public iP5 f5491R;

    /* renamed from: R  reason: collision with other field name */
    public Object f5492R;

    /* renamed from: R  reason: collision with other field name */
    public String f5493R;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f5494R;

    /* renamed from: R  reason: collision with other field name */
    public iP5[] f5500R;
    public int V;

    /* renamed from: X  reason: collision with other field name */
    public iP5 f5504X;

    /* renamed from: Z  reason: collision with other field name */
    public iP5 f5506Z;

    /* renamed from: c  reason: collision with other field name */
    public iP5 f5508c;

    /* renamed from: e  reason: collision with other field name */
    public iP5 f5512e;
    public int o;

    /* renamed from: v  reason: collision with other field name */
    public bG f5515v;

    /* renamed from: v  reason: collision with other field name */
    public iP5 f5516v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5497R = false;

    /* renamed from: R  reason: collision with other field name */
    public nLB f5496R = null;

    /* renamed from: R  reason: collision with other field name */
    public g2a f5490R = null;

    /* renamed from: R  reason: collision with other field name */
    public boolean[] f5502R = {true, true};

    /* renamed from: v  reason: collision with other field name */
    public boolean f5518v = true;

    /* renamed from: R  reason: collision with other field name */
    public int f5488R = -1;

    /* renamed from: v  reason: collision with other field name */
    public int f5514v = -1;

    /* renamed from: c  reason: collision with other field name */
    public boolean f5509c = false;

    /* renamed from: e  reason: collision with other field name */
    public boolean f5513e = false;

    /* renamed from: X  reason: collision with other field name */
    public boolean f5505X = false;

    /* renamed from: O  reason: collision with other field name */
    public boolean f5487O = false;

    /* renamed from: c  reason: collision with other field name */
    public int f5507c = -1;

    /* renamed from: e  reason: collision with other field name */
    public int f5511e = -1;

    /* renamed from: X  reason: collision with other field name */
    public int f5503X = 0;

    /* renamed from: O  reason: collision with other field name */
    public int f5485O = 0;

    /* renamed from: L  reason: collision with other field name */
    public int f5482L = 0;

    /* renamed from: R  reason: collision with other field name */
    public int[] f5499R = new int[2];
    public int Z = 0;
    public int m = 0;
    public float R = 1.0f;
    public int x = 0;
    public int H = 0;
    public float v = 1.0f;
    public int U = -1;
    public float c = 1.0f;

    /* renamed from: v  reason: collision with other field name */
    public int[] f5519v = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float e = 0.0f;

    /* renamed from: L  reason: collision with other field name */
    public boolean f5484L = false;
    public int C = 0;
    public int N = 0;

    /* renamed from: O  reason: collision with other field name */
    public iP5 f5486O = new iP5(this, icY.CENTER_X);

    /* renamed from: L  reason: collision with other field name */
    public iP5 f5483L = new iP5(this, icY.CENTER_Y);

    /* renamed from: v  reason: collision with other field name */
    public boolean[] f5521v = new boolean[2];

    /* renamed from: c  reason: collision with other field name */
    public int[] f5510c = {1, 1};

    /* renamed from: R  reason: collision with other field name */
    public kwo f5495R = null;
    public int P = 0;
    public int j = 0;
    public float X = 0.0f;
    public int g = -1;
    public int y = 0;
    public int t = 0;
    public int i = 0;
    public float O = 0.5f;
    public float L = 0.5f;
    public int K = 0;

    /* renamed from: v  reason: collision with other field name */
    public String f5517v = null;
    public int J = 0;
    public int Y = 0;

    /* renamed from: R  reason: collision with other field name */
    public float[] f5498R = {-1.0f, -1.0f};

    /* renamed from: R  reason: collision with other field name */
    public kwo[] f5501R = {null, null};

    /* renamed from: v  reason: collision with other field name */
    public kwo[] f5520v = {null, null};
    public int h = -1;
    public int I = -1;

    public kwo() {
        new HashMap();
        iP5 ip5 = new iP5(this, icY.LEFT);
        this.f5491R = ip5;
        iP5 ip52 = new iP5(this, icY.TOP);
        this.f5516v = ip52;
        iP5 ip53 = new iP5(this, icY.RIGHT);
        this.f5508c = ip53;
        iP5 ip54 = new iP5(this, icY.BOTTOM);
        this.f5512e = ip54;
        iP5 ip55 = new iP5(this, icY.BASELINE);
        this.f5504X = ip55;
        iP5 ip56 = new iP5(this, icY.CENTER);
        this.f5506Z = ip56;
        this.f5500R = new iP5[]{ip5, ip53, ip52, ip54, ip55, ip56};
        ArrayList arrayList = new ArrayList();
        this.f5494R = arrayList;
        arrayList.add(this.f5491R);
        this.f5494R.add(this.f5516v);
        this.f5494R.add(this.f5508c);
        this.f5494R.add(this.f5512e);
        this.f5494R.add(this.f5486O);
        this.f5494R.add(this.f5483L);
        this.f5494R.add(this.f5506Z);
        this.f5494R.add(this.f5504X);
    }

    public static void C(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        n(i, 0, "      size", sb);
        n(i2, 0, "      min", sb);
        n(i3, Integer.MAX_VALUE, "      max", sb);
        n(i4, 0, "      matchMin", sb);
        n(i5, 0, "      matchDef", sb);
        Q(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void N(StringBuilder sb, String str, iP5 ip5) {
        if (ip5.f4581R != null) {
            sb.append("    ");
            sb.append(str);
            sb.append(" : [ '");
            sb.append(ip5.f4581R);
            sb.append("'");
            if (!(ip5.c == Integer.MIN_VALUE && ip5.v == 0)) {
                sb.append(",");
                sb.append(ip5.v);
                if (ip5.c != Integer.MIN_VALUE) {
                    sb.append(",");
                    sb.append(ip5.c);
                    sb.append(",");
                }
            }
            sb.append(" ] ,\n");
        }
    }

    public static void Q(StringBuilder sb, String str, float f, float f2) {
        if (f != f2) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(f);
            sb.append(",\n");
        }
    }

    public static void n(int i, int i2, String str, StringBuilder sb) {
        if (i != i2) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(i);
            sb.append(",\n");
        }
    }

    public final void A(int i, int i2) {
        if (!this.f5509c) {
            this.f5491R.m(i);
            this.f5508c.m(i2);
            this.y = i;
            this.P = i2 - i;
            this.f5509c = true;
        }
    }

    public final kwo H(int i) {
        iP5 ip5;
        iP5 ip52;
        if (i == 0) {
            iP5 ip53 = this.f5491R;
            iP5 ip54 = ip53.f4581R;
            if (ip54 == null || ip54.f4581R != ip53) {
                return null;
            }
            return ip54.f4584R;
        } else if (i == 1 && (ip52 = (ip5 = this.f5516v).f4581R) != null && ip52.f4581R == ip5) {
            return ip52.f4584R;
        } else {
            return null;
        }
    }

    public void I() {
        this.f5491R.L();
        this.f5516v.L();
        this.f5508c.L();
        this.f5512e.L();
        this.f5504X.L();
        this.f5486O.L();
        this.f5483L.L();
        this.f5506Z.L();
        this.f5495R = null;
        this.e = 0.0f;
        this.P = 0;
        this.j = 0;
        this.X = 0.0f;
        this.g = -1;
        this.y = 0;
        this.t = 0;
        this.i = 0;
        this.V = 0;
        this.o = 0;
        this.O = 0.5f;
        this.L = 0.5f;
        int[] iArr = this.f5510c;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f5492R = null;
        this.K = 0;
        this.J = 0;
        this.Y = 0;
        float[] fArr = this.f5498R;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f5507c = -1;
        this.f5511e = -1;
        int[] iArr2 = this.f5519v;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f5485O = 0;
        this.f5482L = 0;
        this.R = 1.0f;
        this.v = 1.0f;
        this.m = Integer.MAX_VALUE;
        this.H = Integer.MAX_VALUE;
        this.Z = 0;
        this.x = 0;
        this.U = -1;
        this.c = 1.0f;
        boolean[] zArr = this.f5502R;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.f5521v;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f5518v = true;
        int[] iArr3 = this.f5499R;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f5488R = -1;
        this.f5514v = -1;
    }

    public final boolean J() {
        return this.f5518v && this.K != 8;
    }

    public final boolean K() {
        iP5 ip5 = this.f5516v;
        iP5 ip52 = ip5.f4581R;
        if (ip52 != null && ip52.f4581R == ip5) {
            return true;
        }
        iP5 ip53 = this.f5512e;
        iP5 ip54 = ip53.f4581R;
        return ip54 != null && ip54.f4581R == ip53;
    }

    public iP5 L(icY icy) {
        switch (icy.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f5491R;
            case 2:
                return this.f5516v;
            case 3:
                return this.f5508c;
            case 4:
                return this.f5512e;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return this.f5504X;
            case 6:
                return this.f5506Z;
            case 7:
                return this.f5486O;
            case VmNativeCallback.$stable:
                return this.f5483L;
            default:
                throw new AssertionError(icy.name());
        }
    }

    public final void O() {
        if (this.f5496R == null) {
            this.f5496R = new nLB(this);
        }
        if (this.f5490R == null) {
            this.f5490R = new g2a(this);
        }
    }

    public final int P() {
        if (this.K == 8) {
            return 0;
        }
        return this.P;
    }

    public final void R(m_b m_b, fhh fhh, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                g4x.P(m_b, fhh, this);
                hashSet.remove(this);
                v(fhh, m_b.E(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet hashSet2 = this.f5491R.f4583R;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((iP5) it.next()).f4584R.R(m_b, fhh, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.f5508c.f4583R;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((iP5) it2.next()).f4584R.R(m_b, fhh, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f5516v.f4583R;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((iP5) it3.next()).f4584R.R(m_b, fhh, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.f5512e.f4583R;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((iP5) it4.next()).f4584R.R(m_b, fhh, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.f5504X.f4583R;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((iP5) it5.next()).f4584R.R(m_b, fhh, hashSet, i, true);
            }
        }
    }

    public final void S(int i, int i2) {
        if (!this.f5513e) {
            this.f5516v.m(i);
            this.f5512e.m(i2);
            this.t = i;
            this.j = i2 - i;
            if (this.f5484L) {
                this.f5504X.m(i + this.i);
            }
            this.f5513e = true;
        }
    }

    public final void T(int i) {
        this.P = i;
        int i2 = this.V;
        if (i < i2) {
            this.P = i2;
        }
    }

    public void U(StringBuilder sb) {
        StringBuilder U = opT.U("  ");
        U.append(this.f5493R);
        U.append(":{\n");
        sb.append(U.toString());
        sb.append("    actualWidth:" + this.P);
        sb.append("\n");
        sb.append("    actualHeight:" + this.j);
        sb.append("\n");
        sb.append("    actualLeft:" + this.y);
        sb.append("\n");
        sb.append("    actualTop:" + this.t);
        sb.append("\n");
        N(sb, "left", this.f5491R);
        N(sb, "top", this.f5516v);
        N(sb, "right", this.f5508c);
        N(sb, "bottom", this.f5512e);
        N(sb, "baseline", this.f5504X);
        N(sb, "centerX", this.f5486O);
        N(sb, "centerY", this.f5483L);
        int i = this.P;
        int i2 = this.V;
        int i3 = this.f5519v[0];
        int i4 = this.Z;
        int i5 = this.f5485O;
        float f = this.R;
        float f2 = this.f5498R[0];
        C(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.j;
        int i7 = this.o;
        int i8 = this.f5519v[1];
        int i9 = this.x;
        int i10 = this.f5482L;
        float f3 = this.v;
        float f4 = this.f5498R[1];
        C(sb, "    height", i6, i7, i8, i9, i10, f3);
        float f5 = this.X;
        int i11 = this.g;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        Q(sb, "    horizontalBias", this.O, 0.5f);
        Q(sb, "    verticalBias", this.L, 0.5f);
        n(this.J, 0, "    horizontalChainStyle", sb);
        n(this.Y, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final boolean V(int i) {
        iP5 ip5;
        iP5 ip52;
        int i2 = i * 2;
        iP5[] ip5Arr = this.f5500R;
        iP5 ip53 = ip5Arr[i2];
        iP5 ip54 = ip53.f4581R;
        return (ip54 == null || ip54.f4581R == ip53 || (ip52 = (ip5 = ip5Arr[i2 + 1]).f4581R) == null || ip52.f4581R != ip5) ? false : true;
    }

    public final void W(int i) {
        this.f5510c[0] = i;
    }

    public final void X(fhh fhh) {
        fhh.H(this.f5491R);
        fhh.H(this.f5516v);
        fhh.H(this.f5508c);
        fhh.H(this.f5512e);
        if (this.i > 0) {
            fhh.H(this.f5504X);
        }
    }

    public boolean Y() {
        return this.f5509c || (this.f5491R.f4585R && this.f5508c.f4585R);
    }

    public final int Z(int i) {
        if (i == 0) {
            return this.f5510c[0];
        }
        if (i == 1) {
            return this.f5510c[1];
        }
        return 0;
    }

    public boolean c() {
        return this.K != 8;
    }

    public final void d(int i) {
        this.j = i;
        int i2 = this.o;
        if (i < i2) {
            this.j = i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0385 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x042d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x04a8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x04d2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:359:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.fhh r32, boolean r33, boolean r34, boolean r35, boolean r36, defpackage.aLq r37, defpackage.aLq r38, int r39, boolean r40, defpackage.iP5 r41, defpackage.iP5 r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
        // Method dump skipped, instructions count: 1334
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwo.e(fhh, boolean, boolean, boolean, boolean, aLq, aLq, int, boolean, iP5, iP5, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final int g() {
        kwo kwo = this.f5495R;
        return (kwo == null || !(kwo instanceof m_b)) ? this.t : ((m_b) kwo).n + this.t;
    }

    public boolean h() {
        return this.f5513e || (this.f5516v.f4585R && this.f5512e.f4585R);
    }

    public final void i(icY icy, kwo kwo, icY icy2, int i, int i2) {
        L(icy).R(kwo.L(icy2), i, i2);
    }

    public final int j() {
        kwo kwo = this.f5495R;
        return (kwo == null || !(kwo instanceof m_b)) ? this.y : ((m_b) kwo).z + this.y;
    }

    public void k(fhh fhh, boolean z) {
        int i;
        int i2;
        g2a g2a;
        nLB nlb;
        iP5 ip5 = this.f5491R;
        fhh.getClass();
        int N = fhh.N(ip5);
        int N2 = fhh.N(this.f5516v);
        int N3 = fhh.N(this.f5508c);
        int N4 = fhh.N(this.f5512e);
        if (z && (nlb = this.f5496R) != null) {
            pgw pgw = ((ora) nlb).f6979R;
            if (pgw.f7167c) {
                pgw pgw2 = ((ora) nlb).f6981v;
                if (pgw2.f7167c) {
                    N = pgw.c;
                    N3 = pgw2.c;
                }
            }
        }
        if (z && (g2a = this.f5490R) != null) {
            pgw pgw3 = ((ora) g2a).f6979R;
            if (pgw3.f7167c) {
                pgw pgw4 = ((ora) g2a).f6981v;
                if (pgw4.f7167c) {
                    N2 = pgw3.c;
                    N4 = pgw4.c;
                }
            }
        }
        int i3 = N4 - N2;
        if (N3 - N < 0 || i3 < 0 || N == Integer.MIN_VALUE || N == Integer.MAX_VALUE || N2 == Integer.MIN_VALUE || N2 == Integer.MAX_VALUE || N3 == Integer.MIN_VALUE || N3 == Integer.MAX_VALUE || N4 == Integer.MIN_VALUE || N4 == Integer.MAX_VALUE) {
            N = 0;
            N2 = 0;
            N3 = 0;
            N4 = 0;
        }
        int i4 = N3 - N;
        int i5 = N4 - N2;
        this.y = N;
        this.t = N2;
        if (this.K == 8) {
            this.P = 0;
            this.j = 0;
            return;
        }
        int[] iArr = this.f5510c;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.P)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.j)) {
            i5 = i;
        }
        this.P = i4;
        this.j = i5;
        int i7 = this.o;
        if (i5 < i7) {
            this.j = i7;
        }
        int i8 = this.V;
        if (i4 < i8) {
            this.P = i8;
        }
        int i9 = this.m;
        if (i9 > 0 && i6 == 3) {
            this.P = Math.min(this.P, i9);
        }
        int i10 = this.H;
        if (i10 > 0 && this.f5510c[1] == 3) {
            this.j = Math.min(this.j, i10);
        }
        int i11 = this.P;
        if (i4 != i11) {
            this.f5488R = i11;
        }
        int i12 = this.j;
        if (i5 != i12) {
            this.f5514v = i12;
        }
    }

    public final int m() {
        if (this.K == 8) {
            return 0;
        }
        return this.j;
    }

    public final boolean o() {
        iP5 ip5 = this.f5491R;
        iP5 ip52 = ip5.f4581R;
        if (ip52 != null && ip52.f4581R == ip5) {
            return true;
        }
        iP5 ip53 = this.f5508c;
        iP5 ip54 = ip53.f4581R;
        return ip54 != null && ip54.f4581R == ip53;
    }

    public void r(boolean z, boolean z2) {
        int i;
        int i2;
        nLB nlb = this.f5496R;
        boolean z3 = z & ((ora) nlb).f6980R;
        g2a g2a = this.f5490R;
        boolean z4 = z2 & ((ora) g2a).f6980R;
        int i3 = ((ora) nlb).f6979R.c;
        int i4 = ((ora) g2a).f6979R.c;
        int i5 = ((ora) nlb).f6981v.c;
        int i6 = ((ora) g2a).f6981v.c;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.y = i3;
        }
        if (z4) {
            this.t = i4;
        }
        if (this.K == 8) {
            this.P = 0;
            this.j = 0;
            return;
        }
        if (z3) {
            if (this.f5510c[0] == 1 && i8 < (i2 = this.P)) {
                i8 = i2;
            }
            this.P = i8;
            int i10 = this.V;
            if (i8 < i10) {
                this.P = i10;
            }
        }
        if (z4) {
            if (this.f5510c[1] == 1 && i9 < (i = this.j)) {
                i9 = i;
            }
            this.j = i9;
            int i11 = this.o;
            if (i9 < i11) {
                this.j = i11;
            }
        }
    }

    public final void s(int i) {
        this.f5510c[1] = i;
    }

    public final boolean t(int i, int i2) {
        iP5 ip5;
        iP5 ip52;
        if (i == 0) {
            iP5 ip53 = this.f5491R.f4581R;
            if (ip53 != null && ip53.f4585R && (ip52 = this.f5508c.f4581R) != null && ip52.f4585R) {
                return (ip52.c() - this.f5508c.e()) - (this.f5491R.e() + this.f5491R.f4581R.c()) >= i2;
            }
        } else {
            iP5 ip54 = this.f5516v.f4581R;
            if (ip54 != null && ip54.f4585R && (ip5 = this.f5512e.f4581R) != null && ip5.f4585R) {
                return (ip5.c() - this.f5512e.e()) - (this.f5516v.e() + this.f5516v.f4581R.c()) >= i2;
            }
        }
        return false;
    }

    public String toString() {
        String str = "";
        StringBuilder U = opT.U(str);
        if (this.f5517v != null) {
            str = jQ.g(opT.U("id: "), this.f5517v, " ");
        }
        U.append(str);
        U.append("(");
        U.append(this.y);
        U.append(", ");
        U.append(this.t);
        U.append(") - (");
        U.append(this.P);
        U.append(" x ");
        return jQ.j(U, this.j, ")");
    }

    public final void u() {
        this.f5509c = false;
        this.f5513e = false;
        this.f5505X = false;
        this.f5487O = false;
        int size = this.f5494R.size();
        for (int i = 0; i < size; i++) {
            iP5 ip5 = (iP5) this.f5494R.get(i);
            ip5.f4585R = false;
            ip5.R = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0634  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x067b  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x06da  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(defpackage.fhh r54, boolean r55) {
        /*
        // Method dump skipped, instructions count: 1954
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwo.v(fhh, boolean):void");
    }

    public final kwo x(int i) {
        iP5 ip5;
        iP5 ip52;
        if (i == 0) {
            iP5 ip53 = this.f5508c;
            iP5 ip54 = ip53.f4581R;
            if (ip54 == null || ip54.f4581R != ip53) {
                return null;
            }
            return ip54.f4584R;
        } else if (i == 1 && (ip52 = (ip5 = this.f5512e).f4581R) != null && ip52.f4581R == ip5) {
            return ip52.f4584R;
        } else {
            return null;
        }
    }

    public final boolean y(int i) {
        if (i == 0) {
            return (this.f5491R.f4581R != null ? 1 : 0) + (this.f5508c.f4581R != null ? 1 : 0) < 2;
        }
        return ((this.f5516v.f4581R != null ? 1 : 0) + (this.f5512e.f4581R != null ? 1 : 0)) + (this.f5504X.f4581R != null ? 1 : 0) < 2;
    }

    public void z(piu piu) {
        this.f5491R.Z();
        this.f5516v.Z();
        this.f5508c.Z();
        this.f5512e.Z();
        this.f5504X.Z();
        this.f5506Z.Z();
        this.f5486O.Z();
        this.f5483L.Z();
    }
}
