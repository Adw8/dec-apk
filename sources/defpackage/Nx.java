package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Nx  reason: default package */
/* loaded from: classes.dex */
public final class Nx implements bF9 {
    public final /* synthetic */ int R = 1;

    /* renamed from: R  reason: collision with other field name */
    public final Object f323R;

    public Nx(jyH jyh) {
        this.f323R = jyh;
    }

    @Override // defpackage.bF9
    public final int R(poS pos, List list, int i) {
        switch (this.R) {
            case 0:
                Integer num = (Integer) iOY.F(iOY.a(dF.a(list), new aV(i, 2)));
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            default:
                return ltH.v(((jyH) this.f323R).f5166R.f3120R.R(dtx.R(0, i, 0, Integer.MAX_VALUE), pos.f7272R.f3603R, null).f4589R);
        }
    }

    @Override // defpackage.bF9
    public final int X(poS pos, List list, int i) {
        switch (this.R) {
            case 0:
                Integer num = (Integer) iOY.F(iOY.a(dF.a(list), new aV(i, 3)));
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            default:
                ((jyH) this.f323R).f5166R.f3120R.v(pos.f7272R.f3603R);
                oq3 oq3 = ((jyH) this.f323R).f5166R.f3120R.f2514R;
                if (oq3 != null) {
                    return msU.V(oq3.v());
                }
                throw new IllegalStateException("layoutIntrinsics must be called first");
        }
    }

    @Override // defpackage.bF9
    public final int c(poS pos, List list, int i) {
        switch (this.R) {
            case 0:
                Integer num = (Integer) iOY.F(iOY.a(dF.a(list), new aV(i, 1)));
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            default:
                ((jyH) this.f323R).f5166R.f3120R.v(pos.f7272R.f3603R);
                oq3 oq3 = ((jyH) this.f323R).f5166R.f3120R.f2514R;
                if (oq3 != null) {
                    return msU.V(oq3.R());
                }
                throw new IllegalStateException("layoutIntrinsics must be called first");
        }
    }

    @Override // defpackage.bF9
    public final int e(poS pos, List list, int i) {
        switch (this.R) {
            case 0:
                Integer num = (Integer) iOY.F(iOY.a(dF.a(list), new aV(i, 0)));
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            default:
                return ltH.v(((jyH) this.f323R).f5166R.f3120R.R(dtx.R(0, i, 0, Integer.MAX_VALUE), pos.f7272R.f3603R, null).f4589R);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x008b */
    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        Object obj;
        Object obj2 = null;
        int i = 1;
        switch (this.R) {
            case 0:
                ArrayList arrayList = new ArrayList(a6.B(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pc0) it.next()).L(j));
                }
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i2 = ((l0f) obj).e;
                    int i3 = pdD.i(arrayList);
                    if (1 <= i3) {
                        int i4 = 1;
                        while (true) {
                            i4++;
                            Object obj3 = arrayList.get(i4);
                            int i5 = ((l0f) obj3).e;
                            if (i2 < i5) {
                                obj = obj3;
                                i2 = i5;
                            }
                            if (i4 == i3) {
                            }
                        }
                    }
                }
                l0f l0f = (l0f) obj;
                int i6 = l0f == null ? 0 : l0f.e;
                if (!arrayList.isEmpty()) {
                    Object obj4 = arrayList.get(0);
                    int i7 = ((l0f) obj4).X;
                    int i8 = pdD.i(arrayList);
                    Object obj5 = obj4;
                    if (1 <= i8) {
                        while (true) {
                            i++;
                            Object obj6 = arrayList.get(i);
                            int i9 = ((l0f) obj6).X;
                            obj4 = obj5;
                            if (i7 < i9) {
                                obj4 = obj6;
                                i7 = i9;
                            }
                            if (i != i8) {
                                obj5 = obj4;
                            }
                        }
                    }
                    obj2 = obj4;
                }
                l0f l0f2 = (l0f) obj2;
                int i10 = l0f2 == null ? 0 : l0f2.X;
                ((w0) this.f323R).R.R(new ltH(iTI.R(i6, i10)));
                return mzf.f(i6, i10, iia.R, new Cp(0, arrayList));
            default:
                eUu euu = ((jyH) this.f323R).f5166R;
                iRR irr = euu.f3122R;
                iRR R = euu.f3120R.R(j, mzf.getLayoutDirection(), irr);
                if (!n3x.v(irr, R)) {
                    ((jyH) this.f323R).f5166R.f3123R.x(R);
                    if (irr != null) {
                        jyH jyh = (jyH) this.f323R;
                        if (!n3x.v(irr.f4590R.f4165R, R.f4590R.f4165R)) {
                            jyh.getClass();
                        }
                    }
                }
                eUu euu2 = ((jyH) this.f323R).f5166R;
                euu2.f3124R.R(o8s.R);
                euu2.f3122R = R;
                if (list.size() >= R.f4591R.size()) {
                    ArrayList arrayList2 = R.f4591R;
                    ArrayList arrayList3 = new ArrayList(arrayList2.size());
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        gIA gia = (gIA) arrayList2.get(i11);
                        kSh ksh = gia != null ? new kSh(((pc0) list.get(i11)).L(dtx.c((int) ((float) Math.floor((double) (gia.c - gia.f3720R))), (int) ((float) Math.floor((double) (gia.e - gia.v))), 5)), new dU5(cU5.v(mLz.t(gia.f3720R), mLz.t(gia.v)))) : null;
                        if (ksh != null) {
                            arrayList3.add(ksh);
                        }
                    }
                    long j2 = R.f4589R;
                    return mzf.f((int) (j2 >> 32), ltH.v(j2), mHQ.J(new kSh(Qv.R, Integer.valueOf(mLz.t(R.R))), new kSh(Qv.v, Integer.valueOf(mLz.t(R.v)))), new Cp(2, arrayList3));
                }
                throw new IllegalStateException("Check failed.".toString());
        }
    }

    public Nx(w0 w0Var) {
        this.f323R = w0Var;
    }
}
