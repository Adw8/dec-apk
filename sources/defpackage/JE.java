package defpackage;

import java.util.List;

/* renamed from: JE  reason: default package */
/* loaded from: classes.dex */
public final class JE implements bF9 {
    public final /* synthetic */ mz R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f200R;

    public JE(Y6 y6, boolean z) {
        this.f200R = z;
        this.R = y6;
    }

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        if (list.isEmpty()) {
            return mzf.f(oys.x(j), oys.m(j), iia.R, ih.Z);
        }
        long R = this.f200R ? j : oys.R(j, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            pc0 pc0 = (pc0) list.get(0);
            PO.c(pc0);
            l0f L = pc0.L(R);
            int max = Math.max(oys.x(j), L.e);
            int max2 = Math.max(oys.m(j), L.X);
            return mzf.f(max, max2, iia.R, new dsZ(L, pc0, mzf, max, max2, this.R));
        }
        l0f[] l0fArr = new l0f[list.size()];
        blo blo = new blo();
        blo.e = oys.x(j);
        blo blo2 = new blo();
        blo2.e = oys.m(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pc0 pc02 = (pc0) list.get(i);
            PO.c(pc02);
            l0f L2 = pc02.L(R);
            l0fArr[i] = L2;
            blo.e = Math.max(blo.e, L2.e);
            blo2.e = Math.max(blo2.e, L2.X);
        }
        return mzf.f(blo.e, blo2.e, iia.R, new lML(l0fArr, list, mzf, blo, blo2, this.R, 2));
    }
}
