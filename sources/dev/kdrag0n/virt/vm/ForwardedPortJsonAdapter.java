package dev.kdrag0n.virt.vm;

/* loaded from: classes.dex */
public final class ForwardedPortJsonAdapter extends k49 {
    public final jsT R = jsT.v("containerId", "containerPort", "hostPort", "listenOnAll");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f2734R;
    public final k49 c;
    public final k49 v;

    public ForwardedPortJsonAdapter(k_Z k_z) {
        lsA lsa = lsA.R;
        this.f2734R = k_z.c(String.class, lsa, "containerId");
        this.v = k_z.c(Integer.TYPE, lsa, "containerPort");
        this.c = k_z.c(Boolean.TYPE, lsa, "listenOnAll");
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        ForwardedPort forwardedPort = (ForwardedPort) obj;
        if (forwardedPort != null) {
            mot.c();
            mot.Z("containerId");
            this.f2734R.O(mot, forwardedPort.f2732R);
            mot.Z("containerPort");
            this.v.O(mot, Integer.valueOf(forwardedPort.R));
            mot.Z("hostPort");
            this.v.O(mot, Integer.valueOf(forwardedPort.v));
            mot.Z("listenOnAll");
            this.c.O(mot, Boolean.valueOf(forwardedPort.f2733R));
            mot.X();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        csz.c();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        while (csz.H()) {
            int G = csz.G(this.R);
            if (G == -1) {
                csz.B();
                csz.l();
            } else if (G == 0) {
                str = (String) this.f2734R.R(csz);
                if (str == null) {
                    throw mzK.H("containerId", "containerId", csz);
                }
            } else if (G == 1) {
                num = (Integer) this.v.R(csz);
                if (num == null) {
                    throw mzK.H("containerPort", "containerPort", csz);
                }
            } else if (G == 2) {
                num2 = (Integer) this.v.R(csz);
                if (num2 == null) {
                    throw mzK.H("hostPort", "hostPort", csz);
                }
            } else if (G == 3 && (bool = (Boolean) this.c.R(csz)) == null) {
                throw mzK.H("listenOnAll", "listenOnAll", csz);
            }
        }
        csz.O();
        if (str == null) {
            throw mzK.X("containerId", "containerId", csz);
        } else if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (bool != null) {
                    return new ForwardedPort(str, intValue, intValue2, bool.booleanValue());
                }
                throw mzK.X("listenOnAll", "listenOnAll", csz);
            }
            throw mzK.X("hostPort", "hostPort", csz);
        } else {
            throw mzK.X("containerPort", "containerPort", csz);
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ForwardedPort)";
    }
}
