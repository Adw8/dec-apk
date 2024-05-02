package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: gh  reason: default package */
/* loaded from: classes.dex */
public final class gh {
    public final F4 R;

    /* renamed from: R  reason: collision with other field name */
    public final OT f3864R;

    /* renamed from: R  reason: collision with other field name */
    public final Tq f3865R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f3866R;

    /* renamed from: R  reason: collision with other field name */
    public final bf5 f3867R;

    /* renamed from: R  reason: collision with other field name */
    public final cwX f3868R;

    /* renamed from: R  reason: collision with other field name */
    public final oLT f3870R;

    /* renamed from: R  reason: collision with other field name */
    public final yd f3871R;

    /* renamed from: R  reason: collision with other field name */
    public i4m f3869R = v(true);
    public i4m v = v(false);

    public gh(Context context, F4 f4, IO io2, bf5 bf5, oLT olt, yd ydVar, Tq tq, SharedPreferences sharedPreferences) {
        this.f3866R = context;
        this.R = f4;
        this.f3864R = io2;
        this.f3867R = bf5;
        this.f3870R = olt;
        this.f3871R = ydVar;
        this.f3865R = tq;
        this.f3868R = pdD.J(new _c(this, 13, sharedPreferences));
    }

    public static final bLN c(gh ghVar, boolean z, blo blo, ivW ivw) {
        bf5 bf5 = ghVar.f3867R;
        int i = (int) 5000;
        bf5.getClass();
        boolean z2 = true;
        nWQ[] nwqArr = {new W_(new gJB(bf5, z, true, i, null)), new W_(new gJB(bf5, z, false, i, null))};
        int i2 = oVA.R;
        nWQ f_9 = new f_9(l6.o(l6.N(new W_(new Ln(0, nwqArr)), -1)), bf5, 0);
        lsf lsf = iFn.f4518R;
        if (lsf.O(hw1.O) != null) {
            z2 = false;
        }
        if (z2) {
            if (!n3x.v(lsf, aIH.R)) {
                f_9 = f_9 instanceof cjB ? jjU.U((cjB) f_9, lsf, 0, null, 6) : new a7(f_9, lsf, 0, null, 12);
            }
            return new bLN(l6.o(f_9), new Vx(blo, ivw, z, ghVar, null));
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + lsf).toString());
    }

    public final kFV R() {
        Integer num = (Integer) this.v.getValue();
        if (num != null) {
            int intValue = num.intValue();
            jY jYVar = (jY) this.f3868R.getValue();
            return new kFV(intValue, new mV(jYVar.f4958R, (byte[]) jYVar.f4955R.getValue()), (jY) this.f3868R.getValue());
        }
        throw new IllegalStateException("Missing port".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object X(boolean r6, defpackage.aOO r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.Z0
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Z0 r0 = (defpackage.Z0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            Z0 r0 = new Z0
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f657R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.jjU.o(r7)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            defpackage.jjU.o(r7)
            lsf r7 = defpackage.iFn.f4518R
            BB r2 = new BB
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.e = r3
            java.lang.Object r7 = defpackage.l6.a(r7, r2, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            mwl r7 = (defpackage.mwl) r7
            java.lang.Object r5 = r7.R
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh.X(boolean, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r6, defpackage.aOO r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.yK
            if (r0 == 0) goto L_0x0013
            r0 = r7
            yK r0 = (defpackage.yK) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            yK r0 = new yK
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f7487R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.jjU.o(r7)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            defpackage.jjU.o(r7)
            lsf r7 = defpackage.iFn.f4518R
            J9 r2 = new J9
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.e = r3
            java.lang.Object r7 = defpackage.l6.a(r7, r2, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            mwl r7 = (defpackage.mwl) r7
            java.lang.Object r5 = r7.R
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh.e(java.lang.String, aOO):java.lang.Object");
    }

    public final i4m v(boolean z) {
        Integer num;
        ivW O = g4x.O(h38.R);
        blo blo = new blo();
        O.H(c(this, z, blo, O));
        if (!z) {
            Tq tq = this.f3865R;
            Integer num2 = (Integer) ((n1) tq.f540R).c(tq, Tq.R[1]);
            if (num2 != null) {
                int intValue = num2.intValue();
                this.f3867R.getClass();
                if (bf5.v(intValue)) {
                    num = num2;
                    _m _mVar = new _m(0, null);
                    int i = oVA.R;
                    return l6.M(new hzK(new eK2(new z_(blo, null), new l7(_mVar, O, aIH.R, -2, h9.SUSPEND)), new et(z, this, null), 1), g8W.R, new ern(5000, Long.MAX_VALUE), num);
                }
            }
        }
        num = null;
        _m _mVar = new _m(0, null);
        int i = oVA.R;
        return l6.M(new hzK(new eK2(new z_(blo, null), new l7(_mVar, O, aIH.R, -2, h9.SUSPEND)), new et(z, this, null), 1), g8W.R, new ern(5000, Long.MAX_VALUE), num);
    }
}
