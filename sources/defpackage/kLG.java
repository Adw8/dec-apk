package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kLG  reason: default package */
/* loaded from: classes.dex */
public final class kLG extends h7U {
    public static final oFB R = bRg.R("application/x-www-form-urlencoded");

    /* renamed from: R  reason: collision with other field name */
    public final List f5267R;
    public final List v;

    public kLG(ArrayList arrayList, ArrayList arrayList2) {
        this.f5267R = khE.m(arrayList);
        this.v = khE.m(arrayList2);
    }

    @Override // defpackage.h7U
    public final long R() {
        return e(null, true);
    }

    @Override // defpackage.h7U
    public final void c(NV nv) {
        e(nv, false);
    }

    public final long e(NV nv, boolean z) {
        ME me = z ? new ME() : nv.v();
        int size = this.f5267R.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                me.a(38);
            }
            me.vr((String) this.f5267R.get(i));
            me.a(61);
            me.vr((String) this.v.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = me.R;
        me.X();
        return j;
    }

    @Override // defpackage.h7U
    public final oFB v() {
        return R;
    }
}
