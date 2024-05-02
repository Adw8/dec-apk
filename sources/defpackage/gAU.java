package defpackage;

/* renamed from: gAU  reason: default package */
/* loaded from: classes.dex */
public final class gAU extends e7L {
    public final float R;

    public gAU(float f) {
        super(false, false, 3);
        this.R = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gAU) && n3x.v(Float.valueOf(this.R), Float.valueOf(((gAU) obj).R));
    }

    public final int hashCode() {
        return Float.hashCode(this.R);
    }

    public final String toString() {
        return jQ.N(opT.U("RelativeHorizontalTo(dx="), this.R, ')');
    }
}
