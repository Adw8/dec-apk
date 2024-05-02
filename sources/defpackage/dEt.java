package defpackage;

import java.io.Closeable;

/* renamed from: dEt  reason: default package */
/* loaded from: classes.dex */
public final class dEt implements Closeable {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final arx f2534R;

    /* renamed from: R  reason: collision with other field name */
    public final bd4 f2535R;

    /* renamed from: R  reason: collision with other field name */
    public final dEt f2536R;

    /* renamed from: R  reason: collision with other field name */
    public final fPH f2537R;

    /* renamed from: R  reason: collision with other field name */
    public f_c f2538R;

    /* renamed from: R  reason: collision with other field name */
    public final j0 f2539R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2540R;

    /* renamed from: R  reason: collision with other field name */
    public final mxv f2541R;

    /* renamed from: R  reason: collision with other field name */
    public final nX1 f2542R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2543R;
    public final dEt c;
    public final int e;
    public final long v;

    /* renamed from: v  reason: collision with other field name */
    public final dEt f2544v;

    public dEt(j0 j0Var, nX1 nx1, String str, int i, mxv mxv, bd4 bd4, arx arx, dEt det, dEt det2, dEt det3, long j, long j2, fPH fph, f_c f_c) {
        this.f2539R = j0Var;
        this.f2542R = nx1;
        this.f2540R = str;
        this.e = i;
        this.f2541R = mxv;
        this.f2535R = bd4;
        this.f2534R = arx;
        this.f2536R = det;
        this.f2544v = det2;
        this.c = det3;
        this.R = j;
        this.v = j2;
        this.f2537R = fph;
        this.f2538R = f_c;
        this.f2543R = 200 <= i && i < 300;
    }

    public static String R(dEt det, String str) {
        String R = det.f2535R.R(str);
        if (R == null) {
            return null;
        }
        return R;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2534R.close();
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("Response{protocol=");
        U.append(this.f2542R);
        U.append(", code=");
        U.append(this.e);
        U.append(", message=");
        U.append(this.f2540R);
        U.append(", url=");
        U.append((a7_) this.f2539R.f4786R);
        U.append('}');
        return U.toString();
    }
}
