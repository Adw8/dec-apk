package defpackage;

/* renamed from: jui  reason: default package */
/* loaded from: classes.dex */
public final class jui implements gWG {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final long f5110R;
    public final float v;

    public jui(float f, float f2, long j) {
        this.R = f;
        this.v = f2;
        this.f5110R = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jui) {
            jui jui = (jui) obj;
            if (jui.R == this.R) {
                if ((jui.v == this.v) && jui.f5110R == this.f5110R) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5110R) + jQ.c(this.v, jQ.c(this.R, 0, 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("RotaryScrollEvent(verticalScrollPixels=");
        U.append(this.R);
        U.append(",horizontalScrollPixels=");
        U.append(this.v);
        U.append(",uptimeMillis=");
        U.append(this.f5110R);
        U.append(')');
        return U.toString();
    }
}
