package defpackage;

import java.util.ListIterator;

/* renamed from: h5L  reason: default package */
/* loaded from: classes.dex */
public final class h5L {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public final hRH f4045R;

    /* renamed from: R  reason: collision with other field name */
    public final String f4046R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f4047R = l6.n(v());

    /* renamed from: v  reason: collision with other field name */
    public final oST f4048v = l6.n(new cyg(v(), v()));
    public final oST c = l6.n(0L);
    public final oST e = l6.n(Long.MIN_VALUE);
    public final oST X = l6.n(Boolean.TRUE);

    /* renamed from: R  reason: collision with other field name */
    public final gnW f4044R = new gnW();
    public final gnW v = new gnW();
    public final oST O = l6.n(Boolean.FALSE);

    /* renamed from: R  reason: collision with other field name */
    public final gHm f4043R = l6.V(new dH(this, 1));

    public h5L(hRH hrh, String str) {
        this.f4045R = hrh;
        this.f4046R = str;
    }

    public final void L() {
        this.e.R(Long.MIN_VALUE);
        this.f4045R.R.R(e());
        this.c.R(0L);
        this.f4045R.c.R(Boolean.FALSE);
    }

    public final void O(long j) {
        boolean z = true;
        if (((Number) this.e.getValue()).longValue() == Long.MIN_VALUE) {
            this.e.R(Long.valueOf(j));
            this.f4045R.c.R(Boolean.TRUE);
        }
        this.X.R(Boolean.FALSE);
        this.c.R(Long.valueOf(j - ((Number) this.e.getValue()).longValue()));
        ListIterator listIterator = this.f4044R.listIterator();
        while (true) {
            aJE aje = (aJE) listIterator;
            if (!aje.hasNext()) {
                break;
            }
            c0y c0y = (c0y) aje.next();
            if (!((Boolean) c0y.e.getValue()).booleanValue()) {
                long longValue = ((Number) this.c.getValue()).longValue() - ((Number) c0y.X.getValue()).longValue();
                c0y.L.R(c0y.v().X(longValue));
                c0y.R = c0y.v().v(longValue);
                hgI v = c0y.v();
                v.getClass();
                if (o02.g(v, longValue)) {
                    c0y.e.R(Boolean.TRUE);
                    c0y.X.R(0L);
                }
            }
            if (!((Boolean) c0y.e.getValue()).booleanValue()) {
                z = false;
            }
        }
        ListIterator listIterator2 = this.v.listIterator();
        while (true) {
            aJE aje2 = (aJE) listIterator2;
            if (!aje2.hasNext()) {
                break;
            }
            h5L h5l = (h5L) aje2.next();
            if (!n3x.v(h5l.e(), h5l.v())) {
                h5l.O(((Number) this.c.getValue()).longValue());
            }
            if (!n3x.v(h5l.e(), h5l.v())) {
                z = false;
            }
        }
        if (z) {
            L();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (((java.lang.Boolean) r5.X.getValue()).booleanValue() == false) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(java.lang.Object r6, defpackage.m88 r7, int r8) {
        /*
            r5 = this;
            jr_ r7 = (defpackage.jr_) r7
            r0 = -1097578271(0xffffffffbe9448e1, float:-0.28961852)
            r7.q(r0)
            r0 = r8 & 14
            if (r0 != 0) goto L_0x0017
            boolean r0 = r7.O(r6)
            if (r0 == 0) goto L_0x0014
            r0 = 4
            goto L_0x0015
        L_0x0014:
            r0 = 2
        L_0x0015:
            r0 = r0 | r8
            goto L_0x0018
        L_0x0017:
            r0 = r8
        L_0x0018:
            r1 = r8 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0028
            boolean r1 = r7.O(r5)
            if (r1 == 0) goto L_0x0025
            r1 = 32
            goto L_0x0027
        L_0x0025:
            r1 = 16
        L_0x0027:
            r0 = r0 | r1
        L_0x0028:
            r1 = r0 & 91
            r1 = r1 ^ 18
            r2 = 0
            if (r1 != 0) goto L_0x003a
            boolean r1 = r7.J()
            if (r1 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            r7.E()
            goto L_0x009c
        L_0x003a:
            boolean r1 = r5.X()
            if (r1 != 0) goto L_0x009c
            r1 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r5.m(r6, r7, r0)
            java.lang.Object r0 = r5.v()
            boolean r0 = defpackage.n3x.v(r6, r0)
            if (r0 == 0) goto L_0x0077
            oST r0 = r5.e
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r3 = -9223372036854775808
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            r0 = 1
            goto L_0x0067
        L_0x0066:
            r0 = r2
        L_0x0067:
            if (r0 != 0) goto L_0x0077
            oST r0 = r5.X
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x009c
        L_0x0077:
            r0 = -3686930(0xffffffffffc7bdee, float:NaN)
            r7.w(r0)
            boolean r0 = r7.O(r5)
            java.lang.Object r1 = r7.I()
            if (r0 != 0) goto L_0x008b
            f1A r0 = defpackage.ppN.R
            if (r1 != r0) goto L_0x0094
        L_0x008b:
            md1 r1 = new md1
            r0 = 0
            r1.<init>(r5, r0)
            r7.ZW(r1)
        L_0x0094:
            r7.g(r2)
            iv7 r1 = (defpackage.iv7) r1
            defpackage.caw.e(r5, r1, r7)
        L_0x009c:
            dYh r7 = r7.t()
            if (r7 != 0) goto L_0x00a3
            goto L_0x00aa
        L_0x00a3:
            lVb r0 = new lVb
            r0.<init>(r5, r6, r8, r2)
            r7.f2666R = r0
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5L.R(java.lang.Object, m88, int):void");
    }

    public final boolean X() {
        return ((Boolean) this.O.getValue()).booleanValue();
    }

    public final void Z(long j, Object obj, Object obj2) {
        this.e.R(Long.MIN_VALUE);
        this.f4045R.c.R(Boolean.FALSE);
        if (!X() || !n3x.v(v(), obj) || !n3x.v(e(), obj2)) {
            this.f4045R.R.R(obj);
            this.f4047R.R(obj2);
            this.O.R(Boolean.TRUE);
            this.f4048v.R(new cyg(obj, obj2));
        }
        ListIterator listIterator = this.v.listIterator();
        while (true) {
            aJE aje = (aJE) listIterator;
            if (!aje.hasNext()) {
                break;
            }
            h5L h5l = (h5L) aje.next();
            if (h5l.X()) {
                h5l.Z(j, h5l.v(), h5l.e());
            }
        }
        ListIterator listIterator2 = this.f4044R.listIterator();
        while (true) {
            aJE aje2 = (aJE) listIterator2;
            if (aje2.hasNext()) {
                c0y c0y = (c0y) aje2.next();
                c0y.L.R(c0y.v().X(j));
                c0y.R = c0y.v().v(j);
            } else {
                this.R = j;
                return;
            }
        }
    }

    public final cyg c() {
        return (cyg) this.f4048v.getValue();
    }

    public final Object e() {
        return this.f4047R.getValue();
    }

    public final void m(Object obj, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1598251902);
        if ((i & 14) == 0) {
            i2 = (jr_.O(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= jr_.O(this) ? 32 : 16;
        }
        if (((i2 & 91) ^ 18) == 0 && jr_.J()) {
            jr_.E();
        } else if (!X() && !n3x.v(e(), obj)) {
            this.f4048v.R(new cyg(e(), obj));
            this.f4045R.R.R(e());
            this.f4047R.R(obj);
            if (!(((Number) this.e.getValue()).longValue() != Long.MIN_VALUE)) {
                this.X.R(Boolean.TRUE);
            }
            ListIterator listIterator = this.f4044R.listIterator();
            while (true) {
                aJE aje = (aJE) listIterator;
                if (!aje.hasNext()) {
                    break;
                }
                ((c0y) aje.next()).O.R(Boolean.TRUE);
            }
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new lVb(this, obj, i, 1);
        }
    }

    public final Object v() {
        return this.f4045R.R.getValue();
    }
}
