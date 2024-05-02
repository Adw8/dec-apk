package defpackage;

/* renamed from: sh  reason: default package */
/* loaded from: classes.dex */
public final class sh extends k8G implements kg9 {
    public final /* synthetic */ int O;
    public final /* synthetic */ l0f R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh(l0f l0f, int i, int i2) {
        super(1);
        this.X = i2;
        this.R = l0f;
        this.O = i;
    }

    public final void R(h57 h57) {
        switch (this.X) {
            case 0:
                l0f l0f = this.R;
                l0f l0f2 = this.R;
                h57.L(h57, l0f, ((-this.O) / 2) - ((l0f.e - l0f.mh()) / 2), ((-this.O) / 2) - ((l0f2.X - l0f2.JD()) / 2), null, 12);
                return;
            default:
                l0f l0f3 = this.R;
                int i = this.O / 2;
                h57.v(h57, l0f3, i, i);
                return;
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                R((h57) obj);
                break;
            default:
                R((h57) obj);
                break;
        }
        return o8s.R;
    }
}
