package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: iFC  reason: default package */
/* loaded from: classes.dex */
public final class iFC {
    public final int O;
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f4512R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f4513R;

    /* renamed from: R  reason: collision with other field name */
    public final List f4514R;

    /* renamed from: R  reason: collision with other field name */
    public final osg f4515R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4516R;
    public final int X;
    public final int c;
    public final int e;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f4517v;

    public iFC(int i, int i2, Object obj, int i3, int i4, int i5, int i6, boolean z, ArrayList arrayList, osg osg, long j) {
        this.R = i;
        this.v = i2;
        this.f4513R = obj;
        this.c = i3;
        this.e = i4;
        this.X = i5;
        this.O = i6;
        this.f4516R = z;
        this.f4514R = arrayList;
        this.f4515R = osg;
        this.f4512R = j;
        int size = arrayList.size();
        boolean z2 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            } else if (R(i7) != null) {
                z2 = true;
                break;
            } else {
                i7++;
            }
        }
        this.f4517v = z2;
    }

    public final nKE R(int i) {
        Object obj = ((bpq) this.f4514R.get(i)).f1817R;
        if (obj instanceof nKE) {
            return (nKE) obj;
        }
        return null;
    }

    public final long c(int i) {
        return ((bpq) this.f4514R.get(i)).R;
    }

    public final void e(h57 h57) {
        long j;
        int i;
        int size = this.f4514R.size();
        iFC ifc = this;
        for (int i2 = 0; i2 < size; i2 = i + 1) {
            l0f l0f = ((bpq) ifc.f4514R.get(i2)).f1818R;
            int i3 = ifc.X - (ifc.f4516R ? l0f.X : l0f.e);
            int i4 = ifc.O;
            if (ifc.R(i2) != null) {
                osg osg = ifc.f4515R;
                Object obj = ifc.f4513R;
                j = ifc.c(i2);
                a4T a4t = (a4T) osg.f6990R.get(obj);
                if (a4t == null) {
                    size = size;
                    i = i2;
                } else {
                    l5n l5n = (l5n) a4t.f726R.get(i2);
                    long j2 = ((dU5) l5n.f5581R.c()).f2628R;
                    long j3 = a4t.R;
                    i = i2;
                    j = cU5.v(((int) (j2 >> 32)) + ((int) (j3 >> 32)), dU5.v(j3) + dU5.v(j2));
                    long j4 = l5n.f5580R;
                    long j5 = a4t.R;
                    size = size;
                    long v = cU5.v(((int) (j4 >> 32)) + ((int) (j5 >> 32)), dU5.v(j5) + dU5.v(j4));
                    if (((Boolean) l5n.f5582R.getValue()).booleanValue() && ((osg.c(v) < i3 && osg.c(j) < i3) || (osg.c(v) > i4 && osg.c(j) > i4))) {
                        l6.z(osg.f6993R, null, 0, new oqk(l5n, null), 3);
                        ifc = this;
                    }
                }
                ifc = this;
            } else {
                size = size;
                i = i2;
                j = ifc.c(i);
            }
            if (ifc.f4516R) {
                long j6 = ifc.f4512R;
                h57.m(h57, l0f, cU5.v(((int) (j >> 32)) + ((int) (j6 >> 32)), dU5.v(j6) + dU5.v(j)));
            } else {
                long j7 = ifc.f4512R;
                long v2 = cU5.v(((int) (j >> 32)) + ((int) (j7 >> 32)), dU5.v(j7) + dU5.v(j));
                int i5 = aQy.R;
                nqF nqf = nqF.V;
                ((gHI) h57).getClass();
                if (h57.f4042R == mdz.Ltr || h57.R(h57) == 0) {
                    long yf = l0f.yf();
                    l0f.KZ(cU5.v(((int) (v2 >> 32)) + ((int) (yf >> 32)), dU5.v(yf) + dU5.v(v2)), 0.0f, nqf);
                } else {
                    long v3 = cU5.v((h57.R(h57) - l0f.e) - ((int) (v2 >> 32)), dU5.v(v2));
                    long yf2 = l0f.yf();
                    l0f.KZ(cU5.v(((int) (v3 >> 32)) + ((int) (yf2 >> 32)), dU5.v(yf2) + dU5.v(v3)), 0.0f, nqf);
                }
            }
        }
    }

    public final int v(int i) {
        l0f l0f = ((bpq) this.f4514R.get(i)).f1818R;
        return this.f4516R ? l0f.X : l0f.e;
    }
}
