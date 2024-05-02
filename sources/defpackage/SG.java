package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: SG  reason: default package */
/* loaded from: classes.dex */
public final class SG {
    public static final SG R = new SG(dF.wm(new ArrayList()), null);

    /* renamed from: R  reason: collision with other field name */
    public final gQc f510R;

    /* renamed from: R  reason: collision with other field name */
    public final Set f511R;

    public SG(Set set, gQc gqc) {
        this.f511R = set;
        this.f510R = gqc;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SG) {
            SG sg = (SG) obj;
            if (n3x.v(sg.f511R, this.f511R) && n3x.v(sg.f510R, this.f510R)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f511R.hashCode() + 1517) * 41;
        gQc gqc = this.f510R;
        return hashCode + (gqc != null ? gqc.hashCode() : 0);
    }
}
