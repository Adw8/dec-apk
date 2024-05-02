package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: e25  reason: default package */
/* loaded from: classes.dex */
public final class e25 extends k8G implements kg9 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ Object f2942X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e25(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(1);
        this.X = i;
        this.R = obj;
        this.v = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f2942X = obj5;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        List list;
        iRR irr;
        boolean z = true;
        switch (this.X) {
            case 0:
                ohT oht = (ohT) obj;
                jDh jdh = (jDh) oht;
                jdh.v();
                float m = caw.m(((Number) ((_6) this.R).c()).floatValue(), 0.0f, 1.0f);
                if (m != 0.0f) {
                    z = false;
                }
                if (!z) {
                    long j = ((d5M) this.c).R;
                    int i = odN.R;
                    int Z = ((c71) this.v).Z((int) (j >> 32));
                    mjp c = ((kY5) this.e).c();
                    gIA gia = (c == null || (irr = c.f6140R) == null) ? new gIA(0.0f, 0.0f, 0.0f, 0.0f) : irr.c(Z);
                    float mZ = jdh.mZ(pk5.R);
                    float f = mZ / ((float) 2);
                    float f2 = gia.f3720R + f;
                    float e = nqW.e(jdh.c()) - f;
                    if (f2 > e) {
                        f2 = e;
                    }
                    fiv.WD(oht, (a1) this.f2942X, aH9.N(f2, gia.v), aH9.N(f2, gia.e), mZ, m, 432);
                }
                return o8s.R;
            case 1:
                fiv fiv = (fiv) obj;
                boolean z2 = fiv.getLayoutDirection() == mdz.Rtl;
                long N = aH9.N(0.0f, aWo.X(fiv.u()));
                long N2 = aH9.N(nqW.e(fiv.c()), aWo.X(fiv.u()));
                long j2 = z2 ? N2 : N;
                if (z2) {
                    N2 = N;
                }
                float mZ2 = fiv.mZ(dZT.e);
                float mZ3 = fiv.mZ(dZT.X);
                fiv.U(fiv, ((n3) ((dH9) this.R).getValue()).f6279R, j2, N2, mZ3);
                fiv.U(fiv, ((n3) ((dH9) this.c).getValue()).f6279R, aH9.N(((aWo.e(N2) - aWo.e(j2)) * 0.0f) + aWo.e(j2), aWo.X(fiv.u())), aH9.N((((cY9) this.v).R() * (aWo.e(N2) - aWo.e(j2))) + aWo.e(j2), aWo.X(fiv.u())), mZ3);
                float[] fArr = (float[]) ((cY9) this.v).v.getValue();
                cY9 cy9 = (cY9) this.v;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = fArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    float f3 = fArr[i2];
                    Boolean valueOf = Boolean.valueOf(f3 > cy9.R() || f3 < 0.0f);
                    Object obj2 = linkedHashMap.get(valueOf);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(valueOf, obj2);
                    }
                    ((List) obj2).add(Float.valueOf(f3));
                }
                r4 = (dH9) this.e;
                dH9 dh9 = (dH9) this.f2942X;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List<Number> list2 = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(a6.B(list2, 10));
                    for (Number number : list2) {
                        arrayList.add(new aWo(aH9.N(aWo.e(aH9.a(j2, N2, number.floatValue())), aWo.X(fiv.u()))));
                    }
                    if (booleanValue) {
                    }
                    long j3 = ((n3) dh9.getValue()).f6279R;
                    fiv.R.getClass();
                    fiv.a(arrayList, j3, mZ2, 1, 1.0f, null, clQ.R);
                    N2 = N2;
                }
                return o8s.R;
            case 2:
                dlc dlc = (dlc) obj;
                bkb bkb = (bkb) this.R;
                bkb.f1791R.addView(bkb, bkb.f1790R);
                ((bkb) this.R).H((f_c) this.v, (cvV) this.c, (String) this.e, (mdz) this.f2942X);
                return new acE(10, (bkb) this.R);
            default:
                j5B j5b = (j5B) obj;
                ((oJx) this.R).R = true;
                int indexOf = ((List) this.v).indexOf(j5b);
                if (indexOf != -1) {
                    int i3 = indexOf + 1;
                    list = ((List) this.v).subList(((blo) this.c).e, i3);
                    ((blo) this.c).e = i3;
                } else {
                    list = fcD.R;
                }
                ((mpr) this.e).R(j5b.f4822R, (Bundle) this.f2942X, j5b, list);
                return o8s.R;
        }
    }
}
