package defpackage;

import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: gx6  reason: default package */
/* loaded from: classes.dex */
public final class gx6 implements e9w, hZi {
    public final e9w R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f3998R = l6.n(null);

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f3997R = new LinkedHashSet();

    public gx6(e9w e9w, Map map) {
        a9k a9k = new a9k(e9w, 0);
        owM owm = hcN.R;
        this.R = new mMG(map, a9k);
    }

    @Override // defpackage.hZi
    public final void O(Object obj) {
        hZi hzi = (hZi) this.f3998R.getValue();
        if (hzi != null) {
            hzi.O(obj);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // defpackage.e9w
    public final dVs R(String str, f_c f_c) {
        return this.R.R(str, f_c);
    }

    @Override // defpackage.e9w
    public final Object X(String str) {
        return this.R.X(str);
    }

    @Override // defpackage.e9w
    public final Map c() {
        hZi hzi = (hZi) this.f3998R.getValue();
        if (hzi != null) {
            for (Object obj : this.f3997R) {
                hzi.O(obj);
            }
        }
        return this.R.c();
    }

    @Override // defpackage.hZi
    public final void e(Object obj, iv7 iv7, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-697180401);
        hZi hzi = (hZi) this.f3998R.getValue();
        if (hzi != null) {
            hzi.e(obj, iv7, jr_, (i & 112) | 520);
            caw.v(obj, new V4(this, 7, obj), jr_);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new dR(this, obj, iv7, i, 2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // defpackage.e9w
    public final boolean v(Object obj) {
        return this.R.v(obj);
    }
}
