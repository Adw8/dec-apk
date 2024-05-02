package defpackage;

import java.util.Iterator;

/* renamed from: jHy  reason: default package */
/* loaded from: classes.dex */
public final class jHy implements fDb {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final iv7 f4898R;

    /* renamed from: R  reason: collision with other field name */
    public final jJj f4899R;

    public jHy(long j, jJj jjj, iv7 iv7) {
        this.R = j;
        this.f4899R = jjj;
        this.f4898R = iv7;
    }

    @Override // defpackage.fDb
    public final long R(oOe ooe, long j, mdz mdz, long j2) {
        pvc pvc;
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        int B = this.f4899R.B(a4b.R);
        int B2 = this.f4899R.B(esE.R(this.R));
        int B3 = this.f4899R.B(esE.v(this.R));
        int i = ooe.R + B2;
        int i2 = (int) (j2 >> 32);
        int i3 = (ooe.c - B2) - i2;
        int i4 = (int) (j >> 32);
        int i5 = i4 - i2;
        if (mdz == mdz.Ltr) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(i);
            numArr[1] = Integer.valueOf(i3);
            if (ooe.R < 0) {
                i5 = 0;
            }
            numArr[2] = Integer.valueOf(i5);
            pvc = a6.M(numArr);
        } else {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(i3);
            numArr2[1] = Integer.valueOf(i);
            if (ooe.c <= i4) {
                i5 = 0;
            }
            numArr2[2] = Integer.valueOf(i5);
            pvc = a6.M(numArr2);
        }
        Iterator it = pvc.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            int intValue = ((Number) obj2).intValue();
            if (intValue < 0 || intValue + i2 > i4) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            i3 = num.intValue();
        }
        int max = Math.max(ooe.e + B3, B);
        int v = (ooe.v - B3) - ltH.v(j2);
        Iterator it2 = a6.M(Integer.valueOf(max), Integer.valueOf(v), Integer.valueOf(ooe.v - (ltH.v(j2) / 2)), Integer.valueOf((ltH.v(j) - ltH.v(j2)) - B)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 < B || ltH.v(j2) + intValue2 > ltH.v(j) - B) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            v = num2.intValue();
        }
        this.f4898R.J(ooe, new oOe(i3, v, i2 + i3, ltH.v(j2) + v));
        return cU5.v(i3, v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jHy)) {
            return false;
        }
        jHy jhy = (jHy) obj;
        long j = this.R;
        long j2 = jhy.R;
        int i = esE.R;
        return ((j > j2 ? 1 : (j == j2 ? 0 : -1)) == 0) && n3x.v(this.f4899R, jhy.f4899R) && n3x.v(this.f4898R, jhy.f4898R);
    }

    public final int hashCode() {
        long j = this.R;
        int i = esE.R;
        int hashCode = this.f4899R.hashCode();
        return this.f4898R.hashCode() + ((hashCode + (Long.hashCode(j) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("DropdownMenuPositionProvider(contentOffset=");
        U.append((Object) esE.c(this.R));
        U.append(", density=");
        U.append(this.f4899R);
        U.append(", onPositionCalculated=");
        U.append(this.f4898R);
        U.append(')');
        return U.toString();
    }
}
