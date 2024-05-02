package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* renamed from: kDn  reason: default package */
/* loaded from: classes.dex */
public final class kDn extends AbstractMap implements Serializable {
    public static final gvk R = new gvk(7);

    /* renamed from: R  reason: collision with other field name */
    public mnQ f5219R;
    public mnQ v;
    public int e = 0;
    public int X = 0;

    /* renamed from: R  reason: collision with other field name */
    public final Comparator f5218R = R;

    /* renamed from: R  reason: collision with other field name */
    public final grV f5217R = new grV();

    /* renamed from: R  reason: collision with other field name */
    public grV[] f5220R = new grV[16];
    public int O = 12;

    public final void L(grV grv) {
        grV grv2 = grv.v;
        grV grv3 = grv.c;
        grV grv4 = grv2.v;
        grV grv5 = grv2.c;
        grv.v = grv5;
        if (grv5 != null) {
            grv5.R = grv;
        }
        X(grv, grv2);
        grv2.c = grv;
        grv.R = grv2;
        int i = 0;
        int max = Math.max(grv3 != null ? grv3.X : 0, grv5 != null ? grv5.X : 0) + 1;
        grv.X = max;
        if (grv4 != null) {
            i = grv4.X;
        }
        grv2.X = Math.max(max, i) + 1;
    }

    public final void O(grV grv) {
        grV grv2 = grv.v;
        grV grv3 = grv.c;
        grV grv4 = grv3.v;
        grV grv5 = grv3.c;
        grv.c = grv4;
        if (grv4 != null) {
            grv4.R = grv;
        }
        X(grv, grv3);
        grv3.v = grv;
        grv.R = grv3;
        int i = 0;
        int max = Math.max(grv2 != null ? grv2.X : 0, grv4 != null ? grv4.X : 0) + 1;
        grv.X = max;
        if (grv5 != null) {
            i = grv5.X;
        }
        grv3.X = Math.max(max, i) + 1;
    }

    public final grV R(Object obj, boolean z) {
        int i;
        grV grv;
        grV grv2;
        grV grv3;
        grV grv4;
        Comparator comparator = this.f5218R;
        grV[] grvArr = this.f5220R;
        int hashCode = obj.hashCode();
        int i2 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i3 = ((i2 >>> 7) ^ i2) ^ (i2 >>> 4);
        int length = i3 & (grvArr.length - 1);
        grV grv5 = grvArr[length];
        grV grv6 = null;
        if (grv5 != null) {
            Comparable comparable = comparator == R ? (Comparable) obj : null;
            while (true) {
                int compareTo = comparable != null ? comparable.compareTo(grv5.f3961R) : comparator.compare(obj, grv5.f3961R);
                if (compareTo == 0) {
                    return grv5;
                }
                grV grv7 = compareTo < 0 ? grv5.v : grv5.c;
                if (grv7 == null) {
                    grv = grv5;
                    i = compareTo;
                    break;
                }
                grv5 = grv7;
            }
        } else {
            grv = grv5;
            i = 0;
        }
        if (!z) {
            return null;
        }
        grV grv8 = this.f5217R;
        if (grv != null) {
            grV grv9 = new grV(grv, obj, i3, grv8, grv8.f3962X);
            if (i < 0) {
                grv.v = grv9;
            } else {
                grv.c = grv9;
            }
            c(grv, true);
            grv2 = grv9;
        } else if (comparator != R || (obj instanceof Comparable)) {
            grv2 = new grV(grv, obj, i3, grv8, grv8.f3962X);
            grvArr[length] = grv2;
        } else {
            throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
        }
        int i4 = this.e;
        this.e = i4 + 1;
        if (i4 > this.O) {
            grV[] grvArr2 = this.f5220R;
            int length2 = grvArr2.length;
            int i5 = length2 * 2;
            grV[] grvArr3 = new grV[i5];
            ma7 ma7 = new ma7(3);
            ma7 ma72 = new ma7(3);
            for (int i6 = 0; i6 < length2; i6++) {
                grV grv10 = grvArr2[i6];
                if (grv10 != null) {
                    grV grv11 = grv10;
                    grV grv12 = grv6;
                    while (grv11 != null) {
                        grv11.R = grv12;
                        grv11 = grv11.v;
                        grv12 = grv11;
                    }
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (grv12 == null) {
                            grv12 = grv12;
                            grv12 = grv6;
                        } else {
                            grv12 = grv12.R;
                            grv12.R = grv6;
                            grV grv13 = grv12.c;
                            while (grv13 != null) {
                                grv13.R = grv12;
                                grv13 = grv13.v;
                                grv12 = grv13;
                            }
                        }
                        if (grv12 == null) {
                            break;
                        }
                        if ((grv12.e & length2) == 0) {
                            i7++;
                        } else {
                            i8++;
                        }
                        grv6 = null;
                    }
                    ma7.v = ((Integer.highestOneBit(i7) * 2) - 1) - i7;
                    ma7.e = 0;
                    ma7.c = 0;
                    ma7.f6078R = null;
                    ma72.v = ((Integer.highestOneBit(i8) * 2) - 1) - i8;
                    ma72.e = 0;
                    ma72.c = 0;
                    ma72.f6078R = null;
                    grV grv14 = null;
                    while (grv10 != null) {
                        grv10.R = grv14;
                        grv10 = grv10.v;
                        grv14 = grv10;
                    }
                    while (true) {
                        if (grv14 == null) {
                            grv14 = grv14;
                            grv14 = null;
                            grv6 = null;
                        } else {
                            grv14 = grv14.R;
                            grv6 = null;
                            grv14.R = null;
                            grv14 = grv14.c;
                            while (grv14 != null) {
                                grv14.R = grv14;
                                grv14 = grv14.v;
                            }
                        }
                        if (grv14 == null) {
                            break;
                        } else if ((grv14.e & length2) == 0) {
                            ma7.k(grv14);
                        } else {
                            ma72.k(grv14);
                        }
                    }
                    if (i7 > 0) {
                        grv3 = (grV) ma7.f6078R;
                        if (grv3.R != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        grv3 = grv6;
                    }
                    grvArr3[i6] = grv3;
                    int i9 = i6 + length2;
                    if (i8 > 0) {
                        grv4 = (grV) ma72.f6078R;
                        if (grv4.R != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        grv4 = grv6;
                    }
                    grvArr3[i9] = grv4;
                }
            }
            this.f5220R = grvArr3;
            this.O = (i5 / 4) + (i5 / 2);
        }
        this.X++;
        return grv2;
    }

    public final void X(grV grv, grV grv2) {
        grV grv3 = grv.R;
        grv.R = null;
        if (grv2 != null) {
            grv2.R = grv3;
        }
        if (grv3 == null) {
            int i = grv.e;
            grV[] grvArr = this.f5220R;
            grvArr[i & (grvArr.length - 1)] = grv2;
        } else if (grv3.v == grv) {
            grv3.v = grv2;
        } else {
            grv3.c = grv2;
        }
    }

    public final void c(grV grv, boolean z) {
        while (grv != null) {
            grV grv2 = grv.v;
            grV grv3 = grv.c;
            int i = 0;
            int i2 = grv2 != null ? grv2.X : 0;
            int i3 = grv3 != null ? grv3.X : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                grV grv4 = grv3.v;
                grV grv5 = grv3.c;
                int i5 = grv5 != null ? grv5.X : 0;
                if (grv4 != null) {
                    i = grv4.X;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    L(grv3);
                }
                O(grv);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                grV grv6 = grv2.v;
                grV grv7 = grv2.c;
                int i7 = grv7 != null ? grv7.X : 0;
                if (grv6 != null) {
                    i = grv6.X;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    O(grv2);
                }
                L(grv);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                grv.X = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                grv.X = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            grv = grv.R;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f5220R, (Object) null);
        this.e = 0;
        this.X++;
        grV grv = this.f5217R;
        grV grv2 = grv.f3963e;
        while (grv2 != grv) {
            grv2 = grv2.f3963e;
            grv2.f3962X = null;
            grv2.f3963e = null;
        }
        grv.f3962X = grv;
        grv.f3963e = grv;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        grV grv = null;
        if (obj != null) {
            try {
                grv = R(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return grv != null;
    }

    public final void e(grV grv, boolean z) {
        int i;
        if (z) {
            grV grv2 = grv.f3962X;
            grv2.f3963e = grv.f3963e;
            grv.f3963e.f3962X = grv2;
            grv.f3962X = null;
            grv.f3963e = null;
        }
        grV grv3 = grv.v;
        grv3 = grv.c;
        grV grv4 = grv.R;
        int i2 = 0;
        if (grv3 == null || grv3 == null) {
            if (grv3 != null) {
                X(grv, grv3);
                grv.v = null;
            } else if (grv3 != null) {
                X(grv, grv3);
                grv.c = null;
            } else {
                X(grv, null);
            }
            c(grv4, false);
            this.e--;
            this.X++;
            return;
        }
        if (grv3.X > grv3.X) {
            grv3 = grv3.c;
            while (grv3 != null) {
                grv3 = grv3.c;
            }
        } else {
            grv3 = grv3.v;
            while (grv3 != null) {
                grv3 = grv3.v;
            }
        }
        e(grv3, false);
        grV grv5 = grv.v;
        if (grv5 != null) {
            i = grv5.X;
            grv3.v = grv5;
            grv5.R = grv3;
            grv.v = null;
        } else {
            i = 0;
        }
        grV grv6 = grv.c;
        if (grv6 != null) {
            i2 = grv6.X;
            grv3.c = grv6;
            grv6.R = grv3;
            grv.c = null;
        }
        grv3.X = Math.max(i, i2) + 1;
        X(grv, grv3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        mnQ mnq = this.f5219R;
        if (mnq != null) {
            return mnq;
        }
        mnQ mnq2 = new mnQ(this, 0);
        this.f5219R = mnq2;
        return mnq2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            grV r2 = r2.R(r3, r1)     // Catch: ClassCastException -> 0x0009
            goto L_0x000a
        L_0x0009:
            r2 = r0
        L_0x000a:
            if (r2 == 0) goto L_0x000e
            java.lang.Object r0 = r2.f3964v
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kDn.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        mnQ mnq = this.v;
        if (mnq != null) {
            return mnq;
        }
        mnQ mnq2 = new mnQ(this, 1);
        this.v = mnq2;
        return mnq2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            grV R2 = R(obj, true);
            Object obj3 = R2.f3964v;
            R2.f3964v = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            grV r3 = r2.R(r3, r1)     // Catch: ClassCastException -> 0x0009
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x0010
            r1 = 1
            r2.e(r3, r1)
        L_0x0010:
            if (r3 == 0) goto L_0x0014
            java.lang.Object r0 = r3.f3964v
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kDn.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.grV v(java.util.Map.Entry r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x000d
            grV r4 = r4.R(r0, r1)     // Catch: ClassCastException -> 0x000d
            goto L_0x000e
        L_0x000d:
            r4 = r2
        L_0x000e:
            r0 = 1
            if (r4 == 0) goto L_0x0028
            java.lang.Object r3 = r4.f3964v
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x0024
            if (r3 == 0) goto L_0x0022
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r1
            goto L_0x0025
        L_0x0024:
            r5 = r0
        L_0x0025:
            if (r5 == 0) goto L_0x0028
            r1 = r0
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            r2 = r4
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kDn.v(java.util.Map$Entry):grV");
    }
}
