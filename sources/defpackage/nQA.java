package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: nQA  reason: default package */
/* loaded from: classes.dex */
public final class nQA implements Iterable, dsi {
    public static final nQA R = new nQA(0, 0, 0, null);

    /* renamed from: R  reason: collision with other field name */
    public final long f6387R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f6388R;
    public final int e;
    public final long v;

    public nQA(long j, long j2, int i, int[] iArr) {
        this.f6387R = j;
        this.v = j2;
        this.e = i;
        this.f6388R = iArr;
    }

    public final nQA C(int i) {
        int i2;
        long j;
        int i3 = this.e;
        int i4 = i - i3;
        if (i4 >= 0 && i4 < 64) {
            long j2 = 1 << i4;
            long j3 = this.v;
            if ((j3 & j2) == 0) {
                return new nQA(this.f6387R, j3 | j2, i3, this.f6388R);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j4 = 1 << (i4 - 64);
            long j5 = this.f6387R;
            if ((j5 & j4) == 0) {
                return new nQA(j4 | j5, this.v, i3, this.f6388R);
            }
        } else if (i4 < 128) {
            int[] iArr = this.f6388R;
            if (iArr == null) {
                return new nQA(this.f6387R, this.v, i3, new int[]{i});
            }
            int N = g4x.N(iArr, i);
            if (N < 0) {
                int i5 = -(N + 1);
                int length = iArr.length + 1;
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, i5 + 0);
                System.arraycopy(iArr, i5, iArr2, i5 + 1, (length - 1) - i5);
                iArr2[i5] = i;
                return new nQA(this.f6387R, this.v, this.e, iArr2);
            }
        } else if (!c(i)) {
            long j6 = this.f6387R;
            long j7 = this.v;
            int i6 = this.e;
            ArrayList arrayList = null;
            int i7 = ((i + 1) / 64) * 64;
            while (true) {
                if (i6 >= i7) {
                    i2 = i6;
                    j = j7;
                    break;
                }
                if (j7 != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.f6388R;
                        if (iArr3 != null) {
                            for (int i8 : iArr3) {
                                arrayList.add(Integer.valueOf(i8));
                            }
                        }
                    }
                    for (int i9 = 0; i9 < 64; i9++) {
                        if (((1 << i9) & j7) != 0) {
                            arrayList.add(Integer.valueOf(i9 + i6));
                        }
                    }
                }
                if (j6 == 0) {
                    j = 0;
                    i2 = i7;
                    break;
                }
                i6 += 64;
                j7 = j6;
                j6 = 0;
            }
            return new nQA(j6, j, i2, arrayList != null ? dF.mZ(arrayList) : this.f6388R).C(i);
        }
        return this;
    }

    public final nQA H(nQA nqa) {
        int[] iArr;
        nQA nqa2 = R;
        if (nqa == nqa2) {
            return this;
        }
        if (this == nqa2) {
            return nqa;
        }
        int i = nqa.e;
        int i2 = this.e;
        if (i == i2 && nqa.f6388R == (iArr = this.f6388R)) {
            return new nQA(this.f6387R | nqa.f6387R, this.v | nqa.v, i2, iArr);
        }
        if (this.f6388R == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                nqa = nqa.C(((Number) it.next()).intValue());
            }
            return nqa;
        }
        Iterator it2 = nqa.iterator();
        while (it2.hasNext()) {
            this = this.C(((Number) it2.next()).intValue());
        }
        return this;
    }

    public final nQA R(nQA nqa) {
        int[] iArr;
        nQA nqa2 = R;
        if (nqa == nqa2) {
            return this;
        }
        if (this == nqa2) {
            return nqa2;
        }
        int i = nqa.e;
        int i2 = this.e;
        if (i == i2 && nqa.f6388R == (iArr = this.f6388R)) {
            return new nQA(this.f6387R & (~nqa.f6387R), this.v & (~nqa.v), i2, iArr);
        }
        Iterator it = nqa.iterator();
        while (it.hasNext()) {
            this = this.v(((Number) it.next()).intValue());
        }
        return this;
    }

    public final boolean c(int i) {
        int[] iArr;
        int i2 = i - this.e;
        boolean z = true;
        if (i2 >= 0 && i2 < 64) {
            return (this.v & (1 << i2)) != 0;
        }
        if (i2 >= 64 && i2 < 128) {
            return (this.f6387R & (1 << (i2 - 64))) != 0;
        }
        if (i2 > 0 || (iArr = this.f6388R) == null) {
            return false;
        }
        if (g4x.N(iArr, i) < 0) {
            z = false;
        }
        return z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new pn(3, new l1t(this, null)).iterator();
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(a6.B(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            boolean z = true;
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null) {
                z = obj instanceof CharSequence;
            }
            if (z) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }

    public final nQA v(int i) {
        int[] iArr;
        int N;
        int i2 = this.e;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.v;
            if ((j2 & j) != 0) {
                return new nQA(this.f6387R, j2 & (~j), i2, this.f6388R);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.f6387R;
            if ((j4 & j3) != 0) {
                return new nQA((~j3) & j4, this.v, i2, this.f6388R);
            }
        } else if (i3 < 0 && (iArr = this.f6388R) != null && (N = g4x.N(iArr, i)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new nQA(this.f6387R, this.v, this.e, null);
            }
            int[] iArr2 = new int[length];
            if (N > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, N + 0);
            }
            if (N < length) {
                int i4 = N + 1;
                System.arraycopy(iArr, i4, iArr2, N, (length + 1) - i4);
            }
            return new nQA(this.f6387R, this.v, this.e, iArr2);
        }
        return this;
    }
}
