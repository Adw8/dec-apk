package defpackage;

import android.app.Notification;

/* renamed from: fFo  reason: default package */
/* loaded from: classes.dex */
public final class fFo {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Notification f3365R;
    public final int v;

    public fFo(int i, int i2, Notification notification) {
        this.R = i;
        this.f3365R = notification;
        this.v = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fFo.class != obj.getClass()) {
            return false;
        }
        fFo ffo = (fFo) obj;
        if (this.R == ffo.R && this.v == ffo.v) {
            return this.f3365R.equals(ffo.f3365R);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3365R.hashCode() + (((this.R * 31) + this.v) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.R + ", mForegroundServiceType=" + this.v + ", mNotification=" + this.f3365R + '}';
    }
}
