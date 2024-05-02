package defpackage;

/* renamed from: a8m  reason: default package */
/* loaded from: classes.dex */
public final class a8m extends k49 {
    public final k49 R;

    public a8m(k49 k49) {
        this.R = k49;
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        if (obj != null) {
            this.R.O(mot, obj);
            return;
        }
        StringBuilder U = opT.U("Unexpected null at ");
        U.append(mot.O());
        throw new j8f(U.toString(), 0);
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        if (csz.W() != 9) {
            return this.R.R(csz);
        }
        StringBuilder U = opT.U("Unexpected null at ");
        U.append(csz.Z());
        throw new j8f(U.toString(), 0);
    }

    public final String toString() {
        return this.R + ".nonNull()";
    }
}
