package defpackage;

import android.app.Application;
import android.app.NotificationManager;

/* renamed from: gMB  reason: default package */
/* loaded from: classes.dex */
public final class gMB implements lXY {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final fMX f3734R;

    /* renamed from: R  reason: collision with other field name */
    public final gwr f3735R;
    public final int v;

    public /* synthetic */ gMB(fMX fmx, gwr gwr, int i, int i2) {
        this.R = i2;
        this.f3734R = fmx;
        this.f3735R = gwr;
        this.v = i;
    }

    @Override // defpackage.lXY
    public final Object get() {
        switch (this.R) {
            case 0:
                if (this.v == 0) {
                    return new cTl();
                }
                throw new AssertionError(this.v);
            default:
                int i = this.v;
                if (i == 0) {
                    gV1 gv1 = (gV1) this.f3735R;
                    return new sk(gv1.R, (NotificationManager) gv1.f3769R.get(), (F4) this.f3734R.f3397R.get());
                } else if (i == 1) {
                    Application m = cUF.m(this.f3734R.R.R);
                    if (m != null) {
                        Object obj = C1.R;
                        return (NotificationManager) dmD.v(m, NotificationManager.class);
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                } else if (i == 2) {
                    gV1 gv12 = (gV1) this.f3735R;
                    return new nbF(gv12.R, new mEh(mSI.R(gv12.f3768R.R), (NotificationManager) gv12.f3769R.get(), (sk) gv12.v.get()));
                } else {
                    throw new AssertionError(this.v);
                }
        }
    }
}
