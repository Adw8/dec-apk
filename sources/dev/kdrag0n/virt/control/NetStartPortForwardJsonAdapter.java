package dev.kdrag0n.virt.control;

/* loaded from: classes.dex */
public final class NetStartPortForwardJsonAdapter extends k49 {
    public final jsT R = jsT.v("port");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f2722R;

    public NetStartPortForwardJsonAdapter(k_Z k_z) {
        this.f2722R = k_z.c(Integer.TYPE, lsA.R, "port");
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        NetStartPortForward netStartPortForward = (NetStartPortForward) obj;
        if (netStartPortForward != null) {
            mot.c();
            mot.Z("port");
            this.f2722R.O(mot, Integer.valueOf(netStartPortForward.R));
            mot.X();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        csz.c();
        Integer num = null;
        while (csz.H()) {
            int G = csz.G(this.R);
            if (G == -1) {
                csz.B();
                csz.l();
            } else if (G == 0 && (num = (Integer) this.f2722R.R(csz)) == null) {
                throw mzK.H("port", "port", csz);
            }
        }
        csz.O();
        if (num != null) {
            return new NetStartPortForward(num.intValue());
        }
        throw mzK.X("port", "port", csz);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(NetStartPortForward)";
    }
}
