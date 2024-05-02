package defpackage;

import java.io.Serializable;

/* renamed from: lmG  reason: default package */
/* loaded from: classes.dex */
public final class lmG {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public Serializable f5827R;

    /* renamed from: R  reason: collision with other field name */
    public Object f5828R;
    public Object v;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.io.Serializable] */
    public /* synthetic */ lmG() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.f5828R = iArr;
        this.f5827R = new Object[50];
        this.v = new kyQ[50];
    }

    public final kyQ L(int i) {
        return ((kyQ[]) this.v)[((int[]) this.f5828R)[i]];
    }

    public final void O(Object obj) {
        int i = this.R;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = ((int[]) this.f5828R)[i3];
            kyQ kyq = ((kyQ[]) this.v)[i4];
            kyq.remove(obj);
            if (kyq.e > 0) {
                if (i2 != i3) {
                    Object obj2 = this.f5828R;
                    int i5 = ((int[]) obj2)[i2];
                    ((int[]) obj2)[i2] = i4;
                    ((int[]) obj2)[i3] = i5;
                }
                i2++;
            }
        }
        int i6 = this.R;
        for (int i7 = i2; i7 < i6; i7++) {
            ((Object[]) this.f5827R)[((int[]) this.f5828R)[i7]] = null;
        }
        this.R = i2;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.R
            if (r0 <= 0) goto L_0x0010
            int r0 = r6.e(r7)
            if (r0 < 0) goto L_0x0011
            kyQ r6 = r6.L(r0)
            goto L_0x009a
        L_0x0010:
            r0 = -1
        L_0x0011:
            int r0 = r0 + 1
            int r0 = -r0
            int r1 = r6.R
            java.lang.Object r2 = r6.f5828R
            int[] r2 = (int[]) r2
            int r3 = r2.length
            if (r1 >= r3) goto L_0x004a
            r3 = r2[r1]
            java.io.Serializable r4 = r6.f5827R
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r4[r3] = r7
            java.lang.Object r7 = r6.v
            kyQ[] r7 = (defpackage.kyQ[]) r7
            r4 = r7[r3]
            if (r4 != 0) goto L_0x0034
            kyQ r4 = new kyQ
            r4.<init>()
            r7[r3] = r4
        L_0x0034:
            if (r0 >= r1) goto L_0x003c
            int r7 = r0 + 1
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r0, r2, r7, r1)
        L_0x003c:
            java.lang.Object r7 = r6.f5828R
            int[] r7 = (int[]) r7
            r7[r0] = r3
            int r7 = r6.R
            int r7 = r7 + 1
            r6.R = r7
        L_0x0048:
            r6 = r4
            goto L_0x009a
        L_0x004a:
            int r2 = r2.length
            int r2 = r2 * 2
            java.lang.Object r3 = r6.v
            kyQ[] r3 = (defpackage.kyQ[]) r3
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)
            kyQ[] r3 = (defpackage.kyQ[]) r3
            r6.v = r3
            kyQ r4 = new kyQ
            r4.<init>()
            r3[r1] = r4
            java.io.Serializable r3 = r6.f5827R
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)
            r6.f5827R = r3
            r3[r1] = r7
            int[] r7 = new int[r2]
            int r3 = r6.R
        L_0x0070:
            int r3 = r3 + 1
            if (r3 >= r2) goto L_0x0077
            r7[r3] = r3
            goto L_0x0070
        L_0x0077:
            int r2 = r6.R
            if (r0 >= r2) goto L_0x0085
            java.lang.Object r3 = r6.f5828R
            int[] r3 = (int[]) r3
            int r5 = r0 + 1
            int r2 = r2 - r0
            java.lang.System.arraycopy(r3, r0, r7, r5, r2)
        L_0x0085:
            r7[r0] = r1
            if (r0 <= 0) goto L_0x0091
            java.lang.Object r1 = r6.f5828R
            int[] r1 = (int[]) r1
            r2 = 6
            defpackage.P7.T(r1, r7, r0, r2)
        L_0x0091:
            r6.f5828R = r7
            int r7 = r6.R
            int r7 = r7 + 1
            r6.R = r7
            goto L_0x0048
        L_0x009a:
            r6.add(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmG.R(java.lang.Object, java.lang.Object):void");
    }

    public final boolean X(Object obj, Object obj2) {
        int i;
        kyQ kyq;
        int e = e(obj);
        if (e < 0 || (kyq = ((kyQ[]) this.v)[(i = ((int[]) this.f5828R)[e])]) == null) {
            return false;
        }
        boolean remove = kyq.remove(obj2);
        if (kyq.e == 0) {
            int i2 = e + 1;
            int i3 = this.R;
            if (i2 < i3) {
                int[] iArr = (int[]) this.f5828R;
                System.arraycopy(iArr, i2, iArr, e, i3 - i2);
            }
            int i4 = this.R - 1;
            ((int[]) this.f5828R)[i4] = i;
            ((Object[]) this.f5827R)[i] = null;
            this.R = i4;
        }
        return remove;
    }

    public final boolean c(Object obj) {
        return e(obj) >= 0;
    }

    public final int e(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i = 0;
        int i2 = this.R - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            Object obj2 = ((Object[]) this.f5827R)[((int[]) this.f5828R)[i3]];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i2 = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    Object obj3 = ((Object[]) this.f5827R)[((int[]) this.f5828R)[i4]];
                    if (obj3 == obj) {
                        return i4;
                    }
                    if (System.identityHashCode(obj3) != identityHashCode) {
                        break;
                    }
                }
                int i5 = i3 + 1;
                int i6 = this.R;
                while (i5 < i6) {
                    Object obj4 = ((Object[]) this.f5827R)[((int[]) this.f5828R)[i5]];
                    if (obj4 == obj) {
                        return i5;
                    }
                    i5++;
                    if (System.identityHashCode(obj4) != identityHashCode) {
                        return -i5;
                    }
                }
                return -(this.R + 1);
            }
        }
        return -(i + 1);
    }

    public final void v() {
        int length = ((kyQ[]) this.v).length;
        for (int i = 0; i < length; i++) {
            kyQ kyq = ((kyQ[]) this.v)[i];
            if (kyq != null) {
                kyq.clear();
            }
            ((int[]) this.f5828R)[i] = i;
            ((Object[]) this.f5827R)[i] = null;
        }
        this.R = 0;
    }

    public /* synthetic */ lmG(int i, nbD nbd, h9 h9Var, nWQ nwq) {
        this.f5828R = nwq;
        this.R = i;
        this.f5827R = h9Var;
        this.v = nbd;
    }
}
