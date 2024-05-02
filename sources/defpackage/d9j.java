package defpackage;

import java.util.List;

/* renamed from: d9j  reason: default package */
/* loaded from: classes.dex */
public final class d9j {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final bz f2508R;

    /* renamed from: R  reason: collision with other field name */
    public final gP7 f2509R;

    /* renamed from: R  reason: collision with other field name */
    public final jJj f2510R;

    /* renamed from: R  reason: collision with other field name */
    public final List f2511R;

    /* renamed from: R  reason: collision with other field name */
    public final kMk f2512R;

    /* renamed from: R  reason: collision with other field name */
    public mdz f2513R;

    /* renamed from: R  reason: collision with other field name */
    public oq3 f2514R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2515R;
    public final int v;

    public d9j(bz bzVar, kMk kmk, int i, boolean z, int i2, jJj jjj, gP7 gp7, List list) {
        this.f2508R = bzVar;
        this.f2512R = kmk;
        this.R = i;
        this.f2515R = z;
        this.v = i2;
        this.f2510R = jjj;
        this.f2509R = gp7;
        this.f2511R = list;
        if (!(i > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0094, code lost:
        if ((r10 == 2) == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ad, code lost:
        if (defpackage.oys.L(r26) == defpackage.oys.L(r2.f4164R)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00af, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.iRR R(long r26, defpackage.mdz r28, defpackage.iRR r29) {
        /*
        // Method dump skipped, instructions count: 442
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d9j.R(long, mdz, iRR):iRR");
    }

    public final void v(mdz mdz) {
        oq3 oq3 = this.f2514R;
        if (oq3 == null || mdz != this.f2513R || oq3.c()) {
            this.f2513R = mdz;
            oq3 = new oq3(this.f2508R, hDC.T(this.f2512R, mdz), this.f2511R, this.f2510R, this.f2509R);
        }
        this.f2514R = oq3;
    }

    public /* synthetic */ d9j(bz bzVar, kMk kmk, int i, boolean z, int i2, jJj jjj, gP7 gp7, int i3) {
        this(bzVar, kmk, (i3 & 4) != 0 ? Integer.MAX_VALUE : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? 1 : i2, jjj, gp7, (i3 & 128) != 0 ? fcD.R : null);
    }
}
