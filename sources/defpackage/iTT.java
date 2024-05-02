package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: iTT  reason: default package */
/* loaded from: classes.dex */
public final class iTT {
    public final int L;
    public final int O;
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f4606R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f4607R;

    /* renamed from: R  reason: collision with other field name */
    public final List f4608R;

    /* renamed from: R  reason: collision with other field name */
    public final ky f4609R;

    /* renamed from: R  reason: collision with other field name */
    public final mdz f4610R;

    /* renamed from: R  reason: collision with other field name */
    public final osg f4611R;

    /* renamed from: R  reason: collision with other field name */
    public final vV f4612R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4613R;
    public final int X;
    public final int c;
    public final int e;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f4614v;

    public iTT(int i, List list, boolean z, vV vVVar, ky kyVar, mdz mdz, boolean z2, int i2, int i3, osg osg, int i4, long j, Object obj) {
        this.R = i;
        this.f4608R = list;
        this.f4613R = z;
        this.f4612R = vVVar;
        this.f4609R = kyVar;
        this.f4610R = mdz;
        this.f4614v = z2;
        this.v = i2;
        this.c = i3;
        this.f4611R = osg;
        this.e = i4;
        this.f4606R = j;
        this.f4607R = obj;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            l0f l0f = (l0f) list.get(i8);
            boolean z3 = this.f4613R;
            i6 += z3 ? l0f.X : l0f.e;
            i7 = Math.max(i7, !z3 ? l0f.X : l0f.e);
        }
        this.X = i6;
        int i9 = i6 + this.e;
        this.O = i9 >= 0 ? i9 : i5;
        this.L = i7;
    }

    public final iFC R(int i, int i2, int i3) {
        long j;
        ArrayList arrayList = new ArrayList();
        int i4 = this.f4613R ? i3 : i2;
        boolean z = this.f4614v;
        int i5 = z ? (i4 - i) - this.X : i;
        int i6 = z ? pdD.i(this.f4608R) : 0;
        while (true) {
            if (!this.f4614v ? i6 < this.f4608R.size() : i6 >= 0) {
                l0f l0f = (l0f) this.f4608R.get(i6);
                int size = this.f4614v ? 0 : arrayList.size();
                if (this.f4613R) {
                    vV vVVar = this.f4612R;
                    if (vVVar != null) {
                        j = cU5.v(vVVar.R(l0f.e, i2, this.f4610R), i5);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    ky kyVar = this.f4609R;
                    if (kyVar != null) {
                        j = cU5.v(i5, kyVar.R(l0f.X, i3));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                i5 += this.f4613R ? l0f.X : l0f.e;
                arrayList.add(size, new bpq(j, l0f, ((l0f) this.f4608R.get(i6)).R()));
                i6 = this.f4614v ? i6 - 1 : i6 + 1;
            } else {
                int i7 = this.R;
                Object obj = this.f4607R;
                int i8 = this.X;
                int i9 = this.O;
                boolean z2 = this.f4614v;
                return new iFC(i, i7, obj, i8, i9, -(!z2 ? this.v : this.c), i4 + (!z2 ? this.c : this.v), this.f4613R, arrayList, this.f4611R, this.f4606R);
            }
        }
    }
}
