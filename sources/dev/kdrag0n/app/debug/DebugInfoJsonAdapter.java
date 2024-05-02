package dev.kdrag0n.app.debug;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.Map;

/* loaded from: classes.dex */
public final class DebugInfoJsonAdapter extends k49 {
    public final k49 L;
    public final k49 O;
    public final jsT R = jsT.v("reportVersion", "packageName", "versionCode", "versionName", "timestamp", "vmStatus", "hasPrivPermission", "isDevOptionsEnabled", "hasVirtSupport", "criticalSettings", "settings", "token", "userId", "isActivated", "isPremium", "entitlement", "entitlementType");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f2715R;
    public final k49 X;
    public final k49 Z;
    public final k49 c;
    public final k49 e;
    public final k49 v;

    public DebugInfoJsonAdapter(k_Z k_z) {
        Class cls = Integer.TYPE;
        lsA lsa = lsA.R;
        this.f2715R = k_z.c(cls, lsa, "reportVersion");
        this.v = k_z.c(String.class, lsa, "packageName");
        this.c = k_z.c(iGi.class, lsa, "vmStatus");
        this.e = k_z.c(Boolean.TYPE, lsa, "hasPrivPermission");
        this.X = k_z.c(cpc.s(Map.class, String.class, String.class), lsa, "criticalSettings");
        this.O = k_z.c(cpc.s(Map.class, String.class, Object.class), lsa, "settings");
        this.L = k_z.c(String.class, lsa, "token");
        this.Z = k_z.c(Integer.class, lsa, "entitlementType");
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        DebugInfo debugInfo = (DebugInfo) obj;
        if (debugInfo != null) {
            mot.c();
            mot.Z("reportVersion");
            this.f2715R.O(mot, Integer.valueOf(debugInfo.R));
            mot.Z("packageName");
            this.v.O(mot, debugInfo.f2705R);
            mot.Z("versionCode");
            this.f2715R.O(mot, Integer.valueOf(debugInfo.v));
            mot.Z("versionName");
            this.v.O(mot, debugInfo.f2712v);
            mot.Z("timestamp");
            this.v.O(mot, debugInfo.f2709c);
            mot.Z("vmStatus");
            this.c.O(mot, debugInfo.f2703R);
            mot.Z("hasPrivPermission");
            this.e.O(mot, Boolean.valueOf(debugInfo.f2707R));
            mot.Z("isDevOptionsEnabled");
            this.e.O(mot, Boolean.valueOf(debugInfo.f2714v));
            mot.Z("hasVirtSupport");
            this.e.O(mot, Boolean.valueOf(debugInfo.f2710c));
            mot.Z("criticalSettings");
            this.X.O(mot, debugInfo.f2706R);
            mot.Z("settings");
            this.O.O(mot, debugInfo.f2713v);
            mot.Z("token");
            this.L.O(mot, debugInfo.e);
            mot.Z("userId");
            this.L.O(mot, debugInfo.X);
            mot.Z("isActivated");
            this.e.O(mot, Boolean.valueOf(debugInfo.f2711e));
            mot.Z("isPremium");
            this.e.O(mot, Boolean.valueOf(debugInfo.f2708X));
            mot.Z("entitlement");
            this.f2715R.O(mot, Integer.valueOf(debugInfo.c));
            mot.Z("entitlementType");
            this.Z.O(mot, debugInfo.f2704R);
            mot.X();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        csz.c();
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Integer num2 = null;
        iGi igi = null;
        Integer num3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Map map = null;
        Map map2 = null;
        String str4 = null;
        String str5 = null;
        Integer num4 = null;
        while (csz.H()) {
            switch (csz.G(this.R)) {
                case -1:
                    csz.B();
                    csz.l();
                    num3 = num3;
                    igi = igi;
                    num = num;
                    bool = bool;
                    bool2 = bool2;
                    map2 = map2;
                    map = map;
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    str3 = str3;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 0:
                    num3 = (Integer) this.f2715R.R(csz);
                    if (num3 == null) {
                        throw mzK.H("reportVersion", "reportVersion", csz);
                    }
                    igi = igi;
                    num = num;
                    bool = bool;
                    bool2 = bool2;
                    map2 = map2;
                    map = map;
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    str3 = str3;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 1:
                    str = (String) this.v.R(csz);
                    if (str != null) {
                        num3 = num3;
                        num = num;
                        igi = igi;
                        bool = bool;
                        bool2 = bool2;
                        map2 = map2;
                        map = map;
                        bool3 = bool3;
                        bool4 = bool4;
                        bool5 = bool5;
                        str3 = str3;
                        str2 = str2;
                        num2 = num2;
                        continue;
                    } else {
                        throw mzK.H("packageName", "packageName", csz);
                    }
                case 2:
                    Integer num5 = (Integer) this.f2715R.R(csz);
                    if (num5 != null) {
                        num2 = num5;
                        num3 = num3;
                        num = num;
                        igi = igi;
                        bool = bool;
                        bool2 = bool2;
                        map2 = map2;
                        map = map;
                        bool3 = bool3;
                        bool4 = bool4;
                        bool5 = bool5;
                        str3 = str3;
                        str2 = str2;
                        break;
                    } else {
                        throw mzK.H("versionCode", "versionCode", csz);
                    }
                case 3:
                    str2 = (String) this.v.R(csz);
                    if (str2 != null) {
                        num3 = num3;
                        num = num;
                        igi = igi;
                        bool = bool;
                        bool2 = bool2;
                        map2 = map2;
                        map = map;
                        bool3 = bool3;
                        bool4 = bool4;
                        bool5 = bool5;
                        str3 = str3;
                        num2 = num2;
                        break;
                    } else {
                        throw mzK.H("versionName", "versionName", csz);
                    }
                case 4:
                    String str6 = (String) this.v.R(csz);
                    if (str6 != null) {
                        str3 = str6;
                        num3 = num3;
                        num = num;
                        igi = igi;
                        bool = bool;
                        bool2 = bool2;
                        map2 = map2;
                        map = map;
                        bool3 = bool3;
                        bool4 = bool4;
                        bool5 = bool5;
                        str2 = str2;
                        num2 = num2;
                        break;
                    } else {
                        throw mzK.H("timestamp", "timestamp", csz);
                    }
                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    igi = (iGi) this.c.R(csz);
                    num3 = num3;
                    num = num;
                    bool = bool;
                    bool2 = bool2;
                    map2 = map2;
                    map = map;
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    str3 = str3;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 6:
                    bool5 = (Boolean) this.e.R(csz);
                    if (bool5 != null) {
                        num3 = num3;
                        num = num;
                        igi = igi;
                        bool = bool;
                        bool2 = bool2;
                        map2 = map2;
                        map = map;
                        bool3 = bool3;
                        bool4 = bool4;
                        str3 = str3;
                        str2 = str2;
                        num2 = num2;
                        break;
                    } else {
                        throw mzK.H("hasPrivPermission", "hasPrivPermission", csz);
                    }
                case 7:
                    Boolean bool6 = (Boolean) this.e.R(csz);
                    if (bool6 != null) {
                        bool4 = bool6;
                        num3 = num3;
                        num = num;
                        igi = igi;
                        bool = bool;
                        bool2 = bool2;
                        map2 = map2;
                        map = map;
                        bool3 = bool3;
                        bool5 = bool5;
                        str3 = str3;
                        str2 = str2;
                        num2 = num2;
                        break;
                    } else {
                        throw mzK.H("isDevOptionsEnabled", "isDevOptionsEnabled", csz);
                    }
                case VmNativeCallback.$stable:
                    bool3 = (Boolean) this.e.R(csz);
                    if (bool3 != null) {
                        num3 = num3;
                        num = num;
                        igi = igi;
                        bool = bool;
                        bool2 = bool2;
                        map2 = map2;
                        map = map;
                        bool4 = bool4;
                        bool5 = bool5;
                        str3 = str3;
                        str2 = str2;
                        num2 = num2;
                        break;
                    } else {
                        throw mzK.H("hasVirtSupport", "hasVirtSupport", csz);
                    }
                case 9:
                    Map map3 = (Map) this.X.R(csz);
                    if (map3 != null) {
                        map = map3;
                        num3 = num3;
                        num = num;
                        igi = igi;
                        bool = bool;
                        bool2 = bool2;
                        map2 = map2;
                        bool3 = bool3;
                        bool4 = bool4;
                        bool5 = bool5;
                        str3 = str3;
                        str2 = str2;
                        num2 = num2;
                        break;
                    } else {
                        throw mzK.H("criticalSettings", "criticalSettings", csz);
                    }
                case 10:
                    map2 = (Map) this.O.R(csz);
                    if (map2 != null) {
                        num3 = num3;
                        num = num;
                        igi = igi;
                        bool = bool;
                        bool2 = bool2;
                        map = map;
                        bool3 = bool3;
                        bool4 = bool4;
                        bool5 = bool5;
                        str3 = str3;
                        str2 = str2;
                        num2 = num2;
                        break;
                    } else {
                        throw mzK.H("settings", "settings", csz);
                    }
                case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                    str4 = (String) this.L.R(csz);
                    num3 = num3;
                    igi = igi;
                    num = num;
                    bool = bool;
                    bool2 = bool2;
                    map2 = map2;
                    map = map;
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    str3 = str3;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 12:
                    str5 = (String) this.L.R(csz);
                    num3 = num3;
                    igi = igi;
                    num = num;
                    bool = bool;
                    bool2 = bool2;
                    map2 = map2;
                    map = map;
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    str3 = str3;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 13:
                    Boolean bool7 = (Boolean) this.e.R(csz);
                    if (bool7 != null) {
                        bool2 = bool7;
                        num3 = num3;
                        num = num;
                        igi = igi;
                        bool = bool;
                        map2 = map2;
                        map = map;
                        bool3 = bool3;
                        bool4 = bool4;
                        bool5 = bool5;
                        str3 = str3;
                        str2 = str2;
                        num2 = num2;
                        break;
                    } else {
                        throw mzK.H("isActivated", "isActivated", csz);
                    }
                case 14:
                    bool = (Boolean) this.e.R(csz);
                    if (bool != null) {
                        num3 = num3;
                        num = num;
                        igi = igi;
                        bool2 = bool2;
                        map2 = map2;
                        map = map;
                        bool3 = bool3;
                        bool4 = bool4;
                        bool5 = bool5;
                        str3 = str3;
                        str2 = str2;
                        num2 = num2;
                        break;
                    } else {
                        throw mzK.H("isPremium", "isPremium", csz);
                    }
                case 15:
                    num = (Integer) this.f2715R.R(csz);
                    if (num != null) {
                        num3 = num3;
                        igi = igi;
                        bool = bool;
                        bool2 = bool2;
                        map2 = map2;
                        map = map;
                        bool3 = bool3;
                        bool4 = bool4;
                        bool5 = bool5;
                        str3 = str3;
                        str2 = str2;
                        num2 = num2;
                        break;
                    } else {
                        throw mzK.H("entitlement", "entitlement", csz);
                    }
                case 16:
                    num4 = (Integer) this.Z.R(csz);
                    num3 = num3;
                    igi = igi;
                    num = num;
                    bool = bool;
                    bool2 = bool2;
                    map2 = map2;
                    map = map;
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    str3 = str3;
                    str2 = str2;
                    num2 = num2;
                    break;
                default:
                    num3 = num3;
                    igi = igi;
                    num = num;
                    bool = bool;
                    bool2 = bool2;
                    map2 = map2;
                    map = map;
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    str3 = str3;
                    str2 = str2;
                    num2 = num2;
                    break;
            }
            str = str;
        }
        csz.O();
        if (num3 != null) {
            int intValue = num3.intValue();
            if (str == null) {
                throw mzK.X("packageName", "packageName", csz);
            } else if (num2 != null) {
                int intValue2 = num2.intValue();
                if (str2 == null) {
                    throw mzK.X("versionName", "versionName", csz);
                } else if (str3 == null) {
                    throw mzK.X("timestamp", "timestamp", csz);
                } else if (bool5 != null) {
                    boolean booleanValue = bool5.booleanValue();
                    if (bool4 != null) {
                        boolean booleanValue2 = bool4.booleanValue();
                        if (bool3 != null) {
                            boolean booleanValue3 = bool3.booleanValue();
                            if (map == null) {
                                throw mzK.X("criticalSettings", "criticalSettings", csz);
                            } else if (map2 == null) {
                                throw mzK.X("settings", "settings", csz);
                            } else if (bool2 != null) {
                                boolean booleanValue4 = bool2.booleanValue();
                                if (bool != null) {
                                    boolean booleanValue5 = bool.booleanValue();
                                    if (num != null) {
                                        return new DebugInfo(intValue, str, intValue2, str2, str3, igi, booleanValue, booleanValue2, booleanValue3, map, map2, str4, str5, booleanValue4, booleanValue5, num.intValue(), num4);
                                    }
                                    throw mzK.X("entitlement", "entitlement", csz);
                                }
                                throw mzK.X("isPremium", "isPremium", csz);
                            } else {
                                throw mzK.X("isActivated", "isActivated", csz);
                            }
                        } else {
                            throw mzK.X("hasVirtSupport", "hasVirtSupport", csz);
                        }
                    } else {
                        throw mzK.X("isDevOptionsEnabled", "isDevOptionsEnabled", csz);
                    }
                } else {
                    throw mzK.X("hasPrivPermission", "hasPrivPermission", csz);
                }
            } else {
                throw mzK.X("versionCode", "versionCode", csz);
            }
        } else {
            throw mzK.X("reportVersion", "reportVersion", csz);
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(DebugInfo)";
    }
}
