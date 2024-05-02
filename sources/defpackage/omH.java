package defpackage;

/* renamed from: omH  reason: default package */
/* loaded from: classes.dex */
public final class omH extends k8G implements kg9 {
    public final /* synthetic */ mpr R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ omH(mpr mpr, int i) {
        super(1);
        this.X = i;
        this.R = mpr;
    }

    public final Boolean R(e9E e9e) {
        switch (this.X) {
            case 0:
                return Boolean.valueOf(!this.R.c.containsKey(Integer.valueOf(e9e.e)));
            default:
                return Boolean.valueOf(!this.R.c.containsKey(Integer.valueOf(e9e.e)));
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                return R((e9E) obj);
            default:
                return R((e9E) obj);
        }
    }
}
