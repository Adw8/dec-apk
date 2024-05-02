package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/* renamed from: f67  reason: default package */
/* loaded from: classes.dex */
public final class f67 implements Xf {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public Object f3304R;
    public Object v;

    public /* synthetic */ f67(Object obj, int i, Object obj2) {
        this.R = i;
        this.v = obj;
        this.f3304R = obj2;
    }

    public bzl C(h9X h9x, int i) {
        bVN bvn;
        bzl bzl;
        int X = ((cE0) this.f3304R).X(h9x);
        if (X >= 0 && (bvn = (bVN) ((cE0) this.f3304R).x(X)) != null) {
            int i2 = bvn.f1703R;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                bvn.f1703R = i3;
                if (i == 4) {
                    bzl = bvn.f1704R;
                } else if (i == 8) {
                    bzl = bvn.v;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    ((cE0) this.f3304R).m(X);
                    bvn.f1703R = 0;
                    bvn.f1704R = null;
                    bvn.v = null;
                    bVN.R.v(bvn);
                }
                return bzl;
            }
        }
        return null;
    }

    public void H(int i, int i2) {
        int[] iArr = (int[]) this.f3304R;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            L(i3);
            int[] iArr2 = (int[]) this.f3304R;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.f3304R, i, i3, -1);
            List list = (List) this.v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    fDp fdp = (fDp) ((List) this.v).get(size);
                    int i4 = fdp.e;
                    if (i4 >= i) {
                        fdp.e = i4 + i2;
                    }
                }
            }
        }
    }

    public void L(int i) {
        Object obj = this.f3304R;
        if (((int[]) obj) == null) {
            int[] iArr = new int[Math.max(i, 10) + 1];
            this.f3304R = iArr;
            Arrays.fill(iArr, -1);
        } else if (i >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f3304R = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f3304R;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    public void N(h9X h9x) {
        bVN bvn = (bVN) ((cE0) this.f3304R).getOrDefault(h9x, null);
        if (bvn != null) {
            bvn.f1703R &= -2;
        }
    }

    public void O() {
        switch (this.R) {
            case 0:
                ((cE0) this.f3304R).clear();
                ((jXn) this.v).v();
                return;
            default:
                int[] iArr = (int[]) this.f3304R;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.v = null;
                return;
        }
    }

    public void P(h9X h9x) {
        jXn jxn = (jXn) this.v;
        if (jxn.f4952R) {
            jxn.X();
        }
        int i = jxn.e - 1;
        while (true) {
            if (i < 0) {
                break;
            } else if (h9x == ((jXn) this.v).Z(i)) {
                jXn jxn2 = (jXn) this.v;
                Object[] objArr = jxn2.f4954R;
                Object obj = objArr[i];
                Object obj2 = jXn.R;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    jxn2.f4952R = true;
                }
            } else {
                i--;
            }
        }
        bVN bvn = (bVN) ((cE0) this.f3304R).remove(h9x);
        if (bvn != null) {
            bvn.f1703R = 0;
            bvn.f1704R = null;
            bvn.v = null;
            bVN.R.v(bvn);
        }
    }

    @Override // defpackage.Xf
    public void R(fb fbVar, o3I o3i) {
        switch (this.R) {
            case 0:
                if (o3i.R.f2543R) {
                    ((CompletableFuture) this.f3304R).complete(o3i.f6659R);
                    return;
                } else {
                    ((CompletableFuture) this.f3304R).completeExceptionally(new iYd(o3i));
                    return;
                }
            case 1:
                ((CompletableFuture) this.f3304R).complete(o3i);
                return;
            default:
                ((lxm) this.v).f5865R.execute(new c9G(this, (Xf) this.f3304R, o3i, 2));
                return;
        }
    }

    public void U(int i, int i2) {
        int[] iArr = (int[]) this.f3304R;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            L(i3);
            int[] iArr2 = (int[]) this.f3304R;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.f3304R;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List list = (List) this.v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    fDp fdp = (fDp) ((List) this.v).get(size);
                    int i4 = fdp.e;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((List) this.v).remove(size);
                        } else {
                            fdp.e = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public void X(h9X h9x, bzl bzl) {
        bVN bvn = (bVN) ((cE0) this.f3304R).getOrDefault(h9x, null);
        if (bvn == null) {
            bvn = bVN.R();
            ((cE0) this.f3304R).put(h9x, bvn);
        }
        bvn.f1704R = bzl;
        bvn.f1703R |= 4;
    }

    public View Z(int i, int i2, int i3, int i4) {
        View view;
        int O = ((qy) ((cZC) this.f3304R)).O();
        int X = ((qy) ((cZC) this.f3304R)).X();
        int i5 = i2 > i ? 1 : -1;
        View view2 = null;
        while (i != i2) {
            qy qyVar = (qy) ((cZC) this.f3304R);
            switch (qyVar.e) {
                case 0:
                    view = ((kds) qyVar.R).V(i);
                    break;
                default:
                    view = ((kds) qyVar.R).V(i);
                    break;
            }
            int e = ((qy) ((cZC) this.f3304R)).e(view);
            int c = ((qy) ((cZC) this.f3304R)).c(view);
            Object obj = this.v;
            g_Y g_y = (g_Y) obj;
            g_y.v = O;
            g_y.c = X;
            g_y.e = e;
            g_y.X = c;
            if (i3 != 0) {
                ((g_Y) obj).R = i3 | 0;
                if (((g_Y) obj).R()) {
                    return view;
                }
            }
            if (i4 != 0) {
                Object obj2 = this.v;
                ((g_Y) obj2).R = i4 | 0;
                if (((g_Y) obj2).R()) {
                    view2 = view;
                }
            }
            i += i5;
        }
        return view2;
    }

    public void c(h9X h9x) {
        bVN bvn = (bVN) ((cE0) this.f3304R).getOrDefault(h9x, null);
        if (bvn == null) {
            bvn = bVN.R();
            ((cE0) this.f3304R).put(h9x, bvn);
        }
        bvn.f1703R |= 1;
    }

    public void e(h9X h9x, bzl bzl) {
        bVN bvn = (bVN) ((cE0) this.f3304R).getOrDefault(h9x, null);
        if (bvn == null) {
            bvn = bVN.R();
            ((cE0) this.f3304R).put(h9x, bvn);
        }
        bvn.v = bzl;
        bvn.f1703R |= 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int m(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f3304R
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r0.length
            if (r6 < r0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.Object r0 = r5.v
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0014
            goto L_0x0071
        L_0x0014:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 != 0) goto L_0x001a
            goto L_0x0034
        L_0x001a:
            int r0 = r0.size()
            int r0 = r0 + r1
        L_0x001f:
            if (r0 < 0) goto L_0x0034
            java.lang.Object r3 = r5.v
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            fDp r3 = (defpackage.fDp) r3
            int r4 = r3.e
            if (r4 != r6) goto L_0x0031
            r2 = r3
            goto L_0x0034
        L_0x0031:
            int r0 = r0 + -1
            goto L_0x001f
        L_0x0034:
            if (r2 == 0) goto L_0x003d
            java.lang.Object r0 = r5.v
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L_0x003d:
            java.lang.Object r0 = r5.v
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L_0x0046:
            if (r2 >= r0) goto L_0x005a
            java.lang.Object r3 = r5.v
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            fDp r3 = (defpackage.fDp) r3
            int r3 = r3.e
            if (r3 < r6) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            int r2 = r2 + 1
            goto L_0x0046
        L_0x005a:
            r2 = r1
        L_0x005b:
            if (r2 == r1) goto L_0x0071
            java.lang.Object r0 = r5.v
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            fDp r0 = (defpackage.fDp) r0
            java.lang.Object r3 = r5.v
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.e
            goto L_0x0072
        L_0x0071:
            r0 = r1
        L_0x0072:
            if (r0 != r1) goto L_0x0082
            java.lang.Object r0 = r5.f3304R
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r5 = r5.f3304R
            int[] r5 = (int[]) r5
            int r5 = r5.length
            return r5
        L_0x0082:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.f3304R
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r5 = r5.f3304R
            int[] r5 = (int[]) r5
            java.util.Arrays.fill(r5, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f67.m(int):int");
    }

    @Override // defpackage.Xf
    public void v(Throwable th) {
        switch (this.R) {
            case 0:
                ((CompletableFuture) this.f3304R).completeExceptionally(th);
                return;
            case 1:
                ((CompletableFuture) this.f3304R).completeExceptionally(th);
                return;
            default:
                ((lxm) this.v).f5865R.execute(new c9G(this, (Xf) this.f3304R, th, 3));
                return;
        }
    }

    public boolean x(View view) {
        g_Y g_y = (g_Y) this.v;
        int O = ((qy) ((cZC) this.f3304R)).O();
        int X = ((qy) ((cZC) this.f3304R)).X();
        int e = ((qy) ((cZC) this.f3304R)).e(view);
        int c = ((qy) ((cZC) this.f3304R)).c(view);
        g_y.v = O;
        g_y.c = X;
        g_y.e = e;
        g_y.X = c;
        Object obj = this.v;
        ((g_Y) obj).R = 24579 | 0;
        return ((g_Y) obj).R();
    }

    public /* synthetic */ f67(int i) {
        this.R = i;
        if (i != 1) {
            this.f3304R = new cE0();
            this.v = new jXn();
        }
    }

    public /* synthetic */ f67(qy qyVar) {
        this.R = 2;
        this.f3304R = qyVar;
        this.v = new g_Y();
    }
}
