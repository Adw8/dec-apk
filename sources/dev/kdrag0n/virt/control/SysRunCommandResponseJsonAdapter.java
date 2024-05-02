package dev.kdrag0n.virt.control;

/* loaded from: classes.dex */
public final class SysRunCommandResponseJsonAdapter extends k49 {
    public final jsT R = jsT.v("exitCode", "stdout", "stderr");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f2726R;
    public final k49 v;

    public SysRunCommandResponseJsonAdapter(k_Z k_z) {
        Class cls = Integer.TYPE;
        lsA lsa = lsA.R;
        this.f2726R = k_z.c(cls, lsa, "exitCode");
        this.v = k_z.c(String.class, lsa, "stdout");
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        SysRunCommandResponse sysRunCommandResponse = (SysRunCommandResponse) obj;
        if (sysRunCommandResponse != null) {
            mot.c();
            mot.Z("exitCode");
            this.f2726R.O(mot, Integer.valueOf(sysRunCommandResponse.R));
            mot.Z("stdout");
            this.v.O(mot, sysRunCommandResponse.f2725R);
            mot.Z("stderr");
            this.v.O(mot, sysRunCommandResponse.v);
            mot.X();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        csz.c();
        Integer num = null;
        String str = null;
        String str2 = null;
        while (csz.H()) {
            int G = csz.G(this.R);
            if (G == -1) {
                csz.B();
                csz.l();
            } else if (G == 0) {
                num = (Integer) this.f2726R.R(csz);
                if (num == null) {
                    throw mzK.H("exitCode", "exitCode", csz);
                }
            } else if (G == 1) {
                str = (String) this.v.R(csz);
                if (str == null) {
                    throw mzK.H("stdout", "stdout", csz);
                }
            } else if (G == 2 && (str2 = (String) this.v.R(csz)) == null) {
                throw mzK.H("stderr", "stderr", csz);
            }
        }
        csz.O();
        if (num != null) {
            int intValue = num.intValue();
            if (str == null) {
                throw mzK.X("stdout", "stdout", csz);
            } else if (str2 != null) {
                return new SysRunCommandResponse(str, intValue, str2);
            } else {
                throw mzK.X("stderr", "stderr", csz);
            }
        } else {
            throw mzK.X("exitCode", "exitCode", csz);
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SysRunCommandResponse)";
    }
}
