package defpackage;

import android.content.SharedPreferences;

/* renamed from: iW6  reason: default package */
/* loaded from: classes.dex */
public final class iW6 extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iW6(ncu ncu, String str, f_c f_c, int i, int i2) {
        super(2);
        this.X = 4;
        this.c = ncu;
        this.R = str;
        this.v = f_c;
        this.O = i;
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
            case 4:
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
                daH.R((f_c) this.v, (fDb) this.c, (iv7) this.R, m88, this.O | 1, this.L);
                return;
            case 1:
                aH9.g((n67) this.v, (ncu) this.c, (iv7) this.R, m88, this.O | 1, this.L);
                return;
            case 2:
                ooA.R((kg9) this.v, (ncu) this.c, (kg9) this.R, m88, this.O | 1, this.L);
                return;
            case 3:
                cU5.R((f_c) this.v, (gRa) this.c, (iv7) this.R, m88, this.O | 1, this.L);
                return;
            case 4:
                vd.v((ncu) this.c, (String) this.R, (f_c) this.v, m88, this.O | 1, this.L);
                return;
            default:
                biy.c((SharedPreferences) this.v, (ncu) this.c, (lR3) this.R, m88, this.O | 1, this.L);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iW6(Object obj, Object obj2, aAC aac, int i, int i2, int i3) {
        super(2);
        this.X = i3;
        this.v = obj;
        this.c = obj2;
        this.R = aac;
        this.O = i;
        this.L = i2;
    }
}
