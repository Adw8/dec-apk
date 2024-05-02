package defpackage;

/* renamed from: oWd  reason: default package */
/* loaded from: classes.dex */
public final class oWd implements ncu {
    public final ncu R;
    public final ncu v;

    public oWd(ncu ncu, ncu ncu2) {
        this.R = ncu;
        this.v = ncu2;
    }

    @Override // defpackage.ncu
    public final Object O(Object obj, iv7 iv7) {
        return this.v.O(this.R.O(obj, iv7), iv7);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oWd) {
            oWd owd = (oWd) obj;
            if (n3x.v(this.R, owd.R) && n3x.v(this.v, owd.v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.v.hashCode() * 31) + this.R.hashCode();
    }

    public final String toString() {
        return '[' + ((String) O("", ky1.t)) + ']';
    }

    @Override // defpackage.ncu
    public final boolean v(kg9 kg9) {
        return this.R.v(kg9) && this.v.v(kg9);
    }
}
