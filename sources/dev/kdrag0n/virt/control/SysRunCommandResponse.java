package dev.kdrag0n.virt.control;

@h8S(generateAdapter = true)
/* loaded from: classes.dex */
public final class SysRunCommandResponse {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2725R;
    public final String v;

    public SysRunCommandResponse(String str, int i, String str2) {
        this.R = i;
        this.f2725R = str;
        this.v = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SysRunCommandResponse)) {
            return false;
        }
        SysRunCommandResponse sysRunCommandResponse = (SysRunCommandResponse) obj;
        return this.R == sysRunCommandResponse.R && n3x.v(this.f2725R, sysRunCommandResponse.f2725R) && n3x.v(this.v, sysRunCommandResponse.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + opT.O(this.f2725R, Integer.hashCode(this.R) * 31, 31);
    }

    public final String toString() {
        int i = this.R;
        String str = this.f2725R;
        String str2 = this.v;
        StringBuilder sb = new StringBuilder();
        sb.append("SysRunCommandResponse(exitCode=");
        sb.append(i);
        sb.append(", stdout=");
        sb.append(str);
        sb.append(", stderr=");
        return jQ.g(sb, str2, ")");
    }
}
