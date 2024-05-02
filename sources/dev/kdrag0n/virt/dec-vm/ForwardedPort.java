package dev.kdrag0n.virt.vm;

import com.squareup.moshi.JsonClass;

@JsonClass(generateAdapter = true)
/* loaded from: classes.dex */
public final class ForwardedPort {
    public final int containerPort;
    public final String containerId;
    public final boolean listenOnAll;
    public final int hostPort;

    public ForwardedPort(String containerId, int containerPort, int hostPort, boolean listenOnAll) {
        this.containerId = containerId;
        this.containerPort = containerPort;
        this.hostPort = hostPort;
        this.listenOnAll = listenOnAll;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardedPort)) {
            return false;
        }
        ForwardedPort forwardedPort = (ForwardedPort) obj;
        return Objects.equals(this.containerId, forwardedPort.containerId) && this.containerPort == forwardedPort.containerPort && this.hostPort == forwardedPort.hostPort && this.listenOnAll == forwardedPort.listenOnAll;
    }

    public final int hashCode() {
        int containerPortHash = Objects.hash(containerPort);
        int containerIdHash = containerId.hashCode();
        int hostPortHash = Objects.hash(hostPort);
        int listenOnAllHash = Objects.hash(listenOnAll);
        return Objects.hash(containerIdHash, containerPortHash, hostPortHash, listenOnAllHash);
    }

    public final String toString() {
        return "ForwardedPort(containerId=" + containerId + ", containerPort=" + containerPort + ", hostPort=" + hostPort + ", listenOnAll=" + listenOnAll + ")";
    }
}
