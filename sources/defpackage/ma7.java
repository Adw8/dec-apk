package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* renamed from: ma7  reason: default package */
/* loaded from: classes.dex */
public final class ma7 implements clz {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public Object f6078R;
    public int c;
    public int e;
    public int v;

    public /* synthetic */ ma7(int i) {
        this.R = i;
    }

    @Override // defpackage.clz
    public final String A() {
        f(2);
        b5 b5Var = (b5) this.f6078R;
        int Z = b5Var.Z();
        if (Z > 0) {
            int i = b5Var.v;
            int i2 = b5Var.e;
            if (Z <= i - i2) {
                String v = d_A.R.v(b5Var.f1525R, i2, Z);
                b5Var.e += Z;
                return v;
            }
        }
        if (Z == 0) {
            return "";
        }
        if (Z <= 0) {
            throw b7b.e();
        }
        throw b7b.O();
    }

    public final Object B(bvr bvr, nCG ncg) {
        int i = this.c;
        this.c = ((this.v >>> 3) << 3) | 4;
        try {
            Object L = bvr.L();
            bvr.c(L, this, ncg);
            bvr.m(L);
            if (this.v == this.c) {
                return L;
            }
            throw b7b.X();
        } finally {
            this.c = i;
        }
    }

    @Override // defpackage.clz
    public final MH C() {
        byte[] bArr;
        f(2);
        b5 b5Var = (b5) this.f6078R;
        int Z = b5Var.Z();
        if (Z > 0) {
            int i = b5Var.v;
            int i2 = b5Var.e;
            if (Z <= i - i2) {
                MH H = b0.H(b5Var.f1525R, i2, Z);
                b5Var.e += Z;
                return H;
            }
        }
        if (Z == 0) {
            return b0.f1499R;
        }
        if (Z > 0) {
            int i3 = b5Var.v;
            int i4 = b5Var.e;
            if (Z <= i3 - i4) {
                int i5 = Z + i4;
                b5Var.e = i5;
                bArr = Arrays.copyOfRange(b5Var.f1525R, i4, i5);
                MH mh = b0.f1499R;
                return new MH(bArr);
            }
        }
        if (Z > 0) {
            throw b7b.O();
        } else if (Z == 0) {
            bArr = ibk.f4663R;
            MH mh = b0.f1499R;
            return new MH(bArr);
        } else {
            throw b7b.e();
        }
    }

    public final void E(int i) {
        b5 b5Var = (b5) this.f6078R;
        if (b5Var.e - b5Var.X != i) {
            throw b7b.O();
        }
    }

    public final void F(int i) {
        if ((i & 7) != 0) {
            throw b7b.X();
        }
    }

    public final void G(RecyclerView recyclerView, boolean z) {
        boolean z2 = false;
        this.e = 0;
        int[] iArr = (int[]) this.f6078R;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        kds kds = recyclerView.f1400R;
        if (recyclerView.f1392R != null && kds != null && kds.f5380e) {
            if (!z) {
                if (!recyclerView.f1417e || recyclerView.f1419m || recyclerView.f1398R.L()) {
                    z2 = true;
                }
                if (!z2) {
                    kds.Z(this.v, this.c, recyclerView.f1385R, this);
                }
            } else if (!recyclerView.f1398R.L()) {
                kds.m(recyclerView.f1392R.R(), this);
            }
            int i = this.e;
            if (i > kds.R) {
                kds.R = i;
                kds.f5378X = z;
                recyclerView.f1391R.H();
            }
        }
    }

    @Override // defpackage.clz
    public final void H(List list) {
        b5 b5Var;
        int H;
        b5 b5Var2;
        int H2;
        if (list instanceof omi) {
            omi omi = (omi) list;
            int i = this.v & 7;
            if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                a(Z);
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    omi.c(Float.intBitsToFloat(((b5) this.f6078R).O()));
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
            } else if (i == 5) {
                do {
                    omi.c(Float.intBitsToFloat(((b5) this.f6078R).O()));
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else {
                int i3 = b7b.e;
                throw new p3X();
            }
        } else {
            int i4 = this.v & 7;
            if (i4 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                a(Z2);
                b5 b5Var4 = (b5) this.f6078R;
                int i5 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((b5) this.f6078R).O())));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i5);
            } else if (i4 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((b5) this.f6078R).O())));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else {
                int i6 = b7b.e;
                throw new p3X();
            }
        }
    }

    @Override // defpackage.clz
    public final Object I(bvr bvr, nCG ncg) {
        f(2);
        return l(bvr, ncg);
    }

    @Override // defpackage.clz
    public final int J() {
        f(0);
        return ((b5) this.f6078R).Z();
    }

    @Override // defpackage.clz
    public final int K() {
        f(5);
        return ((b5) this.f6078R).O();
    }

    @Override // defpackage.clz
    public final String L() {
        f(2);
        b5 b5Var = (b5) this.f6078R;
        int Z = b5Var.Z();
        if (Z > 0) {
            int i = b5Var.v;
            int i2 = b5Var.e;
            if (Z <= i - i2) {
                String str = new String(b5Var.f1525R, i2, Z, ibk.v);
                b5Var.e += Z;
                return str;
            }
        }
        if (Z == 0) {
            return "";
        }
        if (Z < 0) {
            throw b7b.e();
        }
        throw b7b.O();
    }

    public final void M(List list, boolean z) {
        int H;
        int H2;
        if ((this.v & 7) != 2) {
            int i = b7b.e;
            throw new p3X();
        } else if (!(list instanceof c1n) || z) {
            do {
                list.add(z ? A() : L());
                if (!((b5) this.f6078R).c()) {
                    H = ((b5) this.f6078R).H();
                } else {
                    return;
                }
            } while (H == this.v);
            this.e = H;
        } else {
            c1n c1n = (c1n) list;
            do {
                c1n.O(C());
                if (!((b5) this.f6078R).c()) {
                    H2 = ((b5) this.f6078R).H();
                } else {
                    return;
                }
            } while (H2 == this.v);
            this.e = H2;
        }
    }

    @Override // defpackage.clz
    public final int N() {
        int i = this.e;
        if (i != 0) {
            this.v = i;
            this.e = 0;
        } else {
            this.v = ((b5) this.f6078R).H();
        }
        int i2 = this.v;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // defpackage.clz
    public final void O(List list) {
        int H;
        b5 b5Var;
        int H2;
        b5 b5Var2;
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            int i = this.v & 7;
            if (i == 1) {
                do {
                    j72.c(((b5) this.f6078R).L());
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                F(Z);
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    j72.c(((b5) this.f6078R).L());
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
            } else {
                throw b7b.v();
            }
        } else {
            int i3 = this.v & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(((b5) this.f6078R).L()));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else if (i3 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                F(Z2);
                b5 b5Var4 = (b5) this.f6078R;
                int i4 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Long.valueOf(((b5) this.f6078R).L()));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i4);
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final void P(List list) {
        M(list, true);
    }

    @Override // defpackage.clz
    public final boolean Q() {
        f(0);
        return ((b5) this.f6078R).X();
    }

    @Override // defpackage.clz
    public final long R() {
        f(1);
        return ((b5) this.f6078R).L();
    }

    @Override // defpackage.clz
    public final void S(List list) {
        int H;
        b5 b5Var;
        int H2;
        b5 b5Var2;
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            int i = this.v & 7;
            if (i == 0) {
                do {
                    j72.c(((b5) this.f6078R).m());
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    j72.c(((b5) this.f6078R).m());
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
                E(i2);
            } else {
                throw b7b.v();
            }
        } else {
            int i3 = this.v & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(((b5) this.f6078R).m()));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else if (i3 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                b5 b5Var4 = (b5) this.f6078R;
                int i4 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Long.valueOf(((b5) this.f6078R).m()));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i4);
                E(i4);
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final void T(List list) {
        int H;
        if ((this.v & 7) == 2) {
            do {
                list.add(C());
                if (!((b5) this.f6078R).c()) {
                    H = ((b5) this.f6078R).H();
                } else {
                    return;
                }
            } while (H == this.v);
            this.e = H;
            return;
        }
        int i = b7b.e;
        throw new p3X();
    }

    @Override // defpackage.clz
    public final int U() {
        f(0);
        return ((b5) this.f6078R).Z();
    }

    @Override // defpackage.clz
    public final void V(List list) {
        int H;
        b5 b5Var;
        int H2;
        b5 b5Var2;
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            int i = this.v & 7;
            if (i == 0) {
                do {
                    cuq.c(((b5) this.f6078R).Z());
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    cuq.c(((b5) this.f6078R).Z());
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
                E(i2);
            } else {
                throw b7b.v();
            }
        } else {
            int i3 = this.v & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(((b5) this.f6078R).Z()));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else if (i3 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                b5 b5Var4 = (b5) this.f6078R;
                int i4 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Integer.valueOf(((b5) this.f6078R).Z()));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i4);
                E(i4);
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final void W(List list, bvr bvr, nCG ncg) {
        int H;
        int i = this.v;
        if ((i & 7) == 3) {
            do {
                list.add(B(bvr, ncg));
                if (!((b5) this.f6078R).c() && this.e == 0) {
                    H = ((b5) this.f6078R).H();
                } else {
                    return;
                }
            } while (H == i);
            this.e = H;
            return;
        }
        int i2 = b7b.e;
        throw new p3X();
    }

    @Override // defpackage.clz
    public final int X() {
        return this.v;
    }

    @Override // defpackage.clz
    public final Object Y(bvr bvr, nCG ncg) {
        f(3);
        return B(bvr, ncg);
    }

    @Override // defpackage.clz
    public final void Z(List list) {
        M(list, false);
    }

    public final void a(int i) {
        if ((i & 3) != 0) {
            throw b7b.X();
        }
    }

    @Override // defpackage.clz
    public final long c() {
        f(1);
        return ((b5) this.f6078R).L();
    }

    @Override // defpackage.clz
    public final void d(List list) {
        int H;
        b5 b5Var;
        int H2;
        b5 b5Var2;
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            int i = this.v & 7;
            if (i == 0) {
                do {
                    cuq.c(b5.R(((b5) this.f6078R).Z()));
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    cuq.c(b5.R(((b5) this.f6078R).Z()));
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
                E(i2);
            } else {
                int i3 = b7b.e;
                throw new p3X();
            }
        } else {
            int i4 = this.v & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(b5.R(((b5) this.f6078R).Z())));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else if (i4 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                b5 b5Var4 = (b5) this.f6078R;
                int i5 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Integer.valueOf(b5.R(((b5) this.f6078R).Z())));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i5);
                E(i5);
            } else {
                int i6 = b7b.e;
                throw new p3X();
            }
        }
    }

    @Override // defpackage.clz
    public final void e(List list) {
        int H;
        b5 b5Var;
        int H2;
        b5 b5Var2;
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            int i = this.v & 7;
            if (i == 0) {
                do {
                    cuq.c(((b5) this.f6078R).Z());
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    cuq.c(((b5) this.f6078R).Z());
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
                E(i2);
            } else {
                throw b7b.v();
            }
        } else {
            int i3 = this.v & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(((b5) this.f6078R).Z()));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else if (i3 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                b5 b5Var4 = (b5) this.f6078R;
                int i4 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Integer.valueOf(((b5) this.f6078R).Z()));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i4);
                E(i4);
            } else {
                throw b7b.v();
            }
        }
    }

    public final void f(int i) {
        if ((this.v & 7) != i) {
            throw b7b.v();
        }
    }

    @Override // defpackage.clz
    public final int g() {
        f(0);
        return ((b5) this.f6078R).Z();
    }

    @Override // defpackage.clz
    public final int h() {
        f(0);
        return b5.R(((b5) this.f6078R).Z());
    }

    @Override // defpackage.clz
    public final void i(List list) {
        int H;
        b5 b5Var;
        int H2;
        b5 b5Var2;
        if (list instanceof W2) {
            W2 w2 = (W2) list;
            int i = this.v & 7;
            if (i == 0) {
                do {
                    w2.c(((b5) this.f6078R).X());
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    w2.c(((b5) this.f6078R).X());
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
                E(i2);
            } else {
                throw b7b.v();
            }
        } else {
            int i3 = this.v & 7;
            if (i3 == 0) {
                do {
                    list.add(Boolean.valueOf(((b5) this.f6078R).X()));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else if (i3 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                b5 b5Var4 = (b5) this.f6078R;
                int i4 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Boolean.valueOf(((b5) this.f6078R).X()));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i4);
                E(i4);
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final void j(List list) {
        int H;
        b5 b5Var;
        int H2;
        b5 b5Var2;
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            int i = this.v & 7;
            if (i == 0) {
                do {
                    j72.c(((b5) this.f6078R).m());
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    j72.c(((b5) this.f6078R).m());
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
                E(i2);
            } else {
                throw b7b.v();
            }
        } else {
            int i3 = this.v & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(((b5) this.f6078R).m()));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else if (i3 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                b5 b5Var4 = (b5) this.f6078R;
                int i4 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Long.valueOf(((b5) this.f6078R).m()));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i4);
                E(i4);
            } else {
                throw b7b.v();
            }
        }
    }

    public final void k(grV grv) {
        grv.c = null;
        grv.R = null;
        grv.v = null;
        grv.X = 1;
        int i = this.v;
        if (i > 0) {
            int i2 = this.e;
            if ((i2 & 1) == 0) {
                this.e = i2 + 1;
                this.v = i - 1;
                this.c++;
            }
        }
        grv.R = (grV) this.f6078R;
        this.f6078R = grv;
        int i3 = this.e + 1;
        this.e = i3;
        int i4 = this.v;
        if (i4 > 0 && (i3 & 1) == 0) {
            this.e = i3 + 1;
            this.v = i4 - 1;
            this.c++;
        }
        int i5 = 4;
        while (true) {
            int i6 = i5 - 1;
            if ((this.e & i6) == i6) {
                int i7 = this.c;
                if (i7 == 0) {
                    grV grv2 = (grV) this.f6078R;
                    grV grv3 = grv2.R;
                    grV grv4 = grv3.R;
                    grv3.R = grv4.R;
                    this.f6078R = grv3;
                    grv3.v = grv4;
                    grv3.c = grv2;
                    grv3.X = grv2.X + 1;
                    grv4.R = grv3;
                    grv2.R = grv3;
                } else if (i7 == 1) {
                    grV grv5 = (grV) this.f6078R;
                    grV grv6 = grv5.R;
                    this.f6078R = grv6;
                    grv6.c = grv5;
                    grv6.X = grv5.X + 1;
                    grv5.R = grv6;
                    this.c = 0;
                } else if (i7 == 2) {
                    this.c = 0;
                }
                i5 *= 2;
            } else {
                return;
            }
        }
    }

    public final Object l(bvr bvr, nCG ncg) {
        int Z = ((b5) this.f6078R).Z();
        b5 b5Var = (b5) this.f6078R;
        int i = b5Var.R;
        b5Var.getClass();
        if (i < 100) {
            int e = ((b5) this.f6078R).e(Z);
            Object L = bvr.L();
            ((b5) this.f6078R).R++;
            bvr.c(L, this, ncg);
            bvr.m(L);
            Object obj = this.f6078R;
            if (((b5) obj).O == 0) {
                b5 b5Var2 = (b5) obj;
                b5Var2.R--;
                b5Var2.L = e;
                int i2 = b5Var2.v + b5Var2.c;
                b5Var2.v = i2;
                int i3 = i2 - b5Var2.X;
                if (i3 > e) {
                    int i4 = i3 - e;
                    b5Var2.c = i4;
                    b5Var2.v = i2 - i4;
                } else {
                    b5Var2.c = 0;
                }
                return L;
            }
            throw new b7b("Protocol message end-group tag did not match expected tag.");
        }
        throw new b7b("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // defpackage.clz
    public final void m(List list) {
        int H;
        b5 b5Var;
        int H2;
        b5 b5Var2;
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            int i = this.v & 7;
            if (i == 0) {
                do {
                    cuq.c(((b5) this.f6078R).Z());
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    cuq.c(((b5) this.f6078R).Z());
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
                E(i2);
            } else {
                throw b7b.v();
            }
        } else {
            int i3 = this.v & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(((b5) this.f6078R).Z()));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else if (i3 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                b5 b5Var4 = (b5) this.f6078R;
                int i4 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Integer.valueOf(((b5) this.f6078R).Z()));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i4);
                E(i4);
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final long n() {
        f(0);
        return ((b5) this.f6078R).m();
    }

    @Override // defpackage.clz
    public final void o(List list) {
        b5 b5Var;
        int H;
        b5 b5Var2;
        int H2;
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            int i = this.v & 7;
            if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                a(Z);
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    cuq.c(((b5) this.f6078R).O());
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
            } else if (i == 5) {
                do {
                    cuq.c(((b5) this.f6078R).O());
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else {
                throw b7b.v();
            }
        } else {
            int i3 = this.v & 7;
            if (i3 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                a(Z2);
                b5 b5Var4 = (b5) this.f6078R;
                int i4 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Integer.valueOf(((b5) this.f6078R).O()));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i4);
            } else if (i3 == 5) {
                do {
                    list.add(Integer.valueOf(((b5) this.f6078R).O()));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else {
                throw b7b.v();
            }
        }
    }

    public final void p(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 >= 0) {
            int i3 = this.e * 2;
            Object obj = this.f6078R;
            if (((int[]) obj) == null) {
                int[] iArr = new int[4];
                this.f6078R = iArr;
                Arrays.fill(iArr, -1);
            } else if (i3 >= ((int[]) obj).length) {
                int[] iArr2 = (int[]) obj;
                int[] iArr3 = new int[i3 * 2];
                this.f6078R = iArr3;
                System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            }
            Object obj2 = this.f6078R;
            ((int[]) obj2)[i3] = i;
            ((int[]) obj2)[i3 + 1] = i2;
            this.e++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }

    @Override // defpackage.clz
    public final int r() {
        f(5);
        return ((b5) this.f6078R).O();
    }

    @Override // defpackage.clz
    public final double readDouble() {
        f(1);
        return Double.longBitsToDouble(((b5) this.f6078R).L());
    }

    @Override // defpackage.clz
    public final float readFloat() {
        f(5);
        return Float.intBitsToFloat(((b5) this.f6078R).O());
    }

    @Override // defpackage.clz
    public final void s(List list) {
        int H;
        b5 b5Var;
        int H2;
        b5 b5Var2;
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            int i = this.v & 7;
            if (i == 0) {
                do {
                    j72.c(b5.v(((b5) this.f6078R).m()));
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    j72.c(b5.v(((b5) this.f6078R).m()));
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
                E(i2);
            } else {
                int i3 = b7b.e;
                throw new p3X();
            }
        } else {
            int i4 = this.v & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(b5.v(((b5) this.f6078R).m())));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else if (i4 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                b5 b5Var4 = (b5) this.f6078R;
                int i5 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Long.valueOf(b5.v(((b5) this.f6078R).m())));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i5);
                E(i5);
            } else {
                int i6 = b7b.e;
                throw new p3X();
            }
        }
    }

    @Override // defpackage.clz
    public final long t() {
        f(0);
        return b5.v(((b5) this.f6078R).m());
    }

    public final String toString() {
        switch (this.R) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) sb);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.clz
    public final void u(List list, bvr bvr, nCG ncg) {
        int H;
        int i = this.v;
        if ((i & 7) == 2) {
            do {
                list.add(l(bvr, ncg));
                if (!((b5) this.f6078R).c() && this.e == 0) {
                    H = ((b5) this.f6078R).H();
                } else {
                    return;
                }
            } while (H == i);
            this.e = H;
            return;
        }
        int i2 = b7b.e;
        throw new p3X();
    }

    @Override // defpackage.clz
    public final void v(List list) {
        int H;
        b5 b5Var;
        int H2;
        b5 b5Var2;
        if (list instanceof c6m) {
            c6m c6m = (c6m) list;
            int i = this.v & 7;
            if (i == 1) {
                do {
                    c6m.c(Double.longBitsToDouble(((b5) this.f6078R).L()));
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                F(Z);
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    c6m.c(Double.longBitsToDouble(((b5) this.f6078R).L()));
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
            } else {
                int i3 = b7b.e;
                throw new p3X();
            }
        } else {
            int i4 = this.v & 7;
            if (i4 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((b5) this.f6078R).L())));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else if (i4 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                F(Z2);
                b5 b5Var4 = (b5) this.f6078R;
                int i5 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((b5) this.f6078R).L())));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i5);
            } else {
                int i6 = b7b.e;
                throw new p3X();
            }
        }
    }

    @Override // defpackage.clz
    public final void x(List list) {
        int H;
        b5 b5Var;
        int H2;
        b5 b5Var2;
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            int i = this.v & 7;
            if (i == 1) {
                do {
                    j72.c(((b5) this.f6078R).L());
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                F(Z);
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    j72.c(((b5) this.f6078R).L());
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
            } else {
                throw b7b.v();
            }
        } else {
            int i3 = this.v & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(((b5) this.f6078R).L()));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else if (i3 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                F(Z2);
                b5 b5Var4 = (b5) this.f6078R;
                int i4 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Long.valueOf(((b5) this.f6078R).L()));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i4);
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final void y(List list) {
        b5 b5Var;
        int H;
        b5 b5Var2;
        int H2;
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            int i = this.v & 7;
            if (i == 2) {
                int Z = ((b5) this.f6078R).Z();
                a(Z);
                b5 b5Var3 = (b5) this.f6078R;
                int i2 = (b5Var3.e - b5Var3.X) + Z;
                do {
                    cuq.c(((b5) this.f6078R).O());
                    b5Var2 = (b5) this.f6078R;
                } while (b5Var2.e - b5Var2.X < i2);
            } else if (i == 5) {
                do {
                    cuq.c(((b5) this.f6078R).O());
                    if (!((b5) this.f6078R).c()) {
                        H2 = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H2 == this.v);
                this.e = H2;
            } else {
                throw b7b.v();
            }
        } else {
            int i3 = this.v & 7;
            if (i3 == 2) {
                int Z2 = ((b5) this.f6078R).Z();
                a(Z2);
                b5 b5Var4 = (b5) this.f6078R;
                int i4 = (b5Var4.e - b5Var4.X) + Z2;
                do {
                    list.add(Integer.valueOf(((b5) this.f6078R).O()));
                    b5Var = (b5) this.f6078R;
                } while (b5Var.e - b5Var.X < i4);
            } else if (i3 == 5) {
                do {
                    list.add(Integer.valueOf(((b5) this.f6078R).O()));
                    if (!((b5) this.f6078R).c()) {
                        H = ((b5) this.f6078R).H();
                    } else {
                        return;
                    }
                } while (H == this.v);
                this.e = H;
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final long z() {
        f(0);
        return ((b5) this.f6078R).m();
    }

    public ma7(char[] cArr, int i, int i2) {
        this.R = 0;
        this.v = cArr.length;
        this.f6078R = cArr;
        this.c = i;
        this.e = i2;
    }

    public ma7(b5 b5Var) {
        this.R = 2;
        this.e = 0;
        Charset charset = ibk.R;
        this.f6078R = b5Var;
        b5Var.f1524R = this;
    }
}
