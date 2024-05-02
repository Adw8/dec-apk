package defpackage;

import android.content.res.Resources;

/* renamed from: jIL  reason: default package */
/* loaded from: classes.dex */
public final class jIL {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Resources.Theme f4900R;

    public jIL(int i, Resources.Theme theme) {
        this.f4900R = theme;
        this.R = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jIL)) {
            return false;
        }
        jIL jil = (jIL) obj;
        return n3x.v(this.f4900R, jil.f4900R) && this.R == jil.R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R) + (this.f4900R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("Key(theme=");
        U.append(this.f4900R);
        U.append(", id=");
        return jQ.P(U, this.R, ')');
    }
}
