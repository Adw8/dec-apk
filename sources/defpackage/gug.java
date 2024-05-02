package defpackage;

/* renamed from: gug  reason: default package */
/* loaded from: classes.dex */
public final class gug extends dgk {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f3975R;
    public final float v;

    /* renamed from: v  reason: collision with other field name */
    public final int f3976v;

    public gug(float f, float f2, int i, int i2, int i3) {
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.R = f;
        this.v = f2;
        this.f3975R = i;
        this.f3976v = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gug)) {
            return false;
        }
        gug gug = (gug) obj;
        if (!(this.R == gug.R)) {
            return false;
        }
        if (!(this.v == gug.v)) {
            return false;
        }
        if (!(this.f3975R == gug.f3975R)) {
            return false;
        }
        if (!(this.f3976v == gug.f3976v)) {
            return false;
        }
        gug.getClass();
        return n3x.v(null, null);
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.f3976v) + opT.e(this.f3975R, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31)) * 31) + 0;
    }

    public final String toString() {
        StringBuilder U = opT.U("Stroke(width=");
        U.append(this.R);
        U.append(", miter=");
        U.append(this.v);
        U.append(", cap=");
        U.append((Object) nuR.R(this.f3975R));
        U.append(", join=");
        U.append((Object) oGA.R(this.f3976v));
        U.append(", pathEffect=");
        U.append((Object) null);
        U.append(')');
        return U.toString();
    }
}
