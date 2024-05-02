package dev.kdrag0n.virt.control;

@h8S(generateAdapter = true)
/* loaded from: classes.dex */
public final class DiskReportStats {
    public final long R;
    public final long c;
    public final long v;

    public DiskReportStats(long j, long j2, long j3) {
        this.R = j;
        this.v = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiskReportStats)) {
            return false;
        }
        DiskReportStats diskReportStats = (DiskReportStats) obj;
        return this.R == diskReportStats.R && this.v == diskReportStats.v && this.c == diskReportStats.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + opT.X(this.v, Long.hashCode(this.R) * 31, 31);
    }

    public final String toString() {
        long j = this.R;
        long j2 = this.v;
        long j3 = this.c;
        return "DiskReportStats(hostFsSize=" + j + ", hostFsFree=" + j2 + ", dataImgSize=" + j3 + ")";
    }
}
