package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kd_  reason: default package */
/* loaded from: classes.dex */
public final class kd_ implements Iterator, dsi {
    public int L;
    public int O;
    public final /* synthetic */ gzK R;

    /* renamed from: R  reason: collision with other field name */
    public heu f5370R;
    public int X;
    public int e = -1;

    public kd_(gzK gzk) {
        this.R = gzk;
        int x = caw.x(gzk.R, 0, gzk.f4010R.length());
        this.X = x;
        this.O = x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r6 < r3) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R() {
        /*
            r7 = this;
            int r0 = r7.O
            r1 = 0
            if (r0 >= 0) goto L_0x000c
            r7.e = r1
            r0 = 0
            r7.f5370R = r0
            goto L_0x0082
        L_0x000c:
            gzK r2 = r7.R
            int r3 = r2.v
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L_0x001b
            int r6 = r7.L
            int r6 = r6 + r5
            r7.L = r6
            if (r6 >= r3) goto L_0x0023
        L_0x001b:
            java.lang.CharSequence r2 = r2.f4010R
            int r2 = r2.length()
            if (r0 <= r2) goto L_0x0037
        L_0x0023:
            heu r0 = new heu
            int r1 = r7.X
            gzK r2 = r7.R
            java.lang.CharSequence r2 = r2.f4010R
            int r2 = defpackage.iH_.A(r2)
            r0.<init>(r1, r2)
            r7.f5370R = r0
            r7.O = r4
            goto L_0x0080
        L_0x0037:
            gzK r0 = r7.R
            iv7 r2 = r0.f4009R
            java.lang.CharSequence r0 = r0.f4010R
            int r3 = r7.O
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r2.J(r0, r3)
            kSh r0 = (defpackage.kSh) r0
            if (r0 != 0) goto L_0x005f
            heu r0 = new heu
            int r1 = r7.X
            gzK r2 = r7.R
            java.lang.CharSequence r2 = r2.f4010R
            int r2 = defpackage.iH_.A(r2)
            r0.<init>(r1, r2)
            r7.f5370R = r0
            r7.O = r4
            goto L_0x0080
        L_0x005f:
            java.lang.Object r2 = r0.R
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.v
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.X
            heu r3 = defpackage.caw.V(r3, r2)
            r7.f5370R = r3
            int r2 = r2 + r0
            r7.X = r2
            if (r0 != 0) goto L_0x007d
            r1 = r5
        L_0x007d:
            int r2 = r2 + r1
            r7.O = r2
        L_0x0080:
            r7.e = r5
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd_.R():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e == -1) {
            R();
        }
        return this.e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e == -1) {
            R();
        }
        if (this.e != 0) {
            heu heu = this.f5370R;
            this.f5370R = null;
            this.e = -1;
            return heu;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
