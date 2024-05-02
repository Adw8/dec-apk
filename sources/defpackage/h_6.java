package defpackage;

import android.content.res.Resources;

/* renamed from: h_6  reason: default package */
/* loaded from: classes.dex */
public final class h_6 {
    public final Resources.Theme R;

    /* renamed from: R  reason: collision with other field name */
    public final Resources f4309R;

    public h_6(Resources resources, Resources.Theme theme) {
        this.f4309R = resources;
        this.R = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h_6.class != obj.getClass()) {
            return false;
        }
        h_6 h_6 = (h_6) obj;
        return this.f4309R.equals(h_6.f4309R) && cTo.R(this.R, h_6.R);
    }

    public final int hashCode() {
        return cTo.v(this.f4309R, this.R);
    }
}
