package defpackage;

/* renamed from: Qi  reason: default package */
/* loaded from: classes.dex */
public final class Qi extends k8G implements kg9 {
    public final /* synthetic */ long R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Qi(long j, int i) {
        super(1);
        this.X = i;
        this.R = j;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                SD sd = (SD) obj;
                float e = nqW.e(sd.c()) / 2.0f;
                lC t = g4x.t(sd, e);
                int i = Iw.R;
                return sd.R(new Ja(e, t, new Iw(S2.R.R(this.R, 5)), 2));
            default:
                ((kEW) ((bNL) obj)).c(nwJ.f6640R, new dro(c_c.Cursor, this.R));
                return o8s.R;
        }
    }
}
