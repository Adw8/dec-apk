package defpackage;

/* renamed from: atD  reason: default package */
/* loaded from: classes.dex */
public final class atD {
    public long R = 262144;

    /* renamed from: R  reason: collision with other field name */
    public final Jl f1482R;

    public atD(Jl jl) {
        this.f1482R = jl;
    }

    public final bd4 R() {
        iRl irl = new iRl();
        while (true) {
            String _ = this.f1482R._(this.R);
            this.R -= (long) _.length();
            if (_.length() == 0) {
                return irl.v();
            }
            int W = iH_.W(_, ':', 1, false, 4);
            if (W != -1) {
                dTl.o(irl, _.substring(0, W), _.substring(W + 1));
            } else if (_.charAt(0) == ':') {
                dTl.o(irl, "", _.substring(1));
            } else {
                dTl.o(irl, "", _);
            }
        }
    }
}
