package defpackage;

import android.app.Service;

/* renamed from: gV1  reason: default package */
/* loaded from: classes.dex */
public final class gV1 implements gwr, dU, j4h {
    public final Service R;

    /* renamed from: R  reason: collision with other field name */
    public final fMX f3768R;

    /* renamed from: R  reason: collision with other field name */
    public lXY f3769R;
    public lXY c;
    public lXY v;

    public gV1(fMX fmx, Service service) {
        this.f3768R = fmx;
        this.R = service;
        this.f3769R = pbD.R(new gMB(fmx, this, 1, 1));
        this.v = nak.v(new gMB(fmx, this, 0, 1));
        this.c = nak.v(new gMB(fmx, this, 2, 1));
    }
}
