package defpackage;

/* renamed from: u_  reason: default package */
/* loaded from: classes.dex */
public abstract class u_ {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f7426R;

    /* renamed from: R  reason: collision with other field name */
    public final String f7427R;

    public u_(String str, long j, int i) {
        this.f7427R = str;
        this.f7426R = j;
        this.R = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        } else if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] R(float[] fArr);

    public abstract float[] X(float[] fArr);

    public abstract float c(int i);

    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n3x.v(g8d.R(getClass()), g8d.R(obj.getClass()))) {
            return false;
        }
        u_ u_Var = (u_) obj;
        if (this.R == u_Var.R && n3x.v(this.f7427R, u_Var.f7427R)) {
            return q2.R(this.f7426R, u_Var.f7426R);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f7426R;
        int i = q2.R;
        return opT.X(j, this.f7427R.hashCode() * 31, 31) + this.R;
    }

    public final String toString() {
        return this.f7427R + " (id=" + this.R + ", model=" + ((Object) q2.v(this.f7426R)) + ')';
    }

    public abstract float v(int i);
}
