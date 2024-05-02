package defpackage;

/* renamed from: mJR  reason: default package */
/* loaded from: classes.dex */
public final class mJR {
    public final gLn R;
    public final gLn v;

    public mJR() {
        gLn gln = new gLn();
        this.R = gln;
        this.v = gln;
    }

    public final void R(int i, kg9 kg9, kg9 kg92, dNH dnh) {
        gLn gln = this.R;
        ipI ipi = new ipI(kg9, kg92, dnh);
        gln.getClass();
        if (!(i >= 0)) {
            throw new IllegalArgumentException(opT.Z("size should be >=0, but was ", i).toString());
        } else if (i != 0) {
            jt1 jt1 = new jt1(gln.R, i, ipi);
            gln.R += i;
            gln.f3730R.v(jt1);
        }
    }
}
