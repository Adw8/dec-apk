package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fLL */
/* loaded from: classes.dex */
public final class fLL extends hYA {
    public ArrayList O;

    /* renamed from: R */
    public Throwable f3385R;

    /* renamed from: R */
    public k0 f3388R;

    /* renamed from: R */
    public lTo f3389R;

    /* renamed from: R */
    public final nbD f3390R;

    /* renamed from: R */
    public pd2 f3391R;

    /* renamed from: R */
    public final peS f3392R;

    /* renamed from: R */
    public final yH f3393R;
    public static final ivW v = g4x.O(g1k.R);
    public static final AtomicReference R = new AtomicReference(Boolean.FALSE);

    /* renamed from: R */
    public final Object f3384R = new Object();

    /* renamed from: R */
    public final ArrayList f3386R = new ArrayList();

    /* renamed from: v */
    public final ArrayList f3394v = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList X = new ArrayList();

    /* renamed from: R */
    public final LinkedHashMap f3387R = new LinkedHashMap();

    /* renamed from: v */
    public final LinkedHashMap f3395v = new LinkedHashMap();

    /* renamed from: R */
    public final ivW f3383R = g4x.O(a8X.Inactive);

    /* renamed from: R */
    public final gL6 f3382R = new gL6(5, this);

    static {
        new ift(16, 0);
    }

    public fLL(nbD nbd) {
        yH yHVar = new yH(new fwW(1, this));
        this.f3393R = yHVar;
        peS pes = new peS((pd2) nbd.O(hw1.O));
        pes.l(new a7Q(1, this));
        this.f3392R = pes;
        this.f3390R = nbd.M(yHVar).M(pes);
    }

    /* JADX INFO: finally extract failed */
    public static final fzE P(fLL fll, fzE fze, kyQ kyq) {
        hAe hae = (hAe) fze;
        if (hae.f4147R.f5070X || hae.f4154v) {
            return null;
        }
        kpt U = ift.U(new a7Q(2, fze), new V4(fze, 16, kyq));
        try {
            dR6 m = U.m();
            if (kyq.e > 0) {
                _c _cVar = new _c(kyq, 8, fze);
                jr_ jr_ = ((hAe) fze).f4147R;
                if (!jr_.f5070X) {
                    jr_.f5070X = true;
                    try {
                        _cVar.g();
                        jr_.f5070X = false;
                    } catch (Throwable th) {
                        jr_.f5070X = false;
                        throw th;
                    }
                } else {
                    vC.e("Preparing a composition while composing is not supported".toString());
                    throw null;
                }
            }
            boolean V = ((hAe) fze).V();
            dR6.P(m);
            if (!V) {
                fze = null;
            }
            return fze;
        } finally {
            g(U);
        }
    }

    public static /* synthetic */ void Y(fLL fll, Exception exc, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        fll.J(exc, null, z);
    }

    public static void g(kpt kpt) {
        try {
            if (kpt.i() instanceof aws) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            kpt.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.Set[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(defpackage.fLL r14) {
        /*
            java.util.ArrayList r0 = r14.f3394v
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x00aa
            java.util.ArrayList r0 = r14.f3394v
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r4 >= r2) goto L_0x0092
            java.lang.Object r5 = r0.get(r4)
            java.util.Set r5 = (java.util.Set) r5
            java.util.ArrayList r6 = r14.f3386R
            int r7 = r6.size()
            r8 = r3
        L_0x0021:
            if (r8 >= r7) goto L_0x008f
            java.lang.Object r9 = r6.get(r8)
            fzE r9 = (defpackage.fzE) r9
            hAe r9 = (defpackage.hAe) r9
        L_0x002b:
            java.util.concurrent.atomic.AtomicReference r10 = r9.f4146R
            java.lang.Object r10 = r10.get()
            if (r10 != 0) goto L_0x0035
            r11 = r1
            goto L_0x003b
        L_0x0035:
            java.lang.Object r11 = defpackage.aEl.R
            boolean r11 = defpackage.n3x.v(r10, r11)
        L_0x003b:
            if (r11 == 0) goto L_0x003f
            r11 = r5
            goto L_0x005e
        L_0x003f:
            boolean r11 = r10 instanceof java.util.Set
            if (r11 == 0) goto L_0x004e
            r11 = 2
            java.util.Set[] r11 = new java.util.Set[r11]
            r12 = r10
            java.util.Set r12 = (java.util.Set) r12
            r11[r3] = r12
            r11[r1] = r5
            goto L_0x005e
        L_0x004e:
            boolean r11 = r10 instanceof java.lang.Object[]
            if (r11 == 0) goto L_0x0076
            r11 = r10
            java.util.Set[] r11 = (java.util.Set[]) r11
            int r12 = r11.length
            int r13 = r12 + 1
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r13)
            r11[r12] = r5
        L_0x005e:
            java.util.concurrent.atomic.AtomicReference r12 = r9.f4146R
            boolean r11 = r12.compareAndSet(r10, r11)
            if (r11 == 0) goto L_0x002b
            if (r10 != 0) goto L_0x0073
            java.lang.Object r10 = r9.f4143R
            monitor-enter(r10)
            r9.P()     // Catch: all -> 0x0070
            monitor-exit(r10)
            goto L_0x0073
        L_0x0070:
            r14 = move-exception
            monitor-exit(r10)
            throw r14
        L_0x0073:
            int r8 = r8 + 1
            goto L_0x0021
        L_0x0076:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "corrupt pendingModifications: "
            java.lang.StringBuilder r0 = defpackage.opT.U(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r9.f4146R
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x008f:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0092:
            java.util.ArrayList r0 = r14.f3394v
            r0.clear()
            k0 r14 = r14.t()
            if (r14 != 0) goto L_0x009e
            goto L_0x00aa
        L_0x009e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "called outside of runRecomposeAndApplyChanges"
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fLL.j(fLL):void");
    }

    public static final void o(ArrayList arrayList, fLL fll, fzE fze) {
        arrayList.clear();
        synchronized (fll.f3384R) {
            Iterator it = fll.X.iterator();
            while (it.hasNext()) {
                p4d p4d = (p4d) it.next();
                p4d.getClass();
                if (n3x.v(null, fze)) {
                    arrayList.add(p4d);
                    it.remove();
                }
            }
        }
    }

    public final void J(Exception exc, fzE fze, boolean z) {
        if (!((Boolean) R.get()).booleanValue() || (exc instanceof leD)) {
            throw exc;
        }
        synchronized (this.f3384R) {
            this.e.clear();
            this.c.clear();
            this.f3394v.clear();
            this.X.clear();
            this.f3387R.clear();
            this.f3395v.clear();
            this.f3389R = new lTo(z, exc);
            if (fze != null) {
                ArrayList arrayList = this.O;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.O = arrayList;
                }
                if (!arrayList.contains(fze)) {
                    arrayList.add(fze);
                }
                this.f3386R.remove(fze);
            }
            t();
        }
    }

    public final List K(List list, kyQ kyq) {
        ArrayList arrayList;
        Object obj;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            ((p4d) obj2).getClass();
            Object obj3 = hashMap.get(null);
            if (obj3 == null) {
                obj3 = new ArrayList();
                hashMap.put(null, obj3);
            }
            ((ArrayList) obj3).add(obj2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            fzE fze = (fzE) entry.getKey();
            List list2 = (List) entry.getValue();
            vC.m(!((hAe) fze).f4147R.f5070X);
            kpt U = ift.U(new a7Q(2, fze), new V4(fze, 16, kyq));
            try {
                dR6 m = U.m();
                synchronized (this.f3384R) {
                    arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        p4d p4d = (p4d) list2.get(i2);
                        LinkedHashMap linkedHashMap = this.f3387R;
                        p4d.getClass();
                        List list3 = (List) linkedHashMap.get(null);
                        if (list3 == null) {
                            obj = null;
                        } else if (!list3.isEmpty()) {
                            obj = list3.remove(0);
                            if (list3.isEmpty()) {
                                linkedHashMap.remove(null);
                            }
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                        arrayList.add(new kSh(p4d, obj));
                    }
                }
                ((hAe) fze).j(arrayList);
                dR6.P(m);
            } finally {
                g(U);
            }
        }
        return dF.pG(hashMap.keySet());
    }

    @Override // defpackage.hYA
    public final void L(fzE fze) {
        k0 k0Var;
        synchronized (this.f3384R) {
            if (!this.c.contains(fze)) {
                this.c.add(fze);
                k0Var = t();
            } else {
                k0Var = null;
            }
        }
        if (k0Var != null) {
            ((xx) k0Var).Y(o8s.R);
        }
    }

    @Override // defpackage.hYA
    public final void N(fzE fze) {
        synchronized (this.f3384R) {
            this.f3386R.remove(fze);
            this.c.remove(fze);
            this.e.remove(fze);
        }
    }

    @Override // defpackage.hYA
    public final nbD O() {
        return this.f3390R;
    }

    @Override // defpackage.hYA
    public final void R(fzE fze, dNH dnh) {
        boolean z = ((hAe) fze).f4147R.f5070X;
        try {
            kpt U = ift.U(new a7Q(2, fze), new V4(fze, 16, null));
            dR6 m = U.m();
            hAe hae = (hAe) fze;
            hae.C(dnh);
            dR6.P(m);
            g(U);
            if (!z) {
                jwU.L().U();
            }
            synchronized (this.f3384R) {
                if (((a8X) this.f3383R.getValue()).compareTo(a8X.ShuttingDown) > 0 && !this.f3386R.contains(fze)) {
                    this.f3386R.add(fze);
                }
            }
            try {
                V(fze);
                try {
                    hae.Z();
                    hae.x();
                    if (!z) {
                        jwU.L().U();
                    }
                } catch (Exception e) {
                    Y(this, e, false, 6);
                }
            } catch (Exception e2) {
                J(e2, fze, true);
            }
        } catch (Exception e3) {
            J(e3, fze, true);
        }
    }

    public final void V(fzE fze) {
        synchronized (this.f3384R) {
            ArrayList arrayList = this.X;
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                ((p4d) arrayList.get(i)).getClass();
                if (n3x.v(null, fze)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                o(arrayList2, this, fze);
                while (!arrayList2.isEmpty()) {
                    K(arrayList2, null);
                    o(arrayList2, this, fze);
                }
            }
        }
    }

    @Override // defpackage.hYA
    public final int X() {
        return 1000;
    }

    @Override // defpackage.hYA
    public final void Z(p4d p4d, mBo mbo) {
        synchronized (this.f3384R) {
            this.f3395v.put(p4d, mbo);
        }
    }

    @Override // defpackage.hYA
    public final boolean c() {
        return false;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.f3384R) {
            z = true;
            if (!(!this.f3394v.isEmpty()) && !(!this.c.isEmpty())) {
                if (!this.f3393R.v()) {
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // defpackage.hYA
    public final mBo m(p4d p4d) {
        mBo mbo;
        synchronized (this.f3384R) {
            mbo = (mBo) this.f3395v.remove(p4d);
        }
        return mbo;
    }

    public final k0 t() {
        a8X a8x = a8X.PendingWork;
        a8X a8x2 = a8X.Inactive;
        if (((a8X) this.f3383R.getValue()).compareTo(a8X.ShuttingDown) <= 0) {
            this.f3386R.clear();
            this.f3394v.clear();
            this.c.clear();
            this.e.clear();
            this.X.clear();
            this.O = null;
            k0 k0Var = this.f3388R;
            if (k0Var != null) {
                ((xx) k0Var).H(null);
            }
            this.f3388R = null;
            this.f3389R = null;
            return null;
        }
        if (this.f3389R == null) {
            if (this.f3391R == null) {
                this.f3394v.clear();
                this.c.clear();
                if (this.f3393R.v()) {
                    a8x2 = a8X.InactivePendingWork;
                }
            } else {
                a8x2 = ((this.c.isEmpty() ^ true) || (this.f3394v.isEmpty() ^ true) || (this.e.isEmpty() ^ true) || (this.X.isEmpty() ^ true) || this.f3393R.v()) ? a8x : a8X.Idle;
            }
        }
        this.f3383R.H(a8x2);
        if (a8x2 != a8x) {
            return null;
        }
        k0 k0Var2 = this.f3388R;
        this.f3388R = null;
        return k0Var2;
    }

    @Override // defpackage.hYA
    public final void x(Set set) {
    }

    public final void y() {
        synchronized (this.f3384R) {
            if (((a8X) this.f3383R.getValue()).compareTo(a8X.Idle) >= 0) {
                this.f3383R.H(a8X.ShuttingDown);
            }
        }
        this.f3392R.c(null);
    }
}
