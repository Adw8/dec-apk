package defpackage;

/* renamed from: lrz  reason: default package */
/* loaded from: classes.dex */
public final class lrz extends cho {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ lrz(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // defpackage.cho
    public final void R() {
        switch (this.e) {
            case 0:
                dUW duw = (dUW) this.R;
                if (duw.f2643R != null) {
                    duw.f2652R.m("Unbind from service.", new Object[0]);
                    dUW duw2 = (dUW) this.R;
                    duw2.f2641R.unbindService(duw2.f2644R);
                    dUW duw3 = (dUW) this.R;
                    duw3.f2653R = false;
                    duw3.f2643R = null;
                    duw3.f2644R = null;
                }
                ((dUW) this.R).e();
                return;
            default:
                dUW duw4 = (dUW) ((eG5) this.R).f3042R;
                duw4.f2652R.m("unlinkToDeath", new Object[0]);
                duw4.f2643R.asBinder().unlinkToDeath(duw4.f2651R, 0);
                dUW duw5 = (dUW) ((eG5) this.R).f3042R;
                duw5.f2643R = null;
                duw5.f2653R = false;
                return;
        }
    }
}
