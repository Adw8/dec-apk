package defpackage;

import java.util.Arrays;

/* renamed from: fbD  reason: default package */
/* loaded from: classes.dex */
public final class fbD extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fbD(int i, String[] strArr, int i2) {
        super(2);
        this.X = 3;
        this.O = i;
        this.R = strArr;
        this.L = i2;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 1:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 2:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 3:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                ((fkT) this.R).X(this.O, m88, this.L | 1);
                return;
            case 1:
                ((hKF) this.R).X(this.O, m88, this.L | 1);
                return;
            case 2:
                ((g1m) this.R).X(this.O, m88, this.L | 1);
                return;
            case 3:
                int i2 = this.O;
                String[] strArr = (String[]) this.R;
                cpc.N(i2, (String[]) Arrays.copyOf(strArr, strArr.length), m88, this.L | 1);
                return;
            default:
                cpc.C((ncu) this.R, m88, this.O | 1, this.L);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fbD(Object obj, int i, int i2, int i3) {
        super(2);
        this.X = i3;
        this.R = obj;
        this.O = i;
        this.L = i2;
    }
}
