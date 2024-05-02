package dev.kdrag0n.virt.lxc.model;

/* loaded from: classes.dex */
public final class InstanceJsonAdapter extends k49 {
    public final jsT R = jsT.v("name", "status", "status_code", "last_used_at", "created_at");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f2731R;
    public final k49 v;

    public InstanceJsonAdapter(k_Z k_z) {
        lsA lsa = lsA.R;
        this.f2731R = k_z.c(String.class, lsa, "name");
        this.v = k_z.c(Integer.TYPE, lsa, "statusCode");
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        Instance instance = (Instance) obj;
        if (instance != null) {
            mot.c();
            mot.Z("name");
            this.f2731R.O(mot, instance.f2730R);
            mot.Z("status");
            this.f2731R.O(mot, instance.v);
            mot.Z("status_code");
            this.v.O(mot, Integer.valueOf(instance.R));
            mot.Z("last_used_at");
            this.f2731R.O(mot, instance.c);
            mot.Z("created_at");
            this.f2731R.O(mot, instance.e);
            mot.X();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        csz.c();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (csz.H()) {
            int G = csz.G(this.R);
            if (G == -1) {
                csz.B();
                csz.l();
            } else if (G == 0) {
                String str5 = (String) this.f2731R.R(csz);
                if (str5 != null) {
                    str = str5;
                } else {
                    throw mzK.H("name", "name", csz);
                }
            } else if (G == 1) {
                String str6 = (String) this.f2731R.R(csz);
                if (str6 != null) {
                    str2 = str6;
                } else {
                    throw mzK.H("status", "status", csz);
                }
            } else if (G == 2) {
                num = (Integer) this.v.R(csz);
                if (num == null) {
                    throw mzK.H("statusCode", "status_code", csz);
                }
            } else if (G == 3) {
                String str7 = (String) this.f2731R.R(csz);
                if (str7 != null) {
                    str3 = str7;
                } else {
                    throw mzK.H("lastUsedAt", "last_used_at", csz);
                }
            } else if (G == 4) {
                str4 = (String) this.f2731R.R(csz);
                if (str4 == null) {
                    throw mzK.H("createdAt", "created_at", csz);
                }
            }
            str4 = str4;
        }
        csz.O();
        if (str == null) {
            throw mzK.X("name", "name", csz);
        } else if (str2 == null) {
            throw mzK.X("status", "status", csz);
        } else if (num != null) {
            int intValue = num.intValue();
            if (str3 == null) {
                throw mzK.X("lastUsedAt", "last_used_at", csz);
            } else if (str4 != null) {
                return new Instance(str, str2, intValue, str3, str4);
            } else {
                throw mzK.X("createdAt", "created_at", csz);
            }
        } else {
            throw mzK.X("statusCode", "status_code", csz);
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Instance)";
    }
}
