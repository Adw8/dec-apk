package defpackage;

/* renamed from: oF_  reason: default package */
/* loaded from: classes.dex */
public final class oF_ extends k8G implements kg9 {
    public final /* synthetic */ String R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oF_(String str, int i) {
        super(1);
        this.X = i;
        this.R = str;
    }

    public final void R(bNL bnl) {
        switch (this.X) {
            case 0:
                onS.R(bnl, this.R);
                onS.v(bnl, 5);
                return;
            case 1:
                String str = this.R;
                b_t b_t = onS.c;
                icv icv = onS.f6950R[2];
                b_t.R(bnl, str);
                return;
            case 2:
                onS.R(bnl, this.R);
                onS.v(bnl, 5);
                return;
            default:
                onS.R(bnl, this.R);
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                R((bNL) obj);
                return o8s.R;
            case 1:
                R((bNL) obj);
                return o8s.R;
            case 2:
                R((bNL) obj);
                return o8s.R;
            case 3:
                R((bNL) obj);
                return o8s.R;
            case 4:
                return Boolean.valueOf(n3x.v((String) obj, this.R));
            default:
                return jQ.g(new StringBuilder(), this.R, (String) obj);
        }
    }
}
