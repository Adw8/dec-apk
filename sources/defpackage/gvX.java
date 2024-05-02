package defpackage;

/* renamed from: gvX  reason: default package */
/* loaded from: classes.dex */
public final class gvX extends k49 {
    public final k49 R;

    public gvX(k49 k49) {
        this.R = k49;
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        if (obj == null) {
            mot.H();
        } else {
            this.R.O(mot, obj);
        }
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        if (csz.W() != 9) {
            return this.R.R(csz);
        }
        csz.o();
        return null;
    }

    public final String toString() {
        return this.R + ".nullSafe()";
    }
}
