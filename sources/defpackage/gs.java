package defpackage;

/* renamed from: gs  reason: default package */
/* loaded from: classes.dex */
public final class gs extends k8G implements kg9 {
    public final /* synthetic */ pU R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs(pU pUVar) {
        super(1);
        this.R = pUVar;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        long j = ((ltH) obj).R;
        boolean z = !nqW.R(iTI.J(j), this.R.R);
        this.R.R = iTI.J(j);
        if (z) {
            int i = (int) (j >> 32);
            this.R.f7089R.setSize(i, ltH.v(j));
            this.R.v.setSize(i, ltH.v(j));
            this.R.c.setSize(ltH.v(j), i);
            this.R.e.setSize(ltH.v(j), i);
            this.R.X.setSize(i, ltH.v(j));
            this.R.O.setSize(i, ltH.v(j));
            this.R.L.setSize(ltH.v(j), i);
            this.R.Z.setSize(ltH.v(j), i);
        }
        if (z) {
            this.R.U();
            this.R.Z();
        }
        return o8s.R;
    }
}
