package defpackage;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: nLx  reason: default package */
/* loaded from: classes.dex */
public final class nLx implements clz {
    public int e = -1;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6377R = false;
    public int X = 0;
    public int R = 0;
    public int v = 0;
    public int c = Integer.MIN_VALUE;

    /* renamed from: R  reason: collision with other field name */
    public Object f6376R = null;

    @Override // defpackage.clz
    public final String A() {
        return M(true);
    }

    public final long B() {
        int i = this.R;
        byte[] bArr = (byte[]) this.f6376R;
        this.R = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // defpackage.clz
    public final MH C() {
        MH mh;
        w(2);
        int f = f();
        if (f == 0) {
            return b0.f1499R;
        }
        D(f);
        if (this.f6377R) {
            int i = this.R;
            MH mh2 = b0.f1499R;
            mh = new Kn((byte[]) this.f6376R, i, f);
        } else {
            mh = b0.H((byte[]) this.f6376R, this.R, f);
        }
        this.R += f;
        return mh;
    }

    public final void D(int i) {
        if (i < 0 || i > this.c - this.R) {
            throw b7b.O();
        }
    }

    public final void E(List list, boolean z) {
        int i;
        int i2;
        if ((this.e & 7) != 2) {
            int i3 = b7b.e;
            throw new p3X();
        } else if (!(list instanceof c1n) || z) {
            do {
                list.add(M(z));
                if (!k()) {
                    i = this.R;
                } else {
                    return;
                }
            } while (f() == this.e);
            this.R = i;
        } else {
            c1n c1n = (c1n) list;
            do {
                c1n.O(C());
                if (!k()) {
                    i2 = this.R;
                } else {
                    return;
                }
            } while (f() == this.e);
            this.R = i2;
        }
    }

    public final long F() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.R;
            if (i2 != this.c) {
                this.R = i2 + 1;
                byte b = ((byte[]) this.f6376R)[i2];
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            } else {
                throw b7b.O();
            }
        }
        throw b7b.c();
    }

    public final int G() {
        int i = this.R;
        byte[] bArr = (byte[]) this.f6376R;
        this.R = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Override // defpackage.clz
    public final void H(List list) {
        int i;
        int i2;
        if (list instanceof omi) {
            omi omi = (omi) list;
            int i3 = this.e & 7;
            if (i3 == 2) {
                int f = f();
                _(f);
                int i4 = this.R + f;
                while (this.R < i4) {
                    omi.c(Float.intBitsToFloat(G()));
                }
            } else if (i3 == 5) {
                do {
                    omi.c(readFloat());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else {
                throw b7b.v();
            }
        } else {
            int i5 = this.e & 7;
            if (i5 == 2) {
                int f2 = f();
                _(f2);
                int i6 = this.R + f2;
                while (this.R < i6) {
                    list.add(Float.valueOf(Float.intBitsToFloat(G())));
                }
            } else if (i5 == 5) {
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final Object I(bvr bvr, nCG ncg) {
        w(2);
        return l(bvr, ncg);
    }

    @Override // defpackage.clz
    public final int J() {
        w(0);
        return f();
    }

    @Override // defpackage.clz
    public final int K() {
        w(5);
        D(4);
        return G();
    }

    @Override // defpackage.clz
    public final String L() {
        return M(false);
    }

    public final String M(boolean z) {
        w(2);
        int f = f();
        if (f == 0) {
            return "";
        }
        D(f);
        if (z) {
            int i = this.R;
            if (!d_A.X((byte[]) this.f6376R, i, i + f)) {
                throw b7b.R();
            }
        }
        String str = new String((byte[]) this.f6376R, this.R, f, ibk.v);
        this.R += f;
        return str;
    }

    @Override // defpackage.clz
    public final int N() {
        if (k()) {
            return Integer.MAX_VALUE;
        }
        int f = f();
        this.e = f;
        if (f == this.X) {
            return Integer.MAX_VALUE;
        }
        return f >>> 3;
    }

    @Override // defpackage.clz
    public final void O(List list) {
        int i;
        int i2;
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            int i3 = this.e & 7;
            if (i3 == 1) {
                do {
                    j72.c(R());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else if (i3 == 2) {
                int f = f();
                mL(f);
                int i4 = this.R + f;
                while (this.R < i4) {
                    j72.c(B());
                }
            } else {
                throw b7b.v();
            }
        } else {
            int i5 = this.e & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(R()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else if (i5 == 2) {
                int f2 = f();
                mL(f2);
                int i6 = this.R + f2;
                while (this.R < i6) {
                    list.add(Long.valueOf(B()));
                }
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final void P(List list) {
        E(list, true);
    }

    @Override // defpackage.clz
    public final boolean Q() {
        w(0);
        return f() != 0;
    }

    @Override // defpackage.clz
    public final long R() {
        w(1);
        D(8);
        return B();
    }

    @Override // defpackage.clz
    public final void S(List list) {
        int i;
        int i2;
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    j72.c(z());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else if (i3 == 2) {
                int f = this.R + f();
                while (this.R < f) {
                    j72.c(a());
                }
                b(f);
            } else {
                throw b7b.v();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(z()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else if (i4 == 2) {
                int f2 = this.R + f();
                while (this.R < f2) {
                    list.add(Long.valueOf(a()));
                }
                b(f2);
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final void T(List list) {
        int i;
        if ((this.e & 7) == 2) {
            do {
                list.add(C());
                if (!k()) {
                    i = this.R;
                } else {
                    return;
                }
            } while (f() == this.e);
            this.R = i;
            return;
        }
        int i2 = b7b.e;
        throw new p3X();
    }

    @Override // defpackage.clz
    public final int U() {
        w(0);
        return f();
    }

    @Override // defpackage.clz
    public final void V(List list) {
        int i;
        int i2;
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    cuq.c(U());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else if (i3 == 2) {
                int f = this.R + f();
                while (this.R < f) {
                    cuq.c(f());
                }
            } else {
                throw b7b.v();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(U()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else if (i4 == 2) {
                int f2 = this.R + f();
                while (this.R < f2) {
                    list.add(Integer.valueOf(f()));
                }
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final void W(List list, bvr bvr, nCG ncg) {
        int i;
        int i2 = this.e;
        if ((i2 & 7) == 3) {
            do {
                list.add(p(bvr, ncg));
                if (!k()) {
                    i = this.R;
                } else {
                    return;
                }
            } while (f() == i2);
            this.R = i;
            return;
        }
        int i3 = b7b.e;
        throw new p3X();
    }

    @Override // defpackage.clz
    public final int X() {
        return this.e;
    }

    @Override // defpackage.clz
    public final Object Y(bvr bvr, nCG ncg) {
        w(3);
        return p(bvr, ncg);
    }

    @Override // defpackage.clz
    public final void Z(List list) {
        E(list, false);
    }

    public final void _(int i) {
        D(i);
        if ((i & 3) != 0) {
            throw b7b.X();
        }
    }

    public final long a() {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.R;
        int i3 = this.c;
        if (i3 != i2) {
            byte[] bArr = (byte[]) this.f6376R;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.R = i4;
                return (long) b;
            } else if (i3 - i4 < 9) {
                return F();
            } else {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ -128;
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j = (long) (i8 ^ 16256);
                        i5 = i7;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ -2080896;
                        } else {
                            long j4 = (long) i9;
                            i5++;
                            long j5 = j4 ^ (((long) bArr[i5]) << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i5++;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i5++;
                                    j5 = j6 ^ (((long) bArr[i5]) << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5++;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            int i10 = i5 + 1;
                                            long j7 = (j6 ^ (((long) bArr[i5]) << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i5 = i10 + 1;
                                                if (((long) bArr[i10]) < 0) {
                                                    throw b7b.c();
                                                }
                                            } else {
                                                i5 = i10;
                                            }
                                            j = j7;
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                            }
                            j = j5 ^ j3;
                        }
                    }
                    this.R = i5;
                    return j;
                }
                j = (long) i;
                this.R = i5;
                return j;
            }
        } else {
            throw b7b.O();
        }
    }

    public final void b(int i) {
        if (this.R != i) {
            throw b7b.O();
        }
    }

    @Override // defpackage.clz
    public final long c() {
        w(1);
        D(8);
        return B();
    }

    @Override // defpackage.clz
    public final void d(List list) {
        int i;
        int i2;
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    cuq.c(h());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else if (i3 == 2) {
                int f = this.R + f();
                while (this.R < f) {
                    cuq.c(b5.R(f()));
                }
            } else {
                throw b7b.v();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(h()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else if (i4 == 2) {
                int f2 = this.R + f();
                while (this.R < f2) {
                    list.add(Integer.valueOf(b5.R(f())));
                }
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final void e(List list) {
        int i;
        int i2;
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    cuq.c(J());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else if (i3 == 2) {
                int f = this.R + f();
                while (this.R < f) {
                    cuq.c(f());
                }
            } else {
                throw b7b.v();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(J()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else if (i4 == 2) {
                int f2 = this.R + f();
                while (this.R < f2) {
                    list.add(Integer.valueOf(f()));
                }
            } else {
                throw b7b.v();
            }
        }
    }

    public final int f() {
        int i;
        int i2 = this.R;
        int i3 = this.c;
        if (i3 != i2) {
            Object obj = this.f6376R;
            int i4 = i2 + 1;
            byte b = ((byte[]) obj)[i2];
            if (b >= 0) {
                this.R = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return (int) F();
            } else {
                int i5 = i4 + 1;
                int i6 = b ^ (((byte[]) obj)[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ -128;
                } else {
                    i5++;
                    int i7 = i6 ^ (((byte[]) obj)[i5] << 14);
                    if (i7 >= 0) {
                        i = i7 ^ 16256;
                    } else {
                        i5++;
                        int i8 = i7 ^ (((byte[]) obj)[i5] << 21);
                        if (i8 < 0) {
                            i = i8 ^ -2080896;
                        } else {
                            i5++;
                            byte b2 = ((byte[]) obj)[i5];
                            i = (i8 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5++;
                                if (((byte[]) obj)[i5] < 0) {
                                    i5++;
                                    if (((byte[]) obj)[i5] < 0) {
                                        i5++;
                                        if (((byte[]) obj)[i5] < 0) {
                                            i5++;
                                            if (((byte[]) obj)[i5] < 0) {
                                                i5++;
                                                if (((byte[]) obj)[i5] < 0) {
                                                    throw b7b.c();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.R = i5;
                return i;
            }
        } else {
            throw b7b.O();
        }
    }

    @Override // defpackage.clz
    public final int g() {
        w(0);
        return f();
    }

    @Override // defpackage.clz
    public final int h() {
        w(0);
        return b5.R(f());
    }

    @Override // defpackage.clz
    public final void i(List list) {
        int i;
        int i2;
        if (list instanceof W2) {
            W2 w2 = (W2) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    w2.c(Q());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else if (i3 == 2) {
                int f = this.R + f();
                while (this.R < f) {
                    w2.c(f() != 0);
                }
                b(f);
            } else {
                throw b7b.v();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Boolean.valueOf(Q()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else if (i4 == 2) {
                int f2 = this.R + f();
                while (this.R < f2) {
                    list.add(Boolean.valueOf(f() != 0));
                }
                b(f2);
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final void j(List list) {
        int i;
        int i2;
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    j72.c(n());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else if (i3 == 2) {
                int f = this.R + f();
                while (this.R < f) {
                    j72.c(a());
                }
                b(f);
            } else {
                throw b7b.v();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(n()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else if (i4 == 2) {
                int f2 = this.R + f();
                while (this.R < f2) {
                    list.add(Long.valueOf(a()));
                }
                b(f2);
            } else {
                throw b7b.v();
            }
        }
    }

    public final boolean k() {
        return this.R == this.c;
    }

    public final Object l(bvr bvr, nCG ncg) {
        int f = f();
        D(f);
        int i = this.c;
        int i2 = this.R + f;
        this.c = i2;
        try {
            Object L = bvr.L();
            bvr.c(L, this, ncg);
            bvr.m(L);
            if (this.R == i2) {
                return L;
            }
            throw b7b.X();
        } finally {
            this.c = i;
        }
    }

    @Override // defpackage.clz
    public final void m(List list) {
        int i;
        int i2;
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    cuq.c(g());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else if (i3 == 2) {
                int f = this.R + f();
                while (this.R < f) {
                    cuq.c(f());
                }
                b(f);
            } else {
                throw b7b.v();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(g()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else if (i4 == 2) {
                int f2 = this.R + f();
                while (this.R < f2) {
                    list.add(Integer.valueOf(f()));
                }
                b(f2);
            } else {
                throw b7b.v();
            }
        }
    }

    public final void mL(int i) {
        D(i);
        if ((i & 7) != 0) {
            throw b7b.X();
        }
    }

    @Override // defpackage.clz
    public final long n() {
        w(0);
        return a();
    }

    @Override // defpackage.clz
    public final void o(List list) {
        int i;
        int i2;
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            int i3 = this.e & 7;
            if (i3 == 2) {
                int f = f();
                _(f);
                int i4 = this.R + f;
                while (this.R < i4) {
                    cuq.c(G());
                }
            } else if (i3 == 5) {
                do {
                    cuq.c(K());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else {
                throw b7b.v();
            }
        } else {
            int i5 = this.e & 7;
            if (i5 == 2) {
                int f2 = f();
                _(f2);
                int i6 = this.R + f2;
                while (this.R < i6) {
                    list.add(Integer.valueOf(G()));
                }
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(K()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else {
                throw b7b.v();
            }
        }
    }

    public final Object p(bvr bvr, nCG ncg) {
        int i = this.X;
        this.X = ((this.e >>> 3) << 3) | 4;
        try {
            Object L = bvr.L();
            bvr.c(L, this, ncg);
            bvr.m(L);
            if (this.e == this.X) {
                return L;
            }
            throw b7b.X();
        } finally {
            this.X = i;
        }
    }

    public final void q(RecyclerView recyclerView) {
        int i = this.e;
        if (i >= 0) {
            this.e = -1;
            recyclerView.r(i);
            this.f6377R = false;
        } else if (this.f6377R) {
            Interpolator interpolator = (Interpolator) this.f6376R;
            if (interpolator == null || this.c >= 1) {
                int i2 = this.c;
                if (i2 >= 1) {
                    recyclerView.f1404R.v(this.R, this.v, i2, interpolator);
                    int i3 = this.X + 1;
                    this.X = i3;
                    if (i3 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f6377R = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else {
            this.X = 0;
        }
    }

    @Override // defpackage.clz
    public final int r() {
        w(5);
        D(4);
        return G();
    }

    @Override // defpackage.clz
    public final double readDouble() {
        w(1);
        D(8);
        return Double.longBitsToDouble(B());
    }

    @Override // defpackage.clz
    public final float readFloat() {
        w(5);
        D(4);
        return Float.intBitsToFloat(G());
    }

    @Override // defpackage.clz
    public final void s(List list) {
        int i;
        int i2;
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    j72.c(t());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else if (i3 == 2) {
                int f = this.R + f();
                while (this.R < f) {
                    j72.c(b5.v(a()));
                }
            } else {
                throw b7b.v();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(t()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else if (i4 == 2) {
                int f2 = this.R + f();
                while (this.R < f2) {
                    list.add(Long.valueOf(b5.v(a())));
                }
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final long t() {
        w(0);
        return b5.v(a());
    }

    @Override // defpackage.clz
    public final void u(List list, bvr bvr, nCG ncg) {
        int i;
        int i2 = this.e;
        if ((i2 & 7) == 2) {
            do {
                list.add(l(bvr, ncg));
                if (!k()) {
                    i = this.R;
                } else {
                    return;
                }
            } while (f() == i2);
            this.R = i;
            return;
        }
        int i3 = b7b.e;
        throw new p3X();
    }

    @Override // defpackage.clz
    public final void v(List list) {
        int i;
        int i2;
        if (list instanceof c6m) {
            c6m c6m = (c6m) list;
            int i3 = this.e & 7;
            if (i3 == 1) {
                do {
                    c6m.c(readDouble());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else if (i3 == 2) {
                int f = f();
                mL(f);
                int i4 = this.R + f;
                while (this.R < i4) {
                    c6m.c(Double.longBitsToDouble(B()));
                }
            } else {
                throw b7b.v();
            }
        } else {
            int i5 = this.e & 7;
            if (i5 == 1) {
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else if (i5 == 2) {
                int f2 = f();
                mL(f2);
                int i6 = this.R + f2;
                while (this.R < i6) {
                    list.add(Double.valueOf(Double.longBitsToDouble(B())));
                }
            } else {
                throw b7b.v();
            }
        }
    }

    public final void w(int i) {
        if ((this.e & 7) != i) {
            throw b7b.v();
        }
    }

    @Override // defpackage.clz
    public final void x(List list) {
        int i;
        int i2;
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            int i3 = this.e & 7;
            if (i3 == 1) {
                do {
                    j72.c(c());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else if (i3 == 2) {
                int f = f();
                mL(f);
                int i4 = this.R + f;
                while (this.R < i4) {
                    j72.c(B());
                }
            } else {
                throw b7b.v();
            }
        } else {
            int i5 = this.e & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(c()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else if (i5 == 2) {
                int f2 = f();
                mL(f2);
                int i6 = this.R + f2;
                while (this.R < i6) {
                    list.add(Long.valueOf(B()));
                }
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final void y(List list) {
        int i;
        int i2;
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            int i3 = this.e & 7;
            if (i3 == 2) {
                int f = f();
                _(f);
                int i4 = this.R + f;
                while (this.R < i4) {
                    cuq.c(G());
                }
            } else if (i3 == 5) {
                do {
                    cuq.c(r());
                    if (!k()) {
                        i2 = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i2;
            } else {
                throw b7b.v();
            }
        } else {
            int i5 = this.e & 7;
            if (i5 == 2) {
                int f2 = f();
                _(f2);
                int i6 = this.R + f2;
                while (this.R < i6) {
                    list.add(Integer.valueOf(G()));
                }
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(r()));
                    if (!k()) {
                        i = this.R;
                    } else {
                        return;
                    }
                } while (f() == this.e);
                this.R = i;
            } else {
                throw b7b.v();
            }
        }
    }

    @Override // defpackage.clz
    public final long z() {
        w(0);
        return a();
    }
}
