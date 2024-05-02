package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: QG  reason: default package */
/* loaded from: classes.dex */
public final class QG extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f426R;
    public final /* synthetic */ int X = 1;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ Object f427X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public QG(ncu ncu, n76 n76, kJ kJVar, Lq lq, lf lfVar, lR3 lr3, int i, int i2) {
        super(2);
        this.R = ncu;
        this.v = n76;
        this.c = kJVar;
        this.e = lq;
        this.f427X = lfVar;
        this.f426R = lr3;
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
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        Integer num;
        switch (this.X) {
            case 0:
                dTl.e((ncu) this.R, (n76) this.v, (kJ) this.c, (Lq) this.e, (lf) this.f427X, this.f426R, m88, this.O | 1, this.L);
                return;
            case 1:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                aSv asv = new aSv((iUy) this.R, (c2J) this.v);
                this.f426R.y(new nhj(aH9.K(asv, ((c2J) this.v).f1948R), ((List) this.c).isEmpty() ? asv.v() : ((c2J) this.v).l(this.O), aH9.o(asv, ((c2J) this.v).f1948R), (((List) this.e).isEmpty() || (num = (Integer) this.f427X) == null) ? asv.R() : ((c2J) this.v).l(num.intValue())), m88, Integer.valueOf((this.L >> 3) & 112));
                return;
            default:
                hDC.v((String) this.R, (mpr) this.v, (iv7) this.c, this.f426R, (iv7) this.e, (lR3) this.f427X, m88, this.O | 1, this.L);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public QG(iUy iuy, c2J c2j, ArrayList arrayList, int i, ArrayList arrayList2, Integer num, lR3 lr3, int i2) {
        super(2);
        this.R = iuy;
        this.v = c2j;
        this.c = arrayList;
        this.O = i;
        this.e = arrayList2;
        this.f427X = num;
        this.f426R = lr3;
        this.L = i2;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public QG(String str, mpr mpr, iv7 iv7, lR3 lr3, iv7 iv72, lR3 lr32, int i, int i2) {
        super(2);
        this.R = str;
        this.v = mpr;
        this.c = iv7;
        this.f426R = lr3;
        this.e = iv72;
        this.f427X = lr32;
        this.O = i;
        this.L = i2;
    }
}
