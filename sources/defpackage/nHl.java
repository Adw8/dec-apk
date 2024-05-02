package defpackage;

import java.util.List;

/* renamed from: nHl  reason: default package */
/* loaded from: classes.dex */
public final class nHl extends k8G implements f_c {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public nHl(Number number, ija ija, Number number2, buZ buz) {
        super(0);
        this.X = 0;
        this.R = number;
        this.c = ija;
        this.v = number2;
        this.e = buz;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                if (!n3x.v(this.R, ((ija) this.c).f4701R) || !n3x.v(this.v, ((ija) this.c).v)) {
                    ija ija = (ija) this.c;
                    Object obj = this.R;
                    Object obj2 = this.v;
                    buZ buz = (buZ) this.e;
                    ija.f4701R = obj;
                    ija.v = obj2;
                    ija.f4700R = buz;
                    ija.f4699R = new hgI(buz, ija.f4703R, obj, obj2);
                    ija.f4702R.f5315R.R(Boolean.TRUE);
                    ija.f4705R = false;
                    ija.f4706v = true;
                    return;
                }
                return;
            case 1:
                ((gv2) this.R).m((f_c) this.v, (mdz) this.e);
                return;
            case 2:
                jr_ jr_ = (jr_) this.R;
                List list = (List) this.v;
                ilY ily = (ilY) this.c;
                p4d p4d = (p4d) this.e;
                List list2 = jr_.f5061R;
                try {
                    jr_.f5061R = list;
                    ilY ily2 = jr_.f5058R;
                    int[] iArr = jr_.f5068R;
                    jr_.f5068R = null;
                    jr_.f5058R = ily;
                    p4d.getClass();
                    p4d.getClass();
                    p4d.getClass();
                    jr_.v(jr_, null, null);
                    jr_.f5058R = ily2;
                    jr_.f5068R = iArr;
                    return;
                } finally {
                    jr_.f5061R = list2;
                }
            case 3:
                ((hfa) this.R).Z((f_c) this.v, (gRa) this.c, (mdz) this.e);
                return;
            default:
                h0T h0t = (h0T) this.e;
                h0t.R(Boolean.valueOf(true ^ biy.O(h0t)));
                ((kun) this.R).f5478R.edit().putBoolean((String) this.v, biy.O((h0T) this.e)).apply();
                kg9 kg9 = (kg9) this.c;
                if (kg9 != null) {
                    kg9.x(Boolean.valueOf(biy.O((h0T) this.e)));
                    return;
                }
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            case 1:
                R();
                break;
            case 2:
                R();
                break;
            case 3:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nHl(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.X = i;
        this.R = obj;
        this.v = obj2;
        this.c = obj3;
        this.e = obj4;
    }
}
