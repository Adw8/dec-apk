package defpackage;

/* renamed from: aMQ  reason: default package */
/* loaded from: classes.dex */
public final class aMQ extends k8G implements iv7 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f857R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f858R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kun f859R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aMQ(h0T h0t, kun kun, String str, kg9 kg9) {
        super(2);
        this.R = h0t;
        this.f859R = kun;
        this.f857R = str;
        this.f858R = kg9;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        m88 m88 = (m88) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        boolean O = biy.O(this.R);
        h0T h0t = this.R;
        kun kun = this.f859R;
        String str = this.f857R;
        kg9 kg9 = this.f858R;
        Object[] objArr = {h0t, kun, str, kg9};
        jr_ jr_2 = (jr_) m88;
        jr_2.w(-568225417);
        boolean z = false;
        for (int i = 0; i < 4; i++) {
            z |= jr_2.O(objArr[i]);
        }
        Object I = jr_2.I();
        if (z || I == ppN.R) {
            I = new aB7(kun, str, kg9, h0t, 0);
            jr_2.ZW(I);
        }
        jr_2.g(false);
        nP4.R(O, (kg9) I, null, null, false, null, null, jr_2, 0, 124);
        return o8s.R;
    }
}
