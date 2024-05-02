package defpackage;

import java.util.LinkedHashMap;

/* renamed from: hvS  reason: default package */
/* loaded from: classes.dex */
public final class hvS {
    public int R = 300;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f4417R = new LinkedHashMap();

    public final bvP R(int i, Float f) {
        bvP bvp = new bvP(f);
        this.f4417R.put(Integer.valueOf(i), bvp);
        return bvp;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hvS) {
            hvS hvs = (hvS) obj;
            hvs.getClass();
            if (this.R == hvs.R && n3x.v(this.f4417R, hvs.f4417R)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4417R.hashCode() + (((this.R * 31) + 0) * 31);
    }
}
