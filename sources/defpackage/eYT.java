package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: eYT  reason: default package */
/* loaded from: classes.dex */
public final class eYT implements bF9 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f3135R;
    public final /* synthetic */ h0T v;

    public eYT(h0T h0t, h0T h0t2, float f) {
        this.f3135R = h0t;
        this.v = h0t2;
        this.R = f;
    }

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pc0 pc0 = (pc0) it.next();
            if (gQc.n(pc0) == dZl.THUMB) {
                l0f L = pc0.L(j);
                int Z = oys.Z(j) - L.e;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    pc0 pc02 = (pc0) it2.next();
                    if (gQc.n(pc02) == dZl.TRACK) {
                        l0f L2 = pc02.L(oys.R(j, 0, Z, 0, 0, 8));
                        int i = L.e + L2.e;
                        int max = Math.max(L2.X, L.X);
                        this.f3135R.R(Float.valueOf((float) L.e));
                        this.v.R(Integer.valueOf(i));
                        return mzf.f(i, max, iia.R, new fde(L2, L.e / 2, (max - L2.X) / 2, L, mLz.t(((float) L2.e) * this.R), (max - L.X) / 2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
