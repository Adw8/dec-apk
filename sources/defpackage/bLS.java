package defpackage;

import java.util.Arrays;

/* renamed from: bLS  reason: default package */
/* loaded from: classes.dex */
public class bLS extends lo implements nhg, nWQ, cjB {
    public final int L;
    public final int O;
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public final h9 f1607R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f1608R;
    public int Z;
    public int m;
    public long v;

    public bLS(int i, int i2, h9 h9Var) {
        this.O = i;
        this.L = i2;
        this.f1607R = h9Var;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x005b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [h2V] */
    /* JADX WARN: Type inference failed for: r8v1, types: [rS] */
    /* JADX WARN: Type inference failed for: r2v1, types: [lo] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [ffz] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:15:0x0031, B:20:0x0049, B:29:0x0074, B:31:0x007c, B:35:0x008f, B:38:0x0096, B:39:0x009a, B:40:0x009b), top: B:52:0x0020 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x008d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bGR U(defpackage.bLS r8, defpackage.h2V r9, defpackage.aOO r10) {
        /*
            boolean r0 = r10 instanceof defpackage.mqB
            if (r0 == 0) goto L_0x0013
            r0 = r10
            mqB r0 = (defpackage.mqB) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            mqB r0 = new mqB
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f6203R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 3
            if (r2 == 0) goto L_0x005d
            r8 = 1
            if (r2 == r8) goto L_0x004f
            if (r2 == r3) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            pd2 r8 = r0.f6204R
            ffz r9 = r0.f6201R
            h2V r2 = r0.f6202R
            bLS r5 = r0.R
            defpackage.jjU.o(r10)     // Catch: all -> 0x004d
        L_0x0034:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            goto L_0x0070
        L_0x0039:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0041:
            pd2 r8 = r0.f6204R
            ffz r9 = r0.f6201R
            h2V r2 = r0.f6202R
            bLS r5 = r0.R
            defpackage.jjU.o(r10)     // Catch: all -> 0x004d
            goto L_0x0074
        L_0x004d:
            r8 = move-exception
            goto L_0x00ac
        L_0x004f:
            ffz r8 = r0.f6201R
            h2V r9 = r0.f6202R
            bLS r2 = r0.R
            defpackage.jjU.o(r10)     // Catch: all -> 0x005b
            r10 = r8
            r8 = r2
            goto L_0x0066
        L_0x005b:
            r9 = move-exception
            goto L_0x00b4
        L_0x005d:
            defpackage.jjU.o(r10)
            rS r10 = r8.O()
            ffz r10 = (defpackage.ffz) r10
        L_0x0066:
            nbD r2 = r0.R     // Catch: all -> 0x00b1
            hw1 r5 = defpackage.hw1.O     // Catch: all -> 0x00b1
            hdJ r2 = r2.O(r5)     // Catch: all -> 0x00b1
            pd2 r2 = (defpackage.pd2) r2     // Catch: all -> 0x00b1
        L_0x0070:
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L_0x0074:
            java.lang.Object r10 = r5.i(r9)     // Catch: all -> 0x004d
            lmI r6 = defpackage.pip.R     // Catch: all -> 0x004d
            if (r10 != r6) goto L_0x008d
            r0.R = r5     // Catch: all -> 0x004d
            r0.f6202R = r2     // Catch: all -> 0x004d
            r0.f6201R = r9     // Catch: all -> 0x004d
            r0.f6204R = r8     // Catch: all -> 0x004d
            r0.e = r3     // Catch: all -> 0x004d
            java.lang.Object r10 = r5.x(r9, r0)     // Catch: all -> 0x004d
            if (r10 != r1) goto L_0x0074
            return r1
        L_0x008d:
            if (r8 == 0) goto L_0x009b
            boolean r6 = r8.X()     // Catch: all -> 0x004d
            if (r6 == 0) goto L_0x0096
            goto L_0x009b
        L_0x0096:
            java.util.concurrent.CancellationException r8 = r8.Z()     // Catch: all -> 0x004d
            throw r8     // Catch: all -> 0x004d
        L_0x009b:
            r0.R = r5     // Catch: all -> 0x004d
            r0.f6202R = r2     // Catch: all -> 0x004d
            r0.f6201R = r9     // Catch: all -> 0x004d
            r0.f6204R = r8     // Catch: all -> 0x004d
            r0.e = r4     // Catch: all -> 0x004d
            java.lang.Object r10 = r2.R(r10, r0)     // Catch: all -> 0x004d
            if (r10 != r1) goto L_0x0034
            return r1
        L_0x00ac:
            r2 = r5
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x00b4
        L_0x00b1:
            r9 = move-exception
            r2 = r8
            r8 = r10
        L_0x00b4:
            r2.m(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bLS.U(bLS, h2V, aOO):bGR");
    }

    public final void C() {
        rS[] rSVarArr;
        Object[] objArr = this.f1608R;
        objArr[((int) j()) & (objArr.length - 1)] = null;
        this.Z--;
        long j = j() + 1;
        if (this.R < j) {
            this.R = j;
        }
        if (this.v < j) {
            if (!(this.e == 0 || (rSVarArr = ((lo) this).f5834R) == null)) {
                for (rS rSVar : rSVarArr) {
                    if (rSVar != null) {
                        ffz ffz = (ffz) rSVar;
                        long j2 = ffz.R;
                        if (j2 >= 0 && j2 < j) {
                            ffz.R = j;
                        }
                    }
                }
            }
            this.v = j;
        }
    }

    public final void H() {
        if (this.L != 0 || this.m > 1) {
            Object[] objArr = this.f1608R;
            while (this.m > 0) {
                long j = j();
                int i = this.Z;
                int i2 = this.m;
                if (objArr[((int) ((j + ((long) (i + i2))) - 1)) & (objArr.length - 1)] == pip.R) {
                    this.m = i2 - 1;
                    objArr[((int) (j() + ((long) (this.Z + this.m)))) & (objArr.length - 1)] = null;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.lo
    public final rS L() {
        return new ffz();
    }

    public final void N(Object obj) {
        int i = this.Z + this.m;
        Object[] objArr = this.f1608R;
        if (objArr == null) {
            objArr = g(0, 2, null);
        } else if (i >= objArr.length) {
            objArr = g(i, objArr.length * 2, objArr);
        }
        objArr[((int) (j() + ((long) i))) & (objArr.length - 1)] = obj;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x003b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x003e */
    /* JADX DEBUG: Multi-variable search result rejected for r11v6, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final aOO[] P(aOO[] aooArr) {
        rS[] rSVarArr;
        ffz ffz;
        xx xxVar;
        int length = aooArr.length;
        if (!(this.e == 0 || (rSVarArr = ((lo) this).f5834R) == null)) {
            int i = 0;
            int length2 = rSVarArr.length;
            aooArr = aooArr;
            while (i < length2) {
                rS rSVar = rSVarArr[i];
                if (!(rSVar == null || (xxVar = (ffz = (ffz) rSVar).f3496R) == null || t(ffz) < 0)) {
                    int length3 = aooArr.length;
                    aooArr = aooArr;
                    if (length >= length3) {
                        aooArr = Arrays.copyOf(aooArr, Math.max(2, aooArr.length * 2));
                    }
                    length++;
                    aooArr[length] = xxVar;
                    ffz.f3496R = null;
                }
                i++;
                aooArr = aooArr;
            }
        }
        return aooArr;
    }

    @Override // defpackage.nhg, defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        ngo ngo;
        if (c(obj)) {
            return o8s.R;
        }
        xx xxVar = new xx(1, n3x.U(aoo));
        xxVar.j();
        aOO[] aooArr = vd.f7443R;
        synchronized (this) {
            if (y(obj)) {
                xxVar.Y(o8s.R);
                aooArr = P(aooArr);
                ngo = null;
            } else {
                ngo ngo2 = new ngo(this, ((long) (this.Z + this.m)) + j(), obj, xxVar);
                N(ngo2);
                this.m++;
                if (this.L == 0) {
                    aooArr = P(aooArr);
                }
                ngo = ngo2;
            }
        }
        if (ngo != null) {
            xxVar.y(new pG(1, ngo));
        }
        for (aOO aoo2 : aooArr) {
            if (aoo2 != null) {
                aoo2.Y(o8s.R);
            }
        }
        Object P = xxVar.P();
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        if (P != bgr) {
            P = o8s.R;
        }
        return P == bgr ? P : o8s.R;
    }

    public final void V(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long j5 = j(); j5 < min; j5++) {
            Object[] objArr = this.f1608R;
            objArr[((int) j5) & (objArr.length - 1)] = null;
        }
        this.R = j;
        this.v = j2;
        this.Z = (int) (j3 - min);
        this.m = (int) (j4 - j3);
    }

    @Override // defpackage.cjB
    public final nWQ X(nbD nbd, int i, h9 h9Var) {
        return ((i == 0 || i == -3) && h9Var == h9.SUSPEND) ? this : new a7(i, nbd, h9Var, this);
    }

    @Override // defpackage.lo
    public final rS[] Z() {
        return new ffz[2];
    }

    @Override // defpackage.nhg
    public final boolean c(Object obj) {
        int i;
        boolean z;
        aOO[] aooArr = vd.f7443R;
        synchronized (this) {
            if (y(obj)) {
                aooArr = P(aooArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (aOO aoo : aooArr) {
            if (aoo != null) {
                aoo.Y(o8s.R);
            }
        }
        return z;
    }

    @Override // defpackage.nhg
    public final void e() {
        synchronized (this) {
            V(j() + ((long) this.Z), this.v, j() + ((long) this.Z), j() + ((long) this.Z) + ((long) this.m));
        }
    }

    public final Object[] g(int i, int i2, Object[] objArr) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.f1608R = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long j = j();
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (int) (((long) i3) + j);
                objArr2[i4 & (i2 - 1)] = objArr[(objArr.length - 1) & i4];
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final Object i(ffz ffz) {
        Object obj;
        aOO[] aooArr = vd.f7443R;
        synchronized (this) {
            long t = t(ffz);
            if (t < 0) {
                obj = pip.R;
            } else {
                long j = ffz.R;
                Object[] objArr = this.f1608R;
                obj = objArr[((int) t) & (objArr.length - 1)];
                if (obj instanceof ngo) {
                    obj = ((ngo) obj).f6511R;
                }
                ffz.R = t + 1;
                aooArr = o(j);
            }
        }
        for (aOO aoo : aooArr) {
            if (aoo != null) {
                aoo.Y(o8s.R);
            }
        }
        return obj;
    }

    public final long j() {
        return Math.min(this.v, this.R);
    }

    public final aOO[] o(long j) {
        long j2;
        long j3;
        rS[] rSVarArr;
        if (j > this.v) {
            return vd.f7443R;
        }
        long j4 = j();
        long j5 = ((long) this.Z) + j4;
        if (this.L == 0 && this.m > 0) {
            j5++;
        }
        if (!(this.e == 0 || (rSVarArr = ((lo) this).f5834R) == null)) {
            for (rS rSVar : rSVarArr) {
                if (rSVar != null) {
                    long j6 = ((ffz) rSVar).R;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.v) {
            return vd.f7443R;
        }
        long j7 = j() + ((long) this.Z);
        int min = this.e > 0 ? Math.min(this.m, this.L - ((int) (j7 - j5))) : this.m;
        aOO[] aooArr = vd.f7443R;
        long j8 = ((long) this.m) + j7;
        if (min > 0) {
            aooArr = new aOO[min];
            Object[] objArr = this.f1608R;
            j7 = j7;
            int i = 0;
            while (true) {
                if (j7 >= j8) {
                    j2 = j5;
                    j8 = j8;
                    break;
                }
                int i2 = (int) j7;
                j2 = j5;
                Object obj = objArr[(objArr.length - 1) & i2];
                lmI lmi = pip.R;
                if (obj == lmi) {
                    j8 = j8;
                    j3 = 1;
                } else if (obj != null) {
                    ngo ngo = (ngo) obj;
                    j8 = j8;
                    int i3 = i + 1;
                    aooArr[i] = ngo.f6509R;
                    objArr[i2 & (objArr.length - 1)] = lmi;
                    objArr[((int) j7) & (objArr.length - 1)] = ngo.f6511R;
                    j3 = 1;
                    j7++;
                    if (i3 >= min) {
                        break;
                    }
                    i = i3;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                }
                j7 += j3;
                j5 = j2;
            }
        } else {
            j2 = j5;
            j8 = j8;
        }
        int i4 = (int) (j7 - j4);
        if (this.e == 0) {
            j2 = j7;
        }
        long max = Math.max(this.R, j7 - ((long) Math.min(this.O, i4)));
        if (this.L == 0 && max < j8) {
            Object[] objArr2 = this.f1608R;
            if (n3x.v(objArr2[((int) max) & (objArr2.length - 1)], pip.R)) {
                j7++;
                max++;
            }
        }
        V(max, j2, j7, j8);
        H();
        boolean z = true;
        if (aooArr.length != 0) {
            z = false;
        }
        return z ^ true ? P(aooArr) : aooArr;
    }

    public final long t(ffz ffz) {
        long j = ffz.R;
        if (j < j() + ((long) this.Z)) {
            return j;
        }
        if (this.L <= 0 && j <= j() && this.m != 0) {
            return j;
        }
        return -1;
    }

    @Override // defpackage.g3G, defpackage.nWQ
    public final Object v(h2V h2v, aOO aoo) {
        return U(this, h2v, aoo);
    }

    public final Object x(ffz ffz, mqB mqb) {
        xx xxVar = new xx(1, n3x.U(mqb));
        xxVar.j();
        synchronized (this) {
            if (t(ffz) < 0) {
                ffz.f3496R = xxVar;
            } else {
                xxVar.Y(o8s.R);
            }
        }
        Object P = xxVar.P();
        return P == bGR.COROUTINE_SUSPENDED ? P : o8s.R;
    }

    public final boolean y(Object obj) {
        if (this.e == 0) {
            if (this.O != 0) {
                N(obj);
                int i = this.Z + 1;
                this.Z = i;
                if (i > this.O) {
                    C();
                }
                this.v = j() + ((long) this.Z);
            }
            return true;
        }
        if (this.Z >= this.L && this.v <= this.R) {
            int ordinal = this.f1607R.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 2) {
                return true;
            }
        }
        N(obj);
        int i2 = this.Z + 1;
        this.Z = i2;
        if (i2 > this.L) {
            C();
        }
        long j = j() + ((long) this.Z);
        long j2 = this.R;
        if (((int) (j - j2)) > this.O) {
            V(1 + j2, this.v, j() + ((long) this.Z), j() + ((long) this.Z) + ((long) this.m));
        }
        return true;
    }
}
