package defpackage;

/* renamed from: jMF  reason: default package */
/* loaded from: classes.dex */
public final class jMF extends e7L {
    public final float R;

    public jMF(float f) {
        super(false, false, 3);
        this.R = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jMF) && n3x.v(Float.valueOf(this.R), Float.valueOf(((jMF) obj).R));
    }

    public final int hashCode() {
        return Float.hashCode(this.R);
    }

    public final String toString() {
        return jQ.N(opT.U("VerticalTo(y="), this.R, ')');
    }
}
