package defpackage;

import android.content.Context;
import com.android.billingclient.api.Purchase;
import dev.kdrag0n.app.arch.ProcessLifecycleEvents;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Iterator;
import java.util.List;

/* renamed from: eJw  reason: default package */
/* loaded from: classes.dex */
public final class eJw implements gZn {
    public final F4 R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f3052R;

    /* renamed from: R  reason: collision with other field name */
    public final bLS f3053R;

    /* renamed from: R  reason: collision with other field name */
    public volatile cG f3054R;

    /* renamed from: R  reason: collision with other field name */
    public final hBv f3055R;

    /* renamed from: R  reason: collision with other field name */
    public final pir f3058R;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f3057R = g4x.O(Boolean.FALSE);

    /* renamed from: v  reason: collision with other field name */
    public final ivW f3059v = g4x.O(null);

    /* renamed from: R  reason: collision with other field name */
    public final hgO f3056R = mxC.c();
    public final hgO v = mxC.c();

    public eJw(Context context, pir pir, hBv hbv, F4 f4, ProcessLifecycleEvents processLifecycleEvents) {
        this.f3052R = context;
        this.f3058R = pir;
        this.f3055R = hbv;
        this.R = f4;
        bLS R = pip.R(0, 2, null, 5);
        this.f3053R = R;
        mxC.y(processLifecycleEvents.O, mxC.N(), new igQ(this, 0));
        mxC.y(R, mxC.N(), new igQ(this, 1));
        mxC.y(R, mxC.N(), new igQ(this, 2));
    }

    public static final Object R(eJw ejw, bYR byr, aOO aoo) {
        ejw.getClass();
        if (byr instanceof kjd) {
            if (!m(((kjd) byr).R)) {
                return o8s.R;
            }
        } else if ((byr instanceof kBL) && !m(((kBL) byr).R)) {
            return o8s.R;
        }
        Object R = ejw.f3053R.R(byr, aoo);
        return R == bGR.COROUTINE_SUSPENDED ? R : o8s.R;
    }

    public static boolean m(Purchase purchase) {
        pby[] pbyArr = kxm.R;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(afN.R(-54992788116364L)).generatePublic(new X509EncodedKeySpec(caw.P(afN.R(-55009967985548L))));
            String str = purchase.R;
            Signature instance = Signature.getInstance(afN.R(-56792379413388L));
            instance.initVerify(generatePublic);
            instance.update(iH_.z(str));
            if (instance.verify(caw.P(purchase.v))) {
                return true;
            }
            throw new IllegalArgumentException(afN.R(-56843919020940L).toString());
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L(boolean r7, defpackage.aOO r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nyi
            if (r0 == 0) goto L_0x0013
            r0 = r8
            nyi r0 = (defpackage.nyi) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            nyi r0 = new nyi
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f6646R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0032
            hgO r6 = r0.f6645R
            eJw r7 = r0.R
            defpackage.jjU.o(r8)     // Catch: all -> 0x0030
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L_0x0060
        L_0x0030:
            r7 = move-exception
            goto L_0x0077
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = -52510297019276(0xffffd03dfe662c74, double:NaN)
            java.lang.String r7 = defpackage.afN.R(r7)
            r6.<init>(r7)
            throw r6
        L_0x0041:
            defpackage.jjU.o(r8)
            hgO r8 = r6.f3056R
            boolean r2 = r8.v(r4)
            if (r2 == 0) goto L_0x007b
            pby[] r2 = defpackage.kxm.R     // Catch: all -> 0x0074
            if (r7 == 0) goto L_0x0052
            r7 = r3
            goto L_0x0053
        L_0x0052:
            r7 = 0
        L_0x0053:
            r0.R = r6     // Catch: all -> 0x0074
            r0.f6645R = r8     // Catch: all -> 0x0074
            r0.e = r3     // Catch: all -> 0x0074
            java.lang.Object r7 = r6.x(r7, r0)     // Catch: all -> 0x0074
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: all -> 0x0074
            r7.booleanValue()     // Catch: all -> 0x0074
            m5f r6 = r6.e()     // Catch: all -> 0x0074
            r6.X()     // Catch: all -> 0x0074
            pby[] r6 = defpackage.kxm.R     // Catch: all -> 0x0074
            o8s r4 = defpackage.o8s.R     // Catch: all -> 0x0074
            defpackage.gvP.W(r8)
            goto L_0x007b
        L_0x0074:
            r6 = move-exception
            r7 = r6
            r6 = r8
        L_0x0077:
            defpackage.gvP.W(r6)
            throw r7
        L_0x007b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eJw.L(boolean, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.String r6, defpackage.aOO r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.i9j
            if (r0 == 0) goto L_0x0013
            r0 = r7
            i9j r0 = (defpackage.i9j) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            i9j r0 = new i9j
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f4478R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x002c
            java.lang.String r6 = r0.f4479R
            eJw r5 = r0.R
            defpackage.jjU.o(r7)
            goto L_0x005e
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r6 = -53377880413068(0xffffcf73fe662c74, double:NaN)
            java.lang.String r6 = defpackage.afN.R(r6)
            r5.<init>(r6)
            throw r5
        L_0x003b:
            defpackage.jjU.o(r7)
            dNt r7 = new dNt
            r7.<init>()
            r7.R = r6
            if (r6 == 0) goto L_0x0089
            dNt r2 = new dNt
            r2.<init>(r7)
            jxU r7 = new jxU
            r7.<init>(r2, r4)
            r0.R = r5
            r0.f4479R = r6
            r0.e = r3
            java.lang.Object r7 = r5.Z(r7, r0)
            if (r7 != r1) goto L_0x005e
            return r1
        L_0x005e:
            p0p r7 = (defpackage.p0p) r7
            L2 r0 = r7.R
            int r0 = r0.v
            if (r0 == 0) goto L_0x0086
            iYd r0 = new iYd
            java.lang.String r1 = "queryPurchases "
            java.lang.String r2 = " failed"
            java.lang.String r1 = defpackage.jQ.C(r1, r6, r2)
            L2 r7 = r7.R
            r0.<init>(r7, r1)
            r7 = 6
            java.lang.String r1 = "Failed to query "
            java.lang.String r2 = " purchases"
            java.lang.String r6 = defpackage.jQ.C(r1, r6, r2)
            java.lang.String r5 = defpackage.cUF.v(r5)
            defpackage.kxm.v(r5, r7, r6, r0)
            return r4
        L_0x0086:
            java.util.List r5 = r7.f7051R
            return r5
        L_0x0089:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Product type must be set"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eJw.O(java.lang.String, aOO):java.lang.Object");
    }

    public final void X(L2 l2, List list) {
        int i = l2.v;
        if (i == 0 && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l6.z(mxC.N(), null, 0, new kui(this, (Purchase) it.next(), null), 3);
            }
        } else if (i != 1) {
            iYd iyd = new iYd(l2, afN.R(-52012080812940L));
            kxm.v(cUF.v(this), 6, afN.R(-52119454995340L), iyd);
            l6.z(mxC.N(), null, 0, new foe(this, l2, null), 3);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0184 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018b  */
    public final java.lang.Object Z(defpackage.iv7 r14, defpackage.aOO r15) {
        /*
        // Method dump skipped, instructions count: 409
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eJw.Z(iv7, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.aOO r18) {
        /*
        // Method dump skipped, instructions count: 479
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eJw.c(aOO):java.lang.Object");
    }

    public final m5f e() {
        return (m5f) ((nak) this.f3058R).get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(boolean r7, defpackage.aOO r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fpO
            if (r0 == 0) goto L_0x0013
            r0 = r8
            fpO r0 = (defpackage.fpO) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            fpO r0 = new fpO
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f3566R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x002e
            boolean r6 = r0.f3567R
            eJw r7 = r0.R
            defpackage.jjU.o(r8)
            goto L_0x008e
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = -54400082629516(0xffffce85fe662c74, double:NaN)
            java.lang.String r7 = defpackage.afN.R(r7)
            r6.<init>(r7)
            throw r6
        L_0x003d:
            boolean r7 = r0.f3567R
            eJw r6 = r0.R
            defpackage.jjU.o(r8)     // Catch: Exception -> 0x009e
            goto L_0x0064
        L_0x0045:
            defpackage.jjU.o(r8)
            m5f r8 = r6.e()
            boolean r8 = r8.X()
            if (r8 != r7) goto L_0x0055
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L_0x0055:
            hBv r8 = r6.f3055R     // Catch: Exception -> 0x009e
            r0.R = r6     // Catch: Exception -> 0x009e
            r0.f3567R = r7     // Catch: Exception -> 0x009e
            r0.e = r4     // Catch: Exception -> 0x009e
            java.lang.Object r8 = r8.R(r0)     // Catch: Exception -> 0x009e
            if (r8 != r1) goto L_0x0064
            return r1
        L_0x0064:
            o3I r8 = (defpackage.o3I) r8     // Catch: Exception -> 0x009e
            dEt r2 = r8.R
            boolean r2 = r2.f2543R
            if (r2 == 0) goto L_0x009b
            java.lang.Object r8 = r8.f6659R
            dev.kdrag0n.app.data.UserEntitlementInfo r8 = (dev.kdrag0n.app.data.UserEntitlementInfo) r8
            if (r8 == 0) goto L_0x009b
            int r8 = r8.R
            if (r8 < r4) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r4 = 0
        L_0x0078:
            if (r4 != r7) goto L_0x009b
            m5f r8 = r6.e()
            r0.R = r6
            r0.f3567R = r7
            r0.e = r3
            java.lang.Object r8 = r8.Z(r0)
            if (r8 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x008e:
            m5f r7 = r7.e()
            boolean r7 = r7.X()
            if (r7 != r6) goto L_0x009b
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L_0x009b:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L_0x009e:
            r7 = move-exception
            r8 = 5
            r0 = -54279823545228(0xffffcea1fe662c74, double:NaN)
            java.lang.String r0 = defpackage.afN.R(r0)
            java.lang.String r6 = defpackage.cUF.v(r6)
            defpackage.kxm.v(r6, r8, r0, r7)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eJw.v(boolean, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(boolean r13, defpackage.aOO r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.iTE
            if (r0 == 0) goto L_0x0013
            r0 = r14
            iTE r0 = (defpackage.iTE) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            iTE r0 = new iTE
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f4601R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            r4 = 2
            r5 = 3
            if (r2 == 0) goto L_0x0058
            if (r2 == r3) goto L_0x0050
            if (r2 == r4) goto L_0x0046
            if (r2 != r5) goto L_0x0037
            long r12 = r0.R
            boolean r2 = r0.f4602R
            eJw r3 = r0.f4600R
            defpackage.jjU.o(r14)
        L_0x0032:
            r10 = r12
            r13 = r2
            r12 = r3
            r2 = r10
            goto L_0x006e
        L_0x0037:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r13 = -54653485699980(0xffffce4afe662c74, double:NaN)
            java.lang.String r13 = defpackage.afN.R(r13)
            r12.<init>(r13)
            throw r12
        L_0x0046:
            long r12 = r0.R
            boolean r2 = r0.f4602R
            eJw r3 = r0.f4600R
            defpackage.jjU.o(r14)
            goto L_0x008f
        L_0x0050:
            boolean r13 = r0.f4602R
            eJw r12 = r0.f4600R
            defpackage.jjU.o(r14)
            goto L_0x006a
        L_0x0058:
            defpackage.jjU.o(r14)
            r6 = 500(0x1f4, double:2.47E-321)
            r0.f4600R = r12
            r0.f4602R = r13
            r0.e = r3
            java.lang.Object r14 = defpackage.n3x.Z(r6, r0)
            if (r14 != r1) goto L_0x006a
            return r1
        L_0x006a:
            long r2 = android.os.SystemClock.uptimeMillis()
        L_0x006e:
            long r6 = android.os.SystemClock.uptimeMillis()
            long r6 = r6 - r2
            r8 = 120000(0x1d4c0, double:5.9288E-319)
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 >= 0) goto L_0x00ab
            pby[] r14 = defpackage.kxm.R
            r0.f4600R = r12
            r0.f4602R = r13
            r0.R = r2
            r0.e = r4
            java.lang.Object r14 = r12.v(r13, r0)
            if (r14 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r10 = r2
            r3 = r12
            r2 = r13
            r12 = r10
        L_0x008f:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x009a
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        L_0x009a:
            r6 = 3000(0xbb8, double:1.482E-320)
            r0.f4600R = r3
            r0.f4602R = r2
            r0.R = r12
            r0.e = r5
            java.lang.Object r14 = defpackage.n3x.Z(r6, r0)
            if (r14 != r1) goto L_0x0032
            return r1
        L_0x00ab:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eJw.x(boolean, aOO):java.lang.Object");
    }
}
