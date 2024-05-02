package defpackage;

/* renamed from: kE9  reason: default package */
/* loaded from: classes.dex */
public abstract class kE9 extends xZ implements mx9 {
    public static final gwb R = new gwb(0);

    public kE9() {
        super(hw1.c);
    }

    @Override // defpackage.xZ, defpackage.nbD
    public final nbD H(e86 e86) {
        boolean z;
        if (!(e86 instanceof Dv)) {
            return hw1.c == e86 ? aIH.R : this;
        }
        Dv dv = (Dv) e86;
        e86 e862 = this.R;
        if (e862 == dv) {
            dv.getClass();
        } else if (dv.R != e862) {
            z = false;
            return (!z || ((hdJ) dv.f81R.x(this)) == null) ? this : aIH.R;
        }
        z = true;
        if (!z) {
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [hdJ] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xZ, defpackage.hdJ, defpackage.nbD
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hdJ O(defpackage.e86 r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.Dv
            r1 = 0
            if (r0 == 0) goto L_0x0025
            Dv r4 = (defpackage.Dv) r4
            e86 r0 = r3.R
            if (r0 == r4) goto L_0x0012
            e86 r2 = r4.R
            if (r2 != r0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r0 = 0
            goto L_0x0016
        L_0x0012:
            r4.getClass()
        L_0x0015:
            r0 = 1
        L_0x0016:
            if (r0 == 0) goto L_0x002c
            kg9 r4 = r4.f81R
            java.lang.Object r3 = r4.x(r3)
            hdJ r3 = (defpackage.hdJ) r3
            boolean r4 = r3 instanceof defpackage.hdJ
            if (r4 == 0) goto L_0x002c
            goto L_0x002b
        L_0x0025:
            hw1 r0 = defpackage.hw1.c
            if (r0 != r4) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r3 = r1
        L_0x002b:
            r1 = r3
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kE9.O(e86):hdJ");
    }

    public void X4(nbD nbd, Runnable runnable) {
        mL(nbd, runnable);
    }

    public abstract void mL(nbD nbd, Runnable runnable);

    @Override // java.lang.Object
    public String toString() {
        return getClass().getSimpleName() + '@' + aH9.G(this);
    }

    public boolean zw(nbD nbd) {
        return !(this instanceof o4l);
    }
}
