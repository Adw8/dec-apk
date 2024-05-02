package defpackage;

import java.text.BreakIterator;
import java.util.Collections;
import java.util.List;

/* renamed from: n4U  reason: default package */
/* loaded from: classes.dex */
public final class n4U {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final bz f6281R;

    /* renamed from: R  reason: collision with other field name */
    public final c71 f6282R;

    /* renamed from: R  reason: collision with other field name */
    public final d5M f6283R;

    /* renamed from: R  reason: collision with other field name */
    public final iRR f6284R;

    /* renamed from: R  reason: collision with other field name */
    public final mjp f6285R;

    /* renamed from: R  reason: collision with other field name */
    public final o4E f6286R;
    public long v;

    /* renamed from: v  reason: collision with other field name */
    public bz f6287v;

    public n4U(d5M d5m, c71 c71, mjp mjp, o4E o4e) {
        bz bzVar = d5m.f2488R;
        long j = d5m.R;
        iRR irr = mjp != null ? mjp.f6140R : null;
        this.f6281R = bzVar;
        this.R = j;
        this.f6284R = irr;
        this.f6282R = c71;
        this.f6286R = o4e;
        this.v = j;
        this.f6287v = bzVar;
        this.f6283R = d5m;
        this.f6285R = mjp;
    }

    public final void C() {
        Integer num = null;
        this.f6286R.R = null;
        if (this.f6287v.R.length() > 0) {
            iRR irr = this.f6284R;
            if (irr != null) {
                num = Integer.valueOf(e(irr, this.f6282R.Z(odN.c(this.v))));
            }
            if (num != null) {
                int intValue = num.intValue();
                Y(intValue, intValue);
            }
        }
    }

    public final void H() {
        this.f6286R.R = null;
        if (this.f6287v.R.length() > 0) {
            String str = this.f6287v.R;
            int c = odN.c(this.v);
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int following = characterInstance.following(c);
            if (following != -1) {
                Y(following, following);
            }
        }
    }

    public final void J() {
        if (this.f6287v.R.length() > 0) {
            long j = this.R;
            int i = odN.R;
            this.v = dtx.e((int) (j >> 32), odN.c(this.v));
        }
    }

    public final void K() {
        Integer c;
        this.f6286R.R = null;
        if ((this.f6287v.R.length() > 0) && (c = c()) != null) {
            int intValue = c.intValue();
            Y(intValue, intValue);
        }
    }

    public final int L(iRR irr, int i) {
        int Z = this.f6282R.Z(odN.c(this.v));
        o4E o4e = this.f6286R;
        if (o4e.R == null) {
            o4e.R = Float.valueOf(irr.c(Z).f3720R);
        }
        int O = irr.O(Z) + i;
        if (O < 0) {
            return 0;
        }
        if (O >= irr.f4592R.f7260v) {
            return this.f6287v.R.length();
        }
        float e = irr.e(O) - ((float) 1);
        Float f = this.f6286R.R;
        float floatValue = f.floatValue();
        if ((O() && floatValue >= irr.m(O)) || (!O() && floatValue <= irr.Z(O))) {
            return irr.X(O, true);
        }
        return this.f6282R.L(irr.U(aH9.N(f.floatValue(), e)));
    }

    public final void N() {
        this.f6286R.R = null;
        if (this.f6287v.R.length() > 0) {
            String str = this.f6287v.R;
            int c = odN.c(this.v);
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int preceding = characterInstance.preceding(c);
            if (preceding != -1) {
                Y(preceding, preceding);
            }
        }
    }

    public final boolean O() {
        iRR irr = this.f6284R;
        return (irr != null ? irr.C(odN.c(this.v)) : null) != bSG.Rtl;
    }

    public final void P() {
        this.f6286R.R = null;
        int i = 0;
        if (this.f6287v.R.length() > 0) {
            String str = this.f6287v.R;
            int X = odN.X(this.v) - 1;
            while (true) {
                if (X <= 0) {
                    break;
                }
                int i2 = X - 1;
                if (str.charAt(i2) == '\n') {
                    i = X;
                    break;
                }
                X = i2;
            }
            Y(i, i);
        }
    }

    public final List R(ih ihVar) {
        if (!odN.v(this.v)) {
            return pdD.Y(new k77("", 0), new gbI(odN.X(this.v), odN.X(this.v)));
        }
        mKb mkb = (mKb) ihVar.x(this);
        if (mkb != null) {
            return Collections.singletonList(mkb);
        }
        return null;
    }

    public final void U() {
        this.f6286R.R = null;
        if (this.f6287v.R.length() > 0) {
            String str = this.f6287v.R;
            int e = odN.e(this.v) + 1;
            int length = str.length();
            while (true) {
                if (e >= length) {
                    e = str.length();
                    break;
                } else if (str.charAt(e) == '\n') {
                    break;
                } else {
                    e++;
                }
            }
            Y(e, e);
        }
    }

    public final void V() {
        this.f6286R.R = null;
        if (!(this.f6287v.R.length() > 0)) {
            return;
        }
        if (O()) {
            K();
        } else {
            i();
        }
    }

    public final int X(iRR irr, int i) {
        if (i < 0) {
            return 0;
        }
        int length = this.f6287v.R.length() - 1;
        if (i <= length) {
            length = i;
        }
        int N = (int) (irr.N(length) >> 32);
        return N >= i ? X(irr, i - 1) : this.f6282R.L(N);
    }

    public final void Y(int i, int i2) {
        this.v = dtx.e(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r2 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Z(defpackage.mjp r6, int r7) {
        /*
            r5 = this;
            hjM r0 = r6.R
            if (r0 == 0) goto L_0x0010
            hjM r1 = r6.v
            r2 = 0
            if (r1 == 0) goto L_0x000e
            r2 = 1
            gIA r2 = r1.j(r0, r2)
        L_0x000e:
            if (r2 != 0) goto L_0x0012
        L_0x0010:
            gIA r2 = defpackage.gIA.R
        L_0x0012:
            c71 r0 = r5.f6282R
            d5M r1 = r5.f6283R
            long r3 = r1.R
            int r1 = defpackage.odN.c(r3)
            int r0 = r0.Z(r1)
            iRR r1 = r6.f6140R
            gIA r0 = r1.c(r0)
            float r1 = r0.f3720R
            float r0 = r0.v
            float r3 = r2.c
            float r4 = r2.f3720R
            float r3 = r3 - r4
            float r4 = r2.e
            float r2 = r2.v
            float r4 = r4 - r2
            long r2 = defpackage.n1P.e(r3, r4)
            float r2 = defpackage.nqW.v(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r2 = r2 + r0
            c71 r5 = r5.f6282R
            iRR r6 = r6.f6140R
            long r0 = defpackage.aH9.N(r1, r2)
            int r6 = r6.U(r0)
            int r5 = r5.L(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n4U.Z(mjp, int):int");
    }

    public final Integer c() {
        iRR irr = this.f6284R;
        if (irr == null) {
            return null;
        }
        return Integer.valueOf(this.f6282R.L(irr.x(irr.O(this.f6282R.Z(odN.X(this.v))))));
    }

    public final int e(iRR irr, int i) {
        if (i >= this.f6281R.length()) {
            return this.f6281R.length();
        }
        int length = this.f6287v.R.length() - 1;
        if (i <= length) {
            length = i;
        }
        long N = irr.N(length);
        return odN.c(N) <= i ? e(irr, i + 1) : this.f6282R.L(odN.c(N));
    }

    public final void g() {
        this.f6286R.R = null;
        if (!(this.f6287v.R.length() > 0)) {
            return;
        }
        if (O()) {
            H();
        } else {
            N();
        }
    }

    public final void i() {
        Integer v;
        this.f6286R.R = null;
        if ((this.f6287v.R.length() > 0) && (v = v()) != null) {
            int intValue = v.intValue();
            Y(intValue, intValue);
        }
    }

    public final void j() {
        Integer num = null;
        this.f6286R.R = null;
        if (this.f6287v.R.length() > 0) {
            iRR irr = this.f6284R;
            if (irr != null) {
                num = Integer.valueOf(X(irr, this.f6282R.Z(odN.c(this.v))));
            }
            if (num != null) {
                int intValue = num.intValue();
                Y(intValue, intValue);
            }
        }
    }

    public final void m() {
        this.f6286R.R = null;
        if (!(this.f6287v.R.length() > 0)) {
            return;
        }
        if (O()) {
            N();
        } else {
            H();
        }
    }

    public final void o() {
        this.f6286R.R = null;
        if (!(this.f6287v.R.length() > 0)) {
            return;
        }
        if (O()) {
            i();
        } else {
            K();
        }
    }

    public final void t() {
        this.f6286R.R = null;
        if (this.f6287v.R.length() > 0) {
            int length = this.f6287v.R.length();
            Y(length, length);
        }
    }

    public final Integer v() {
        iRR irr = this.f6284R;
        if (irr == null) {
            return null;
        }
        return Integer.valueOf(this.f6282R.L(irr.X(irr.O(this.f6282R.Z(odN.e(this.v))), true)));
    }

    public final void x() {
        this.f6286R.R = null;
        if (!(this.f6287v.R.length() > 0)) {
            return;
        }
        if (O()) {
            j();
        } else {
            C();
        }
    }

    public final void y() {
        this.f6286R.R = null;
        if (!(this.f6287v.R.length() > 0)) {
            return;
        }
        if (O()) {
            C();
        } else {
            j();
        }
    }
}
