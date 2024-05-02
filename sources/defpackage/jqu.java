package defpackage;

import java.util.List;

/* renamed from: jqu  reason: default package */
/* loaded from: classes.dex */
public final class jqu extends hwQ {
    @Override // defpackage.hwQ
    public final void R(long j, Object obj) {
        ((vB) ((aFq) hU3.P(j, obj))).R = false;
    }

    @Override // defpackage.hwQ
    public final List c(long j, Object obj) {
        aFq afq = (aFq) hU3.P(j, obj);
        if (((vB) afq).R) {
            return afq;
        }
        int size = afq.size();
        aFq e = afq.e(size == 0 ? 10 : size * 2);
        hU3.Y(j, obj, e);
        return e;
    }

    @Override // defpackage.hwQ
    public final void v(long j, Object obj, Object obj2) {
        aFq afq = (aFq) hU3.P(j, obj);
        afq = (aFq) hU3.P(j, obj2);
        int size = afq.size();
        int size2 = afq.size();
        if (size > 0 && size2 > 0) {
            if (!((vB) afq).R) {
                afq = afq.e(size2 + size);
            }
            afq.addAll(afq);
        }
        if (size > 0) {
        }
        hU3.Y(j, obj, afq);
    }
}
