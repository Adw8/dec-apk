package defpackage;

/* renamed from: kgF  reason: default package */
/* loaded from: classes.dex */
public final class kgF {
    public final cY R;

    /* renamed from: R  reason: collision with other field name */
    public final i3D f5391R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5392R;
    public final boolean v;

    public kgF(boolean z, boolean z2, cY cYVar, i3D i3d) {
        this.f5392R = z;
        this.v = z2;
        this.R = cYVar;
        this.f5391R = i3d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgF)) {
            return false;
        }
        kgF kgf = (kgF) obj;
        return this.f5392R == kgf.f5392R && this.v == kgf.v && this.R == kgf.R && this.f5391R == kgf.f5391R;
    }

    public final int hashCode() {
        boolean z = this.f5392R;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.v;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int hashCode = (this.R.hashCode() + ((i5 + i) * 31)) * 31;
        i3D i3d = this.f5391R;
        return hashCode + (i3d == null ? 0 : i3d.hashCode());
    }

    public final String toString() {
        boolean z = this.f5392R;
        boolean z2 = this.v;
        cY cYVar = this.R;
        i3D i3d = this.f5391R;
        return "NotificationInfo(haveConnectPort=" + z + ", havePairingPort=" + z2 + ", status=" + cYVar + ", prepareStep=" + i3d + ")";
    }
}
