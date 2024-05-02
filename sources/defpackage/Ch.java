package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Ch  reason: default package */
/* loaded from: classes.dex */
public final class Ch extends k8G implements kg9 {
    public final /* synthetic */ int O;
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f72R;
    public final /* synthetic */ int X = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Ch(p6 p6Var, int i, float f, kg9 kg9, f_c f_c) {
        super(1);
        this.f72R = p6Var;
        this.O = i;
        this.R = f;
        this.v = kg9;
        this.c = f_c;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        int i;
        boolean z = false;
        switch (this.X) {
            case 0:
                h57 h57 = (h57) obj;
                mZf mzf = (mZf) this.c;
                float f = this.R;
                int i2 = this.O;
                List list = (List) this.v;
                int i3 = 0;
                for (Object obj2 : (List) this.f72R) {
                    i3++;
                    if (i3 >= 0) {
                        List list2 = (List) obj2;
                        int size = list2.size();
                        int[] iArr = new int[size];
                        int i4 = 0;
                        while (i4 < size) {
                            iArr[i4] = ((l0f) list2.get(i4)).e + (i4 < pdD.i(list2) ? mzf.B(f) : 0);
                            i4++;
                        }
                        zW zWVar = nA.f6332v;
                        int[] iArr2 = new int[size];
                        for (int i5 = 0; i5 < size; i5++) {
                            iArr2[i5] = 0;
                        }
                        zWVar.c(mzf, i2, iArr, iArr2);
                        int i6 = 0;
                        for (Object obj3 : list2) {
                            i6++;
                            if (i6 >= 0) {
                                h57.v(h57, (l0f) obj3, iArr2[i6], ((Number) list.get(i3)).intValue());
                            } else {
                                pdD.k();
                                throw null;
                            }
                        }
                    } else {
                        pdD.k();
                        throw null;
                    }
                }
                return o8s.R;
            default:
                float m = caw.m(((Number) obj).floatValue(), ((Number) ((p6) this.f72R).v()).floatValue(), ((Number) ((p6) this.f72R).R()).floatValue());
                int i7 = this.O;
                if (i7 > 0 && (i = i7 + 1) >= 0) {
                    float f2 = m;
                    float f3 = f2;
                    int i8 = 0;
                    while (true) {
                        float z2 = hDC.z(((Number) ((p6) this.f72R).v()).floatValue(), ((Number) ((p6) this.f72R).R()).floatValue(), ((float) i8) / ((float) (this.O + 1)));
                        float f4 = z2 - m;
                        if (Math.abs(f4) <= f2) {
                            f2 = Math.abs(f4);
                            f3 = z2;
                        }
                        if (i8 != i) {
                            i8++;
                        } else {
                            m = f3;
                        }
                    }
                }
                if (!(m == this.R)) {
                    ((kg9) this.v).x(Float.valueOf(m));
                    f_c f_c = (f_c) this.c;
                    if (f_c != null) {
                        f_c.g();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Ch(ArrayList arrayList, mZf mzf, float f, int i, ArrayList arrayList2) {
        super(1);
        this.f72R = arrayList;
        this.c = mzf;
        this.R = f;
        this.O = i;
        this.v = arrayList2;
    }
}
