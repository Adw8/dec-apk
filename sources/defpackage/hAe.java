package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hAe  reason: default package */
/* loaded from: classes.dex */
public final class hAe implements fzE {
    public final Su R;

    /* renamed from: R  reason: collision with other field name */
    public hAe f4141R;

    /* renamed from: R  reason: collision with other field name */
    public final hYA f4142R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f4144R;

    /* renamed from: R  reason: collision with other field name */
    public final HashSet f4145R;

    /* renamed from: R  reason: collision with other field name */
    public final jr_ f4147R;

    /* renamed from: R  reason: collision with other field name */
    public final mq9 f4150R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4151R;
    public int e;
    public final ArrayList v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f4154v;

    /* renamed from: R  reason: collision with other field name */
    public final AtomicReference f4146R = new AtomicReference(null);

    /* renamed from: R  reason: collision with other field name */
    public final Object f4143R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public final lmG f4148R = new lmG();

    /* renamed from: v  reason: collision with other field name */
    public final HashSet f4152v = new HashSet();

    /* renamed from: v  reason: collision with other field name */
    public final lmG f4153v = new lmG();
    public final lmG c = new lmG();

    /* renamed from: R  reason: collision with other field name */
    public mAv f4149R = new mAv(0);

    public hAe(hYA hya, s8 s8Var) {
        this.f4142R = hya;
        this.R = s8Var;
        HashSet hashSet = new HashSet();
        this.f4145R = hashSet;
        mq9 mq9 = new mq9();
        this.f4150R = mq9;
        ArrayList arrayList = new ArrayList();
        this.f4144R = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.v = arrayList2;
        jr_ jr_ = new jr_(s8Var, hya, mq9, hashSet, arrayList, arrayList2, this);
        hya.H(jr_);
        this.f4147R = jr_;
        boolean z = hya instanceof fLL;
        int i = iZB.R;
    }

    public static final void L(hAe hae, boolean z, nWW nww, Object obj) {
        int i;
        lmG lmg = hae.f4148R;
        int e = lmg.e(obj);
        if (e >= 0) {
            kyQ L = lmg.L(e);
            int i2 = L.e;
            for (int i3 = 0; i3 < i2; i3++) {
                dYh dyh = (dYh) L.R[i3];
                if (!hae.c.X(obj, dyh)) {
                    hAe hae2 = dyh.f2665R;
                    boolean z2 = true;
                    if (hae2 == null || (i = hae2.g(dyh, obj)) == 0) {
                        i = 1;
                    }
                    if (i != 1) {
                        if (dyh.f2667R == null) {
                            z2 = false;
                        }
                        if (!z2 || z) {
                            HashSet hashSet = (HashSet) nww.R;
                            if (hashSet == null) {
                                hashSet = new HashSet();
                                nww.R = hashSet;
                            }
                            hashSet.add(dyh);
                        } else {
                            hae.f4152v.add(dyh);
                        }
                    }
                }
            }
        }
    }

    public final void C(dNH dnh) {
        try {
            synchronized (this.f4143R) {
                N();
                mAv mav = this.f4149R;
                this.f4149R = new mAv(0);
                try {
                    jr_ jr_ = this.f4147R;
                    if (jr_.f5061R.isEmpty()) {
                        jr_.N(mav, dnh);
                    } else {
                        vC.e("Expected applyChanges() to have been called".toString());
                        throw null;
                    }
                } catch (Exception e) {
                    this.f4149R = mav;
                    throw e;
                }
            }
        } finally {
            try {
                throw th;
            } catch (Exception e2) {
            }
        }
    }

    public final void H() {
        synchronized (this.f4143R) {
            try {
                this.f4147R.f5083v.clear();
                if (!this.f4145R.isEmpty()) {
                    new h1W(this.f4145R).R();
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f4145R.isEmpty()) {
                            new h1W(this.f4145R).R();
                        }
                        throw th;
                    } catch (Exception e) {
                        e();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void K(Object obj) {
        synchronized (this.f4143R) {
            i(obj);
            lmG lmg = this.f4153v;
            int e = lmg.e(obj);
            if (e >= 0) {
                kyQ L = lmg.L(e);
                int i = L.e;
                for (int i2 = 0; i2 < i; i2++) {
                    i((gHm) L.R[i2]);
                }
            }
        }
    }

    public final void N() {
        AtomicReference atomicReference = this.f4146R;
        Object obj = aEl.R;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet == null) {
            return;
        }
        if (n3x.v(andSet, obj)) {
            vC.e("pending composition has not been applied");
            throw null;
        } else if (andSet instanceof Set) {
            O((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                O(set, true);
            }
        } else {
            StringBuilder U = opT.U("corrupt pendingModifications drain: ");
            U.append(this.f4146R);
            vC.e(U.toString());
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x009b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(java.util.Set r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hAe.O(java.util.Set, boolean):void");
    }

    public final void P() {
        Object andSet = this.f4146R.getAndSet(null);
        if (n3x.v(andSet, aEl.R)) {
            return;
        }
        if (andSet instanceof Set) {
            O((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                O(set, false);
            }
        } else if (andSet == null) {
            vC.e("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        } else {
            StringBuilder U = opT.U("corrupt pendingModifications drain: ");
            U.append(this.f4146R);
            vC.e(U.toString());
            throw null;
        }
    }

    @Override // defpackage.fJK
    public final void R() {
        synchronized (this.f4143R) {
            if (!this.f4154v) {
                this.f4154v = true;
                int i = iZB.R;
                ArrayList arrayList = this.f4147R.f5082v;
                if (arrayList != null) {
                    m(arrayList);
                }
                boolean z = this.f4150R.e > 0;
                if (z || (true ^ this.f4145R.isEmpty())) {
                    h1W h1w = new h1W(this.f4145R);
                    if (z) {
                        mdh H = this.f4150R.H();
                        vC.Z(H, h1w);
                        H.O();
                        this.R.clear();
                        h1w.v();
                    }
                    h1w.R();
                }
                this.f4147R.C();
            }
        }
        this.f4142R.N(this);
    }

    public final void U() {
        lmG lmg = this.f4153v;
        int i = lmg.R;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = ((int[]) lmg.f5828R)[i3];
            kyQ kyq = ((kyQ[]) lmg.v)[i4];
            int i5 = kyq.e;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = kyq.R[i7];
                if (!(!this.f4148R.c((gHm) obj))) {
                    if (i6 != i7) {
                        kyq.R[i6] = obj;
                    }
                    i6++;
                }
            }
            int i8 = kyq.e;
            for (int i9 = i6; i9 < i8; i9++) {
                kyq.R[i9] = null;
            }
            kyq.e = i6;
            if (i6 > 0) {
                if (i2 != i3) {
                    int[] iArr = (int[]) lmg.f5828R;
                    int i10 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i10;
                }
                i2++;
            }
        }
        int i11 = lmg.R;
        for (int i12 = i2; i12 < i11; i12++) {
            ((Object[]) lmg.f5827R)[((int[]) lmg.f5828R)[i12]] = null;
        }
        lmg.R = i2;
        Iterator it = this.f4152v.iterator();
        while (it.hasNext()) {
            if (!(((dYh) it.next()).f2667R != null)) {
                it.remove();
            }
        }
    }

    public final boolean V() {
        boolean A;
        synchronized (this.f4143R) {
            N();
            mAv mav = this.f4149R;
            this.f4149R = new mAv(0);
            try {
                A = this.f4147R.A(mav);
                if (!A) {
                    P();
                }
            } catch (Exception e) {
                this.f4149R = mav;
                throw e;
            }
        }
        return A;
    }

    @Override // defpackage.fJK
    public final boolean X() {
        boolean z;
        synchronized (this.f4143R) {
            z = this.f4149R.R > 0;
        }
        return z;
    }

    public final void Z() {
        synchronized (this.f4143R) {
            try {
                m(this.f4144R);
                P();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f4145R.isEmpty()) {
                            new h1W(this.f4145R).R();
                        }
                        throw th;
                    } catch (Exception e) {
                        e();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.fJK
    public final boolean c() {
        return this.f4154v;
    }

    public final void e() {
        this.f4146R.set(null);
        this.f4144R.clear();
        this.v.clear();
        this.f4145R.clear();
    }

    public final int g(dYh dyh, Object obj) {
        int i = dyh.R;
        boolean z = false;
        if ((i & 2) != 0) {
            dyh.R = i | 4;
        }
        WB wb = dyh.f2663R;
        if (wb == null || !this.f4150R.C(wb) || !wb.R() || !wb.R()) {
            return 1;
        }
        if (dyh.f2666R != null) {
            z = true;
        }
        if (!z) {
            return 1;
        }
        return t(dyh, wb, obj);
    }

    public final void i(Object obj) {
        int i;
        lmG lmg = this.f4148R;
        int e = lmg.e(obj);
        if (e >= 0) {
            kyQ L = lmg.L(e);
            int i2 = L.e;
            for (int i3 = 0; i3 < i2; i3++) {
                dYh dyh = (dYh) L.R[i3];
                hAe hae = dyh.f2665R;
                if (hae == null || (i = hae.g(dyh, obj)) == 0) {
                    i = 1;
                }
                if (i == 4) {
                    this.c.R(obj, dyh);
                }
            }
        }
    }

    public final void j(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            ((p4d) ((kSh) arrayList.get(i)).R).getClass();
            if (!n3x.v(null, this)) {
                break;
            }
            i++;
        }
        vC.m(z);
        try {
            jr_ jr_ = this.f4147R;
            jr_.getClass();
            jr_.Y(arrayList);
            jr_.Z();
        } finally {
            try {
                throw th;
            } catch (Exception e) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00aa A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(java.util.ArrayList r18) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hAe.m(java.util.ArrayList):void");
    }

    public final void o(Object obj) {
        dYh o;
        jr_ jr_ = this.f4147R;
        boolean z = true;
        if (!((jr_.e > 0) || (o = jr_.o()) == null)) {
            o.R();
            this.f4148R.R(obj, o);
            boolean z2 = obj instanceof gHm;
            if (z2) {
                this.f4153v.O(obj);
                Object[] X = ((gHm) obj).X();
                for (Object obj2 : X) {
                    if (obj2 == null) {
                        break;
                    }
                    this.f4153v.R(obj2, obj);
                }
            }
            if ((o.R & 32) == 0) {
                z = false;
            }
            if (!z) {
                eJ5 ej5 = o.f2664R;
                if (ej5 == null) {
                    ej5 = new eJ5();
                    o.f2664R = ej5;
                }
                ej5.R(o.v, obj);
                if (z2) {
                    mAv mav = o.f2667R;
                    if (mav == null) {
                        mav = new mAv(0);
                        o.f2667R = mav;
                    }
                    mav.m(obj, ((gHm) obj).e());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0053 A[Catch: all -> 0x00a3, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x0015, B:14:0x001e, B:16:0x0024, B:26:0x003c, B:27:0x0045, B:28:0x0046, B:29:0x004f, B:32:0x0053, B:34:0x0059, B:40:0x0064, B:41:0x006a, B:45:0x0075, B:47:0x007d, B:48:0x0081), top: B:59:0x0003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int t(defpackage.dYh r9, defpackage.WB r10, java.lang.Object r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f4143R
            monitor-enter(r0)
            hAe r1 = r8.f4141R     // Catch: all -> 0x00a3
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0050
            mq9 r5 = r8.f4150R     // Catch: all -> 0x00a3
            int r6 = r8.e     // Catch: all -> 0x00a3
            boolean r7 = r5.f6198R     // Catch: all -> 0x00a3
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x0046
            if (r6 < 0) goto L_0x001b
            int r7 = r5.e     // Catch: all -> 0x00a3
            if (r6 >= r7) goto L_0x001b
            r7 = r3
            goto L_0x001c
        L_0x001b:
            r7 = r2
        L_0x001c:
            if (r7 == 0) goto L_0x003c
            boolean r7 = r5.C(r10)     // Catch: all -> 0x00a3
            if (r7 == 0) goto L_0x0038
            int[] r5 = r5.f6199R     // Catch: all -> 0x00a3
            int r5 = defpackage.l6.e(r5, r6)     // Catch: all -> 0x00a3
            int r5 = r5 + r6
            int r7 = r10.R     // Catch: all -> 0x00a3
            if (r6 > r7) goto L_0x0033
            if (r7 >= r5) goto L_0x0033
            r5 = r3
            goto L_0x0034
        L_0x0033:
            r5 = r2
        L_0x0034:
            if (r5 == 0) goto L_0x0038
            r5 = r3
            goto L_0x0039
        L_0x0038:
            r5 = r2
        L_0x0039:
            if (r5 == 0) goto L_0x0050
            goto L_0x0051
        L_0x003c:
            java.lang.String r8 = "Invalid group index"
            java.lang.String r8 = r8.toString()     // Catch: all -> 0x00a3
            defpackage.vC.e(r8)     // Catch: all -> 0x00a3
            throw r4     // Catch: all -> 0x00a3
        L_0x0046:
            java.lang.String r8 = "Writer is active"
            java.lang.String r8 = r8.toString()     // Catch: all -> 0x00a3
            defpackage.vC.e(r8)     // Catch: all -> 0x00a3
            throw r4     // Catch: all -> 0x00a3
        L_0x0050:
            r1 = r4
        L_0x0051:
            if (r1 != 0) goto L_0x008c
            jr_ r5 = r8.f4147R     // Catch: all -> 0x00a3
            boolean r6 = r5.f5070X     // Catch: all -> 0x00a3
            if (r6 == 0) goto L_0x0062
            boolean r5 = r5.zw(r9, r11)     // Catch: all -> 0x00a3
            if (r5 == 0) goto L_0x0062
            r8 = 4
            monitor-exit(r0)
            return r8
        L_0x0062:
            if (r11 != 0) goto L_0x006a
            mAv r2 = r8.f4149R     // Catch: all -> 0x00a3
            r2.m(r9, r4)     // Catch: all -> 0x00a3
            goto L_0x008c
        L_0x006a:
            mAv r4 = r8.f4149R     // Catch: all -> 0x00a3
            int r5 = r4.v(r9)     // Catch: all -> 0x00a3
            if (r5 < 0) goto L_0x0073
            r2 = r3
        L_0x0073:
            if (r2 == 0) goto L_0x0081
            java.lang.Object r2 = r4.c(r9)     // Catch: all -> 0x00a3
            kyQ r2 = (defpackage.kyQ) r2     // Catch: all -> 0x00a3
            if (r2 == 0) goto L_0x008c
            r2.add(r11)     // Catch: all -> 0x00a3
            goto L_0x008c
        L_0x0081:
            kyQ r2 = new kyQ     // Catch: all -> 0x00a3
            r2.<init>()     // Catch: all -> 0x00a3
            r2.add(r11)     // Catch: all -> 0x00a3
            r4.m(r9, r2)     // Catch: all -> 0x00a3
        L_0x008c:
            monitor-exit(r0)
            if (r1 == 0) goto L_0x0094
            int r8 = r1.t(r9, r10, r11)
            return r8
        L_0x0094:
            hYA r9 = r8.f4142R
            r9.L(r8)
            jr_ r8 = r8.f4147R
            boolean r8 = r8.f5070X
            if (r8 == 0) goto L_0x00a1
            r8 = 3
            goto L_0x00a2
        L_0x00a1:
            r8 = 2
        L_0x00a2:
            return r8
        L_0x00a3:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hAe.t(dYh, WB, java.lang.Object):int");
    }

    @Override // defpackage.fJK
    public final void v(iv7 iv7) {
        if (!this.f4154v) {
            this.f4142R.R(this, (dNH) iv7);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    public final void x() {
        synchronized (this.f4143R) {
            try {
                if (!this.v.isEmpty()) {
                    m(this.v);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f4145R.isEmpty()) {
                            new h1W(this.f4145R).R();
                        }
                        throw th;
                    } catch (Exception e) {
                        e();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void y() {
        hAe hae;
        synchronized (this.f4143R) {
            Object[] objArr = this.f4150R.f6200R;
            for (Object obj : objArr) {
                dYh dyh = obj instanceof dYh ? (dYh) obj : null;
                if (!(dyh == null || (hae = dyh.f2665R) == null)) {
                    hae.g(dyh, null);
                }
            }
        }
    }
}
