package defpackage;

/* renamed from: cGe  reason: default package */
/* loaded from: classes.dex */
public final class cGe extends k8G implements kg9 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mC9 f2047R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cGe(mC9 mc9, long j, int i) {
        super(1);
        this.X = i;
        this.f2047R = mc9;
        this.R = j;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        long j;
        dU5 du5 = null;
        switch (this.X) {
            case 0:
                aMr amr = (aMr) obj;
                mC9 mc9 = this.f2047R;
                long j2 = this.R;
                jo joVar = (jo) mc9.f5978R.getValue();
                j2 = joVar == null ? j2 : ((ltH) joVar.R.x(new ltH(j2))).R;
                jo joVar2 = (jo) mc9.f5980v.getValue();
                j2 = joVar2 == null ? j2 : ((ltH) joVar2.R.x(new ltH(j2))).R;
                int ordinal = amr.ordinal();
                if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
                    throw new j8f((Object) null);
                }
                return new ltH(j2);
            default:
                aMr amr2 = (aMr) obj;
                mC9 mc92 = this.f2047R;
                long j3 = this.R;
                if (mc92.f5979R == null) {
                    j = dU5.v;
                } else if (mc92.c.getValue() == null) {
                    j = dU5.v;
                } else if (n3x.v(mc92.f5979R, mc92.c.getValue())) {
                    j = dU5.v;
                } else {
                    int ordinal2 = amr2.ordinal();
                    if (ordinal2 == 0) {
                        j = dU5.v;
                    } else if (ordinal2 == 1) {
                        j = dU5.v;
                    } else if (ordinal2 == 2) {
                        jo joVar3 = (jo) mc92.f5980v.getValue();
                        if (joVar3 != null) {
                            long j4 = ((ltH) joVar3.R.x(new ltH(j3))).R;
                            mdz mdz = mdz.Ltr;
                            long R = ((Y6) ((mz) mc92.c.getValue())).R(j3, j4, mdz);
                            long R2 = ((Y6) mc92.f5979R).R(j3, j4, mdz);
                            du5 = new dU5(cU5.v(((int) (R >> 32)) - ((int) (R2 >> 32)), dU5.v(R) - dU5.v(R2)));
                        }
                        j = du5 == null ? dU5.v : du5.f2628R;
                    } else {
                        throw new j8f((Object) null);
                    }
                }
                return new dU5(j);
        }
    }
}
