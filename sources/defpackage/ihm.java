package defpackage;

import com.termux.terminal.Y;

/* renamed from: ihm  reason: default package */
/* loaded from: classes.dex */
public final class ihm {
    public final Y R;

    /* renamed from: R  reason: collision with other field name */
    public final String f4698R;
    public String c = "";
    public final String v;

    public ihm(String str, String str2, Y y) {
        this.f4698R = str;
        this.v = str2;
        this.R = y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihm)) {
            return false;
        }
        ihm ihm = (ihm) obj;
        return n3x.v(this.f4698R, ihm.f4698R) && n3x.v(this.v, ihm.v) && n3x.v(this.R, ihm.R);
    }

    public final int hashCode() {
        return this.R.hashCode() + opT.O(this.v, this.f4698R.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f4698R;
        String str2 = this.v;
        Y y = this.R;
        return "LxdTerminalSession(id=" + str + ", containerId=" + str2 + ", session=" + y + ")";
    }
}
