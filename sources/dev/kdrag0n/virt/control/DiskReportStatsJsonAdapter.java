package dev.kdrag0n.virt.control;

/* loaded from: classes.dex */
public final class DiskReportStatsJsonAdapter extends k49 {
    public final jsT R = jsT.v("hostFsSize", "hostFsFree", "dataImgSize");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f2721R;

    public DiskReportStatsJsonAdapter(k_Z k_z) {
        this.f2721R = k_z.c(Long.TYPE, lsA.R, "hostFsSize");
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        DiskReportStats diskReportStats = (DiskReportStats) obj;
        if (diskReportStats != null) {
            mot.c();
            mot.Z("hostFsSize");
            this.f2721R.O(mot, Long.valueOf(diskReportStats.R));
            mot.Z("hostFsFree");
            this.f2721R.O(mot, Long.valueOf(diskReportStats.v));
            mot.Z("dataImgSize");
            this.f2721R.O(mot, Long.valueOf(diskReportStats.c));
            mot.X();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        csz.c();
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        while (csz.H()) {
            int G = csz.G(this.R);
            if (G == -1) {
                csz.B();
                csz.l();
            } else if (G == 0) {
                l = (Long) this.f2721R.R(csz);
                if (l == null) {
                    throw mzK.H("hostFsSize", "hostFsSize", csz);
                }
            } else if (G == 1) {
                l2 = (Long) this.f2721R.R(csz);
                if (l2 == null) {
                    throw mzK.H("hostFsFree", "hostFsFree", csz);
                }
            } else if (G == 2 && (l3 = (Long) this.f2721R.R(csz)) == null) {
                throw mzK.H("dataImgSize", "dataImgSize", csz);
            }
        }
        csz.O();
        if (l != null) {
            long longValue = l.longValue();
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (l3 != null) {
                    return new DiskReportStats(longValue, longValue2, l3.longValue());
                }
                throw mzK.X("dataImgSize", "dataImgSize", csz);
            }
            throw mzK.X("hostFsFree", "hostFsFree", csz);
        }
        throw mzK.X("hostFsSize", "hostFsSize", csz);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(DiskReportStats)";
    }
}
