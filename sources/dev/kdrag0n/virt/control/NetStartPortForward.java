package dev.kdrag0n.virt.control;

@h8S(generateAdapter = true)
/* loaded from: classes.dex */
public final class NetStartPortForward {
    public final int R;

    public NetStartPortForward(int i) {
        this.R = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NetStartPortForward) && this.R == ((NetStartPortForward) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return opT.m("NetStartPortForward(port=", this.R, ")");
    }
}
