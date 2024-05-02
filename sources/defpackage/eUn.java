package defpackage;

/* renamed from: eUn  reason: default package */
/* loaded from: classes.dex */
public final class eUn {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public long f3109R;

    /* renamed from: R  reason: collision with other field name */
    public arx f3110R;

    /* renamed from: R  reason: collision with other field name */
    public dEt f3111R;

    /* renamed from: R  reason: collision with other field name */
    public fPH f3112R;

    /* renamed from: R  reason: collision with other field name */
    public f_c f3113R;

    /* renamed from: R  reason: collision with other field name */
    public iRl f3114R;

    /* renamed from: R  reason: collision with other field name */
    public j0 f3115R;

    /* renamed from: R  reason: collision with other field name */
    public String f3116R;

    /* renamed from: R  reason: collision with other field name */
    public mxv f3117R;

    /* renamed from: R  reason: collision with other field name */
    public nX1 f3118R;
    public dEt c;
    public long v;

    /* renamed from: v  reason: collision with other field name */
    public dEt f3119v;

    public eUn() {
        this.R = -1;
        this.f3110R = asb.f1480R;
        this.f3113R = mY_.U;
        this.f3114R = new iRl();
    }

    public final dEt R() {
        int i = this.R;
        if (i >= 0) {
            j0 j0Var = this.f3115R;
            if (j0Var != null) {
                nX1 nx1 = this.f3118R;
                if (nx1 != null) {
                    String str = this.f3116R;
                    if (str != null) {
                        return new dEt(j0Var, nx1, str, i, this.f3117R, this.f3114R.v(), this.f3110R, this.f3111R, this.f3119v, this.c, this.f3109R, this.v, this.f3112R, this.f3113R);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
        StringBuilder U = opT.U("code < 0: ");
        U.append(this.R);
        throw new IllegalStateException(U.toString().toString());
    }

    public eUn(dEt det) {
        this.R = -1;
        this.f3110R = asb.f1480R;
        this.f3113R = mY_.U;
        this.f3115R = det.f2539R;
        this.f3118R = det.f2542R;
        this.R = det.e;
        this.f3116R = det.f2540R;
        this.f3117R = det.f2541R;
        this.f3114R = det.f2535R.c();
        this.f3110R = det.f2534R;
        this.f3111R = det.f2536R;
        this.f3119v = det.f2544v;
        this.c = det.c;
        this.f3109R = det.R;
        this.v = det.v;
        this.f3112R = det.f2537R;
        this.f3113R = det.f2538R;
    }
}
