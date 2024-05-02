package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: coj  reason: default package */
/* loaded from: classes.dex */
public final class coj extends orf {

    /* renamed from: R  reason: collision with other field name */
    public final oSr f2204R;

    /* renamed from: R  reason: collision with other field name */
    public pdm f2205R;

    /* renamed from: R  reason: collision with other field name */
    public poS f2206R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2207R;
    public final biT v = new biT(new k8q[16]);
    public final LinkedHashMap R = new LinkedHashMap();

    /* renamed from: v  reason: collision with other field name */
    public boolean f2208v = true;
    public boolean c = true;

    public coj(oSr osr) {
        this.f2204R = osr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019a, code lost:
        if ((r10 == 5 ? r4 : false) != false) goto L_0x019c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b8  */
    @Override // defpackage.orf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean R(java.util.Map r34, defpackage.hjM r35, defpackage.aAx r36, boolean r37) {
        /*
        // Method dump skipped, instructions count: 534
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coj.R(java.util.Map, hjM, aAx, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.orf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean X(java.util.Map r9, defpackage.hjM r10, defpackage.aAx r11, boolean r12) {
        /*
            r8 = this;
            java.util.LinkedHashMap r9 = r8.R
            boolean r9 = r9.isEmpty()
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L_0x000b
            goto L_0x0013
        L_0x000b:
            oSr r9 = r8.f2204R
            boolean r9 = defpackage.msU.D(r9)
            if (r9 != 0) goto L_0x0015
        L_0x0013:
            r10 = r0
            goto L_0x0063
        L_0x0015:
            pdm r9 = r8.f2205R
            poS r1 = r8.f2206R
            long r1 = r1.R
            oSr r3 = r8.f2204R
            gKj r4 = defpackage.gKj.Initial
            e7 r3 = (defpackage.e7) r3
            eo1 r3 = r3.R
            h_4 r3 = (defpackage.h_4) r3
            laR r3 = r3.k()
            r3.x(r9, r4, r1)
            oSr r3 = r8.f2204R
            boolean r3 = defpackage.msU.D(r3)
            if (r3 == 0) goto L_0x004a
            biT r3 = r8.R
            int r4 = r3.e
            if (r4 <= 0) goto L_0x004a
            java.lang.Object[] r3 = r3.f1772R
        L_0x003c:
            r5 = r3[r0]
            coj r5 = (defpackage.coj) r5
            java.util.LinkedHashMap r6 = r8.R
            poS r7 = r8.f2206R
            r5.X(r6, r7, r11, r12)
            int r0 = r0 + r10
            if (r0 < r4) goto L_0x003c
        L_0x004a:
            oSr r11 = r8.f2204R
            boolean r11 = defpackage.msU.D(r11)
            if (r11 == 0) goto L_0x0063
            oSr r8 = r8.f2204R
            gKj r11 = defpackage.gKj.Main
            e7 r8 = (defpackage.e7) r8
            eo1 r8 = r8.R
            h_4 r8 = (defpackage.h_4) r8
            laR r8 = r8.k()
            r8.x(r9, r11, r1)
        L_0x0063:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coj.X(java.util.Map, hjM, aAx, boolean):boolean");
    }

    @Override // defpackage.orf
    public final void c() {
        biT bit = ((orf) this).R;
        int i = bit.e;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = bit.f1772R;
            do {
                ((coj) objArr[i2]).c();
                i2++;
            } while (i2 < i);
            ((h_4) ((e7) this.f2204R).R).k().m();
        }
        ((h_4) ((e7) this.f2204R).R).k().m();
    }

    @Override // defpackage.orf
    public final boolean e(aAx aax) {
        biT bit;
        int i;
        boolean z = true;
        int i2 = 0;
        if (!this.R.isEmpty() && msU.D(this.f2204R)) {
            ((h_4) ((e7) this.f2204R).R).k().x(this.f2205R, gKj.Final, ((l0f) this.f2206R).R);
            if (msU.D(this.f2204R) && (i = (bit = ((orf) this).R).e) > 0) {
                Object[] objArr = bit.f1772R;
                do {
                    ((coj) objArr[i2]).e(aax);
                    i2++;
                } while (i2 < i);
            }
        } else {
            z = false;
        }
        v(aax);
        this.R.clear();
        this.f2206R = null;
        return z;
    }

    public final String toString() {
        StringBuilder U = opT.U("Node(pointerInputFilter=");
        U.append(this.f2204R);
        U.append(", children=");
        U.append(((orf) this).R);
        U.append(", pointerIds=");
        U.append(this.v);
        U.append(')');
        return U.toString();
    }

    @Override // defpackage.orf
    public final void v(aAx aax) {
        super.v(aax);
        pdm pdm = this.f2205R;
        if (pdm != null) {
            this.f2207R = this.f2208v;
            List list = pdm.f7140R;
            int size = list.size();
            boolean z = false;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= size) {
                    break;
                }
                phU phu = (phU) list.get(i);
                if (phu.f7175R || (aax.R(phu.f7171R) && this.f2208v)) {
                    z2 = false;
                }
                if (z2) {
                    this.v.U(new k8q(phu.f7171R));
                }
                i++;
            }
            this.f2208v = false;
            if (pdm.R == 5) {
                z = true;
            }
            this.c = z;
        }
    }
}
