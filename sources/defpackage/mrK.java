package defpackage;

/* renamed from: mrK  reason: default package */
/* loaded from: classes.dex */
public final class mrK extends k8G implements lR3 {
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f6205R;
    public final /* synthetic */ int X = 0;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mrK(iv7 iv7, Object obj) {
        super(3);
        this.R = iv7;
        this.f6205R = obj;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                mdh mdh = (mdh) obj2;
                h1W h1w = (h1W) obj3;
                this.R.J(((Su) obj).c(), this.f6205R);
                return o8s.R;
            default:
                ncu ncu = (ncu) obj;
                ((Number) obj3).intValue();
                jr_ jr_ = (jr_) ((m88) obj2);
                jr_.w(-906157935);
                jJj jjj = (jJj) jr_.x(lnF.X);
                bUo buo = (bUo) jr_.x(lnF.P);
                jr_.w(1157296644);
                boolean O = jr_.O(jjj);
                Object I = jr_.I();
                if (O || I == ppN.R) {
                    I = new iTB(buo, jjj);
                    jr_.ZW(I);
                }
                jr_.g(false);
                iTB itb = (iTB) I;
                caw.X(itb, this.f6205R, new c3L(itb, this.R, null), jr_);
                jr_.g(false);
                return itb;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mrK(Object obj, iv7 iv7) {
        super(3);
        this.f6205R = obj;
        this.R = iv7;
    }
}
