package defpackage;

import android.net.Uri;

/* renamed from: pu6  reason: default package */
/* loaded from: classes.dex */
public final class pu6 {
    public final Uri R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f7303R;

    public pu6(boolean z, Uri uri) {
        this.R = uri;
        this.f7303R = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pu6.class != obj.getClass()) {
            return false;
        }
        pu6 pu6 = (pu6) obj;
        return this.f7303R == pu6.f7303R && this.R.equals(pu6.R);
    }

    public final int hashCode() {
        return (this.R.hashCode() * 31) + (this.f7303R ? 1 : 0);
    }
}
