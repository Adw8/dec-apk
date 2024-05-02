package defpackage;

import java.util.List;

/* renamed from: jb4  reason: default package */
/* loaded from: classes.dex */
public final class jb4 extends k8G implements kg9 {
    public final /* synthetic */ dH9 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb4(dH9 dh9, int i) {
        super(1);
        this.X = i;
        this.R = dh9;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        String str;
        switch (this.X) {
            case 0:
                ((h7_) obj).c = ((Number) this.R.getValue()).floatValue();
                return o8s.R;
            case 1:
                ((kEW) ((bNL) obj)).c(nFs.R, new fBj(this.R, 0));
                return o8s.R;
            case 2:
                ((kg9) this.R.getValue()).x(Float.valueOf(((Number) obj).floatValue()));
                return o8s.R;
            case 3:
                return (Float) ((kg9) this.R.getValue()).x(Float.valueOf(((Number) obj).floatValue()));
            case 4:
                ((kg9) this.R.getValue()).x(new aWo(((aWo) obj).f906R));
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                dlc dlc = (dlc) obj;
                return new acE(6, this.R);
            case 6:
                List list = (List) this.R.getValue();
                ((mJR) obj).R(list.size(), null, new iCm(g5M.o, list, 1), aH9.u(new noW(3, list), true, -632812321));
                return o8s.R;
            default:
                int intValue = ((Number) obj).intValue();
                dH9 dh9 = this.R;
                float f = iqx.R;
                ihm ihm = (ihm) dF.q(intValue, (List) dh9.getValue());
                if (ihm == null || (str = ihm.f4698R) == null) {
                    return 0;
                }
                return str;
        }
    }
}
