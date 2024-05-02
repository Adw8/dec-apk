package dev.kdrag0n.virt.vm;

@h8S(generateAdapter = true)
/* loaded from: classes.dex */
public final class ForwardedPort {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2732R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2733R;
    public final int v;

    public ForwardedPort(String str, int i, int i2, boolean z) {
        this.f2732R = str;
        this.R = i;
        this.v = i2;
        this.f2733R = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardedPort)) {
            return false;
        }
        ForwardedPort forwardedPort = (ForwardedPort) obj;
        return n3x.v(this.f2732R, forwardedPort.f2732R) && this.R == forwardedPort.R && this.v == forwardedPort.v && this.f2733R == forwardedPort.f2733R;
    }

    public final int hashCode() {
        int e = opT.e(this.v, opT.e(this.R, this.f2732R.hashCode() * 31, 31), 31);
        boolean z = this.f2733R;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return e + i;
    }

    public final String toString() {
        String str = this.f2732R;
        int i = this.R;
        int i2 = this.v;
        boolean z = this.f2733R;
        return "ForwardedPort(containerId=" + str + ", containerPort=" + i + ", hostPort=" + i2 + ", listenOnAll=" + z + ")";
    }
}
