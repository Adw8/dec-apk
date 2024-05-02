package defpackage;

/* renamed from: dzI  reason: default package */
/* loaded from: classes.dex */
public final class dzI implements eXP {
    public final /* synthetic */ pir R;

    public dzI(pir pir) {
        this.R = pir;
    }

    @Override // defpackage.eXP
    public final dEt R(ety ety) {
        j0 j0Var = ety.f3235R;
        j0Var.getClass();
        fmL fml = new fmL(j0Var);
        String str = (String) ((m5f) ((nak) this.R).get()).f5923v.getValue();
        if (str == null) {
            str = null;
        }
        if (str != null) {
            String H = opT.H("Bearer ", str);
            iRl irl = fml.f3557R;
            irl.getClass();
            dTl.n("Authorization");
            dTl.Q(H, "Authorization");
            dTl.o(irl, "Authorization", H);
        }
        return ety.v(new j0(fml));
    }
}
