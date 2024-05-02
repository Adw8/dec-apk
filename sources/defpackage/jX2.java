package defpackage;

/* renamed from: jX2  reason: default package */
/* loaded from: classes.dex */
public final class jX2 extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ aAC R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f4948R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f4949R;
    public final /* synthetic */ int X = 0;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jX2(int i, String str, String str2, f_c f_c, f_c f_c2, int i2, int i3) {
        super(2);
        this.O = i;
        this.f4949R = str;
        this.f4948R = str2;
        this.v = f_c;
        this.R = f_c2;
        this.L = i2;
        this.Z = i3;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
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
                cpc.g(this.O, this.f4949R, (String) this.f4948R, (f_c) this.v, (f_c) this.R, m88, this.L | 1, this.Z);
                return;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                float intValue = (float) ((Number) ((h0T) this.f4948R).getValue()).intValue();
                h0T h0t = (h0T) this.f4948R;
                kun kun = (kun) this.v;
                String str = this.f4949R;
                kg9 kg9 = (kg9) this.R;
                Object[] objArr = {h0t, kun, str, kg9};
                jr_ jr_2 = (jr_) m88;
                jr_2.w(-568225417);
                boolean z = false;
                for (int i2 = 0; i2 < 4; i2++) {
                    z |= jr_2.O(objArr[i2]);
                }
                Object I = jr_2.I();
                if (z || I == ppN.R) {
                    I = new aB7(kun, str, kg9, h0t, 1);
                    jr_2.ZW(I);
                }
                jr_2.g(false);
                kg9 kg92 = (kg9) I;
                int i3 = this.O;
                int i4 = this.L;
                dZT.v(intValue, kg92, null, false, new p6((float) i3, (float) i4), Math.max(((i4 - i3) / this.Z) - 1, 1), null, null, null, jr_2, 0, 460);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jX2(h0T h0t, kun kun, String str, kg9 kg9, int i, int i2, int i3) {
        super(2);
        this.f4948R = h0t;
        this.v = kun;
        this.f4949R = str;
        this.R = kg9;
        this.O = i;
        this.L = i2;
        this.Z = i3;
    }
}
