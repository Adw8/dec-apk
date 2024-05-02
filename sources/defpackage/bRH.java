package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bRH  reason: default package */
/* loaded from: classes.dex */
public final class bRH {
    public static final zI R = new zI("ExtractorLooper", 0);

    /* renamed from: R  reason: collision with other field name */
    public final cAd f1650R;

    /* renamed from: R  reason: collision with other field name */
    public final dRj f1651R;

    /* renamed from: R  reason: collision with other field name */
    public final eRv f1652R;

    /* renamed from: R  reason: collision with other field name */
    public final hFy f1653R;

    /* renamed from: R  reason: collision with other field name */
    public final i5a f1654R;

    /* renamed from: R  reason: collision with other field name */
    public final icN f1655R;

    /* renamed from: R  reason: collision with other field name */
    public final imF f1656R;

    /* renamed from: R  reason: collision with other field name */
    public final ipk f1657R;

    /* renamed from: R  reason: collision with other field name */
    public final AtomicBoolean f1658R = new AtomicBoolean(false);

    /* renamed from: R  reason: collision with other field name */
    public final nt4 f1659R;

    public bRH(nt4 nt4, imF imf, icN icn, eRv erv, dRj drj, cAd cad, ipk ipk, i5a i5a, hFy hfy) {
        this.f1659R = nt4;
        this.f1656R = imf;
        this.f1655R = icn;
        this.f1652R = erv;
        this.f1651R = drj;
        this.f1650R = cad;
        this.f1657R = ipk;
        this.f1654R = i5a;
        this.f1653R = hfy;
    }

    public final void R(int i, Exception exc) {
        try {
            nt4 nt4 = this.f1659R;
            nt4.getClass();
            nt4.c(new gBb(nt4, i, 0));
            nt4 nt42 = this.f1659R;
            nt42.getClass();
            nt42.c(new gBb(nt42, i));
        } catch (bRU unused) {
            R.L("Error during error handling: %s", exc.getMessage());
        }
    }
}
