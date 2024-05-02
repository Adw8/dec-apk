package dev.kdrag0n.virt.control;

import java.util.List;

@h8S(generateAdapter = true)
/* loaded from: classes.dex */
public final class SysRunCommand {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final List f2723R;

    public SysRunCommand(String str, List list) {
        this.R = str;
        this.f2723R = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SysRunCommand)) {
            return false;
        }
        SysRunCommand sysRunCommand = (SysRunCommand) obj;
        return n3x.v(this.R, sysRunCommand.R) && n3x.v(this.f2723R, sysRunCommand.f2723R);
    }

    public final int hashCode() {
        return this.f2723R.hashCode() + (this.R.hashCode() * 31);
    }

    public final String toString() {
        String str = this.R;
        List list = this.f2723R;
        return "SysRunCommand(command=" + str + ", args=" + list + ")";
    }
}
