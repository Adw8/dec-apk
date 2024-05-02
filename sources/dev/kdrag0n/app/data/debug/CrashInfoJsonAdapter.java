package dev.kdrag0n.app.data.debug;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* loaded from: classes.dex */
public final class CrashInfoJsonAdapter extends k49 {
    public final jsT R = jsT.v("timestamp", "reason", "status", "importance", "pid", "processName", "description", "rss", "pss");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f2702R;
    public final k49 c;
    public final k49 e;
    public final k49 v;

    public CrashInfoJsonAdapter(k_Z k_z) {
        lsA lsa = lsA.R;
        this.f2702R = k_z.c(String.class, lsa, "timestamp");
        this.v = k_z.c(Integer.TYPE, lsa, "status");
        this.c = k_z.c(String.class, lsa, "description");
        this.e = k_z.c(Long.TYPE, lsa, "rss");
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        CrashInfo crashInfo = (CrashInfo) obj;
        if (crashInfo != null) {
            mot.c();
            mot.Z("timestamp");
            this.f2702R.O(mot, crashInfo.f2698R);
            mot.Z("reason");
            this.f2702R.O(mot, crashInfo.f2701v);
            mot.Z("status");
            this.v.O(mot, Integer.valueOf(crashInfo.R));
            mot.Z("importance");
            this.v.O(mot, Integer.valueOf(crashInfo.v));
            mot.Z("pid");
            this.v.O(mot, Integer.valueOf(crashInfo.c));
            mot.Z("processName");
            this.f2702R.O(mot, crashInfo.f2699c);
            mot.Z("description");
            this.c.O(mot, crashInfo.e);
            mot.Z("rss");
            this.e.O(mot, Long.valueOf(crashInfo.f2697R));
            mot.Z("pss");
            this.e.O(mot, Long.valueOf(crashInfo.f2700v));
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
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (csz.H()) {
            switch (csz.G(this.R)) {
                case -1:
                    csz.B();
                    csz.l();
                    str4 = str4;
                    l = l;
                    l2 = l2;
                    break;
                case 0:
                    str = (String) this.f2702R.R(csz);
                    if (str == null) {
                        throw mzK.H("timestamp", "timestamp", csz);
                    }
                    str4 = str4;
                    l = l;
                    l2 = l2;
                    break;
                case 1:
                    str2 = (String) this.f2702R.R(csz);
                    if (str2 == null) {
                        throw mzK.H("reason", "reason", csz);
                    }
                    str4 = str4;
                    l = l;
                    l2 = l2;
                    break;
                case 2:
                    num = (Integer) this.v.R(csz);
                    if (num == null) {
                        throw mzK.H("status", "status", csz);
                    }
                    str4 = str4;
                    l = l;
                    l2 = l2;
                    break;
                case 3:
                    num2 = (Integer) this.v.R(csz);
                    if (num2 == null) {
                        throw mzK.H("importance", "importance", csz);
                    }
                    str4 = str4;
                    l = l;
                    l2 = l2;
                    break;
                case 4:
                    num3 = (Integer) this.v.R(csz);
                    if (num3 == null) {
                        throw mzK.H("pid", "pid", csz);
                    }
                    str4 = str4;
                    l = l;
                    l2 = l2;
                    break;
                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    str3 = (String) this.f2702R.R(csz);
                    if (str3 != null) {
                        str4 = str4;
                        l = l;
                        l2 = l2;
                        continue;
                    } else {
                        throw mzK.H("processName", "processName", csz);
                    }
                case 6:
                    str4 = (String) this.c.R(csz);
                    l = l;
                    l2 = l2;
                    break;
                case 7:
                    Long l3 = (Long) this.e.R(csz);
                    if (l3 != null) {
                        l2 = l3;
                        str4 = str4;
                        l = l;
                        break;
                    } else {
                        throw mzK.H("rss", "rss", csz);
                    }
                case VmNativeCallback.$stable /* 8 */:
                    l = (Long) this.e.R(csz);
                    if (l != null) {
                        str4 = str4;
                        l2 = l2;
                        break;
                    } else {
                        throw mzK.H("pss", "pss", csz);
                    }
                default:
                    str4 = str4;
                    l = l;
                    l2 = l2;
                    break;
            }
            str3 = str3;
        }
        csz.O();
        if (str == null) {
            throw mzK.X("timestamp", "timestamp", csz);
        } else if (str2 == null) {
            throw mzK.X("reason", "reason", csz);
        } else if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (num3 != null) {
                    int intValue3 = num3.intValue();
                    if (str3 == null) {
                        throw mzK.X("processName", "processName", csz);
                    } else if (l2 != null) {
                        long longValue = l2.longValue();
                        if (l != null) {
                            return new CrashInfo(str, str2, intValue, intValue2, intValue3, str3, str4, longValue, l.longValue());
                        }
                        throw mzK.X("pss", "pss", csz);
                    } else {
                        throw mzK.X("rss", "rss", csz);
                    }
                } else {
                    throw mzK.X("pid", "pid", csz);
                }
            } else {
                throw mzK.X("importance", "importance", csz);
            }
        } else {
            throw mzK.X("status", "status", csz);
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CrashInfo)";
    }
}
