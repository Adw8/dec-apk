package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: osg  reason: default package */
/* loaded from: classes.dex */
public final class osg {

    /* renamed from: R  reason: collision with other field name */
    public final jy_ f6993R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6994R;
    public int e;
    public int v;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f6990R = new LinkedHashMap();

    /* renamed from: R  reason: collision with other field name */
    public Map f6992R = iia.R;
    public int R = -1;
    public int c = -1;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f6991R = new LinkedHashSet();

    public osg(jy_ jy_, boolean z) {
        this.f6993R = jy_;
        this.f6994R = z;
    }

    public static int v(int i, int i2, ArrayList arrayList) {
        if (!arrayList.isEmpty() && i >= ((iFC) dF.b(arrayList)).v && i <= ((iFC) dF.zw(arrayList)).v) {
            if (i - ((iFC) dF.b(arrayList)).v >= ((iFC) dF.zw(arrayList)).v - i) {
                for (int i3 = pdD.i(arrayList); -1 < i3; i3--) {
                    iFC ifc = (iFC) arrayList.get(i3);
                    int i4 = ifc.v;
                    if (i4 == i) {
                        return ifc.e;
                    }
                    if (i4 < i) {
                        break;
                    }
                }
            } else {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    iFC ifc2 = (iFC) arrayList.get(i5);
                    int i6 = ifc2.v;
                    if (i6 == i) {
                        return ifc2.e;
                    }
                    if (i6 > i) {
                        break;
                    }
                }
            }
        }
        return i2;
    }

    public final int R(int i, int i2, int i3, long j, boolean z, int i4, int i5, ArrayList arrayList) {
        int i6 = this.c;
        int i7 = 0;
        boolean z2 = z ? i6 > i : i6 < i;
        int i8 = this.R;
        boolean z3 = z ? i8 < i : i8 > i;
        if (z2) {
            heu V = !z ? caw.V(i6 + 1, i) : caw.V(i + 1, i6);
            int i9 = V.e;
            int i10 = V.X;
            if (i9 <= i10) {
                while (true) {
                    i7 += v(i9, i3, arrayList);
                    if (i9 == i10) {
                        break;
                    }
                    i9++;
                }
            }
            return c(j) + i4 + this.e + i7;
        } else if (!z3) {
            return i5;
        } else {
            heu V2 = !z ? caw.V(i + 1, i8) : caw.V(i8 + 1, i);
            int i11 = V2.e;
            int i12 = V2.X;
            if (i11 <= i12) {
                while (true) {
                    i2 += v(i11, i3, arrayList);
                    if (i11 == i12) {
                        break;
                    }
                    i11++;
                }
            }
            return c(j) + (this.v - i2);
        }
    }

    public final int c(long j) {
        if (this.f6994R) {
            return dU5.v(j);
        }
        int i = dU5.R;
        return (int) (j >> 32);
    }

    public final void e(iFC ifc, a4T a4t) {
        while (a4t.f726R.size() > ifc.f4514R.size()) {
            s3.f(a4t.f726R);
        }
        while (a4t.f726R.size() < ifc.f4514R.size()) {
            int size = a4t.f726R.size();
            long c = ifc.c(size);
            ArrayList arrayList = a4t.f726R;
            long j = a4t.R;
            arrayList.add(new l5n(ifc.v(size), cU5.v(((int) (c >> 32)) - ((int) (j >> 32)), dU5.v(c) - dU5.v(j))));
        }
        ArrayList arrayList2 = a4t.f726R;
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            l5n l5n = (l5n) arrayList2.get(i);
            long j2 = l5n.f5580R;
            long j3 = a4t.R;
            long v = cU5.v(((int) (j2 >> 32)) + ((int) (j3 >> 32)), dU5.v(j3) + dU5.v(j2));
            long c2 = ifc.c(i);
            l5n.R = ifc.v(i);
            nKE R = ifc.R(i);
            if (!dU5.R(v, c2)) {
                long j4 = a4t.R;
                l5n.f5580R = cU5.v(((int) (c2 >> 32)) - ((int) (j4 >> 32)), dU5.v(c2) - dU5.v(j4));
                if (R != null) {
                    l5n.f5582R.R(Boolean.TRUE);
                    l6.z(this.f6993R, null, 0, new naV(l5n, R, null), 3);
                }
            }
        }
    }
}
