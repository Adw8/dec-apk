package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: p3P  reason: default package */
/* loaded from: classes.dex */
public final class p3P implements hKX {
    public final Object L;
    public final Object O;
    public final Object R;
    public final Object X;
    public final Object c;
    public final /* synthetic */ int e;

    /* renamed from: e  reason: collision with other field name */
    public final Object f7062e;
    public final Object v;

    public /* synthetic */ p3P(hKX hkx, j58 j58, hKX hkx2, hKX hkx3, hKX hkx4, hKX hkx5, hKX hkx6, int i) {
        this.e = i;
        this.R = hkx;
        this.v = j58;
        this.c = hkx2;
        this.f7062e = hkx3;
        this.X = hkx4;
        this.O = hkx5;
        this.L = hkx6;
    }

    @Override // defpackage.hKX
    public final /* bridge */ /* synthetic */ Object R() {
        switch (this.e) {
            case 0:
                String str = (String) ((hKX) this.R).R();
                Object R = ((hKX) this.v).R();
                Object R2 = ((hKX) this.c).R();
                Context v = ((lNV) ((hKX) this.f7062e)).v();
                Object R3 = ((hKX) this.X).R();
                imF v2 = kIP.v((hKX) this.O);
                e4X e4x = (e4X) R;
                gMW gmw = (gMW) R2;
                chm chm = (chm) R3;
                n2N n2n = (n2N) ((hKX) this.L).R();
                return new aVh(str != null ? new File(v.getExternalFilesDir(null), str) : v.getExternalFilesDir(null), e4x, v, chm, v2);
            default:
                Object R4 = ((hKX) this.R).R();
                imF v3 = kIP.v((hKX) this.v);
                Object R5 = ((hKX) this.c).R();
                return new cAd((dRx) R4, v3, (nt4) R5, kIP.v((hKX) this.f7062e), (gMW) ((hKX) this.X).R(), (bu3) ((hKX) this.O).R(), (n2N) ((hKX) this.L).R());
        }
    }
}
