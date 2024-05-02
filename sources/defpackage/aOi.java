package defpackage;

import java.util.HashMap;

/* renamed from: aOi  reason: default package */
/* loaded from: classes.dex */
public final class aOi extends k8G implements kg9 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X = 2;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aOi(int i, int i2, HashMap hashMap) {
        super(1);
        this.O = i;
        this.L = i2;
        this.R = hashMap;
    }

    public final void R(h57 h57) {
        switch (this.X) {
            case 0:
                h57.v(h57, (l0f) this.R, this.O, this.L);
                return;
            default:
                h57.v(h57, (l0f) this.R, mLz.t(((float) (this.O - ((l0f) this.R).e)) / 2.0f), mLz.t(((float) (this.L - ((l0f) this.R).X)) / 2.0f));
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        int max;
        int min;
        switch (this.X) {
            case 0:
                R((h57) obj);
                break;
            case 1:
                R((h57) obj);
                break;
            default:
                jt1 jt1 = (jt1) obj;
                kg9 kg9 = ((ipI) jt1.f5095R).f4737R;
                if (kg9 != null && (max = Math.max(this.O, jt1.R)) <= (min = Math.min(this.L, (jt1.R + jt1.v) - 1))) {
                    while (true) {
                        ((HashMap) this.R).put(kg9.x(Integer.valueOf(max - jt1.R)), Integer.valueOf(max));
                        if (max != min) {
                            max++;
                        }
                    }
                }
                return o8s.R;
        }
        return o8s.R;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aOi(int i, l0f l0f, int i2) {
        super(1);
        this.O = i;
        this.R = l0f;
        this.L = i2;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aOi(l0f l0f, int i, int i2) {
        super(1);
        this.R = l0f;
        this.O = i;
        this.L = i2;
    }
}
