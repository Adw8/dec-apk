package defpackage;

/* renamed from: pmk  reason: default package */
/* loaded from: classes.dex */
public final class pmk extends k8G implements kg9 {
    public final /* synthetic */ nog R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pmk(nog nog, int i) {
        super(1);
        this.X = i;
        this.R = nog;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                this.R.v++;
                return;
            default:
                nog nog = this.R;
                nog.v--;
                return;
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                dH9 dh9 = (dH9) obj;
                R();
                break;
            default:
                dH9 dh92 = (dH9) obj;
                R();
                break;
        }
        return o8s.R;
    }
}
