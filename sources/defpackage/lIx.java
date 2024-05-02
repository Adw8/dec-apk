package defpackage;

/* renamed from: lIx  reason: default package */
/* loaded from: classes.dex */
public final class lIx extends k8G implements kg9 {
    public final /* synthetic */ iv7 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lIx(int i, iv7 iv7) {
        super(1);
        this.X = i;
        this.R = iv7;
    }

    public final void R(phU phu) {
        switch (this.X) {
            case 0:
                this.R.J(phu, new aWo(n1P.K(phu, false)));
                phu.R();
                return;
            case 1:
                this.R.J(phu, new aWo(n1P.K(phu, false)));
                phu.R();
                return;
            default:
                this.R.J(phu, Float.valueOf(aWo.e(n1P.K(phu, false))));
                phu.R();
                return;
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                R((phU) obj);
                break;
            case 1:
                R((phU) obj);
                break;
            default:
                R((phU) obj);
                break;
        }
        return o8s.R;
    }
}
