package dev.kdrag0n.virt.control;

import java.util.List;

/* loaded from: classes.dex */
public final class SysRunCommandJsonAdapter extends k49 {
    public final jsT R = jsT.v("command", "args");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f2724R;
    public final k49 v;

    public SysRunCommandJsonAdapter(k_Z k_z) {
        lsA lsa = lsA.R;
        this.f2724R = k_z.c(String.class, lsa, "command");
        this.v = k_z.c(cpc.s(List.class, String.class), lsa, "args");
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        SysRunCommand sysRunCommand = (SysRunCommand) obj;
        if (sysRunCommand != null) {
            mot.c();
            mot.Z("command");
            this.f2724R.O(mot, sysRunCommand.R);
            mot.Z("args");
            this.v.O(mot, sysRunCommand.f2723R);
            mot.X();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        csz.c();
        String str = null;
        List list = null;
        while (csz.H()) {
            int G = csz.G(this.R);
            if (G == -1) {
                csz.B();
                csz.l();
            } else if (G == 0) {
                str = (String) this.f2724R.R(csz);
                if (str == null) {
                    throw mzK.H("command", "command", csz);
                }
            } else if (G == 1 && (list = (List) this.v.R(csz)) == null) {
                throw mzK.H("args", "args", csz);
            }
        }
        csz.O();
        if (str == null) {
            throw mzK.X("command", "command", csz);
        } else if (list != null) {
            return new SysRunCommand(str, list);
        } else {
            throw mzK.X("args", "args", csz);
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SysRunCommand)";
    }
}
