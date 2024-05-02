package defpackage;

/* renamed from: n3l  reason: default package */
/* loaded from: classes.dex */
public final class n3l extends k8G implements lR3 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3l(int i, Object obj) {
        super(3);
        this.X = i;
        this.R = obj;
    }

    public final void R(Su su, mdh mdh, h1W h1w) {
        switch (this.X) {
            case 0:
                h1w.c.add((f_c) this.R);
                return;
            case 1:
                int length = ((Object[]) this.R).length;
                for (int i = 0; i < length; i++) {
                    su.O(((Object[]) this.R)[i]);
                }
                return;
            default:
                mdh.H(mdh.c((WB) this.R));
                return;
        }
    }

    @Override // defpackage.lR3
    public final /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                R((Su) obj, (mdh) obj2, (h1W) obj3);
                break;
            case 1:
                R((Su) obj, (mdh) obj2, (h1W) obj3);
                break;
            default:
                R((Su) obj, (mdh) obj2, (h1W) obj3);
                break;
        }
        return o8s.R;
    }
}
