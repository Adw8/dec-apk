package defpackage;

import java.util.ArrayList;

/* renamed from: bgC  reason: default package */
/* loaded from: classes.dex */
public final class bgC extends k8G implements lR3 {
    public final /* synthetic */ int O;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bgC(int i, int i2) {
        super(3);
        this.X = i2;
        this.O = i;
    }

    public final void R(Su su, mdh mdh, h1W h1w) {
        WB wb;
        switch (this.X) {
            case 0:
                mdh.R(this.O);
                return;
            case 1:
                int i = this.O;
                for (int i2 = 0; i2 < i; i2++) {
                    su.e();
                }
                return;
            default:
                int i3 = this.O;
                if (!(mdh.m == 0)) {
                    vC.e("Cannot move a group while inserting".toString());
                    throw null;
                } else if (!(i3 >= 0)) {
                    vC.e("Parameter offset is out of bounds".toString());
                    throw null;
                } else if (i3 != 0) {
                    int i4 = mdh.H;
                    int i5 = mdh.U;
                    int i6 = mdh.c;
                    int i7 = i4;
                    while (i3 > 0) {
                        i7 += l6.e(mdh.f6092R, mdh.N(i7));
                        if (i7 <= i6) {
                            i3--;
                        } else {
                            vC.e("Parameter offset is out of bounds".toString());
                            throw null;
                        }
                    }
                    int e = l6.e(mdh.f6092R, mdh.N(i7));
                    int i8 = mdh.e;
                    int L = mdh.L(mdh.f6092R, mdh.N(i7));
                    int i9 = i7 + e;
                    int L2 = mdh.L(mdh.f6092R, mdh.N(i9));
                    int i10 = L2 - L;
                    mdh.y(i10, Math.max(mdh.H - 1, 0));
                    mdh.g(e);
                    int[] iArr = mdh.f6092R;
                    int N = mdh.N(i9) * 5;
                    System.arraycopy(iArr, N, iArr, mdh.N(i4) * 5, ((e * 5) + N) - N);
                    if (i10 > 0) {
                        Object[] objArr = mdh.f6093R;
                        int Z = mdh.Z(L + i10);
                        System.arraycopy(objArr, Z, objArr, i8, mdh.Z(L2 + i10) - Z);
                    }
                    int i11 = L + i10;
                    int i12 = i11 - i8;
                    int i13 = mdh.O;
                    int i14 = mdh.L;
                    int length = mdh.f6093R.length;
                    int i15 = mdh.Z;
                    int i16 = i4 + e;
                    int i17 = i4;
                    while (i17 < i16) {
                        int N2 = mdh.N(i17);
                        int L3 = mdh.L(iArr, N2) - i12;
                        if (L3 > (i15 < N2 ? 0 : i13)) {
                            L3 = -(((length - i14) - L3) + 1);
                        }
                        int i18 = mdh.O;
                        int i19 = mdh.L;
                        int length2 = mdh.f6093R.length;
                        if (L3 > i18) {
                            L3 = -(((length2 - i19) - L3) + 1);
                        }
                        iArr[(N2 * 5) + 4] = L3;
                        i17++;
                        i12 = i12;
                        i16 = i16;
                        i13 = i13;
                        i14 = i14;
                    }
                    int i20 = e + i9;
                    int C = mdh.C();
                    int L4 = l6.L(mdh.f6087R, i9, C);
                    ArrayList arrayList = new ArrayList();
                    if (L4 >= 0) {
                        while (L4 < mdh.f6087R.size() && (r12 = mdh.c((wb = (WB) mdh.f6087R.get(L4)))) >= i9 && r12 < i20) {
                            arrayList.add(wb);
                            mdh.f6087R.remove(L4);
                        }
                    }
                    int i21 = i4 - i9;
                    int size = arrayList.size();
                    for (int i22 = 0; i22 < size; i22++) {
                        WB wb2 = (WB) arrayList.get(i22);
                        int c = mdh.c(wb2) + i21;
                        if (c >= mdh.R) {
                            wb2.R = -(C - c);
                        } else {
                            wb2.R = c;
                        }
                        mdh.f6087R.add(l6.L(mdh.f6087R, c, C), wb2);
                    }
                    if (!mdh.n(i9, e)) {
                        mdh.U(i5, mdh.c, i4);
                        if (i10 > 0) {
                            mdh.Q(i11, i10, i9 - 1);
                            return;
                        }
                        return;
                    }
                    vC.e("Unexpectedly removed anchors".toString());
                    throw null;
                } else {
                    return;
                }
        }
    }

    @Override // defpackage.lR3
    public final /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                R((Su) obj, (mdh) obj2, (h1W) obj3);
                break;
            case 1:
                R((Su) obj, (mdh) obj2, (h1W) obj3);
                break;
            default:
                R((Su) obj, (mdh) obj2, (h1W) obj3);
                break;
        }
        return o8s.R;
    }
}
