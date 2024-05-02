package defpackage;

/* renamed from: v9  reason: default package */
/* loaded from: classes.dex */
public final class v9 implements n76 {
    public final /* synthetic */ int R;

    public /* synthetic */ v9(int i) {
        this.R = i;
    }

    @Override // defpackage.n76
    public final vC R(long j, mdz mdz, jJj jjj) {
        switch (this.R) {
            case 0:
                float B = (float) jjj.B(r5.R);
                return new kW2(new gIA(0.0f, -B, nqW.e(j), nqW.v(j) + B));
            case 1:
                float B2 = (float) jjj.B(r5.R);
                return new kW2(new gIA(-B2, 0.0f, nqW.e(j) + B2, nqW.v(j)));
            default:
                return new kW2(msU.e(aWo.v, j));
        }
    }

    public final String toString() {
        switch (this.R) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
