package defpackage;

import java.util.List;

/* renamed from: bQ7  reason: default package */
/* loaded from: classes.dex */
public final class bQ7 extends k8G implements kg9 {
    public final /* synthetic */ int L;

    /* renamed from: L  reason: collision with other field name */
    public final /* synthetic */ Object f1637L;
    public final /* synthetic */ int O;

    /* renamed from: O  reason: collision with other field name */
    public final /* synthetic */ Object f1638O;
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mZf f1639R;
    public final /* synthetic */ int X = 1;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ Object f1640X;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bQ7(int i, int i2, l0f l0f, l0f l0f2, l0f l0f3, l0f l0f4, l0f l0f5, l0f l0f6, l0f l0f7, lDS lds, mZf mzf) {
        super(1);
        this.O = i;
        this.L = i2;
        this.R = l0f;
        this.v = l0f2;
        this.c = l0f3;
        this.e = l0f4;
        this.f1640X = l0f5;
        this.f1638O = l0f6;
        this.f1637L = l0f7;
        this.Z = lds;
        this.f1639R = mzf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: jkN */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [int[], java.io.Serializable] */
    public final void R(h57 h57) {
        l0f l0f;
        int i;
        switch (this.X) {
            case 0:
                cEt cet = cEt.Horizontal;
                int size = ((List) this.R).size();
                int[] iArr = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    l0f l0f2 = ((l0f[]) this.v)[i2];
                    iArr[i2] = ((cEt) this.f1640X) == cet ? l0f2.e : l0f2.X;
                }
                ((jkN) this.c).iE(Integer.valueOf(this.O), iArr, this.f1639R.getLayoutDirection(), this.f1639R, (int[]) this.e);
                l0f[] l0fArr = (l0f[]) this.v;
                oG1[] og1Arr = (oG1[]) this.f1638O;
                aH9 ah9 = (aH9) this.f1637L;
                int i3 = this.L;
                cEt cet2 = (cEt) this.f1640X;
                mZf mzf = this.f1639R;
                blo blo = (blo) this.Z;
                int[] iArr2 = (int[]) this.e;
                int length = l0fArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    l0f l0f3 = l0fArr[i4];
                    i5++;
                    oG1 og1 = og1Arr[i5];
                    aH9 ah92 = og1 != null ? og1.f6718R : null;
                    if (ah92 == null) {
                        ah92 = ah9;
                    }
                    if (cet2 == cet) {
                        l0fArr = l0fArr;
                        i = l0f3.X;
                    } else {
                        l0fArr = l0fArr;
                        i = l0f3.e;
                    }
                    int i6 = i3 - i;
                    mdz layoutDirection = cet2 == cet ? mdz.Ltr : mzf.getLayoutDirection();
                    int i7 = blo.e;
                    int i8 = ah92.i(i6, layoutDirection);
                    if (cet2 == cet) {
                        h57.v(h57, l0f3, iArr2[i5], i8);
                    } else {
                        h57.v(h57, l0f3, i8, iArr2[i5]);
                    }
                    i4++;
                    ah9 = ah9;
                    og1Arr = og1Arr;
                }
                return;
            default:
                int i9 = this.O;
                int i10 = this.L;
                l0f l0f4 = (l0f) this.R;
                l0f l0f5 = (l0f) this.v;
                l0f l0f6 = (l0f) this.c;
                l0f l0f7 = (l0f) this.e;
                l0f l0f8 = (l0f) this.f1640X;
                l0f l0f9 = (l0f) this.f1637L;
                lDS lds = (lDS) this.Z;
                float f = lds.R;
                boolean z = lds.f5616R;
                float D = this.f1639R.D();
                mdz layoutDirection2 = this.f1639R.getLayoutDirection();
                ngd ngd = ((lDS) this.Z).f5615R;
                float f2 = brj.R;
                long j = dU5.v;
                h57.getClass();
                float f3 = 0.0f;
                h57.c((l0f) this.f1638O, j, 0.0f);
                int e = i9 - c5p.e(l0f9);
                int t = mLz.t(ngd.v() * D);
                int t2 = mLz.t(aH9.K(ngd, layoutDirection2) * D);
                float f4 = c5p.v * D;
                if (l0f4 != null) {
                    h57.X(h57, l0f4, 0, dq.f2891v.R(l0f4.X, e));
                }
                if (l0f5 != null) {
                    h57.X(h57, l0f5, i10 - l0f5.e, dq.f2891v.R(l0f5.X, e));
                }
                if (l0f7 != null) {
                    float f5 = ((float) 1) - f;
                    float R = (((float) (z ? dq.f2891v.R(l0f7.X, e) : t)) * f5) - (((float) (l0f7.X / 2)) * f);
                    if (l0f4 != null) {
                        f3 = (((float) c5p.X(l0f4)) - f4) * f5;
                    }
                    h57.X(h57, l0f7, mLz.t(f3) + t2, mLz.t(R));
                }
                h57.X(h57, l0f6, c5p.X(l0f4), Math.max(z ? dq.f2891v.R(l0f6.X, e) : t, c5p.e(l0f7) / 2));
                if (l0f8 != null) {
                    if (z) {
                        l0f = l0f8;
                        t = dq.f2891v.R(l0f.X, e);
                    } else {
                        l0f = l0f8;
                    }
                    h57.X(h57, l0f, c5p.X(l0f4), t);
                }
                if (l0f9 != null) {
                    h57.X(h57, l0f9, 0, e);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                R((h57) obj);
                break;
            default:
                R((h57) obj);
                break;
        }
        return o8s.R;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bQ7(List list, l0f[] l0fArr, jkN jkn, int i, mZf mzf, int[] iArr, cEt cet, oG1[] og1Arr, aH9 ah9, int i2, blo blo) {
        super(1);
        this.R = list;
        this.v = l0fArr;
        this.c = jkn;
        this.O = i;
        this.f1639R = mzf;
        this.e = iArr;
        this.f1640X = cet;
        this.f1638O = og1Arr;
        this.f1637L = ah9;
        this.L = i2;
        this.Z = blo;
    }
}
