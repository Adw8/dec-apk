package defpackage;

/* renamed from: cY0  reason: default package */
/* loaded from: classes.dex */
public final class cY0 extends e7L {
    public final float R;

    public cY0(float f) {
        super(false, false, 3);
        this.R = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cY0) && n3x.v(Float.valueOf(this.R), Float.valueOf(((cY0) obj).R));
    }

    public final int hashCode() {
        return Float.hashCode(this.R);
    }

    public final String toString() {
        return jQ.N(opT.U("HorizontalTo(x="), this.R, ')');
    }
}
