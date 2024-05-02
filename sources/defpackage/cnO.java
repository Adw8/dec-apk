package defpackage;

import android.graphics.Path;

/* renamed from: cnO  reason: default package */
/* loaded from: classes.dex */
public interface cnO {
    static void R(dm dmVar, dm dmVar2) {
        long j = aWo.v;
        Path path = dmVar.f2856R;
        if (dmVar2 instanceof dm) {
            path.addPath(dmVar2.f2856R, aWo.e(j), aWo.X(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
