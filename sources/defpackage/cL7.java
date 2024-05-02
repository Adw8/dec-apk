package defpackage;

import android.app.PendingIntent;
import com.google.android.play.core.review.ReviewInfo;

/* renamed from: cL7  reason: default package */
/* loaded from: classes.dex */
public final class cL7 extends ReviewInfo {
    public final PendingIntent R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2072R;

    public cL7(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.R = pendingIntent;
            this.f2072R = z;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.R.equals(((cL7) reviewInfo).R) && this.f2072R == ((cL7) reviewInfo).f2072R) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return (true != this.f2072R ? 1237 : 1231) ^ ((this.R.hashCode() ^ 1000003) * 1000003);
    }

    @Override // java.lang.Object
    public final String toString() {
        String obj = this.R.toString();
        boolean z = this.f2072R;
        StringBuilder sb = new StringBuilder(obj.length() + 40);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(obj);
        sb.append(", isNoOp=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
