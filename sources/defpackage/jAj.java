package defpackage;

import java.util.ArrayList;

/* renamed from: jAj  reason: default package */
/* loaded from: classes.dex */
public final class jAj extends k8G implements f_c {
    public final /* synthetic */ oq3 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jAj(oq3 oq3, int i) {
        super(0);
        this.X = i;
        this.R = oq3;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0042 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:39:0x008c */
    public final Float R() {
        l9J l9j;
        l9J l9j2;
        int i = 1;
        float f = 0.0f;
        Object obj = null;
        switch (this.X) {
            case 0:
                ArrayList arrayList = this.R.f6969R;
                if (!arrayList.isEmpty()) {
                    Object obj2 = arrayList.get(0);
                    float R = ((bGA) obj2).f1584R.R();
                    int i2 = pdD.i(arrayList);
                    Object obj3 = obj2;
                    if (1 <= i2) {
                        while (true) {
                            Object obj4 = arrayList.get(i);
                            float R2 = ((bGA) obj4).f1584R.R();
                            obj2 = obj3;
                            if (Float.compare(R, R2) < 0) {
                                obj2 = obj4;
                                R = R2;
                            }
                            if (i != i2) {
                                i++;
                                obj3 = obj2;
                            }
                        }
                    }
                    obj = obj2;
                }
                bGA bga = (bGA) obj;
                if (!(bga == null || (l9j2 = bga.f1584R) == null)) {
                    f = l9j2.R();
                }
                return Float.valueOf(f);
            default:
                ArrayList arrayList2 = this.R.f6969R;
                if (!arrayList2.isEmpty()) {
                    Object obj5 = arrayList2.get(0);
                    float v = ((bGA) obj5).f1584R.v();
                    int i3 = pdD.i(arrayList2);
                    Object obj6 = obj5;
                    if (1 <= i3) {
                        while (true) {
                            Object obj7 = arrayList2.get(i);
                            float v2 = ((bGA) obj7).f1584R.v();
                            obj5 = obj6;
                            if (Float.compare(v, v2) < 0) {
                                obj5 = obj7;
                                v = v2;
                            }
                            if (i != i3) {
                                i++;
                                obj6 = obj5;
                            }
                        }
                    }
                    obj = obj5;
                }
                bGA bga2 = (bGA) obj;
                if (!(bga2 == null || (l9j = bga2.f1584R) == null)) {
                    f = l9j.v();
                }
                return Float.valueOf(f);
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                return R();
            default:
                return R();
        }
    }
}
